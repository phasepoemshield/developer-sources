/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03264
 *  minecraft.class08503
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import minecraft.class03264;
import minecraft.class05390;
import minecraft.class05415;
import minecraft.class08503;

final class class05406
extends Record {
    final class05390 properties;
    final class03264 variant;

    class05406(class05390 class053902, class03264 class032642) {
        this.properties = class053902;
        this.variant = class032642;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05406.class, "properties;variant", "properties", "variant"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05406.class, "properties;variant", "properties", "variant"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05406.class, "properties;variant", "properties", "variant"}, this);
    }

    public class03264 y() {
        return this.variant;
    }

    public class05390 N() {
        return this.properties;
    }

    public Stream<class05406> N(class05415<class08503> class054152) {
        return class054152.N().entrySet().stream().map(entry -> {
            class05390 class053902 = this.properties.N((class05390)((Object)((Object)entry.getKey())));
            class03264 class032642 = this.variant.N((class08503)entry.getValue());
            return new class05406(class053902, class032642);
        });
    }

    public Stream<class05406> N(class08503 class085032) {
        return Stream.of(new class05406(this.properties, this.variant.N(class085032)));
    }
}

