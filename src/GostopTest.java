import java.util.Random;

public class GostopTest {

	public static void random(int a){
		/////////////1월
		if(a==1){
			Month1ㅡ1 oneone = new Month1ㅡ1();
		}
		else if(a==2){
			Month1ㅡ2 onetwo = new Month1ㅡ2();
		}
		else if(a==3){
			Month1ㅡ3 onethree = new Month1ㅡ3();
		}
		else if(a==4){
			Month1ㅡ4 onefour = new Month1ㅡ4();
		}
		//////////////2월
		else if(a==5){
			Month2ㅡ1 twoone = new Month2ㅡ1();
		}
		else if(a==6){
			Month2ㅡ2 twotwo = new Month2ㅡ2();
		}
		else if(a==7){
			Month2ㅡ3 twothree = new Month2ㅡ3();
		}
		else if(a==8){
			Month2ㅡ4 twofour = new Month2ㅡ4();
		}
		//////////////3월
		else if(a==9){
			Month3ㅡ1 threeone = new Month3ㅡ1();
		}
		else if(a==10){
			Month3ㅡ2 threetwo = new Month3ㅡ2();
		}
		else if(a==11){
			Month3ㅡ3 threethree = new Month3ㅡ3();
		}
		else if(a==12){
			Month3ㅡ4 threefour = new Month3ㅡ4();
		}
		//////////////4월
		else if(a==13){
			Month4ㅡ1 fourone = new Month4ㅡ1();
		}
		else if(a==14){
			Month4ㅡ2 fourtwo = new Month4ㅡ2();
		}
		else if(a==15){
			Month4ㅡ3 fourthree = new Month4ㅡ3();
		}
		else if(a==16){
			Month4ㅡ4 fourfour = new Month4ㅡ4();
		}
		//////////////5월
		else if(a==17){
			Month5ㅡ1 fiveone = new Month5ㅡ1();
		}
		else if(a==18){
			Month5ㅡ2 fivetwo = new Month5ㅡ2();
		}
		else if(a==19){
			Month5ㅡ3 fivethree = new Month5ㅡ3();
		}
		else if(a==20){
			Month5ㅡ4 fivefour = new Month5ㅡ4();
		}
		//////////////6월
		else if(a==21){
			Month6ㅡ1 sixone = new Month6ㅡ1();
		}
		else if(a==22){
			Month6ㅡ2 sixtwo = new Month6ㅡ2();
		}
		else if(a==23){
			Month6ㅡ3 sixthree = new Month6ㅡ3();
		}
		else if(a==24){
			Month6ㅡ4 sixfour = new Month6ㅡ4();
		}
		//////////////7월
		else if(a==25){
			Month7ㅡ1 sevenone = new Month7ㅡ1();
		}
		else if(a==26){
			Month7ㅡ2 seventwo = new Month7ㅡ2();
		}
		else if(a==27){
			Month7ㅡ3 seventhree = new Month7ㅡ3();
		}
		else if(a==28){
			Month7ㅡ4 sevenfour = new Month7ㅡ4();
		}
		//////////////8월
		else if(a==29){
			Month8ㅡ1 eightone = new Month8ㅡ1();
		}
		else if(a==30){
			Month8ㅡ2 eighttwo = new Month8ㅡ2();
		}
		else if(a==31){
			Month8ㅡ3 eightthree = new Month8ㅡ3();
		}
		else if(a==32){
			Month8ㅡ4 eightfour = new Month8ㅡ4();
		}
		//////////////9월
		else if(a==33){
			Month9ㅡ1 nineone = new Month9ㅡ1();
		}
		else if(a==34){
			Month9ㅡ2 ninetwo = new Month9ㅡ2();
		}
		else if(a==35){
			Month9ㅡ3 ninethree = new Month9ㅡ3();
		}
		else if(a==36){
			Month9ㅡ4 ninefour = new Month9ㅡ4();
		}
		//////////////10월
		else if(a==37){
			Month10ㅡ1 tenone = new Month10ㅡ1();
		}
		else if(a==38){
			Month10ㅡ2 tentwo = new Month10ㅡ2();
		}
		else if(a==39){
			Month10ㅡ3 tenthree = new Month10ㅡ3();
		}
		else if(a==40){
			Month10ㅡ4 tenfour = new Month10ㅡ4();
		}
		//////////////11월
		else if(a==41){
			Month11ㅡ1 elevenone = new Month11ㅡ1();
		}
		else if(a==42){
			Month11ㅡ2 eleventwo = new Month11ㅡ2();
		}
		else if(a==43){
			Month11ㅡ3 eleventhree = new Month11ㅡ3();
		}
		else if(a==44){
			Month11ㅡ4 elevenfour = new Month11ㅡ4();
		}
		//////////////12월
		else if(a==45){
			Month12ㅡ1 twelveone = new Month12ㅡ1();
		}
		else if(a==46){
			Month12ㅡ2 twelvetwo = new Month12ㅡ2();
		}
		else if(a==47){
			Month12ㅡ3 twelvethree = new Month12ㅡ3();
		}
		else if(a==48){
			Month12ㅡ4 twelvefour = new Month12ㅡ4();
		}
	}
		public static void main(String[] args){
			Random random = new Random();
			int a = random.nextInt(47)+1; //랜덤변수
			Month month = new Month();
			month random(a);

		}
	}
