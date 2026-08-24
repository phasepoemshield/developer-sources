package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from PRIO.java
public enum PRIO implements Constant {
   PRIO_MIN,
   PRIO_MAX,
   PRIO_USER,
   PRIO_PROCESS,
   __UNKNOWN_CONSTANT__,
   PRIO_PGRP;

   private static final ConstantResolver<PRIO> resolver = ConstantResolver.getResolver(PRIO.class, 20000, 29999);

   public final String description() {
      return resolver.description(this);
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

   public static PRIO valueOf(long value) {
      return resolver.valueOf(value);
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
