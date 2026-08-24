package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Signal.java
public enum Signal implements Constant {
   SIGSYS(31L),
   SIGURG(23L),
   SIGCONT(18L),
   SIGSTOP(19L),
   SIGTSTP(20L),
   SIGIO(29L),
   SIGSTKFLT(16L),
   SIGTTOU(22L),
   SIGVTALRM(26L),
   SIGQUIT(3L),
   SIGALRM(14L),
   SIGPOLL(29L),
   SIGPWR(30L),
   SIGUSR2(12L),
   SIGHUP(1L),
   SIGABRT(6L),
   SIGTRAP(5L),
   SIGSEGV(11L),
   SIGBUS(7L),
   SIGILL(4L),
   SIGWINCH(28L),
   SIGIOT(6L),
   SIGPROF(27L),
   SIGXFSZ(25L),
   SIGKILL(9L),
   SIGCHLD(17L),
   SIGTTIN(21L),
   SIGCLD(17L),
   SIGRTMIN(34L),
   SIGUSR1(10L),
   SIGTERM(15L),
   SIGINT(2L),
   SIGPIPE(13L),
   NSIG(65L),
   SIGFPE(8L),
   SIGRTMAX(64L),
   SIGXCPU(24L);

   public static final long MAX_VALUE = 65L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return Signal.StringTable.descriptions.get(this);
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
         map.put(Signal.SIGSTKFLT, "SIGSTKFLT");
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
