/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.networking;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import minecraft.class01894;
import net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractNetworkAddon<H> {
    protected final GlobalReceiverRegistry<H> receiver;
    protected final Logger logger;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Map<class01894, H> handlers = new HashMap<class01894, H>();
    private final AtomicBoolean disconnected = new AtomicBoolean();

    public AbstractNetworkAddon(GlobalReceiverRegistry<H> globalReceiverRegistry, String string) {
        this.receiver = globalReceiverRegistry;
        this.logger = LoggerFactory.getLogger((String)string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public @Nullable H getHandler(class01894 class018942) {
        Lock lock = this.lock.readLock();
        lock.lock();
        try {
            H h = this.handlers.get(class018942);
            return h;
        }
        finally {
            lock.unlock();
        }
    }

    public final void lateInit() {
        this.receiver.startSession(this);
        this.invokeInitEvent();
    }

    public final void endSession() {
        this.receiver.endSession(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean registerChannel(class01894 class018942, H h) {
        Objects.requireNonNull(class018942, "Channel name cannot be null");
        Objects.requireNonNull(h, "Packet handler cannot be null");
        this.assertNotReserved(class018942);
        this.receiver.assertPayloadType(class018942);
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            boolean bl;
            boolean bl2 = bl = this.handlers.putIfAbsent(class018942, h) == null;
            if (bl) {
                this.handleRegistration(class018942);
            }
            boolean bl3 = bl;
            return bl3;
        }
        finally {
            lock.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public H unregisterChannel(class01894 class018942) {
        Objects.requireNonNull(class018942, "Channel name cannot be null");
        this.assertNotReserved(class018942);
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            H h = this.handlers.remove(class018942);
            if (h != null) {
                this.handleUnregistration(class018942);
            }
            H h2 = h;
            return h2;
        }
        finally {
            lock.unlock();
        }
    }

    protected abstract void invokeDisconnectEvent();

    public final void handleDisconnect() {
        if (this.disconnected.compareAndSet(false, true)) {
            this.invokeDisconnectEvent();
            this.endSession();
        }
    }

    protected abstract boolean isReservedChannel(class01894 var1);

    protected abstract void invokeInitEvent();

    private void assertNotReserved(class01894 class018942) {
        if (this.isReservedChannel(class018942)) {
            throw new IllegalArgumentException(String.format("Cannot (un)register handler for reserved channel with name \"%s\"", class018942));
        }
    }

    public Set<class01894> getReceivableChannels() {
        Lock lock = this.lock.readLock();
        lock.lock();
        try {
            HashSet<class01894> hashSet = new HashSet<class01894>(this.handlers.keySet());
            return hashSet;
        }
        finally {
            lock.unlock();
        }
    }

    protected abstract void handleUnregistration(class01894 var1);

    protected abstract void handleRegistration(class01894 var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void registerChannels(Map<class01894, H> map) {
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            for (Map.Entry<class01894, H> entry : map.entrySet()) {
                this.assertNotReserved(entry.getKey());
                boolean bl = this.handlers.putIfAbsent(entry.getKey(), entry.getValue()) == null;
                if (!bl) continue;
                this.handleRegistration(entry.getKey());
            }
        }
        finally {
            lock.unlock();
        }
    }
}

