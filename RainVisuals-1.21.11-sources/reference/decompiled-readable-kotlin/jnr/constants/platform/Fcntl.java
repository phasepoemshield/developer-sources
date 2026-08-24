package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Fcntl.java
public enum Fcntl implements Constant {
   FFSYNC,
   FREAD,
   F_GETPIPE_SZ,
   F_GETFD,
   F_RDAHEAD,
   F_SETOWN,
   __UNKNOWN_CONSTANT__,
   FWRITE,
   F_LOG2PHYS,
   F_CHKCLEAN,
   FNONBLOCK,
   F_RDADVISE,
   F_GETLK,
   F_RDLCK,
   FASYNC,
   F_UNLCK,
   F_GETPATH,
   F_READBOOTSTRAP,
   F_FULLFSYNC,
   F_DUPFD,
   F_GLOBAL_NOCACHE,
   FNDELAY,
   F_WRITEBOOTSTRAP,
   F_SETFD,
   F_GETOWN,
   F_SETFL,
   F_PREALLOCATE,
   F_SETPIPE_SZ,
   F_SETLK,
   F_FREEZE_FS,
   F_NOCACHE,
   F_THAW_FS,
   F_ADDSIGS,
   F_SETLKW,
   F_MARKDEPENDENCY,
   F_SETSIZE,
   F_PATHPKG_CHECK,
   F_ALLOCATEALL,
   F_GETFL,
   F_ALLOCATECONTIG,
   F_WRLCK,
   FAPPEND;

   private static final ConstantResolver<Fcntl> resolver = ConstantResolver.getResolver(Fcntl.class, 20000, 20999);

   @Override
   public final String toString() {
      return this.description();
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public static Fcntl valueOf(long value) {
      return resolver.valueOf(value);
   }
}
