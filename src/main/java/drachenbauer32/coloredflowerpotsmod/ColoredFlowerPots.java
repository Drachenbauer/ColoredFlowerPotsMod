package drachenbauer32.coloredflowerpotsmod;

import java.util.Comparator;
import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsBlocks;
import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsItems;
import drachenbauer32.coloredflowerpotsmod.items.ColoredFlowerPotBlockItem;
import drachenbauer32.coloredflowerpotsmod.util.ColoredFlowerPotsItemGroup;
import drachenbauer32.coloredflowerpotsmod.util.PlantsForPotsHandler;
import drachenbauer32.coloredflowerpotsmod.util.Reference;
import drachenbauer32.coloredflowerpotsmod.util.RenderCutoutHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("deprecation")
@Mod(Reference.MOD_ID)
public class ColoredFlowerPots
{   
    public static final ItemGroup COLORED_FLOWERPOTS = new ColoredFlowerPotsItemGroup();
    
    public static Comparator<ItemStack> itemSorter;
    
    public ColoredFlowerPots() 
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        
        ColoredFlowerPotsItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ColoredFlowerPotsBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void setup(final FMLCommonSetupEvent event)
    {
        itemSorter = Comparator.comparing(stack -> ((ColoredFlowerPotBlockItem) stack.getItem()).color);
        
        DeferredWorkQueue.runLater(() ->
        {
            PlantsForPotsHandler.addPlantsToPots();
        }
        );
    }
    
    private void clientRegistries(final FMLClientSetupEvent event)
    {
        RenderCutoutHandler.renderCutoutPlantTextures();
    }
}
