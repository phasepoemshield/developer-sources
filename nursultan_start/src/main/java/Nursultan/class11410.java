/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09285
 *  Nursultan.class09297
 *  Nursultan.class10639
 *  Nursultan.class11405
 *  Nursultan.class11938
 *  Nursultan.class11950
 *  Nursultan.class11951
 *  Nursultan.class11954
 *  Nursultan.class11959
 *  Nursultan.class11985
 *  Nursultan.class11989
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler$ClientHandshakeStateEvent
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09285;
import Nursultan.class09297;
import Nursultan.class10639;
import Nursultan.class11405;
import Nursultan.class11454;
import Nursultan.class11472;
import Nursultan.class11938;
import Nursultan.class11950;
import Nursultan.class11951;
import Nursultan.class11954;
import Nursultan.class11959;
import Nursultan.class11985;
import Nursultan.class11989;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11410
extends SimpleChannelInboundHandler<class11951<class09297>> {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;

    public boolean L(Channel channel) {
        return channel != null && channel.isActive();
    }

    private void L(class11951<?> class119512, ChannelFutureListener channelFutureListener) {
        Channel channel = (Channel)this.y_2;
        if (!this.L(channel)) {
            return;
        }
        if (channel.eventLoop().inEventLoop()) {
            this.y(class119512, channelFutureListener);
            return;
        }
        channel.eventLoop().execute(() -> this.y(class119512, channelFutureListener));
    }

    public void L() {
        Channel channel = (Channel)this.y_2;
        if (channel != null) {
            channel.config().setAutoRead(false);
        }
    }

    public class11410(class11405 class114052) {
        this.U();
        this.y_0 = new AtomicBoolean(false);
        this.y_5 = new class11950(new class11985(() -> (Channel)this.y_2, this::L, 32, this::N, throwable -> ((Logger)N_0).error("Error while draining pending packet", throwable)));
        this.y_1 = class114052;
    }

    static {
        class11410.Z();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void Z() {
        N_0 = null;
        N_1 = 32;
    }

    private void m() {
        if ((ScheduledFuture)this.y_4 != null && !((ScheduledFuture)this.y_4).isCancelled()) {
            ((ScheduledFuture)this.y_4).cancel(false);
            this.y_4 = null;
        }
    }

    private void U() {
    }

    public void u() {
        Channel channel = (Channel)this.y_2;
        if (!this.L(channel)) {
            return;
        }
        this.L();
        channel.close();
    }

    private void y(class11951<?> class119512, ChannelFutureListener channelFutureListener) {
        Channel channel = (Channel)this.y_2;
        if (!this.L(channel)) {
            return;
        }
        if (channelFutureListener != null) {
            channel.writeAndFlush(class119512).addListener((GenericFutureListener)channelFutureListener);
            return;
        }
        channel.writeAndFlush(class119512);
    }

    public boolean y() {
        Channel channel = (Channel)this.y_2;
        return channel != null && channel.hasAttr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2) && channel.attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).get() == class11959.PLAY;
    }

    public void y(Channel channel) {
        this.y_2 = channel;
        this.y_3 = new class11454((class11405)this.y_1, this);
    }

    private void E() {
        class09297 class092972 = (class09297)this.y_3;
        if (class092972 instanceof class09285) {
            ((class09285)class092972).y();
        }
    }

    public void channelRead0(ChannelHandlerContext channelHandlerContext, class11951<class09297> class119512) {
        class09297 class092972 = (class09297)this.y_3;
        if (!this.L(channelHandlerContext.channel()) || class092972 == null || !class092972.N()) {
            return;
        }
        try {
            class119512.N(class092972);
        }
        catch (Exception exception) {
            ((Logger)N_0).error("Error while receiving packet: {}", class119512, (Object)exception);
        }
    }

    public void N(class11951<?> class119512) {
        this.N(class119512, null);
    }

    public void N(class11959 class119592) {
        Channel channel = (Channel)this.y_2;
        if (channel != null) {
            channel.attr(class11959.staticFields_0045a7f96127f3825b996192bc44fb844_2).set((Object)class119592);
            channel.config().setAutoRead(true);
            ((class11950)this.y_5).N(class119592);
        }
    }

    public <T extends class09297> void N(T t) {
        this.y_3 = t;
    }

    public void N(Channel channel) {
        if (!((AtomicBoolean)this.y_0).compareAndSet(false, true)) {
            return;
        }
        this.y_2 = channel;
        channel.eventLoop().execute(() -> {
            if (!this.L(channel)) {
                return;
            }
            this.N(class11959.AUTH);
            this.y_4 = channel.eventLoop().scheduleWithFixedDelay(this::E, 0L, 1L, TimeUnit.SECONDS);
            class11954 class119542 = new class11954(16, 2, class11938.P().N().N(), ((class11472)class11938.L_2).Z(), ((class11472)class11938.L_2).M(), ((class11472)class11938.L_2).i().y(), ((class11472)class11938.L_2).y(), ((class11472)class11938.L_2).B());
            channel.writeAndFlush((Object)class119542).addListener(future -> {
                if (future.isSuccess()) {
                    return;
                }
                ((Logger)N_0).error("Auth packet write failed", future.cause());
            });
        });
    }

    public void N(class11951<?> class119512, class11959 class119592, ChannelFutureListener channelFutureListener) {
        ((class11950)this.y_5).N(class119512, class119592, channelFutureListener);
    }

    private void N(class11989 class119892) {
        ((Logger)N_0).warn("Pending packets queue overflow ({}), dropping {} and closing connection", (Object)32, (Object)class119892.N().getClass().getSimpleName());
        this.u();
    }

    public boolean N() {
        return this.L((Channel)this.y_2);
    }

    public void N(class11951<?> class119512, ChannelFutureListener channelFutureListener) {
        ((class11950)this.y_5).N(class119512, class11959.N(class119512), channelFutureListener);
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        if (class10639.N((Throwable)throwable)) {
            ((Logger)N_0).debug("Connection reset: {}", (Object)throwable.getMessage());
            channelHandlerContext.close();
            return;
        }
        ((Logger)N_0).error("Exception in pipeline (channel open={}): {}", (Object)this.L(channelHandlerContext.channel()), (Object)throwable.getMessage(), (Object)throwable);
        if (!this.L(channelHandlerContext.channel())) {
            return;
        }
        this.u();
    }

    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        if (object == WebSocketClientProtocolHandler.ClientHandshakeStateEvent.HANDSHAKE_COMPLETE) {
            this.N(channelHandlerContext.channel());
            return;
        }
        super.userEventTriggered(channelHandlerContext, object);
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.m();
        ((class11950)this.y_5).N();
        class09297 class092972 = (class09297)this.y_3;
        if (class092972 != null) {
            class092972.N(channelHandlerContext.channel());
            this.y_3 = null;
        }
        super.channelInactive(channelHandlerContext);
    }
}

