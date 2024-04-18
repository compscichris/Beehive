package BeeWorld;

public abstract class Actor {
	protected Coordinates position;
	protected String loyalty;
	public abstract String getLoyalty();
	public abstract String toString();
	public Coordinates getPosition()
	{
		return this.position;
	}
	public abstract boolean hostility(String faction);
}
