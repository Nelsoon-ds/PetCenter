public class Dog extends Pet {
    public Dog(String name){
        super(name);
    }
    @Override
    public String toString(){
        return "This is a Dog, the name is " + this.name + "\nWroof!";
    }
}
