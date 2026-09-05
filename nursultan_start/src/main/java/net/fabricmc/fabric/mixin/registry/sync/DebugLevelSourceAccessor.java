/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07833
 *  org.spongepowered.asm.mixin.Mutable
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package net.fabricmc.fabric.mixin.registry.sync;

import java.util.List;
import minecraft.class00500;
import minecraft.class07833;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

public interface DebugLevelSourceAccessor {
    @Accessor(value="field_13161")
    @Mutable
    public static void setGRID_WIDTH(int n) {
        class07833.U = n;
    }

    @Accessor(value="field_13163")
    @Mutable
    public static void setALL_BLOCKS(List<class00500> list) {
        class07833.z = list;
    }

    @Accessor(value="field_13160")
    @Mutable
    public static void setGRID_HEIGHT(int n) {
        class07833.E = n;
    }
}

