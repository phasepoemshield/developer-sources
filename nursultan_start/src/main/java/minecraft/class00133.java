/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class08737
 *  minecraft.class08752
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import minecraft.class00106;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class08737;
import minecraft.class08752;

public final class class00133
extends Record
implements class08752 {
    private final class00106 template;
    public static final MapCodec<class00133> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00106.N.fieldOf("template").forGetter(class00133::y)).apply(instance, class00133::new));

    public class00133(class00106 class001062) {
        this.template = class001062;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00133.class, "template", "template"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00133.class, "template", "template"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00133.class, "template", "template"}, this);
    }

    public class00106 y() {
        return this.template;
    }

    public Optional<class00647> N(Map<String, class08737> map) {
        String string = this.template.N(class08737.N(map));
        return Optional.of(new class00625(string));
    }

    public MapCodec<class00133> N() {
        return N;
    }
}

