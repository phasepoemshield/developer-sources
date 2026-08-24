package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from PRIO.java
public enum PRIO implements Constant {
   PRIO_PGRP(3L),
   PRIO_PROCESS(2L),
   PRIO_MAX(5L),
   PRIO_MIN(1L),
   PRIO_USER(4L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 5L;
   private final long value;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   PRIO(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }
}
