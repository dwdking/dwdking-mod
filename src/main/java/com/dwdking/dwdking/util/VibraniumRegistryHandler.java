package com.dwdking.dwdking.util;

import com.dwdking.dwdking.DWDKingMod;
import com.dwdking.dwdking.blocks.BlockItemBase;
import com.dwdking.dwdking.blocks.VibraniumBlock;
import com.dwdking.dwdking.items.ItemBase;
import com.dwdking.dwdking.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.dwdking.dwdking.DWDKingMod.MOD_ID;

public class VibraniumRegistryHandler {

    private static final String BLOCK_ID = "_block";

    private static final String SWORD_ID = "_sword";

    private static final String VIBRANIUM_ID = "vibranium";

    private static final String VIBRANIUM_BLOCK_ID = VIBRANIUM_ID + BLOCK_ID;

    private static final String VIBRANIUM_SWORD_ID = VIBRANIUM_ID + SWORD_ID;

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

}
