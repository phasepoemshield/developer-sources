/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
 */
package org.newsclub.net.unix;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramSocketImpl;
import java.net.SocketOption;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.newsclub.net.unix.AFSocketOption;

@IgnoreJRERequirement
abstract class DatagramSocketShim
extends DatagramSocket {
    protected DatagramSocketShim(DatagramSocketImpl impl) {
        super(impl);
    }

    @Override
    public <T> T getOption(SocketOption<T> name) throws IOException {
        if (name instanceof AFSocketOption) {
            return this.getOption((AFSocketOption)name);
        }
        return super.getOption(name);
    }

    @Override
    public <T> DatagramSocket setOption(SocketOption<T> name, T value) throws IOException {
        if (name instanceof AFSocketOption) {
            return this.setOption((AFSocketOption)name, value);
        }
        return super.setOption(name, value);
    }

    public abstract <T> T getOption(AFSocketOption<T> var1) throws IOException;

    public abstract <T> DatagramSocket setOption(AFSocketOption<T> var1, T var2) throws IOException;
}

