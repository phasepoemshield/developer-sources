/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04823
 *  minecraft.class06581
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class04823;
import minecraft.class06581;

public final class class04835
extends Record {
    private final String name;
    private final Map<class06581, class04823> map;

    public class04835(String string, Map<class06581, class04823> map) {
        this.name = string;
        this.map = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04835.class, "name;map", "name", "map"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04835.class, "name;map", "name", "map"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04835.class, "name;map", "name", "map"}, this);
    }

    public Map<class06581, class04823> y() {
        return this.map;
    }

    public String N() {
        return this.name;
    }
}

