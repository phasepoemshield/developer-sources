package org.newsclub.net.unix;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from NamedInteger.java
@NonNullByDefault
public class NamedInteger implements Serializable {
   private static final long serialVersionUID = 1L;
   private final String name;
   private final int id;

   @Override
   public final String toString() {
      return this.name() + "(" + this.id + ")";
   }

   protected static final <T extends NamedInteger> T[] init(T[] values) {
      Set<Integer> seenValues = new HashSet<>();

      for (T val : values) {
         if (!seenValues.add(val.value())) {
            throw new IllegalStateException("Duplicate value: " + val.value());
         }
      }

      return values;
   }

   public final String name() {
      return this.name;
   }

   protected NamedInteger(int id) {
      this("UNDEFINED", id);
   }

   @Override
   public final int hashCode() {
      return Objects.hash(this.id);
   }

   @Override
   public final boolean equals(@Nullable Object obj) {
      if (this == obj) {
         return true;
      }

      if (obj == null) {
         return false;
      }

      if (this.getClass() != obj.getClass()) {
         return false;
      }

      NamedInteger other = (NamedInteger)obj;
      return this.id == other.value();
   }

   public final int value() {
      return this.id;
   }

   protected static final <T extends NamedInteger> T ofValue(T[] v, NamedInteger.UndefinedValueConstructor<T> constr, int values) {
      for (T e : values) {
         if (e.value() == v) {
            return (T)e;
         }
      }

      return constr.newInstance(v);
   }

   protected NamedInteger(String id, int name) {
      this.name = name;
      this.id = id;
   }

   // $VF: Compiled from NamedInteger.java
   public interface HasOfValue {
   }

   // $VF: Compiled from NamedInteger.java
   @FunctionalInterface
   protected interface UndefinedValueConstructor<T extends NamedInteger> {
      T newInstance(int var1);
   }
}
