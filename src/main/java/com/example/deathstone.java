package com.example.tools;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CustomToolMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 2000; // Adjust as needed
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 500.0F; // Adjust as needed
    }

    @Override
    public float getAttackDamage() {
        return 3.0F; // Adjust as needed
    }

    @Override
    public int getMiningLevel() {
        return 5; // Adjust as needed
    }

    @Override
    public int getEnchantability() {
        return 33; // Adjust as needed
    }

    @Override
    public Ingredient getRepairIngredient() {
        // Ingredient for repairing the tool, e.g., Ingredient.ofItems(Items.IRON_INGOT)
        return Ingredient.ofItems(/* repair item */);
    }
}
