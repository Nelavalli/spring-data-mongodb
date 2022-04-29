package com.srikanth.springdatamongodb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Jacksonized
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Basket {
    @Id
    private String id;
    private String itemId;
    private String itemName;
}
