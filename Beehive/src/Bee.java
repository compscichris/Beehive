
/**
 * Bee is class used to represent a drone object in the world
 * @field s_range describes the "sight" range of the drone 
 * @field c_range describes the "comm" range of the drone 
 * Note about positioning: we will include the size of drone
 * as important because we want to make sure the drone will
 * NOT collide with other drones in a swarm.
 * 
 * @field x_pos
 * 
 * @author chr1s
 *
 */
import java.lang.Math;
public class Bee {
	
	public boolean[][][] v_surround;
	public boolean[][][] c_surround;
	public int s_range;
	public int c_range;
	public int x_pos;
	public int y_pos;
	public int z_pos;
	public int x_size;
	public int y_size;
	public int z_size;
	/**
	 * Bee class
	 * @param size: the size of drone in inches for x, y, or z
	 * measurements. x = front length, y = side length, 
	 * z = height
	 * @param range: number of miles that drone can see
	 * @param range2: number of miles
	 */
	public Bee(int x,int y,int z,double range,double range2)
	{
		this.x_size = x;
		this.y_size = y;
		this.z_size = z;
		this.s_range = (int) Math.floor((range * 5280));
		this.c_range = (int) Math.floor((range2 * 5280));
		System.out.println("Bee ranges: hrange = ");
		this.v_surround = new boolean[s_range*2][s_range*2][s_range*2];
		this.c_surround = new boolean[c_range*2][c_range*2][c_range*2];
	}
	public getCenter()
	{
		
	}
	public String toString()
	{
		return String.format("Bee Sight Range: %d Comm Range: %d", this.s_range, this.c_range);
		
	}
}
