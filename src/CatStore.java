public class CatStore extends Animal {
    public CatStore() {
    }

    public String sonido(){
        return "miau,miau";
    }

    public String toString() {
        System.out.println("nombre de la mascota:"+());
        System.out.println("tipo de especie: "+getEspecie());
        System.out.println("edad:"+getEdad());
        return "";
    }

}