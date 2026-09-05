/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.blockview.client;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface RenderDataMapConsumer {
    public void fabric_acceptRenderDataMap(Long2ObjectMap<Object> var1);
}

