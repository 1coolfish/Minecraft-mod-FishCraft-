package com.coolfish.fishcraft.items;

import com.coolfish.fishcraft.Main;
import com.coolfish.fishcraft.util.IHasModel;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase  extends Item implements IHasModel{

	public ItemBase(String name)
	{
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.MISC);
	
	ModItems.ITEMS.add(this);
	
	
	}
	
	
	
	@Override
	public void registerModels() {
	Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
