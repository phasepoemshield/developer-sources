/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Signal
extends Enum<Signal>
implements Constant {
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Signal SIGILL;
    public static final /* enum */ Signal SIGBUS;
    public static final /* enum */ Signal SIGHUP;
    public static final /* enum */ Signal SIGTTOU;
    public static final /* enum */ Signal SIGTSTP;
    public static final /* enum */ Signal SIGSTOP;
    public static final /* enum */ Signal SIGPROF;
    public static final /* enum */ Signal NSIG;
    public static final /* enum */ Signal SIGXFSZ;
    public static final /* enum */ Signal SIGTERM;
    private static final /* synthetic */ Signal[] $VALUES;
    public static final /* enum */ Signal SIGTTIN;
    public static final /* enum */ Signal SIGSYS;
    public static final /* enum */ Signal SIGABRT;
    public static final long MAX_VALUE = 128L;
    public static final /* enum */ Signal SIGINT;
    public static final /* enum */ Signal SIGCONT;
    public static final /* enum */ Signal SIGWINCH;
    public static final /* enum */ Signal SIGURG;
    public static final /* enum */ Signal SIGQUIT;
    public static final /* enum */ Signal SIGIOT;
    public static final /* enum */ Signal SIGRTMIN;
    public static final /* enum */ Signal SIGPWR;
    public static final /* enum */ Signal SIGSEGV;
    public static final /* enum */ Signal SIGIO;
    public static final /* enum */ Signal SIGUSR2;
    public static final /* enum */ Signal SIGVTALRM;
    public static final /* enum */ Signal SIGPOLL;
    private final long value;
    public static final /* enum */ Signal SIGALRM;
    public static final /* enum */ Signal SIGRTMAX;
    public static final /* enum */ Signal SIGCHLD;
    public static final /* enum */ Signal SIGTRAP;
    public static final /* enum */ Signal SIGKILL;
    public static final /* enum */ Signal SIGUSR1;
    public static final /* enum */ Signal SIGFPE;
    public static final /* enum */ Signal SIGXCPU;
    public static final /* enum */ Signal SIGPIPE;
    public static final /* enum */ Signal SIGCLD;

    public final int value() {
        return (int)this.value;
    }

    private Signal(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static Signal valueOf(String name) {
        return Enum.valueOf(Signal.class, name);
    }

    public static Signal[] values() {
        return (Signal[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

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
        SIGUSR1 = new Signal(16L);
        SIGSEGV = new Signal(11L);
        SIGUSR2 = new Signal(17L);
        SIGPIPE = new Signal(13L);
        SIGALRM = new Signal(14L);
        SIGTERM = new Signal(15L);
        SIGCLD = new Signal(18L);
        SIGCHLD = new Signal(18L);
        SIGCONT = new Signal(25L);
        SIGSTOP = new Signal(23L);
        SIGTSTP = new Signal(24L);
        SIGTTIN = new Signal(26L);
        SIGTTOU = new Signal(27L);
        SIGURG = new Signal(21L);
        SIGXCPU = new Signal(30L);
        SIGXFSZ = new Signal(31L);
        SIGVTALRM = new Signal(28L);
        SIGPROF = new Signal(29L);
        SIGWINCH = new Signal(20L);
        SIGPOLL = new Signal(22L);
        SIGIO = new Signal(22L);
        SIGPWR = new Signal(19L);
        SIGSYS = new Signal(12L);
        SIGRTMIN = new Signal(34L);
        SIGRTMAX = new Signal(127L);
        NSIG = new Signal(128L);
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

    static final class StringTable {
        public static final Map<Signal, String> descriptions = StringTable.generateTable();

        public static final Map<Signal, String> generateTable() {
            EnumMap<Signal, String> map = new EnumMap<Signal, String>(Signal.class);
            map.put(SIGHUP, "SIGHUP");
            map.put(SIGINT, "SIGINT");
            map.put(SIGQUIT, "SIGQUIT");
            map.put(SIGILL, "SIGILL");
            map.put(SIGTRAP, "SIGTRAP");
            map.put(SIGABRT, "SIGABRT");
            map.put(SIGIOT, "SIGIOT");
            map.put(SIGBUS, "SIGBUS");
            map.put(SIGFPE, "SIGFPE");
            map.put(SIGKILL, "SIGKILL");
            map.put(SIGUSR1, "SIGUSR1");
            map.put(SIGSEGV, "SIGSEGV");
            map.put(SIGUSR2, "SIGUSR2");
            map.put(SIGPIPE, "SIGPIPE");
            map.put(SIGALRM, "SIGALRM");
            map.put(SIGTERM, "SIGTERM");
            map.put(SIGCLD, "SIGCLD");
            map.put(SIGCHLD, "SIGCHLD");
            map.put(SIGCONT, "SIGCONT");
            map.put(SIGSTOP, "SIGSTOP");
            map.put(SIGTSTP, "SIGTSTP");
            map.put(SIGTTIN, "SIGTTIN");
            map.put(SIGTTOU, "SIGTTOU");
            map.put(SIGURG, "SIGURG");
            map.put(SIGXCPU, "SIGXCPU");
            map.put(SIGXFSZ, "SIGXFSZ");
            map.put(SIGVTALRM, "SIGVTALRM");
            map.put(SIGPROF, "SIGPROF");
            map.put(SIGWINCH, "SIGWINCH");
            map.put(SIGPOLL, "SIGPOLL");
            map.put(SIGIO, "SIGIO");
            map.put(SIGPWR, "SIGPWR");
            map.put(SIGSYS, "SIGSYS");
            map.put(SIGRTMIN, "SIGRTMIN");
            map.put(SIGRTMAX, "SIGRTMAX");
            map.put(NSIG, "NSIG");
            return map;
        }

        StringTable() {
        }
    }
}

