package CSCsem2;

public class Point {
	
	double x;
	double y;
	
	Point(){
		
	}
	Point(double x2,double y2){
		this.x = x2;
		this.y = y2;
		
	}
	double distance(Point point) {
		double a;
		double b;
		a=this.x-point.x;
		b=this.y-point.y;
		double c = Math.sqrt((a*a)+(b*b));
		return c;
	}
	double getX()
	{
		return x;
	}
	void setX(double x2) {
		this.x = x2;
	}
	double getY() {
		return y;
	}
	void setY(double y2) {
		this.y = y2;
	}
	void setPoint(double x2, double y2)
	{
		this.x = x2;
		this.y = y2;
	}
	void shiftX(double x2)
	{
		this.x=this.x+x2;
	}
	void shiftY(double y2)
	{ 
		this.y=this.y+y2;
	}
	void rotate(double O)
	{
		double a = this.x;
		this.x = (x*Math.cos(O))-(y*Math.sin(O));
		this.y = (a*Math.sin(O))+(y*Math.cos(O));
	}
	
	public String toString(){
		String string = ("{x="+this.x+", y="+this.y+"}");
		return string;
	}
}
