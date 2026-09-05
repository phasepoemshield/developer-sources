/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFutureListener
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11951;
import Nursultan.class11989;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11985
extends Record {
    public Supplier<Channel> channelSupplier;
    public BiConsumer<class11951<?>, ChannelFutureListener> writer;
    public Consumer<class11989> onOverflow;
    public int maxPending;
    public Consumer<Throwable> onError;

    public Consumer<class11989> L() {
        return this.onOverflow;
    }

    public class11985(Supplier<Channel> supplier, BiConsumer<class11951<?>, ChannelFutureListener> biConsumer, int n, Consumer<class11989> consumer, Consumer<Throwable> consumer2) {
        if (supplier == null || biConsumer == null || consumer == null || consumer2 == null) {
            throw new IllegalArgumentException("StatefulPacketGatewayConfig: all callbacks must be non-null");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("StatefulPacketGatewayConfig: maxPending must be positive");
        }
        this.channelSupplier = supplier;
        this.writer = biConsumer;
        this.maxPending = n;
        this.onOverflow = consumer;
        this.onError = consumer2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11985.class, "channelSupplier;writer;maxPending;onOverflow;onError", "channelSupplier", "writer", "maxPending", "onOverflow", "onError"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11985.class, "channelSupplier;writer;maxPending;onOverflow;onError", "channelSupplier", "writer", "maxPending", "onOverflow", "onError"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11985.class, "channelSupplier;writer;maxPending;onOverflow;onError", "channelSupplier", "writer", "maxPending", "onOverflow", "onError"}, this);
    }

    public Supplier<Channel> i() {
        return this.channelSupplier;
    }

    public BiConsumer<class11951<?>, ChannelFutureListener> u() {
        return this.writer;
    }

    public Consumer<Throwable> y() {
        return this.onError;
    }

    public int N() {
        return this.maxPending;
    }
}

