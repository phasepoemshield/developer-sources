/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class01894;
import minecraft.class02435;

public final class class02447
extends Record
implements class02435 {
    private final String samplerName;
    private final class01894 targetId;
    private final boolean useDepthBuffer;
    private final boolean bilinear;
    public static final Codec<class02447> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("sampler_name").forGetter(class02447::N), (App)class01894.N.fieldOf("target").forGetter(class02447::L), (App)Codec.BOOL.optionalFieldOf("use_depth_buffer", (Object)false).forGetter(class02447::u), (App)Codec.BOOL.optionalFieldOf("bilinear", (Object)false).forGetter(class02447::i)).apply(instance, class02447::new));

    public class01894 L() {
        return this.targetId;
    }

    public class02447(String string, class01894 class018942, boolean bl, boolean bl2) {
        this.samplerName = string;
        this.targetId = class018942;
        this.useDepthBuffer = bl;
        this.bilinear = bl2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02447.class, "samplerName;targetId;useDepthBuffer;bilinear", "samplerName", "targetId", "useDepthBuffer", "bilinear"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02447.class, "samplerName;targetId;useDepthBuffer;bilinear", "samplerName", "targetId", "useDepthBuffer", "bilinear"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02447.class, "samplerName;targetId;useDepthBuffer;bilinear", "samplerName", "targetId", "useDepthBuffer", "bilinear"}, this);
    }

    public boolean i() {
        return this.bilinear;
    }

    public boolean u() {
        return this.useDepthBuffer;
    }

    @Override
    public Set<class01894> y() {
        return Set.of(this.targetId);
    }

    @Override
    public String N() {
        return this.samplerName;
    }
}

