/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11940;
import Nursultan.class11981;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class11969
extends Record
implements class11981 {
    public byte[] data;
    public int kindId;

    public class11969(int n, byte[] byArray) {
        this.kindId = n;
        this.data = byArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11969.class, "kindId;data", "kindId", "data"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11969.class, "kindId;data", "kindId", "data"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11969.class, "kindId;data", "kindId", "data"}, this);
    }

    public static class11969 y(class11940 class119402) {
        return new class11969(class119402.R(), class119402.u(262144));
    }

    public int y() {
        return this.kindId;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(this.kindId);
        class119402.N(this.data);
    }

    public byte[] N() {
        return this.data;
    }
}

