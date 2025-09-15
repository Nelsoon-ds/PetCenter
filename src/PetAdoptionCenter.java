public class PetAdoptionCenter {

    public static void main(String[] args) {
        doer();
    }

    public static void doer(){
        PetShop sop = new PetShop();
        Pet[] arr = sop.makePets();
        sop.showPets();
    }
}

