package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Signal.java
public enum Signal implements Constant {
   SIGILL(4L),
   SIGBUS(10L),
   SIGHUP(1L),
   SIGTTOU(27L),
   SIGTSTP(24L),
   SIGSTOP(23L),
   SIGPROF(29L),
   NSIG(128L),
   SIGXFSZ(31L),
   SIGTERM(15L),
   SIGTTIN(26L),
   SIGSYS(12L),
   SIGABRT(6L),
   SIGINT(2L),
   SIGCONT(25L),
   SIGWINCH(20L),
   SIGURG(21L),
   SIGQUIT(3L),
   SIGIOT(6L),
   SIGRTMIN(34L),
   SIGPWR(19L),
   SIGSEGV(11L),
   SIGIO(22L),
   SIGUSR2(17L),
   SIGVTALRM(28L),
   SIGPOLL(22L),
   SIGALRM(14L),
   SIGRTMAX(127L),
   SIGCHLD(18L),
   SIGTRAP(5L),
   SIGKILL(9L),
   SIGUSR1(16L),
   SIGFPE(8L),
   SIGXCPU(30L),
   SIGPIPE(13L),
   SIGCLD(18L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 128L;
   private final long value;

   public final int value() {
      return (int)this.value;
   }

   Signal(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return Signal.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   // $VF: Compiled from Signal.java
   static final class StringTable {
      public static final Map<Signal, String> descriptions = generateTable();

      public static final Map<Signal, String> generateTable() {
         Map<Signal, String> map = new EnumMap<>(Signal.class);
         map.put(Signal.SIGHUP, "SIGHUP");
         map.put(Signal.SIGINT, "SIGINT");
         map.put(Signal.SIGQUIT, "SIGQUIT");
         map.put(Signal.SIGILL, "SIGILL");
         map.put(Signal.SIGTRAP, "SIGTRAP");
         map.put(Signal.SIGABRT, "SIGABRT");
         map.put(Signal.SIGIOT, "SIGIOT");
         map.put(Signal.SIGBUS, "SIGBUS");
         map.put(Signal.SIGFPE, "SIGFPE");
         map.put(Signal.SIGKILL, "SIGKILL");
         map.put(Signal.SIGUSR1, "SIGUSR1");
         map.put(Signal.SIGSEGV, "SIGSEGV");
         map.put(Signal.SIGUSR2, "SIGUSR2");
         map.put(Signal.SIGPIPE, "SIGPIPE");
         map.put(Signal.SIGALRM, "SIGALRM");
         map.put(Signal.SIGTERM, "SIGTERM");
         map.put(Signal.SIGCLD, "SIGCLD");
         map.put(Signal.SIGCHLD, "SIGCHLD");
         map.put(Signal.SIGCONT, "SIGCONT");
         map.put(Signal.SIGSTOP, "SIGSTOP");
         map.put(Signal.SIGTSTP, "SIGTSTP");
         map.put(Signal.SIGTTIN, "SIGTTIN");
         map.put(Signal.SIGTTOU, "SIGTTOU");
         map.put(Signal.SIGURG, "SIGURG");
         map.put(Signal.SIGXCPU, "SIGXCPU");
         map.put(Signal.SIGXFSZ, "SIGXFSZ");
         map.put(Signal.SIGVTALRM, "SIGVTALRM");
         map.put(Signal.SIGPROF, "SIGPROF");
         map.put(Signal.SIGWINCH, "SIGWINCH");
         map.put(Signal.SIGPOLL, "SIGPOLL");
         map.put(Signal.SIGIO, "SIGIO");
         map.put(Signal.SIGPWR, "SIGPWR");
         map.put(Signal.SIGSYS, "SIGSYS");
         map.put(Signal.SIGRTMIN, "SIGRTMIN");
         map.put(Signal.SIGRTMAX, "SIGRTMAX");
         map.put(Signal.NSIG, "NSIG");
         return map;
      }
   }
}
