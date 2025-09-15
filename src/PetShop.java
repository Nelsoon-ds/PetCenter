
import java.util.Scanner;

public class PetShop {
    Pet[] inventory;

    public PetShop(){
        System.out.println("Whalecome!");
    }

    public Pet[] getInventory(){
        return this.inventory;
    }
    Scanner scanner = new Scanner(System.in);

    void greeting (){
        System.out.println("Whalecome");
    }

    int userInputInt(){
        int input;

        do {
            System.out.println("Please type the number of pets you wish to register.");
            while(!scanner.hasNextInt()){
                System.out.print("That's not a number.\nPlease input a number.");
                scanner.next();
            }
            input = scanner.nextInt();
        }while (input <= 0);
        System.out.println("You are attempting to register " + input + " pets.");
        scanner.nextLine();
        return input;

    }

    String userInputType(){
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Cat") ||
                input.equalsIgnoreCase("Dog") ||
                input.equalsIgnoreCase("Lizard")){

            System.out.println("valid");
            return input;
        }else {
            System.out.println("We do not handle that type of pet here.");
            return userInputType();
        }
    }

    String userInputName(){
        return scanner.nextLine();
    }

    public Pet[] makePets(){
        Pet[] inventory = new Pet[userInputInt()];

        int i = 0;
        while(i < inventory.length){
            System.out.println("We are currently registering your pet number: " + (i+1) +
                    "\nWe accept the following types; Cat, Dog, Lizard." +
                    "\nPlease input the type of the pet you are currently registering.");
            String type = userInputType();

            System.out.println("Please input the name of the pet you are currently registering.");
            String name = userInputName();

            if (type.equalsIgnoreCase("Cat")){
                inventory[i] = new Cat(name);
            }if (type.equalsIgnoreCase("Dog")){
                inventory[i] = new Dog(name);
            }if (type.equalsIgnoreCase("Lizard")) {
                inventory[i] = new Lizard(name);
            }
            i++;


        }
        this.inventory = inventory;
        return inventory;
    }

    public void showPets(){
        System.out.println("======Pets Registered======");
        for (Pet pet : this.inventory) {
            System.out.println("Pet number 1: ");
            System.out.println(pet.toString());
        }



    }

}
