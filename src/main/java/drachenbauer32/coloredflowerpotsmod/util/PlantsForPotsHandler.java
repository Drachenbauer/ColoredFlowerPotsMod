package drachenbauer32.coloredflowerpotsmod.util;

import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsBlocks;

public class PlantsForPotsHandler
{
    public static void addPlantsToPots()
    {
        for (FlowerPotColors color : FlowerPotColors.values())
        {
            for (Plants plant : Plants.values())
            {
                ColoredFlowerPotsBlocks.EMPTY_FLOWER_POTS.get(color).get().addPlant(plant.getPlant().get().getRegistryName(), ColoredFlowerPotsBlocks.FULL_FLOWER_POTS.get(color).get(plant));
            }
        }
    }
}
