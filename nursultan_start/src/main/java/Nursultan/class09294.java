/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09282
 *  Nursultan.class11789
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09282;
import Nursultan.class11789;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09294
extends Record
implements class09282 {
    public class11789 share;

    public class09294(class11789 class117892) {
        this.share = class117892;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09294.class, "share", "share"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09294.class, "share", "share"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09294.class, "share", "share"}, this);
    }

    public static class09294 y(class11940 class119402) {
        return new class09294(class11789.N((class11940)class119402));
    }

    public class11789 N() {
        return this.share;
    }

    public void N(class11940 class119402) {
        this.share.y(class119402);
    }
}

