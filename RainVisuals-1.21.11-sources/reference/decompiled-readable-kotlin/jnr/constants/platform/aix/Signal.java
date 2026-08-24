package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from Signal.java
public enum Signal implements Constant {
   SIGRTMAX(57L),
   SIGHUP(1L),
   SIGQUIT(3L),
   SIGURG(16L),
   SIGSYS(12L),
   SIGFPE(8L),
   SIGTTIN(21L),
   SIGTTOU(22L),
   SIGTERM(15L),
   SIGALRM(14L),
   SIGUSR2(31L),
   SIGCLD(20L),
   SIGCONT(19L),
   SIGIOT(6L),
   SIGTSTP(18L),
   SIGKILL(9L),
   SIGSTOP(17L),
   SIGBUS(10L),
   SIGPWR(29L),
   SIGILL(4L),
   SIGABRT(6L),
   SIGVTALRM(34L),
   SIGTRAP(5L),
   SIGSEGV(11L),
   SIGPOLL(23L),
   SIGWINCH(28L),
   SIGXFSZ(25L),
   SIGPIPE(13L),
   SIGCHLD(20L),
   SIGIO(23L),
   SIGXCPU(24L),
   SIGRTMIN(50L),
   SIGINT(2L),
   SIGPROF(32L),
   NSIG(256L),
   SIGUSR1(30L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 256L;

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

   Signal(long value) {
      this.value = value;
   }
}
