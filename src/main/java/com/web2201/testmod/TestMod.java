package com.web2201.testmod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.web2201.testmod.armor.ItemArcanicArmor;
import com.web2201.testmod.block.BlockArcanicBrick;
import com.web2201.testmod.block.BlockArcanicStone;
import com.web2201.testmod.item.ItemArcanicBinder;
import com.web2201.testmod.item.ItemArcanicCore;
import com.web2201.testmod.item.ItemArcanicShard;
import com.web2201.testmod.item.ItemInfusedMasterGem;
import com.web2201.testmod.item.ItemMasterBlade;
import com.web2201.testmod.item.ItemMasterGem;
import com.web2201.testmod.lib.ProxyCommon;
import com.web2201.testmod.reference.BaseInfo;
import com.web2201.testmod.reference.Names;
import com.web2201.testmod.reference.Textures;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = BaseInfo.MODID, name = BaseInfo.NAME, version = BaseInfo.VERSION)

public class TestMod 
{
	private static int AA1;
	private static int AA2;
	private static int AA3;
	private static int AA4;
	
	//Blocks
	public static Block ArcanicStone;
	public static Block ArcanicBrick;
	
	//Items
	public static Item ArcanicShard;
	public static Item ArcanicCore;
	public static Item ArcanicBinder;
	public static Item MasterBlade;
	public static Item MasterGem;
	public static Item MasterBow;
	public static Item InfusedMasterGem;
	
	//Materials
	public static ToolMaterial Arcan = EnumHelper.addToolMaterial("Arcan", 5, 3000, 12.0F, 10, 40);
	public static ArmorMaterial ArcanArmor = EnumHelper.addArmorMaterial("ArcanArmor", 40, new int[]{5, 10, 8, 5}, 40 );
	
	//Armor
	public static Item MasterHelm;
	public static Item MasterChestplate;
	public static Item MasterLeg;
	public static Item MasterBoot;
	
	
	//Food
	public static ItemFood Cherry;
	
	public static CreativeTabs arcanaTab = new CreativeTabs("ArcanaCraft"){
		public Item getTabIconItem() {
			return TestMod.MasterBlade;
		}
		
	};

	
	@SidedProxy(clientSide = BaseInfo.Client, serverSide = BaseInfo.Common)
	
	public static ProxyCommon proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ArcanicStone = new BlockArcanicStone().setCreativeTab(arcanaTab);
		ArcanicBrick = new BlockArcanicBrick().setCreativeTab(arcanaTab);

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		//Cherry = (ItemFood) new Cherry(3, true).setCreativeTab(arcanaTab).setUnlocalizedName("Cherry").setTextureName("testmod:Cherry");
		MasterBlade = new ItemMasterBlade(Arcan).setCreativeTab(arcanaTab).setTextureName(Textures.Items.MASTER_BLADE).setUnlocalizedName("ItemMasterBlade");
		MasterGem = new ItemMasterGem().setCreativeTab(arcanaTab).setUnlocalizedName("ItemMasterGem").setTextureName(Textures.Items.MASTER_GEM);
		InfusedMasterGem = new ItemInfusedMasterGem().setCreativeTab(arcanaTab).setUnlocalizedName("ItemInfusedMasterGem").setTextureName(Textures.Items.INFUSED_MASTER_GEM);
		//MasterBow = new ItemMasterBow(Arcan).setCreativeTab(arcanaTab).setUnlocalizedName("ItemMasterBow").setTextureName("testmod:MasterBow");
		MasterHelm = new ItemArcanicArmor(ArcanArmor, AA1, 0).setUnlocalizedName("ItemMasterHelm").setCreativeTab(arcanaTab).setTextureName("testmod:MasterHelm");
		MasterChestplate = new ItemArcanicArmor(ArcanArmor, AA2, 1).setUnlocalizedName("ItemMasterChestplate").setCreativeTab(arcanaTab).setTextureName("testmod:MasterChestplate");
		MasterLeg = new ItemArcanicArmor(ArcanArmor, AA3, 2).setUnlocalizedName("ItemMasterLeg").setCreativeTab(arcanaTab).setTextureName("testmod:MasterLeg");
		MasterBoot = new ItemArcanicArmor(ArcanArmor, AA4, 3).setUnlocalizedName("ItemMasterBoot").setCreativeTab(arcanaTab).setTextureName("testmod:MasterBoot");
	    ArcanicCore = new ItemArcanicCore().setUnlocalizedName("ItemArcanicCore").setCreativeTab(arcanaTab).setTextureName(Textures.Items.ARCANIC_CORE);
		ArcanicShard = new ItemArcanicShard().setUnlocalizedName("ItemArcanicShard").setCreativeTab(arcanaTab).setTextureName(Textures.Items.ARCANIC_SHARD);
		ArcanicBinder = new ItemArcanicBinder().setUnlocalizedName("ItemArcanicBinder").setCreativeTab(arcanaTab).setTextureName(Textures.Items.ARCANIC_BINDER);
		//GameRegistry.registerItem(Cherry, "Cherry");
		GameRegistry.registerItem(ArcanicBinder, "ArcanicBinder");
		GameRegistry.registerBlock(ArcanicStone, "ArcanicStone");
		GameRegistry.registerBlock(ArcanicBrick, "ArcanicBrick");
		GameRegistry.registerItem(ArcanicCore, "ArcanicCore");
		GameRegistry.registerItem(ArcanicShard, "ArcanicShard");
		GameRegistry.registerItem(MasterBlade, "MasterBlade");
		GameRegistry.registerItem(MasterGem, "MasterGem");
		GameRegistry.registerItem(InfusedMasterGem, "InfusedMasterGem");
		//GameRegistry.registerItem(MasterBow, "MasterBow");
		GameRegistry.registerItem(MasterHelm, "MasterHelm");
		GameRegistry.registerItem(MasterChestplate, "MasterChestplate");
		GameRegistry.registerItem(MasterLeg, "MasterLeg");
		GameRegistry.registerItem(MasterBoot, "MasterBoot");
		GameRegistry.addRecipe(new ItemStack(ArcanicBrick, 4), "XX ", "XX ", "   ", 'X', ArcanicStone);
		GameRegistry.addRecipe(new ItemStack(ArcanicStone, 8), "XXX", "XYX", "XXX", 'X', Blocks.stone, 'Y', Items.dye);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderInformation();
		
	}
	
	public TestMod() {}
}
 

