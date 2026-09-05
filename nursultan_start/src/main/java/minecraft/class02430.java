/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class06338;

public final class class02430
extends Record {
    private final Optional<Integer> width;
    private final Optional<Integer> height;
    private final boolean persistent;
    private final int clearColor;
    public static final Codec<class02430> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.b.optionalFieldOf("width").forGetter(class02430::N), (App)class06338.b.optionalFieldOf("height").forGetter(class02430::y), (App)Codec.BOOL.optionalFieldOf("persistent", (Object)false).forGetter(class02430::L), (App)class06338.W.optionalFieldOf("clear_color", (Object)0).forGetter(class02430::u)).apply(instance, class02430::new));

    public boolean L() {
        return this.persistent;
    }

    public class02430(Optional<Integer> optional, Optional<Integer> optional2, boolean bl, int n) {
        this.width = optional;
        this.height = optional2;
        this.persistent = bl;
        this.clearColor = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02430.class, "width;height;persistent;clearColor", "width", "height", "persistent", "clearColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02430.class, "width;height;persistent;clearColor", "width", "height", "persistent", "clearColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02430.class, "width;height;persistent;clearColor", "width", "height", "persistent", "clearColor"}, this);
    }

    public int u() {
        return this.clearColor;
    }

    public Optional<Integer> y() {
        return this.height;
    }

    public Optional<Integer> N() {
        return this.width;
    }
}

