/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class04802
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.client.rendering;

import java.util.Set;
import minecraft.class01134;
import minecraft.class04802;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface ModelLayersAccessor {
    public static /* synthetic */ Set<class01134> getLayers() {
        return class04802.y();
    }
}

