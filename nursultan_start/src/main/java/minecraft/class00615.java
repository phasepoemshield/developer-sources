/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.IoHandlerFactory
 *  io.netty.channel.nio.NioIoHandler
 */
package minecraft;

import io.netty.channel.IoHandlerFactory;
import io.netty.channel.nio.NioIoHandler;
import minecraft.class00606;

class class00615
extends class00606 {
    class00615(String string, Class clazz, Class clazz2) {
        super(string, clazz, clazz2);
    }

    @Override
    protected IoHandlerFactory y() {
        return NioIoHandler.newFactory();
    }
}

