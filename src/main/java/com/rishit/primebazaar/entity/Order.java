package com.rishit.primebazaar.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "Orders")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {


    @Id
    private ObjectId id;

    @DBRef
    private List<Product> products;

    private LocalDateTime orderDateTime;

    private String status;

    private Double totalPrice;

    @DBRef
    private User user;


}
