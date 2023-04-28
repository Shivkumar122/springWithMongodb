package com.example.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@NoArgsConstructor
@Data
@ToString
@Document(collection = "book")
public class Book {

    @Id
    private String id;
    private String name;
    private String author;
    private String email;
    private String phone;


}
