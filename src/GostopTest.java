import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GostopTest {
	///점수측정
	static int TotalBasicScore = 0;
	static int TotalGodori =0;
	static int TotalBlue = 0;
	static int TotalRed = 0;
	static int TotalCho = 0 ;
	static int TotalLight = 0;
	static int TotalAnimal = 0;
	static int TotalDan = 0;
	static int TotalBiLight = 0;
	static int TotalScore = 0;
	//List
	static List<Month> centerlist = new ArrayList<Month>();
	static List<Month> playerlist = new ArrayList<Month>();
	static List<Month> playerpanlist = new ArrayList<Month>();
	protected static int b = 0;
	protected static int Xrandom[] = new int[48];
	/////////// 점수측정
	public static void Score(){
		TotalBasicScore = 0;
		TotalGodori =0;
		TotalBlue = 0;
		TotalRed = 0;
		TotalCho = 0 ;
		TotalLight = 0;
		TotalAnimal = 0;
		TotalDan = 0;
		TotalBiLight = 0;
		TotalScore = 0 ;
		for(int i = 0; i<playerpanlist.size(); i++){
			Month playerpanl1 = playerpanlist.get(i);
			TotalBasicScore = TotalBasicScore + playerpanl1.BasicScore;
			TotalGodori = TotalGodori + playerpanl1.Godori;
			TotalBlue = TotalBlue + playerpanl1.Blue;
			TotalRed = TotalRed + playerpanl1.Red;
			TotalCho = TotalCho + playerpanl1.Cho;
			TotalLight = TotalLight + playerpanl1.Light;
			TotalAnimal = TotalAnimal + playerpanl1.Animal;
			TotalDan = TotalDan + playerpanl1.Dan;
			TotalBiLight = TotalBiLight + playerpanl1.BiLight;
		}
		if(TotalBasicScore>11){ //1 and 2
			TotalScore = TotalScore + TotalBasicScore - 9;
		}
		if(TotalLight > 2){ //3
			TotalScore = TotalScore + TotalLight;
			if(TotalBiLight == 1){
				TotalScore = TotalScore -1;
			}
		}
		if(TotalRed == 3 ){//5
			TotalScore = TotalScore + TotalRed;
		}
		if(TotalBlue == 3){//6
			TotalScore = TotalScore + TotalBlue;
		}
		if(TotalCho == 3){ //7
			TotalScore = TotalScore + TotalCho;
		}
		if(TotalAnimal > 4){ //8
			TotalScore = TotalScore + TotalAnimal - 4;
		}
		if(TotalGodori == 3){ //9
			TotalScore = TotalScore + TotalGodori;
		}
		if(TotalDan > 4){ //5 and 6 and 7
			TotalScore = TotalScore + TotalDan - 4;
		}

	}
	/////////////중복방지하면서 뽑는 랜덤변수
	public static int Count(){ 
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
	///////////// List프린트함수
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
		}
		System.out.printf("\n");
		Score();
		System.out.printf("%d \n" , TotalScore);
	}
	//center패 한장 까지고 그 중에 같은월 있으면 가져온다.
	public static void center(){
		//패한장생성
		Month card = new Month();
		int count = Count();
		card.Card(count);
		for(int i = 0; i<centerlist.size(); i++){
			Month centerl1 = centerlist.get(i);
			if(card.division() == centerl1.division()){
				playerpanlist.add(card);
				playerpanlist.add(centerl1);
				centerlist.remove(i);
				break;
			}
			if(i == centerlist.size()-1){
				centerlist.add(card);
				break;
			}
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
		while(true){
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
			center();
			print2();
			//center패 한장오픈
			
		}
	}
}
