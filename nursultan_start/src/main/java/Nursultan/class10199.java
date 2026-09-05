/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.base.bedrock.NetherNetInetSocketAddress
 *  dev.kastle.netty.channel.nethernet.config.NetherNetAddress
 *  minecraft.class03437
 *  minecraft.class03459
 */
package Nursultan;

import com.viaversion.viafabricplus.base.bedrock.NetherNetInetSocketAddress;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.net.InetSocketAddress;
import minecraft.class03437;
import minecraft.class03459;

public class class10199
implements class03437 {
    final /* synthetic */ NetherNetAddress N;

    public int L() {
        return 0;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10199(class03459 class034592, NetherNetAddress netherNetAddress) {
        this.N = netherNetAddress;
    }

    public InetSocketAddress u() {
        return new NetherNetInetSocketAddress(this.N);
    }

    public String y() {
        return this.N.getNetworkId();
    }

    public String N() {
        return this.N.getNetworkId();
    }
}

