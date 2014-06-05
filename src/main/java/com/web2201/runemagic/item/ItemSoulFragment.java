package com.web2201.runemagic.item;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

import net.minecraft.item.Item;

public class ItemSoulFragment extends Item{
	public ItemSoulFragment(){
		this.setUnlocalizedName(Names.Items.SOUL_FRAGMENT);
		this.setTextureName(Textures.Items.SOUL_FRAGMENT);
	}
}
