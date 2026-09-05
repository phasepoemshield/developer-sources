/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class01763
 *  minecraft.class04604
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.HashSet;
import java.util.Set;
import minecraft.class00143;
import minecraft.class00667;
import minecraft.class01763;
import minecraft.class04604;

public final class class00138
extends Record {
    private final class01763[] openSet;
    private final class01763[] closedSet;
    final Set<class04604> targetNodes;

    public Set<class04604> L() {
        return this.targetNodes;
    }

    public class00138(class01763[] class01763Array, class01763[] class01763Array2, Set<class04604> set) {
        this.openSet = class01763Array;
        this.closedSet = class01763Array2;
        this.targetNodes = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00138.class, "openSet;closedSet;targetNodes", "openSet", "closedSet", "targetNodes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00138.class, "openSet;closedSet;targetNodes", "openSet", "closedSet", "targetNodes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00138.class, "openSet;closedSet;targetNodes", "openSet", "closedSet", "targetNodes"}, this);
    }

    public class01763[] y() {
        return this.closedSet;
    }

    public static class00138 y(class00667 class006672) {
        HashSet hashSet = (HashSet)class006672.N_15(HashSet::new, class04604::N);
        class01763[] class01763Array = class00143.L(class006672);
        class01763[] class01763Array2 = class00143.L(class006672);
        return new class00138(class01763Array, class01763Array2, hashSet);
    }

    public void N(class00667 class006673) {
        class006673.N_12(this.targetNodes, (class006672, class046042) -> class046042.y(class006672));
        class00143.N(class006673, this.openSet);
        class00143.N(class006673, this.closedSet);
    }

    public class01763[] N() {
        return this.openSet;
    }
}

