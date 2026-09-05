/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11652;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class11654
extends Record
implements class11652 {
    public final String target;

    public class11654(String string) {
        this.target = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11654.class, "target", "target"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11654.class, "target", "target"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11654.class, "target", "target"}, this);
    }

    public String N() {
        return this.target;
    }
}

