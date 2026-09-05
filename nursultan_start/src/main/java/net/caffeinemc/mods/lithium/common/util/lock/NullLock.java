/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class NullLock
implements Lock {
    @Override
    public void lock() {
    }

    @Override
    public void unlock() {
    }

    @Override
    public Condition newCondition() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void lockInterruptibly() {
    }

    @Override
    public boolean tryLock(long l, TimeUnit timeUnit) {
        return true;
    }

    @Override
    public boolean tryLock() {
        return true;
    }
}

