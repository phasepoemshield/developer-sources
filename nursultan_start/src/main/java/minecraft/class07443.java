/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04891
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04891;

public class class07443
extends Record {
    public class04891 big;
    public class04891 small;

    public class07443(class04891 class048912, class04891 class048913) {
        this.small = class048912;
        this.big = class048913;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07443.class, "small;big", "small", "big"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07443.class, "small;big", "small", "big"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07443.class, "small;big", "small", "big"}, this);
    }

    public class04891 y() {
        return this.small;
    }

    public class04891 N() {
        return this.big;
    }
}

