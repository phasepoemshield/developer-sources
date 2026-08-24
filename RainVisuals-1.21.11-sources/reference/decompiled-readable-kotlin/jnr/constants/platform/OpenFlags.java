package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from OpenFlags.java
public enum OpenFlags implements Constant {
   O_TRUNC,
   O_NOFOLLOW,
   O_NONBLOCK,
   O_RDONLY,
   O_ACCMODE,
   O_DIRECTORY,
   O_CLOEXEC,
   O_SYMLINK,
   O_APPEND,
   O_SHLOCK,
   __UNKNOWN_CONSTANT__,
   O_EXCL,
   O_WRONLY,
   O_ASYNC,
   O_FSYNC,
   O_TMPFILE,
   O_NOCTTY,
   O_SYNC,
   O_RDWR,
   O_BINARY,
   O_EXLOCK,
   O_CREAT,
   O_EVTONLY;

   private static final ConstantResolver<OpenFlags> resolver = ConstantResolver.getBitmaskResolver(OpenFlags.class);

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   public static OpenFlags valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final String description() {
      return resolver.description(this);
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
