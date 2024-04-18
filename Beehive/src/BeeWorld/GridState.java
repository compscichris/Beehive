package BeeWorld;

public class GridState {
	private Object occupied;
	private boolean isEmpty;
	public GridState()
	{
		this.occupied = null;
		this.isEmpty = true;
	}
	public void setState(Object item)
	{
		this.occupied = item;
		this.isEmpty = false;
	}
	public void clearState()
	{
		this.occupied = null;
		this.isEmpty = true;
	}
	public boolean checkEmpty()
	{
		return this.isEmpty;
	}
	public Object getState()
	{
		return this.occupied;
	}
}
