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
import minecraft.class06611;

public final class class06601
extends Record
implements class06611 {
    private final int key;
    private final int scancode;
    private final int modifiers;

    public class06601(int n, int n2, int n3) {
        this.key = n;
        this.scancode = n2;
        this.modifiers = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06601.class, "key;scancode;modifiers", "key", "scancode", "modifiers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06601.class, "key;scancode;modifiers", "key", "scancode", "modifiers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06601.class, "key;scancode;modifiers", "key", "scancode", "modifiers"}, this);
    }

    public int n() {
        return this.scancode;
    }

    public int v() {
        return this.key;
    }

    @Override
    public int y() {
        return this.modifiers;
    }

    @Override
    public int N() {
        return this.key;
    }
}

