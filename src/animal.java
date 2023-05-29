
package Abstraanimal;

public abstract class animal {

    protected String name;
    protected String color;
    protected  int age;


    public Animal(){

    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract String talk();
}



public class animal {

    private String especie;

    private String name;
    private String edad;

    public animal() {
    }

    public animal(String especie, String name, String edad) {
        this.especie = especie;
        this.name = name;
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    public String sonido(){
        return null;
    }
}