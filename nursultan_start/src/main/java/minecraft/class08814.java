/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11652
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import Nursultan.class11652;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public final class class08814
extends Record {
    final Map<String, class11652> values;
    public static final class08814 y = new class08814(Map.of());

    public class08814(Map<String, class11652> map) {
        this.values = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08814.class, "values", "values"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08814.class, "values", "values"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08814.class, "values", "values"}, this);
    }

    public Map<String, class11652> N() {
        return this.values;
    }
}

