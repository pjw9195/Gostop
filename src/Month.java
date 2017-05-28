
public class Month {
	protected int a = 0;
	protected int BasicScore = 0;
	protected int Godori =0;
	protected int Blue = 0;
	protected int Red = 0;
	protected int Cho = 0 ;
	protected int Light = 0;
	protected int Animal = 0;
	protected int Dan = 0;
	protected int BiLight = 0;
	
	public void Card(int a){
		this.a = a;
		/////////////1월
		if(a==1){
			BasicScore++;
		}
		else if(a==2){
			BasicScore++;
		}
		else if(a==3){
			Red++;
			Dan++;
		}
		else if(a==4){
			Light++;
		}
		//////////////2월
		else if(a==5){
			BasicScore++;
		}
		else if(a==6){
			BasicScore++;
		}
		else if(a==7){
			Red++;
			Dan++;
		}
		else if(a==8){
			Godori++;
			Animal++;
		}
		//////////////3월
		else if(a==9){
			BasicScore++;	
		}
		else if(a==10){
			BasicScore++;
		}
		else if(a==11){
			Light++;
		}
		else if(a==12){
			Red++;
			Dan++;
		}
		//////////////4월
		else if(a==13){
			BasicScore++;
		}
		else if(a==14){
			BasicScore++;
		}
		else if(a==15){
			Godori++;
			Animal++;
		}
		else if(a==16){
			Cho++;
			Dan++;
		}
		//////////////5월
		else if(a==17){
			BasicScore++;
		}
		else if(a==18){
			BasicScore++;
		}
		else if(a==19){
			Animal++;
		}
		else if(a==20){
			Cho++;
			Dan++;
		}
		//////////////6월
		else if(a==21){
			BasicScore++;
		}
		else if(a==22){
			BasicScore++;
		}
		else if(a==23){
			Animal++;
		}
		else if(a==24){
			Blue++;
			Dan++;
		}
		//////////////7월
		else if(a==25){
			BasicScore++;
		}
		else if(a==26){
			BasicScore++;
		}
		else if(a==27){
			Cho++;
			Dan++;
		}
		else if(a==28){
			Animal++;
		}
		//////////////8월
		else if(a==29){
			BasicScore++;
		}
		else if(a==30){
			BasicScore++;
		}
		else if(a==31){
			Godori++;
			Animal++;
		}
		else if(a==32){
			Light++;
		}
		//////////////9월
		else if(a==33){
			BasicScore++;
		}
		else if(a==34){
			BasicScore++;
		}
		else if(a==35){
			Blue++;
			Dan++;
		}
		else if(a==36){
			Animal++;
		}
		//////////////10월
		else if(a==37){
			BasicScore++;
		}
		else if(a==38){	
			BasicScore++;
		}
		else if(a==39){
			Animal++;
		}
		else if(a==40){
			Blue++;
			Dan++;
		}
		//////////////11월
		else if(a==41){
			BasicScore++;
		}
		else if(a==42){
			BasicScore++;
		}
		else if(a==43){
			BasicScore= BasicScore+2;
		}
		else if(a==44){
			Light++;
		}
		//////////////12월
		else if(a==45){
			BasicScore = BasicScore+2;
		}
		else if(a==46){
			Animal++;	
		}
		else if(a==47){
			Dan++;
		}
		else if(a==48){
			BiLight++; // 비광++
			Light++;

		}

	}
	public int division(){

		/////////////1월
		if(a>0 && a<5){
			return 1;
		}
		//////////////2월
		else if(a>4 && a<9){
			return 2;
		}
		//////////////3월
		else if(a>8 && a<13){
			return 3;
		}
		//////////////4월
		else if(a>12 && a<17){
			return 4;
		}
		//////////////5월
		else if(a>16 && a<21){
			return 5;
		}
		//////////////6월
		else if(a>20&& a<25){
			return 6;
		}
		//////////////7월
		else if(a >24 && a<29){
			return 7;
		}
		//////////////8월
		else if(a >28 && a<33){
			return 8;
		}
		//////////////9월
		else if(a>32 && a<37){
			return 9;
		}
		//////////////10월
		else if(a>36 && a<41){
			return 10;
		}
		//////////////11월
		else if(a>40 && a<45){
			return 11;
		}
		//////////////12월
		else {
			return 12;
		}
	}
	/////////월 구별
	public void print(){

		/////////////1월
		if(a==1){
			System.out.print("1월피");
		}
		else if(a==2){
			System.out.print("1월피");
		}
		else if(a==3){
			System.out.print("1월홍단");
		}
		else if(a==4){
			System.out.print("1월광");
		}
		//////////////2월
		else if(a==5){
			System.out.print("2월피");
		}
		else if(a==6){
			System.out.print("2월피");
		}
		else if(a==7){
			System.out.print("2월홍단");
		}
		else if(a==8){
			System.out.print("2월고도리");
		}
		//////////////3월
		else if(a==9){
			System.out.print("3월피");	
		}
		else if(a==10){
			System.out.print("3월피");
		}
		else if(a==11){
			System.out.print("3월광");
		}
		else if(a==12){
			System.out.print("3월홍단");
		}
		//////////////4월
		else if(a==13){
			System.out.print("4월피");
		}
		else if(a==14){
			System.out.print("4월피");
		}
		else if(a==15){
			System.out.print("4월고도리");
		}
		else if(a==16){
			System.out.print("4월초단");
		}
		//////////////5월
		else if(a==17){
			System.out.print("5월피");
		}
		else if(a==18){
			System.out.print("5월피");
		}
		else if(a==19){
			System.out.print("5월열끗");
		}
		else if(a==20){
			System.out.print("5월초단");
		}
		//////////////6월
		else if(a==21){
			System.out.print("6월피");
		}
		else if(a==22){
			System.out.print("6월피");
		}
		else if(a==23){
			System.out.print("6월열끗");
		}
		else if(a==24){
			System.out.print("6월청단");
		}
		//////////////7월
		else if(a==25){
			System.out.print("7월피");
		}
		else if(a==26){
			System.out.print("7월피");
		}
		else if(a==27){
			System.out.print("7월초단");
		}
		else if(a==28){
			System.out.print("7월열끗");
		}
		//////////////8월
		else if(a==29){
			System.out.print("8월피");
		}
		else if(a==30){
			System.out.print("8월피");
		}
		else if(a==31){
			System.out.print("8월고도리");
		}
		else if(a==32){
			System.out.print("8월광");
		}
		//////////////9월
		else if(a==33){
			System.out.print("9월피");
		}
		else if(a==34){
			System.out.print("9월피");
		}
		else if(a==35){
			System.out.print("9월청단");
		}
		else if(a==36){
			System.out.print("9월열끗");
		}
		//////////////10월
		else if(a==37){
			System.out.print("10월피");
		}
		else if(a==38){	
			System.out.print("10월피");
		}
		else if(a==39){
			System.out.print("10월열끗");
		}
		else if(a==40){
			System.out.print("10월청단");
		}
		//////////////11월
		else if(a==41){
			System.out.print("11월피");
		}
		else if(a==42){
			System.out.print("11월피");
		}
		else if(a==43){
			System.out.print("11월쌍피");
		}
		else if(a==44){
			System.out.print("11월광");
		}
		//////////////12월
		else if(a==45){
			System.out.print("12월쌍피");
		}
		else if(a==46){
			System.out.print("12월열끗");
		}
		else if(a==47){
			System.out.print("12월가짜초단");
		}
		else if(a==48){
			System.out.print("12월비광");
		}

	}

}
