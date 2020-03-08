package ru.bukreev.cryptoprototype.configuration;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CryptoprototypeConfig {

    @Value("${binance.api.key}")
    private String apiKey;

    @Value("${binance.api.secret}")
    private String secretKey;

    @Bean
    public BinanceApiRestClient binanceApiRestClient() {
        final BinanceApiClientFactory binanceApiClientFactory = BinanceApiClientFactory.newInstance(apiKey, secretKey);
        return binanceApiClientFactory.newRestClient();
    }
}
