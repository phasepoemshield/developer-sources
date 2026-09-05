/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01622
 *  minecraft.class03652
 */
package minecraft;

import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01622;
import minecraft.class03652;

final class class01063
extends Record {
    final class01622 packResources;
    final class03652<InputStream> resource;
    final int packIndex;

    public int L() {
        return this.packIndex;
    }

    class01063(class01622 class016222, class03652<InputStream> class036522, int n) {
        this.packResources = class016222;
        this.resource = class036522;
        this.packIndex = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01063.class, "packResources;resource;packIndex", "packResources", "resource", "packIndex"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01063.class, "packResources;resource;packIndex", "packResources", "resource", "packIndex"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01063.class, "packResources;resource;packIndex", "packResources", "resource", "packIndex"}, this);
    }

    public class03652<InputStream> y() {
        return this.resource;
    }

    public class01622 N() {
        return this.packResources;
    }
}

