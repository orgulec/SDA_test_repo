package computer;

public class CreateComputer {
    public static void main(String[] args) {

        Processor amd = new Processor("AMD",16,2.4);
        RAM ram1 = new RAM("DDR",16);
        RAM ram2 = new RAM("DDR",8);
        RAM ram3 = new RAM("DDR",8);
        Motherboard motherboard = new Motherboard("Energystar",4,ram1.getMemory(),ram2.getMemory(),ram3.getMemory());

        Computer comp1 = new Computer();
        comp1.setMotherboard(motherboard);
        comp1.setProcessor(amd);
        comp1.setHdd(512);

        System.out.println(comp1.toString());

    }
}
