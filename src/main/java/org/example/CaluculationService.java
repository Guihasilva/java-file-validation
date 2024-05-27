package org.example;

import java.util.List;

public class CaluculationService {
    public static <T extends Comparable <T>> T max(List<T> list) throws IllegalAccessException {
        if (list.isEmpty()){
            throw new IllegalAccessException("A lista não pode estar vazia");
        }
        T max  = list.get(0);
        for ( T i : list){
            if( i.compareTo(max) > 0){
                max = i;
            }

        }
        return max;
    }
}
