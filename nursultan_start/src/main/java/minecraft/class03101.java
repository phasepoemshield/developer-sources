/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03781
 *  minecraft.class05081
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03781;
import minecraft.class05081;

public final class class03101
extends Record {
    private final class05081 worldData;
    private final class03781 dimensions;

    public class03101(class05081 class050812, class03781 class037812) {
        this.worldData = class050812;
        this.dimensions = class037812;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03101.class, "worldData;dimensions", "worldData", "dimensions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03101.class, "worldData;dimensions", "worldData", "dimensions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03101.class, "worldData;dimensions", "worldData", "dimensions"}, this);
    }

    public class03781 y() {
        return this.dimensions;
    }

    public class05081 N() {
        return this.worldData;
    }
}

