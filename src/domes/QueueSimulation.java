package domes;

import java.util.*;

public class QueueSimulation {
private static Scanner input;

public static void main (String[] args) {
	input = new Scanner(System.in);
	IntQueueImpl pelates = new IntQueueImpl();
	
	String line = input.nextLine();
	String[] numbers = line.trim().split(",");
	for (int i = 0; i < numbers.length; i++) {
		pelates.put(Integer.parseInt(numbers[i]));
		//System.out.println(numbers[i]);
	}
	//pelates.printQueue(System.out);
	
	//dhmiourgo pinaka antikeimenwn listas gia ta tameia mou
	int m=3;//to megethos einai metavlito
	IntQueueImpl tameio[] = new IntQueueImpl[m];
		for (int i =0; i<m; i++)
			tameio[i] = new IntQueueImpl();

		
			for (int i =0; i<m; i++){
				//if(tameio[i].firstNode.data == timer)// elegxos sta tameia an prepei na ginei get
					tameio[i].put(pelates.get());
				System.out.println(tameio[i].firstNode.data+"***");
			}




			while(!pelates.isEmpty()) {
				int min = 100000; // arxikopoiw me kati poly megalo to min
				int key = 0; // metavliti gia na apothikeuso tin timi tou i

				for (int i =0; i < tameio.length; i++) {
					if (tameio[i].size() < min) {
						min = tameio[i].size(); // vrisko to pio adeio tameio
						key = i;
					}
				}
				tameio[key].put(pelates.get());
				tameio[key].printQueue(System.out);
			}


			
			
			
			
					
						
					
			}
			
		}
			
		
			

