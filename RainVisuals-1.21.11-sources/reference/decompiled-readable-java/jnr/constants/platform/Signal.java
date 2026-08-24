/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Signal
extends Enum<Signal>
implements Constant {
    public static final /* enum */ Signal SIGVTALRM;
    public static final /* enum */ Signal SIGPOLL;
    public static final /* enum */ Signal SIGBUS;
    public static final /* enum */ Signal SIGTRAP;
    public static final /* enum */ Signal SIGABRT;
    public static final /* enum */ Signal SIGRTMAX;
    public static final /* enum */ Signal SIGALRM;
    public static final /* enum */ Signal NSIG;
    public static final /* enum */ Signal SIGPWR;
    public static final /* enum */ Signal SIGTTOU;
    public static final /* enum */ Signal SIGILL;
    public static final /* enum */ Signal SIGURG;
    public static final /* enum */ Signal SIGCLD;
    public static final /* enum */ Signal SIGPROF;
    public static final /* enum */ Signal SIGXCPU;
    public static final /* enum */ Signal SIGWINCH;
    public static final /* enum */ Signal SIGIO;
    public static final /* enum */ Signal SIGTSTP;
    public static final /* enum */ Signal SIGTERM;
    public static final /* enum */ Signal SIGPIPE;
    public static final /* enum */ Signal SIGSEGV;
    public static final /* enum */ Signal __UNKNOWN_CONSTANT__;
    public static final /* enum */ Signal SIGXFSZ;
    public static final /* enum */ Signal SIGSTKFLT;
    public static final /* enum */ Signal SIGIOT;
    public static final /* enum */ Signal SIGUSR2;
    public static final /* enum */ Signal SIGTTIN;
    public static final /* enum */ Signal SIGSTOP;
    public static final /* enum */ Signal SIGCHLD;
    public static final /* enum */ Signal SIGINT;
    public static final /* enum */ Signal SIGUNUSED;
    public static final /* enum */ Signal SIGUSR1;
    public static final /* enum */ Signal SIGKILL;
    private static final /* synthetic */ Signal[] $VALUES;
    public static final /* enum */ Signal SIGFPE;
    private static final ConstantResolver<Signal> resolver;
    public static final /* enum */ Signal SIGSYS;
    public static final /* enum */ Signal SIGRTMIN;
    public static final /* enum */ Signal SIGQUIT;
    public static final /* enum */ Signal SIGHUP;
    public static final /* enum */ Signal SIGCONT;

    static {
        SIGHUP = new Signal();
        SIGINT = new Signal();
        SIGQUIT = new Signal();
        SIGILL = new Signal();
        SIGTRAP = new Signal();
        SIGABRT = new Signal();
        SIGIOT = new Signal();
        SIGBUS = new Signal();
        SIGFPE = new Signal();
        SIGKILL = new Signal();
        SIGUSR1 = new Signal();
        SIGSEGV = new Signal();
        SIGUSR2 = new Signal();
        SIGPIPE = new Signal();
        SIGALRM = new Signal();
        SIGTERM = new Signal();
        SIGSTKFLT = new Signal();
        SIGCLD = new Signal();
        SIGCHLD = new Signal();
        SIGCONT = new Signal();
        SIGSTOP = new Signal();
        SIGTSTP = new Signal();
        SIGTTIN = new Signal();
        SIGTTOU = new Signal();
        SIGURG = new Signal();
        SIGXCPU = new Signal();
        SIGXFSZ = new Signal();
        SIGVTALRM = new Signal();
        SIGPROF = new Signal();
        SIGWINCH = new Signal();
        SIGPOLL = new Signal();
        SIGIO = new Signal();
        SIGPWR = new Signal();
        SIGSYS = new Signal();
        SIGUNUSED = new Signal();
        SIGRTMIN = new Signal();
        SIGRTMAX = new Signal();
        NSIG = new Signal();
        __UNKNOWN_CONSTANT__ = new Signal();
        Signal[] signalArray = new Signal[39];
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
        signalArray[38] = __UNKNOWN_CONSTANT__;
        $VALUES = signalArray;
        resolver = ConstantResolver.getResolver(Signal.class, 20000, 29999);
    }

    public static Signal valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static Signal valueOf(String name) {
        return Enum.valueOf(Signal.class, name);
    }

    public final String toString() {
        return this.description();
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static Signal[] values() {
        return (Signal[])$VALUES.clone();
    }

    public final String description() {
        return resolver.description(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }
}

