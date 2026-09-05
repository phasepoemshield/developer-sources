/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.CompiledRenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02255
 */
package minecraft;

import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02255;

public final class class08870
extends Record
implements CompiledRenderPipeline {
    private final RenderPipeline info;
    private final class02255 program;

    public boolean isValid() {
        return this.program != class02255.field_57864;
    }

    public class08870(RenderPipeline renderPipeline, class02255 class022552) {
        this.info = renderPipeline;
        this.program = class022552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08870.class, "info;program", "info", "program"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08870.class, "info;program", "info", "program"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08870.class, "info;program", "info", "program"}, this);
    }

    public class02255 y() {
        return this.program;
    }

    public RenderPipeline N() {
        return this.info;
    }
}

