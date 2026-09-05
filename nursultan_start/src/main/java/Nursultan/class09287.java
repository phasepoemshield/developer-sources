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

public non-sealed class class09287
extends Record
implements class09260 {
    public int kindId;
    public long updatedAt;

    public class09287(int n, long l) {
        this.kindId = n;
        this.updatedAt = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09287.class, "kindId;updatedAt", "kindId", "updatedAt"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09287.class, "kindId;updatedAt", "kindId", "updatedAt"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09287.class, "kindId;updatedAt", "kindId", "updatedAt"}, this);
    }

    public int y() {
        return this.kindId;
    }

    public static class09287 y(class11940 class119402) {
        return new class09287(class119402.R(), class119402.M());
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(this.kindId);
        class119402.N(this.updatedAt);
    }

    public long N() {
        return this.updatedAt;
    }
}

