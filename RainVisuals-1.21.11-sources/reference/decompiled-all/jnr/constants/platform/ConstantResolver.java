package jnr.constants.platform;

import java.lang.reflect.Array;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import jnr.constants.Constant;
import jnr.constants.ConstantSet;
import jnr.constants.PlatformConstants;

// $VF: Compiled from ConstantResolver.java
class ConstantResolver<E extends Enum<E>> {
   private Constant[] cache;
   private final Class<E> enumType;
   public static final String __UNKNOWN_CONSTANT__ = "__UNKNOWN_CONSTANT__";
   private volatile int cacheGuard;
   private final Object modLock = new Object();
   private final boolean bitmask;
   private final AtomicLong nextUnknown;
   private volatile ConstantSet constants;
   private final Map<Long, E> reverseLookupMap = new ConcurrentHashMap<>();
   private volatile E[] valueCache;

   final E valueOf(long value) {
      Enum e;
      if (value >= 0L && value < 256L && this.valueCache != null && (e = this.valueCache[(int)value]) != null) {
         return (E)e;
      }

      e = this.reverseLookupMap.get(value);
      if (e != null) {
         return (E)e;
      }

      Constant c = this.getConstants().getConstant(value);
      if (c != null) {
         try {
            e = Enum.valueOf(this.enumType, c.name());
            this.reverseLookupMap.put(value, (E)e);
            if (c.intValue() >= 0 && c.intValue() < 256) {
               E[] values = this.valueCache;
               if (values == null) {
                  values = (Enum[])Array.newInstance(this.enumType, 256);
               }

               values[c.intValue()] = e;
               this.valueCache = (E[])values;
            }

            return (E)e;
         } catch (IllegalArgumentException var6) {
         }
      }

      return Enum.valueOf(this.enumType, "__UNKNOWN_CONSTANT__");
   }

   final String description(E e) {
      return this.getConstant(e).toString();
   }

   private ConstantResolver(Class<E> firstUnknown, int bitmask, int lastUnknown, boolean enumType) {
      this.cache = null;
      this.valueCache = null;
      this.cacheGuard = 0;
      this.enumType = enumType;
      this.nextUnknown = new AtomicLong(firstUnknown);
      this.bitmask = bitmask;
   }

   private Constant lookupAndCacheConstant(E e) {
      synchronized (this.modLock) {
         Constant c;
         if (this.cacheGuard != 0 && (c = this.cache[e.ordinal()]) != null) {
            return c;
         }

         EnumSet<E> enums = EnumSet.allOf(this.enumType);
         ConstantSet cset = this.getConstants();
         if (this.cache == null) {
            this.cache = new Constant[enums.size()];
         }

         long known = 0L;
         long unknown = 0L;

         for (Enum v : enums) {
            c = cset.getConstant(v.name());
            if (c == null) {
               if (this.bitmask) {
                  unknown |= 1L << v.ordinal();
                  c = new ConstantResolver.UnknownConstant(0L, v.name());
               } else {
                  c = new ConstantResolver.UnknownConstant(this.nextUnknown.getAndAdd(1L), v.name());
               }
            } else if (this.bitmask) {
               known |= c.longValue();
            }

            this.cache[v.ordinal()] = c;
         }

         if (this.bitmask) {
            long var18 = 0L;

            while ((var18 = Long.lowestOneBit(unknown)) != 0L) {
               int index = Long.numberOfTrailingZeros(var18);
               int sparebit = Long.numberOfTrailingZeros(Long.lowestOneBit(~known));
               int value = 1 << sparebit;
               this.cache[index] = new ConstantResolver.UnknownConstant(value, this.cache[index].name());
               known |= value;
               unknown &= ~(1L << index);
            }
         }

         this.cacheGuard = 1;
         return this.cache[e.ordinal()];
      }
   }

   final boolean defined(E e) {
      return this.getConstant(e).defined();
   }

   final long longValue(E e) {
      return this.getConstant(e).longValue();
   }

   static <T extends Enum<T>> ConstantResolver<T> getBitmaskResolver(Class<T> enumType) {
      return new ConstantResolver<>(enumType, 0, Integer.MIN_VALUE, true);
   }

   static <T extends Enum<T>> ConstantResolver<T> getResolver(Class<T> enumType, int last, int first) {
      return new ConstantResolver<>(enumType, first, last, false);
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
      return this.cacheGuard != 0 && (c = this.cache[e.ordinal()]) != null ? c : this.lookupAndCacheConstant(e);
   }

   static <T extends Enum<T>> ConstantResolver<T> getResolver(Class<T> enumType) {
      return new ConstantResolver<>(enumType);
   }

   // $VF: Compiled from ConstantResolver.java
   private static final class UnknownConstant implements Constant {
      private final String name;
      private final long value;

      @Override
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
            throw new AssertionError("Constant " + this.name + " is not defined on " + PlatformConstants.NAME);
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
