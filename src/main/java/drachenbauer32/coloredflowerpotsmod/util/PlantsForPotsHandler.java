package drachenbauer32.coloredflowerpotsmod.util;

import java.util.function.Supplier;

import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsBlocks;
import net.minecraft.block.Block;
//import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraftforge.fml.RegistryObject;

public class PlantsForPotsHandler
{
    @SuppressWarnings("unchecked")
    public static void addPlantsToPots()
    {
        for (String color : ColoredFlowerPotsBlocks.COLORS)
        {
            for (RegistryObject<FlowerPotBlock> empty_pot : ColoredFlowerPotsBlocks.EMPTY_FLOWER_POTS)
            {
                if (empty_pot.getId().getPath().startsWith(color))
                {
                    for (RegistryObject<FlowerPotBlock> full_pot : ColoredFlowerPotsBlocks.FULL_FLOWER_POTS)
                    {
                        if(full_pot.getId().getPath().startsWith(color))
                        {
                            for (Supplier<Block> plant : ColoredFlowerPotsBlocks.PLANT_SUPPLIERS)
                            {
                                if(full_pot.getId().getPath().endsWith(plant.get().getRegistryName().getPath()))
                                { 
                                     empty_pot.get().addPlant(plant.get().getRegistryName(), full_pot);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
