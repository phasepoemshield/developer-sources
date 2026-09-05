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
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06338;
import minecraft.class06584;

public final class class08332
extends Record {
    private final int slot;
    private final class06584 stack;
    public static final Codec<class08332> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.s.fieldOf("Slot").orElse((Object)0).forGetter(class08332::N), (App)class06584.N.forGetter(class08332::y)).apply(instance, class08332::new));

    public class08332(int n, class06584 class065842) {
        this.slot = n;
        this.stack = class065842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08332.class, "slot;stack", "slot", "stack"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08332.class, "slot;stack", "slot", "stack"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08332.class, "slot;stack", "slot", "stack"}, this);
    }

    public class06584 y() {
        return this.stack;
    }

    public int N() {
        return this.slot;
    }

    public boolean N(int n) {
        return this.slot >= 0 && this.slot < n;
    }
}

