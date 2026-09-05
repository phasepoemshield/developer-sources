/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01656
 *  minecraft.class02298
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00381;
import minecraft.class01656;
import minecraft.class02298;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02867;
import minecraft.class02897;

public final class class02817
extends Record
implements class00381<class01656> {
    private final List<class02298> knownPacks;
    public static final class02362<ByteBuf, class02817> N = class02362.N((class02362)class02298.N.N_33(class02389.N()), class02817::N, class02817::new);

    public class02817(List<class02298> list) {
        this.knownPacks = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02817.class, "knownPacks", "knownPacks"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02817.class, "knownPacks", "knownPacks"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02817.class, "knownPacks", "knownPacks"}, this);
    }

    public void method_65081(class01656 class016562) {
        class016562.N(this);
    }

    public List<class02298> N() {
        return this.knownPacks;
    }

    public class02897<class02817> method_65080() {
        return class02867.i;
    }
}

