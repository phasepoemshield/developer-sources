/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public final class class04622
extends Record
implements class00381<class07280> {
    private final int sequence;
    public static final class02362<class00667, class04622> N = class00381.N(class04622::N, class04622::new);

    private class04622(class00667 class006672) {
        this(class006672.E());
    }

    public class04622(int n) {
        this.sequence = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04622.class, "sequence", "sequence"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04622.class, "sequence", "sequence"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04622.class, "sequence", "sequence"}, this);
    }

    public int N() {
        return this.sequence;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class006672.L(this.sequence);
    }

    public class02897<class04622> method_65080() {
        return class04248.R;
    }
}

