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
	public MileCube[][][] area;
	public World(int length, int height)
	{
		for(int i = 0; i < length; i++)
		{
			for(int j = 0; j < length; j++)
			{
				for(int k = 0; k < height; k++)
				{
					area[i][j][k] = new MileCube();
				}
			}
		}
	}
	public retrieveCoordinates()
	{
		
	}
}
