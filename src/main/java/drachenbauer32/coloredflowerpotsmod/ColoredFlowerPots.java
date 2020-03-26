package drachenbauer32.coloredflowerpotsmod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import com.google.common.collect.Ordering;

import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsBlocks;
import drachenbauer32.coloredflowerpotsmod.init.ColoredFlowerPotsItems;
import drachenbauer32.coloredflowerpotsmod.util.ColoredFlowerPotsItemGroup;
import drachenbauer32.coloredflowerpotsmod.util.PlantsForPotsHandler;
import drachenbauer32.coloredflowerpotsmod.util.Reference;
import drachenbauer32.coloredflowerpotsmod.util.RenderCutoutHandler;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
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
        String[] colors = {"red",
                           "orange",
                           "yellow",
                           "lime",
                           "cyan",
                           "blue",
                           "purple",
                           "magenta",
                           "pink",
                           "light_blue",
                           "green",
                           "brown",
                           "black",
                           "gray",
                           "light_gray",
                           "white"};
        
        List<Item> items = new ArrayList<Item>();
        
        for (String color : colors)
        {
            for (RegistryObject<BlockItem> flower_pot : ColoredFlowerPotsItems.EMPTY_FLOWER_POTS)
            {
                if (flower_pot.getId().getPath().startsWith(color))
                {
                    items.add(flower_pot.get());
                }
            }
        }
        
        /*List<Item> items = Arrays.asList(ColoredFlowerPotsItems.RED_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.ORANGE_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.YELLOW_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.LIME_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.CYAN_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.BLUE_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.PURPLE_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.MAGENTA_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.PINK_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.LIGHT_BLUE_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.GREEN_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.BROWN_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.BLACK_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.GRAY_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.LIGHT_GRAY_FLOWER_POT.get(),
                                         ColoredFlowerPotsItems.WHITE_FLOWER_POT.get());*/
        
        itemSorter = Ordering.explicit(items).onResultOf(ItemStack::getItem);
        
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
