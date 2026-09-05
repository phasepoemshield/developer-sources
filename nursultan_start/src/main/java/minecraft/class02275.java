/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01667
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02867
 *  minecraft.class02897
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00381;
import minecraft.class01667;
import minecraft.class02298;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02867;
import minecraft.class02897;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;

public final class class02275
extends Record
implements class00381<class01667> {
    private final List<class02298> knownPacks;
    public static final class02362<ByteBuf, class02275> N = class02362.N((class02362)class02298.N.N_33(class02389.L((int)class02275.N(64))), class02275::N, class02275::new);

    public class02275(List<class02298> list) {
        this.knownPacks = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02275.class, "knownPacks", "knownPacks"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02275.class, "knownPacks", "knownPacks"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02275.class, "knownPacks", "knownPacks"}, this);
    }

    public List<class02298> N() {
        return this.knownPacks;
    }

    private static int N(int n) {
        return ModResourcePackCreator.MAX_KNOWN_PACKS;
    }

    public void method_65081(class01667 class016672) {
        class016672.N(this);
    }

    public class02897<class02275> method_65080() {
        return class02867.Z;
    }
}

