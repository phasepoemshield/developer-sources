/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 *  Nursultan.class11407
 *  Nursultan.class11410
 *  Nursultan.class11423
 *  Nursultan.class11436
 *  Nursultan.class11831
 *  Nursultan.class11841
 *  Nursultan.class11842
 *  Nursultan.class11850
 *  Nursultan.class11864
 *  Nursultan.class11876
 *  Nursultan.class11880
 *  Nursultan.class11951
 *  Nursultan.class11959
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  org.apache.logging.log4j.LogManager
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class11407;
import Nursultan.class11410;
import Nursultan.class11423;
import Nursultan.class11436;
import Nursultan.class11831;
import Nursultan.class11841;
import Nursultan.class11842;
import Nursultan.class11850;
import Nursultan.class11864;
import Nursultan.class11876;
import Nursultan.class11880;
import Nursultan.class11951;
import Nursultan.class11959;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.logging.log4j.LogManager;

public class class11405 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;

    public AtomicBoolean L() {
        return (AtomicBoolean)this.L_3;
    }

    public class11864 M() {
        return (class11864)this.L_0;
    }

    private void P() {
    }

    public class11405() {
        this.P();
        this.L_0 = new class11864();
        this.L_1 = new class11876();
        this.L_2 = new class11880();
        this.L_3 = new AtomicBoolean(true);
        this.L_4 = new AtomicReference();
        this.L_5 = new AtomicReference();
        this.y_0 = new AtomicReference();
        this.y_1 = new class11850(((AtomicReference)this.L_4)::get);
        this.y_2 = new AtomicBoolean(false);
    }

    static {
        class11405.s();
        N_0 = LogManager.getLogger(String.class);
    }

    public class11876 B() {
        return (class11876)this.L_1;
    }

    public void Z() {
    }

    public class11850 i() {
        return (class11850)this.y_1;
    }

    private static void s() {
        N_0 = null;
    }

    public void m() {
    }

    private void t() {
    }

    public AtomicReference<class11407> U() {
        return (AtomicReference)this.L_5;
    }

    public void z() {
    }

    public AtomicReference<class11841> u() {
        return (AtomicReference)this.y_0;
    }

    public class11880 y() {
        return (class11880)this.L_2;
    }

    public List<String> E() {
        return ((class11864)this.L_0).N();
    }

    public void N(class11951<?> class119512, class11959 class119592, ChannelFutureListener channelFutureListener) {
    }

    public void N(class11951<class09276> class119512) {
    }

    private static /* synthetic */ ChannelFuture N(Bootstrap bootstrap, class11436 class114362) {
        return bootstrap.connect(class114362.M(), class114362.y());
    }

    private Bootstrap N(EventLoopGroup eventLoopGroup, class11436 class114362, class11423 class114232) {
        class11831 class118312 = new class11831(class114362, new class11842(), () -> new class11410(this), ((AtomicReference)this.L_4)::set, () -> {});
        return (Bootstrap)((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(eventLoopGroup)).channel(NioSocketChannel.class)).option(ChannelOption.TCP_NODELAY, (Object)true)).handler((ChannelHandler)class118312);
    }

    public AtomicBoolean N() {
        return (AtomicBoolean)this.y_2;
    }

    public void N(class11951<?> class119512, class11959 class119592) {
    }

    public AtomicReference<class11410> W() {
        return (AtomicReference)this.L_4;
    }

    public boolean R() {
        return true;
    }
}

