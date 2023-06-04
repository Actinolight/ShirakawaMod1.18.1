package com.ShirakawaMIN.ShirakawaMod.main.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class Itemsulfur extends Item {
    public Itemsulfur() {
        super(new Properties().tab(CreativeModeTab.TAB_SEARCH));
        this.setRegistryName("sulfur");
    }
}
