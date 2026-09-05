/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09260;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class09275
extends Record
implements class09260 {
    public int kindId;
    public long updatedAt;
    public byte[] data;

    public long L() {
        return this.updatedAt;
    }

    public class09275(int n, long l, byte[] byArray) {
        this.kindId = n;
        this.updatedAt = l;
        this.data = byArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09275.class, "kindId;updatedAt;data", "kindId", "updatedAt", "data"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09275.class, "kindId;updatedAt;data", "kindId", "updatedAt", "data"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09275.class, "kindId;updatedAt;data", "kindId", "updatedAt", "data"}, this);
    }

    public static class09275 y(class11940 class119402) {
        return new class09275(class119402.R(), class119402.M(), class119402.u(262144));
    }

    public int y() {
        return this.kindId;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(this.kindId);
        class119402.N(this.updatedAt);
        class119402.N(this.data);
    }

    public byte[] N() {
        return this.data;
    }
}

