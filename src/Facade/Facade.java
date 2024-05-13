package Facade;
// abstract away the complex implementation and only gives abstract functionality to users. This may enhanced using DI without hardcoding the the cpu and monitor

public class Facade {
    private CPU cpu;
    private Monitor monitor;
    Facade(){
        this.cpu = new CPU();
        this.monitor = new Monitor();
    }

    void StartSystem(){
        cpu.StartCPU();
        monitor.StartMonitor();
    }

    public static void main(String[] args) {
        Facade fc = new Facade();
        fc.StartSystem();
    }
}

class CPU{
    void StartCPU(){
        System.out.println("Starting CPU...");
    }
}
class Monitor {
    void StartMonitor(){
        System.out.println("Starting monitor...");
    }
}

