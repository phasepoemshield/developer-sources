package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from WaitFlags.java
public enum WaitFlags implements Constant {
   WNOHANG,
   __UNKNOWN_CONSTANT__,
   WCONTINUED,
   WUNTRACED,
   WSTOPPED,
   WNOWAIT,
   WEXITED;

   private static final ConstantResolver<WaitFlags> resolver = ConstantResolver.getBitmaskResolver(WaitFlags.class);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   public static WaitFlags valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

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
}
