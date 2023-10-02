package computer;

public class Computer {
    private Motherboard motherboard;
    private Processor processor;
    private RAM ram;
    private int hdd;

    Computer(){

    }
    Computer(Motherboard motherboard, Processor processor,RAM ram,int hdd){

    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "Computer:" +
                "\n\t" + motherboard.toString() +
                "\n\t" + processor.toString() +
                "\n\tHDD: " + hdd +" GB";
    }
}
