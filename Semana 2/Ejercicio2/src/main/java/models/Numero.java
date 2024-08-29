package models;

public class Numero {

    public String evaluarNumero(int num){
        if (num % 2 == 0){
            return "Es par";
        }
        return "Es impar";
    }
}
