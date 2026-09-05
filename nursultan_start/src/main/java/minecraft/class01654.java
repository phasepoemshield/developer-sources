/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02017
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02867
 *  minecraft.class02897
 *  minecraft.class05946
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class00751;
import minecraft.class01656;
import minecraft.class01894;
import minecraft.class02017;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02867;
import minecraft.class02897;
import minecraft.class05946;

public final class class01654
extends Record
implements class00381<class01656> {
    private final class05946<? extends class00751<?>> registry;
    private final List<class02017> entries;
    private static final class02362<ByteBuf, class05946<? extends class00751<?>>> u = class01894.y.N_10(class05946::N, class05946::N);
    public static final class02362<class00667, class01654> N = class02362.N(u, class01654::N, (class02362)class02017.N.N_33(class02389.N()), class01654::y, class01654::new);

    public class01654(class05946<? extends class00751<?>> class059462, List<class02017> list) {
        this.registry = class059462;
        this.entries = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01654.class, "registry;entries", "registry", "entries"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01654.class, "registry;entries", "registry", "entries"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01654.class, "registry;entries", "registry", "entries"}, this);
    }

    public List<class02017> y() {
        return this.entries;
    }

    public void method_65081(class01656 class016562) {
        class016562.N(this);
    }

    public class05946<? extends class00751<?>> N() {
        return this.registry;
    }

    public class02897<class01654> method_65080() {
        return class02867.L;
    }
}

