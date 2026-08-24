/*
 * Decompiled with CFR 0.152.
 */
package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.AbstractSelector;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.newsclub.net.unix.AFPipe;
import org.newsclub.net.unix.AFSelectionKey;
import org.newsclub.net.unix.AFSelectorProvider;
import org.newsclub.net.unix.AFUNIXSelectorProvider;
import org.newsclub.net.unix.MapValueSet;
import org.newsclub.net.unix.NativeUnixSocket;
import org.newsclub.net.unix.StackTraceUtil;
import org.newsclub.net.unix.UngrowableSet;

final class AFSelector
extends AbstractSelector {
    private final AFPipe selectorPipe;
    private final PollFd selectorPipePollFd;
    private final ByteBuffer pipeMsgWakeUp = ByteBuffer.allocate(1);
    private final ByteBuffer pipeMsgReceiveBuffer = ByteBuffer.allocateDirect(256);
    private final Map<AFSelectionKey, Integer> keysRegistered = new ConcurrentHashMap<AFSelectionKey, Integer>();
    private final Set<AFSelectionKey> keysRegisteredKeySet = this.keysRegistered.keySet();
    private final Set<SelectionKey> keysRegisteredPublic = Collections.unmodifiableSet(this.keysRegisteredKeySet);
    private final AtomicInteger selectCount = new AtomicInteger(0);
    private final MapValueSet<SelectionKey, Integer> selectedKeysSet = new MapValueSet<AFSelectionKey, Integer>(this.keysRegistered, this.selectCount::get, 0);
    private final Set<SelectionKey> selectedKeysPublic = new UngrowableSet<SelectionKey>(this.selectedKeysSet);
    private PollFd pollFd = null;

    AFSelector(AFSelectorProvider<?> provider) throws IOException {
        super(provider);
        this.selectorPipe = AFUNIXSelectorProvider.getInstance().openSelectablePipe();
        this.selectorPipePollFd = new PollFd(this.selectorPipe.sourceFD());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    protected SelectionKey register(AbstractSelectableChannel ch, int ops, Object att) {
        void var4_4;
        AFSelectionKey key = new AFSelectionKey(this, ch, ops, att);
        AFSelector aFSelector = this;
        synchronized (aFSelector) {
            this.pollFd = null;
            this.selectedKeysSet.markRemoved(key);
        }
        return var4_4;
    }

    @Override
    public Set<SelectionKey> keys() {
        return this.keysRegisteredPublic;
    }

    @Override
    public Set<SelectionKey> selectedKeys() {
        return this.selectedKeysPublic;
    }

    @Override
    public int selectNow() throws IOException {
        return this.select0(0);
    }

    @Override
    public int select(long timeout) throws IOException {
        if (timeout > Integer.MAX_VALUE) {
            timeout = Integer.MAX_VALUE;
        } else if (timeout < 0L) {
            throw new IllegalArgumentException("Timeout must not be negative");
        }
        return this.select0((int)timeout);
    }

    @Override
    public int select() throws IOException {
        try {
            return this.select0(-1);
        }
        catch (SocketTimeoutException e) {
            return 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int select0(int timeout) throws IOException {
        int num;
        PollFd pfd;
        int selectId = this.updateSelectCount();
        AFSelector aFSelector = this;
        synchronized (aFSelector) {
            if (!this.isOpen()) {
                throw new ClosedSelectorException();
            }
            pfd = this.pollFd = this.initPollFd(this.pollFd);
        }
        try {
            this.begin();
            num = NativeUnixSocket.poll(pfd, timeout);
        }
        finally {
            this.end();
        }
        AFSelector aFSelector2 = this;
        synchronized (aFSelector2) {
            pfd = this.pollFd;
            if (pfd != null) {
                AFSelectionKey[] keys2 = pfd.keys;
                if (keys2 != null) {
                    AFSelectionKey[] aFSelectionKeyArray = keys2;
                    int n = aFSelectionKeyArray.length;
                    for (int i = 0; i < n; ++i) {
                        SelectableChannel ch;
                        AFSelectionKey key = aFSelectionKeyArray[i];
                        if (key == null || !key.hasOpInvalid() || (ch = key.channel()) == null || !ch.isOpen()) continue;
                        ch.close();
                    }
                }
            }
            if (num > 0) {
                this.consumeAllBytesAfterPoll();
                this.setOpsReady(pfd, selectId);
            }
            return this.selectedKeysSet.size();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private synchronized void consumeAllBytesAfterPoll() throws IOException {
        int bytesReceived;
        int maxReceive;
        if (this.pollFd == null) {
            return;
        }
        if ((this.pollFd.rops[0] & 1) == 0) {
            return;
        }
        int options = this.selectorPipe.getOptions();
        ByteBuffer byteBuffer = this.pipeMsgReceiveBuffer;
        synchronized (byteBuffer) {
            this.pipeMsgReceiveBuffer.clear();
            maxReceive = this.pipeMsgReceiveBuffer.remaining();
            bytesReceived = NativeUnixSocket.receive(this.pollFd.fds[0], this.pipeMsgReceiveBuffer, 0, maxReceive, null, options, null, 1);
        }
        if (bytesReceived == maxReceive && maxReceive > 0) {
            void var1_4;
            void var4_3;
            do {
                int read;
                if ((read = NativeUnixSocket.poll(this.selectorPipePollFd, 0)) <= 0) continue;
                ByteBuffer byteBuffer2 = this.pipeMsgReceiveBuffer;
                synchronized (byteBuffer2) {
                    this.pipeMsgReceiveBuffer.clear();
                    read = NativeUnixSocket.receive(this.selectorPipePollFd.fds[0], this.pipeMsgReceiveBuffer, 0, maxReceive, null, options, null, 1);
                }
            } while (var4_3 == var1_4 && var4_3 > 0);
        }
    }

    private int updateSelectCount() {
        int selectId = this.selectCount.incrementAndGet();
        if (selectId == 0) {
            this.selectedKeysSet.markAllRemoved();
            selectId = this.selectCount.incrementAndGet();
        }
        return selectId;
    }

    /*
     * WARNING - void declaration
     */
    private void setOpsReady(PollFd pfd, int selectId) {
        if (pfd != null) {
            int i = 1;
            while (i < pfd.rops.length) {
                void var3_3;
                int rops = pfd.rops[i];
                AFSelectionKey key = pfd.keys[i];
                key.setOpsReady(rops);
                if (rops != 0 && this.keysRegistered.containsKey(key)) {
                    this.keysRegistered.put(key, selectId);
                }
                ++var3_3;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private PollFd initPollFd(PollFd existingPollFd) throws IOException {
        AFSelector aFSelector = this;
        synchronized (aFSelector) {
            void var6_11;
            void var7_12;
            Iterator<AFSelectionKey> iterator2;
            block12: {
                Iterator<AFSelectionKey> it = this.keysRegisteredKeySet.iterator();
                while (it.hasNext()) {
                    AFSelectionKey key = it.next();
                    if (!key.getAFCore().fd.valid() || !key.isValid()) {
                        key.cancelNoRemove();
                        it.remove();
                        existingPollFd = null;
                        continue;
                    }
                    key.setOpsReady(0);
                }
                if (existingPollFd == null || existingPollFd.keys == null) break block12;
                if (existingPollFd.keys.length - 1 != this.keysRegistered.size()) break block12;
                boolean needsUpdate = false;
                int i = 1;
                iterator2 = this.keysRegisteredKeySet.iterator();
                while (iterator2.hasNext()) {
                    AFSelectionKey key;
                    block14: {
                        block13: {
                            key = iterator2.next();
                            if (existingPollFd.keys[i] != key) break block13;
                            if (key.isValid()) break block14;
                        }
                        needsUpdate = true;
                        break;
                    }
                    existingPollFd.ops[i] = key.interestOps();
                    ++i;
                }
                if (!needsUpdate) {
                    return existingPollFd;
                }
            }
            int keysToPoll = this.keysRegistered.size();
            for (AFSelectionKey key : this.keysRegisteredKeySet) {
                if (key.isValid()) continue;
                --keysToPoll;
            }
            int size = keysToPoll + 1;
            FileDescriptor[] fds = new FileDescriptor[size];
            int[] ops = new int[size];
            AFSelectionKey[] keys2 = new AFSelectionKey[size];
            fds[0] = this.selectorPipe.sourceFD();
            ops[0] = 1;
            int i = 1;
            for (AFSelectionKey key : this.keysRegisteredKeySet) {
                void var10_15;
                if (!key.isValid()) continue;
                keys2[i] = key;
                fds[i] = key.getAFCore().fd;
                ops[i] = var10_15.interestOps();
                ++i;
            }
            return new PollFd((AFSelectionKey[])var7_12, (FileDescriptor[])iterator2, (int[])var6_11);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void implCloseSelector() throws IOException {
        Set<SelectionKey> keys2;
        this.wakeup();
        Object object = this;
        synchronized (object) {
            keys2 = this.keys();
            this.keysRegistered.clear();
        }
        object = keys2.iterator();
        while (object.hasNext()) {
            SelectionKey key = (SelectionKey)object.next();
            ((AFSelectionKey)key).cancelNoRemove();
        }
        this.selectorPipe.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    public Selector wakeup() {
        if (this.isOpen()) {
            try {
                ByteBuffer byteBuffer = this.pipeMsgWakeUp;
                synchronized (byteBuffer) {
                    block8: {
                        this.pipeMsgWakeUp.clear();
                        try {
                            this.selectorPipe.sink().write(this.pipeMsgWakeUp);
                        }
                        catch (SocketException e) {
                            if (!this.selectorPipe.sinkFD().valid()) break block8;
                            throw e;
                        }
                    }
                }
            }
            catch (IOException e) {
                void var1_2;
                StackTraceUtil.printStackTrace((Throwable)var1_2);
            }
        }
        return this;
    }

    synchronized void remove(AFSelectionKey key) {
        this.selectedKeysSet.remove(key);
        this.deregister(key);
        this.pollFd = null;
    }

    private void deregister(AFSelectionKey key) {
        try {
            NativeUnixSocket.deregisterSelectionKey((AbstractSelectableChannel)key.channel(), key);
        }
        catch (ClassCastException classCastException) {
            // empty catch block
        }
    }

    static final class PollFd {
        final int[] ops;
        final FileDescriptor[] fds;
        final int[] rops;
        final AFSelectionKey[] keys;

        PollFd(FileDescriptor pipeSourceFd, int op) {
            FileDescriptor[] fileDescriptorArray = new FileDescriptor[1];
            fileDescriptorArray[0] = pipeSourceFd;
            this.fds = fileDescriptorArray;
            int[] nArray = new int[1];
            nArray[0] = op;
            this.ops = nArray;
            this.rops = new int[1];
            this.keys = null;
        }

        PollFd(AFSelectionKey[] keys2, FileDescriptor[] fds, int[] ops) {
            this.keys = keys2;
            if (fds.length != ops.length) {
                throw new IllegalStateException();
            }
            this.fds = fds;
            this.ops = ops;
            this.rops = new int[ops.length];
        }

        PollFd(FileDescriptor pipeSourceFd) {
            this(pipeSourceFd, 1);
        }
    }
}

