package com.web2201.runemagic.runes;

import java.util.List;

import net.minecraft.client.gui.GuiControls;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import com.web2201.runemagic.api.item.IBindingAgent;
import com.web2201.runemagic.reference.Names;
import com.web2201.runemagic.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RuneBinding extends Item implements IBindingAgent {
	
	public RuneBinding(){
		super();
		this.setMaxStackSize(1);
		this.setTextureName(Textures.Items.RUNE_BINDING);
		this.setUnlocalizedName(Names.Items.RUNE_BINDING);
		
	}
	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack){
		
		return false;
		
	}
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
    	
    	list.add("Hold Shift for more information");
    	
    	if(GuiControls.isShiftKeyDown()){
    
    	list.add("");	
    	list.add("The core of your crafting");
    	//list.add("");
    	list.add("Binding Tier : 1");
    	}	
    }
    
    public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer player) {
    	
    	player.addPotionEffect(new PotionEffect(10, 50, 3));
    }
	
	
	
	
	
	

}
