/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07209
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.render;

import minecraft.class00500;
import minecraft.class07209;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface LightDataProvider {
    public int light(class07209 var1, class00500 var2);

    public float ao(class07209 var1, class00500 var2);
}

