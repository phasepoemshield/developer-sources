/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class UpdateCheckerThreadFactory
implements ThreadFactory {
    static final AtomicInteger COUNT = new AtomicInteger(-1);

    @Override
    public Thread newThread(Runnable runnable) {
        return Thread.ofVirtual().name("ModMenu/Update Checker/%s".formatted(new Object[]{COUNT.incrementAndGet()})).unstarted(runnable);
    }
}

