/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09282;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public non-sealed class class09284
extends Record
implements class09282 {
    public long presetId;
    public int errorCode;

    public class09284(long l, int n) {
        this.presetId = l;
        this.errorCode = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09284.class, "presetId;errorCode", "presetId", "errorCode"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09284.class, "presetId;errorCode", "presetId", "errorCode"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09284.class, "presetId;errorCode", "presetId", "errorCode"}, this);
    }

    public long y() {
        return this.presetId;
    }

    public static class09284 y(class11940 class119402) {
        return new class09284(class119402.M(), class119402.R());
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N(this.presetId);
        class119402.y(this.errorCode);
    }

    public int N() {
        return this.errorCode;
    }
}

