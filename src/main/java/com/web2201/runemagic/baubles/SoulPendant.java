package com.web2201.runemagic.baubles;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;

public class SoulPendant extends Item implements IBauble{
	
	public SoulPendant(){
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setUnlocalizedName(Names.Items.SOUL_PENDANT);
		this.setTextureName(Textures.Items.SOUL_PENDANT);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return true;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		if(!par2World.isRemote) { 
			InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(par3EntityPlayer);
			for(int i = 0; i < baubles.getSizeInventory(); i++)
				if(baubles.getStackInSlot(i) == null && baubles.isItemValidForSlot(i, par1ItemStack)) {
					baubles.setInventorySlotContents(i, par1ItemStack.copy());
					if(!par3EntityPlayer.capabilities.isCreativeMode){
						par3EntityPlayer.inventory.setInventorySlotContents(par3EntityPlayer.inventory.currentItem, null);
					}
					onEquipped(par1ItemStack, par3EntityPlayer);
					break;
				}
		}

		return par1ItemStack;	
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		player.addPotionEffect(new PotionEffect(Potion.regeneration.id,20,0));
		player.addPotionEffect(new PotionEffect(Potion.resistance.id,20,0));
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

}
