/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class02362
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
import minecraft.class02897;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class08082
extends Record
implements class00381<class07280> {
    private final class00392 header;
    private final class00392 footer;
    public static final class02362<class04247, class08082> N = class02362.N((class02362)class03748.u, class08082::N, (class02362)class03748.u, class08082::y, class08082::new);

    public class08082(class00392 class003922, class00392 class003923) {
        this.header = class003922;
        this.footer = class003923;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08082.class, "header;footer", "header", "footer"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08082.class, "header;footer", "header", "footer"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08082.class, "header;footer", "header", "footer"}, this);
    }

    public class00392 y() {
        return this.footer;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class00392 N() {
        return this.header;
    }

    public class02897<class08082> method_65080() {
        return class04248.yR;
    }
}

