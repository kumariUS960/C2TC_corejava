package day1and2;

public class encapsulation {
	
		private int id;
		private String name;
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id=id;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
	
		
	}
		public String toString() {
			return "Student [id= " +id+ ",name=" +name+ "]";
		}
	

}
