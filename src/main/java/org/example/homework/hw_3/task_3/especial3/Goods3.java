package org.example.homework.hw_3.task_3.especial3;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг,
 * в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
@Data
@AllArgsConstructor
public class Goods3 {
    private String name;
    private String authorLastname;
    private Double price;
    private Integer yearIssue;
    private Integer pagesQuantity;

}
