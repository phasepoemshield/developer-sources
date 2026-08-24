package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Pathconf.java
public enum Pathconf implements Constant {
   _PC_PIPE_BUF(7L),
   _PC_LINK_MAX(2L),
   _PC_PRIO_IO(19L),
   _PC_VDISABLE(17L),
   _PC_NAME_MAX(5L),
   _PC_MAX_INPUT(4L),
   _PC_PATH_MAX(6L),
   _PC_CHOWN_RESTRICTED(15L),
   _PC_ASYNC_IO(18L),
   _PC_REC_MIN_XFER_SIZE(12L),
   _PC_MAX_CANON(3L),
   _PC_SYNC_IO(20L),
   _PC_SYMLINK_MAX(14L),
   _PC_FILESIZEBITS(1L),
   _PC_REC_INCR_XFER_SIZE(10L),
   _PC_REC_XFER_ALIGN(13L),
   _PC_REC_MAX_XFER_SIZE(11L),
   _PC_NO_TRUNC(16L),
   _PC_2_SYMLINKS(8L),
   _PC_ALLOC_SIZE_MIN(9L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 20L;
   private final long value;

   Pathconf(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }
}
