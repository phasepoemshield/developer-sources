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

public final class class06595
extends Record
implements class06611 {
    private final int button;
    private final int modifiers;

    public class06595(int n, int n2) {
        this.button = n;
        this.modifiers = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06595.class, "button;modifiers", "button", "modifiers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06595.class, "button;modifiers", "button", "modifiers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06595.class, "button;modifiers", "button", "modifiers"}, this);
    }

    public int v() {
        return this.button;
    }

    @Override
    public int y() {
        return this.modifiers;
    }

    @Override
    public int N() {
        return this.button;
    }
}

