/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05018
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05018;

public final class class06626
extends Record {
    private final int codepoint;
    private final int modifiers;

    public int L() {
        return this.codepoint;
    }

    public class06626(int n, int n2) {
        this.codepoint = n;
        this.modifiers = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06626.class, "codepoint;modifiers", "codepoint", "modifiers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06626.class, "codepoint;modifiers", "codepoint", "modifiers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06626.class, "codepoint;modifiers", "codepoint", "modifiers"}, this);
    }

    public int u() {
        return this.modifiers;
    }

    public boolean y() {
        return class05018.N((int)this.codepoint);
    }

    public String N() {
        return Character.toString(this.codepoint);
    }
}

