/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class02960;
import minecraft.class02973;

public final class class02994
extends Record
implements class02960 {
    private final Map<String, class02973> children;

    public class02994(Map<String, class02973> map) {
        this.children = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02994.class, "children", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02994.class, "children", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02994.class, "children", "children"}, this);
    }

    public Map<String, class02973> N() {
        return this.children;
    }
}

