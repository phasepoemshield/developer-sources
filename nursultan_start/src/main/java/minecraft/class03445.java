/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.net.InetSocketAddress;
import minecraft.class03437;

class class03445
implements class03437 {
    final /* synthetic */ InetSocketAddress N;

    @Override
    public int L() {
        return this.N.getPort();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03445(InetSocketAddress inetSocketAddress) {
        this.N = inetSocketAddress;
    }

    @Override
    public InetSocketAddress u() {
        return this.N;
    }

    @Override
    public String y() {
        return this.N.getAddress().getHostAddress();
    }

    @Override
    public String N() {
        return this.N.getAddress().getHostName();
    }
}

