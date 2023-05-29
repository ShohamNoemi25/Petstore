public class PetStore {
    public static void main(String[] args) {
        CatStore mascotas = new CatStore("Micha","Gato", "4 años");

        mascotas.toString();
        System.out.println("----SONIDO DE LA MASCOTA----");
        System.out.println(mascotas.sonido());


        System.out.println("............................................................");

        Rooster mascota3= new Rooster("claudio","gallo","1 años");

        mascota3.toString();
        System.out.println("----SONIDO DE LA MASCOTA----");
        System.out.println(mascota3.sonido());

        System.out.println("............................................................");

        DogStore mascota2= new DogStore("Perro","chato","2 años");

        mascota2.toString();
        System.out.println("----SONIDO DE LA MASCOTA----");
        System.out.println(mascota2.sonido());

    }
}