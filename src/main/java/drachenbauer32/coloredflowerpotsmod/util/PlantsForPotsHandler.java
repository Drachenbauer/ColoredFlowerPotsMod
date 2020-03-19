package drachenbauer32.coloredflowerpotsmod.util;

import java.util.function.Supplier;

import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.FlowerPotBlock;
import net.minecraftforge.fml.RegistryObject;

public class PlantsForPotsHandler
{
    //private static int i;
    
    public static void addPlantsToPots()
    {
        for (String color : ColoredFlowerPotsBlocks.COLORS)
        {
            for (RegistryObject<FlowerPotBlock> empty_pot : ColoredFlowerPotsBlocks.EMPTY_FLOWER_POTS)
            {
                if (empty_pot.getId().getPath().contains(color))
                {
                    for (RegistryObject<FlowerPotBlock> full_pot : ColoredFlowerPotsBlocks.FULL_FLOWER_POTS)
                    {
                        if(full_pot.getId().getPath().contains(color))
                        {
                            for (Supplier<Block> plant : ColoredFlowerPotsBlocks.PLANT_SUPPLIERS)
                            {
                                if(full_pot.getId().getPath().contains(plant.get().getRegistryName().getPath()))
                                { 
                                     empty_pot.get().addPlant(plant.get().getRegistryName(), full_pot);
                                }
                            }
                        }
                    }
                }
            }
        }
        
        /*ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_WITHER_ROSE_SUPPLIER);
        
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_ACACIA_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_ALLIUM_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_AZURE_BLUET_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_BAMBOO_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_BIRCH_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_BLUE_ORCHID_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_BROWN_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_CACTUS_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_CORNFLOWER_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_DANDELION_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_DARK_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_DEAD_BUSH_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_FERN_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_JUNGLE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_LILY_OF_THE_VALLEY_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_OAK_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_ORANGE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_OXEYE_DAISY_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_PINK_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_POPPY_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_RED_MUSHROOM_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_RED_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_SPRUCE_SAPLING_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_WHITE_TULIP_SUPPLIER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_WITHER_ROSE_SUPPLIER);*/
    }
}
