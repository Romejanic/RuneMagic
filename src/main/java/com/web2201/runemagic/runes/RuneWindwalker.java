package com.web2201.runemagic.runes;

import java.util.List;

import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
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
		this.setTextureName(Textures.Items.RUNE_WINDWALKER);
		this.setUnlocalizedName(Names.Items.RUNE_WINDWALKER);
		
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
		this.itemIcon = iconRegister.registerIcon("runemagic:RuneWindwalker_deactivated");
		this.activeIcon = iconRegister.registerIcon("runemagic:RuneWindwalker_activated");
		this.passiveIcon = iconRegister.registerIcon("runemagic:RuneWindwalker_deactivated");
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
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int par1){
		
		if(par1 == 1){
			return this.activeIcon;
		}else{
			return this.passiveIcon;
		}
		
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2world, EntityPlayer par3EntityPlayer){
		
		if(par3EntityPlayer.isSneaking()){
			return par1ItemStack;
		}
		
		if(par1ItemStack.stackTagCompound == null){
			par1ItemStack.setTagCompound(new NBTTagCompound());
		}
		
		NBTTagCompound tag = par1ItemStack.stackTagCompound;
		tag.setBoolean("isActive", !(tag.getBoolean("isActive")));
		
		if(tag.getBoolean("isActive")){
			par1ItemStack.setItemDamage(1);
			tag.setInteger("worldTimeDelay", (int) (par2world.getWorldTime() - 1) % 200);
			par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10, 1));
			par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 10, 1));
		}
		return par1ItemStack;
	}
	
	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2world, Entity par3Entity, int par4, boolean par5){
		
		if(!(par3Entity instanceof EntityPlayer)){
			return;
		}
		EntityPlayer par3EntityPlayer = (EntityPlayer) par3Entity;
		
		if(par1ItemStack.stackTagCompound == null){
			par1ItemStack.setTagCompound(new NBTTagCompound());
			
		}
		if(par1ItemStack.stackTagCompound.getBoolean("isActive")){
			par3EntityPlayer.addPotionEffect(new PotionEffect(1, 10, 1));
			par3EntityPlayer.addPotionEffect(new PotionEffect(8, 10, 1));
		}
		if(par2world.getWorldTime() % 200 == par1ItemStack.stackTagCompound.getInteger("worldTimeDelay") && par1ItemStack.stackTagCompound.getBoolean("isActive")){
			return;
		}
		
	}
	
	
	public void onArmorUpdate(World world, EntityPlayer player, ItemStack itemStack){
    
        if (itemStack.stackTagCompound == null)
        {
            itemStack.setTagCompound(new NBTTagCompound());
        }

        player.addPotionEffect(new PotionEffect(1, 10, 1));
        player.addPotionEffect(new PotionEffect(8, 10, 1));
    }
	
	}