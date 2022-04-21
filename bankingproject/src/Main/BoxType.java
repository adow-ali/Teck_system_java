package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
public class BoxType<T> {
     List<T> values;

	public BoxType() {
		 values = new ArrayList<T>();
}	
	
	public void add(T value){
		values.add(value);
}	
	
	public List<T> get(){
		return values;
	}
	
}
	
