/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03543
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00891;
import minecraft.class03543;
import minecraft.class07001;
import org.jspecify.annotations.Nullable;

public final class class00896
extends Record {
    private final class03543<class00891> tag;
    private final Map<String, String> vagueProperties;
    private final @Nullable class07001 nbt;

    public @Nullable class07001 L() {
        return this.nbt;
    }

    public class00896(class03543<class00891> class035432, Map<String, String> map, @Nullable class07001 class070012) {
        this.tag = class035432;
        this.vagueProperties = map;
        this.nbt = class070012;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00896.class, "tag;vagueProperties;nbt", "tag", "vagueProperties", "nbt"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00896.class, "tag;vagueProperties;nbt", "tag", "vagueProperties", "nbt"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00896.class, "tag;vagueProperties;nbt", "tag", "vagueProperties", "nbt"}, this);
    }

    public Map<String, String> y() {
        return this.vagueProperties;
    }

    public class03543<class00891> N() {
        return this.tag;
    }
}

