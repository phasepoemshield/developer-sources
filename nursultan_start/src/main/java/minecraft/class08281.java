/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class08092
 *  minecraft.class08889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00500;
import minecraft.class08092;
import minecraft.class08889;

final class class08281
extends Record {
    private final Object equalityGroup;
    private final List<Object> coloringValues;

    private class08281(Object object, List<Object> list) {
        this.equalityGroup = object;
        this.coloringValues = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08281.class, "equalityGroup;coloringValues", "equalityGroup", "coloringValues"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08281.class, "equalityGroup;coloringValues", "equalityGroup", "coloringValues"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08281.class, "equalityGroup;coloringValues", "equalityGroup", "coloringValues"}, this);
    }

    public List<Object> y() {
        return this.coloringValues;
    }

    private static List<Object> N(class00500 class005002, List<class08092<?>> list) {
        Object[] objectArray = new Object[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            objectArray[i] = class005002.L(list.get(i));
        }
        return List.of(objectArray);
    }

    public Object N() {
        return this.equalityGroup;
    }

    public static class08281 N(class00500 class005002, class08889 class088892, List<class08092<?>> list) {
        List<Object> var3 = class08281.N(class005002, list);
        Object object = class088892.method_62332(class005002);
        return new class08281(object, var3);
    }
}

