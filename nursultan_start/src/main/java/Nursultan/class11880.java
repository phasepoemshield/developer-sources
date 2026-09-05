/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 */
package Nursultan;

import io.netty.channel.Channel;

public class class11880 {
    public Object N_0;

    public boolean L() {
        return (Channel)this.N_0 != null && ((Channel)this.N_0).isActive();
    }

    public class11880() {
        this.i();
    }

    private void i() {
    }

    public synchronized void y() {
        this.N_0 = null;
    }

    public synchronized void N(Channel channel) {
        this.N_0 = channel;
    }

    public Channel N() {
        return (Channel)this.N_0;
    }
}

