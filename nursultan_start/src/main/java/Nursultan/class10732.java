/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class10732
extends Record {
    public int kindId;
    public long updatedAt;

    public int L() {
        return this.kindId;
    }

    public class10732(int n, long l) {
        this.kindId = n;
        this.updatedAt = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10732.class, "kindId;updatedAt", "kindId", "updatedAt"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10732.class, "kindId;updatedAt", "kindId", "updatedAt"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10732.class, "kindId;updatedAt", "kindId", "updatedAt"}, this);
    }

    public static class10732 y(class11940 class119402) {
        return new class10732(class119402.R(), class119402.M());
    }

    public long y() {
        return this.updatedAt;
    }

    public void N(class11940 class119402) {
        class119402.y(this.kindId);
        class119402.N(this.updatedAt);
    }

    public class09378 N() {
        return class09378.N((int)this.kindId);
    }
}

