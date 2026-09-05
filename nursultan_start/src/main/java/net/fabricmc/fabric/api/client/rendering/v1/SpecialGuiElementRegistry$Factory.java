/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08672
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class08672;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.SpecialGuiElementRegistry$Context;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface SpecialGuiElementRegistry$Factory {
    public class08672<?> createSpecialRenderer(SpecialGuiElementRegistry$Context var1);
}

