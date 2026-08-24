package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Fcntl.java
public enum Fcntl implements Constant {
   F_GLOBAL_NOCACHE(55L),
   F_ADDSIGS(59L),
   F_SETSIZE(43L),
   FREAD(1L),
   FWRITE(2L),
   F_NOCACHE(48L),
   F_PATHPKG_CHECK(52L),
   F_WRLCK(3L),
   F_PREALLOCATE(42L),
   F_GETOWN(5L),
   F_GETFL(3L),
   F_LOG2PHYS(49L),
   F_SETFL(4L),
   F_FULLFSYNC(51L),
   F_ALLOCATECONTIG(2L),
   FNONBLOCK(4L),
   F_CHKCLEAN(41L),
   F_FREEZE_FS(53L),
   F_UNLCK(2L),
   F_RDAHEAD(45L),
   FAPPEND(8L),
   F_THAW_FS(54L),
   F_ALLOCATEALL(4L),
   F_SETOWN(6L),
   F_RDLCK(1L),
   F_GETFD(1L),
   FFSYNC(128L),
   F_SETLK(8L),
   F_RDADVISE(44L),
   FNDELAY(4L),
   F_SETLKW(9L),
   F_SETFD(2L),
   F_GETPATH(50L),
   F_DUPFD(0L),
   FASYNC(64L),
   F_GETLK(7L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 128L;

   @Override
   public final String toString() {
      return Fcntl.StringTable.descriptions.get(this);
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

   Fcntl(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   // $VF: Compiled from Fcntl.java
   static final class StringTable {
      public static final Map<Fcntl, String> descriptions = generateTable();

      public static final Map<Fcntl, String> generateTable() {
         Map<Fcntl, String> map = new EnumMap<>(Fcntl.class);
         map.put(Fcntl.FAPPEND, "FAPPEND");
         map.put(Fcntl.FREAD, "FREAD");
         map.put(Fcntl.FWRITE, "FWRITE");
         map.put(Fcntl.FASYNC, "FASYNC");
         map.put(Fcntl.FFSYNC, "FFSYNC");
         map.put(Fcntl.FNONBLOCK, "FNONBLOCK");
         map.put(Fcntl.FNDELAY, "FNDELAY");
         map.put(Fcntl.F_DUPFD, "F_DUPFD");
         map.put(Fcntl.F_GETFD, "F_GETFD");
         map.put(Fcntl.F_SETFD, "F_SETFD");
         map.put(Fcntl.F_GETFL, "F_GETFL");
         map.put(Fcntl.F_SETFL, "F_SETFL");
         map.put(Fcntl.F_GETOWN, "F_GETOWN");
         map.put(Fcntl.F_SETOWN, "F_SETOWN");
         map.put(Fcntl.F_GETLK, "F_GETLK");
         map.put(Fcntl.F_SETLK, "F_SETLK");
         map.put(Fcntl.F_SETLKW, "F_SETLKW");
         map.put(Fcntl.F_CHKCLEAN, "F_CHKCLEAN");
         map.put(Fcntl.F_PREALLOCATE, "F_PREALLOCATE");
         map.put(Fcntl.F_SETSIZE, "F_SETSIZE");
         map.put(Fcntl.F_RDADVISE, "F_RDADVISE");
         map.put(Fcntl.F_RDAHEAD, "F_RDAHEAD");
         map.put(Fcntl.F_NOCACHE, "F_NOCACHE");
         map.put(Fcntl.F_LOG2PHYS, "F_LOG2PHYS");
         map.put(Fcntl.F_GETPATH, "F_GETPATH");
         map.put(Fcntl.F_FULLFSYNC, "F_FULLFSYNC");
         map.put(Fcntl.F_PATHPKG_CHECK, "F_PATHPKG_CHECK");
         map.put(Fcntl.F_FREEZE_FS, "F_FREEZE_FS");
         map.put(Fcntl.F_THAW_FS, "F_THAW_FS");
         map.put(Fcntl.F_GLOBAL_NOCACHE, "F_GLOBAL_NOCACHE");
         map.put(Fcntl.F_ADDSIGS, "F_ADDSIGS");
         map.put(Fcntl.F_RDLCK, "F_RDLCK");
         map.put(Fcntl.F_UNLCK, "F_UNLCK");
         map.put(Fcntl.F_WRLCK, "F_WRLCK");
         map.put(Fcntl.F_ALLOCATECONTIG, "F_ALLOCATECONTIG");
         map.put(Fcntl.F_ALLOCATEALL, "F_ALLOCATEALL");
         return map;
      }
   }
}
