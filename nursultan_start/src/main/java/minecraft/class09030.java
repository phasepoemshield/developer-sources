/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01662
 *  minecraft.class02362
 *  minecraft.class02885
 *  minecraft.class02897
 *  minecraft.class03556
 *  minecraft.class04247
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class01662;
import minecraft.class02362;
import minecraft.class02885;
import minecraft.class02897;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class09037;

public final class class09030
extends Record
implements class00381<class01662> {
    private final class03556<class09037> dialog;
    public static final class02362<class04247, class09030> N = class02362.N(class09037.R, class09030::N, class09030::new);
    public static final class02362<ByteBuf, class09030> y = class02362.N((class02362)class09037.M.N_10(class03556::N, class03556::N), class09030::N, class09030::new);

    public class09030(class03556<class09037> class035562) {
        this.dialog = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09030.class, "dialog", "dialog"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09030.class, "dialog", "dialog"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09030.class, "dialog", "dialog"}, this);
    }

    public void method_65081(class01662 class016622) {
        class016622.N(this);
    }

    public class03556<class09037> N() {
        return this.dialog;
    }

    public class02897<class09030> method_65080() {
        return class02885.z;
    }
}

