/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class07463
 *  minecraft.class07468
 *  minecraft.class07471
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class07463;
import minecraft.class07468;
import minecraft.class07471;

public final class class08085
extends Record {
    private final class03556<class07468> attribute;
    private final double base;
    private final Collection<class07471> modifiers;
    public static final class02362<ByteBuf, class07471> N = class02362.N((class02362)class01894.y, class07471::N, (class02362)class02389.W, class07471::y, (class02362)class07463.field_48326, class07471::L, class07471::new);
    public static final class02362<class04247, class08085> y = class02362.N((class02362)class07468.y, class08085::N, (class02362)class02389.W, class08085::y, (class02362)N.N_33(class02389.N(ArrayList::new)), class08085::L, class08085::new);

    public Collection<class07471> L() {
        return this.modifiers;
    }

    public class08085(class03556<class07468> class035562, double d, Collection<class07471> collection) {
        this.attribute = class035562;
        this.base = d;
        this.modifiers = collection;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08085.class, "attribute;base;modifiers", "attribute", "base", "modifiers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08085.class, "attribute;base;modifiers", "attribute", "base", "modifiers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08085.class, "attribute;base;modifiers", "attribute", "base", "modifiers"}, this);
    }

    public double y() {
        return this.base;
    }

    public class03556<class07468> N() {
        return this.attribute;
    }
}

