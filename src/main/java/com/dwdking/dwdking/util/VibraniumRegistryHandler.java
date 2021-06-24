package com.dwdking.dwdking.util;

import com.dwdking.dwdking.DWDKingMod;
import com.dwdking.dwdking.blocks.BlockItemBase;
import com.dwdking.dwdking.blocks.VibraniumBlock;
import com.dwdking.dwdking.items.ItemBase;
import com.dwdking.dwdking.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.dwdking.dwdking.DWDKingMod.MOD_ID;

public class VibraniumRegistryHandler {

    private static final String VIBRANIUM_ID = "vibranium";

    private static final String VIBRANIUM_BLOCK_ID = VIBRANIUM_ID + RegistryHelper.BLOCK_ID;

    private static final String VIBRANIUM_SWORD_ID = VIBRANIUM_ID + RegistryHelper.SWORD_ID;

    private static final String VIBRANIUM_AXE_ID = VIBRANIUM_ID + RegistryHelper.AXE_ID;

    private static final String VIBRANIUM_PICKAXE_ID = VIBRANIUM_ID + RegistryHelper.PICKAXE_ID;

    private static final String VIBRANIUM_SHOVEL_ID = VIBRANIUM_ID + RegistryHelper.SHOVEL_ID;

    private static final String VIBRANIUM_HOE_ID = VIBRANIUM_ID + RegistryHelper.HOE_ID;

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> VIBRANIUM = ITEMS.register(VIBRANIUM_ID, ItemBase::new);

    public static final RegistryObject<Block> VIBRANIUM_BLOCK = BLOCKS.register(VIBRANIUM_BLOCK_ID, VibraniumBlock::new);

    public static final RegistryObject<Item> VIBRANIUM_BLOCK_ITEM = ITEMS.register(VIBRANIUM_BLOCK_ID, () -> new BlockItemBase(VIBRANIUM_BLOCK.get()));

    public static final RegistryObject<SwordItem> VIBRANIUM_SWORD = ITEMS.register(VIBRANIUM_SWORD_ID,
            () -> new SwordItem(ModItemTier.VIBRANIUM, 99, -2.4F, new Item.Properties().group(DWDKingMod.VIBRANIUM_TAB)));

    public static final RegistryObject<AxeItem> VIBRANIUM_AXE = ITEMS.register(VIBRANIUM_AXE_ID,
            () -> new AxeItem(ModItemTier.VIBRANIUM, 99, -2.4F, new Item.Properties().group(DWDKingMod.VIBRANIUM_TAB)));

    public static final RegistryObject<PickaxeItem> VIBRANIUM_PICKAXE = ITEMS.register(VIBRANIUM_PICKAXE_ID,
            () -> new PickaxeItem(ModItemTier.VIBRANIUM, 99, -2.4F, new Item.Properties().group(DWDKingMod.VIBRANIUM_TAB)));

    public static final RegistryObject<ShovelItem> VIBRANIUM_SHOVEL = ITEMS.register(VIBRANIUM_SHOVEL_ID,
            () -> new ShovelItem(ModItemTier.VIBRANIUM, 99, -2.4F, new Item.Properties().group(DWDKingMod.VIBRANIUM_TAB)));

    public static final RegistryObject<HoeItem> VIBRANIUM_HOE = ITEMS.register(VIBRANIUM_HOE_ID,
            () -> new HoeItem(ModItemTier.VIBRANIUM, 99, -2.4F, new Item.Properties().group(DWDKingMod.VIBRANIUM_TAB)));

}
