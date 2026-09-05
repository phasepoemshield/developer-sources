/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  Nursultan.class11942
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11940;
import Nursultan.class11942;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09264
extends Record
implements class11942 {
    public long presetId;

    public class09264(long l) {
        this.presetId = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09264.class, "presetId", "presetId"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09264.class, "presetId", "presetId"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09264.class, "presetId", "presetId"}, this);
    }

    public static class09264 y(class11940 class119402) {
        return new class09264(class119402.M());
    }

    public long N() {
        return this.presetId;
    }

    public void N(class11940 class119402) {
        class119402.N(this.presetId);
    }
}

