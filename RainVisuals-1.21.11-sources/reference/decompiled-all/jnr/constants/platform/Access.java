package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Access.java
public enum Access implements Constant {
   F_OK,
   X_OK,
   W_OK,
   R_OK,
   __UNKNOWN_CONSTANT__;

   private static final ConstantResolver<Access> resolver = ConstantResolver.getBitmaskResolver(Access.class);

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   public static Access valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }
}
