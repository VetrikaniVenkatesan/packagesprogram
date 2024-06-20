package org.phones;

public class InternalStorage {
	private void processorName() {
		System.out.println("Processor:Octa core Qualcomm Snapdragon 680");

	}

	private void ramSize() {
		System.out.println("RAM size:8GB");

	}
	public static void main(String[] args) {
		InternalStorage intStorage=new InternalStorage();
		intStorage.processorName();
		intStorage.ramSize();
		
		ExternalStorage exStorage=new ExternalStorage();
		exStorage.size();

}
}