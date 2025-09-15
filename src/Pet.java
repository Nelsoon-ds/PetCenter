public class Pet {

    // Pet attributter
    String name;
    String sound;

    //empty constructor, usually used for default values
    public Pet(){

    }

    public Pet(String name){
        this.name = name;

    }

    public String getName(){
        return this.name;
    }
    public String getSound(){
        return this.sound;
    }

    @Override
    public String toString(){
        return "This is type, the name is name; SOUND!";
    }

}
