/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00753
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
import java.util.Optional;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00753;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class08621
extends Record
implements class00381<class07280> {
    private final class00392 status;
    private final Optional<class00753> size;
    public static final class02362<class04247, class08621> N = class02362.N((class02362)class03748.y, class08621::N, (class02362)class02389.N((class02362)class00753.field_56131), class08621::y, class08621::new);

    public class08621(class00392 class003922, Optional<class00753> optional) {
        this.status = class003922;
        this.size = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08621.class, "status;size", "status", "size"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08621.class, "status;size", "status", "size"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08621.class, "status;size", "status", "size"}, this);
    }

    public Optional<class00753> y() {
        return this.size;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class00392 N() {
        return this.status;
    }

    public class02897<class08621> method_65080() {
        return class04248.yz;
    }
}

