/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFutureListener
 */
package Nursultan;

import Nursultan.class11951;
import Nursultan.class11959;
import Nursultan.class11973;
import Nursultan.class11985;
import Nursultan.class11989;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class class11950 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;

    private void L() {
        ((AtomicInteger)this.N_1).updateAndGet(n -> Math.max(0, n - 1));
    }

    public class11950(class11985 class119852) {
        this.u();
        this.N_0 = new class11973();
        this.N_1 = new AtomicInteger();
        this.N_2 = new AtomicBoolean(false);
        this.N_3 = class119852;
    }

    private void u() {
    }

    public int y() {
        return ((AtomicInteger)this.N_1).get();
    }

    private void y(class11959 class119592) {
        ((class11973)this.N_0).N(class119592, class119892 -> {
            this.L();
            try {
                ((class11985)((Object)((Object)this.N_3))).u().accept(class119892.N(), class119892.L());
            }
            catch (Exception exception) {
                ((class11985)((Object)((Object)this.N_3))).y().accept(exception);
            }
        });
    }

    private static class11959 N(Channel channel) {
        if (!channel.hasAttr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2)) {
            return null;
        }
        return (class11959)((Object)channel.attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).get());
    }

    public void N(class11959 class119592) {
        if (((AtomicBoolean)this.N_2).get()) {
            return;
        }
        this.y(class119592);
    }

    public void N() {
        ((AtomicBoolean)this.N_2).set(true);
        ((class11973)this.N_0).y();
        ((AtomicInteger)this.N_1).set(0);
    }

    public void N(class11951<?> class119512, class11959 class119592, ChannelFutureListener channelFutureListener) {
        if (((AtomicBoolean)this.N_2).get()) {
            return;
        }
        Channel channel = ((class11985)((Object)this.N_3)).i().get();
        if (channel == null || !channel.isActive()) {
            return;
        }
        if (class11950.N(channel) == class119592) {
            ((class11985)((Object)this.N_3)).u().accept(class119512, channelFutureListener);
            return;
        }
        class11989 class119892 = new class11989(class119512, class119592, channelFutureListener);
        if (((AtomicInteger)this.N_1).incrementAndGet() > ((class11985)((Object)this.N_3)).N()) {
            this.L();
            ((class11985)((Object)this.N_3)).L().accept(class119892);
            return;
        }
        ((class11973)this.N_0).N(class119892);
        if (((AtomicBoolean)this.N_2).get()) {
            ((class11973)this.N_0).y();
            ((AtomicInteger)this.N_1).set(0);
            return;
        }
        class11959 class119593 = class11950.N(channel);
        if (class119593 != null) {
            this.y(class119593);
        }
    }
}

