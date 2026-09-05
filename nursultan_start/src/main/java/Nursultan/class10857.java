/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07924
 *  minecraft.class07931
 *  minecraft.class07940
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07924;
import minecraft.class07931;
import minecraft.class07940;

public final class class10857
extends Record
implements class07940<Void, Void> {
    private final class07931<Void, Void> info;
    private final class07924 attributes;

    public class10857(class07931<Void, Void> class079312, class07924 class079242) {
        this.info = class079312;
        this.attributes = class079242;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10857.class, "info;attributes", "info", "attributes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10857.class, "info;attributes", "info", "attributes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10857.class, "info;attributes", "info", "attributes"}, this);
    }

    public class07924 y() {
        return this.attributes;
    }

    public class07931<Void, Void> N() {
        return this.info;
    }
}

