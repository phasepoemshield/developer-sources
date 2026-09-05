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
 *  minecraft.class07321
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
import minecraft.class07321;

public final class class00481
extends Record
implements class00381<class07280> {
    private final class07321 pos;
    public static final class02362<class00667, class00481> N = class00381.N(class00481::N, class00481::new);

    private class00481(class00667 class006672) {
        this(class006672.R());
    }

    public class00481(class07321 class073212) {
        this.pos = class073212;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00481.class, "pos", "pos"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00481.class, "pos", "pos"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00481.class, "pos", "pos"}, this);
    }

    public class07321 N() {
        return this.pos;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class006672.N(this.pos);
    }

    public class02897<class00481> method_65080() {
        return class04248.K;
    }
}

