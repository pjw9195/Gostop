
public class Month2ㅡ1 extends Month{
	
	private int BasicScore = 0 ;
	public int getScore(){
		return (BasicScore+1);
	}
	public void print(){
		System.out.print("2월기본피");
	}
	public int getdistinct(){
		return 1;//1은 기본피
	}

}
