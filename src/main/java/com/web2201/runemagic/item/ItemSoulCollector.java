package com.web2201.runemagic.item;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

import com.web2201.runemagic.api.item.IBindingAgent;
import com.web2201.runemagic.api.item.ISoulCounter;
import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSoulCollector extends Item implements ISoulCounter, IBindingAgent {
	
	private int maxSubstance;
	protected int collectorTier;
	
	
	public ItemSoulCollector(){
		super();
		DamageSource damageSource = DamageSource.generic;
		this.setMaxStackSize(1);
		//maxSubstance = damage;
		collectorTier = 1;
		this.setUnlocalizedName(Names.Items.SOUL_COLLECTOR);
		this.setTextureName(Textures.Items.SOUL_COLLECTOR);
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
	
	@SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

}
