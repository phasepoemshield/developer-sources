/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11880
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  org.apache.logging.log4j.LogManager
 */
package Nursultan;

import Nursultan.class11423;
import Nursultan.class11880;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;

public class class11407 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public static Object y_0;

    private void M() {
    }

    public class11407(Supplier<ChannelFuture> supplier, class11880 class118802, class11423 class114232, BooleanSupplier booleanSupplier, BooleanSupplier booleanSupplier2) {
        this.M();
        this.N_0 = supplier;
        this.N_1 = class118802;
        this.N_2 = class114232;
        this.N_3 = booleanSupplier;
        this.N_4 = booleanSupplier2;
    }

    static {
        class11407.y();
        class11407.R();
        y_0 = LogManager.getLogger(String.class);
    }

    private static void y() {
    }

    private void y(ChannelFuture channelFuture) {
    }

    public void N() {
    }

    private void N(Channel channel) {
    }

    private void N(ChannelFuture channelFuture) {
    }

    private static void R() {
    }
}

