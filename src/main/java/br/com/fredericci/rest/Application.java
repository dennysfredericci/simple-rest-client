package br.com.fredericci.rest;

import br.com.fredericci.rest.client.TwitterClient;
import br.com.fredericci.rest.dto.SearchResponse;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@Log
@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        final ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        final TwitterClient twitter = context.getBean(TwitterClient.class);

        final SearchResponse searchResponse = twitter.search("Java", "popular");

        searchResponse.getStatuses().forEach(status -> log.info(status.getText()));

    }

}
