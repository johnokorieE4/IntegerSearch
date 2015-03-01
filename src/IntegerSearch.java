import java.util.Arrays;
import java.util.Random;

public class IntegerSearch {
	private static final Random randomGenerator = new Random();
	private int[] data;
	private int position;
	
	public IntegerSearch(int size){
		
		data= new int [size];
		
		for (int i=0; i<size; i++){
			data[i] = randomGenerator.nextInt(60);
		}
	}
    public int linearSearch (int searchKey){
    	for(int index=0; index<data.length; index++){
    		if(data[index]==searchKey)
    			position = index;
    	}
    	return position;
    	
    }
	public String toString(){
		return Arrays.toString(data);
	}
	
	
	 
	

}
