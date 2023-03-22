package com.pisarenko.eurekafeignclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
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