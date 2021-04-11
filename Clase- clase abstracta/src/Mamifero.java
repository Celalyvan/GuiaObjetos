public class Mamifero extends Animal {

    private String colorPelo;

    public Mamifero (String colorPelo, String habitat){
        super(habitat);
        this.colorPelo=colorPelo;

    }

    @Override
    public void comer(){
        System.out.println("soy un mamifero y estoy comiendo");
    }

}
