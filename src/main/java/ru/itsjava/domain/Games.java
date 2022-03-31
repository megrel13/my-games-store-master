package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Games {
    private final String name;
    private final String author;
}
