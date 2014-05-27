package com.web2201.runemagic.item;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

import com.web2201.runemagic.api.item.IBindingAgent;
import com.web2201.runemagic.api.item.ISoulCounter;

public class ItemSoulCollector extends Item implements ISoulCounter, IBindingAgent {
	
	private int maxSubstance;
	protected int collectorTier;
	
	
	public ItemSoulCollector(int damage){
		super();
		DamageSource damageSource = DamageSource.generic;
		this.setMaxStackSize(1);
		maxSubstance = damage;
		collectorTier = 1;
		
	}


	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		
		if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)){
		
		 par3List.add("The collector of your Soul");
	}}
	
	@Override
	public int getCollectorTier() {
		
		return collectorTier;
	}

	@Override
	public int getMaxSubstance() {
		
		return this.maxSubstance;
	}

}
