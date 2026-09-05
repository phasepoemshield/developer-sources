/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class06584;

public final class class05303
extends Record {
    final int x;
    final int y;
    private final List<class06584> ingredients;

    public List<class06584> L() {
        return this.ingredients;
    }

    public class05303(int n, int n2, List<class06584> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Ingredient list must be non-empty");
        }
        this.x = n;
        this.y = n2;
        this.ingredients = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05303.class, "x;y;ingredients", "x", "y", "ingredients"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05303.class, "x;y;ingredients", "x", "y", "ingredients"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05303.class, "x;y;ingredients", "x", "y", "ingredients"}, this);
    }

    public int y() {
        return this.y;
    }

    public int N() {
        return this.x;
    }

    public class06584 N(int n) {
        return this.ingredients.get(n % this.ingredients.size());
    }
}

