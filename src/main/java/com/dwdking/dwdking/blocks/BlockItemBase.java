package com.dwdking.dwdking.blocks;

import com.dwdking.dwdking.DWDKingMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(DWDKingMod.VIBRANIUM_TAB));
    }

}
