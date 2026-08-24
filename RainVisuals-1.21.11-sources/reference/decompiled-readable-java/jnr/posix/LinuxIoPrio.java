/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

public abstract class LinuxIoPrio {
    public static int IOPRIO_WHO_USER;
    public static int IOPRIO_WHO_PROCESS;
    public static int IOPRIO_CLASS_IDLE;
    public static int IOPRIO_CLASS_BE;
    public static int IOPRIO_CLASS_NONE;
    public static int IOPRIO_CLASS_RT;
    public static int IOPRIO_WHO_PGRP;

    public static int IOPRIO_PRIO_DATA(int mask) {
        return mask & 0xF;
    }

    static {
        IOPRIO_WHO_PROCESS = 1;
        IOPRIO_WHO_PGRP = 2;
        IOPRIO_WHO_USER = 3;
        IOPRIO_CLASS_NONE = 0;
        IOPRIO_CLASS_RT = 1;
        IOPRIO_CLASS_BE = 2;
        IOPRIO_CLASS_IDLE = 3;
    }

    public static int IOPRIO_PRIO_VALUE(int _class, int data) {
        return _class << 13 | data;
    }

    public static int IOPRIO_PRIO_CLASS(int mask) {
        return mask >> 13;
    }
}

