/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class Signal
extends Enum<Signal>
implements Constant {
    public static final /* enum */ Signal SIGRTMAX;
    public static final /* enum */ Signal SIGHUP;
    public static final /* enum */ Signal SIGQUIT;
    public static final /* enum */ Signal SIGURG;
    public static final /* enum */ Signal SIGSYS;
    private static final /* synthetic */ Signal[] $VALUES;
    public static final /* enum */ Signal SIGFPE;
    public static final /* enum */ Signal SIGTTIN;
    public static final /* enum */ Signal SIGTTOU;
    public static final /* enum */ Signal SIGTERM;
    public static final /* enum */ Signal SIGALRM;
    public static final /* enum */ Signal SIGUSR2;
    private final long value;
    public static final /* enum */ Signal SIGCLD;
    public static final /* enum */ Signal SIGCONT;
    public static final /* enum */ Signal SIGIOT;
    public static final /* enum */ Signal SIGTSTP;
    public static final /* enum */ Signal SIGKILL;
    public static final /* enum */ Signal SIGSTOP;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Signal SIGBUS;
    public static final /* enum */ Signal SIGPWR;
    public static final /* enum */ Signal SIGILL;
    public static final /* enum */ Signal SIGABRT;
    public static final /* enum */ Signal SIGVTALRM;
    public static final /* enum */ Signal SIGTRAP;
    public static final /* enum */ Signal SIGSEGV;
    public static final /* enum */ Signal SIGPOLL;
    public static final /* enum */ Signal SIGWINCH;
    public static final /* enum */ Signal SIGXFSZ;
    public static final /* enum */ Signal SIGPIPE;
    public static final long MAX_VALUE = 256L;
    public static final /* enum */ Signal SIGCHLD;
    public static final /* enum */ Signal SIGIO;
    public static final /* enum */ Signal SIGXCPU;
    public static final /* enum */ Signal SIGRTMIN;
    public static final /* enum */ Signal SIGINT;
    public static final /* enum */ Signal SIGPROF;
    public static final /* enum */ Signal NSIG;
    public static final /* enum */ Signal SIGUSR1;

    static {
        SIGHUP = new Signal(1L);
        SIGINT = new Signal(2L);
        SIGQUIT = new Signal(3L);
        SIGILL = new Signal(4L);
        SIGTRAP = new Signal(5L);
        SIGABRT = new Signal(6L);
        SIGIOT = new Signal(6L);
        SIGBUS = new Signal(10L);
        SIGFPE = new Signal(8L);
        SIGKILL = new Signal(9L);
        SIGUSR1 = new Signal(30L);
        SIGSEGV = new Signal(11L);
        SIGUSR2 = new Signal(31L);
        SIGPIPE = new Signal(13L);
        SIGALRM = new Signal(14L);
        SIGTERM = new Signal(15L);
        SIGCLD = new Signal(20L);
        SIGCHLD = new Signal(20L);
        SIGCONT = new Signal(19L);
        SIGSTOP = new Signal(17L);
        SIGTSTP = new Signal(18L);
        SIGTTIN = new Signal(21L);
        SIGTTOU = new Signal(22L);
        SIGURG = new Signal(16L);
        SIGXCPU = new Signal(24L);
        SIGXFSZ = new Signal(25L);
        SIGVTALRM = new Signal(34L);
        SIGPROF = new Signal(32L);
        SIGWINCH = new Signal(28L);
        SIGPOLL = new Signal(23L);
        SIGIO = new Signal(23L);
        SIGPWR = new Signal(29L);
        SIGSYS = new Signal(12L);
        SIGRTMIN = new Signal(50L);
        SIGRTMAX = new Signal(57L);
        NSIG = new Signal(256L);
        Signal[] signalArray = new Signal[36];
        signalArray[0] = SIGHUP;
        signalArray[1] = SIGINT;
        signalArray[2] = SIGQUIT;
        signalArray[3] = SIGILL;
        signalArray[4] = SIGTRAP;
        signalArray[5] = SIGABRT;
        signalArray[6] = SIGIOT;
        signalArray[7] = SIGBUS;
        signalArray[8] = SIGFPE;
        signalArray[9] = SIGKILL;
        signalArray[10] = SIGUSR1;
        signalArray[11] = SIGSEGV;
        signalArray[12] = SIGUSR2;
        signalArray[13] = SIGPIPE;
        signalArray[14] = SIGALRM;
        signalArray[15] = SIGTERM;
        signalArray[16] = SIGCLD;
        signalArray[17] = SIGCHLD;
        signalArray[18] = SIGCONT;
        signalArray[19] = SIGSTOP;
        signalArray[20] = SIGTSTP;
        signalArray[21] = SIGTTIN;
        signalArray[22] = SIGTTOU;
        signalArray[23] = SIGURG;
        signalArray[24] = SIGXCPU;
        signalArray[25] = SIGXFSZ;
        signalArray[26] = SIGVTALRM;
        signalArray[27] = SIGPROF;
        signalArray[28] = SIGWINCH;
        signalArray[29] = SIGPOLL;
        signalArray[30] = SIGIO;
        signalArray[31] = SIGPWR;
        signalArray[32] = SIGSYS;
        signalArray[33] = SIGRTMIN;
        signalArray[34] = SIGRTMAX;
        signalArray[35] = NSIG;
        $VALUES = signalArray;
    }

    public static Signal[] values() {
        return (Signal[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static Signal valueOf(String name) {
        return Enum.valueOf(Signal.class, name);
    }

    private Signal(long value) {
        this.value = value;
    }
}

