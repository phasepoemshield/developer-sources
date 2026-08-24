/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Access
extends Enum<Access>
implements Constant {
    private static final /* synthetic */ Access[] $VALUES;
    public static final /* enum */ Access W_OK;
    public static final /* enum */ Access R_OK;
    private final long value;
    public static final long MAX_VALUE = 4L;
    public static final /* enum */ Access X_OK;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Access F_OK;

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        F_OK = new Access(0L);
        X_OK = new Access(1L);
        W_OK = new Access(2L);
        R_OK = new Access(4L);
        Access[] accessArray = new Access[4];
        accessArray[0] = F_OK;
        accessArray[1] = X_OK;
        accessArray[2] = W_OK;
        accessArray[3] = R_OK;
        $VALUES = accessArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static Access[] values() {
        return (Access[])$VALUES.clone();
    }

    private Access(long value) {
        this.value = value;
    }

    public static Access valueOf(String name) {
        return Enum.valueOf(Access.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<Access, String> descriptions = StringTable.generateTable();

        public static final Map<Access, String> generateTable() {
            EnumMap<Access, String> map = new EnumMap<Access, String>(Access.class);
            map.put(F_OK, "F_OK");
            map.put(X_OK, "X_OK");
            map.put(W_OK, "W_OK");
            map.put(R_OK, "R_OK");
            return map;
        }

        StringTable() {
        }
    }
}

