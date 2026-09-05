/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class08066
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class08066;
import org.jspecify.annotations.Nullable;

public class class10203
extends class08066 {
    public class10203(@Nullable String string, int n, int n2, boolean bl) {
        super(string, bl);
        RenderSystem.assertOnRenderThread();
        this.N(n, n2);
    }
}

