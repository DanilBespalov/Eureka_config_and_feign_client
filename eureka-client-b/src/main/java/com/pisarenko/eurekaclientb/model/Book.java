package com.pisarenko.eurekaclientb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "books")
public class Book {
    @Id
    private Long id;
    private String title;

    @Override
    public String toString() {
        return String.format(
                "Book[id=%s, title='%s']",
                id, title
        );
    }

}