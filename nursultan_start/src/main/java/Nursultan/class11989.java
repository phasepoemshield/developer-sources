/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11951;
import Nursultan.class11959;
import io.netty.channel.ChannelFutureListener;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11989
extends Record {
    public ChannelFutureListener listener;
    public class11951<?> packet;
    public class11959 requiredState;

    public ChannelFutureListener L() {
        return this.listener;
    }

    public class11989(class11951<?> class119512, class11959 class119592, ChannelFutureListener channelFutureListener) {
        this.packet = class119512;
        this.requiredState = class119592;
        this.listener = channelFutureListener;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11989.class, "packet;requiredState;listener", "packet", "requiredState", "listener"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11989.class, "packet;requiredState;listener", "packet", "requiredState", "listener"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11989.class, "packet;requiredState;listener", "packet", "requiredState", "listener"}, this);
    }

    public class11959 y() {
        return this.requiredState;
    }

    public class11951<?> N() {
        return this.packet;
    }
}

