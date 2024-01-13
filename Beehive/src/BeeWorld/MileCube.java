package BeeWorld;

public class MileCube {
	public Grid<FeetCube> grid;
	public MileCube()
	{
		grid = new Grid<FeetCube>(5280);
		int sqft = 5280*5208;
	}
}
