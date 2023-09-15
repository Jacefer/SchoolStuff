package CSCsem2;

import java.util.Random;

public class Card {

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
	
	String deal(String[] array) {
		int e = rando.nextInt(array.length);
		return array[e];
	}
	
	void newOrder(String[] array) {
		
	}
	
	int search(String card, String[] array) {
		int e = 0;
		for(int i = 0;i<array.length;i++) {
			if(card==array[i]) {
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
	
	int size(String[] array) {
		return array.length;
	}
	
	String turnOver(String[] array) {
		return array[0];
	}
	
	//
	
	public static void main(String[] args) {
		int count = 0;
		int[] FaceValue = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		String[] Suit = {"Hearts","Clubs","Diamonds","Spades"};
		
		String[] StandardDeck = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		for(int i = 0; i<Suit.length; i++) {
			for(int e = 0; e<FaceValue.length;e++) {
				if(FaceValue[e]==1) {
					StandardDeck[count]=("Ace of " + Suit[i]);
				}
				else if(FaceValue[e]==11){
					StandardDeck[count]=("Jack of " + Suit[i]);
				}
				else if(FaceValue[e]==12){
					StandardDeck[count]=("Queen of " + Suit[i]);
				}
				else if(FaceValue[e]==13){
					StandardDeck[count]=("King of " + Suit[i]);
				}
				else{
					StandardDeck[count]=(FaceValue[e]+" of " + Suit[i]);
				}
				count++;
			}
		}
		//deck created
		System.out.println(StandardDeck[1]);
		shuffle(StandardDeck);
		System.out.println(StandardDeck[1]);
		System.out.println(StandardDeck[51]);
		cut(3,StandardDeck);
		System.out.println(StandardDeck[1]);
		System.out.println(StandardDeck[51]);
	}

}
