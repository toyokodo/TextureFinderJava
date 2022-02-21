package main;

public class BlockFace
{
	private int x, y, z, rotation;
	private Side side;
	private Block block;
	
	public BlockFace(int x, int y, int z, Side side, int rotation)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		this.side=side;
		this.rotation=rotation;
		this.block=block;
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public int getZ() {return z;}
	public Side getSide() {return side;}
	public int getRotation() {return rotation;}
	public Block getBlock() {return block;}
}
