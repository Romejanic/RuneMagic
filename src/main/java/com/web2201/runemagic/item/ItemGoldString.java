package com.web2201.runemagic.item;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

import net.minecraft.item.Item;

public class ItemGoldString extends Item {
	public ItemGoldString(){
		this.setUnlocalizedName(Names.Items.GOLDEN_STRING);
		this.setTextureName(Textures.Items.GOLD_STRING);
	}
}
