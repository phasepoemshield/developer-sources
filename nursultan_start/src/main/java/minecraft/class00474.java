/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00428;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class00474
extends Record
implements class00381<class07280> {
    private final class00428<?> event;
    public static final class02362<class04247, class00474> N = class02362.N(class00428.N, class00474::N, class00474::new);

    public class00474(class00428<?> class004282) {
        this.event = class004282;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00474.class, "event", "event"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00474.class, "event", "event"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00474.class, "event", "event"}, this);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class00428<?> N() {
        return this.event;
    }

    public class02897<class00474> method_65080() {
        return class04248.Q;
    }
}

