package org.phone;



public class InternalStorage {
	private void processorName() {
		System.out.println("primary memory");}
 private void ramSize(){
			System.out.println("6gb");
			
		}
		public void audioFiles() {
			System.out.println("5gb");
		}
		
		
	
	

	public static void main(String[] args) {
	   ExternalStorage es = new ExternalStorage();
		es.size();
		es.files();
		InternalStorage is=new InternalStorage();
		is.processorName();
		is.ramSize();
		is.audioFiles();
		

	}

}
