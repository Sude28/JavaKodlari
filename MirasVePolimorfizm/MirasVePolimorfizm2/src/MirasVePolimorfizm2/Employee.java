package MirasVePolimorfizm2;

public class Employee extends Person {
	public Employee() {
		this("(2) Calisanin asiri yuklenmis constructorunu cagirin");
		System.out.println("(3) Calisanin gorevlerini yerine getirir");
	}
	
	public Employee(String s) {
		System.out.println(s);
	}
}
