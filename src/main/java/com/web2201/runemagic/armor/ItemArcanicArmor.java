package com.web2201.runemagic.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.web2201.runemagic.RuneMagic;
import com.web2201.runemagic.api.ModItems;

public class ItemArcanicArmor extends ItemArmor {

	public ItemArcanicArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		
		
	}
	
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == ModItems.MasterHelm || stack.getItem() == ModItems.MasterChestplate || stack.getItem() == ModItems.MasterBoot) {
			return "runemagic:textures/models/armor/masterarmor_1.png";
		}
		if(stack.getItem() == ModItems.MasterLeg){
			return "runemagic:textures/models/armor/masterarmor_2.png";
		}
		else return null;
	};
	
	
	
	
            
    }	
	





