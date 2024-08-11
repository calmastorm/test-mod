package com.xian.testmod.item;

import com.xian.testmod.TestMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item LIMBUSIUM_INGOT = registerItems("limbusium_ingot", new Item(new Item.Settings()));
    /* This is for registering new item, add them to the game */
    private static Item registerItems(String id, Item item){
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TestMod.MOD_ID, id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, id), item);

    }
    private static void addItemToItemGroupEntries(FabricItemGroupEntries fabricGroupEntries){
        fabricGroupEntries.add(LIMBUSIUM_INGOT);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroupEntries);
        TestMod.LOGGER.info("Registering Items");
    }
}
