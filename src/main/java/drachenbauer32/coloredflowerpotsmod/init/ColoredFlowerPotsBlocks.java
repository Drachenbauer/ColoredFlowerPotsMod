package drachenbauer32.coloredflowerpotsmod.init;

import drachenbauer32.coloredflowerpotsmod.util.Reference;

import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unchecked")
public class ColoredFlowerPotsBlocks
{
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Reference.MOD_ID);
    
    public static final String[] COLORS = {"black",
                                           "blue",
                                           "brown",
                                           "cyan",
                                           "gray",
                                           "green",
                                           "light_blue",
                                           "light_gray",
                                           "lime",
                                           "magenta",
                                           "orange",
                                           "pink",
                                           "purple",
                                           "red",
                                           "white",
                                           "yellow"};
    
    private static final Supplier<Block> AIR_SUPPLIER = () -> Blocks.AIR;
    
    @SuppressWarnings("rawtypes")
    public static final Supplier[] PLANT_SUPPLIERS = {() -> Blocks.ACACIA_SAPLING,
                                                      () -> Blocks.ALLIUM,
                                                      () -> Blocks.AZURE_BLUET,
                                                      () -> Blocks.BAMBOO,
                                                      () -> Blocks.BIRCH_SAPLING,
                                                      () -> Blocks.BLUE_ORCHID,
                                                      () -> Blocks.BROWN_MUSHROOM,
                                                      () -> Blocks.CACTUS,
                                                      () -> Blocks.CORNFLOWER,
                                                      () -> Blocks.DANDELION,
                                                      () -> Blocks.DARK_OAK_SAPLING,
                                                      () -> Blocks.DEAD_BUSH,
                                                      () -> Blocks.FERN,
                                                      () -> Blocks.JUNGLE_SAPLING,
                                                      () -> Blocks.LILY_OF_THE_VALLEY,
                                                      () -> Blocks.OAK_SAPLING,
                                                      () -> Blocks.ORANGE_TULIP,
                                                      () -> Blocks.OXEYE_DAISY,
                                                      () -> Blocks.PINK_TULIP,
                                                      () -> Blocks.POPPY,
                                                      () -> Blocks.RED_MUSHROOM,
                                                      () -> Blocks.RED_TULIP,
                                                      () -> Blocks.SPRUCE_SAPLING,
                                                      () -> Blocks.WHITE_TULIP,
                                                      () -> Blocks.WITHER_ROSE};
    
    public static final RegistryObject<FlowerPotBlock>[] EMPTY_FLOWER_POTS = new RegistryObject[COLORS.length];
    public static final RegistryObject<FlowerPotBlock>[] FULL_FLOWER_POTS = new RegistryObject[COLORS.length * PLANT_SUPPLIERS.length];
    
    private static int i = 0;
    private static int j = 0;
    
    static
    {
        for(String color : COLORS)
        {
            EMPTY_FLOWER_POTS[i] = BLOCKS.register(color + "_flower_pot", () -> new FlowerPotBlock(null, AIR_SUPPLIER,
                                   Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
            
            for(Supplier<Block> plant_supplier : PLANT_SUPPLIERS)
            {
                String plant = plant_supplier.get().getRegistryName().getPath();
                FULL_FLOWER_POTS[j] = BLOCKS.register(color + "_potted_" + plant, () -> new FlowerPotBlock(EMPTY_FLOWER_POTS[i], plant_supplier,
                                      Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                
                if (j < COLORS.length * PLANT_SUPPLIERS.length - 1)
                {
                    j++;
                }
                else
                {
                    j = 0;
                }
            }
            
            if (i < COLORS.length - 1)
            {
                i++;
            }
            else
            {
                i = 0;
            }
        }
    }
}
