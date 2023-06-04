package com.ShirakawaMIN.ShirakawaMod.main.regi;

import com.ShirakawaMIN.ShirakawaMod.main.ShirakawaMod;
import com.ShirakawaMIN.ShirakawaMod.main.item.Itemsulfur;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ShirakawaMod.MOD_ID)
public class ShirakawaModItems {

    public static final Itemsulfur ITEMSULFUR = new Itemsulfur();

    @Mod.EventBusSubscriber(modid = ShirakawaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                    ITEMSULFUR
            );
        }
    }
}