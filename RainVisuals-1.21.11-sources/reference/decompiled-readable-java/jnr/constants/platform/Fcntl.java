/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Fcntl
extends Enum<Fcntl>
implements Constant {
    public static final /* enum */ Fcntl FFSYNC;
    private static final /* synthetic */ Fcntl[] $VALUES;
    public static final /* enum */ Fcntl FREAD;
    public static final /* enum */ Fcntl F_GETPIPE_SZ;
    public static final /* enum */ Fcntl F_GETFD;
    public static final /* enum */ Fcntl F_RDAHEAD;
    public static final /* enum */ Fcntl F_SETOWN;
    public static final /* enum */ Fcntl __UNKNOWN_CONSTANT__;
    public static final /* enum */ Fcntl FWRITE;
    public static final /* enum */ Fcntl F_LOG2PHYS;
    public static final /* enum */ Fcntl F_CHKCLEAN;
    public static final /* enum */ Fcntl FNONBLOCK;
    public static final /* enum */ Fcntl F_RDADVISE;
    public static final /* enum */ Fcntl F_GETLK;
    public static final /* enum */ Fcntl F_RDLCK;
    public static final /* enum */ Fcntl FASYNC;
    public static final /* enum */ Fcntl F_UNLCK;
    public static final /* enum */ Fcntl F_GETPATH;
    public static final /* enum */ Fcntl F_READBOOTSTRAP;
    public static final /* enum */ Fcntl F_FULLFSYNC;
    public static final /* enum */ Fcntl F_DUPFD;
    public static final /* enum */ Fcntl F_GLOBAL_NOCACHE;
    public static final /* enum */ Fcntl FNDELAY;
    public static final /* enum */ Fcntl F_WRITEBOOTSTRAP;
    public static final /* enum */ Fcntl F_SETFD;
    public static final /* enum */ Fcntl F_GETOWN;
    public static final /* enum */ Fcntl F_SETFL;
    public static final /* enum */ Fcntl F_PREALLOCATE;
    public static final /* enum */ Fcntl F_SETPIPE_SZ;
    public static final /* enum */ Fcntl F_SETLK;
    public static final /* enum */ Fcntl F_FREEZE_FS;
    public static final /* enum */ Fcntl F_NOCACHE;
    public static final /* enum */ Fcntl F_THAW_FS;
    public static final /* enum */ Fcntl F_ADDSIGS;
    public static final /* enum */ Fcntl F_SETLKW;
    private static final ConstantResolver<Fcntl> resolver;
    public static final /* enum */ Fcntl F_MARKDEPENDENCY;
    public static final /* enum */ Fcntl F_SETSIZE;
    public static final /* enum */ Fcntl F_PATHPKG_CHECK;
    public static final /* enum */ Fcntl F_ALLOCATEALL;
    public static final /* enum */ Fcntl F_GETFL;
    public static final /* enum */ Fcntl F_ALLOCATECONTIG;
    public static final /* enum */ Fcntl F_WRLCK;
    public static final /* enum */ Fcntl FAPPEND;

    public final String toString() {
        return this.description();
    }

    public static Fcntl[] values() {
        return (Fcntl[])$VALUES.clone();
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

    public static Fcntl valueOf(String name) {
        return Enum.valueOf(Fcntl.class, name);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public static Fcntl valueOf(long value) {
        return resolver.valueOf(value);
    }

    static {
        FAPPEND = new Fcntl();
        FREAD = new Fcntl();
        FWRITE = new Fcntl();
        FASYNC = new Fcntl();
        FFSYNC = new Fcntl();
        FNONBLOCK = new Fcntl();
        FNDELAY = new Fcntl();
        F_DUPFD = new Fcntl();
        F_GETFD = new Fcntl();
        F_SETFD = new Fcntl();
        F_GETFL = new Fcntl();
        F_SETFL = new Fcntl();
        F_GETOWN = new Fcntl();
        F_SETOWN = new Fcntl();
        F_GETLK = new Fcntl();
        F_SETLK = new Fcntl();
        F_SETLKW = new Fcntl();
        F_CHKCLEAN = new Fcntl();
        F_PREALLOCATE = new Fcntl();
        F_SETSIZE = new Fcntl();
        F_RDADVISE = new Fcntl();
        F_RDAHEAD = new Fcntl();
        F_READBOOTSTRAP = new Fcntl();
        F_WRITEBOOTSTRAP = new Fcntl();
        F_NOCACHE = new Fcntl();
        F_LOG2PHYS = new Fcntl();
        F_GETPATH = new Fcntl();
        F_FULLFSYNC = new Fcntl();
        F_PATHPKG_CHECK = new Fcntl();
        F_FREEZE_FS = new Fcntl();
        F_THAW_FS = new Fcntl();
        F_GLOBAL_NOCACHE = new Fcntl();
        F_ADDSIGS = new Fcntl();
        F_MARKDEPENDENCY = new Fcntl();
        F_RDLCK = new Fcntl();
        F_UNLCK = new Fcntl();
        F_WRLCK = new Fcntl();
        F_ALLOCATECONTIG = new Fcntl();
        F_ALLOCATEALL = new Fcntl();
        F_GETPIPE_SZ = new Fcntl();
        F_SETPIPE_SZ = new Fcntl();
        __UNKNOWN_CONSTANT__ = new Fcntl();
        Fcntl[] fcntlArray = new Fcntl[42];
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
        fcntlArray[41] = __UNKNOWN_CONSTANT__;
        $VALUES = fcntlArray;
        resolver = ConstantResolver.getResolver(Fcntl.class, 20000, 20999);
    }
}

