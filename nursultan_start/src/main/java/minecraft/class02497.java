/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06953
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06953;

public final class class02497
extends Record {
    private final class06953 wild;
    private final class06953 tame;
    private final class06953 angry;
    public static final Codec<class02497> N = RecordCodecBuilder.create(instance -> instance.group((App)class06953.N.fieldOf("wild").forGetter(class02497::N), (App)class06953.N.fieldOf("tame").forGetter(class02497::y), (App)class06953.N.fieldOf("angry").forGetter(class02497::L)).apply(instance, class02497::new));

    public class06953 L() {
        return this.angry;
    }

    public class02497(class06953 class069532, class06953 class069533, class06953 class069534) {
        this.wild = class069532;
        this.tame = class069533;
        this.angry = class069534;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02497.class, "wild;tame;angry", "wild", "tame", "angry"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02497.class, "wild;tame;angry", "wild", "tame", "angry"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02497.class, "wild;tame;angry", "wild", "tame", "angry"}, this);
    }

    public class06953 y() {
        return this.tame;
    }

    public class06953 N() {
        return this.wild;
    }
}

