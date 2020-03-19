package drachenbauer32.coloredflowerpotsmod.init;

import drachenbauer32.coloredflowerpotsmod.ColoredFlowerPots;
import drachenbauer32.coloredflowerpotsmod.util.Reference;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ColoredFlowerPotsItems
{
    /*public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
    
    public static final RegistryObject<BlockItem> BLACK_FLOWER_POT = ITEMS.register("black_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.BLACK_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> BLUE_FLOWER_POT = ITEMS.register("blue_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.BLUE_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> BROWN_FLOWER_POT = ITEMS.register("brown_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.BROWN_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> CYAN_FLOWER_POT = ITEMS.register("cyan_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.CYAN_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> GRAY_FLOWER_POT = ITEMS.register("gray_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.GRAY_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> GREEN_FLOWER_POT = ITEMS.register("green_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.GREEN_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> LIGHT_BLUE_FLOWER_POT = ITEMS.register("light_blue_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.LIGHT_BLUE_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> LIGHT_GRAY_FLOWER_POT = ITEMS.register("light_gray_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.LIGHT_GRAY_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> LIME_FLOWER_POT = ITEMS.register("lime_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.LIME_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> MAGENTA_FLOWER_POT = ITEMS.register("magenta_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.MAGENTA_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> ORANGE_FLOWER_POT = ITEMS.register("orange_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.ORANGE_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> PINK_FLOWER_POT = ITEMS.register("pink_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.PINK_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> PURPLE_FLOWER_POT = ITEMS.register("purple_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.PURPLE_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> RED_FLOWER_POT = ITEMS.register("red_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.RED_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> WHITE_FLOWER_POT = ITEMS.register("white_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.WHITE_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
    public static final RegistryObject<BlockItem> YELLOW_FLOWER_POT = ITEMS.register("yellow_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.YELLOW_FLOWER_POT.get(),
                        new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));*/
    
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);
    
    //public static final ArrayList<RegistryObject<BlockItem>> EMPTY_FLOWER_POT_REGISTRIES = new ArrayList<RegistryObject<BlockItem>>();
    
    @SuppressWarnings("unchecked")
    public static final RegistryObject<BlockItem>[] EMPTY_FLOWER_POTS = new RegistryObject[ColoredFlowerPotsBlocks.COLORS.size() + 1];
    
    private static int i;
    
    static
    {
        i = 0;
        
        for (String color : ColoredFlowerPotsBlocks.COLORS)
        {
            EMPTY_FLOWER_POTS[i] = ITEMS.register(color + "_flower_pot", () -> new BlockItem(ColoredFlowerPotsBlocks.EMPTY_FLOWER_POTS[i].get(),
                                   new Item.Properties().defaultMaxDamage(0).group(ColoredFlowerPots.COLORED_FLOWERPOTS).maxStackSize(64).rarity(Rarity.COMMON).setNoRepair()));
            
            i++;
        }
    }
}
