package br.com.fredericci.rest.client;

import br.com.fredericci.rest.dto.SearchResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Interface to map Twitter Endpoints
 */
@FeignClient(name = "twitter", url = "https://api.twitter.com/1.1/", configuration = TwitterConfiguration.class)
public interface TwitterClient {

    @GetMapping("/search/tweets.json")
    SearchResponse search(@RequestParam("q") String query, @RequestParam("result_type") String resultType);


}
