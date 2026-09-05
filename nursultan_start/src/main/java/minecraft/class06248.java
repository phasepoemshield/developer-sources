/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00912
 *  minecraft.class00947
 *  minecraft.class05237
 *  minecraft.class05247
 *  minecraft.class06267
 *  minecraft.class07948
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00912;
import minecraft.class00947;
import minecraft.class05237;
import minecraft.class05247;
import minecraft.class06235;
import minecraft.class06257;
import minecraft.class06267;
import minecraft.class07948;

final class class06248
extends Record
implements class00947 {
    final class06267 contents;
    final int left;
    final int right;

    public class06267 L() {
        return this.contents;
    }

    class06248(class06267 class062672, int n, int n2) {
        this.contents = class062672;
        this.left = n;
        this.right = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06248.class, "contents;left;right", "contents", "left", "right"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06248.class, "contents;left;right", "contents", "left", "right"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06248.class, "contents;left;right", "contents", "left", "right"}, this);
    }

    public int i() {
        return this.right;
    }

    public int u() {
        return this.left;
    }

    public int y() {
        return this.right - this.left + 1;
    }

    public class05247 N() {
        return new class06257(this);
    }

    public class07948 N(class00912 class009122) {
        return class009122.N(this.N(), (class05237)new class06235(this));
    }
}

