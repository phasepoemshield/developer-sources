/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class Fcntl
extends Enum<Fcntl>
implements Constant {
    public static final /* enum */ Fcntl F_UNLCK;
    public static final /* enum */ Fcntl F_SETLKW;
    public static final long MIN_VALUE = 0L;
    private static final /* synthetic */ Fcntl[] $VALUES;
    public static final /* enum */ Fcntl F_SETFD;
    public static final /* enum */ Fcntl F_RDLCK;
    public static final /* enum */ Fcntl F_WRLCK;
    public static final /* enum */ Fcntl F_GETFD;
    public static final /* enum */ Fcntl F_GETFL;
    public static final /* enum */ Fcntl F_GETOWN;
    public static final /* enum */ Fcntl F_SETFL;
    public static final /* enum */ Fcntl F_SETLK;
    public static final /* enum */ Fcntl F_DUPFD;
    public static final long MAX_VALUE = 13L;
    private final long value;
    public static final /* enum */ Fcntl F_SETOWN;
    public static final /* enum */ Fcntl F_GETLK;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private Fcntl(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Fcntl[] values() {
        return (Fcntl[])$VALUES.clone();
    }

    static {
        F_DUPFD = new Fcntl(0L);
        F_GETFD = new Fcntl(1L);
        F_SETFD = new Fcntl(2L);
        F_GETFL = new Fcntl(3L);
        F_SETFL = new Fcntl(4L);
        F_GETOWN = new Fcntl(8L);
        F_SETOWN = new Fcntl(9L);
        F_GETLK = new Fcntl(11L);
        F_SETLK = new Fcntl(12L);
        F_SETLKW = new Fcntl(13L);
        F_RDLCK = new Fcntl(1L);
        F_UNLCK = new Fcntl(3L);
        F_WRLCK = new Fcntl(2L);
        Fcntl[] fcntlArray = new Fcntl[13];
        fcntlArray[0] = F_DUPFD;
        fcntlArray[1] = F_GETFD;
        fcntlArray[2] = F_SETFD;
        fcntlArray[3] = F_GETFL;
        fcntlArray[4] = F_SETFL;
        fcntlArray[5] = F_GETOWN;
        fcntlArray[6] = F_SETOWN;
        fcntlArray[7] = F_GETLK;
        fcntlArray[8] = F_SETLK;
        fcntlArray[9] = F_SETLKW;
        fcntlArray[10] = F_RDLCK;
        fcntlArray[11] = F_UNLCK;
        fcntlArray[12] = F_WRLCK;
        $VALUES = fcntlArray;
    }

    public static Fcntl valueOf(String name) {
        return Enum.valueOf(Fcntl.class, name);
    }
}

