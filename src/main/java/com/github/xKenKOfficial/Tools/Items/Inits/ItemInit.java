package com.github.xKenKOfficial.Tools.Items.Inits;

import com.github.xKenKOfficial.Tools.Basic.Main;
import com.github.xKenKOfficial.Tools.Items.Enums.ArmorMaterial;
import com.github.xKenKOfficial.Tools.Items.Enums.ToolMaterial;
import com.github.xKenKOfficial.Tools.Items.Groups.ModGroup;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final RegistryObject<Item> RUBY_ITEM = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ToolMaterial.RUBY_SWORD, 5, -1f, new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ToolMaterial.RUBY_PICKAXE, 5, -1f, new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ToolMaterial.RUBY_AXE, 5, -1f, new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ToolMaterial.RUBY_SHOVEL, 5, -1f, new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ToolMaterial.RUBY_HOE, 5, -1f, new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ArmorMaterial.RUBY_HELMET, EquipmentSlotType.HEAD, new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ArmorMaterial.RUBY_CHESTPLATE, EquipmentSlotType.CHEST, new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ArmorMaterial.RUBY_LEGGINGS, EquipmentSlotType.LEGS, new Item.Properties().tab(ModGroup.MODS_GROUP)));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ArmorMaterial.RUBY_BOOTS, EquipmentSlotType.FEET, new Item.Properties().tab(ModGroup.MODS_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
