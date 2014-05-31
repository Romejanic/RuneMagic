package com.web2201.runemagic.baubles;

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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FireResistRing extends Item implements IBauble{

	public FireResistRing(){
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
	}
	
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return true;
	}
	
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.uncommon;
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage()==0 && !player.isPotionActive(Potion.fireResistance)) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,40,0));
		}
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
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.3f);
		}
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
