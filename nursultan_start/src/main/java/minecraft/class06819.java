/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.IoHandlerFactory
 *  io.netty.channel.local.LocalIoHandler
 *  minecraft.class00606
 */
package minecraft;

import io.netty.channel.IoHandlerFactory;
import io.netty.channel.local.LocalIoHandler;
import minecraft.class00606;

class class06819
extends class00606 {
    class06819(String string, Class clazz, Class clazz2) {
        super(string, clazz, clazz2);
    }

    protected IoHandlerFactory y() {
        return LocalIoHandler.newFactory();
    }
}

