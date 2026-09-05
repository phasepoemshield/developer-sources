/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11940;
import Nursultan.class11942;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class11972
extends Record
implements class11942 {
    public byte[] token;

    public class11972(byte[] byArray) {
        this.token = byArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11972.class, "token", "token"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11972.class, "token", "token"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11972.class, "token", "token"}, this);
    }

    public static class11972 y(class11940 class119402) {
        return new class11972(class119402.u(64));
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N(this.token);
    }

    public byte[] N() {
        return this.token;
    }
}

