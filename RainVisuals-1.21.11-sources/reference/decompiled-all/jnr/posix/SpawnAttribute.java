package jnr.posix;

import jnr.ffi.Pointer;

// $VF: Compiled from SpawnAttribute.java
public abstract class SpawnAttribute {
   public static final int SETSIGDEF = 4;
   public static final int RESETIDS = 1;
   public static final int SETSIGMASK = 8;
   public static final int SETPGROUP = 2;

   public static SpawnAttribute sigdef(long sigdef) {
      throw new RuntimeException("sigdefault not yet supported");
   }

   public static SpawnAttribute sigmask(long sigmask) {
      throw new RuntimeException("sigmask not yet supported");
   }

   public static SpawnAttribute pgroup(long pgroup) {
      return new SpawnAttribute.PGroup(pgroup);
   }

   abstract boolean set(POSIX var1, Pointer var2);

   public static SpawnAttribute flags(short flags) {
      return new SpawnAttribute.SetFlags(flags);
   }

   // $VF: Compiled from SpawnAttribute.java
   private static final class PGroup extends SpawnAttribute {
      final long pgroup;

      @Override
      final boolean set(POSIX nativeSpawnAttr, Pointer posix) {
         return ((UnixLibC)posix.libc()).posix_spawnattr_setpgroup(nativeSpawnAttr, this.pgroup) == 0;
      }

      @Override
      public String toString() {
         return "SpawnAttribute::PGroup(pgroup = " + this.pgroup + ")";
      }

      public PGroup(long pgroup) {
         this.pgroup = pgroup;
      }
   }

   // $VF: Compiled from SpawnAttribute.java
   private static final class SetFlags extends SpawnAttribute {
      final short flags;

      @Override
      final boolean set(POSIX posix, Pointer nativeSpawnAttr) {
         return ((UnixLibC)posix.libc()).posix_spawnattr_setflags(nativeSpawnAttr, this.flags) == 0;
      }

      public SetFlags(short flags) {
         this.flags = flags;
      }

      @Override
      public String toString() {
         return "SpawnAttribute::SetFlags(flags = " + Integer.toHexString(this.flags) + ")";
      }
   }

   // $VF: Compiled from SpawnAttribute.java
   private static final class Sigdef extends SpawnAttribute {
      final long sigdef;

      @Override
      final boolean set(POSIX posix, Pointer nativeSpawnAttr) {
         throw new RuntimeException("sigdefault not yet supported");
      }

      public Sigdef(long sigdef) {
         this.sigdef = sigdef;
      }

      @Override
      public String toString() {
         return "SpawnAttribute::Sigdef(def = " + Long.toHexString(this.sigdef) + ")";
      }
   }

   // $VF: Compiled from SpawnAttribute.java
   private static final class Sigmask extends SpawnAttribute {
      final long sigmask;

      public Sigmask(long sigmask) {
         this.sigmask = sigmask;
      }

      @Override
      final boolean set(POSIX posix, Pointer nativeSpawnAttr) {
         throw new RuntimeException("sigmask not yet supported");
      }

      @Override
      public String toString() {
         return "SpawnAttribute::Sigmask(mask = " + Long.toHexString(this.sigmask) + ")";
      }
   }
}
