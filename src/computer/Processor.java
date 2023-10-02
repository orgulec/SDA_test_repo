package computer;

public class Processor {
    private String name;
    private int cores;
    private double speed;
    Processor(){

    }
    Processor(String name, int cores, double speed){
        setName(name);
        setCores(cores);
        setSpeed(speed);
    }

//    public String getName() {
//        return name;
//    }

    private void setName(String name) {
        this.name = name;
    }

//    public int getCores(){
//        return cores;
//    }

    private void setCores(int cores) {
        if((cores%2!=0 && cores!=1)||cores<1){
            System.out.println("Niewłaściwa ilość rdzeni!");
        }else {
            this.cores = cores;
        }
    }

//    public double getSpeed() {
//        return speed;
//    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Processor:" +
                "\t" + name +
                "\n\tSpeed: " + speed +"GHz x "+ cores +" cores\n";
    }
}
