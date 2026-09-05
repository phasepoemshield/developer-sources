/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02002
 *  minecraft.class02968
 *  minecraft.class06338
 *  net.irisshaders.iris.mixin.texture.AnimationMetadataSectionAccessor
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class02002;
import minecraft.class02968;
import minecraft.class06338;
import minecraft.class08421;
import net.irisshaders.iris.mixin.texture.AnimationMetadataSectionAccessor;

public final class class08393
extends Record
implements AnimationMetadataSectionAccessor {
    private final Optional<List<class08421>> frames;
    private Optional<Integer> frameWidth;
    private Optional<Integer> frameHeight;
    private final int defaultFrameTime;
    private final boolean interpolatedFrames;
    public static final Codec<class08393> N = RecordCodecBuilder.create(instance -> instance.group((App)class08421.y.listOf().optionalFieldOf("frames").forGetter(class08393::N), (App)class06338.b.optionalFieldOf("width").forGetter(class08393::y), (App)class06338.b.optionalFieldOf("height").forGetter(class08393::L), (App)class06338.b.optionalFieldOf("frametime", (Object)1).forGetter(class08393::u), (App)Codec.BOOL.optionalFieldOf("interpolate", (Object)false).forGetter(class08393::i)).apply(instance, class08393::new));
    public static final class02968<class08393> y = new class02968("animation", N);

    public Optional<Integer> L() {
        return this.frameHeight;
    }

    public class08393(Optional<List<class08421>> optional, Optional<Integer> optional2, Optional<Integer> optional3, int n, boolean bl) {
        this.frames = optional;
        this.frameWidth = optional2;
        this.frameHeight = optional3;
        this.defaultFrameTime = n;
        this.interpolatedFrames = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08393.class, "frames;frameWidth;frameHeight;defaultFrameTime;interpolatedFrames", "frames", "frameWidth", "frameHeight", "defaultFrameTime", "interpolatedFrames"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08393.class, "frames;frameWidth;frameHeight;defaultFrameTime;interpolatedFrames", "frames", "frameWidth", "frameHeight", "defaultFrameTime", "interpolatedFrames"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08393.class, "frames;frameWidth;frameHeight;defaultFrameTime;interpolatedFrames", "frames", "frameWidth", "frameHeight", "defaultFrameTime", "interpolatedFrames"}, this);
    }

    public boolean i() {
        return this.interpolatedFrames;
    }

    public int u() {
        return this.defaultFrameTime;
    }

    public Optional<Integer> y() {
        return this.frameWidth;
    }

    public class02002 N(int n, int n2) {
        if (this.frameWidth.isPresent()) {
            if (this.frameHeight.isPresent()) {
                return new class02002(this.frameWidth.get().intValue(), this.frameHeight.get().intValue());
            }
            return new class02002(this.frameWidth.get().intValue(), n2);
        }
        if (this.frameHeight.isPresent()) {
            return new class02002(n, this.frameHeight.get().intValue());
        }
        int n3 = Math.min(n, n2);
        return new class02002(n3, n3);
    }

    public Optional<List<class08421>> N() {
        return this.frames;
    }

    public /* synthetic */ Optional getFrameHeight() {
        return this.frameHeight;
    }

    public /* synthetic */ void setFrameHeight(Optional optional) {
        this.frameHeight = optional;
    }

    public /* synthetic */ void setFrameWidth(Optional optional) {
        this.frameWidth = optional;
    }

    public /* synthetic */ Optional getFrameWidth() {
        return this.frameWidth;
    }
}

