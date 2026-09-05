/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class04782
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import minecraft.class00225;
import minecraft.class03556;
import minecraft.class04782;

public final class class00227
extends Record
implements class00225 {
    private final List<class03556<class00225>> definitions;
    public static final MapCodec<class00227> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00225.y.listOf().fieldOf("definitions").forGetter(class00227::y)).apply(instance, class00227::new));

    public class00227(class00225 ... class00225Array) {
        this(Arrays.stream(class00225Array).map(class03556::N).toList());
    }

    public class00227(List<class03556<class00225>> list) {
        this.definitions = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00227.class, "definitions", "definitions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00227.class, "definitions", "definitions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00227.class, "definitions", "definitions"}, this);
    }

    public List<class03556<class00225>> y() {
        return this.definitions;
    }

    @Override
    public void y(class04782 class047822) {
        this.definitions.forEach(class035562 -> ((class00225)class035562.N()).y(class047822));
    }

    public MapCodec<class00227> N() {
        return L;
    }

    @Override
    public void N(class04782 class047822) {
        this.definitions.forEach(class035562 -> ((class00225)class035562.N()).N(class047822));
    }
}

