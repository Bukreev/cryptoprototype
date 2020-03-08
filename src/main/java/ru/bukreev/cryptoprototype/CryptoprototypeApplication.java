package ru.bukreev.cryptoprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.bukreev.cryptoprototype.services.BinanceClient;

@SpringBootApplication
public class CryptoprototypeApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(CryptoprototypeApplication.class, args);
        BinanceClient bean = run.getBean(BinanceClient.class);
        bean.getPrices();

    }

}
