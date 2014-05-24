package com.web2201.testmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.web2201.testmod.api.ModBlocks;
import com.web2201.testmod.api.ModItems;
import com.web2201.testmod.lib.ProxyCommon;
import com.web2201.testmod.reference.BaseInfo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = BaseInfo.MODID, name = BaseInfo.NAME, version = BaseInfo.VERSION)

public class TestMod 
{

	public static CreativeTabs arcanaTab = new CreativeTabs("ArcanaCraft"){
		public Item getTabIconItem() {
			return ModItems.MasterBlade;
		}
		
	};

	
	@SidedProxy(clientSide = BaseInfo.Client, serverSide = BaseInfo.Common)
	
	public static ProxyCommon proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){

		ModBlocks.preInit();
		
		ModBlocks.GameRegistry();

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		ModItems.init();
		
		ModItems.GameRegistry();
		
		}
	
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderInformation();
		
	}
	
	public TestMod() {}
}
 

