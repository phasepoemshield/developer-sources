/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Fcntl
extends Enum<Fcntl>
implements Constant {
    public static final /* enum */ Fcntl FNDELAY;
    public static final /* enum */ Fcntl F_LOG2PHYS;
    public static final long MAX_VALUE = 40L;
    public static final /* enum */ Fcntl F_CHKCLEAN;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Fcntl F_UNLCK;
    public static final /* enum */ Fcntl F_READBOOTSTRAP;
    public static final /* enum */ Fcntl F_SETLK;
    public static final /* enum */ Fcntl FFSYNC;
    public static final /* enum */ Fcntl F_RDADVISE;
    private static final /* synthetic */ Fcntl[] $VALUES;
    public static final /* enum */ Fcntl F_WRITEBOOTSTRAP;
    public static final /* enum */ Fcntl F_RDLCK;
    public static final /* enum */ Fcntl FAPPEND;
    public static final /* enum */ Fcntl FREAD;
    public static final /* enum */ Fcntl F_ALLOCATECONTIG;
    public static final /* enum */ Fcntl F_GETPIPE_SZ;
    public static final /* enum */ Fcntl F_GETOWN;
    public static final /* enum */ Fcntl F_SETPIPE_SZ;
    public static final /* enum */ Fcntl F_NOCACHE;
    public static final /* enum */ Fcntl F_GETPATH;
    public static final /* enum */ Fcntl F_SETLKW;
    public static final /* enum */ Fcntl F_GLOBAL_NOCACHE;
    public static final /* enum */ Fcntl F_SETFD;
    public static final /* enum */ Fcntl F_THAW_FS;
    public static final /* enum */ Fcntl F_RDAHEAD;
    public static final /* enum */ Fcntl FWRITE;
    public static final /* enum */ Fcntl F_GETFD;
    public static final /* enum */ Fcntl F_GETFL;
    public static final /* enum */ Fcntl F_FREEZE_FS;
    public static final /* enum */ Fcntl F_PREALLOCATE;
    public static final /* enum */ Fcntl F_PATHPKG_CHECK;
    public static final /* enum */ Fcntl F_GETLK;
    public static final /* enum */ Fcntl FNONBLOCK;
    public static final /* enum */ Fcntl F_DUPFD;
    public static final /* enum */ Fcntl FASYNC;
    public static final /* enum */ Fcntl F_WRLCK;
    public static final /* enum */ Fcntl F_FULLFSYNC;
    public static final /* enum */ Fcntl F_ALLOCATEALL;
    public static final /* enum */ Fcntl F_SETFL;
    private final long value;
    public static final /* enum */ Fcntl F_MARKDEPENDENCY;
    public static final /* enum */ Fcntl F_SETSIZE;
    public static final /* enum */ Fcntl F_SETOWN;
    public static final /* enum */ Fcntl F_ADDSIGS;

    public static Fcntl[] values() {
        return (Fcntl[])$VALUES.clone();
    }

    private Fcntl(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Fcntl valueOf(String name) {
        return Enum.valueOf(Fcntl.class, name);
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

    static {
        FAPPEND = new Fcntl(0L);
        FREAD = new Fcntl(1L);
        FWRITE = new Fcntl(2L);
        FASYNC = new Fcntl(3L);
        FFSYNC = new Fcntl(4L);
        FNONBLOCK = new Fcntl(5L);
        FNDELAY = new Fcntl(6L);
        F_DUPFD = new Fcntl(7L);
        F_GETFD = new Fcntl(8L);
        F_SETFD = new Fcntl(9L);
        F_GETFL = new Fcntl(10L);
        F_SETFL = new Fcntl(11L);
        F_GETOWN = new Fcntl(12L);
        F_SETOWN = new Fcntl(13L);
        F_GETLK = new Fcntl(14L);
        F_SETLK = new Fcntl(15L);
        F_SETLKW = new Fcntl(16L);
        F_CHKCLEAN = new Fcntl(17L);
        F_PREALLOCATE = new Fcntl(18L);
        F_SETSIZE = new Fcntl(19L);
        F_RDADVISE = new Fcntl(20L);
        F_RDAHEAD = new Fcntl(21L);
        F_READBOOTSTRAP = new Fcntl(22L);
        F_WRITEBOOTSTRAP = new Fcntl(23L);
        F_NOCACHE = new Fcntl(24L);
        F_LOG2PHYS = new Fcntl(25L);
        F_GETPATH = new Fcntl(26L);
        F_FULLFSYNC = new Fcntl(27L);
        F_PATHPKG_CHECK = new Fcntl(28L);
        F_FREEZE_FS = new Fcntl(29L);
        F_THAW_FS = new Fcntl(30L);
        F_GLOBAL_NOCACHE = new Fcntl(31L);
        F_ADDSIGS = new Fcntl(32L);
        F_MARKDEPENDENCY = new Fcntl(33L);
        F_RDLCK = new Fcntl(34L);
        F_UNLCK = new Fcntl(35L);
        F_WRLCK = new Fcntl(36L);
        F_ALLOCATECONTIG = new Fcntl(37L);
        F_ALLOCATEALL = new Fcntl(38L);
        F_GETPIPE_SZ = new Fcntl(39L);
        F_SETPIPE_SZ = new Fcntl(40L);
        Fcntl[] fcntlArray = new Fcntl[41];
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
        fcntlArray[22] = F_READBOOTSTRAP;
        fcntlArray[23] = F_WRITEBOOTSTRAP;
        fcntlArray[24] = F_NOCACHE;
        fcntlArray[25] = F_LOG2PHYS;
        fcntlArray[26] = F_GETPATH;
        fcntlArray[27] = F_FULLFSYNC;
        fcntlArray[28] = F_PATHPKG_CHECK;
        fcntlArray[29] = F_FREEZE_FS;
        fcntlArray[30] = F_THAW_FS;
        fcntlArray[31] = F_GLOBAL_NOCACHE;
        fcntlArray[32] = F_ADDSIGS;
        fcntlArray[33] = F_MARKDEPENDENCY;
        fcntlArray[34] = F_RDLCK;
        fcntlArray[35] = F_UNLCK;
        fcntlArray[36] = F_WRLCK;
        fcntlArray[37] = F_ALLOCATECONTIG;
        fcntlArray[38] = F_ALLOCATEALL;
        fcntlArray[39] = F_GETPIPE_SZ;
        fcntlArray[40] = F_SETPIPE_SZ;
        $VALUES = fcntlArray;
    }
}

