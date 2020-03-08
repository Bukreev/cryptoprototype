package ru.bukreev.cryptoprototype.services;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.market.TickerPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BinanceClient {

    private final BinanceApiRestClient binanceApiRestClient;

    @Autowired
    public BinanceClient(final BinanceApiRestClient binanceApiRestClient) {
        this.binanceApiRestClient = binanceApiRestClient;
    }

    public final void getPrices() {
        final List<TickerPrice> allPrices = binanceApiRestClient.getAllPrices();
        System.out.println(allPrices);
    }
}
