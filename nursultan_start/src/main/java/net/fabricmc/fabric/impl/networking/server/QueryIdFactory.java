/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.networking.server;

import net.fabricmc.fabric.impl.networking.server.QueryIdFactory$1;

interface QueryIdFactory {
    public static QueryIdFactory create() {
        return new QueryIdFactory$1();
    }

    public int nextId();
}

