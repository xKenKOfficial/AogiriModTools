package com.github.xKenKOfficial.Tools.Items.Enums;

import com.github.xKenKOfficial.Tools.Items.Inits.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ToolMaterial implements IItemTier
{
    RUBY_SWORD(4, 350, 15f, 2f, 17, () -> Ingredient.of(ItemInit.RUBY_ITEM.get())),
    RUBY_PICKAXE(4, 350, 15f, 0.1f, 17, () -> Ingredient.of(ItemInit.RUBY_ITEM.get())),
    RUBY_AXE(4, 350, 10f, 0.2f, 17, () -> Ingredient.of(ItemInit.RUBY_ITEM.get())),
    RUBY_SHOVEL(4, 350, 12f, 0.1f, 17, () -> Ingredient.of(ItemInit.RUBY_ITEM.get())),
    RUBY_HOE(4, 350, 9f, 0.1f, 17, () -> Ingredient.of(ItemInit.RUBY_ITEM.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    ToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial.get();
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial;
    }
}
