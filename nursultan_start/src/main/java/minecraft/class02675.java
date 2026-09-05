/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class02675
extends Record
implements class00381<class07280> {
    private final int playerId;
    private final class00392 message;
    public static final class02362<class04247, class02675> N = class02362.N((class02362)class02389.B, class02675::N, (class02362)class03748.u, class02675::y, class02675::new);

    public class02675(int n, class00392 class003922) {
        this.playerId = n;
        this.message = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02675.class, "playerId;message", "playerId", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02675.class, "playerId;message", "playerId", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02675.class, "playerId;message", "playerId", "message"}, this);
    }

    public boolean i() {
        return true;
    }

    public class00392 y() {
        return this.message;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.playerId;
    }

    public class02897<class02675> method_65080() {
        return class04248.Nz;
    }
}

