/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11436
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelPipeline
 *  io.netty.handler.ssl.SslHandler
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11436;
import Nursultan.class11881;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.ssl.SslHandler;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11842 {
    public static Object N_0;

    static {
        class11842.N();
        class11842.u();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void u() {
        N_0 = null;
    }

    public boolean N(ChannelPipeline channelPipeline, Channel channel, class11436 class114362) {
        try {
            SSLEngine sSLEngine = class11881.N().newEngine(channel.alloc(), class114362.M(), class114362.y());
            SSLParameters sSLParameters = sSLEngine.getSSLParameters();
            sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
            sSLEngine.setSSLParameters(sSLParameters);
            sSLEngine.setUseClientMode(true);
            SslHandler sslHandler = new SslHandler(sSLEngine);
            channelPipeline.addFirst("ssl", (ChannelHandler)sslHandler);
            sslHandler.handshakeFuture().addListener(future -> {
                if (!future.isSuccess()) {
                    ((Logger)N_0).error("SSL handshake FAILED", future.cause());
                }
            });
            return true;
        }
        catch (Exception exception) {
            ((Logger)N_0).error("Failed to initialize SSL context", (Throwable)exception);
            return false;
        }
    }

    private static void N() {
    }
}

