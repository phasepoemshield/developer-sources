/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class02609
 *  minecraft.class06828
 *  minecraft.class07311
 *  minecraft.class08066
 *  minecraft.class08394
 */
package net.irisshaders.iris.layer;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Objects;
import java.util.Optional;
import minecraft.class02609;
import minecraft.class06828;
import minecraft.class07311;
import minecraft.class08066;
import minecraft.class08394;
import net.irisshaders.iris.layer.RenderingWrapper;

public class OuterWrappedRenderType
extends class07311 {
    private static final class06828 FAKE_SETUP = class06828.N((RenderPipeline)class08394.Na).i();
    private final RenderingWrapper extra;
    private final class07311 wrapped;

    private class07311 unwrap() {
        return this.wrapped;
    }

    public OuterWrappedRenderType(String string, class07311 class073112, RenderingWrapper renderingWrapper) {
        super(string, FAKE_SETUP);
        this.extra = renderingWrapper;
        this.wrapped = class073112;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object.getClass() != ((Object)((Object)this)).getClass()) {
            return false;
        }
        OuterWrappedRenderType outerWrappedRenderType = (OuterWrappedRenderType)((Object)object);
        return Objects.equals(this.wrapped, outerWrappedRenderType.wrapped) && Objects.equals(this.extra, outerWrappedRenderType.extra);
    }

    public String toString() {
        return "iris_wrapped:" + this.wrapped.toString();
    }

    public int hashCode() {
        return this.wrapped.hashCode() + 1;
    }

    public void method_60895(class02609 class026092) {
        this.extra.setup();
        this.wrapped.method_60895(class026092);
        this.extra.clear();
    }

    public RenderPipeline method_73243() {
        return this.wrapped.method_73243();
    }

    public VertexFormat method_23031() {
        return this.wrapped.method_23031();
    }

    public boolean method_23037() {
        return this.wrapped.method_23037();
    }

    public Optional<class07311> method_23289() {
        return this.wrapped.method_23289();
    }

    public boolean method_24295() {
        return this.wrapped.method_24295();
    }

    public RenderPipeline iris$getPipeline() {
        return this.wrapped.iris$getPipeline();
    }

    public boolean method_43332() {
        return this.wrapped.method_43332();
    }

    public boolean method_60894() {
        return this.wrapped.method_60894();
    }

    public int method_22722() {
        return this.wrapped.method_22722();
    }

    public VertexFormat.class_5596 method_23033() {
        return this.wrapped.method_23033();
    }

    public static OuterWrappedRenderType wrapExactlyOnce(String string, class07311 class073112, RenderingWrapper renderingWrapper) {
        while (class073112 instanceof OuterWrappedRenderType) {
            class073112 = ((OuterWrappedRenderType)class073112).unwrap();
        }
        return new OuterWrappedRenderType(string, class073112, renderingWrapper);
    }

    public class08066 iris$getRenderTarget() {
        return this.wrapped.iris$getRenderTarget();
    }
}

