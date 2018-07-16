package prototype;

public interface Ponto extends Cloneable{
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public Object clone();
}
