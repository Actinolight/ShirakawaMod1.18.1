package com.ShirakawaMIN.ShirakawaMod.main.regi;

import com.ShirakawaMIN.ShirakawaMod.main.ShirakawaMod;
import com.ShirakawaMIN.ShirakawaMod.main.item.Itemsulfur;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ShirakawaMod.MOD_ID)
public class ShirakawaMod_items {

public static final Itemsulfur ITEMSULFUR = new Itemsulfur();
    @Mod.EventBusSubscriber(modid = ShirakawaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class register{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] items = {
                    ITEMSULFUR
            };
            event.getRegistry().registerAll(Items);
        }
    }

}