/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08036
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1.hud;

import java.util.function.ToIntFunction;
import minecraft.class08036;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface StatusBarHeightProvider
extends ToIntFunction<class08036> {
    @Override
    default public int applyAsInt(class08036 class080362) {
        return this.getStatusBarHeight(class080362);
    }

    public int getStatusBarHeight(class08036 var1);
}

