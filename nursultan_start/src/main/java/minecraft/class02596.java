/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class06584
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class06584;
import minecraft.class07280;

public final class class02596
extends Record
implements class00381<class07280> {
    private final int slot;
    private final class06584 contents;
    public static final class02362<class04247, class02596> N = class02362.N((class02362)class02389.B, class02596::N, (class02362)class06584.B, class02596::y, class02596::new);

    public class02596(int n, class06584 class065842) {
        this.slot = n;
        this.contents = class065842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02596.class, "slot;contents", "slot", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02596.class, "slot;contents", "slot", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02596.class, "slot;contents", "slot", "contents"}, this);
    }

    public class06584 y() {
        return this.contents;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public int N() {
        return this.slot;
    }

    public class02897<class02596> method_65080() {
        return class04248.Lk;
    }
}

