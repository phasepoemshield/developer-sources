/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06789
 *  minecraft.class06799
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package net.fabricmc.fabric.mixin.command;

import java.util.HashMap;
import java.util.Map;
import minecraft.class06789;
import minecraft.class06799;
import org.spongepowered.asm.mixin.gen.Accessor;

public interface ArgumentTypeInfosAccessor {
    @Accessor(value="field_10921")
    public static Map<Class<?>, class06799<?, ?>> fabric_getClassMap() {
        return new HashMap(class06789.N);
    }
}

