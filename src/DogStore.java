 public class DogStore extends animal{
    public DogStore (String name, String especie, String edad){
        super(name,especie,edad);
    }

    public String sonido (){
        return"huhuahua";
    }

    public String toString() {
        System.out.println("name:"+get Name());
        System.out.println("especie:"+get Especie());
        System.out.println("edad:"+getEdad());
        return "";
    }

