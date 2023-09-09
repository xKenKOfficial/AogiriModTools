package com.github.xKenKOfficial.Tools.Items.Groups;

import com.github.xKenKOfficial.Tools.Items.Inits.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModGroup extends ItemGroup
{
    public static ModGroup MODS_GROUP = new ModGroup(ItemGroup.TABS.length, "aogirimodtools_group");

    public ModGroup(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.RUBY_ITEM.get());
    }
}
