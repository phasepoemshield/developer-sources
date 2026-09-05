/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02017
 *  minecraft.class03516
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class02017;
import minecraft.class03516;

public final class class02982
extends Record {
    final List<class02017> elements;
    final class03516 tags;

    public class02982(List<class02017> list, class03516 class035162) {
        this.elements = list;
        this.tags = class035162;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02982.class, "elements;tags", "elements", "tags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02982.class, "elements;tags", "elements", "tags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02982.class, "elements;tags", "elements", "tags"}, this);
    }

    public class03516 y() {
        return this.tags;
    }

    public List<class02017> N() {
        return this.elements;
    }
}

