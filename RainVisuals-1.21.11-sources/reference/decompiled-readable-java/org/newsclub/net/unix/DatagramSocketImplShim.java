/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

import java.io.IOException;
import java.net.DatagramSocketImpl;
import java.net.SocketOption;
import java.util.Set;
import org.newsclub.net.unix.AFDatagramSocketImpl;
import org.newsclub.net.unix.AFSocketOption;
import org.newsclub.net.unix.SocketOptionsMapper;

abstract class DatagramSocketImplShim
extends DatagramSocketImpl {
    @Override
    protected <T> T getOption(SocketOption<T> name) throws IOException {
        if (name instanceof AFSocketOption) {
            return ((AFDatagramSocketImpl)this).getCore().getOption((AFSocketOption)name);
        }
        Integer optionId = SocketOptionsMapper.resolve(name);
        if (optionId == null) {
            return super.getOption(name);
        }
        return (T)this.getOption(optionId);
    }

    protected DatagramSocketImplShim() {
    }

    @Override
    protected Set<SocketOption<?>> supportedOptions() {
        return SocketOptionsMapper.SUPPORTED_SOCKET_OPTIONS;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected <T> void setOption(SocketOption<T> name, T value) throws IOException {
        if (name instanceof AFSocketOption) {
            ((AFDatagramSocketImpl)this).getCore().setOption((AFSocketOption)name, value);
            return;
        }
        Integer optionId = SocketOptionsMapper.resolve(name);
        if (optionId == null) {
            super.setOption(name, value);
        } else {
            void var2_2;
            this.setOption(optionId, (Object)var2_2);
        }
    }
}

