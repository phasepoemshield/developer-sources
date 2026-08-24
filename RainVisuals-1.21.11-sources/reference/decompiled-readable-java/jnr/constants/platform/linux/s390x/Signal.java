/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.s390x;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Signal
extends Enum<Signal>
implements Constant {
    public static final /* enum */ Signal SIGUSR1;
    public static final /* enum */ Signal SIGSEGV;
    public static final /* enum */ Signal SIGTTOU;
    public static final /* enum */ Signal SIGTERM;
    public static final /* enum */ Signal SIGFPE;
    public static final /* enum */ Signal SIGUSR2;
    public static final /* enum */ Signal SIGILL;
    public static final /* enum */ Signal SIGURG;
    public static final /* enum */ Signal SIGSTOP;
    public static final /* enum */ Signal SIGCONT;
    public static final /* enum */ Signal SIGALRM;
    private final long value;
    public static final /* enum */ Signal SIGBUS;
    public static final /* enum */ Signal SIGABRT;
    public static final /* enum */ Signal SIGPIPE;
    private static final /* synthetic */ Signal[] $VALUES;
    public static final /* enum */ Signal SIGVTALRM;
    public static final long MAX_VALUE = 65L;
    public static final /* enum */ Signal SIGTTIN;
    public static final /* enum */ Signal SIGXFSZ;
    public static final /* enum */ Signal SIGQUIT;
    public static final /* enum */ Signal SIGRTMAX;
    public static final /* enum */ Signal SIGPROF;
    public static final /* enum */ Signal SIGINT;
    public static final /* enum */ Signal SIGIO;
    public static final /* enum */ Signal SIGRTMIN;
    public static final /* enum */ Signal SIGXCPU;
    public static final /* enum */ Signal SIGPOLL;
    public static final /* enum */ Signal SIGSYS;
    public static final /* enum */ Signal SIGSTKFLT;
    public static final /* enum */ Signal SIGIOT;
    public static final /* enum */ Signal SIGKILL;
    public static final /* enum */ Signal SIGHUP;
    public static final /* enum */ Signal SIGPWR;
    public static final /* enum */ Signal SIGTRAP;
    public static final /* enum */ Signal SIGCHLD;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Signal SIGWINCH;
    public static final /* enum */ Signal SIGTSTP;
    public static final /* enum */ Signal SIGCLD;
    public static final /* enum */ Signal NSIG;

    @Override
    public final int intValue() {
        return (int)this.value;
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
        SIGIOT = new Signal(6L);
        SIGBUS = new Signal(7L);
        SIGFPE = new Signal(8L);
        SIGKILL = new Signal(9L);
        SIGUSR1 = new Signal(10L);
        SIGSEGV = new Signal(11L);
        SIGUSR2 = new Signal(12L);
        SIGPIPE = new Signal(13L);
        SIGALRM = new Signal(14L);
        SIGTERM = new Signal(15L);
        SIGSTKFLT = new Signal(16L);
        SIGCLD = new Signal(17L);
        SIGCHLD = new Signal(17L);
        SIGCONT = new Signal(18L);
        SIGSTOP = new Signal(19L);
        SIGTSTP = new Signal(20L);
        SIGTTIN = new Signal(21L);
        SIGTTOU = new Signal(22L);
        SIGURG = new Signal(23L);
        SIGXCPU = new Signal(24L);
        SIGXFSZ = new Signal(25L);
        SIGVTALRM = new Signal(26L);
        SIGPROF = new Signal(27L);
        SIGWINCH = new Signal(28L);
        SIGPOLL = new Signal(29L);
        SIGIO = new Signal(29L);
        SIGPWR = new Signal(30L);
        SIGSYS = new Signal(31L);
        SIGRTMIN = new Signal(34L);
        SIGRTMAX = new Signal(64L);
        NSIG = new Signal(65L);
        Signal[] signalArray = new Signal[37];
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
        signalArray[34] = SIGRTMIN;
        signalArray[35] = SIGRTMAX;
        signalArray[36] = NSIG;
        $VALUES = signalArray;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private Signal(long value) {
        this.value = value;
    }

    public static Signal[] values() {
        return (Signal[])$VALUES.clone();
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
            map.put(SIGSTKFLT, "SIGSTKFLT");
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

