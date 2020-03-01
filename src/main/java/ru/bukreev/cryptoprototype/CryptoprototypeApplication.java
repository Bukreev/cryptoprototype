package ru.bukreev.cryptoprototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.bukreev.cryptoprototype.services.PoloniexClient;

@SpringBootApplication
public class CryptoprototypeApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(CryptoprototypeApplication.class, args);
        PoloniexClient bean = run.getBean(PoloniexClient.class);
        bean.getPrices();

    }

}
