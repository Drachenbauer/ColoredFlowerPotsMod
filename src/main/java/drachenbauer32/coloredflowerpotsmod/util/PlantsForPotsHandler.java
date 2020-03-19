package drachenbauer32.coloredflowerpotsmod.util;

import java.util.function.Supplier;

import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsBlocks;
import net.minecraft.block.Block;
//import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraftforge.fml.RegistryObject;

public class PlantsForPotsHandler
{
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
        
        /*ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_FERN);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_POPPY);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.BLACK_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_FERN);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_POPPY);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.BLUE_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_FERN);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_POPPY);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.BROWN_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_FERN);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_POPPY);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.CYAN_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_FERN);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_POPPY);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.GRAY_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_FERN);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_POPPY);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.GREEN_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_FERN);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_POPPY);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_BLUE_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_FERN);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_POPPY);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.LIGHT_GRAY_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_FERN);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_POPPY);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.LIME_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_FERN);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_POPPY);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.MAGENTA_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_FERN);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_POPPY);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.ORANGE_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_FERN);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_POPPY);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.PINK_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_FERN);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_POPPY);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.PURPLE_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_FERN);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_POPPY);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.RED_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.RED_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_FERN);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_POPPY);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.WHITE_POTTED_WITHER_ROSE);
        
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.ACACIA_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_ACACIA_SAPLING);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.ALLIUM.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_ALLIUM);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.AZURE_BLUET.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_AZURE_BLUET);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.BAMBOO.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_BAMBOO);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.BIRCH_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_BIRCH_SAPLING);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.BLUE_ORCHID.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_BLUE_ORCHID);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.BROWN_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_BROWN_MUSHROOM);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.CACTUS.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_CACTUS);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.CORNFLOWER.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_CORNFLOWER);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.DANDELION.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_DANDELION);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.DARK_OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_DARK_OAK_SAPLING);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.DEAD_BUSH.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_DEAD_BUSH);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.FERN.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_FERN);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.JUNGLE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_JUNGLE_SAPLING);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.LILY_OF_THE_VALLEY.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_LILY_OF_THE_VALLEY);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.OAK_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_OAK_SAPLING);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.ORANGE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_ORANGE_TULIP);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.OXEYE_DAISY.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_OXEYE_DAISY);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.PINK_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_PINK_TULIP);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.POPPY.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_POPPY);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.RED_MUSHROOM.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_RED_MUSHROOM);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.RED_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_RED_TULIP);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.SPRUCE_SAPLING.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_SPRUCE_SAPLING);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.WHITE_TULIP.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_WHITE_TULIP);
        ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get().addPlant(Blocks.WITHER_ROSE.getRegistryName(), ColoredFlowerPotsBlocks.YELLOW_POTTED_WITHER_ROSE);*/
    }
}
