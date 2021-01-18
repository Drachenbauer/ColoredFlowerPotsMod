package drachenbauer32.coloredflowerpotsmod.init;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import drachenbauer32.coloredflowerpotsmod.ColoredFlowerPots;
import drachenbauer32.coloredflowerpotsmod.items.ColoredFlowerPotBlockItem;
import drachenbauer32.coloredflowerpotsmod.util.FlowerPotColors;
import drachenbauer32.coloredflowerpotsmod.util.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ColoredFlowerPotsItems
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
    
    public static final Map<FlowerPotColors, RegistryObject<Item>> EMPTY_FLOWER_POTS = Collections.synchronizedMap(new HashMap<FlowerPotColors, RegistryObject<Item>>());
    
    private static int i = 0;
    
    static
    {
        for (FlowerPotColors color : FlowerPotColors.values())
        {
            
            EMPTY_FLOWER_POTS.put(color, ITEMS.register(color.getName() + "_flower_pot", () -> new ColoredFlowerPotBlockItem(color, ColoredFlowerPotsBlocks.EMPTY_FLOWER_POTS.get(color).get(),
                                  new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair())));
            
            if (i < FlowerPotColors.values().length - 1)
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
