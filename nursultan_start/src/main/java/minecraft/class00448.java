/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelDuplexHandler
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPromise
 *  io.netty.handler.codec.http.DefaultFullHttpResponse
 *  io.netty.handler.codec.http.HttpHeaderNames
 *  io.netty.handler.codec.http.HttpRequest
 *  io.netty.handler.codec.http.HttpResponse
 *  io.netty.handler.codec.http.HttpResponseStatus
 *  io.netty.handler.codec.http.HttpVersion
 *  io.netty.util.AttributeKey
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.AttributeKey;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Set;
import minecraft.class00441;
import minecraft.class00456;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@ChannelHandler.Sharable
public class class00448
extends ChannelDuplexHandler {
    private final Logger y = LogUtils.getLogger();
    private static final AttributeKey<Boolean> L = AttributeKey.valueOf((String)"authenticated");
    private static final AttributeKey<Boolean> u = AttributeKey.valueOf((String)"websocket_auth_allowed");
    private static final String i = "minecraft-v1";
    private static final String R = "minecraft-v1,";
    public static final String N = "Bearer ";
    private final class00456 M;
    private final Set<String> B;

    private @Nullable String L(HttpRequest httpRequest) {
        String string = httpRequest.headers().get((CharSequence)HttpHeaderNames.AUTHORIZATION);
        if (string != null && string.startsWith(N)) {
            return string.substring(N.length()).trim();
        }
        return null;
    }

    public class00448(class00456 class004562, String string) {
        this.M = class004562;
        this.B = Sets.newHashSet((Object[])string.split(","));
    }

    public void write(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) throws Exception {
        HttpResponse httpResponse;
        if (object instanceof HttpResponse && (httpResponse = (HttpResponse)object).status().code() == HttpResponseStatus.SWITCHING_PROTOCOLS.code() && channelHandlerContext.channel().attr(u).get() != null && ((Boolean)channelHandlerContext.channel().attr(u).get()).equals(Boolean.TRUE)) {
            httpResponse.headers().set((CharSequence)HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL, (Object)i);
        }
        super.write(channelHandlerContext, object, channelPromise);
    }

    private @Nullable String u(HttpRequest httpRequest) {
        String string = httpRequest.headers().get((CharSequence)HttpHeaderNames.SEC_WEBSOCKET_PROTOCOL);
        if (string != null && string.startsWith(R)) {
            return string.substring(R.length()).trim();
        }
        return null;
    }

    private boolean y(HttpRequest httpRequest) {
        String string = httpRequest.headers().get((CharSequence)HttpHeaderNames.ORIGIN);
        if (string == null || string.isEmpty()) {
            return false;
        }
        return this.B.contains(string);
    }

    private void N(ChannelHandlerContext channelHandlerContext, String string) {
        byte[] byArray = ("{\"error\":\"Unauthorized\",\"message\":\"" + string + "\"}").getBytes(StandardCharsets.UTF_8);
        DefaultFullHttpResponse defaultFullHttpResponse = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.UNAUTHORIZED, Unpooled.wrappedBuffer((byte[])byArray));
        defaultFullHttpResponse.headers().set((CharSequence)HttpHeaderNames.CONTENT_TYPE, (Object)"application/json");
        defaultFullHttpResponse.headers().set((CharSequence)HttpHeaderNames.CONTENT_LENGTH, (Object)byArray.length);
        defaultFullHttpResponse.headers().set((CharSequence)HttpHeaderNames.CONNECTION, (Object)"close");
        channelHandlerContext.writeAndFlush((Object)defaultFullHttpResponse).addListener(future -> channelHandlerContext.close());
    }

    private class00441 N(HttpRequest httpRequest) {
        String string = this.L(httpRequest);
        if (string != null) {
            if (this.N(string)) {
                return class00441.N();
            }
            return class00441.N("Invalid API key");
        }
        String string2 = this.u(httpRequest);
        if (string2 != null) {
            if (!this.y(httpRequest)) {
                return class00441.N("Origin Not Allowed");
            }
            if (this.N(string2)) {
                return class00441.N(true);
            }
            return class00441.N("Invalid API key");
        }
        return class00441.N("Missing API key");
    }

    private String N(ChannelHandlerContext channelHandlerContext) {
        return ((InetSocketAddress)channelHandlerContext.channel().remoteAddress()).getAddress().getHostAddress();
    }

    public boolean N(String string) {
        if (string.isEmpty()) {
            return false;
        }
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        byte[] byArray2 = this.M.y().getBytes(StandardCharsets.UTF_8);
        return MessageDigest.isEqual(byArray, byArray2);
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        Object object2;
        String string = this.N(channelHandlerContext);
        if (object instanceof HttpRequest) {
            object2 = (HttpRequest)object;
            class00441 class004412 = this.N((HttpRequest)object2);
            if (class004412.y()) {
                channelHandlerContext.channel().attr(L).set((Object)true);
                if (class004412.u()) {
                    channelHandlerContext.channel().attr(u).set((Object)Boolean.TRUE);
                }
            } else {
                this.y.debug("Authentication rejected for connection with ip {}: {}", (Object)string, (Object)class004412.L());
                channelHandlerContext.channel().attr(L).set((Object)false);
                this.N(channelHandlerContext, class004412.L());
                return;
            }
        }
        if (Boolean.TRUE.equals(object2 = (Boolean)channelHandlerContext.channel().attr(L).get())) {
            super.channelRead(channelHandlerContext, object);
        } else {
            this.y.debug("Dropping unauthenticated connection with ip {}", (Object)string);
            channelHandlerContext.close();
        }
    }
}

