/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11940;
import Nursultan.class11946;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class11941
extends Record
implements class11946 {
    public int formatVersion;
    public byte[] data;
    public long id;

    public long L() {
        return this.id;
    }

    public class11941(long l, int n, byte[] byArray) {
        this.id = l;
        this.formatVersion = n;
        this.data = byArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11941.class, "id;formatVersion;data", "id", "formatVersion", "data"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11941.class, "id;formatVersion;data", "id", "formatVersion", "data"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11941.class, "id;formatVersion;data", "id", "formatVersion", "data"}, this);
    }

    public byte[] y() {
        return this.data;
    }

    public static class11941 y(class11940 class119402) {
        return new class11941(class119402.M(), class119402.R(), class119402.u(0x100000));
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N(this.id);
        class119402.y(this.formatVersion);
        class119402.N(this.data);
    }

    public int N() {
        return this.formatVersion;
    }
}

