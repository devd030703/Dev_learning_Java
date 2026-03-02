public class Lesson104Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540x1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        Lesson104PersonalComputer thePC = new Lesson104PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Window OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
