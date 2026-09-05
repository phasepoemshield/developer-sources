/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class07001
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00500;
import minecraft.class07001;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public final class class00904
extends Record {
    private final class00500 blockState;
    private final Map<class08092<?>, Comparable<?>> properties;
    private final @Nullable class07001 nbt;

    public @Nullable class07001 L() {
        return this.nbt;
    }

    public class00904(class00500 class005002, Map<class08092<?>, Comparable<?>> map, @Nullable class07001 class070012) {
        this.blockState = class005002;
        this.properties = map;
        this.nbt = class070012;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00904.class, "blockState;properties;nbt", "blockState", "properties", "nbt"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00904.class, "blockState;properties;nbt", "blockState", "properties", "nbt"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00904.class, "blockState;properties;nbt", "blockState", "properties", "nbt"}, this);
    }

    public Map<class08092<?>, Comparable<?>> y() {
        return this.properties;
    }

    public class00500 N() {
        return this.blockState;
    }
}

