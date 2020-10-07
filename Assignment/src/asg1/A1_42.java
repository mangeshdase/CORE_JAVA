package asg1;
class Tile{
	int length;
	Tile(int length){
		this.length = length;
	}
}
class Floor extends Tile{
	int F_length;
	int F_width;
	Floor(int length, int F_length, int F_width){
		super(length);
		this.F_length=F_length;
		this.F_width = F_width;
	}
	void totalTiles(Tile t) {
		int l = this.F_length;
		int w = this.F_width;
		int area = l*w;
		float totalTitle = t.length/(float)area;
		System.out.println(String.format("%.3f",totalTitle));
		
	}
}
public class A1_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Floor f = new Floor(200,3,3);
		f.totalTiles(f);

	}

}
