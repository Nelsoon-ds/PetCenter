public class Lizard extends Pet {
    public Lizard(String name){
        super(name);
    }
    @Override
    public String toString(){
        return "This is a Lizard, the name is " + this.name + "\nCONFUSION?!?!?!?!";
    }
}
