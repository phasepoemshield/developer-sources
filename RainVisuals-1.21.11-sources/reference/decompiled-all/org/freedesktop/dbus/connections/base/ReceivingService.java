package org.freedesktop.dbus.connections.base;

import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfigBuilder;
import org.freedesktop.dbus.connections.shared.ExecutorNames;
import org.freedesktop.dbus.connections.shared.IThreadPoolRetryHandler;
import org.freedesktop.dbus.exceptions.IllegalThreadPoolStateException;
import org.freedesktop.dbus.utils.NameableThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from ReceivingService.java
public class ReceivingService {
   private final Map<ExecutorNames, ExecutorService> executors;
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   static final int MAX_RETRIES = 50;
   private boolean closed = false;
   private final IThreadPoolRetryHandler retryHandler;

   ReceivingService(String _rsCfg, ReceivingServiceConfig _namePrefix) {
      this.executors = new ConcurrentHashMap<>();
      String prefix = _namePrefix == null ? "" : _namePrefix;
      ReceivingServiceConfig rsCfg = Optional.ofNullable(_rsCfg).orElse(ReceivingServiceConfigBuilder.getDefaultConfig());
      this.executors
         .put(
            ExecutorNames.SIGNAL,
            Executors.newFixedThreadPool(
               rsCfg.getSignalThreadPoolSize(), new NameableThreadFactory(prefix + "DBus-Signal-Receiver-", true, rsCfg.getSignalThreadPriority())
            )
         );
      this.executors
         .put(
            ExecutorNames.ERROR,
            Executors.newFixedThreadPool(
               rsCfg.getErrorThreadPoolSize(), new NameableThreadFactory(prefix + "DBus-Error-Receiver-", true, rsCfg.getErrorThreadPriority())
            )
         );
      this.executors
         .put(
            ExecutorNames.METHODCALL,
            Executors.newFixedThreadPool(
               rsCfg.getMethodCallThreadPoolSize(), new NameableThreadFactory(prefix + "DBus-MethodCall-Receiver-", true, rsCfg.getMethodCallThreadPriority())
            )
         );
      this.executors
         .put(
            ExecutorNames.METHODRETURN,
            Executors.newFixedThreadPool(
               rsCfg.getMethodReturnThreadPoolSize(),
               new NameableThreadFactory(prefix + "DBus-MethodReturn-Receiver-", true, rsCfg.getMethodReturnThreadPriority())
            )
         );
      this.retryHandler = rsCfg.getRetryHandler();
   }

   public synchronized void shutdownNow() {
      for (Entry<ExecutorNames, ExecutorService> es : this.executors.entrySet()) {
         if (!es.getValue().isTerminated()) {
            this.logger.debug("Forcefully stopping {}", es.getKey());
            es.getValue().shutdownNow();
         }
      }

      this.closed = true;
   }

   public synchronized void shutdown(int _timeout, TimeUnit _unit) {
      for (Entry<ExecutorNames, ExecutorService> es : this.executors.entrySet()) {
         this.logger.debug("Shutting down executor: {}", es.getKey());
         ((ExecutorService)es.getValue()).shutdown();
      }

      for (Entry<ExecutorNames, ExecutorService> var8 : this.executors.entrySet()) {
         try {
            ((ExecutorService)var8.getValue()).awaitTermination(_timeout, _unit);
         } catch (InterruptedException var6) {
            this.logger.debug("Interrupted while waiting for termination of executor");
            Thread.currentThread().interrupt();
         }
      }

      this.closed = true;
   }

   int execMethodReturnHandler(Runnable _r) {
      return this.execOrFail(ExecutorNames.METHODRETURN, _r);
   }

   int execMethodCallHandler(Runnable _r) {
      return this.execOrFail(ExecutorNames.METHODCALL, _r);
   }

   int execOrFail(ExecutorNames _r, Runnable _executor) {
      if (_r != null && _executor != null) {
         int failCount = 0;

         while (failCount < 50) {
            try {
               ExecutorService _ex = this.getExecutor(_executor);
               if (_ex == null) {
                  throw new IllegalThreadPoolStateException("No executor found for " + _executor);
               }

               if (!this.closed && !_ex.isShutdown() && !_ex.isTerminated()) {
                  _ex.execute(_r);
                  break;
               }

               throw new IllegalThreadPoolStateException("Receiving service already closed");
            } catch (IllegalThreadPoolStateException _ex) {
               throw _ex;
            } catch (Exception var6) {
               if (this.retryHandler == null) {
                  this.logger.error("Could not handle runnable for executor {}, runnable will be dropped", _executor, var6);
                  break;
               } else {
                  failCount++;
                  if (!this.retryHandler.handle(_executor, var6)) {
                     this.logger
                        .trace(
                           "Ignoring unhandled runnable for executor {} due to {}, dropped by retry handler after {} retries",
                           _executor,
                           var6.getClass().getName(),
                           failCount
                        );
                     break;
                  }
               }
            }
         }

         if (failCount >= 50) {
            this.logger.error("Could not handle runnable for executor {} after {} retries, runnable will be dropped", _executor, failCount);
         }

         return failCount;
      } else {
         return -1;
      }
   }

   int execSignalHandler(Runnable _r) {
      return this.execOrFail(ExecutorNames.SIGNAL, _r);
   }

   ExecutorService getExecutor(ExecutorNames _executor) {
      return this.executors.get(_executor);
   }

   int execErrorHandler(Runnable _r) {
      return this.execOrFail(ExecutorNames.ERROR, _r);
   }
}
