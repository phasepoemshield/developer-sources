/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09481
 *  com.google.common.collect.Lists
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.util.HashedWheelTimer
 *  io.netty.util.Timeout
 *  io.netty.util.Timer
 */
package minecraft;

import Nursultan.class09481;
import com.google.common.collect.Lists;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timeout;
import io.netty.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class class01601
extends ChannelInboundHandlerAdapter {
    private static final Timer N = new HashedWheelTimer();
    private final int y;
    private final int L;
    private final List<class09481> u = Lists.newArrayList();

    public class01601(int n, int n2) {
        this.y = n;
        this.L = n2;
    }

    private void N(Timeout timeout) {
        class09481 class094812 = this.u.remove(0);
        class094812.N.fireChannelRead(class094812.y);
    }

    private void N(ChannelHandlerContext channelHandlerContext, Object object) {
        int n = this.y + (int)(Math.random() * (double)this.L);
        this.u.add(new class09481(channelHandlerContext, object));
        N.newTimeout(this::N, (long)n, TimeUnit.MILLISECONDS);
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        this.N(channelHandlerContext, object);
    }
}

