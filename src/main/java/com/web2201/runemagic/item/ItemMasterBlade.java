package com.web2201.runemagic.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

public class ItemMasterBlade extends ItemSword {

	public ItemMasterBlade(int ID, ToolMaterial Arcan) {
		super(Arcan);
		this.setTextureName(Textures.Items.MASTER_BLADE);
		this.setUnlocalizedName(Names.Items.MASTER_BLADE);
	
		}

	
	
	
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
		par2EntityLivingBase.addPotionEffect(new PotionEffect(20, 300));
		par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
	
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){ 
    	if(par3EntityPlayer.isSneaking()){
        par3EntityPlayer.addPotionEffect(new PotionEffect(5, 300, 3));
        par3EntityPlayer.addPotionEffect(new PotionEffect(7, 1, 0));
        par3EntityPlayer.addPotionEffect(new PotionEffect(10, 150, 4));
       
    	}
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
    	return par1ItemStack;
        
    }
    
    	
}
