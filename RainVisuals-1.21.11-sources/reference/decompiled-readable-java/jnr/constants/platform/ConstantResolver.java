/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import java.lang.reflect.Array;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import jnr.constants.Constant;
import jnr.constants.ConstantSet;
import jnr.constants.PlatformConstants;

class ConstantResolver<E extends Enum<E>> {
    private Constant[] cache = null;
    private final Class<E> enumType;
    public static final String __UNKNOWN_CONSTANT__ = "__UNKNOWN_CONSTANT__";
    private volatile int cacheGuard = 0;
    private final Object modLock = new Object();
    private final boolean bitmask;
    private final AtomicLong nextUnknown;
    private volatile ConstantSet constants;
    private final Map<Long, E> reverseLookupMap = new ConcurrentHashMap<Long, E>();
    private volatile E[] valueCache = null;

    /*
     * WARNING - void declaration
     */
    final E valueOf(long value) {
        Enum e;
        if (value >= 0L && value < 256L && this.valueCache != null && (e = this.valueCache[(int)value]) != null) {
            return (E)e;
        }
        e = (Enum)this.reverseLookupMap.get(value);
        if (e != null) {
            return (E)e;
        }
        Constant c = this.getConstants().getConstant(value);
        if (c != null) {
            try {
                e = Enum.valueOf(this.enumType, c.name());
                this.reverseLookupMap.put(value, e);
                if (c.intValue() >= 0 && c.intValue() < 256) {
                    void var5_4;
                    Object[] values2 = this.valueCache;
                    if (values2 == null) {
                        values2 = (Enum[])Array.newInstance(this.enumType, 256);
                    }
                    values2[c.intValue()] = e;
                    this.valueCache = var5_4;
                }
                return (E)e;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        return Enum.valueOf(this.enumType, __UNKNOWN_CONSTANT__);
    }

    final String description(E e) {
        return this.getConstant(e).toString();
    }

    private ConstantResolver(Class<E> enumType, int firstUnknown, int lastUnknown, boolean bitmask) {
        this.enumType = enumType;
        this.nextUnknown = new AtomicLong(firstUnknown);
        this.bitmask = bitmask;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private Constant lookupAndCacheConstant(E e) {
        Object object = this.modLock;
        synchronized (object) {
            void var1_1;
            Constant c;
            if (this.cacheGuard != 0 && (c = this.cache[((Enum)e).ordinal()]) != null) {
                return c;
            }
            EnumSet<Enum> enums = EnumSet.allOf(this.enumType);
            ConstantSet cset = this.getConstants();
            if (this.cache == null) {
                this.cache = new Constant[enums.size()];
            }
            long known = 0L;
            long unknown = 0L;
            for (Enum v : enums) {
                void var3_3;
                c = cset.getConstant(v.name());
                if (c == null) {
                    if (this.bitmask) {
                        unknown |= 1L << v.ordinal();
                        c = new UnknownConstant(0L, v.name());
                    } else {
                        c = new UnknownConstant(this.nextUnknown.getAndAdd(1L), v.name());
                    }
                } else if (this.bitmask) {
                    known |= c.longValue();
                }
                this.cache[var11_10.ordinal()] = var3_3;
            }
            if (this.bitmask) {
                long mask = 0L;
                while (true) {
                    void var12_11;
                    mask = Long.lowestOneBit(unknown);
                    if (mask == 0L) break;
                    int index = Long.numberOfTrailingZeros(mask);
                    int sparebit = Long.numberOfTrailingZeros(Long.lowestOneBit(known ^ 0xFFFFFFFFFFFFFFFFL));
                    int value = 1 << sparebit;
                    this.cache[index] = new UnknownConstant(value, this.cache[index].name());
                    known |= (long)value;
                    unknown &= 1L << var12_11 ^ 0xFFFFFFFFFFFFFFFFL;
                }
            }
            this.cacheGuard = 1;
            return this.cache[var1_1.ordinal()];
        }
    }

    final boolean defined(E e) {
        return this.getConstant(e).defined();
    }

    final long longValue(E e) {
        return this.getConstant(e).longValue();
    }

    static <T extends Enum<T>> ConstantResolver<T> getBitmaskResolver(Class<T> enumType) {
        return new ConstantResolver<T>(enumType, 0, Integer.MIN_VALUE, true);
    }

    static <T extends Enum<T>> ConstantResolver<T> getResolver(Class<T> enumType, int first, int last) {
        return new ConstantResolver<T>(enumType, first, last, false);
    }

    private ConstantSet getConstants() {
        if (this.constants == null) {
            this.constants = ConstantSet.getConstantSet(this.enumType.getSimpleName());
            if (this.constants == null) {
                throw new RuntimeException("Could not load platform constants for " + this.enumType.getSimpleName());
            }
        }
        return this.constants;
    }

    private ConstantResolver(Class<E> enumType) {
        this(enumType, Integer.MIN_VALUE, -2147482648, false);
    }

    final int intValue(E e) {
        return this.getConstant(e).intValue();
    }

    private Constant getConstant(E e) {
        Constant c;
        if (this.cacheGuard != 0 && (c = this.cache[((Enum)e).ordinal()]) != null) {
            return c;
        }
        return this.lookupAndCacheConstant(e);
    }

    static <T extends Enum<T>> ConstantResolver<T> getResolver(Class<T> enumType) {
        return new ConstantResolver<T>(enumType);
    }

    private static final class UnknownConstant
    implements Constant {
        private final String name;
        private final long value;

        public final String toString() {
            return this.name;
        }

        @Override
        public final boolean defined() {
            return false;
        }

        UnknownConstant(long value, String name) {
            this.value = value;
            this.name = name;
        }

        @Override
        public final int intValue() {
            this.checkFake();
            return (int)this.value;
        }

        private void checkFake() {
            if (!PlatformConstants.FAKE) {
                throw new AssertionError((Object)("Constant " + this.name + " is not defined on " + PlatformConstants.NAME));
            }
        }

        @Override
        public final long longValue() {
            this.checkFake();
            return this.value;
        }

        public int value() {
            this.checkFake();
            return (int)this.value;
        }

        @Override
        public final String name() {
            return this.name;
        }
    }
}

