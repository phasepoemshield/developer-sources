/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  minecraft.class01383
 *  minecraft.class01386
 *  minecraft.class01781
 *  minecraft.class03448
 *  minecraft.class04755
 *  minecraft.class05363
 *  minecraft.class05932
 */
package net.irisshaders.iris.mixin;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.util.SortedSet;
import minecraft.class01383;
import minecraft.class01386;
import minecraft.class01781;
import minecraft.class03448;
import minecraft.class04755;
import minecraft.class05363;
import minecraft.class05932;

public interface LevelRendererAccessor {
    public class03448 getLevel();

    public boolean invokeDoesMobEffectBlockSky(class05363 var1);

    public void setRenderBuffers(class01386 var1);

    public class01386 getRenderBuffers();

    public void invokeCullTerrain(class05363 var1, class01383 var2, boolean var3);

    public void invokeExtractBlockEntities(class05363 var1, float var2, class05932 var3);

    public class01781 getEntityRenderDispatcher();

    public Long2ObjectMap<SortedSet<class04755>> getDestructionProgress();
}

