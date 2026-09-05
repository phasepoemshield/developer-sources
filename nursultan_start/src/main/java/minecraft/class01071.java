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

final class class01071
extends Record {
    final class01622 source;
    final class03652<InputStream> resource;

    class01071(class01622 class016222, class03652<InputStream> class036522) {
        this.source = class016222;
        this.resource = class036522;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01071.class, "source;resource", "source", "resource"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01071.class, "source;resource", "source", "resource"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01071.class, "source;resource", "source", "resource"}, this);
    }

    public class03652<InputStream> y() {
        return this.resource;
    }

    public class01622 N() {
        return this.source;
    }
}

