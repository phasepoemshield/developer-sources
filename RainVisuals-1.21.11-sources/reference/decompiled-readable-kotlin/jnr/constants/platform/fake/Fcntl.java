package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Fcntl.java
public enum Fcntl implements Constant {
   FNDELAY(6L),
   F_LOG2PHYS(25L),
   F_CHKCLEAN(17L),
   F_UNLCK(35L),
   F_READBOOTSTRAP(22L),
   F_SETLK(15L),
   FFSYNC(4L),
   F_RDADVISE(20L),
   F_WRITEBOOTSTRAP(23L),
   F_RDLCK(34L),
   FAPPEND(0L),
   FREAD(1L),
   F_ALLOCATECONTIG(37L),
   F_GETPIPE_SZ(39L),
   F_GETOWN(12L),
   F_SETPIPE_SZ(40L),
   F_NOCACHE(24L),
   F_GETPATH(26L),
   F_SETLKW(16L),
   F_GLOBAL_NOCACHE(31L),
   F_SETFD(9L),
   F_THAW_FS(30L),
   F_RDAHEAD(21L),
   FWRITE(2L),
   F_GETFD(8L),
   F_GETFL(10L),
   F_FREEZE_FS(29L),
   F_PREALLOCATE(18L),
   F_PATHPKG_CHECK(28L),
   F_GETLK(14L),
   FNONBLOCK(5L),
   F_DUPFD(7L),
   FASYNC(3L),
   F_WRLCK(36L),
   F_FULLFSYNC(27L),
   F_ALLOCATEALL(38L),
   F_SETFL(11L),
   F_MARKDEPENDENCY(33L),
   F_SETSIZE(19L),
   F_SETOWN(13L),
   F_ADDSIGS(32L);

   public static final long MAX_VALUE = 40L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   Fcntl(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }
}
