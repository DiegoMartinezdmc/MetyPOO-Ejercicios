package modelos;

public class Perro extends Animal implements Cloneable {  // Agregué 'implements Cloneable'
    @Override
    public Object clone() throws CloneNotSupportedException {  // Cambié 'protected' a 'public'
        return super.clone();
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau!");
    }
}
