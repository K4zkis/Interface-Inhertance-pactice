package com.fdmgroup.classesAndObjectsExercises;

public class Runner {

	public static void main(String[] args) {
		HardDrive drive1 = new HardDrive("Seagate",2048.0);
		System.out.println(drive1.getCapacity());
		System.out.println(drive1.getModel());
		
		HardDrive drive2 = new HardDrive("Dell", 3072.0);
		System.out.println(drive2.getCapacity());
		System.out.println(drive2.getModel());
		
		Processor processor1 = new Processor("Intel Xeon", 2.93, 6);
		System.out.println(processor1.getMODEL());
		System.out.println(processor1.getNUM_OF_CORES());
		System.out.println(processor1.getSPEED());
		
		Processor processor2 = new Processor("Intel Celeron", 2.9, 2);
		System.out.println(processor2.getMODEL());
		System.out.println(processor2.getNUM_OF_CORES());
		System.out.println(processor2.getSPEED());
		
		Memory memory1 = new Memory("Kingston", 4.0, 1600.0);
		System.out.println(memory1.getMODEL());
		System.out.println(memory1.getCAPACITY());
		System.out.println(memory1.getSPEED());
		
		
		Memory memory2 = new Memory("Corsair", 8.0, 1333.0);
		System.out.println(memory2.getMODEL());
		System.out.println(memory2.getCAPACITY());
		System.out.println(memory2.getSPEED());
		
		drive2.setUsedSpace(500.0);
		drive1.setUsedSpace(50.0);
		System.out.println(drive1.getUsedSpace());

	}

}
