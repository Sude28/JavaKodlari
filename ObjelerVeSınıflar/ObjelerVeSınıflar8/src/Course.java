
public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	
	
	public Course(String courseName) {
		this.courseName = courseName;
		students = new String[80];
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents++] = student;	
	}
	
	public void dropStudent(String student) {
		int i;
		for(i=0; i<numberOfStudents; i++) {
			if(students[i].equals(student)) {
				for(int k=i+1;k<numberOfStudents;k++)
					students[k-1] = students[k];
				students[numberOfStudents-1]=" ";
				numberOfStudents--;}
			else
				System.out.println("Bu ogrenci listede yok");
				

				
			}
				
		}
		
		
	
	
	public String[] getStudents() {
		return students;	
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	

}
