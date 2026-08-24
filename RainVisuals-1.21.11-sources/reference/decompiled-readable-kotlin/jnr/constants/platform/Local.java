package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Local.java
public enum Local implements Constant {
   __UNKNOWN_CONSTANT__,
   LOCAL_CONNWAIT,
   LOCAL_PEERCRED,
   LOCAL_CREDS;

   private static final ConstantResolver<Local> resolver = ConstantResolver.getResolver(Local.class, 20000, 29999);

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   public static Local valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }
}
