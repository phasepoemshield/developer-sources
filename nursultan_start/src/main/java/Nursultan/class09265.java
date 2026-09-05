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

public non-sealed class class09265
extends Record
implements class09260 {
    public int errorCode;
    public int kindId;

    public class09265(int n, int n2) {
        this.kindId = n;
        this.errorCode = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09265.class, "kindId;errorCode", "kindId", "errorCode"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09265.class, "kindId;errorCode", "kindId", "errorCode"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09265.class, "kindId;errorCode", "kindId", "errorCode"}, this);
    }

    public int y() {
        return this.kindId;
    }

    public static class09265 y(class11940 class119402) {
        return new class09265(class119402.R(), class119402.R());
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(this.kindId);
        class119402.y(this.errorCode);
    }

    public int N() {
        return this.errorCode;
    }
}

