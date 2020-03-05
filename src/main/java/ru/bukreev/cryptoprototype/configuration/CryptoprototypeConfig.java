package ru.bukreev.cryptoprototype.configuration;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CryptoprototypeConfig {

    @Value("${key.api.binance}")
    private String apiKey;

    @Value("${key.secret.binance}")
    private String secretKey;

    @Bean
    public BinanceApiRestClient binanceClient() {
        final BinanceApiClientFactory binanceApiClientFactory = new BinanceApiClientFactory(apiKey, secretKey);
        return binanceApiClientFactory.newRestClient();
    }
}
