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
import minecraft.class02350;

public final class class02333<S>
extends Record {
    private final int cursor;
    private final class02350<S> suggestions;
    private final Object reason;

    public Object L() {
        return this.reason;
    }

    public class02333(int n, class02350<S> class023502, Object object) {
        this.cursor = n;
        this.suggestions = class023502;
        this.reason = object;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02333.class, "cursor;suggestions;reason", "cursor", "suggestions", "reason"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02333.class, "cursor;suggestions;reason", "cursor", "suggestions", "reason"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02333.class, "cursor;suggestions;reason", "cursor", "suggestions", "reason"}, this);
    }

    public class02350<S> y() {
        return this.suggestions;
    }

    public int N() {
        return this.cursor;
    }
}

