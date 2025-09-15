public class Cat extends Pet {
    public Cat(String name){
        super(name);
    }

    @Override
    public String toString(){
        return "This is a Cat, the name is " + this.name + "\nMeow!";
    }


}
