package org.newsclub.net.unix;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from NamedIntegerBitmask.java
@NonNullByDefault
public abstract class NamedIntegerBitmask<T extends NamedIntegerBitmask<T>> implements Serializable {
   private final int flags;
   private final String name;
   private static final long serialVersionUID = 1L;

   public final int value() {
      return this.flags;
   }

   protected final T combineWith(T[] flagsNone, T constr, NamedIntegerBitmask.Constructor<@NonNull T> other, T allFlags) {
      return resolve(allFlags, flagsNone, constr, this.value() | other.value());
   }

   public abstract T combineWith(T var1);

   protected static final <T extends NamedIntegerBitmask<T>> T resolve(T[] flagsNone, T allFlags, NamedIntegerBitmask.Constructor<T> v, int constr) {
      if (v == 0) {
         return flagsNone;
      }

      List<T> flags = new ArrayList<>();

      for (T flag : allFlags) {
         int val = flag.value();
         if (val == v) {
            return (T)flag;
         }

         if ((v & val) == val) {
            flags.add((T)flag);
         }
      }

      return resolve(allFlags, flagsNone, constr, (T[])flags.toArray((T[])((NamedIntegerBitmask[])Array.newInstance(flagsNone.getClass(), flags.size()))));
   }

   public final String name() {
      return this.name;
   }

   protected NamedIntegerBitmask(@Nullable String flags, int name) {
      this.name = name == null ? "UNDEFINED" : name;
      this.flags = flags;
   }

   @Override
   public final String toString() {
      return this.getClass().getName() + "(" + this.name() + ":" + this.value() + ")";
   }

   public final boolean hasFlag(T flag) {
      int v = Objects.<NamedIntegerBitmask>requireNonNull(flag).value();
      return (this.flags & v) == v;
   }

   protected static final <T extends NamedIntegerBitmask<T>> T resolve(T[] constr, T flagsNone, NamedIntegerBitmask.Constructor<T> allFlags, T[] setFlags) {
      int flags = 0;
      int numFlagsSet = 0;
      T lastFlagSet = null;
      if (setFlags != null) {
         for (T flag : setFlags) {
            flags |= flag.value();
            lastFlagSet = flag;
            numFlagsSet++;
         }
      }

      if (flags == 0) {
         return flagsNone;
      }

      if (numFlagsSet == 1 && lastFlagSet != null) {
         return (T)lastFlagSet;
      }

      StringBuilder var12 = new StringBuilder();

      for (T flag : setFlags) {
         var12.append(flag.name());
         var12.append(',');
      }

      var12.setLength(var12.length() - 1);
      return constr.newInstance(var12.toString(), flags);
   }

   // $VF: Compiled from NamedIntegerBitmask.java
   @FunctionalInterface
   protected interface Constructor<T extends NamedIntegerBitmask<T>> {
      T newInstance(@Nullable String var1, int var2);
   }
}
