/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01283
 *  minecraft.class06541
 */
package net.fabricmc.fabric.impl.resource.pack;

import minecraft.class00392;
import minecraft.class01283;
import minecraft.class06541;

public record BuiltinModResourcePackSource(String modId) implements class01283
{
    public class00392 method_45282(class00392 class003922) {
        return class00392.N((String)"pack.nameAndSource", (Object[])new Object[]{class003922, class00392.N((String)"pack.source.builtinMod", (Object[])new Object[]{this.modId})}).N(class06541.field_1080);
    }

    public boolean method_45279() {
        return true;
    }
}

