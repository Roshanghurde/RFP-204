
public class Day3Array2 {

	public static void main(String[] args) {
		int[]array=new int[] {8,5,9,3,7,5,4,2};
		int[]visitedarray = new int[array.length];
		int visited=-1;
		for (int i=0;i<array.length;i++) {
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					visitedarray[j]=visited;
					
				}
			}
		
		if(visitedarray[i]!=visited) {
			visitedarray[i]=count;
			
		}
		}
for (int i=0;i<visitedarray.length;i++) {
	if(visitedarray[i]!=visited) {
		System.out.println("Frequency of= "+array[i]+" : "+ visitedarray[i]);
		
	}
}
	
	
	
	
	
	
	}

}