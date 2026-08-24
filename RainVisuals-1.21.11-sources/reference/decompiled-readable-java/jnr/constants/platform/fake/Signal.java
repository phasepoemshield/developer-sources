/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Signal
extends Enum<Signal>
implements Constant {
    public static final /* enum */ Signal SIGTSTP;
    public static final /* enum */ Signal SIGXFSZ;
    public static final /* enum */ Signal SIGRTMIN;
    public static final /* enum */ Signal SIGRTMAX;
    public static final /* enum */ Signal SIGSEGV;
    public static final /* enum */ Signal SIGUSR2;
    public static final /* enum */ Signal SIGSTOP;
    public static final /* enum */ Signal SIGSYS;
    public static final /* enum */ Signal SIGFPE;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Signal SIGUSR1;
    public static final /* enum */ Signal SIGPIPE;
    public static final /* enum */ Signal SIGCHLD;
    public static final /* enum */ Signal SIGCLD;
    public static final /* enum */ Signal SIGTRAP;
    public static final /* enum */ Signal SIGIO;
    public static final /* enum */ Signal SIGTERM;
    public static final /* enum */ Signal SIGWINCH;
    public static final /* enum */ Signal SIGILL;
    public static final /* enum */ Signal SIGUNUSED;
    public static final /* enum */ Signal SIGCONT;
    public static final /* enum */ Signal SIGTTOU;
    public static final /* enum */ Signal SIGQUIT;
    private static final /* synthetic */ Signal[] $VALUES;
    public static final /* enum */ Signal SIGSTKFLT;
    public static final /* enum */ Signal SIGALRM;
    public static final /* enum */ Signal SIGVTALRM;
    public static final /* enum */ Signal SIGPWR;
    public static final /* enum */ Signal SIGPOLL;
    public static final /* enum */ Signal SIGINT;
    public static final /* enum */ Signal SIGKILL;
    public static final /* enum */ Signal SIGIOT;
    private final long value;
    public static final /* enum */ Signal SIGXCPU;
    public static final /* enum */ Signal SIGABRT;
    public static final /* enum */ Signal SIGTTIN;
    public static final /* enum */ Signal NSIG;
    public static final /* enum */ Signal SIGPROF;
    public static final long MAX_VALUE = 38L;
    public static final /* enum */ Signal SIGBUS;
    public static final /* enum */ Signal SIGURG;
    public static final /* enum */ Signal SIGHUP;

    @Override
    public final boolean defined() {
        return true;
    }

    private Signal(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static Signal[] values() {
        return (Signal[])$VALUES.clone();
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

    static {
        SIGHUP = new Signal(1L);
        SIGINT = new Signal(2L);
        SIGQUIT = new Signal(3L);
        SIGILL = new Signal(4L);
        SIGTRAP = new Signal(5L);
        SIGABRT = new Signal(6L);
        SIGIOT = new Signal(7L);
        SIGBUS = new Signal(8L);
        SIGFPE = new Signal(9L);
        SIGKILL = new Signal(10L);
        SIGUSR1 = new Signal(11L);
        SIGSEGV = new Signal(12L);
        SIGUSR2 = new Signal(13L);
        SIGPIPE = new Signal(14L);
        SIGALRM = new Signal(15L);
        SIGTERM = new Signal(16L);
        SIGSTKFLT = new Signal(17L);
        SIGCLD = new Signal(18L);
        SIGCHLD = new Signal(19L);
        SIGCONT = new Signal(20L);
        SIGSTOP = new Signal(21L);
        SIGTSTP = new Signal(22L);
        SIGTTIN = new Signal(23L);
        SIGTTOU = new Signal(24L);
        SIGURG = new Signal(25L);
        SIGXCPU = new Signal(26L);
        SIGXFSZ = new Signal(27L);
        SIGVTALRM = new Signal(28L);
        SIGPROF = new Signal(29L);
        SIGWINCH = new Signal(30L);
        SIGPOLL = new Signal(31L);
        SIGIO = new Signal(32L);
        SIGPWR = new Signal(33L);
        SIGSYS = new Signal(34L);
        SIGUNUSED = new Signal(35L);
        SIGRTMIN = new Signal(36L);
        SIGRTMAX = new Signal(37L);
        NSIG = new Signal(38L);
        Signal[] signalArray = new Signal[38];
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
        signalArray[16] = SIGSTKFLT;
        signalArray[17] = SIGCLD;
        signalArray[18] = SIGCHLD;
        signalArray[19] = SIGCONT;
        signalArray[20] = SIGSTOP;
        signalArray[21] = SIGTSTP;
        signalArray[22] = SIGTTIN;
        signalArray[23] = SIGTTOU;
        signalArray[24] = SIGURG;
        signalArray[25] = SIGXCPU;
        signalArray[26] = SIGXFSZ;
        signalArray[27] = SIGVTALRM;
        signalArray[28] = SIGPROF;
        signalArray[29] = SIGWINCH;
        signalArray[30] = SIGPOLL;
        signalArray[31] = SIGIO;
        signalArray[32] = SIGPWR;
        signalArray[33] = SIGSYS;
        signalArray[34] = SIGUNUSED;
        signalArray[35] = SIGRTMIN;
        signalArray[36] = SIGRTMAX;
        signalArray[37] = NSIG;
        $VALUES = signalArray;
    }
}

