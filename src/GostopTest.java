import java.util.Random;

public class GostopTest {

	public static int Count(){
		Random random = new Random();
		boolean shift = true;
		int Xrandom[] = new int[48];
		int b = 0;
		int a = 0;
		while(shift){
			a = random.nextInt(47)+1; //랜덤변수
			for(int i = 0; i<48; i++){
				if(Xrandom[i] == a){
					shift = true;
				}
				if(i==47){
					shift = false;
				}
			}
		}
		for(int i = 0; i<48;i++){ //중복방지하기위해 배열에 넣는다.
			if(b == i){
				Xrandom[b] = a;
				b++;
			}
		}
		return a;
	}
	public static void main(String[] args){
		Month card = new Month();
		int count = Count();
		card.Card(count);
		System.out.println(card.BasicScore);
	}
}
