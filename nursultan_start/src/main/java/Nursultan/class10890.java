/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11328
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11328;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class10890
extends Record {
    public class11328 filter;
    public boolean jump;
    public int pitch;
    public int delayAfter;

    public int L() {
        return this.pitch;
    }

    class10890(class11328 class113282, int n, boolean bl, int n2) {
        this.filter = class113282;
        this.pitch = n;
        this.jump = bl;
        this.delayAfter = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10890.class, "filter;pitch;jump;delayAfter", "filter", "pitch", "jump", "delayAfter"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10890.class, "filter;pitch;jump;delayAfter", "filter", "pitch", "jump", "delayAfter"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10890.class, "filter;pitch;jump;delayAfter", "filter", "pitch", "jump", "delayAfter"}, this);
    }

    public int u() {
        return this.delayAfter;
    }

    public class11328 y() {
        return this.filter;
    }

    public boolean N() {
        return this.jump;
    }
}

