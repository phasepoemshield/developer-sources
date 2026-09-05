/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class02195
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class03748
 *  minecraft.class04247
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class02195;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class03748;
import minecraft.class04247;

public final class class00768
extends Record {
    private final class03556<class02195> type;
    private final byte x;
    private final byte y;
    private final byte rot;
    private final Optional<class00392> name;
    public static final class02362<class04247, class00768> N = class02362.N((class02362)class02195.L, class00768::L, (class02362)class02389.L, class00768::u, (class02362)class02389.L, class00768::i, (class02362)class02389.L, class00768::R, (class02362)class03748.L, class00768::M, class00768::new);

    public class03556<class02195> L() {
        return this.type;
    }

    public Optional<class00392> M() {
        return this.name;
    }

    public class00768(class03556<class02195> class035562, byte by, byte by2, byte by3, Optional<class00392> optional) {
        by3 = (byte)(by3 & 0xF);
        this.type = class035562;
        this.x = by;
        this.y = by2;
        this.rot = by3;
        this.name = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00768.class, "type;x;y;rot;name", "type", "x", "y", "rot", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00768.class, "type;x;y;rot;name", "type", "x", "y", "rot", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00768.class, "type;x;y;rot;name", "type", "x", "y", "rot", "name"}, this);
    }

    public byte i() {
        return this.y;
    }

    public byte u() {
        return this.x;
    }

    public boolean y() {
        return ((class02195)this.type.N()).L();
    }

    public class01894 N() {
        return ((class02195)this.type.N()).y();
    }

    public byte R() {
        return this.rot;
    }
}

