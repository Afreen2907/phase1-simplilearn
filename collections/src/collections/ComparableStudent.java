package collections;

public class ComparableStudent implements Comparable<ComparableStudent> {

	private String name;
	private long id = 0;
	private double gpa = 0;
	
	public ComparableStudent(String name, long id, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "ComparableStudent [name=" + this.name + ", id=" + this.id + ", gpa=" + this.gpa + "]";
	}

	@Override
	public int compareTo(ComparableStudent s) {
		int result = this.name.compareTo(s.getName());
		if (result > 0) {
			return 1;
		} else if (result < 0) {
			return -1;
		} else {
			return 0; // o is equal to current object
		}
		
		
	}

	


}
