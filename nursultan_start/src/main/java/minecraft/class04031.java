/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01471
 *  minecraft.class02142
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01471;
import minecraft.class02142;

public final class class04031
extends Record {
    private final class02142 height;
    private final class01471 state;
    public static final Codec<class04031> N = RecordCodecBuilder.create(instance -> instance.group((App)class02142.u.fieldOf("height").forGetter(class04031::N), (App)class01471.N.fieldOf("provider").forGetter(class04031::y)).apply(instance, class04031::new));

    public class04031(class02142 class021422, class01471 class014712) {
        this.height = class021422;
        this.state = class014712;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04031.class, "height;state", "height", "state"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04031.class, "height;state", "height", "state"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04031.class, "height;state", "height", "state"}, this);
    }

    public class01471 y() {
        return this.state;
    }

    public class02142 N() {
        return this.height;
    }
}

