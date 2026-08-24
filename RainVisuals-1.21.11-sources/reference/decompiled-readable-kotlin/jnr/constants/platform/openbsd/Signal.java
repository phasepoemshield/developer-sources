package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Signal.java
public enum Signal implements Constant {
   SIGXCPU(24L),
   SIGTRAP(5L),
   SIGCHLD(20L),
   SIGFPE(8L),
   SIGVTALRM(26L),
   SIGALRM(14L),
   SIGPIPE(13L),
   SIGSYS(12L),
   SIGURG(16L),
   SIGTERM(15L),
   SIGINT(2L),
   SIGILL(4L),
   SIGWINCH(28L),
   SIGBUS(10L),
   SIGPROF(27L),
   SIGTSTP(18L),
   SIGTTIN(21L),
   SIGIOT(6L),
   SIGKILL(9L),
   SIGABRT(6L),
   NSIG(33L),
   SIGCONT(19L),
   SIGHUP(1L),
   SIGSTOP(17L),
   SIGQUIT(3L),
   SIGIO(23L),
   SIGUSR1(30L),
   SIGSEGV(11L),
   SIGTTOU(22L),
   SIGUSR2(31L),
   SIGXFSZ(25L);

   public static final long MAX_VALUE = 33L;
   public static final long MIN_VALUE = 1L;
   private final long value;

   Signal(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return Signal.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
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
         map.put(Signal.SIGIO, "SIGIO");
         map.put(Signal.SIGSYS, "SIGSYS");
         map.put(Signal.NSIG, "NSIG");
         return map;
      }
   }
}
