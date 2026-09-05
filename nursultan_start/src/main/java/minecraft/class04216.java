/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class04233
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class04205;
import minecraft.class04233;
import org.slf4j.Logger;

public final class class04216
extends Record
implements class04233 {
    private final class01894 resourceId;
    private final Optional<class01894> spriteId;
    private static final Logger i = LogUtils.getLogger();
    public static final MapCodec<class04216> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("resource").forGetter(class04216::y), (App)class01894.N.optionalFieldOf("sprite").forGetter(class04216::L)).apply(instance, class04216::new));

    public Optional<class01894> L() {
        return this.spriteId;
    }

    public class04216(class01894 class018942) {
        this(class018942, Optional.empty());
    }

    public class04216(class01894 class018942, Optional<class01894> optional) {
        this.resourceId = class018942;
        this.spriteId = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04216.class, "resourceId;spriteId", "resourceId", "spriteId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04216.class, "resourceId;spriteId", "resourceId", "spriteId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04216.class, "resourceId;spriteId", "resourceId", "spriteId"}, this);
    }

    public class01894 y() {
        return this.resourceId;
    }

    public MapCodec<class04216> N() {
        return y;
    }

    public void N(class01089 class010892, class04205 class042052) {
        class01894 class018942 = N.N(this.resourceId);
        Optional optional = class010892.method_14486(class018942);
        if (optional.isPresent()) {
            class042052.N(this.spriteId.orElse(this.resourceId), (class01079)optional.get());
        } else {
            i.warn("Missing sprite: {}", (Object)class018942);
        }
    }
}

