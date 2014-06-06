package com.web2201.runemagic.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.web2201.runemagic.reference.BaseInfo;
import com.web2201.runemagic.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockRuneInfuser extends BlockContainer{

	private final boolean isActive;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconBottom;
	
	public BlockRuneInfuser(boolean isActive) {
		super(Material.iron);
		
		this.isActive = isActive;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(Textures.Blocks.RUNE_INFUSER_SIDE);
		this.iconTop = iconRegister.registerIcon(this.isActive ? Textures.Blocks.RUNE_INFUSER_TOP_ON : Textures.Blocks.RUNE_INFUSER_TOP_OFF);
		this.iconBottom = iconRegister.registerIcon(Textures.Blocks.RUNE_INFUSER_BOTTOM);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return null;
	}

}
