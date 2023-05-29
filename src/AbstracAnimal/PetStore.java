package AbstracAnimal;

public class PetStore {
    public static void main(String[] args) {


        Cat garfield = new Cat("Garfield", "Naranja", 5);
        System.out.println("< Ejemplo de polimorfid usando clase abstracta>");

        System.out.println("Invocando el metodo toString:");
        System.out.println(garfield.toString());


        Dog nieves = new Dog("nieves", "Blanco", 3);
        System.out.println("---------------------------------------------------------");

        System.out.println("Invocando el metodo toString:");
        System.out.println(nieves.toString());

        Rooster claudio = new Rooster("Claudio", "Rojo Amarillo", 1);
        System.out.println("<--------------------------------------------------------");

        System.out.println("Invocando el metodo toString:");
        System.out.println(claudio.toString());
    }
}