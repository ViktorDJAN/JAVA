package org.example.java_Introducion.homework.hw_3.task_1.especial;

/**
 *  Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 *  название которых содержит «высший».
 */
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Goods {
    private String name;
    private  Integer price;
    private String sort;
}
