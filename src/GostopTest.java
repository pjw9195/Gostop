import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GostopTest {
	//List
	static List<Month> centerlist = new ArrayList<Month>();
	static List<Month> player1list = new ArrayList<Month>();
	static List<Month> player2list = new ArrayList<Month>();
	static List<Month> player1panlist = new ArrayList<Month>();
	static List<Month> player2panlist = new ArrayList<Month>();
	protected static int b = 0;
	protected static int Xrandom[] = new int[48];
	/////////// player1 점수측정
	public static int player1Score(){
		 int TotalBasicScore = 0;
		 int TotalGodori =0;
		 int TotalBlue = 0;
		 int TotalRed = 0;
		 int TotalCho = 0 ;
		 int TotalLight = 0;
		 int TotalAnimal = 0;
		 int TotalDan = 0;
		 int TotalBiLight = 0;
		 int TotalScore = 0;
		 for(int i = 0; i<player1panlist.size(); i++){
			Month playerpanl1 = player1panlist.get(i);
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
		return TotalScore;

	}
	public static int player2Score(){
		 int TotalBasicScore = 0;
		 int TotalGodori =0;
		 int TotalBlue = 0;
		 int TotalRed = 0;
		 int TotalCho = 0 ;
		 int TotalLight = 0;
		 int TotalAnimal = 0;
		 int TotalDan = 0;
		 int TotalBiLight = 0;
		 int TotalScore = 0;
		 for(int i = 0; i<player2panlist.size(); i++){
			Month playerpanl2 = player2panlist.get(i);
			TotalBasicScore = TotalBasicScore + playerpanl2.BasicScore;
			TotalGodori = TotalGodori + playerpanl2.Godori;
			TotalBlue = TotalBlue + playerpanl2.Blue;
			TotalRed = TotalRed + playerpanl2.Red;
			TotalCho = TotalCho + playerpanl2.Cho;
			TotalLight = TotalLight + playerpanl2.Light;
			TotalAnimal = TotalAnimal + playerpanl2.Animal;
			TotalDan = TotalDan + playerpanl2.Dan;
			TotalBiLight = TotalBiLight + playerpanl2.BiLight;
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
		return TotalScore;

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
	public static void print(){ 

		System.out.printf("center : ");
		for(int i = 0; i<centerlist.size(); i++){
			Month centerl1 = centerlist.get(i);
			centerl1.print();
			System.out.printf(" ");
		}
		System.out.printf("\n");
		System.out.printf("player1 : ");
		for(int i = 0; i<player1list.size(); i++){
			Month playerl1 = player1list.get(i);
			playerl1.print();
			System.out.printf(" ");
		}
		System.out.printf("\n");
		System.out.printf("player1 pan : ");
		for(int i = 0; i<player1panlist.size(); i++){
			Month playerpanl1 = player1panlist.get(i);
			playerpanl1.print();
		}
		System.out.printf("\n");
		System.out.printf("player 1 Score : %d \n" , player1Score());
		
		System.out.printf("\n");
		System.out.printf("player2 : ");
		for(int i = 0; i<player2list.size(); i++){
			Month playerl1 = player2list.get(i);
			playerl1.print();
			System.out.printf(" ");
		}
		System.out.printf("\n");
		System.out.printf("player2 pan : ");
		for(int i = 0; i<player2panlist.size(); i++){
			Month playerpanl1 = player2panlist.get(i);
			playerpanl1.print();
		}
		System.out.printf("\n");
		System.out.printf("player 2 Score : %d \n" , player2Score());
	}
	//center패 한장 까지고 그 중에 같은월 있으면 가져온다.
	public static void center1(){
		//패한장생성
		Month card = new Month();
		int count = Count();
		card.Card(count);
		for(int i = 0; i<centerlist.size(); i++){
			Month centerl1 = centerlist.get(i);
			if(card.division() == centerl1.division()){
				player1panlist.add(card);
				player1panlist.add(centerl1);
				centerlist.remove(i);
				break;
			}
			if(i == centerlist.size()-1){
				centerlist.add(card);
				break;
			}
		}
		
	}
	public static void center2(){
		//패한장생성
		Month card = new Month();
		int count = Count();
		card.Card(count);
		for(int i = 0; i<centerlist.size(); i++){
			Month centerl1 = centerlist.get(i);
			if(card.division() == centerl1.division()){
				player2panlist.add(card);
				player2panlist.add(centerl1);
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
			player1list.add(card);
		}
		System.out.printf(" \n");
		for(int i= 0; i<10;i++){
			Month card = new Month();
			int count = Count();
			card.Card(count);
			player2list.add(card);
		}
		print();

		//패 옮기고 삭제하기
		while(true){
			System.out.printf("\n");
			System.out.printf("player1 turn");
			System.out.printf("\n");
			System.out.printf("center몇번째패?");
			int centerhand = sc.nextInt();
			System.out.printf("player1몇번째패?");
			int playerhand = sc.nextInt();

			Month centerl = centerlist.get(centerhand);
			Month playerl = player1list.get(playerhand);
			player1panlist.add(centerl);
			player1panlist.add(playerl);
			centerlist.remove(centerhand);
			player1list.remove(centerhand);
			center1();
			print();
			
			System.out.printf("player2 turn");
			System.out.printf("\n");
			System.out.printf("center몇번째패?");
			int centerhand2 = sc.nextInt();
			System.out.printf("player2몇번째패?");
			int playerhand2 = sc.nextInt();

			Month center2 = centerlist.get(centerhand2);
			Month player2 = player1list.get(playerhand2);
			player2panlist.add(center2);
			player2panlist.add(player2);
			centerlist.remove(centerhand);
			player2list.remove(centerhand);
			center2();
			print();
			//center패 한장오픈
			
		}
	}
}
