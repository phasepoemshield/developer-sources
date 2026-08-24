package org.freedesktop.dbus.connections.config;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import org.freedesktop.dbus.connections.base.ReceivingService;
import org.freedesktop.dbus.connections.impl.BaseConnectionBuilder;
import org.freedesktop.dbus.connections.shared.ExecutorNames;
import org.freedesktop.dbus.connections.shared.IThreadPoolRetryHandler;
import org.freedesktop.dbus.utils.Util;
import org.slf4j.LoggerFactory;

// $VF: Compiled from ReceivingServiceConfigBuilder.java
public final class ReceivingServiceConfigBuilder<R extends BaseConnectionBuilder<?, ?>> {
   public static final int DEFAULT_HANDLER_RETRIES = 10;
   private final Supplier<R> connectionBuilder;
   private final ReceivingServiceConfig config = new ReceivingServiceConfig();
   private static final ReceivingServiceConfig DEFAULT_CFG = new ReceivingServiceConfig();
   private static final IThreadPoolRetryHandler DEFAULT_RETRYHANDLER = new IThreadPoolRetryHandler()   // $VF: Compiled from ReceivingServiceConfigBuilder.java
 {
      private AtomicInteger retries = new AtomicInteger(0);

      @Override
      public boolean handle(ExecutorNames _ex, Exception _executor) {
         if (this.retries.incrementAndGet() < 10) {
            return true;
         }

         LoggerFactory.getLogger(ReceivingService.class)
            .error("Dropping runnable for {}, retry failed for more than {} iterations, cause:", _executor, 10, _ex);
         return false;
      }
   };

   public ReceivingServiceConfigBuilder(Supplier<R> _bldr) {
      this.connectionBuilder = _bldr;
      this.config.setRetryHandler(DEFAULT_RETRYHANDLER);
   }

   public ReceivingServiceConfigBuilder<R> withErrorHandlerThreadCount(int _threads) {
      this.config.setErrorThreadPoolSize(Math.max(1, _threads));
      return this;
   }

   public ReceivingServiceConfigBuilder<R> withRetryHandler(IThreadPoolRetryHandler _handler) {
      this.config.setRetryHandler(_handler);
      return this;
   }

   public ReceivingServiceConfig build() {
      return this.config;
   }

   public ReceivingServiceConfigBuilder<R> withMethodReturnThreadPriority(int _priority) {
      this.config.setMethodReturnThreadPriority(Util.checkIntInRange(_priority, 1, 10));
      return this;
   }

   public static IThreadPoolRetryHandler getDefaultRetryHandler() {
      return DEFAULT_RETRYHANDLER;
   }

   public ReceivingServiceConfigBuilder<R> withMethodReturnThreadCount(int _threads) {
      this.config.setMethodReturnThreadPoolSize(Math.max(1, _threads));
      return this;
   }

   public ReceivingServiceConfigBuilder<R> withSignalThreadCount(int _threads) {
      this.config.setSignalThreadPoolSize(Math.max(1, _threads));
      return this;
   }

   public ReceivingServiceConfigBuilder<R> withMethedCallThreadPriority(int _priority) {
      this.config.setMethodCallThreadPriority(Util.checkIntInRange(_priority, 1, 10));
      return this;
   }

   public ReceivingServiceConfigBuilder<R> withErrorThreadPriority(int _priority) {
      this.config.setErrorThreadPriority(Util.checkIntInRange(_priority, 1, 10));
      return this;
   }

   public static ReceivingServiceConfig getDefaultConfig() {
      return DEFAULT_CFG;
   }

   public ReceivingServiceConfigBuilder<R> withSignalThreadPriority(int _priority) {
      this.config.setSignalThreadPriority(Util.checkIntInRange(_priority, 1, 10));
      return this;
   }

   public ReceivingServiceConfigBuilder<R> withMethodCallThreadCount(int _threads) {
      this.config.setMethodCallThreadPoolSize(Math.max(1, _threads));
      return this;
   }

   public R connectionConfig() {
      return this.connectionBuilder.get();
   }
}
