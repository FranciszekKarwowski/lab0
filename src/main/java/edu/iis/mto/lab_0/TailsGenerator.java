package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> result = new ArrayList<>(value.length()+1);

        for(int i=0; i<value.length()+1; i++) {
            result.add(value.substring(i));
        }
        return result;
    }
}
