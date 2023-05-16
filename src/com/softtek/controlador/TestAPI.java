package com.softtek.controlador;

public class TestAPI {
    public static void main(String[] args) {
        String str = "Bienvenidos al curso de Java";
        String out = "";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.split(" ")[0]);
        System.out.println(str.split(" ")[4]);
        System.out.println(str.split(" ")[2]);
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'c'){
                System.out.println("Posición de la c: " +  i);
            }
            if (str.charAt(i) == 'e'){
                out += 'E';
            }else{
                out += str.charAt(i);
            }
        }
        System.out.println(str.length());
        System.out.println(out);
        out += " con fecha de 14 de Septiembre";
        System.out.println(out);
    }
}
