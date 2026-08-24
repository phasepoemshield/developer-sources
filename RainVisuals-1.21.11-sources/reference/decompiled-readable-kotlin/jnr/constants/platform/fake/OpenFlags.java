package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from OpenFlags.java
public enum OpenFlags implements Constant {
   O_SYNC(64L),
   O_EVTONLY(32768L),
   O_NOFOLLOW(2048L),
   O_SHLOCK(128L),
   O_ASYNC(512L),
   O_CLOEXEC(2097152L),
   O_BINARY(262144L),
   O_APPEND(32L),
   O_RDWR(4L),
   O_RDONLY(1L),
   O_TMPFILE(1048576L),
   O_TRUNC(8192L),
   O_ACCMODE(8L),
   O_EXCL(16384L),
   O_CREAT(4096L),
   O_EXLOCK(256L),
   O_DIRECTORY(65536L),
   O_NOCTTY(524288L),
   O_NONBLOCK(16L),
   O_SYMLINK(131072L),
   O_WRONLY(2L),
   O_FSYNC(1024L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 2097152L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   OpenFlags(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }
}
