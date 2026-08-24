/*
 * Decompiled with CFR 0.152.
 */
package eu.donyka.discord.connection.unix;

import eu.donyka.discord.connection.unix.IUnixBackend;
import java.io.File;
import java.io.IOException;
import org.newsclub.net.unix.AFUNIXSocket;
import org.newsclub.net.unix.AFUNIXSocketAddress;

public class JUnixBackend
implements IUnixBackend {
    private AFUNIXSocket socket;

    @Override
    public int read(byte[] bytes) throws IOException {
        block3: {
            block2: {
                if (this.socket == null) break block2;
                if (this.socket.isConnected()) break block3;
            }
            return -1;
        }
        return this.socket.getInputStream().read(bytes);
    }

    @Override
    public boolean isConnected() {
        return this.socket != null && this.socket.isConnected();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void openPipe(String path) throws IOException {
        AFUNIXSocket socket = AFUNIXSocket.newInstance();
        try {
            socket.connect(AFUNIXSocketAddress.of(new File(path)));
            this.socket = socket;
        }
        catch (IOException e) {
            void var3_3;
            socket.close();
            throw var3_3;
        }
    }

    @Override
    public void closePipe() throws IOException {
        if (this.socket != null) {
            this.socket.close();
        }
    }

    @Override
    public int getAvailable() throws IOException {
        block3: {
            block2: {
                if (this.socket == null) break block2;
                if (this.socket.isConnected()) break block3;
            }
            return -1;
        }
        return this.socket.getInputStream().available();
    }

    @Override
    public void write(byte[] bytes) throws IOException {
        if (this.socket == null || !this.socket.isConnected()) {
            return;
        }
        this.socket.getOutputStream().write(bytes);
    }
}

