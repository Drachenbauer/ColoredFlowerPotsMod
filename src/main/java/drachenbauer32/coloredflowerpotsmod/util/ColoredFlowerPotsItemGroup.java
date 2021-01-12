package drachenbauer32.coloredflowerpotsmod.util;

import drachenbauer32.coloredflowerpotsmod.ColoredFlowerPots;
import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ColoredFlowerPotsItemGroup extends ItemGroup
{
    public ColoredFlowerPotsItemGroup()
    {
        super("coloredflowerpots");
    }
    
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ColoredFlowerPotsItems.YELLOW_FLOWER_POT.get());
        
        /*Item icon = Items.FLOWER_POT;
        for (RegistryObject<BlockItem> flower_pot : ColoredFlowerPotsItems.EMPTY_FLOWER_POTS)
        {
            if (flower_pot.getId().getPath().startsWith("yellow"))
            {
                icon = flower_pot.get();
                break;
            }
        }
        return new ItemStack(icon);*/
    }
    
    @Override
    public void fill(NonNullList<ItemStack> itemStacks)
    {
        super.fill(itemStacks);
        itemStacks.sort(ColoredFlowerPots.itemSorter);
    }
}
