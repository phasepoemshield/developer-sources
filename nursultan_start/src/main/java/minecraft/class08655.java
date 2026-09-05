/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02609
 *  minecraft.class03255
 *  minecraft.class08679
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02609;
import minecraft.class03255;
import minecraft.class08679;
import org.jspecify.annotations.Nullable;

final class class08655
extends Record
implements AutoCloseable {
    final class02609 mesh;
    final RenderPipeline pipeline;
    final class08679 textureSetup;
    final @Nullable class03255 scissorArea;

    public class08679 L() {
        return this.textureSetup;
    }

    class08655(class02609 class026092, RenderPipeline renderPipeline, class08679 class086792, @Nullable class03255 class032552) {
        this.mesh = class026092;
        this.pipeline = renderPipeline;
        this.textureSetup = class086792;
        this.scissorArea = class032552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08655.class, "mesh;pipeline;textureSetup;scissorArea", "mesh", "pipeline", "textureSetup", "scissorArea"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08655.class, "mesh;pipeline;textureSetup;scissorArea", "mesh", "pipeline", "textureSetup", "scissorArea"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08655.class, "mesh;pipeline;textureSetup;scissorArea", "mesh", "pipeline", "textureSetup", "scissorArea"}, this);
    }

    @Override
    public void close() {
        this.mesh.close();
    }

    public @Nullable class03255 u() {
        return this.scissorArea;
    }

    public RenderPipeline y() {
        return this.pipeline;
    }

    public class02609 N() {
        return this.mesh;
    }
}

