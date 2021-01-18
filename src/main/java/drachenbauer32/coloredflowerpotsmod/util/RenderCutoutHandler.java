package drachenbauer32.coloredflowerpotsmod.util;

import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class RenderCutoutHandler
{
    public static void renderCutoutPlantTextures()
    {
        for (FlowerPotColors color : FlowerPotColors.values())
        {
            for (Plants plant : Plants.values())
            {
                RenderTypeLookup.setRenderLayer(ColoredFlowerPotsBlocks.FULL_FLOWER_POTS.get(color).get(plant).get(), RenderType.getCutout());
            }
        }
    }
}
