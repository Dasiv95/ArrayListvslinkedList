import java.util.*;

public class AListVsLink {
	
	void addition(long siz){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList(10000);
		long alStartTime = System.nanoTime();
		for(int i=0;i<10000;i++){
		al.add(Math.random());
		}
		long alEndTime = System.nanoTime();
		long alDuration = (long) ((alEndTime - alStartTime)*Math.pow(10, -3));
		//System.out.println("The duration for addition of 10k elements to ArrayList is : "+(alDuration)+" micro seconds");
		long llStartTime = System.nanoTime();
		LinkedList ll = new LinkedList();
		for(int i=0;i<10000;i++){
			ll.add(Math.random());
		}
		long llEndTime =System.nanoTime();
		long llDuration =(long) ((llEndTime - llStartTime)*Math.pow(10,-3));
		//System.out.println("The duration for addition of 10k elements to LinkedList is :"+(llDuration)+" micro seconds");

		//System.out.println("Now let us check how they are traced individually");
		//System.out.println("To trace both of them I will add a few elements randomly at random places but at the same indices for both of them. ");
		al.add(777, 5); ll.add(777,5);
		al.add(247,10); ll.add(247,10);
		al.add(999,15); ll.add(999,15);
		al.add(123,20); ll.add(123,20);
		al.add(234,25); ll.add(234,25);
		List c =new ArrayList();
		c.add(5);
		c.add(10);
		c.add(15);
		c.add(20);
		c.add(25);
		Long alContainsStart = System.nanoTime();
		if(al.containsAll(c)){
			System.out.println("Now tracing Arraylist is over");
		}
		Long alContainsEnd = System.nanoTime();
		
		Long alContainsDuration = (long) ((alContainsEnd - alContainsStart)*Math.pow(10, -3));
		
		//System.out.println("The duration for checking tracing of an arraylist is :"+(alContainsDuration));
		
		
		Long llContainsStart = System.nanoTime();
		if(ll.containsAll(c)){
			System.out.println("Now tracing Linked list is over");
		}
		Long llContainsEnd = System.nanoTime();
		
		Long llContainsDuration = (long) ((llContainsEnd - llContainsStart)*Math.pow(10, -3));
		
		//System.out.println("The duration for checking tracing of an Linked list is :"+(llContainsDuration));
		
		
        long alRemStart = System.nanoTime();
		
		for(int i=0;i<500;i++){
			if(i%2==0)
			al.remove(i);
			}
		long alRemEnd = System.nanoTime();
		
		
		long alRemDuration = (long) ((alRemEnd - alRemStart)*Math.pow(10, -3));
		//System.out.println("The duration for removal 2500 elements from Array list is : "+(alRemDuration)+" miro seconds");
		
		
		
		long llRemStart = System.nanoTime();
		for(int i=-1;i<500;i++){
			if(i%2==0)
		       ll.remove(i);
		}
		long llRemEnd = System.nanoTime();
		long llRemDuration = (long) ((llRemEnd - llRemStart)*Math.pow(10, -3));
		//System.out.println("The duration for removal 2500 elements from linked list is : "+(llRemDuration)+" miro seconds");
		
		
		System.out.println("\t \t"+" Addition "+"\t"+" Search "+"\t"+" Removal ");
		System.out.println("ArrayList "+"\t"+alDuration+"\t \t"+alContainsDuration+"\t \t"+alRemDuration);
		System.out.println("LinkedList "+"\t"+llDuration+"\t \t"+llContainsDuration+"\t \t"+llRemDuration);
	    System.out.println("Here searching time is more for Arraylist since searching of a collection is done which is not based on index");
	
	}

}
