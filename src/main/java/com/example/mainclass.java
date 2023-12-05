package com.yourmodname;

import com.example.items.drill;
import com.example.tools.deathstone;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class YourMod implements ModInitializer {

    public static final ToolMaterial CUSTOM_TOOL_MATERIAL = new CustomToolMaterial();
    public static final Item CUSTOM_PICKAXE = new CustomPickaxe(CUSTOM_TOOL_MATERIAL, 0, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));

    @Override
    public void onInitialize() {
        // Register the custom pickaxe
        Registry.register(Registry.ITEM, new Identifier("", "custom_pickaxe"), CUSTOM_PICKAXE);
    }
}
