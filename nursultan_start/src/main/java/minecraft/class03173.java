/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01424
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashMap;
import java.util.Map;
import minecraft.class01424;
import minecraft.class03152;

public final class class03173
extends Record {
    private final int depth;
    private final Map<String, class01424<?>> selectedFields;
    private final Map<String, class03173> fieldsToRecurse;

    public Map<String, class01424<?>> L() {
        return this.selectedFields;
    }

    private class03173(int n) {
        this(n, new HashMap(), new HashMap<String, class03173>());
    }

    public class03173(int n, Map<String, class01424<?>> map, Map<String, class03173> map2) {
        this.depth = n;
        this.selectedFields = map;
        this.fieldsToRecurse = map2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03173.class, "depth;selectedFields;fieldsToRecurse", "depth", "selectedFields", "fieldsToRecurse"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03173.class, "depth;selectedFields;fieldsToRecurse", "depth", "selectedFields", "fieldsToRecurse"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03173.class, "depth;selectedFields;fieldsToRecurse", "depth", "selectedFields", "fieldsToRecurse"}, this);
    }

    public Map<String, class03173> u() {
        return this.fieldsToRecurse;
    }

    public int y() {
        return this.depth;
    }

    public static class03173 N() {
        return new class03173(1);
    }

    public void N(class03152 class031522) {
        if (this.depth <= class031522.N().size()) {
            this.fieldsToRecurse.computeIfAbsent(class031522.N().get(this.depth - 1), string -> new class03173(this.depth + 1)).N(class031522);
        } else {
            this.selectedFields.put(class031522.L(), class031522.y());
        }
    }

    public boolean N(class01424<?> class014242, String string) {
        return class014242.equals(this.L().get(string));
    }
}

