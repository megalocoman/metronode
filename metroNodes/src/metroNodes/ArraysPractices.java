package metroNodes;
import java.util.ArrayList;
import java.util.List;

public class ArraysPractices {
	 String name;
	 int size;
	 
	
	public ArraysPractices( String name, Integer size ) {
		this.name = name;
		this.size = size;
	}
	
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public void setSize(Integer size) {
		this.size = size;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ArraysPractices> line = new ArrayList<>();
		line.add(new ArraysPractices("departamental", 20 ));
		line.add(new ArraysPractices("departamental", 20 ));
		line.add(new ArraysPractices("los heroes", 15));
		
		line.forEach(a ->{
			System.out.println("name: "+ a.getName()+"; size: "+ a.getSize());
		});
	}
}


