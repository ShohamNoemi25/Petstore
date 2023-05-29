
public class Rooster extends animal {

    public Rooster() {
    }

    public String sonido(){
        return "El gallo dice: quiriqui quiquriqui";
    }

    public String toString() {
        System.out.println("nombre de la mascota:"+getName());
        System.out.println("tipo de especie: "+getEspecie());
        System.out.println("edad:"+getEdad());
        return "";
    }

}