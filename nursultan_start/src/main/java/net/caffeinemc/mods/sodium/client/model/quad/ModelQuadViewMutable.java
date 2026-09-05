/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  minecraft.class08388
 */
package net.caffeinemc.mods.sodium.client.model.quad;

import minecraft.class07211;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;

public interface ModelQuadViewMutable
extends ModelQuadView {
    public void setFlags(int var1);

    public void setLight(int var1, int var2);

    public void setColor(int var1, int var2);

    public void setZ(int var1, float var2);

    public void setX(int var1, float var2);

    public void setY(int var1, float var2);

    public void setLightFace(class07211 var1);

    public void setFaceNormal(int var1);

    public void setNormal(int var1, int var2);

    public void setTexU(int var1, float var2);

    public void setTexV(int var1, float var2);

    public void setSprite(class08388 var1);

    public void setTintIndex(int var1);
}

