package BeeWorld;
/**
 * The World class is a representation of a world of a Bee.
 * The world is mapped in miles for integer values, and only
 * uses a square to represent an area.
 * 
 * This method of partitioning world areas makes it so we can
 * piece together multiple parts, effectively allowing tiling
 * of the globe 
 * 
 * 
 * 
 * @author Christopher Chen
 *
 */
public class World
{
	public Grid[] map;
	public World(int length, int height, String units, int quad)
	{
		this.map = new Grid[4];
	}
	public retrieveCoordinates()
	{
		
	}
	
}
