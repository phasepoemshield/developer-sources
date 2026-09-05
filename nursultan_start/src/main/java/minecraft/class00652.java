/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import minecraft.class00647;
import minecraft.class00654;
import minecraft.class06338;

public final class class00652
extends Record
implements class00647 {
    private final URI uri;
    public static final MapCodec<class00652> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.a.fieldOf("url").forGetter(class00652::y)).apply(instance, class00652::new));

    public class00652(URI uRI) {
        this.uri = uRI;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00652.class, "uri", "uri"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00652.class, "uri", "uri"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00652.class, "uri", "uri"}, this);
    }

    public URI y() {
        return this.uri;
    }

    @Override
    public class00654 N() {
        return class00654.field_11749;
    }
}

