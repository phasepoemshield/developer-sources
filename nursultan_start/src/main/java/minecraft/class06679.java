/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00488
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00488;

public final class class06679
extends Record {
    final String owner;
    final String objective;
    final class00488 score;
    public static final Codec<class06679> u = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("Name").forGetter(class06679::N), (App)Codec.STRING.fieldOf("Objective").forGetter(class06679::y), (App)class00488.i.forGetter(class06679::L)).apply(instance, class06679::new));

    public class00488 L() {
        return this.score;
    }

    public class06679(String string, String string2, class00488 class004882) {
        this.owner = string;
        this.objective = string2;
        this.score = class004882;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06679.class, "owner;objective;score", "owner", "objective", "score"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06679.class, "owner;objective;score", "owner", "objective", "score"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06679.class, "owner;objective;score", "owner", "objective", "score"}, this);
    }

    public String y() {
        return this.objective;
    }

    public String N() {
        return this.owner;
    }
}

