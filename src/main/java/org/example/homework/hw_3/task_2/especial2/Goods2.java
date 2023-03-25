package org.example.homework.hw_3.task_2.especial2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
@Data
@AllArgsConstructor
public class Goods2 {
    private String name;
    private String country;
    private Double weight;
    private Double price;
    private String sort;
}
