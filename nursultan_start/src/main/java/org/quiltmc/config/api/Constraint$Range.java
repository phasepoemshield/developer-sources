/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api;

import java.util.Comparator;
import java.util.Optional;
import org.quiltmc.config.api.Constraint;

public final class Constraint$Range
implements Constraint {
    private final Object min;
    private final Object max;
    private final Comparator comparator;

    public Constraint$Range(Object object, Object object2, Comparator comparator) {
        this.min = object;
        this.max = object2;
        this.comparator = comparator;
    }

    public Object min() {
        return this.min;
    }

    public Object max() {
        return this.max;
    }

    @Override
    public Optional test(Object object) {
        int n = ((Constraint$Range)object2).comparator.compare(((Constraint$Range)object2).max, object);
        if (((Constraint$Range)object2).comparator.compare(((Constraint$Range)object2).min, object) <= 0 && n >= 0) {
            return Optional.empty();
        }
        Constraint$Range constraint$Range = object2;
        Object object2 = constraint$Range.min;
        Object object3 = constraint$Range.max;
        Object[] objectArray = new Object[3];
        Object[] objectArray2 = objectArray;
        objectArray[0] = object;
        objectArray[1] = object2;
        objectArray[2] = object3;
        return Optional.of(String.format("Value '%s' outside of range [%s, %s]", objectArray2));
    }

    @Override
    public String getRepresentation() {
        return "range: " + this.min + " - " + this.max;
    }
}

