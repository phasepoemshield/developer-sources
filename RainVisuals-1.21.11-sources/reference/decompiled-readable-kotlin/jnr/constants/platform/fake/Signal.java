package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from Signal.java
public enum Signal implements Constant {
   SIGTSTP(22L),
   SIGXFSZ(27L),
   SIGRTMIN(36L),
   SIGRTMAX(37L),
   SIGSEGV(12L),
   SIGUSR2(13L),
   SIGSTOP(21L),
   SIGSYS(34L),
   SIGFPE(9L),
   SIGUSR1(11L),
   SIGPIPE(14L),
   SIGCHLD(19L),
   SIGCLD(18L),
   SIGTRAP(5L),
   SIGIO(32L),
   SIGTERM(16L),
   SIGWINCH(30L),
   SIGILL(4L),
   SIGUNUSED(35L),
   SIGCONT(20L),
   SIGTTOU(24L),
   SIGQUIT(3L),
   SIGSTKFLT(17L),
   SIGALRM(15L),
   SIGVTALRM(28L),
   SIGPWR(33L),
   SIGPOLL(31L),
   SIGINT(2L),
   SIGKILL(10L),
   SIGIOT(7L),
   SIGXCPU(26L),
   SIGABRT(6L),
   SIGTTIN(23L),
   NSIG(38L),
   SIGPROF(29L),
   SIGBUS(8L),
   SIGURG(25L),
   SIGHUP(1L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 38L;

   @Override
   public final boolean defined() {
      return true;
   }

   Signal(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }
}
