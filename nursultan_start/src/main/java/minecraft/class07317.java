/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class07304;

public final class class07317
extends Record {
    private final class03556<class07304> enchantment;
    private final int level;

    public int L() {
        return this.level;
    }

    public class07317(class03556<class07304> class035562, int n) {
        this.enchantment = class035562;
        this.level = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07317.class, "enchantment;level", "enchantment", "level"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07317.class, "enchantment;level", "enchantment", "level"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07317.class, "enchantment;level", "enchantment", "level"}, this);
    }

    public class03556<class07304> y() {
        return this.enchantment;
    }

    public int N() {
        return ((class07304)((Object)this.y().N())).y();
    }
}

