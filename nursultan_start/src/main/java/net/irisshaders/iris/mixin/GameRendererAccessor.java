/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class02728
 *  minecraft.class05363
 */
package net.irisshaders.iris.mixin;

import minecraft.class01421;
import minecraft.class02728;
import minecraft.class05363;

public interface GameRendererAccessor {
    public boolean shouldRenderBlockOutlineA();

    public class02728 getResourcePool();

    public float invokeGetFov(class05363 var1, float var2, boolean var3);

    public void invokeBobView(class01421 var1, float var2);

    public void invokeBobHurt(class01421 var1, float var2);
}

