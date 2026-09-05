/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00751;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class05946;

public final class class03659<T>
extends Record {
    private final class03530<T> tag;
    private final boolean expected;

    public class03659(class03530<T> class035302, boolean bl) {
        this.tag = class035302;
        this.expected = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03659.class, "tag;expected", "tag", "expected"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03659.class, "tag;expected", "tag", "expected"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03659.class, "tag;expected", "tag", "expected"}, this);
    }

    public boolean y() {
        return this.expected;
    }

    public static <T> class03659<T> y(class03530<T> class035302) {
        return new class03659<T>(class035302, false);
    }

    public class03530<T> N() {
        return this.tag;
    }

    public static <T> Codec<class03659<T>> N(class05946<? extends class00751<T>> class059462) {
        return RecordCodecBuilder.create(instance -> instance.group((App)class03530.N((class05946)class059462).fieldOf("id").forGetter(class03659::N), (App)Codec.BOOL.fieldOf("expected").forGetter(class03659::y)).apply((Applicative)instance, class03659::new));
    }

    public static <T> class03659<T> N(class03530<T> class035302) {
        return new class03659<T>(class035302, true);
    }

    public boolean N(class03556<T> class035562) {
        return class035562.N(this.tag) == this.expected;
    }
}

