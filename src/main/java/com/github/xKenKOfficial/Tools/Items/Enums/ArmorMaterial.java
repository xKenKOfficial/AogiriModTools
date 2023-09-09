package com.github.xKenKOfficial.Tools.Items.Enums;

import com.github.xKenKOfficial.Tools.Items.Inits.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.function.Supplier;

public enum ArmorMaterial implements IArmorMaterial
{
    RUBY_HELMET("ruby", 350, new int[] { 4, 7, 9, 4 }, 17, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.of(ItemInit.RUBY_ITEM.get())),
    RUBY_CHESTPLATE("ruby", 450, new int[] { 4, 7, 9, 4 }, 17, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.of(ItemInit.RUBY_ITEM.get())),
    RUBY_LEGGINGS("ruby", 250, new int[] { 4, 7, 9, 4 }, 17, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.of(ItemInit.RUBY_ITEM.get())),
    RUBY_BOOTS("ruby", 150, new int[] { 4, 7, 9, 4 }, 17, SoundEvents.ARMOR_EQUIP_GENERIC, 4f, 0.2f, () -> Ingredient.of(ItemInit.RUBY_ITEM.get()));

    private static int[] baseDurability = { 128, 144, 160, 112 };
    private final String name;
    private final int durabilityMultipler;
    private final int[] armorVal;
    private final int enchantablity;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Ingredient repairIngredient;

    ArmorMaterial(String name, int durabilityMultipler, int[] armorVal, int enchantablity, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultipler = durabilityMultipler;
        this.armorVal = armorVal;
        this.enchantablity = enchantablity;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient.get();
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return baseDurability[slot.getIndex()] = this.durabilityMultipler;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType defense) {
        return armorVal[defense.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantablity;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
