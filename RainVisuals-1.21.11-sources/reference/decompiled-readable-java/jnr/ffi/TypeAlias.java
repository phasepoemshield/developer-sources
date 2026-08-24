/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

public final class TypeAlias
extends Enum<TypeAlias> {
    public static final /* enum */ TypeAlias tcflag_t;
    public static final /* enum */ TypeAlias in_port_t;
    public static final /* enum */ TypeAlias gid_t;
    public static final /* enum */ TypeAlias clock_t;
    public static final /* enum */ TypeAlias uid_t;
    public static final /* enum */ TypeAlias fsfilcnt_t;
    public static final /* enum */ TypeAlias time_t;
    public static final /* enum */ TypeAlias dev_t;
    public static final /* enum */ TypeAlias socklen_t;
    public static final /* enum */ TypeAlias ino_t;
    public static final /* enum */ TypeAlias blkcnt_t;
    public static final /* enum */ TypeAlias mode_t;
    public static final /* enum */ TypeAlias int64_t;
    public static final /* enum */ TypeAlias int32_t;
    public static final /* enum */ TypeAlias nlink_t;
    public static final /* enum */ TypeAlias u_int64_t;
    public static final /* enum */ TypeAlias in_addr_t;
    public static final /* enum */ TypeAlias uintptr_t;
    public static final /* enum */ TypeAlias blksize_t;
    public static final /* enum */ TypeAlias ino64_t;
    public static final /* enum */ TypeAlias off_t;
    private static final /* synthetic */ TypeAlias[] $VALUES;
    public static final /* enum */ TypeAlias u_int32_t;
    public static final /* enum */ TypeAlias int16_t;
    public static final /* enum */ TypeAlias caddr_t;
    public static final /* enum */ TypeAlias int8_t;
    public static final /* enum */ TypeAlias fsblkcnt_t;
    public static final /* enum */ TypeAlias rlim_t;
    public static final /* enum */ TypeAlias key_t;
    public static final /* enum */ TypeAlias sa_family_t;
    public static final /* enum */ TypeAlias u_int16_t;
    public static final /* enum */ TypeAlias id_t;
    public static final /* enum */ TypeAlias intptr_t;
    public static final /* enum */ TypeAlias swblk_t;
    public static final /* enum */ TypeAlias speed_t;
    public static final /* enum */ TypeAlias u_int8_t;
    public static final /* enum */ TypeAlias ssize_t;
    public static final /* enum */ TypeAlias pid_t;
    public static final /* enum */ TypeAlias cc_t;
    public static final /* enum */ TypeAlias size_t;

    private static /* synthetic */ TypeAlias[] $values() {
        TypeAlias[] typeAliasArray = new TypeAlias[39];
        typeAliasArray[0] = int8_t;
        typeAliasArray[1] = u_int8_t;
        typeAliasArray[2] = int16_t;
        typeAliasArray[3] = u_int16_t;
        typeAliasArray[4] = int32_t;
        typeAliasArray[5] = u_int32_t;
        typeAliasArray[6] = int64_t;
        typeAliasArray[7] = u_int64_t;
        typeAliasArray[8] = intptr_t;
        typeAliasArray[9] = uintptr_t;
        typeAliasArray[10] = caddr_t;
        typeAliasArray[11] = dev_t;
        typeAliasArray[12] = blkcnt_t;
        typeAliasArray[13] = blksize_t;
        typeAliasArray[14] = gid_t;
        typeAliasArray[15] = in_addr_t;
        typeAliasArray[16] = in_port_t;
        typeAliasArray[17] = ino_t;
        typeAliasArray[18] = ino64_t;
        typeAliasArray[19] = key_t;
        typeAliasArray[20] = mode_t;
        typeAliasArray[21] = nlink_t;
        typeAliasArray[22] = id_t;
        typeAliasArray[23] = pid_t;
        typeAliasArray[24] = off_t;
        typeAliasArray[25] = swblk_t;
        typeAliasArray[26] = uid_t;
        typeAliasArray[27] = clock_t;
        typeAliasArray[28] = size_t;
        typeAliasArray[29] = ssize_t;
        typeAliasArray[30] = time_t;
        typeAliasArray[31] = fsblkcnt_t;
        typeAliasArray[32] = fsfilcnt_t;
        typeAliasArray[33] = sa_family_t;
        typeAliasArray[34] = socklen_t;
        typeAliasArray[35] = rlim_t;
        typeAliasArray[36] = cc_t;
        typeAliasArray[37] = speed_t;
        typeAliasArray[38] = tcflag_t;
        return typeAliasArray;
    }

    public static TypeAlias[] values() {
        return (TypeAlias[])$VALUES.clone();
    }

    static {
        int8_t = new TypeAlias();
        u_int8_t = new TypeAlias();
        int16_t = new TypeAlias();
        u_int16_t = new TypeAlias();
        int32_t = new TypeAlias();
        u_int32_t = new TypeAlias();
        int64_t = new TypeAlias();
        u_int64_t = new TypeAlias();
        intptr_t = new TypeAlias();
        uintptr_t = new TypeAlias();
        caddr_t = new TypeAlias();
        dev_t = new TypeAlias();
        blkcnt_t = new TypeAlias();
        blksize_t = new TypeAlias();
        gid_t = new TypeAlias();
        in_addr_t = new TypeAlias();
        in_port_t = new TypeAlias();
        ino_t = new TypeAlias();
        ino64_t = new TypeAlias();
        key_t = new TypeAlias();
        mode_t = new TypeAlias();
        nlink_t = new TypeAlias();
        id_t = new TypeAlias();
        pid_t = new TypeAlias();
        off_t = new TypeAlias();
        swblk_t = new TypeAlias();
        uid_t = new TypeAlias();
        clock_t = new TypeAlias();
        size_t = new TypeAlias();
        ssize_t = new TypeAlias();
        time_t = new TypeAlias();
        fsblkcnt_t = new TypeAlias();
        fsfilcnt_t = new TypeAlias();
        sa_family_t = new TypeAlias();
        socklen_t = new TypeAlias();
        rlim_t = new TypeAlias();
        cc_t = new TypeAlias();
        speed_t = new TypeAlias();
        tcflag_t = new TypeAlias();
        $VALUES = TypeAlias.$values();
    }

    public static TypeAlias valueOf(String name) {
        return Enum.valueOf(TypeAlias.class, name);
    }
}

