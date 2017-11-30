package skj;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;


public class dsf {
	   public static void main(String args[]){
		   
		   dsf tester = new dsf();
				
		      try {
		         Student student = new Student();
		         student.setAge(10);
		         student.setName("Mahesh");
		         tester.writeJSON(student);

		         Student student1 = tester.readJSON();
		         System.out.println(student1);

		      }
		      catch (JsonParseException e) { e.printStackTrace(); }
		      catch (JsonMappingException e) { e.printStackTrace(); }
		      catch (IOException e) { e.printStackTrace(); }
		   }

		   private void writeJSON(Student student) throws JsonGenerationException,  JsonMappingException, IOException{
		      ObjectMapper mapper = new ObjectMapper();	
		      mapper.writeValue(new File("student456.json"), student);
		   }

		   private Student readJSON() throws JsonParseException, JsonMappingException, IOException{
		      ObjectMapper mapper = new ObjectMapper();
		      Student student = mapper.readValue(new File("student456.json"), Student.class);
		      return student;
		   }
		}

		class Student {
		   private String name;
		   private int age;
			
		   public Student(){}
			
		   public String getName() {
		      return name;
		   }
			
		   public void setName(String name) {
		      this.name = name;
		   }
			
		   public int getAge() {
		      return age;
		   }
			
		   public void setAge(int age) {
		      this.age = age;
		   }
			
		   public String toString(){
		      return "Student [ name: "+name+", age: "+ age+ " ]";
		   }	}

