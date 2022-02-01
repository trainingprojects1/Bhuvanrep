package course;

import javax.lang.model.element.VariableElement;

public class varibleArgument {
	public int add( int ...n) {
		int sum =0;
		for ( int i:n) {
			sum = sum+i;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		varibleArgument obj = new  varibleArgument();
		System.out.println(obj.add(2,5,5,5,5,5,5));
		
	}
	

}
