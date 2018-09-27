package br.com.fredericci.rest.dto;


import lombok.Data;

import java.util.List;

@Data
public class SearchResponse {

    private List<Status> statuses;

}
