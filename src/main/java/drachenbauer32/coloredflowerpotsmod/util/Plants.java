package drachenbauer32.coloredflowerpotsmod.util;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import java.util.function.Supplier;

public enum Plants
{
    ACACIA_SAPLING("acacia_sapling", () -> Blocks.ACACIA_SAPLING),
    ALLIUM("allium", () -> Blocks.ALLIUM),
    AZURE_BLUET("azure_bluet", () -> Blocks.AZURE_BLUET),
    BAMBOO("bamboo", () -> Blocks.BAMBOO),
    BIRCH_SAPLING("birch_sapling", () -> Blocks.BIRCH_SAPLING),
    BLUE_ORCHID("blue_orchid", () -> Blocks.BLUE_ORCHID),
    BROWN_MUSHROOM("brown_mushroom", () -> Blocks.BROWN_MUSHROOM),
    CACTUS("cactus", () -> Blocks.CACTUS),
    CORNFLOWER("cornflower", () -> Blocks.CORNFLOWER),
    DANDELION("dandelion", () -> Blocks.DANDELION),
    DARK_OAK_SAPLING("dark_oak_sapling", () -> Blocks.DARK_OAK_SAPLING),
    DEAD_BUSH("dead_bush", () -> Blocks.DEAD_BUSH),
    FERN("fern", () -> Blocks.FERN),
    JUNGLE_SAPLING("jungle_sapling", () -> Blocks.JUNGLE_SAPLING),
    LILY_OF_THE_VALLEY("lily_of_the_valley", () -> Blocks.LILY_OF_THE_VALLEY),
    OAK_SAPLING("oak_sapling", () -> Blocks.OAK_SAPLING),
    ORANGE_TULIP("orange_tulip", () -> Blocks.ORANGE_TULIP),
    OXEYE_DAISY("oxeye_daisy", () -> Blocks.OXEYE_DAISY),
    PINK_TULIP("pink_tulip", () -> Blocks.PINK_TULIP),
    POPPY("poppy", () -> Blocks.POPPY),
    RED_MUSHROOM("red_mushroom", () -> Blocks.RED_MUSHROOM),
    RED_TULIP("red_tulip", () -> Blocks.RED_TULIP),
    SPRUCE_SAPLING("spruce_sapling", () -> Blocks.SPRUCE_SAPLING),
    WHITE_TULIP("white_tulip", () -> Blocks.WHITE_TULIP),
    WITHER_ROSE("wither_rose", () -> Blocks.WITHER_ROSE);
    
    public final String name;
    public final Supplier<Block> plant;
    
    private Plants(String name, Supplier<Block> plant)
    {
        this.name = name;
        this.plant = plant;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Supplier<Block> getPlant()
    {
        return plant;
    }
}
