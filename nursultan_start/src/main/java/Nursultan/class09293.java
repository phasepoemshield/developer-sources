/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09279
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09279;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09293
extends Record
implements class09279 {
    public long id;

    public class09293(long l) {
        this.id = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09293.class, "id", "id"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09293.class, "id", "id"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09293.class, "id", "id"}, this);
    }

    public void y(class11940 class119402) {
        class119402.N(this.id);
    }

    public static class09293 N(class11940 class119402) {
        return new class09293(class119402.M());
    }

    public long N() {
        return this.id;
    }
}

