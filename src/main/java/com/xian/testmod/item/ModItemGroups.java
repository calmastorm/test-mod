package com.xian.testmod.item;

import com.xian.testmod.TestMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(id));
    public static final RegistryKey<ItemGroup> LIMBUSIUM_GROUP = register("limbusium_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TestMod.MOD_ID, id));
    }
    public static void registerModGroups(){
        Registry.register(Registries.ITEM_GROUP, LIMBUSIUM_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, -1)
                        .displayName(Text.translatable("itemGroup.limbusium_group"))
                        .icon(() -> new ItemStack(ModItems.LIMBUSIUM_INGOT))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.LIMBUSIUM_INGOT);
                        }).build());
        TestMod.LOGGER.info("Registering Item Group");
    }
}

