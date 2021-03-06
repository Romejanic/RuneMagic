package com.web2201.runemagic;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.web2201.runemagic.api.ModBlocks;
import com.web2201.runemagic.api.ModItems;
import com.web2201.runemagic.entity.RMEntity;
import com.web2201.runemagic.lib.ProxyCommon;
import com.web2201.runemagic.reference.BaseInfo;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = BaseInfo.MODID, name = BaseInfo.NAME, version = BaseInfo.VERSION, dependencies="required-after:Baubles@[1.0.0.14,);")

public class RuneMagic 
{

	public static CreativeTabs arcanaTab = new CreativeTabs("RuneMagic"){
		public Item getTabIconItem() {
			return ModItems.MasterBlade;
		}
		
	};

	
	@SidedProxy(clientSide = BaseInfo.Client, serverSide = BaseInfo.Common)
	
	public static ProxyCommon proxy;
	
	@Instance(BaseInfo.MODID)
	public static RuneMagic modInstance;

	public static Object instance;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModBlocks.preInit();
		ModBlocks.GameRegistry();
		
		RMEntity.MainRegistry();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		ModItems.init();
		ModItems.GameRegistry();
	}
	
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderInformation();
		
	}
	
	
	public RuneMagic() {}
}
 

