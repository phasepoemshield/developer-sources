/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08394
 *  minecraft.class08626
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class08394;
import minecraft.class08626;

public final class class05846
extends Record {
    private final boolean translucent;
    private final class01894 textureAtlasLocation;
    private final RenderPipeline pipeline;
    public static final class05846 N = new class05846(true, class08626.N, class08394.Ng);
    public static final class05846 y = new class05846(true, class08626.y, class08394.Ng);
    public static final class05846 L = new class05846(false, class08626.L, class08394.NO);
    public static final class05846 u = new class05846(true, class08626.L, class08394.Ng);

    public RenderPipeline L() {
        return this.pipeline;
    }

    public class05846(boolean bl, class01894 class018942, RenderPipeline renderPipeline) {
        this.translucent = bl;
        this.textureAtlasLocation = class018942;
        this.pipeline = renderPipeline;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05846.class, "translucent;textureAtlasLocation;pipeline", "translucent", "textureAtlasLocation", "pipeline"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05846.class, "translucent;textureAtlasLocation;pipeline", "translucent", "textureAtlasLocation", "pipeline"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05846.class, "translucent;textureAtlasLocation;pipeline", "translucent", "textureAtlasLocation", "pipeline"}, this);
    }

    public class01894 y() {
        return this.textureAtlasLocation;
    }

    public boolean N() {
        return this.translucent;
    }
}

