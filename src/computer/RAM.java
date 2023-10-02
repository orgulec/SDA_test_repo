package computer;

public class RAM {
    private String name;
    private int memory;

    RAM(){

    }
    RAM(String name,int memory){
        setName(name);
        setMemory(memory);
    }

    private void setName(String name) {
        if(!name.equals("SD")&&!name.equals("DDR")&&!name.equals("DDR2")){
            System.out.println("Niewłaściwa nazwa pamięci RAM.");
        }else {
            this.name = name;
        }
    }

    public String getRamName() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    private void setMemory(int memory) {
        if(memory%2!=0 || memory<1){
            System.out.println("Niewłaściwa ilość pamięci RAM.");
        }
        this.memory = memory;
    }
}
