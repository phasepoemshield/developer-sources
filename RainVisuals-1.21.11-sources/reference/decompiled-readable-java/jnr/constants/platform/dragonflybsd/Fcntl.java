/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Fcntl
extends Enum<Fcntl>
implements Constant {
    public static final /* enum */ Fcntl FREAD;
    public static final /* enum */ Fcntl F_SETOWN;
    public static final /* enum */ Fcntl F_DUPFD;
    private static final /* synthetic */ Fcntl[] $VALUES;
    public static final /* enum */ Fcntl F_SETLKW;
    public static final /* enum */ Fcntl FNDELAY;
    public static final /* enum */ Fcntl FAPPEND;
    public static final /* enum */ Fcntl F_SETFL;
    public static final /* enum */ Fcntl FNONBLOCK;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Fcntl F_GETFL;
    public static final /* enum */ Fcntl F_GETOWN;
    public static final /* enum */ Fcntl F_RDLCK;
    public static final long MAX_VALUE = 128L;
    public static final /* enum */ Fcntl FFSYNC;
    public static final /* enum */ Fcntl F_SETFD;
    public static final /* enum */ Fcntl F_WRLCK;
    public static final /* enum */ Fcntl FASYNC;
    public static final /* enum */ Fcntl F_UNLCK;
    public static final /* enum */ Fcntl FWRITE;
    private final long value;
    public static final /* enum */ Fcntl F_SETLK;
    public static final /* enum */ Fcntl F_GETLK;
    public static final /* enum */ Fcntl F_GETFD;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static Fcntl valueOf(String name) {
        return Enum.valueOf(Fcntl.class, name);
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private Fcntl(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static Fcntl[] values() {
        return (Fcntl[])$VALUES.clone();
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
        F_RDLCK = new Fcntl(1L);
        F_UNLCK = new Fcntl(2L);
        F_WRLCK = new Fcntl(3L);
        Fcntl[] fcntlArray = new Fcntl[20];
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
        fcntlArray[17] = F_RDLCK;
        fcntlArray[18] = F_UNLCK;
        fcntlArray[19] = F_WRLCK;
        $VALUES = fcntlArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
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
            map.put(F_RDLCK, "F_RDLCK");
            map.put(F_UNLCK, "F_UNLCK");
            map.put(F_WRLCK, "F_WRLCK");
            return map;
        }
    }
}

