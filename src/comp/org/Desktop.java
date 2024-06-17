package comp.org;

public class Desktop extends Computer {
	private void desktopSize() {
		 System.out.println("The size of desktop is 15 inches");

	}public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerMode();
	}

}
