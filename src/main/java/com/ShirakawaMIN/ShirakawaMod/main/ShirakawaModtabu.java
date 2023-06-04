package com.ShirakawaMIN.ShirakawaMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ShirakawaModtabu extends CreativeModeTab {
    public ShirakawaModtabu() {
        super("shirakawamod_tabu");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.DIAMOND);
    }
}
