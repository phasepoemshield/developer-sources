/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.IntComparators$OppositeComparator
 */
package com.viaversion.viaversion.libs.fastutil.ints;

import com.viaversion.viaversion.libs.fastutil.ints.IntComparator;
import com.viaversion.viaversion.libs.fastutil.ints.IntComparators;
import java.io.Serializable;
import java.util.Comparator;

public final class IntComparators {
    public static final IntComparator NATURAL_COMPARATOR = new NaturalImplicitComparator();
    public static final IntComparator OPPOSITE_COMPARATOR = new OppositeImplicitComparator();

    private IntComparators() {
    }

    public static IntComparator oppositeComparator(IntComparator c) {
        if (c instanceof OppositeComparator) {
            return ((OppositeComparator)c).comparator;
        }
        return new OppositeComparator(c);
    }

    public static IntComparator asIntComparator(Comparator<? super Integer> c) {
        if (c == null || c instanceof IntComparator) {
            return (IntComparator)c;
        }
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    protected static class NaturalImplicitComparator
    implements IntComparator,
    Serializable {
        private static final long serialVersionUID = 1L;

        private Object readResolve() {
            return NATURAL_COMPARATOR;
        }

        protected NaturalImplicitComparator() {
        }

        @Override
        public final int compare(int a, int b) {
            return Integer.compare(a, b);
        }

        @Override
        public IntComparator reversed() {
            return OPPOSITE_COMPARATOR;
        }
    }

    protected static class OppositeImplicitComparator
    implements IntComparator,
    Serializable {
        private static final long serialVersionUID = 1L;

        private Object readResolve() {
            return OPPOSITE_COMPARATOR;
        }

        protected OppositeImplicitComparator() {
        }

        @Override
        public final int compare(int a, int b) {
            return -Integer.compare(a, b);
        }

        @Override
        public IntComparator reversed() {
            return NATURAL_COMPARATOR;
        }
    }
}

