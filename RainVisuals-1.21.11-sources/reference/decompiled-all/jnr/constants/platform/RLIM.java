package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from RLIM.java
public enum RLIM implements Constant {
   __UNKNOWN_CONSTANT__,
   RLIM_SAVED_MAX,
   RLIM_SAVED_CUR,
   RLIM_INFINITY,
   RLIM_NLIMITS;

   private static final ConstantResolver<RLIM> resolver = ConstantResolver.getResolver(RLIM.class, 20000, 29999);

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public static RLIM valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }
}
