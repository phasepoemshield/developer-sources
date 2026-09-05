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

public non-sealed class class11960
extends Record
implements class11981 {
    public int kindId;

    public class11960(int n) {
        this.kindId = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11960.class, "kindId", "kindId"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11960.class, "kindId", "kindId"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11960.class, "kindId", "kindId"}, this);
    }

    public static class11960 y(class11940 class119402) {
        return new class11960(class119402.R());
    }

    public int N() {
        return this.kindId;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(this.kindId);
    }
}

