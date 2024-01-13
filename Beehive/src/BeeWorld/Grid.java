package BeeWorld;

public class Grid<T> {
	public T[][] table;
	public Grid(int size)
	{
		this.table = (T[][])new Object[size][size];
	}
	
}
