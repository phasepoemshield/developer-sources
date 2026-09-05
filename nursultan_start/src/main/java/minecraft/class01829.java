/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07529
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07529;

public final class class01829
extends Record {
    private final int version;
    private final String series;
    public static final String N = "main";

    public String L() {
        return this.series;
    }

    public class01829(int n, String string) {
        this.version = n;
        this.series = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01829.class, "version;series", "version", "series"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01829.class, "version;series", "version", "series"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01829.class, "version;series", "version", "series"}, this);
    }

    public int y() {
        return this.version;
    }

    public boolean N() {
        return !this.series.equals(N);
    }

    public boolean N(class01829 class018292) {
        if (class07529.v) {
            return true;
        }
        return this.L().equals(class018292.L());
    }
}

