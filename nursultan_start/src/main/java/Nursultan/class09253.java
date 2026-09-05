/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11794
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09282;
import Nursultan.class11794;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class09253
extends Record
implements class09282 {
    public int outcome;
    public String presetName;
    public String creator;

    public int L() {
        return this.outcome;
    }

    public class09253(int n, String string, String string2) {
        this.outcome = n;
        this.presetName = string;
        this.creator = string2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09253.class, "outcome;presetName;creator", "outcome", "presetName", "creator"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09253.class, "outcome;presetName;creator", "outcome", "presetName", "creator"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09253.class, "outcome;presetName;creator", "outcome", "presetName", "creator"}, this);
    }

    public String y() {
        return this.creator;
    }

    public static class09253 y(class11940 class119402) {
        return new class09253(class119402.R(), class119402.P(), class119402.P());
    }

    private int N(short s) {
        if (s < 16 && this.outcome == class11794.UPDATED.N()) {
            return class11794.ALREADY_ACTIVATED.N();
        }
        return this.outcome;
    }

    public String N() {
        return this.presetName;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(this.N(class119402.z()));
        class119402.N(this.presetName);
        class119402.N(this.creator);
    }
}

