/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Optional;
import minecraft.class03420;
import minecraft.class03437;
import org.slf4j.Logger;

@FunctionalInterface
public interface class03450 {
    public static final Logger N = LogUtils.getLogger();
    public static final class03450 y = class034202 -> {
        try {
            InetAddress inetAddress = InetAddress.getByName(class034202.N());
            return Optional.of(class03437.N(new InetSocketAddress(inetAddress, class034202.y())));
        }
        catch (UnknownHostException unknownHostException) {
            N.debug("Couldn't resolve server {} address", (Object)class034202.N(), (Object)unknownHostException);
            return Optional.empty();
        }
    };

    public Optional<class03437> resolve(class03420 var1);
}

