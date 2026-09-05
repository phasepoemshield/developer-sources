/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03009
 *  minecraft.class03979
 *  minecraft.class04017
 *  minecraft.class04018
 *  minecraft.class04039
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03009;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04039;

final class class03034
extends Record
implements class04017 {
    private final class04017 target;
    static final class03979<class03034> N = class03979.N((MapCodec)class04017.L.xmap(class03034::new, class03034::y).fieldOf("invert"));

    class03034(class04017 class040172) {
        this.target = class040172;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03034.class, "target", "target"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03034.class, "target", "target"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03034.class, "target", "target"}, this);
    }

    public class04017 y() {
        return this.target;
    }

    public class04018 apply(class04039 class040392) {
        return new class03009((class04018)this.target.apply((Object)class040392));
    }

    public class03979<? extends class04017> N() {
        return N;
    }
}

