# TextureFinderJava

Gets Coordinates from Texture Rotation in Blocks. **Optifine changes block rotations! This does not work with Optifine!** I do plan on adding Optifine in the future if that is possible.

I plan on creating a GUI for beginner users but I lack the Java knowledge to do so.

## Installation

I use [Eclipse IDE for Java Developers](https://www.eclipse.org/).
Download all of the files in the main folder and put them in a New Java Project.

## Usage

I created my own [texture pack](https://cdn.discordapp.com/attachments/945391588748689438/945391855414165574/BlockRotations.zip) that tells you which rotation a block is. The block rotation is in the top left corner while facing north.

## Example 1

I created a new superflat world in version `1.18.1`. The top layer of grass is at `Y -61`.

![alt text](https://cdn.discordapp.com/attachments/945391588748689438/945398862288408576/example_1.png)

Below is the image converted into code:

```java
formation.add(new BlockFace(0, 0, 0, Side.TOP, 1, Block.GRASS));
formation.add(new BlockFace(1, 0, 0, Side.TOP, 3, Block.GRASS));
formation.add(new BlockFace(2, 0, 0, Side.TOP, 0, Block.GRASS));
formation.add(new BlockFace(3, 0, 0, Side.TOP, 0, Block.GRASS));
		
formation.add(new BlockFace(0, 0, 1, Side.TOP, 2, Block.GRASS));
formation.add(new BlockFace(1, 0, 1, Side.TOP, 0, Block.GRASS));
formation.add(new BlockFace(2, 0, 1, Side.TOP, 2, Block.GRASS));
formation.add(new BlockFace(3, 0, 1, Side.TOP, 2, Block.GRASS));
		
formation.add(new BlockFace(0, 0, 2, Side.TOP, 0, Block.GRASS));
formation.add(new BlockFace(1, 0, 2, Side.TOP, 1, Block.GRASS));
formation.add(new BlockFace(2, 0, 2, Side.TOP, 2, Block.GRASS));
formation.add(new BlockFace(3, 0, 2, Side.TOP, 0, Block.GRASS));
		
formation.add(new BlockFace(0, 0, 3, Side.TOP, 2, Block.GRASS));
formation.add(new BlockFace(1, 0, 3, Side.TOP, 0, Block.GRASS));
formation.add(new BlockFace(2, 0, 3, Side.TOP, 1, Block.GRASS));
formation.add(new BlockFace(3, 0, 3, Side.TOP, 2, Block.GRASS));
```

Now we can modify our search parameters:

```java
int xmin=-100, xmax=100; //Minimum X value, Maximum X value
int zmin=-100, zmax=100; //Minimum Z value, Maximum Z value
int ymin=-70, ymax=-60;  //Minimum Y value, Maximum Y value
```

Now we can run the code. This is my result:
```
X: -50 Y: -61 Z: -54
```
