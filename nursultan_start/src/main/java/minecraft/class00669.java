/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class06338
 *  minecraft.class07709
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00647;
import minecraft.class00654;
import minecraft.class01894;
import minecraft.class06338;
import minecraft.class07709;

public final class class00669
extends Record
implements class00647 {
    private final class01894 id;
    private final Optional<class07709> payload;
    public static final MapCodec<class00669> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("id").forGetter(class00669::y), (App)class06338.L.optionalFieldOf("payload").forGetter(class00669::L)).apply(instance, class00669::new));

    public Optional<class07709> L() {
        return this.payload;
    }

    public class00669(class01894 class018942, Optional<class07709> optional) {
        this.id = class018942;
        this.payload = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00669.class, "id;payload", "id", "payload"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00669.class, "id;payload", "id", "payload"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00669.class, "id;payload", "id", "payload"}, this);
    }

    public class01894 y() {
        return this.id;
    }

    @Override
    public class00654 N() {
        return class00654.field_60822;
    }
}

