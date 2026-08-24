/*
 * Decompiled with CFR 0.152.
 */
package jnr.enxio.channels;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.AbstractSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import jnr.constants.platform.Errno;
import jnr.enxio.channels.KQSelectionKey;
import jnr.enxio.channels.Native;
import jnr.enxio.channels.NativeSelectableChannel;
import jnr.enxio.channels.NativeSelectorProvider;
import jnr.ffi.Memory;
import jnr.ffi.Platform;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.ffi.Type;
import jnr.ffi.TypeAlias;
import jnr.ffi.provider.jffi.NativeRuntime;

class KQSelector
extends AbstractSelector {
    private static final int EV_DISABLE = 8;
    private static final boolean DEBUG = false;
    private static final int EV_ADD = 1;
    private final Set<SelectionKey> selected;
    private final Pointer eventbuf;
    private static final int EVFILT_READ = -1;
    private final Map<Integer, Descriptor> descriptors;
    private final Native.Timespec ZERO_TIMESPEC;
    private final Pointer changebuf;
    private final Object regLock;
    private final Runtime runtime = NativeRuntime.getSystemRuntime();
    private static final int MAX_EVENTS = 100;
    private final int[] pipefd;
    private int kqfd = -1;
    private static final int EV_CLEAR = 32;
    private static final int EVFILT_WRITE = -2;
    private static final int EV_DELETE = 2;
    private final EventIO io = EventIO.getInstance();
    private static final int EV_ENABLE = 4;

    @Override
    protected void implCloseSelector() throws IOException {
        if (this.kqfd != -1) {
            Native.close(this.kqfd);
        }
        if (this.pipefd[0] != -1) {
            Native.close(this.pipefd[0]);
        }
        if (this.pipefd[1] != -1) {
            Native.close(this.pipefd[1]);
        }
        this.kqfd = -1;
        this.pipefd[1] = -1;
        this.pipefd[0] = -1;
        for (Map.Entry<Integer, Descriptor> entry : this.descriptors.entrySet()) {
            Iterator iterator2 = entry.getValue().keys.iterator();
            while (iterator2.hasNext()) {
                KQSelectionKey kQSelectionKey = (KQSelectionKey)iterator2.next();
                this.deregister(kQSelectionKey);
            }
        }
    }

    private void wakeupReceived() {
        Native.libc().read(this.pipefd[0], new byte[1], 1L);
    }

    @Override
    public int selectNow() throws IOException {
        return this.poll(0L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void interestOps(KQSelectionKey k, int ops) {
        Object object = this.regLock;
        synchronized (object) {
            this.handleChangedKey(this.descriptors.get(k.getFD()));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public Set<SelectionKey> keys() {
        void var1_1;
        HashSet keys2 = new HashSet();
        Iterator<Descriptor> iterator2 = this.descriptors.values().iterator();
        while (iterator2.hasNext()) {
            Descriptor fd = iterator2.next();
            keys2.addAll(fd.keys);
        }
        return Collections.unmodifiableSet(var1_1);
    }

    @Override
    public int select(long timeout) throws IOException {
        return this.poll(timeout);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private void handleChangedKey(Descriptor changed) {
        Object object = this.regLock;
        synchronized (object) {
            void var3_3;
            int _nchanged = 0;
            int writers = 0;
            int readers = 0;
            for (KQSelectionKey k : changed.keys) {
                if ((k.interestOps() & 0x11) != 0) {
                    ++readers;
                }
                if ((k.interestOps() & 0xC) == 0) continue;
                ++writers;
            }
            Integer[] integerArray = new Integer[2];
            integerArray[0] = -1;
            integerArray[1] = -2;
            Integer[] integerArray2 = integerArray;
            int n = integerArray2.length;
            for (int i = 0; i < n; ++i) {
                void var10_11;
                void var9_10;
                Integer filt = integerArray2[i];
                int flags = 0;
                if (filt == -1) {
                    if (readers > 0 && !changed.read) {
                        flags = 37;
                        changed.read = true;
                    } else if (readers == 0 && changed.read) {
                        flags = 8;
                        changed.read = false;
                    }
                }
                if (filt == -2) {
                    if (writers > 0 && !changed.write) {
                        flags = 37;
                        changed.write = true;
                    } else if (writers == 0 && changed.write) {
                        flags = 8;
                        changed.write = false;
                    }
                }
                if (flags == 0) continue;
                this.io.put(this.changebuf, _nchanged++, changed.fd, var9_10.intValue(), (int)var10_11);
            }
            Native.libc().kevent(this.kqfd, this.changebuf, (int)var3_3, null, 0, this.ZERO_TIMESPEC);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected SelectionKey register(AbstractSelectableChannel ch, int ops, Object att) {
        KQSelectionKey k = new KQSelectionKey(this, (NativeSelectableChannel)((Object)ch), ops);
        Object object = this.regLock;
        synchronized (object) {
            Descriptor d = new Descriptor(k.getFD());
            this.descriptors.put(k.getFD(), d);
            d.keys.add(k);
            this.handleChangedKey(d);
        }
        k.attach(att);
        return k;
    }

    @Override
    public Selector wakeup() {
        Native.libc().write(this.pipefd[1], new byte[1], 1L);
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private int poll(long timeout) {
        void var6_10;
        int nchanged = this.handleCancelledKeys();
        Native.Timespec ts = null;
        if (timeout >= 0L) {
            long sec = TimeUnit.MILLISECONDS.toSeconds(timeout);
            long nsec = TimeUnit.MILLISECONDS.toNanos(timeout % 1000L);
            ts = new Native.Timespec(sec, nsec);
        }
        int nready = 0;
        try {
            this.begin();
            while ((nready = Native.libc().kevent(this.kqfd, this.changebuf, nchanged, this.eventbuf, 100, ts)) < 0 && Errno.EINTR.equals(Errno.valueOf(Native.getRuntime().getLastError()))) {
            }
        }
        finally {
            this.end();
        }
        int updatedKeyCount = 0;
        Object object = this.regLock;
        synchronized (object) {
            int i = 0;
            while (i < nready) {
                void var8_11;
                int fd = this.io.getFD(this.eventbuf, i);
                Descriptor d = this.descriptors.get(fd);
                if (d != null) {
                    int filt = this.io.getFilter(this.eventbuf, i);
                    for (KQSelectionKey k : d.keys) {
                        void var13_15;
                        int iops = k.interestOps();
                        int ops = 0;
                        if (filt == -1) {
                            ops |= iops & 0x11;
                        }
                        if (filt == -2) {
                            ops |= iops & 0xC;
                        }
                        ++updatedKeyCount;
                        k.readyOps(ops);
                        if (this.selected.contains(k)) continue;
                        this.selected.add((SelectionKey)var13_15);
                    }
                } else if (fd == this.pipefd[0]) {
                    this.wakeupReceived();
                }
                ++var8_11;
            }
        }
        return (int)var6_10;
    }

    @Override
    public int select() throws IOException {
        return this.poll(-1L);
    }

    public KQSelector(NativeSelectorProvider provider) {
        super(provider);
        int[] nArray = new int[2];
        nArray[0] = -1;
        nArray[1] = -1;
        this.pipefd = nArray;
        this.regLock = new Object();
        this.descriptors = new ConcurrentHashMap<Integer, Descriptor>();
        this.selected = new LinkedHashSet<SelectionKey>();
        this.ZERO_TIMESPEC = new Native.Timespec(0L, 0L);
        this.changebuf = Memory.allocateDirect(this.runtime, 100 * this.io.size());
        this.eventbuf = Memory.allocateDirect(this.runtime, 100 * this.io.size());
        Native.libc().pipe(this.pipefd);
        this.kqfd = Native.libc().kqueue();
        this.io.put(this.changebuf, 0, this.pipefd[0], -1, 1);
        Native.libc().kevent(this.kqfd, this.changebuf, 1, null, 0, this.ZERO_TIMESPEC);
    }

    @Override
    public Set<SelectionKey> selectedKeys() {
        return this.selected;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private int handleCancelledKeys() {
        Set<SelectionKey> cancelled;
        Set<SelectionKey> set = cancelled = this.cancelledKeys();
        synchronized (set) {
            void var3_3;
            int nchanged = 0;
            Object object = this.regLock;
            synchronized (object) {
                for (SelectionKey k : cancelled) {
                    KQSelectionKey kqs = (KQSelectionKey)k;
                    this.deregister(kqs);
                    Set<SelectionKey> set2 = this.selected;
                    synchronized (set2) {
                        this.selected.remove(kqs);
                    }
                    Descriptor d = this.descriptors.get(kqs.getFD());
                    if (d != null) {
                        d.keys.remove(kqs);
                    }
                    if (d == null || d.keys.isEmpty()) {
                        this.io.put(this.changebuf, nchanged++, kqs.getFD(), -1, 2);
                        this.io.put(this.changebuf, nchanged++, kqs.getFD(), -2, 2);
                        this.descriptors.remove(kqs.getFD());
                    }
                    if (nchanged < 100) continue;
                    Native.libc().kevent(this.kqfd, this.changebuf, nchanged, null, 0, this.ZERO_TIMESPEC);
                    nchanged = 0;
                }
            }
            cancelled.clear();
            return (int)var3_3;
        }
    }

    private static class LegacyEventLayout
    extends EventLayout {
        public final StructLayout.intptr_t data = new StructLayout.intptr_t(this);
        public final StructLayout.Pointer udata = new StructLayout.Pointer(this);

        private LegacyEventLayout(Runtime runtime) {
            super(runtime);
        }
    }

    private static class FreeBSD12EventLayout
    extends EventLayout {
        public final StructLayout.u_int64_t[] ext;
        public final StructLayout.Pointer udata;
        public final StructLayout.int64_t data = new StructLayout.int64_t(this);

        private FreeBSD12EventLayout(Runtime runtime) {
            super(runtime);
            this.udata = new StructLayout.Pointer(this);
            this.ext = (StructLayout.u_int64_t[])this.array(new StructLayout.u_int64_t[4]);
        }
    }

    private static final class EventIO {
        private static final EventIO INSTANCE = new EventIO();
        private final Type uintptr_t;
        private final EventLayout layout;

        public final int size() {
            return this.layout.size();
        }

        public static EventIO getInstance() {
            return INSTANCE;
        }

        public final void putFilter(Pointer buf, int index, int filter) {
            buf.putShort((long)(index * this.layout.size()) + this.layout.filter.offset(), (short)filter);
        }

        public final void putFlags(Pointer buf, int index, int flags) {
            buf.putShort((long)(index * this.layout.size()) + this.layout.flags.offset(), (short)flags);
        }

        public final void put(Pointer buf, int index, int fd, int filt, int flags) {
            buf.putInt(this.uintptr_t, (long)(index * this.layout.size()) + this.layout.ident.offset(), fd);
            buf.putShort((long)(index * this.layout.size()) + this.layout.filter.offset(), (short)filt);
            buf.putShort((long)(index * this.layout.size()) + this.layout.flags.offset(), (short)flags);
        }

        int getFD(Pointer ptr, int index) {
            return (int)ptr.getInt(this.uintptr_t, (long)(index * this.layout.size()) + this.layout.ident.offset());
        }

        public final int getFilter(Pointer buf, int index) {
            return buf.getShort((long)(index * this.layout.size()) + this.layout.filter.offset());
        }

        /*
         * WARNING - void declaration
         */
        private EventIO() {
            boolean is_freebsd_12_or_later = false;
            if (Platform.getNativePlatform().getOS() == Platform.OS.FREEBSD) {
                String version = System.getProperty("os.version");
                if (version != null) {
                    int tr_i = -1;
                    char[] cArray = new char[5];
                    cArray[0] = 32;
                    cArray[1] = 95;
                    cArray[2] = 45;
                    cArray[3] = 43;
                    cArray[4] = 46;
                    char[] cArray2 = cArray;
                    int n = cArray2.length;
                    for (int i = 0; i < n; ++i) {
                        void var8_10;
                        char c = cArray2[i];
                        int i2 = version.indexOf(c);
                        if (i2 < 0) continue;
                        if (tr_i != -1) {
                            if (tr_i <= var8_10) continue;
                        }
                        tr_i = var8_10;
                    }
                    if (tr_i >= 0) {
                        version = version.substring(0, tr_i);
                    }
                    try {
                        int n2 = Integer.parseInt(version);
                        if (n2 > 11) {
                            is_freebsd_12_or_later = true;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        // empty catch block
                    }
                }
            }
            this.layout = is_freebsd_12_or_later ? new FreeBSD12EventLayout(NativeRuntime.getSystemRuntime()) : new LegacyEventLayout(NativeRuntime.getSystemRuntime());
            this.uintptr_t = this.layout.getRuntime().findType(TypeAlias.uintptr_t);
        }
    }

    private static class Descriptor {
        private boolean write = false;
        private boolean read = false;
        private final int fd;
        private final Set<KQSelectionKey> keys = new HashSet<KQSelectionKey>();

        public Descriptor(int fd) {
            this.fd = fd;
        }
    }

    private static abstract class EventLayout
    extends StructLayout {
        public final StructLayout.u_int16_t flags;
        public final StructLayout.u_int32_t fflags;
        public final StructLayout.int16_t filter;
        public final StructLayout.uintptr_t ident = new StructLayout.uintptr_t(this);

        private EventLayout(Runtime runtime) {
            super(runtime);
            this.filter = new StructLayout.int16_t(this);
            this.flags = new StructLayout.u_int16_t(this);
            this.fflags = new StructLayout.u_int32_t(this);
        }
    }
}

