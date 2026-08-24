/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections.base;

import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
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

public class ReceivingService {
    private final Map<ExecutorNames, ExecutorService> executors;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    static final int MAX_RETRIES = 50;
    private boolean closed = false;
    private final IThreadPoolRetryHandler retryHandler;

    /*
     * WARNING - void declaration
     */
    ReceivingService(String _namePrefix, ReceivingServiceConfig _rsCfg) {
        void var4_4;
        this.executors = new ConcurrentHashMap<ExecutorNames, ExecutorService>();
        String prefix = _namePrefix == null ? "" : _namePrefix;
        ReceivingServiceConfig rsCfg = Optional.ofNullable(_rsCfg).orElse(ReceivingServiceConfigBuilder.getDefaultConfig());
        this.executors.put(ExecutorNames.SIGNAL, Executors.newFixedThreadPool(rsCfg.getSignalThreadPoolSize(), new NameableThreadFactory(prefix + "DBus-Signal-Receiver-", true, rsCfg.getSignalThreadPriority())));
        this.executors.put(ExecutorNames.ERROR, Executors.newFixedThreadPool(rsCfg.getErrorThreadPoolSize(), new NameableThreadFactory(prefix + "DBus-Error-Receiver-", true, rsCfg.getErrorThreadPriority())));
        this.executors.put(ExecutorNames.METHODCALL, Executors.newFixedThreadPool(rsCfg.getMethodCallThreadPoolSize(), new NameableThreadFactory(prefix + "DBus-MethodCall-Receiver-", true, rsCfg.getMethodCallThreadPriority())));
        this.executors.put(ExecutorNames.METHODRETURN, Executors.newFixedThreadPool(rsCfg.getMethodReturnThreadPoolSize(), new NameableThreadFactory(prefix + "DBus-MethodReturn-Receiver-", true, rsCfg.getMethodReturnThreadPriority())));
        this.retryHandler = var4_4.getRetryHandler();
    }

    public synchronized void shutdownNow() {
        for (Map.Entry<ExecutorNames, ExecutorService> es : this.executors.entrySet()) {
            if (es.getValue().isTerminated()) continue;
            this.logger.debug("Forcefully stopping {}", (Object)es.getKey());
            es.getValue().shutdownNow();
        }
        this.closed = true;
    }

    public synchronized void shutdown(int _timeout, TimeUnit _unit) {
        Map.Entry<ExecutorNames, ExecutorService> es;
        Iterator<Map.Entry<ExecutorNames, ExecutorService>> iterator2 = this.executors.entrySet().iterator();
        while (iterator2.hasNext()) {
            es = iterator2.next();
            this.logger.debug("Shutting down executor: {}", (Object)es.getKey());
            es.getValue().shutdown();
        }
        iterator2 = this.executors.entrySet().iterator();
        while (iterator2.hasNext()) {
            es = iterator2.next();
            try {
                es.getValue().awaitTermination(_timeout, _unit);
            }
            catch (InterruptedException _ex) {
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

    /*
     * WARNING - void declaration
     */
    int execOrFail(ExecutorNames _executor, Runnable _r) {
        void var3_3;
        int failCount;
        block11: {
            block10: {
                if (_r == null) break block10;
                if (_executor != null) break block11;
            }
            return -1;
        }
        for (failCount = 0; failCount < 50; ++failCount) {
            try {
                ExecutorService exec = this.getExecutor(_executor);
                if (exec == null) {
                    throw new IllegalThreadPoolStateException("No executor found for " + String.valueOf((Object)_executor));
                }
                if (this.closed || exec.isShutdown() || exec.isTerminated()) {
                    throw new IllegalThreadPoolStateException("Receiving service already closed");
                }
                exec.execute(_r);
                break;
            }
            catch (IllegalThreadPoolStateException _ex) {
                throw _ex;
            }
            catch (Exception _ex) {
                if (this.retryHandler != null) continue;
                this.logger.error("Could not handle runnable for executor {}, runnable will be dropped", (Object)_executor, (Object)_ex);
                break;
            }
        }
        if (failCount >= 50) {
            void var1_1;
            this.logger.error("Could not handle runnable for executor {} after {} retries, runnable will be dropped", (Object)var1_1, (Object)((int)var3_3));
        }
        return (int)var3_3;
    }

    int execSignalHandler(Runnable _r) {
        return this.execOrFail(ExecutorNames.SIGNAL, _r);
    }

    ExecutorService getExecutor(ExecutorNames _executor) {
        return this.executors.get((Object)_executor);
    }

    int execErrorHandler(Runnable _r) {
        return this.execOrFail(ExecutorNames.ERROR, _r);
    }
}

