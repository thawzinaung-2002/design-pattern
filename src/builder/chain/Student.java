package builder.chain;

public class Student {

	private String name;
	private String email;
	
	private Student() {
		
	}
	
	public static StudentBuilder builder() {
		return new Student().new StudentBuilder();
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + "]";
	}



	public class StudentBuilder {

		
		public StudentBuilder name(String name) {
			Student.this.name=name;
			return this;
		}
		
		public StudentBuilder email(String email) {
			Student.this.email=email;
			return this;
		}
		
		public Student build() {
			return Student.this;
		}
		
	}
	
}
