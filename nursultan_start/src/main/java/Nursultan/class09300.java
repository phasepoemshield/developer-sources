/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09282
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09282;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09300
extends Record
implements class09282 {
    public long presetId;

    public class09300(long l) {
        this.presetId = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09300.class, "presetId", "presetId"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09300.class, "presetId", "presetId"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09300.class, "presetId", "presetId"}, this);
    }

    public static class09300 y(class11940 class119402) {
        return new class09300(class119402.M());
    }

    public void N(class11940 class119402) {
        class119402.N(this.presetId);
    }

    public long N() {
        return this.presetId;
    }
}

