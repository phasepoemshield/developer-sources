/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class06251
 *  minecraft.class06262
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import minecraft.class01894;
import minecraft.class06251;
import minecraft.class06262;

final class class04843
extends Record {
    private final Map<class01894, List<class06251>> fontSets;
    final List<class06262> allProviders;

    class04843(Map<class01894, List<class06251>> map, List<class06262> list) {
        this.fontSets = map;
        this.allProviders = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04843.class, "fontSets;allProviders", "fontSets", "allProviders"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04843.class, "fontSets;allProviders", "fontSets", "allProviders"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04843.class, "fontSets;allProviders", "fontSets", "allProviders"}, this);
    }

    public List<class06262> y() {
        return this.allProviders;
    }

    public Map<class01894, List<class06251>> N() {
        return this.fontSets;
    }
}

