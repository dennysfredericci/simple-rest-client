package br.com.fredericci.rest.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Status {

    private String id;
    private String text;
    private LocalDate createdAt;

}
