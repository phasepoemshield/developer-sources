/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.networking.v1;

import java.util.concurrent.Future;

@FunctionalInterface
public interface ServerLoginNetworking$LoginSynchronizer {
    public void waitFor(Future<?> var1);
}

