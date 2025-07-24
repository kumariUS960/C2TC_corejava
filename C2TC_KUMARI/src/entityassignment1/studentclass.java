package entityassignment1;
import java.util.Scanner;
// encapsulation method
public class studentclass {
	
		private String name,city;
		private int id;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "studentclass [name=" + name + ", city=" + city + ", id=" + id + "]";
		}
		
		
		
		
		
	

}
