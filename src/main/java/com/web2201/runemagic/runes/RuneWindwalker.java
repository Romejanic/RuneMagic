package com.web2201.runemagic.runes;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RuneWindwalker extends Item {
	
	 @SideOnly(Side.CLIENT)
	    private static IIcon activeIcon;
	    @SideOnly(Side.CLIENT)
	    private static IIcon passiveIcon;
	
	public RuneWindwalker(){
		super();
		this.maxStackSize = 1;
		
	}
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		par3List.add("It's like walking on");
		par3List.add("the wind");
		
		if(!(par1ItemStack.stackTagCompound == null)){
			if(par1ItemStack.stackTagCompound.getBoolean("isActive")){
				par3List.add("Activated");
			}else
					{
					par3List.add("Deactivated");	
					}				
			
			}
		}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon("testmod:RuneWindwalker_deactivated");
		this.activeIcon = iconRegister.registerIcon("testmod:RuneWindwalker_activated");
		this.passiveIcon = iconRegister.registerIcon("testmod:RuneWindwalker_deactivated");
	}
	
	@Override
	public IIcon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining){
		if (stack.stackTagCompound == null){
			stack.setTagCompound(new NBTTagCompound());
		}
		NBTTagCompound tag = stack.stackTagCompound;
		
		if (tag.getBoolean("isActive")){
			return this.activeIcon;
			
		}
		else{
			return this.passiveIcon;
		}
	}
	}


		
		
			
	

		
	

	
	
	
	


