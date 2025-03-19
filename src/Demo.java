public class Demo {

    public static void main(String[] args){

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println();
        remote.pressButton();
        System.out.println("Fido has gone outside...");
        System.out.println("\nFido's all done...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("...but he's stuck outside!");
        System.out.println("\nFido starts barking...");
        System.out.println("...so Gina grabs the remote control.");
        remote.pressButton();
        System.out.println("Fido's back inside");
    }
}
