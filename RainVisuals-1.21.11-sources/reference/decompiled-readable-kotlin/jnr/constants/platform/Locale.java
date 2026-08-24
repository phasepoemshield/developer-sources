package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Locale.java
public enum Locale implements Constant {
   LC_ADDRESS,
   __UNKNOWN_CONSTANT__,
   LC_CTYPE,
   LC_MONETARY,
   LC_MEASUREMENT,
   LC_MESSAGES,
   LC_TELEPHONE,
   LC_PAPER,
   LC_IDENTIFICATION,
   LC_ALL,
   LC_TIME,
   LC_NUMERIC,
   LC_NAME,
   LC_COLLATE;

   private static final ConstantResolver<Locale> resolver = ConstantResolver.getResolver(Locale.class, 20000, 29999);

   public static Locale valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }
}
