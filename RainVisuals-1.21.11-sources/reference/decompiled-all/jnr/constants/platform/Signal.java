package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from Signal.java
public enum Signal implements Constant {
   SIGVTALRM,
   SIGPOLL,
   SIGBUS,
   SIGTRAP,
   SIGABRT,
   SIGRTMAX,
   SIGALRM,
   NSIG,
   SIGPWR,
   SIGTTOU,
   SIGILL,
   SIGURG,
   SIGCLD,
   SIGPROF,
   SIGXCPU,
   SIGWINCH,
   SIGIO,
   SIGTSTP,
   SIGTERM,
   SIGPIPE,
   SIGSEGV,
   __UNKNOWN_CONSTANT__,
   SIGXFSZ,
   SIGSTKFLT,
   SIGIOT,
   SIGUSR2,
   SIGTTIN,
   SIGSTOP,
   SIGCHLD,
   SIGINT,
   SIGUNUSED,
   SIGUSR1,
   SIGKILL,
   SIGFPE,
   SIGSYS,
   SIGRTMIN,
   SIGQUIT,
   SIGHUP,
   SIGCONT;

   private static final ConstantResolver<Signal> resolver = ConstantResolver.getResolver(Signal.class, 20000, 29999);

   public static Signal valueOf(long value) {
      return resolver.valueOf(value);
   }

   @Override
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
