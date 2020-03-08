package ru.bukreev.cryptoprototype.services;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.bukreev.cryptoprototype.model.PairRepository;
import ru.bukreev.cryptoprototype.model.entities.Pair;
import ru.bukreev.cryptoprototype.model.poloniex.BTCETH;
import ru.bukreev.cryptoprototype.model.poloniex.PoloniexTickers;

import javax.ws.rs.core.MediaType;

@Service
public class PoloniexClient {

    @Value("${api.poloneix}")
    private String apiAddress;

    private final PairRepository pairRepository;

    @Autowired
    public PoloniexClient(final PairRepository pairRepository) {
        this.pairRepository = pairRepository;
    }

    public final boolean buy() {
        return false;
    }

    public final boolean sell() {
        return false;
    }

    public final void getPrices() {
        final DefaultClientConfig config = new DefaultClientConfig();
        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(config);

        ClientResponse response = client.resource(apiAddress).accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

        if (response.getStatus() == 200) {
            PoloniexTickers dataModel = response.getEntity(PoloniexTickers.class);
            final Pair pair = new Pair();
            final BTCETH btceth = dataModel.getBTCETH();

            {
                pair.setMarketName("Poloniex");
                pair.setName("BTCETH");
                pair.setPrice(btceth.getBaseVolume());
                pair.setPercentChange(btceth.getPercentChange());
            }
            pairRepository.save(pair);
            System.out.println(btceth.toString());
        } else {
            System.out.println("oops");
        }
    }
}
