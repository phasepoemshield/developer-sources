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
 *  minecraft.class04025
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01471;
import minecraft.class04025;

public final class class04448
extends Record {
    private final class04025 ifTrue;
    private final class01471 then;
    public static final Codec<class04448> N = RecordCodecBuilder.create(instance -> instance.group((App)class04025.y.fieldOf("if_true").forGetter(class04448::N), (App)class01471.N.fieldOf("then").forGetter(class04448::y)).apply(instance, class04448::new));

    public class04448(class04025 class040252, class01471 class014712) {
        this.ifTrue = class040252;
        this.then = class014712;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04448.class, "ifTrue;then", "ifTrue", "then"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04448.class, "ifTrue;then", "ifTrue", "then"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04448.class, "ifTrue;then", "ifTrue", "then"}, this);
    }

    public class01471 y() {
        return this.then;
    }

    public class04025 N() {
        return this.ifTrue;
    }
}

