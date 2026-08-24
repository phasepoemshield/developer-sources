/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Fcntl
extends Enum<Fcntl>
implements Constant {
    private final long value;
    public static final /* enum */ Fcntl F_GLOBAL_NOCACHE;
    public static final /* enum */ Fcntl F_ADDSIGS;
    public static final /* enum */ Fcntl F_SETSIZE;
    public static final /* enum */ Fcntl FREAD;
    public static final /* enum */ Fcntl FWRITE;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Fcntl F_NOCACHE;
    public static final /* enum */ Fcntl F_PATHPKG_CHECK;
    public static final /* enum */ Fcntl F_WRLCK;
    public static final /* enum */ Fcntl F_PREALLOCATE;
    public static final /* enum */ Fcntl F_GETOWN;
    public static final /* enum */ Fcntl F_GETFL;
    public static final long MAX_VALUE = 128L;
    public static final /* enum */ Fcntl F_LOG2PHYS;
    public static final /* enum */ Fcntl F_SETFL;
    public static final /* enum */ Fcntl F_FULLFSYNC;
    public static final /* enum */ Fcntl F_ALLOCATECONTIG;
    public static final /* enum */ Fcntl FNONBLOCK;
    public static final /* enum */ Fcntl F_CHKCLEAN;
    public static final /* enum */ Fcntl F_FREEZE_FS;
    public static final /* enum */ Fcntl F_UNLCK;
    public static final /* enum */ Fcntl F_RDAHEAD;
    public static final /* enum */ Fcntl FAPPEND;
    public static final /* enum */ Fcntl F_THAW_FS;
    public static final /* enum */ Fcntl F_ALLOCATEALL;
    public static final /* enum */ Fcntl F_SETOWN;
    public static final /* enum */ Fcntl F_RDLCK;
    public static final /* enum */ Fcntl F_GETFD;
    public static final /* enum */ Fcntl FFSYNC;
    public static final /* enum */ Fcntl F_SETLK;
    private static final /* synthetic */ Fcntl[] $VALUES;
    public static final /* enum */ Fcntl F_RDADVISE;
    public static final /* enum */ Fcntl FNDELAY;
    public static final /* enum */ Fcntl F_SETLKW;
    public static final /* enum */ Fcntl F_SETFD;
    public static final /* enum */ Fcntl F_GETPATH;
    public static final /* enum */ Fcntl F_DUPFD;
    public static final /* enum */ Fcntl FASYNC;
    public static final /* enum */ Fcntl F_GETLK;

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    static {
        FAPPEND = new Fcntl(8L);
        FREAD = new Fcntl(1L);
        FWRITE = new Fcntl(2L);
        FASYNC = new Fcntl(64L);
        FFSYNC = new Fcntl(128L);
        FNONBLOCK = new Fcntl(4L);
        FNDELAY = new Fcntl(4L);
        F_DUPFD = new Fcntl(0L);
        F_GETFD = new Fcntl(1L);
        F_SETFD = new Fcntl(2L);
        F_GETFL = new Fcntl(3L);
        F_SETFL = new Fcntl(4L);
        F_GETOWN = new Fcntl(5L);
        F_SETOWN = new Fcntl(6L);
        F_GETLK = new Fcntl(7L);
        F_SETLK = new Fcntl(8L);
        F_SETLKW = new Fcntl(9L);
        F_CHKCLEAN = new Fcntl(41L);
        F_PREALLOCATE = new Fcntl(42L);
        F_SETSIZE = new Fcntl(43L);
        F_RDADVISE = new Fcntl(44L);
        F_RDAHEAD = new Fcntl(45L);
        F_NOCACHE = new Fcntl(48L);
        F_LOG2PHYS = new Fcntl(49L);
        F_GETPATH = new Fcntl(50L);
        F_FULLFSYNC = new Fcntl(51L);
        F_PATHPKG_CHECK = new Fcntl(52L);
        F_FREEZE_FS = new Fcntl(53L);
        F_THAW_FS = new Fcntl(54L);
        F_GLOBAL_NOCACHE = new Fcntl(55L);
        F_ADDSIGS = new Fcntl(59L);
        F_RDLCK = new Fcntl(1L);
        F_UNLCK = new Fcntl(2L);
        F_WRLCK = new Fcntl(3L);
        F_ALLOCATECONTIG = new Fcntl(2L);
        F_ALLOCATEALL = new Fcntl(4L);
        Fcntl[] fcntlArray = new Fcntl[36];
        fcntlArray[0] = FAPPEND;
        fcntlArray[1] = FREAD;
        fcntlArray[2] = FWRITE;
        fcntlArray[3] = FASYNC;
        fcntlArray[4] = FFSYNC;
        fcntlArray[5] = FNONBLOCK;
        fcntlArray[6] = FNDELAY;
        fcntlArray[7] = F_DUPFD;
        fcntlArray[8] = F_GETFD;
        fcntlArray[9] = F_SETFD;
        fcntlArray[10] = F_GETFL;
        fcntlArray[11] = F_SETFL;
        fcntlArray[12] = F_GETOWN;
        fcntlArray[13] = F_SETOWN;
        fcntlArray[14] = F_GETLK;
        fcntlArray[15] = F_SETLK;
        fcntlArray[16] = F_SETLKW;
        fcntlArray[17] = F_CHKCLEAN;
        fcntlArray[18] = F_PREALLOCATE;
        fcntlArray[19] = F_SETSIZE;
        fcntlArray[20] = F_RDADVISE;
        fcntlArray[21] = F_RDAHEAD;
        fcntlArray[22] = F_NOCACHE;
        fcntlArray[23] = F_LOG2PHYS;
        fcntlArray[24] = F_GETPATH;
        fcntlArray[25] = F_FULLFSYNC;
        fcntlArray[26] = F_PATHPKG_CHECK;
        fcntlArray[27] = F_FREEZE_FS;
        fcntlArray[28] = F_THAW_FS;
        fcntlArray[29] = F_GLOBAL_NOCACHE;
        fcntlArray[30] = F_ADDSIGS;
        fcntlArray[31] = F_RDLCK;
        fcntlArray[32] = F_UNLCK;
        fcntlArray[33] = F_WRLCK;
        fcntlArray[34] = F_ALLOCATECONTIG;
        fcntlArray[35] = F_ALLOCATEALL;
        $VALUES = fcntlArray;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static Fcntl valueOf(String name) {
        return Enum.valueOf(Fcntl.class, name);
    }

    public static Fcntl[] values() {
        return (Fcntl[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private Fcntl(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static final class StringTable {
        public static final Map<Fcntl, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<Fcntl, String> generateTable() {
            EnumMap<Fcntl, String> map = new EnumMap<Fcntl, String>(Fcntl.class);
            map.put(FAPPEND, "FAPPEND");
            map.put(FREAD, "FREAD");
            map.put(FWRITE, "FWRITE");
            map.put(FASYNC, "FASYNC");
            map.put(FFSYNC, "FFSYNC");
            map.put(FNONBLOCK, "FNONBLOCK");
            map.put(FNDELAY, "FNDELAY");
            map.put(F_DUPFD, "F_DUPFD");
            map.put(F_GETFD, "F_GETFD");
            map.put(F_SETFD, "F_SETFD");
            map.put(F_GETFL, "F_GETFL");
            map.put(F_SETFL, "F_SETFL");
            map.put(F_GETOWN, "F_GETOWN");
            map.put(F_SETOWN, "F_SETOWN");
            map.put(F_GETLK, "F_GETLK");
            map.put(F_SETLK, "F_SETLK");
            map.put(F_SETLKW, "F_SETLKW");
            map.put(F_CHKCLEAN, "F_CHKCLEAN");
            map.put(F_PREALLOCATE, "F_PREALLOCATE");
            map.put(F_SETSIZE, "F_SETSIZE");
            map.put(F_RDADVISE, "F_RDADVISE");
            map.put(F_RDAHEAD, "F_RDAHEAD");
            map.put(F_NOCACHE, "F_NOCACHE");
            map.put(F_LOG2PHYS, "F_LOG2PHYS");
            map.put(F_GETPATH, "F_GETPATH");
            map.put(F_FULLFSYNC, "F_FULLFSYNC");
            map.put(F_PATHPKG_CHECK, "F_PATHPKG_CHECK");
            map.put(F_FREEZE_FS, "F_FREEZE_FS");
            map.put(F_THAW_FS, "F_THAW_FS");
            map.put(F_GLOBAL_NOCACHE, "F_GLOBAL_NOCACHE");
            map.put(F_ADDSIGS, "F_ADDSIGS");
            map.put(F_RDLCK, "F_RDLCK");
            map.put(F_UNLCK, "F_UNLCK");
            map.put(F_WRLCK, "F_WRLCK");
            map.put(F_ALLOCATECONTIG, "F_ALLOCATECONTIG");
            map.put(F_ALLOCATEALL, "F_ALLOCATEALL");
            return map;
        }
    }
}

