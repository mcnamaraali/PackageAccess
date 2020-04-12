
public class PackageAccess {

	public static void main(String[] args) {
		PackageData packageData = new PackageData();
		
		System.out.printf("After instantiation: %n%s%n", packageData);
		
		packageData.number = 77;
		packageData.string = "Bye";
		
		System.out.printf("%nAfter changing values: %n%s%n", packageData);
	}

}

class PackageData {
	int number = 0;
	String string = "Hello";
	
	public String toString() {
		return String.format("number: %d; string: %s", number, string);
	}
}
