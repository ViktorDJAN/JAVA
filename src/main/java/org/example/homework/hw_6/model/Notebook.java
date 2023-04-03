package org.example.homework.hw_6.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notebook {
    private String name;
    private Integer ozu;
    private Integer hdValue;
    private String nameOS;
    private String color;

}
