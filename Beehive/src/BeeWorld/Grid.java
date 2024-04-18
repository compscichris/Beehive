package BeeWorld;
/**
 * Grid is a class that represents a 3 dimensional space limited by
 * three parameters sizeX, sizeY, and sizeZ. Units are ambiguous,
 * allowing the for the usage of this Grid to represent different
 * units according to necessity.
 * @param sizeX: the limitations on the x-axis of the 3d space.
 * @param sizeY: the limitations on the y-axis of the 3d space.
 * @param sizeZ: the limitations on the z-axis of the 3d space.
 * Each individual unit of the 3d space is represented by an object
 * known as GridSpace, which is inside of this same package.
 * @field grid: the representation of the 3D space
 * @field sizeX: the maximum number of units allowed on the x-axis
 * @field sizeY: the maximum number of units allowed on the y-axis
 * @field sizeZ: the maximum number of units allowed on the z-axis
 */
public class Grid {
	private GridState[][][] grid;
	private int sizeX;
	private int sizeY;
	private int sizeZ;
	public Grid(int sizeX, int sizeY, int sizeZ)
	{
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.sizeZ = sizeZ;
		this.grid = new GridState[sizeX][sizeY][sizeZ];
		for(int i = 0; i < sizeX; i++)
		{
			for(int j = 0; j < sizeY; j++)
			{
				for(int k = 0; k < sizeZ; k++)
				{
					this.grid[i][j][k] = new GridState();
				}
			}
		}
	}
	
	/**
	 * getTable() returns the state of the grid
	 * @return grid (@field)
	 */
	public GridState[][][] getTable()
	{
		return this.grid;
	}
	
	/**
	 * getSizeX() returns the maximum number of units allowed on 
	 * the x-axis.
	 * @return sizeX (@field)
	 */
	public int getSizeX()
	{
		return this.sizeX;
	}
	
	/**
	 * getSizeY() returns the maximum number of units allowed on 
	 * the y-axis.
	 * @return sizeY (@field)
	 */
	public int getSizeY()
	{
		return this.sizeY;
	}
	
	/**
	 * getSizeZ() returns the maximum number of units allowed on 
	 * the z-axis.
	 * @return sizeZ (@field)
	 */
	public int getSizez()
	{
		return this.sizeZ;
	}
	
	/**
	 * 
	 * @param x: the x coordinate of the grid unit being modified
	 * @param y: the y coordinate of the grid unit being modified
	 * @param z: the z coordinate of the grid unit being modified
	 * @param item: the object that is being situated in that unit
	 * @return true if unit was modified, false if unit failed the
	 * modification.
	 */
	public boolean editPos(int x, int y, int z, Object item)
	{
		if(!inRange(x,this.sizeX)||!inRange(y,this.sizeY)
				||!inRange(z,this.sizeZ))
		{
			return false;
		}
		if(item != null)
		{
			this.grid[x][y][z].setState(item);
		}
		else
		{
			this.grid[x][y][z].clearState();
		}
		return true;
	}
	
	/**
	 * 
	 * @param x: the x coordinate of the grid unit being modified
	 * @param y: the y coordinate of the grid unit being modified
	 * @param z: the z coordinate of the grid unit being modified
	 * @param item: the object that is being situated in that unit
	 * @return true if unit was modified, false if unit failed the
	 * modification.
	 */
	public boolean inRange(int val, int max)
	{
		return val >= 0 && val < max;
	}
}
