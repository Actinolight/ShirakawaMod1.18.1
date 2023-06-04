package com.ShirakawaMIN.ShirakawaMod.main.item;

import com.ShirakawaMIN.ShirakawaMod.main.ShirakawaMod;
import com.ShirakawaMIN.ShirakawaMod.main.ShirakawaModtabu;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class Itemsulfur extends Item {

    public Itemsulfur() {
        super(new Properties().tab(ShirakawaMod.SHIRAKAWAMOD_TAB));
        this.setRegistryName("sulfur");
    }
}
