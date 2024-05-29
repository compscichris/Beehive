package BeeWorld;
/**
 * GridState is an object that represents the state of a grid, which is a set defined space. Properties
 * @field selfOccupied: The object that represents the space taken of the owner of the space
 * @field otherOccupied: The object that represents the 
 */
public class GridState {
	private Object selfOccupied;
	private Object otherOccupied;
	private Object owner;
	private boolean isEmpty;
	
	/**
	 * GridState() default constructor creates an empty/neutral space.
	 */
	public GridState()
	{
		this.occupied = null;
		this.isEmpty = true;
		this.owner = null;
		this.
	}
	public GridState(Object owner)
	{
		this.occupied = null;
		this.isEmpty = true;
		this.owner = owner;
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
