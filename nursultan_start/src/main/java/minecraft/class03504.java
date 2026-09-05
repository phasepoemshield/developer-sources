/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01583
 *  minecraft.class01894
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class08394
 *  net.irisshaders.iris.layer.BlockEntityRenderStateShard
 *  net.irisshaders.iris.layer.OuterWrappedRenderType
 *  net.irisshaders.iris.layer.RenderingWrapper
 *  net.irisshaders.iris.vertices.ImmediateState
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01583;
import minecraft.class01894;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class08394;
import net.irisshaders.iris.layer.BlockEntityRenderStateShard;
import net.irisshaders.iris.layer.OuterWrappedRenderType;
import net.irisshaders.iris.layer.RenderingWrapper;
import net.irisshaders.iris.vertices.ImmediateState;

public final class class03504
extends Record {
    private final class07311 normal;
    private final class07311 seeThrough;
    private final class07311 polygonOffset;
    private final RenderPipeline guiPipeline;

    public class07311 L() {
        return this.polygonOffset;
    }

    public class03504(class07311 class073112, class07311 class073113, class07311 class073114, RenderPipeline renderPipeline) {
        this.normal = class073112;
        this.seeThrough = class073113;
        this.polygonOffset = class073114;
        this.guiPipeline = renderPipeline;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03504.class, "normal;seeThrough;polygonOffset;guiPipeline", "normal", "seeThrough", "polygonOffset", "guiPipeline"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03504.class, "normal;seeThrough;polygonOffset;guiPipeline", "normal", "seeThrough", "polygonOffset", "guiPipeline"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03504.class, "normal;seeThrough;polygonOffset;guiPipeline", "normal", "seeThrough", "polygonOffset", "guiPipeline"}, this);
    }

    public RenderPipeline u() {
        return this.guiPipeline;
    }

    private class07311 y(class01583 class015832) {
        return switch (class015832) {
            default -> throw new MatchException(null, null);
            case class01583.field_33993 -> this.normal;
            case class01583.field_33994 -> this.seeThrough;
            case class01583.field_33995 -> this.polygonOffset;
        };
    }

    public class07311 y() {
        return this.seeThrough;
    }

    public static class03504 y(class01894 class018942) {
        return new class03504(class06851.n((class01894)class018942), class06851.d((class01894)class018942), class06851.G((class01894)class018942), class08394.NM);
    }

    private class07311 N(class01583 class015832, Operation operation) {
        class07311 class073112 = (class07311)operation.call(new Object[]{class015832});
        if (ImmediateState.isRenderingBEs) {
            class073112 = OuterWrappedRenderType.wrapExactlyOnce((String)"iris:block_entity", (class07311)class073112, (RenderingWrapper)BlockEntityRenderStateShard.INSTANCE);
        }
        return class073112;
    }

    public class07311 N() {
        return this.normal;
    }

    public class07311 N(class01583 class015832) {
        return this.N(class015832, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_327$class_6415]");
            return this.y((class01583)objectArray[0]);
        });
    }

    public static class03504 N(class01894 class018942) {
        return new class03504(class06851.t((class01894)class018942), class06851.w((class01894)class018942), class06851.l((class01894)class018942), class08394.Nz);
    }
}

