/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import net.caffeinemc.mods.lithium.common.util.lock.NullLock;

public class NullReadWriteLock
implements ReadWriteLock {
    private final NullLock lock = new NullLock();

    @Override
    public Lock readLock() {
        return this.lock;
    }

    @Override
    public Lock writeLock() {
        return this.lock;
    }
}

