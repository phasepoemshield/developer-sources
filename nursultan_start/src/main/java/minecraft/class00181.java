/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08529
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class01894;
import minecraft.class08529;

final class class00181
extends Record {
    private final class08529 missing;
    final Map<class01894, class08529> models;

    class00181(class08529 class085292, Map<class01894, class08529> map) {
        this.missing = class085292;
        this.models = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00181.class, "missing;models", "missing", "models"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00181.class, "missing;models", "missing", "models"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00181.class, "missing;models", "missing", "models"}, this);
    }

    public Map<class01894, class08529> y() {
        return this.models;
    }

    public class08529 N() {
        return this.missing;
    }
}

