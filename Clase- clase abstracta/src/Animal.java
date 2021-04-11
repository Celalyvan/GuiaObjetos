public abstract class Animal {
    private String habitat;


    public abstract void comer();

    public void ruido(){
        System.out.println("Soy un animal y hago ruido");
    }

    public void respiro(){
        System.out.println("Soy un animal y respiro");
    }

    public Animal(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
