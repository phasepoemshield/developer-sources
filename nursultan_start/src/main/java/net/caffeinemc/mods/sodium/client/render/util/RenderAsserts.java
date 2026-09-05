/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 */
package net.caffeinemc.mods.sodium.client.render.util;

import com.mojang.blaze3d.systems.RenderSystem;

public class RenderAsserts {
    public static boolean validateCurrentThread() {
        if (!RenderSystem.isOnRenderThread()) {
            throw new IllegalStateException("Tried to access render state from outside the main render thread! This was very likely caused by another misbehaving mod -- make sure to examine the stack trace below.");
        }
        return true;
    }
}

