/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kohlschutter.annotations.compiletime.SuppressFBWarnings
 */
package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.newsclub.net.unix.NativeUnixSocket;

final class AncillaryDataSupport
implements Closeable {
    private static final FileDescriptor[] NO_FILE_DESCRIPTORS;
    private static final ByteBuffer EMPTY_BUFFER;
    private final List<FileDescriptor[]> receivedFileDescriptors;
    private int[] tipcDestName = null;
    private final Map<FileDescriptor, Integer> openReceivedFileDescriptors = Collections.synchronizedMap(new HashMap());
    private ByteBuffer ancillaryReceiveBuffer;
    @SuppressFBWarnings(value={"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    int[] pendingFileDescriptors = null;
    private static final int MIN_ANCBUF_LEN;
    private int[] tipcErrorInfo = null;

    boolean hasOutboundFileDescriptors() {
        return this.pendingFileDescriptors != null;
    }

    void receiveFileDescriptors(int[] fds) throws IOException {
        if (fds == null || fds.length == 0) {
            return;
        }
        int fdsLength = fds.length;
        FileDescriptor[] descriptors = new FileDescriptor[fdsLength];
        for (int i = 0; i < fdsLength; ++i) {
            FileDescriptor fdesc = new FileDescriptor();
            NativeUnixSocket.initFD(fdesc, fds[i]);
            descriptors[i] = fdesc;
            this.openReceivedFileDescriptors.put(fdesc, fds[i]);
            Closeable cleanup = new Closeable(){
                final /* synthetic */ AncillaryDataSupport this$0;

                @Override
                public void close() throws IOException {
                    AncillaryDataSupport.access$000((AncillaryDataSupport)this.this$0).remove(fdesc);
                }
                {
                    this.this$0 = this$0;
                }
            };
            try {
                NativeUnixSocket.attachCloseable(fdesc, cleanup);
                continue;
            }
            catch (SocketException socketException) {
                // empty catch block
            }
        }
        this.receivedFileDescriptors.add(descriptors);
    }

    void setAncillaryReceiveBufferSize(int size) {
        if (size == this.ancillaryReceiveBuffer.capacity()) {
            return;
        }
        if (size <= 0) {
            this.ancillaryReceiveBuffer = EMPTY_BUFFER;
        } else {
            this.setAncillaryReceiveBufferSize0(Math.max(256, Math.min(MIN_ANCBUF_LEN, size)));
        }
    }

    /*
     * Unable to fully structure code
     */
    void setOutboundFileDescriptors(FileDescriptor ... fdescs) throws IOException {
        if (fdescs == null) ** GOTO lbl4
        if (fdescs.length == 0) {
lbl4:
            // 2 sources

            fds = null;
        } else {
            numFdescs = fdescs.length;
            fds = new int[numFdescs];
            i = 0;
            while (i < numFdescs) {
                fdesc = fdescs[i];
                fds[i] = NativeUnixSocket.getFD(fdesc);
                ++var4_4;
            }
        }
        this.setOutboundFileDescriptors((int[])var2_2);
    }

    void setOutboundFileDescriptors(int[] fds) {
        this.pendingFileDescriptors = fds == null || fds.length == 0 ? null : fds;
    }

    public void ensureAncillaryReceiveBufferSize(int minSize) {
        if (minSize <= 0) {
            return;
        }
        if (this.ancillaryReceiveBuffer.capacity() < minSize) {
            this.setAncillaryReceiveBufferSize(minSize);
        }
    }

    AncillaryDataSupport() {
        this.receivedFileDescriptors = Collections.synchronizedList(new ArrayList());
        this.ancillaryReceiveBuffer = EMPTY_BUFFER;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    void setTipcErrorInfo(int errorCode, int dataLength) {
        void var2_2;
        if (errorCode == 0) {
            if (dataLength == 0) {
                this.tipcErrorInfo = null;
                return;
            }
        }
        int[] nArray = new int[2];
        nArray[0] = errorCode;
        nArray[1] = var2_2;
        this.tipcErrorInfo = nArray;
    }

    int getAncillaryReceiveBufferSize() {
        return this.ancillaryReceiveBuffer.capacity();
    }

    /*
     * WARNING - void declaration
     */
    int[] getTIPCDestName() {
        void var1_1;
        int[] addr = this.tipcDestName;
        this.tipcDestName = null;
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    int[] getTIPCErrorInfo() {
        void var1_1;
        int[] info = this.tipcErrorInfo;
        this.tipcErrorInfo = null;
        return var1_1;
    }

    void setAncillaryReceiveBufferSize0(int size) {
        this.ancillaryReceiveBuffer = ByteBuffer.allocateDirect(size);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        Map<FileDescriptor, Integer> map = this.openReceivedFileDescriptors;
        synchronized (map) {
            Iterator<FileDescriptor> iterator2 = this.openReceivedFileDescriptors.keySet().iterator();
            while (iterator2.hasNext()) {
                FileDescriptor desc = iterator2.next();
                if (!desc.valid()) continue;
                try {
                    NativeUnixSocket.close(desc);
                }
                catch (Exception exception) {}
            }
        }
    }

    void clearReceivedFileDescriptors() {
        this.receivedFileDescriptors.clear();
    }

    /*
     * WARNING - void declaration
     */
    FileDescriptor[] getReceivedFileDescriptors() {
        if (this.receivedFileDescriptors.isEmpty()) {
            return NO_FILE_DESCRIPTORS;
        }
        ArrayList<FileDescriptor[]> copy = new ArrayList<FileDescriptor[]>(this.receivedFileDescriptors);
        if (copy.isEmpty()) {
            return NO_FILE_DESCRIPTORS;
        }
        this.receivedFileDescriptors.removeAll(copy);
        int count = 0;
        Iterator iterator2 = copy.iterator();
        while (iterator2.hasNext()) {
            FileDescriptor[] fds = (FileDescriptor[])iterator2.next();
            count += fds.length;
        }
        if (count == 0) {
            return NO_FILE_DESCRIPTORS;
        }
        FileDescriptor[] oneArray = new FileDescriptor[count];
        int offset = 0;
        for (FileDescriptor[] fds : copy) {
            void var6_7;
            System.arraycopy(fds, 0, oneArray, offset, fds.length);
            int n = offset + ((void)var6_7).length;
        }
        return iterator2;
    }

    static {
        EMPTY_BUFFER = ByteBuffer.allocate(0);
        NO_FILE_DESCRIPTORS = new FileDescriptor[0];
        MIN_ANCBUF_LEN = NativeUnixSocket.isLoaded() ? NativeUnixSocket.ancillaryBufMinLen() : 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    void setTipcDestName(int a2, int b2, int c) {
        void var3_3;
        if (a2 == 0) {
            if (b2 == 0) {
                if (c == 0) {
                    this.tipcDestName = null;
                    return;
                }
            }
        }
        int[] nArray = new int[3];
        nArray[0] = a2;
        nArray[1] = b2;
        nArray[2] = var3_3;
        this.tipcDestName = nArray;
    }
}

