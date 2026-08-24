/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Fcntl
extends Enum<Fcntl>
implements Constant {
    public static final /* enum */ Fcntl F_SETFL;
    public static final /* enum */ Fcntl F_RDLCK;
    private static final /* synthetic */ Fcntl[] $VALUES;
    public static final /* enum */ Fcntl F_GETLK;
    public static final /* enum */ Fcntl F_SETLK;
    public static final /* enum */ Fcntl F_WRLCK;
    public static final long MAX_VALUE = 24L;
    public static final /* enum */ Fcntl F_UNLCK;
    public static final /* enum */ Fcntl F_GETFD;
    public static final /* enum */ Fcntl F_SETFD;
    public static final /* enum */ Fcntl F_DUPFD;
    public static final /* enum */ Fcntl F_SETLKW;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Fcntl F_SETOWN;
    public static final /* enum */ Fcntl F_GETOWN;
    private final long value;
    public static final /* enum */ Fcntl F_GETFL;

    static {
        F_DUPFD = new Fcntl(0L);
        F_GETFD = new Fcntl(1L);
        F_SETFD = new Fcntl(2L);
        F_GETFL = new Fcntl(3L);
        F_SETFL = new Fcntl(4L);
        F_GETOWN = new Fcntl(23L);
        F_SETOWN = new Fcntl(24L);
        F_GETLK = new Fcntl(14L);
        F_SETLK = new Fcntl(6L);
        F_SETLKW = new Fcntl(7L);
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

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
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

    public static Fcntl valueOf(String name) {
        return Enum.valueOf(Fcntl.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static final class StringTable {
        public static final Map<Fcntl, String> descriptions = StringTable.generateTable();

        public static final Map<Fcntl, String> generateTable() {
            EnumMap<Fcntl, String> map = new EnumMap<Fcntl, String>(Fcntl.class);
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

        StringTable() {
        }
    }
}

