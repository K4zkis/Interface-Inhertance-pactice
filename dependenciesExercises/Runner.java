package com.fdmgroup.dependenciesExercises;
import java.util.ArrayList;
import java.util.Collections;

public class Runner {

	public static void main(String[] args) {
		HardDrive drive1 = new HardDrive("Seagate",2048.0);
		//System.out.println(drive1.getCapacity());
		//System.out.println(drive1.getModel());
		
		HardDrive drive2 = new HardDrive("Dell", 3072.0);
		//System.out.println(drive2.getCapacity());
		//System.out.println(drive2.getModel());
		
		Processor processor1 = new Processor("Intel Xeon", 2.93, 6);
		//System.out.println(processor1.getMODEL());
		//System.out.println(processor1.getNUM_OF_CORES());
		//System.out.println(processor1.getSPEED());
		
		Processor processor2 = new Processor("Intel Celeron", 2.9, 2);
		//System.out.println(processor2.getMODEL());
		//System.out.println(processor2.getNUM_OF_CORES());
		//System.out.println(processor2.getSPEED());
		
		Memory memory1 = new Memory("Kingston", 4.0, 1600.0);
		//System.out.println(memory1.getMODEL());
		//System.out.println(memory1.getCAPACITY());
		//System.out.println(memory1.getSPEED());
		
		
		Memory memory2 = new Memory("Corsair", 8.0, 1333.0);
		//System.out.println(memory2.getMODEL());
		//System.out.println(memory2.getCAPACITY());
		//System.out.println(memory2.getSPEED());
		
		drive2.setUsedSpace(500.0);
		drive1.setUsedSpace(50.0);
		
		Computer computer1 = new Computer("Dell", drive1, memory1, processor1);
		Computer computer2 = new Computer("Lenovo", drive2, memory2, processor2);
		//computer1.turnOff();
		//computer2.turnOff();
		PowerSource powersource1 = new PowerSource();
		powersource1.setWatts(1300.0);
		computer1.getPower(powersource1);
		
		ComputerStore store1 = new ComputerStore("Conrad");
		
		store1.addComputer(computer1);
		store1.addComputer(computer2);
		
		//System.out.println(Collections.toString(store1.getAllComputers()));
		
		store1.getAllComputers();
		System.out.println("have I gotten here?");
	}

}
