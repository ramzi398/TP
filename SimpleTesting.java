public class SimpleTesting {
	public static void main(String[] args) {
		Student student = new Student("Paul1");
		Moyenne moy= new Moyenne(13, 10);
		String name = student.getName();
		int nt1= moy.getNote1();
		int nt2 = moy.getNote2();
		System.out.println("my name is : "+name);
		System.out.println("la moyenne : "+((nt1+nt2)/2));
	}
}
