package ru.bukreev.cryptoprototype.services;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.bukreev.cryptoprototype.model.poloniex.PoloniexTickers;

import javax.ws.rs.core.MediaType;
import java.util.Set;

@Service
public class PoloniexClient {

    @Value("${api.poloneix}")
    private String apiAddress;

    public final boolean buy() {
        return false;
    }

    public final boolean sell() {
        return false;
    }

    public final Set<String> getPrices() {
        final DefaultClientConfig config = new DefaultClientConfig();
        config.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        Client client = Client.create(config);

        ClientResponse response = client.resource(apiAddress).accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

        if (response.getStatus() == 200) {
            PoloniexTickers entity = response.getEntity(PoloniexTickers.class);
            System.out.println(entity);
        } else {
            System.out.println("oops");
        }
        return null;
    }
}
