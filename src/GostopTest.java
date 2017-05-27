import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GostopTest {

	static List<Month> centerlist = new ArrayList<Month>();
	static List<Month> playerlist = new ArrayList<Month>();
	static List<Month> playerpanlist = new ArrayList<Month>();
	protected static int b = 0;
	protected static int Xrandom[] = new int[48];

	public static int Count(){ //중복방지하면서 뽑는 랜덤변수
		Random random = new Random();
		boolean shift = true;
		int a = 0;
		while(shift){
			shift = false;
			a = random.nextInt(47)+1; //랜덤변수
			for(int i = 0; i<48; i++){
				if(Xrandom[i] == a){
					shift = true;
				}
			}
		}
		for(int i = 0; i<48;i++){ //중복방지하기위해 배열에 넣는다.
			if(b == i){
				Xrandom[i] = a;
			}
		}
		b++;

		return a;
	}
	public static void print2(){
		
		for(int i = 0; i<centerlist.size(); i++){
		Month centerl1 = centerlist.get(i);
		centerl1.print();
		System.out.printf(" ");
	}
	System.out.printf("\n");
	for(int i = 0; i<playerlist.size(); i++){
		Month playerl1 = playerlist.get(i);
		playerl1.print();
		System.out.printf(" ");
	}
	System.out.printf("\n");
	for(int i = 0; i<playerpanlist.size(); i++){
		Month playerpanl1 = playerpanlist.get(i);
		playerpanl1.print();
		System.out.printf(" ");
	}
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		////처음
		for(int i= 0; i<7;i++){
			Month card = new Month();
			int count = Count();
			card.Card(count);
			centerlist.add(card);
		}
		System.out.printf(" \n");
		for(int i= 0; i<10;i++){
			Month card = new Month();
			int count = Count();
			card.Card(count);
			playerlist.add(card);
		}
		print2();
		
		//패 옮기고 삭제하기
		System.out.printf("\n");
		System.out.printf("center몇번째패?");
		int centerhand = sc.nextInt();
		System.out.printf("player1몇번째패?");
		int playerhand = sc.nextInt();
		
		Month centerl = centerlist.get(centerhand);
		Month playerl = playerlist.get(playerhand);
		playerpanlist.add(centerl);
		playerpanlist.add(playerl);
		centerlist.remove(centerhand);
		playerlist.remove(centerhand);
		
		print2();
		
		
		
	}
}
