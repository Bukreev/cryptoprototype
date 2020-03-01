package ru.bukreev.cryptoprototype.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import ru.bukreev.cryptoprototype.model.poloniex.PoloniexTickers;

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
        Client client = Client.create();

        PoloniexTickers response = client.resource(apiAddress).accept("application/json").get(PoloniexTickers.class);

        if (response != null) {
            System.out.println(response);
        } else {
            System.out.println("oops");
        }
        return null;
    }
}
