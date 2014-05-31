package com.web2201.runemagic.render;

import com.web2201.runemagic.entity.EntityWanderingSoul;
import com.web2201.runemagic.reference.BaseInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderWanderingSoul extends RenderLiving
{
    private static final ResourceLocation mobTextures = new ResourceLocation(BaseInfo.MODID + ":textures/entity/WanderingSoul.png");
    private static final String __OBFID = "CL_00000984";

    public RenderWanderingSoul(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityWanderingSoul par1EntityCow)
    {
        return mobTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityWanderingSoul)par1Entity);
    }
}