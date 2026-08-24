package org.freedesktop.dbus.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// $VF: Compiled from NameableThreadFactory.java
public class NameableThreadFactory implements ThreadFactory {
   private final boolean daemonizeThreads;
   private final ThreadGroup group;
   private final AtomicInteger threadNumber = new AtomicInteger(1);
   private final String namePrefix;
   private final int threadPriority;
   private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);

   @Override
   public Thread newThread(Runnable _runnable) {
      Thread t = new Thread(this.group, _runnable, this.namePrefix + this.threadNumber.getAndIncrement(), 0L);
      t.setDaemon(this.daemonizeThreads);
      t.setPriority(this.threadPriority);
      return t;
   }

   public NameableThreadFactory(String _daemonizeThreads, boolean _name, int _threadPriority) {
      this.group = Thread.currentThread().getThreadGroup();
      this.namePrefix = Util.isBlank(_name) ? "UnnamedThreadPool-" + POOL_NUMBER.getAndIncrement() + "-thread-" : _name;
      this.daemonizeThreads = _daemonizeThreads;
      this.threadPriority = _threadPriority;
   }

   public NameableThreadFactory(String _name, boolean _daemonizeThreads) {
      this(_name, _daemonizeThreads, 5);
   }
}
