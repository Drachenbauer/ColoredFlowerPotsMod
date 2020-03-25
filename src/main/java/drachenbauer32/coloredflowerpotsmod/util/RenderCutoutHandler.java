package drachenbauer32.coloredflowerpotsmod.util;

import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsBlocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.RegistryObject;

public class RenderCutoutHandler
{
    public static void renderCutoutPlantTextures()
    {
        for (RegistryObject<FlowerPotBlock> full_flower_pot : ColoredFlowerPotsBlocks.FULL_FLOWER_POTS)
        {
            if(! full_flower_pot.getId().getPath().contains("cactus"))
            {
                RenderTypeLookup.setRenderLayer(full_flower_pot.get(), RenderType.getCutout());
            }
        }
    }
}
