/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00423
 *  minecraft.class00648
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
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import minecraft.class00423;
import minecraft.class00648;
import minecraft.class01894;
import net.fabricmc.fabric.impl.networking.AbstractNetworkAddon;
import net.fabricmc.fabric.impl.networking.NetworkingImpl;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class GlobalReceiverRegistry<H> {
    public static final int DEFAULT_CHANNEL_NAME_MAX_LENGTH = 128;
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalReceiverRegistry.class);
    private final class00423 side;
    private final class00648 phase;
    private final @Nullable PayloadTypeRegistryImpl<?> payloadTypeRegistry;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Map<class01894, H> handlers = new HashMap<class01894, H>();
    private final Set<AbstractNetworkAddon<H>> trackedAddons = new HashSet<AbstractNetworkAddon<H>>();

    public GlobalReceiverRegistry(class00423 class004232, class00648 class006482, @Nullable PayloadTypeRegistryImpl<?> payloadTypeRegistryImpl) {
        this.side = class004232;
        this.phase = class006482;
        this.payloadTypeRegistry = payloadTypeRegistryImpl;
        if (payloadTypeRegistryImpl != null) {
            if (class006482 != payloadTypeRegistryImpl.getPhase()) {
                throw new IllegalStateException();
            }
            if (class004232 != payloadTypeRegistryImpl.getSide()) {
                throw new IllegalStateException();
            }
        }
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

    public Map<class01894, H> getHandlers() {
        Lock lock = this.lock.readLock();
        lock.lock();
        try {
            HashMap<class01894, H> hashMap = new HashMap<class01894, H>(this.handlers);
            return hashMap;
        }
        finally {
            lock.unlock();
        }
    }

    public void endSession(AbstractNetworkAddon<H> abstractNetworkAddon) {
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            this.logTrackedAddonSize();
            this.trackedAddons.remove(abstractNetworkAddon);
        }
        finally {
            lock.unlock();
        }
    }

    public Set<class01894> getChannels() {
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public @Nullable H unregisterGlobalReceiver(class01894 class018942) {
        Objects.requireNonNull(class018942, "Channel name cannot be null");
        if (NetworkingImpl.isReservedCommonChannel(class018942)) {
            throw new IllegalArgumentException(String.format("Cannot unregister packet handler for reserved channel with name \"%s\"", class018942));
        }
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void handleUnregistration(class01894 class018942) {
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            this.logTrackedAddonSize();
            for (AbstractNetworkAddon<H> abstractNetworkAddon : this.trackedAddons) {
                abstractNetworkAddon.unregisterChannel(class018942);
            }
        }
        finally {
            lock.unlock();
        }
    }

    private void logTrackedAddonSize() {
        if (LOGGER.isTraceEnabled() && this.trackedAddons.size() > 1) {
            LOGGER.trace("{} receiver registry tracks {} addon instances", (Object)this.phase.N(), (Object)this.trackedAddons.size());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean registerGlobalReceiver(class01894 class018942, H h) {
        Objects.requireNonNull(class018942, "Channel name cannot be null");
        Objects.requireNonNull(h, "Channel handler cannot be null");
        if (NetworkingImpl.isReservedCommonChannel(class018942)) {
            throw new IllegalArgumentException(String.format("Cannot register handler for reserved channel with name \"%s\"", class018942));
        }
        this.assertPayloadType(class018942);
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            boolean bl;
            boolean bl2 = bl = this.handlers.putIfAbsent(class018942, h) == null;
            if (bl) {
                this.handleRegistration(class018942, h);
            }
            boolean bl3 = bl;
            return bl3;
        }
        finally {
            lock.unlock();
        }
    }

    public class00648 getPhase() {
        return this.phase;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void handleRegistration(class01894 class018942, H h) {
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            this.logTrackedAddonSize();
            for (AbstractNetworkAddon<H> abstractNetworkAddon : this.trackedAddons) {
                abstractNetworkAddon.registerChannel(class018942, h);
            }
        }
        finally {
            lock.unlock();
        }
    }

    public void startSession(AbstractNetworkAddon<H> abstractNetworkAddon) {
        Lock lock = this.lock.writeLock();
        lock.lock();
        try {
            if (this.trackedAddons.add(abstractNetworkAddon)) {
                abstractNetworkAddon.registerChannels(this.handlers);
            }
            this.logTrackedAddonSize();
        }
        finally {
            lock.unlock();
        }
    }

    public void assertPayloadType(class01894 class018942) {
        if (this.payloadTypeRegistry == null) {
            return;
        }
        if (this.payloadTypeRegistry.get(class018942) == null) {
            throw new IllegalArgumentException(String.format("Cannot register handler as no payload type has been registered with name \"%s\" for %s %s", class018942, this.side, this.phase));
        }
        if (class018942.toString().length() > 128) {
            throw new IllegalArgumentException(String.format("Cannot register handler for channel with name \"%s\" as it exceeds the maximum length of 128 characters", class018942));
        }
    }
}

