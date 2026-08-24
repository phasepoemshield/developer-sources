package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Pathconf.java
public enum Pathconf implements Constant {
   _PC_PIPE_BUF,
   _PC_MAX_INPUT,
   _PC_ALLOC_SIZE_MIN,
   __UNKNOWN_CONSTANT__,
   _PC_MAX_CANON,
   _PC_2_SYMLINKS,
   _PC_REC_MIN_XFER_SIZE,
   _PC_REC_XFER_ALIGN,
   _PC_LINK_MAX,
   _PC_REC_MAX_XFER_SIZE,
   _PC_VDISABLE,
   _PC_SYMLINK_MAX,
   _PC_NO_TRUNC,
   _PC_ASYNC_IO,
   _PC_CHOWN_RESTRICTED,
   _PC_NAME_MAX,
   _PC_REC_INCR_XFER_SIZE,
   _PC_PRIO_IO,
   _PC_FILESIZEBITS,
   _PC_SYNC_IO,
   _PC_PATH_MAX;

   private static final ConstantResolver<Pathconf> resolver = ConstantResolver.getResolver(Pathconf.class, 20000, 29999);

   @Override
   public final String toString() {
      return this.description();
   }

   public static Pathconf valueOf(long value) {
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
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }
}
