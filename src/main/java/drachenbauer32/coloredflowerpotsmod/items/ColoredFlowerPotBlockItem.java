package drachenbauer32.coloredflowerpotsmod.items;

import drachenbauer32.coloredflowerpotsmod.util.FlowerPotColors;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class ColoredFlowerPotBlockItem extends BlockItem
{
    public final FlowerPotColors color;
    
    public ColoredFlowerPotBlockItem(FlowerPotColors color, Block blockIn, Properties builder)
    {
        super(blockIn, builder);
        this.color = color;
    }
    
}
