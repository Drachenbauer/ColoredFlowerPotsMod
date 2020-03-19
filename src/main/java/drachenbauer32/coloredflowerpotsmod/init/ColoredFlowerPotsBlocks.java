package drachenbauer32.coloredflowerpotsmod.init;

import drachenbauer32.coloredflowerpotsmod.util.Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("unchecked")
public class ColoredFlowerPotsBlocks
{
    /*public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Reference.MOD_ID);
    
    private static final Supplier<Block> AIR_SUPPLIER = () -> Blocks.AIR;
    
    private static final Supplier<Block> ACACIA_SAPLING_SUPPLIER = () -> Blocks.ACACIA_SAPLING;
    private static final Supplier<Block> ALLIUM_SUPPLIER = () -> Blocks.ALLIUM;
    private static final Supplier<Block> AZURE_BLUET_SUPPLIER = () -> Blocks.AZURE_BLUET;
    private static final Supplier<Block> BAMBOO_SUPPLIER = () -> Blocks.BAMBOO;
    private static final Supplier<Block> BIRCH_SAPLING_SUPPLIER = () -> Blocks.BIRCH_SAPLING;
    private static final Supplier<Block> BLUE_ORCHID_SUPPLIER = () -> Blocks.BLUE_ORCHID;
    private static final Supplier<Block> BROWN_MUSHROOM_SUPPLIER = () -> Blocks.BROWN_MUSHROOM;
    private static final Supplier<Block> CACTUS_SUPPLIER = () -> Blocks.CACTUS;
    private static final Supplier<Block> CORNFLOWER_SUPPLIER = () -> Blocks.CORNFLOWER;
    private static final Supplier<Block> DANDELION_SUPPLIER = () -> Blocks.DANDELION;
    private static final Supplier<Block> DARK_OAK_SAPLING_SUPPLIER = () -> Blocks.DARK_OAK_SAPLING;
    private static final Supplier<Block> DEAD_BUSH_SUPPLIER = () -> Blocks.DEAD_BUSH;
    private static final Supplier<Block> FERN_SUPPLIER = () -> Blocks.FERN;
    private static final Supplier<Block> JUNGLE_SAPLING_SUPPLIER = () -> Blocks.JUNGLE_SAPLING;
    private static final Supplier<Block> LILY_OF_THE_VALLEY_SUPPLIER = () -> Blocks.LILY_OF_THE_VALLEY;
    private static final Supplier<Block> OAK_SAPLING_SUPPLIER = () -> Blocks.OAK_SAPLING;
    private static final Supplier<Block> ORANGE_TULIP_SUPPLIER = () -> Blocks.ORANGE_TULIP;
    private static final Supplier<Block> OXEYE_DAISY_SUPPLIER = () -> Blocks.OXEYE_DAISY;
    private static final Supplier<Block> PINK_TULIP_SUPPLIER = () -> Blocks.PINK_TULIP;
    private static final Supplier<Block> POPPY_SUPPLIER = () -> Blocks.POPPY;
    private static final Supplier<Block> RED_MUSHROOM_SUPPLIER = () -> Blocks.RED_MUSHROOM;
    private static final Supplier<Block> RED_TULIP_SUPPLIER = () -> Blocks.RED_TULIP;
    private static final Supplier<Block> SPRUCE_SAPLING_SUPPLIER = () -> Blocks.SPRUCE_SAPLING;
    private static final Supplier<Block> WHITE_TULIP_SUPPLIER = () -> Blocks.WHITE_TULIP;
    private static final Supplier<Block> WITHER_ROSE_SUPPLIER = () -> Blocks.WITHER_ROSE;
    
    public static final RegistryObject<FlowerPotBlock> BLACK_FLOWER_POT = BLOCKS.register("black_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_ACACIA_SAPLING = BLOCKS.register("black_potted_acacia_sapling", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_ALLIUM = BLOCKS.register("black_potted_allium", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_AZURE_BLUET = BLOCKS.register("black_potted_azure_bluet", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_BAMBOO = BLOCKS.register("black_potted_bamboo", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_BIRCH_SAPLING = BLOCKS.register("black_potted_birch_sapling", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_BLUE_ORCHID = BLOCKS.register("black_potted_blue_orchid", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_BROWN_MUSHROOM = BLOCKS.register("black_potted_brown_mushroom", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_CACTUS = BLOCKS.register("black_potted_cactus", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_CORNFLOWER = BLOCKS.register("black_potted_cornflower", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_DANDELION = BLOCKS.register("black_potted_dandelion", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_DARK_OAK_SAPLING = BLOCKS.register("black_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_DEAD_BUSH = BLOCKS.register("black_potted_dead_bush", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_FERN = BLOCKS.register("black_potted_fern", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_JUNGLE_SAPLING = BLOCKS.register("black_potted_jungle_sapling", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("black_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_OAK_SAPLING = BLOCKS.register("black_potted_oak_sapling", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_ORANGE_TULIP = BLOCKS.register("black_potted_orange_tulip", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_OXEYE_DAISY = BLOCKS.register("black_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_PINK_TULIP = BLOCKS.register("black_potted_pink_tulip", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_POPPY = BLOCKS.register("black_potted_poppy", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_RED_MUSHROOM = BLOCKS.register("black_potted_red_mushroom", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_RED_TULIP = BLOCKS.register("black_potted_red_tulip", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_SPRUCE_SAPLING = BLOCKS.register("black_potted_spruce_sapling", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_WHITE_TULIP = BLOCKS.register("black_potted_black_tulip", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLACK_POTTED_WITHER_ROSE = BLOCKS.register("black_potted_wither_rose", () -> new FlowerPotBlock(
                        BLACK_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> BLUE_FLOWER_POT = BLOCKS.register("blue_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_ACACIA_SAPLING = BLOCKS.register("blue_potted_acacia_sapling", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_ALLIUM = BLOCKS.register("blue_potted_allium", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_AZURE_BLUET = BLOCKS.register("blue_potted_azure_bluet", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_BAMBOO = BLOCKS.register("blue_potted_bamboo", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_BIRCH_SAPLING = BLOCKS.register("blue_potted_birch_sapling", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_BLUE_ORCHID = BLOCKS.register("blue_potted_blue_orchid", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_BROWN_MUSHROOM = BLOCKS.register("blue_potted_brown_mushroom", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_CACTUS = BLOCKS.register("blue_potted_cactus", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_CORNFLOWER = BLOCKS.register("blue_potted_cornflower", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_DANDELION = BLOCKS.register("blue_potted_dandelion", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_DARK_OAK_SAPLING = BLOCKS.register("blue_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_DEAD_BUSH = BLOCKS.register("blue_potted_dead_bush", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_FERN = BLOCKS.register("blue_potted_fern", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_JUNGLE_SAPLING = BLOCKS.register("blue_potted_jungle_sapling", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("blue_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_OAK_SAPLING = BLOCKS.register("blue_potted_oak_sapling", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_ORANGE_TULIP = BLOCKS.register("blue_potted_orange_tulip", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_OXEYE_DAISY = BLOCKS.register("blue_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_PINK_TULIP = BLOCKS.register("blue_potted_pink_tulip", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_POPPY = BLOCKS.register("blue_potted_poppy", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_RED_MUSHROOM = BLOCKS.register("blue_potted_red_mushroom", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_RED_TULIP = BLOCKS.register("blue_potted_red_tulip", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_SPRUCE_SAPLING = BLOCKS.register("blue_potted_spruce_sapling", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_WHITE_TULIP = BLOCKS.register("blue_potted_blue_tulip", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BLUE_POTTED_WITHER_ROSE = BLOCKS.register("blue_potted_wither_rose", () -> new FlowerPotBlock(
                        BLUE_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> BROWN_FLOWER_POT = BLOCKS.register("brown_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_ACACIA_SAPLING = BLOCKS.register("brown_potted_acacia_sapling", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_ALLIUM = BLOCKS.register("brown_potted_allium", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_AZURE_BLUET = BLOCKS.register("brown_potted_azure_bluet", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_BAMBOO = BLOCKS.register("brown_potted_bamboo", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_BIRCH_SAPLING = BLOCKS.register("brown_potted_birch_sapling", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_BLUE_ORCHID = BLOCKS.register("brown_potted_blue_orchid", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_BROWN_MUSHROOM = BLOCKS.register("brown_potted_brown_mushroom", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_CACTUS = BLOCKS.register("brown_potted_cactus", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_CORNFLOWER = BLOCKS.register("brown_potted_cornflower", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_DANDELION = BLOCKS.register("brown_potted_dandelion", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_DARK_OAK_SAPLING = BLOCKS.register("brown_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_DEAD_BUSH = BLOCKS.register("brown_potted_dead_bush", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_FERN = BLOCKS.register("brown_potted_fern", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_JUNGLE_SAPLING = BLOCKS.register("brown_potted_jungle_sapling", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("brown_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_OAK_SAPLING = BLOCKS.register("brown_potted_oak_sapling", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_ORANGE_TULIP = BLOCKS.register("brown_potted_orange_tulip", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_OXEYE_DAISY = BLOCKS.register("brown_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_PINK_TULIP = BLOCKS.register("brown_potted_pink_tulip", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_POPPY = BLOCKS.register("brown_potted_poppy", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_RED_MUSHROOM = BLOCKS.register("brown_potted_red_mushroom", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_RED_TULIP = BLOCKS.register("brown_potted_red_tulip", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_SPRUCE_SAPLING = BLOCKS.register("brown_potted_spruce_sapling", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_WHITE_TULIP = BLOCKS.register("brown_potted_brown_tulip", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> BROWN_POTTED_WITHER_ROSE = BLOCKS.register("brown_potted_wither_rose", () -> new FlowerPotBlock(
                        BROWN_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> CYAN_FLOWER_POT = BLOCKS.register("cyan_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_ACACIA_SAPLING = BLOCKS.register("cyan_potted_acacia_sapling", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_ALLIUM = BLOCKS.register("cyan_potted_allium", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_AZURE_BLUET = BLOCKS.register("cyan_potted_azure_bluet", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_BAMBOO = BLOCKS.register("cyan_potted_bamboo", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_BIRCH_SAPLING = BLOCKS.register("cyan_potted_birch_sapling", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_BLUE_ORCHID = BLOCKS.register("cyan_potted_blue_orchid", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_BROWN_MUSHROOM = BLOCKS.register("cyan_potted_brown_mushroom", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_CACTUS = BLOCKS.register("cyan_potted_cactus", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_CORNFLOWER = BLOCKS.register("cyan_potted_cornflower", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_DANDELION = BLOCKS.register("cyan_potted_dandelion", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_DARK_OAK_SAPLING = BLOCKS.register("cyan_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_DEAD_BUSH = BLOCKS.register("cyan_potted_dead_bush", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_FERN = BLOCKS.register("cyan_potted_fern", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_JUNGLE_SAPLING = BLOCKS.register("cyan_potted_jungle_sapling", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("cyan_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_OAK_SAPLING = BLOCKS.register("cyan_potted_oak_sapling", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_ORANGE_TULIP = BLOCKS.register("cyan_potted_orange_tulip", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_OXEYE_DAISY = BLOCKS.register("cyan_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_PINK_TULIP = BLOCKS.register("cyan_potted_pink_tulip", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_POPPY = BLOCKS.register("cyan_potted_poppy", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_RED_MUSHROOM = BLOCKS.register("cyan_potted_red_mushroom", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_RED_TULIP = BLOCKS.register("cyan_potted_red_tulip", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_SPRUCE_SAPLING = BLOCKS.register("cyan_potted_spruce_sapling", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_WHITE_TULIP = BLOCKS.register("cyan_potted_cyan_tulip", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> CYAN_POTTED_WITHER_ROSE = BLOCKS.register("cyan_potted_wither_rose", () -> new FlowerPotBlock(
                        CYAN_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> GRAY_FLOWER_POT = BLOCKS.register("gray_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_ACACIA_SAPLING = BLOCKS.register("gray_potted_acacia_sapling", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_ALLIUM = BLOCKS.register("gray_potted_allium", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_AZURE_BLUET = BLOCKS.register("gray_potted_azure_bluet", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_BAMBOO = BLOCKS.register("gray_potted_bamboo", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_BIRCH_SAPLING = BLOCKS.register("gray_potted_birch_sapling", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_BLUE_ORCHID = BLOCKS.register("gray_potted_blue_orchid", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_BROWN_MUSHROOM = BLOCKS.register("gray_potted_brown_mushroom", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_CACTUS = BLOCKS.register("gray_potted_cactus", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_CORNFLOWER = BLOCKS.register("gray_potted_cornflower", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_DANDELION = BLOCKS.register("gray_potted_dandelion", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_DARK_OAK_SAPLING = BLOCKS.register("gray_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_DEAD_BUSH = BLOCKS.register("gray_potted_dead_bush", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_FERN = BLOCKS.register("gray_potted_fern", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_JUNGLE_SAPLING = BLOCKS.register("gray_potted_jungle_sapling", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("gray_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_OAK_SAPLING = BLOCKS.register("gray_potted_oak_sapling", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_ORANGE_TULIP = BLOCKS.register("gray_potted_orange_tulip", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_OXEYE_DAISY = BLOCKS.register("gray_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_PINK_TULIP = BLOCKS.register("gray_potted_pink_tulip", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_POPPY = BLOCKS.register("gray_potted_poppy", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_RED_MUSHROOM = BLOCKS.register("gray_potted_red_mushroom", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_RED_TULIP = BLOCKS.register("gray_potted_red_tulip", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_SPRUCE_SAPLING = BLOCKS.register("gray_potted_spruce_sapling", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_WHITE_TULIP = BLOCKS.register("gray_potted_gray_tulip", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GRAY_POTTED_WITHER_ROSE = BLOCKS.register("gray_potted_wither_rose", () -> new FlowerPotBlock(
                        GRAY_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> GREEN_FLOWER_POT = BLOCKS.register("green_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_ACACIA_SAPLING = BLOCKS.register("green_potted_acacia_sapling", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_ALLIUM = BLOCKS.register("green_potted_allium", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_AZURE_BLUET = BLOCKS.register("green_potted_azure_bluet", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_BAMBOO = BLOCKS.register("green_potted_bamboo", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_BIRCH_SAPLING = BLOCKS.register("green_potted_birch_sapling", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_BLUE_ORCHID = BLOCKS.register("green_potted_blue_orchid", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_BROWN_MUSHROOM = BLOCKS.register("green_potted_brown_mushroom", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_CACTUS = BLOCKS.register("green_potted_cactus", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_CORNFLOWER = BLOCKS.register("green_potted_cornflower", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_DANDELION = BLOCKS.register("green_potted_dandelion", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_DARK_OAK_SAPLING = BLOCKS.register("green_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_DEAD_BUSH = BLOCKS.register("green_potted_dead_bush", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_FERN = BLOCKS.register("green_potted_fern", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_JUNGLE_SAPLING = BLOCKS.register("green_potted_jungle_sapling", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("green_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_OAK_SAPLING = BLOCKS.register("green_potted_oak_sapling", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_ORANGE_TULIP = BLOCKS.register("green_potted_orange_tulip", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_OXEYE_DAISY = BLOCKS.register("green_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_PINK_TULIP = BLOCKS.register("green_potted_pink_tulip", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_POPPY = BLOCKS.register("green_potted_poppy", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_RED_MUSHROOM = BLOCKS.register("green_potted_red_mushroom", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_RED_TULIP = BLOCKS.register("green_potted_red_tulip", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_SPRUCE_SAPLING = BLOCKS.register("green_potted_spruce_sapling", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_WHITE_TULIP = BLOCKS.register("green_potted_green_tulip", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> GREEN_POTTED_WITHER_ROSE = BLOCKS.register("green_potted_wither_rose", () -> new FlowerPotBlock(
                        GREEN_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_FLOWER_POT = BLOCKS.register("light_blue_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_ACACIA_SAPLING = BLOCKS.register("light_blue_potted_acacia_sapling", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_ALLIUM = BLOCKS.register("light_blue_potted_allium", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_AZURE_BLUET = BLOCKS.register("light_blue_potted_azure_bluet", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_BAMBOO = BLOCKS.register("light_blue_potted_bamboo", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_BIRCH_SAPLING = BLOCKS.register("light_blue_potted_birch_sapling", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_BLUE_ORCHID = BLOCKS.register("light_blue_potted_blue_orchid", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_BROWN_MUSHROOM = BLOCKS.register("light_blue_potted_brown_mushroom", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_CACTUS = BLOCKS.register("light_blue_potted_cactus", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_CORNFLOWER = BLOCKS.register("light_blue_potted_cornflower", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_DANDELION = BLOCKS.register("light_blue_potted_dandelion", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_DARK_OAK_SAPLING = BLOCKS.register("light_blue_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_DEAD_BUSH = BLOCKS.register("light_blue_potted_dead_bush", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_FERN = BLOCKS.register("light_blue_potted_fern", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_JUNGLE_SAPLING = BLOCKS.register("light_blue_potted_jungle_sapling", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("light_blue_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_OAK_SAPLING = BLOCKS.register("light_blue_potted_oak_sapling", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_ORANGE_TULIP = BLOCKS.register("light_blue_potted_orange_tulip", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_OXEYE_DAISY = BLOCKS.register("light_blue_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_PINK_TULIP = BLOCKS.register("light_blue_potted_pink_tulip", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_POPPY = BLOCKS.register("light_blue_potted_poppy", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_RED_MUSHROOM = BLOCKS.register("light_blue_potted_red_mushroom", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_RED_TULIP = BLOCKS.register("light_blue_potted_red_tulip", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_SPRUCE_SAPLING = BLOCKS.register("light_blue_potted_spruce_sapling", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_WHITE_TULIP = BLOCKS.register("light_blue_potted_light_blue_tulip", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_BLUE_POTTED_WITHER_ROSE = BLOCKS.register("light_blue_potted_wither_rose", () -> new FlowerPotBlock(
                        LIGHT_BLUE_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_FLOWER_POT = BLOCKS.register("light_gray_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_ACACIA_SAPLING = BLOCKS.register("light_gray_potted_acacia_sapling", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_ALLIUM = BLOCKS.register("light_gray_potted_allium", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_AZURE_BLUET = BLOCKS.register("light_gray_potted_azure_bluet", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_BAMBOO = BLOCKS.register("light_gray_potted_bamboo", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_BIRCH_SAPLING = BLOCKS.register("light_gray_potted_birch_sapling", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_BLUE_ORCHID = BLOCKS.register("light_gray_potted_blue_orchid", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_BROWN_MUSHROOM = BLOCKS.register("light_gray_potted_brown_mushroom", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_CACTUS = BLOCKS.register("light_gray_potted_cactus", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_CORNFLOWER = BLOCKS.register("light_gray_potted_cornflower", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_DANDELION = BLOCKS.register("light_gray_potted_dandelion", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_DARK_OAK_SAPLING = BLOCKS.register("light_gray_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_DEAD_BUSH = BLOCKS.register("light_gray_potted_dead_bush", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_FERN = BLOCKS.register("light_gray_potted_fern", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_JUNGLE_SAPLING = BLOCKS.register("light_gray_potted_jungle_sapling", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("light_gray_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_OAK_SAPLING = BLOCKS.register("light_gray_potted_oak_sapling", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_ORANGE_TULIP = BLOCKS.register("light_gray_potted_orange_tulip", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_OXEYE_DAISY = BLOCKS.register("light_gray_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_PINK_TULIP = BLOCKS.register("light_gray_potted_pink_tulip", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_POPPY = BLOCKS.register("light_gray_potted_poppy", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_RED_MUSHROOM = BLOCKS.register("light_gray_potted_red_mushroom", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_RED_TULIP = BLOCKS.register("light_gray_potted_red_tulip", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_SPRUCE_SAPLING = BLOCKS.register("light_gray_potted_spruce_sapling", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_WHITE_TULIP = BLOCKS.register("light_gray_potted_light_gray_tulip", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIGHT_GRAY_POTTED_WITHER_ROSE = BLOCKS.register("light_gray_potted_wither_rose", () -> new FlowerPotBlock(
                        LIGHT_GRAY_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> LIME_FLOWER_POT = BLOCKS.register("lime_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_ACACIA_SAPLING = BLOCKS.register("lime_potted_acacia_sapling", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_ALLIUM = BLOCKS.register("lime_potted_allium", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_AZURE_BLUET = BLOCKS.register("lime_potted_azure_bluet", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_BAMBOO = BLOCKS.register("lime_potted_bamboo", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_BIRCH_SAPLING = BLOCKS.register("lime_potted_birch_sapling", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_BLUE_ORCHID = BLOCKS.register("lime_potted_blue_orchid", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_BROWN_MUSHROOM = BLOCKS.register("lime_potted_brown_mushroom", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_CACTUS = BLOCKS.register("lime_potted_cactus", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_CORNFLOWER = BLOCKS.register("lime_potted_cornflower", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_DANDELION = BLOCKS.register("lime_potted_dandelion", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_DARK_OAK_SAPLING = BLOCKS.register("lime_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_DEAD_BUSH = BLOCKS.register("lime_potted_dead_bush", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_FERN = BLOCKS.register("lime_potted_fern", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_JUNGLE_SAPLING = BLOCKS.register("lime_potted_jungle_sapling", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("lime_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_OAK_SAPLING = BLOCKS.register("lime_potted_oak_sapling", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_ORANGE_TULIP = BLOCKS.register("lime_potted_orange_tulip", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_OXEYE_DAISY = BLOCKS.register("lime_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_PINK_TULIP = BLOCKS.register("lime_potted_pink_tulip", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_POPPY = BLOCKS.register("lime_potted_poppy", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_RED_MUSHROOM = BLOCKS.register("lime_potted_red_mushroom", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_RED_TULIP = BLOCKS.register("lime_potted_red_tulip", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_SPRUCE_SAPLING = BLOCKS.register("lime_potted_spruce_sapling", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_WHITE_TULIP = BLOCKS.register("lime_potted_lime_tulip", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> LIME_POTTED_WITHER_ROSE = BLOCKS.register("lime_potted_wither_rose", () -> new FlowerPotBlock(
                        LIME_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> MAGENTA_FLOWER_POT = BLOCKS.register("magenta_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_ACACIA_SAPLING = BLOCKS.register("magenta_potted_acacia_sapling", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_ALLIUM = BLOCKS.register("magenta_potted_allium", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_AZURE_BLUET = BLOCKS.register("magenta_potted_azure_bluet", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_BAMBOO = BLOCKS.register("magenta_potted_bamboo", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_BIRCH_SAPLING = BLOCKS.register("magenta_potted_birch_sapling", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_BLUE_ORCHID = BLOCKS.register("magenta_potted_blue_orchid", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_BROWN_MUSHROOM = BLOCKS.register("magenta_potted_brown_mushroom", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_CACTUS = BLOCKS.register("magenta_potted_cactus", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_CORNFLOWER = BLOCKS.register("magenta_potted_cornflower", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_DANDELION = BLOCKS.register("magenta_potted_dandelion", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_DARK_OAK_SAPLING = BLOCKS.register("magenta_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_DEAD_BUSH = BLOCKS.register("magenta_potted_dead_bush", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_FERN = BLOCKS.register("magenta_potted_fern", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_JUNGLE_SAPLING = BLOCKS.register("magenta_potted_jungle_sapling", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("magenta_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_OAK_SAPLING = BLOCKS.register("magenta_potted_oak_sapling", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_ORANGE_TULIP = BLOCKS.register("magenta_potted_orange_tulip", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_OXEYE_DAISY = BLOCKS.register("magenta_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_PINK_TULIP = BLOCKS.register("magenta_potted_pink_tulip", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_POPPY = BLOCKS.register("magenta_potted_poppy", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_RED_MUSHROOM = BLOCKS.register("magenta_potted_red_mushroom", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_RED_TULIP = BLOCKS.register("magenta_potted_red_tulip", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_SPRUCE_SAPLING = BLOCKS.register("magenta_potted_spruce_sapling", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_WHITE_TULIP = BLOCKS.register("magenta_potted_magenta_tulip", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> MAGENTA_POTTED_WITHER_ROSE = BLOCKS.register("magenta_potted_wither_rose", () -> new FlowerPotBlock(
                        MAGENTA_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> ORANGE_FLOWER_POT = BLOCKS.register("orange_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_ACACIA_SAPLING = BLOCKS.register("orange_potted_acacia_sapling", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_ALLIUM = BLOCKS.register("orange_potted_allium", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_AZURE_BLUET = BLOCKS.register("orange_potted_azure_bluet", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_BAMBOO = BLOCKS.register("orange_potted_bamboo", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_BIRCH_SAPLING = BLOCKS.register("orange_potted_birch_sapling", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_BLUE_ORCHID = BLOCKS.register("orange_potted_blue_orchid", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_BROWN_MUSHROOM = BLOCKS.register("orange_potted_brown_mushroom", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_CACTUS = BLOCKS.register("orange_potted_cactus", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_CORNFLOWER = BLOCKS.register("orange_potted_cornflower", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_DANDELION = BLOCKS.register("orange_potted_dandelion", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_DARK_OAK_SAPLING = BLOCKS.register("orange_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_DEAD_BUSH = BLOCKS.register("orange_potted_dead_bush", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_FERN = BLOCKS.register("orange_potted_fern", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_JUNGLE_SAPLING = BLOCKS.register("orange_potted_jungle_sapling", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("orange_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_OAK_SAPLING = BLOCKS.register("orange_potted_oak_sapling", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_ORANGE_TULIP = BLOCKS.register("orange_potted_orange_tulip", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_OXEYE_DAISY = BLOCKS.register("orange_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_PINK_TULIP = BLOCKS.register("orange_potted_pink_tulip", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_POPPY = BLOCKS.register("orange_potted_poppy", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_RED_MUSHROOM = BLOCKS.register("orange_potted_red_mushroom", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_RED_TULIP = BLOCKS.register("orange_potted_red_tulip", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_SPRUCE_SAPLING = BLOCKS.register("orange_potted_spruce_sapling", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_WHITE_TULIP = BLOCKS.register("orange_potted_orange_tulip", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> ORANGE_POTTED_WITHER_ROSE = BLOCKS.register("orange_potted_wither_rose", () -> new FlowerPotBlock(
                        ORANGE_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> PINK_FLOWER_POT = BLOCKS.register("pink_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_ACACIA_SAPLING = BLOCKS.register("pink_potted_acacia_sapling", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_ALLIUM = BLOCKS.register("pink_potted_allium", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_AZURE_BLUET = BLOCKS.register("pink_potted_azure_bluet", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_BAMBOO = BLOCKS.register("pink_potted_bamboo", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_BIRCH_SAPLING = BLOCKS.register("pink_potted_birch_sapling", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_BLUE_ORCHID = BLOCKS.register("pink_potted_blue_orchid", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_BROWN_MUSHROOM = BLOCKS.register("pink_potted_brown_mushroom", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_CACTUS = BLOCKS.register("pink_potted_cactus", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_CORNFLOWER = BLOCKS.register("pink_potted_cornflower", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_DANDELION = BLOCKS.register("pink_potted_dandelion", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_DARK_OAK_SAPLING = BLOCKS.register("pink_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_DEAD_BUSH = BLOCKS.register("pink_potted_dead_bush", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_FERN = BLOCKS.register("pink_potted_fern", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_JUNGLE_SAPLING = BLOCKS.register("pink_potted_jungle_sapling", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("pink_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_OAK_SAPLING = BLOCKS.register("pink_potted_oak_sapling", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_ORANGE_TULIP = BLOCKS.register("pink_potted_orange_tulip", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_OXEYE_DAISY = BLOCKS.register("pink_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_PINK_TULIP = BLOCKS.register("pink_potted_pink_tulip", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_POPPY = BLOCKS.register("pink_potted_poppy", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_RED_MUSHROOM = BLOCKS.register("pink_potted_red_mushroom", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_RED_TULIP = BLOCKS.register("pink_potted_red_tulip", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_SPRUCE_SAPLING = BLOCKS.register("pink_potted_spruce_sapling", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_WHITE_TULIP = BLOCKS.register("pink_potted_pink_tulip", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PINK_POTTED_WITHER_ROSE = BLOCKS.register("pink_potted_wither_rose", () -> new FlowerPotBlock(
                        PINK_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> PURPLE_FLOWER_POT = BLOCKS.register("purple_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_ACACIA_SAPLING = BLOCKS.register("purple_potted_acacia_sapling", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_ALLIUM = BLOCKS.register("purple_potted_allium", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_AZURE_BLUET = BLOCKS.register("purple_potted_azure_bluet", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_BAMBOO = BLOCKS.register("purple_potted_bamboo", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_BIRCH_SAPLING = BLOCKS.register("purple_potted_birch_sapling", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_BLUE_ORCHID = BLOCKS.register("purple_potted_blue_orchid", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_BROWN_MUSHROOM = BLOCKS.register("purple_potted_brown_mushroom", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_CACTUS = BLOCKS.register("purple_potted_cactus", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_CORNFLOWER = BLOCKS.register("purple_potted_cornflower", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_DANDELION = BLOCKS.register("purple_potted_dandelion", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_DARK_OAK_SAPLING = BLOCKS.register("purple_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_DEAD_BUSH = BLOCKS.register("purple_potted_dead_bush", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_FERN = BLOCKS.register("purple_potted_fern", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_JUNGLE_SAPLING = BLOCKS.register("purple_potted_jungle_sapling", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("purple_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_OAK_SAPLING = BLOCKS.register("purple_potted_oak_sapling", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_ORANGE_TULIP = BLOCKS.register("purple_potted_orange_tulip", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_OXEYE_DAISY = BLOCKS.register("purple_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_PINK_TULIP = BLOCKS.register("purple_potted_pink_tulip", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_POPPY = BLOCKS.register("purple_potted_poppy", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_RED_MUSHROOM = BLOCKS.register("purple_potted_red_mushroom", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_RED_TULIP = BLOCKS.register("purple_potted_red_tulip", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_SPRUCE_SAPLING = BLOCKS.register("purple_potted_spruce_sapling", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_WHITE_TULIP = BLOCKS.register("purple_potted_purple_tulip", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> PURPLE_POTTED_WITHER_ROSE = BLOCKS.register("purple_potted_wither_rose", () -> new FlowerPotBlock(
                        PURPLE_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> RED_FLOWER_POT = BLOCKS.register("red_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_ACACIA_SAPLING = BLOCKS.register("red_potted_acacia_sapling", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_ALLIUM = BLOCKS.register("red_potted_allium", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_AZURE_BLUET = BLOCKS.register("red_potted_azure_bluet", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_BAMBOO = BLOCKS.register("red_potted_bamboo", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_BIRCH_SAPLING = BLOCKS.register("red_potted_birch_sapling", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_BLUE_ORCHID = BLOCKS.register("red_potted_blue_orchid", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_BROWN_MUSHROOM = BLOCKS.register("red_potted_brown_mushroom", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_CACTUS = BLOCKS.register("red_potted_cactus", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_CORNFLOWER = BLOCKS.register("red_potted_cornflower", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_DANDELION = BLOCKS.register("red_potted_dandelion", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_DARK_OAK_SAPLING = BLOCKS.register("red_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_DEAD_BUSH = BLOCKS.register("red_potted_dead_bush", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_FERN = BLOCKS.register("red_potted_fern", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_JUNGLE_SAPLING = BLOCKS.register("red_potted_jungle_sapling", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("red_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_OAK_SAPLING = BLOCKS.register("red_potted_oak_sapling", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_ORANGE_TULIP = BLOCKS.register("red_potted_orange_tulip", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_OXEYE_DAISY = BLOCKS.register("red_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_PINK_TULIP = BLOCKS.register("red_potted_pink_tulip", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_POPPY = BLOCKS.register("red_potted_poppy", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_RED_MUSHROOM = BLOCKS.register("red_potted_red_mushroom", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_RED_TULIP = BLOCKS.register("red_potted_red_tulip", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_SPRUCE_SAPLING = BLOCKS.register("red_potted_spruce_sapling", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_WHITE_TULIP = BLOCKS.register("red_potted_red_tulip", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> RED_POTTED_WITHER_ROSE = BLOCKS.register("red_potted_wither_rose", () -> new FlowerPotBlock(
                        RED_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> WHITE_FLOWER_POT = BLOCKS.register("white_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_ACACIA_SAPLING = BLOCKS.register("white_potted_acacia_sapling", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_ALLIUM = BLOCKS.register("white_potted_allium", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_AZURE_BLUET = BLOCKS.register("white_potted_azure_bluet", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_BAMBOO = BLOCKS.register("white_potted_bamboo", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_BIRCH_SAPLING = BLOCKS.register("white_potted_birch_sapling", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_BLUE_ORCHID = BLOCKS.register("white_potted_blue_orchid", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_BROWN_MUSHROOM = BLOCKS.register("white_potted_brown_mushroom", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_CACTUS = BLOCKS.register("white_potted_cactus", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_CORNFLOWER = BLOCKS.register("white_potted_cornflower", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_DANDELION = BLOCKS.register("white_potted_dandelion", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_DARK_OAK_SAPLING = BLOCKS.register("white_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_DEAD_BUSH = BLOCKS.register("white_potted_dead_bush", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_FERN = BLOCKS.register("white_potted_fern", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_JUNGLE_SAPLING = BLOCKS.register("white_potted_jungle_sapling", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("white_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_OAK_SAPLING = BLOCKS.register("white_potted_oak_sapling", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_ORANGE_TULIP = BLOCKS.register("white_potted_orange_tulip", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_OXEYE_DAISY = BLOCKS.register("white_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_PINK_TULIP = BLOCKS.register("white_potted_pink_tulip", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_POPPY = BLOCKS.register("white_potted_poppy", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_RED_MUSHROOM = BLOCKS.register("white_potted_red_mushroom", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_RED_TULIP = BLOCKS.register("white_potted_red_tulip", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_SPRUCE_SAPLING = BLOCKS.register("white_potted_spruce_sapling", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_WHITE_TULIP = BLOCKS.register("white_potted_white_tulip", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> WHITE_POTTED_WITHER_ROSE = BLOCKS.register("white_potted_wither_rose", () -> new FlowerPotBlock(
                        WHITE_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                        
    public static final RegistryObject<FlowerPotBlock> YELLOW_FLOWER_POT = BLOCKS.register("yellow_flower_pot", () -> new FlowerPotBlock(
                        null, AIR_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_ACACIA_SAPLING = BLOCKS.register("yellow_potted_acacia_sapling", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, ACACIA_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_ALLIUM = BLOCKS.register("yellow_potted_allium", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, ALLIUM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_AZURE_BLUET = BLOCKS.register("yellow_potted_azure_bluet", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, AZURE_BLUET_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_BAMBOO = BLOCKS.register("yellow_potted_bamboo", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, BAMBOO_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_BIRCH_SAPLING = BLOCKS.register("yellow_potted_birch_sapling", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, BIRCH_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_BLUE_ORCHID = BLOCKS.register("yellow_potted_blue_orchid", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, BLUE_ORCHID_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_BROWN_MUSHROOM = BLOCKS.register("yellow_potted_brown_mushroom", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, BROWN_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_CACTUS = BLOCKS.register("yellow_potted_cactus", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, CACTUS_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_CORNFLOWER = BLOCKS.register("yellow_potted_cornflower", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, CORNFLOWER_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_DANDELION = BLOCKS.register("yellow_potted_dandelion", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, DANDELION_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_DARK_OAK_SAPLING = BLOCKS.register("yellow_potted_dark_oak_sapling", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, DARK_OAK_SAPLING_SUPPLIER,Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_DEAD_BUSH = BLOCKS.register("yellow_potted_dead_bush", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, DEAD_BUSH_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_FERN = BLOCKS.register("yellow_potted_fern", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, FERN_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_JUNGLE_SAPLING = BLOCKS.register("yellow_potted_jungle_sapling", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, JUNGLE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_LILY_OF_THE_VALLEY = BLOCKS.register("yellow_potted_lily_of_the_valley", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, LILY_OF_THE_VALLEY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_OAK_SAPLING = BLOCKS.register("yellow_potted_oak_sapling", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, OAK_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_ORANGE_TULIP = BLOCKS.register("yellow_potted_orange_tulip", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, ORANGE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_OXEYE_DAISY = BLOCKS.register("yellow_potted_oxeye_daisy", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, OXEYE_DAISY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_PINK_TULIP = BLOCKS.register("yellow_potted_pink_tulip", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, PINK_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_POPPY = BLOCKS.register("yellow_potted_poppy", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, POPPY_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_RED_MUSHROOM = BLOCKS.register("yellow_potted_red_mushroom", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, RED_MUSHROOM_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_RED_TULIP = BLOCKS.register("yellow_potted_red_tulip", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, RED_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_SPRUCE_SAPLING = BLOCKS.register("yellow_potted_spruce_sapling", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, SPRUCE_SAPLING_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_WHITE_TULIP = BLOCKS.register("yellow_potted_yellow_tulip", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, WHITE_TULIP_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
    public static final RegistryObject<FlowerPotBlock> YELLOW_POTTED_WITHER_ROSE = BLOCKS.register("yellow_potted_wither_rose", () -> new FlowerPotBlock(
                        YELLOW_FLOWER_POT, WITHER_ROSE_SUPPLIER, Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));*/
    
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Reference.MOD_ID);
    
    private static final Supplier<Block> AIR_SUPPLIER = () -> Blocks.AIR;
    
    public static final ArrayList<String> COLORS = new ArrayList<String>(Arrays.asList("black",
                                                                                       "blue",
                                                                                       "brown",
                                                                                       "cyan",
                                                                                       "gray",
                                                                                       "green",
                                                                                       "light_blue",
                                                                                       "light_gray",
                                                                                       "lime",
                                                                                       "magenta",
                                                                                       "orange",
                                                                                       "pink",
                                                                                       "purple",
                                                                                       "red",
                                                                                       "white",
                                                                                       "yellow"));
    
    public static final ArrayList<Supplier<Block>> PLANT_SUPPLIERS = new ArrayList<Supplier<Block>>(Arrays.asList(() -> Blocks.ACACIA_SAPLING,
                                                                                                                  () -> Blocks.ALLIUM,
                                                                                                                  () -> Blocks.AZURE_BLUET,
                                                                                                                  () -> Blocks.BAMBOO,
                                                                                                                  () -> Blocks.BIRCH_SAPLING,
                                                                                                                  () -> Blocks.BLUE_ORCHID,
                                                                                                                  () -> Blocks.BROWN_MUSHROOM,
                                                                                                                  () -> Blocks.CACTUS,
                                                                                                                  () -> Blocks.CORNFLOWER,
                                                                                                                  () -> Blocks.DANDELION,
                                                                                                                  () -> Blocks.DARK_OAK_SAPLING,
                                                                                                                  () -> Blocks.DEAD_BUSH,
                                                                                                                  () -> Blocks.FERN,
                                                                                                                  () -> Blocks.JUNGLE_SAPLING,
                                                                                                                  () -> Blocks.LILY_OF_THE_VALLEY,
                                                                                                                  () -> Blocks.OAK_SAPLING,
                                                                                                                  () -> Blocks.ORANGE_TULIP,
                                                                                                                  () -> Blocks.OXEYE_DAISY,
                                                                                                                  () -> Blocks.PINK_TULIP,
                                                                                                                  () -> Blocks.POPPY,
                                                                                                                  () -> Blocks.RED_MUSHROOM,
                                                                                                                  () -> Blocks.RED_TULIP,
                                                                                                                  () -> Blocks.SPRUCE_SAPLING,
                                                                                                                  () -> Blocks.WHITE_TULIP,
                                                                                                                  () -> Blocks.WITHER_ROSE));
    
    public static final RegistryObject<FlowerPotBlock>[] EMPTY_FLOWER_POTS = new RegistryObject[COLORS.size() + 1];
    public static final RegistryObject<FlowerPotBlock>[] FULL_FLOWER_POTS = new RegistryObject[COLORS.size() * PLANT_SUPPLIERS.size() + 1];
    
    private static int i;
    private static int j;
    
    static
    {
        i = 0;
        
        for(String color : COLORS)
        {
            EMPTY_FLOWER_POTS[i] = BLOCKS.register(color + "_flower_pot", () -> new FlowerPotBlock(null, AIR_SUPPLIER,
                                   Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
            
            j = 0;
            
            for(Supplier<Block> plant_supplier : PLANT_SUPPLIERS)
            {
                String plant = plant_supplier.get().getRegistryName().getPath();
                
                FULL_FLOWER_POTS[j] = BLOCKS.register(color + "_potted_" + plant, () -> new FlowerPotBlock(EMPTY_FLOWER_POTS[i], plant_supplier,
                                      Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0f).notSolid()));
                
                j++;
            }
            
            i++;
        }
    }
}
