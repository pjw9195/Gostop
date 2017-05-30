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
	private static int b = 0; // 랜덤함수 Count 함수..
	private static int Xrandom[] = new int[48];
	private static int player1ts = 0; ////playertotalscore
	private static int player2ts = 0;
	private static int player1ps = 0; ////pastscore
	private static int player2ps = 0;
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
	//player2 점수측정
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
		Scanner sc = new Scanner(System.in);

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
		/////////////////////
		if(player1Score() > 6 && player1ps !=player1Score()){ //Go stop (Two GO까지만 구현)
			System.out.printf("\n palyer1: 1. Go 2. Stop");
			int select = sc.nextInt();

			player1ts = player1Score();

			if(select == 1){
				if(player1ts == 1){
					System.out.print("\n player1: Two go");
				}
				else if(player1ts == 0){

					System.out.print("\n player1: one go");
				}
				player1ts = player1ts + 1;
			}
			else{
				System.out.printf("\n Total Score : %d " , player1ts);
				System.out.printf("\n player1 win ");
				System.exit(0);
			}
		}
		player1ps = player1Score();

		if(player2Score() > 6 && player2ps !=player2Score()){ // Go stop
			System.out.printf("\n palyer2: 1. Go 2. Stop");
			int select = sc.nextInt();
			player2ts = player2Score();

			if(select == 1){
				if(player2ts == 1){
					System.out.print("\n player2: Two go");
				}
				else if(player2ts == 0){

					System.out.print("\n player2: one go");
				}
				player2ts = player2ts + 1;
			}
			else{
				System.out.printf("\n Total Score : %d " , player2ts);
				System.out.printf("\n player2 win ");
				System.exit(0);
			}
		}
		player2ps = player2Score();
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
	public static int distinct1(){ //hand와 center의 같은 월이 없는 조건
		for(int i = 0; i<centerlist.size(); i++){
			Month centerl1 = centerlist.get(i);
			for(int j = 0 ; j< player1list.size(); j++){
				Month playerl1 = player1list.get(j);
				if(centerl1.division() == playerl1.division()){
					return 1; //1이면 같은게있고
				}
			}
		}
		return 2;
		//2면 같은게없음
	}
	public static int distinct2(){
		for(int i = 0; i<centerlist.size(); i++){
			Month centerl2 = centerlist.get(i);
			for(int j = 0 ; j< player2list.size(); j++){
				Month playerl2 = player2list.get(j);
				if(centerl2.division() == playerl2.division()){
					return 1; //1이면 같은게있고
				}
			}
		}
		return 2;
		//2면 같은게없음
	}

	public static void main(String[] args){
		////처음
		Scanner sc = new Scanner(System.in);
		int centerhand = 0;
		int playerhand = 0;
		int distinct = 0;
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
			distinct = distinct1();

			if(distinct == 1){
				System.out.printf("\n");
				System.out.printf("player1 turn");
				System.out.printf("\n");
				System.out.printf("center몇번째패?");
				centerhand = sc.nextInt();
				System.out.printf("player1몇번째패?");
				playerhand = sc.nextInt();


				if(centerlist != null){ // center 패가 없을때를 위한 if문
					Month center1 = centerlist.get(centerhand);
					player1panlist.add(center1);
					centerlist.remove(centerhand);

					Month player1 = player1list.get(playerhand);
					player1panlist.add(player1);
					player1list.remove(playerhand);
				}
				else if(centerlist == null){
					Month player1 = player1list.get(playerhand);
					player2panlist.add(player1);
					centerlist.add(player1);
				}
			}
			else if(distinct == 2){
				System.out.printf("player1몇번째패?");
				playerhand = sc.nextInt();

				Month player1 = player1list.get(playerhand);
				centerlist.add(player1);
				player1list.remove(playerhand);
			}

			center1();
			print();


			distinct = distinct2();

			if(distinct == 1){

				System.out.printf("player2 turn");
				System.out.printf("\n");
				System.out.printf("center몇번째패?");
				centerhand = sc.nextInt();
				System.out.printf("player2몇번째패?");
				playerhand = sc.nextInt();

				if(centerlist != null){ // center 패가 없을때를 위한 if문
					Month center2 = centerlist.get(centerhand);
					player2panlist.add(center2);
					centerlist.remove(centerhand);

					Month player2 = player2list.get(playerhand);
					player2panlist.add(player2);
					player2list.remove(playerhand);
				}
				else if(centerlist == null){
					Month player2 = player2list.get(playerhand);
					centerlist.add(player2);
					player2list.remove(playerhand);
				}
			}
			else if(distinct == 2){
				System.out.printf("player2몇번째패?");
				playerhand = sc.nextInt();

				Month player2 = player2list.get(playerhand);
				centerlist.add(player2);
				player2list.remove(playerhand);
			}
			center2();
			print();

		}
	}
}
