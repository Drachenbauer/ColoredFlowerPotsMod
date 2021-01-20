package drachenbauer32.coloredflowerpotsmod.init;

import drachenbauer32.coloredflowerpotsmod.util.FlowerPotColors;
import drachenbauer32.coloredflowerpotsmod.util.Plants;
import drachenbauer32.coloredflowerpotsmod.util.Reference;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ColoredFlowerPotsBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
    
    private static final Supplier<Block> AIR_SUPPLIER = () -> Blocks.AIR;
    
    public static final Map<FlowerPotColors, RegistryObject<FlowerPotBlock>> EMPTY_FLOWER_POTS = Collections.synchronizedMap(new HashMap<FlowerPotColors, RegistryObject<FlowerPotBlock>>());
    public static final Map<FlowerPotColors, Map<Plants, RegistryObject<FlowerPotBlock>>> FULL_FLOWER_POTS = Collections.synchronizedMap(new HashMap<FlowerPotColors, Map<Plants, RegistryObject<FlowerPotBlock>>>());
    
    static
    {
        for(FlowerPotColors color : FlowerPotColors.values())
        {
            EMPTY_FLOWER_POTS.put(color, BLOCKS.register(color.getName() + "_flower_pot", () ->
                                  new FlowerPotBlock(null, AIR_SUPPLIER, Block.Properties.from(Blocks.FLOWER_POT))));
            
            FULL_FLOWER_POTS.put(color, Collections.synchronizedMap(new HashMap<Plants, RegistryObject<FlowerPotBlock>>()));
            
            for(Plants plant : Plants.values())
            {
                FULL_FLOWER_POTS.get(color).put(plant, BLOCKS.register(color.getName() + "_potted_" + plant.getName(), () ->
                                                new FlowerPotBlock(EMPTY_FLOWER_POTS.get(color), plant.getPlant(), Block.Properties.from(Blocks.FLOWER_POT))));
            }
        }
    }
}
