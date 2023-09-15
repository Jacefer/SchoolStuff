package CSCsem2;

import java.util.Random;

public class Deck {

	static Random rando = new Random();
	static 
	
	
	void cut(int num, String[] array) {
		String hold1;
		String hold2;
		
		for(int i = 0; i<=num;i++) {
			if (i == 0)
			{
				hold1 = array[(array.length-1)];
				array[(array.length-1)]=array[i];
				for(int j = 0; j<array.length;j++) {
					hold2=array[(array.length-2)];
					array[(array.length-2)] = hold1;
					hold1 = hold2;
				}
			}
			else {
				hold1 = array[(array.length-i)];
				array[(array.length-i)]=array[i];
				for(int j = 0; j<array.length;j++) {
					hold2=array[(array.length-j-1)];
					array[(array.length-j-1)] = hold1;
					hold1 = hold2;
				}
			}
		}
		
	}
	
	static String deal(String[] array) {
		int e = rando.nextInt(array.length);
		return array[e];
	}
	
	static void newOrder(String[] array) {
		int count = 0;
		int[] FaceValue = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] Suit = {"Hearts","Clubs","Diamonds","Spades"};
	
		for(int i = 0; i<Suit.length; i++) {
			for(int e = 0; e<FaceValue.length;e++) {
				if(FaceValue[e]==1) {
					array[count]=("Ace of " + Suit[i]);
				}
				else if(FaceValue[e]==11){
					array[count]=("Jack of " + Suit[i]);
				}
				else if(FaceValue[e]==12){
					array[count]=("Queen of " + Suit[i]);
				}
				else if(FaceValue[e]==13){
					array[count]=("King of " + Suit[i]);
				}
				else{
					array[count]=(FaceValue[e]+" of " + Suit[i]);
				}
				count++;
			}
		}
	}
	
	static int search(String card, String[] array) {
		int e = 0;
		for(int i = 0;i<array.length;i++) {
			if(card.equals(array[i])){
				e = i;
			}
		}
		return e;
	}
	
	static void shuffle(String[] array){
		for(int i = 0;i<array.length;i++) {
			int e = 0;
			if(e<i) {
				e = rando.nextInt(array.length);
			}
			String store = array[i];
			array[i]=array[e]; 
			array[e]=store;
		}
	}
	
	static int size(String[] array) {
		return array.length;
	}
	
	static String turnOver(String[] array) {
		return array[0];
	}
	
	//
	
	public static void main(String[] args) {
		
		String[] deck1 = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		newOrder(deck1);
		
		//deck created
		System.out.println(deck1[1]);
		shuffle(deck1);
		System.out.println(deck1[1]);
		newOrder(deck1);
		System.out.println(deck1[1]);
		System.out.println(deal(deck1));
		System.out.println(search("10 of Hearts",deck1));
		System.out.println(size(deck1));
		System.out.println(turnOver(deck1));
		cut(16,deck1);
		System.out.println(deck1[1]);
	}

}
