package it.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ValidatorService {

    private int [] input=new int[3];

    public int[] controlloInput(String combination) {
        //System.out.println("Siamo nel validator e la stringa è: "+combination);
        if(combination.length()==5 && combination.matches("[0-9][,][0-9][,][0-9]"))
        {
           String[] s = combination.split(",");
            for(int i=0; i<s.length;i++)
            {
                //System.out.println(s[i]+" ");
                input[i] = Integer.parseInt(s[i]);
            }
        }
        //System.out.println("Lenght= "+input.length);
        //System.out.print("Il vettore è: ");
        return input;
    }

}
