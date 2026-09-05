/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.handler.ssl.ApplicationProtocolConfig
 *  io.netty.handler.ssl.ApplicationProtocolConfig$Protocol
 *  io.netty.handler.ssl.ApplicationProtocolConfig$SelectedListenerFailureBehavior
 *  io.netty.handler.ssl.ApplicationProtocolConfig$SelectorFailureBehavior
 *  io.netty.handler.ssl.SslContext
 *  io.netty.handler.ssl.SslContextBuilder
 */
package Nursultan;

import Nursultan.class11855;
import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;

public class class11881 {
    private class11881() {
    }

    public static SslContext N() throws Exception {
        return SslContextBuilder.forClient().protocols(new String[]{"TLSv1.3", "TLSv1.2"}).trustManager(class11855.N()).applicationProtocolConfig(new ApplicationProtocolConfig(ApplicationProtocolConfig.Protocol.ALPN, ApplicationProtocolConfig.SelectorFailureBehavior.NO_ADVERTISE, ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT, new String[]{"http/1.1"})).build();
    }
}

