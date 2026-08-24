package jnr.enxio.channels;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.AbstractSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import jnr.constants.platform.Errno;
import jnr.ffi.Memory;
import jnr.ffi.Platform;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.ffi.Type;
import jnr.ffi.TypeAlias;
import jnr.ffi.provider.jffi.NativeRuntime;

// $VF: Compiled from KQSelector.java
class KQSelector extends AbstractSelector {
   private static final int EV_DISABLE = 8;
   private static final boolean DEBUG = false;
   private static final int EV_ADD = 1;
   private final Set<SelectionKey> selected;
   private final Pointer eventbuf;
   private static final int EVFILT_READ = -1;
   private final Map<Integer, KQSelector.Descriptor> descriptors;
   private final Native.Timespec ZERO_TIMESPEC;
   private final Pointer changebuf;
   private final Object regLock;
   private final Runtime runtime;
   private static final int MAX_EVENTS = 100;
   private final int[] pipefd;
   private int kqfd = -1;
   private static final int EV_CLEAR = 32;
   private static final int EVFILT_WRITE = -2;
   private static final int EV_DELETE = 2;
   private final KQSelector.EventIO io;
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

      this.pipefd[0] = this.pipefd[1] = this.kqfd = -1;

      for (Entry<Integer, KQSelector.Descriptor> entry : this.descriptors.entrySet()) {
         for (KQSelectionKey k : ((KQSelector.Descriptor)entry.getValue()).keys) {
            this.deregister(k);
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

   void interestOps(KQSelectionKey k, int ops) {
      synchronized (this.regLock) {
         this.handleChangedKey(this.descriptors.get(k.getFD()));
      }
   }

   @Override
   public Set<SelectionKey> keys() {
      Set<SelectionKey> keys = new HashSet<>();

      for (KQSelector.Descriptor fd : this.descriptors.values()) {
         keys.addAll(fd.keys);
      }

      return Collections.unmodifiableSet(keys);
   }

   @Override
   public int select(long timeout) throws IOException {
      return this.poll(timeout);
   }

   private void handleChangedKey(KQSelector.Descriptor changed) {
      synchronized (this.regLock) {
         int _nchanged = 0;
         int writers = 0;
         int readers = 0;

         for (KQSelectionKey k : changed.keys) {
            if ((k.interestOps() & 17) != 0) {
               readers++;
            }

            if ((k.interestOps() & 12) != 0) {
               writers++;
            }
         }

         for (Integer filt : new Integer[]{-1, -2}) {
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

            if (flags != 0) {
               this.io.put(this.changebuf, _nchanged++, changed.fd, filt, flags);
            }
         }

         Native.libc().kevent(this.kqfd, this.changebuf, _nchanged, null, 0, this.ZERO_TIMESPEC);
      }
   }

   @Override
   protected SelectionKey register(AbstractSelectableChannel ops, int att, Object ch) {
      KQSelectionKey k = new KQSelectionKey(this, (NativeSelectableChannel)ch, ops);
      synchronized (this.regLock) {
         KQSelector.Descriptor d = new KQSelector.Descriptor(k.getFD());
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

   private int poll(long timeout) {
      int nchanged = this.handleCancelledKeys();
      Native.Timespec ts = null;
      if (timeout >= 0L) {
         long nready = TimeUnit.MILLISECONDS.toSeconds(timeout);
         long nsec = TimeUnit.MILLISECONDS.toNanos(timeout % 1000L);
         ts = new Native.Timespec(nready, nsec);
      }

      int var21 = 0;

      try {
         this.begin();

         do {
            var21 = Native.libc().kevent(this.kqfd, this.changebuf, nchanged, this.eventbuf, 100, ts);
         } while (var21 < 0 && Errno.EINTR.equals(Errno.valueOf(Native.getRuntime().getLastError())));
      } finally {
         this.end();
      }

      int updatedKeyCount = 0;
      synchronized (this.regLock) {
         for (int i = 0; i < var21; i++) {
            int fd = this.io.getFD(this.eventbuf, i);
            KQSelector.Descriptor d = this.descriptors.get(fd);
            if (d != null) {
               int filt = this.io.getFilter(this.eventbuf, i);

               for (KQSelectionKey k : d.keys) {
                  int iops = k.interestOps();
                  int ops = 0;
                  if (filt == -1) {
                     ops |= iops & 17;
                  }

                  if (filt == -2) {
                     ops |= iops & 12;
                  }

                  updatedKeyCount++;
                  k.readyOps(ops);
                  if (!this.selected.contains(k)) {
                     this.selected.add(k);
                  }
               }
            } else if (fd == this.pipefd[0]) {
               this.wakeupReceived();
            }
         }

         return updatedKeyCount;
      }
   }

   @Override
   public int select() throws IOException {
      return this.poll(-1L);
   }

   public KQSelector(NativeSelectorProvider provider) {
      super(provider);
      this.runtime = NativeRuntime.getSystemRuntime();
      this.io = KQSelector.EventIO.getInstance();
      this.pipefd = new int[]{-1, -1};
      this.regLock = new Object();
      this.descriptors = new ConcurrentHashMap<>();
      this.selected = new LinkedHashSet<>();
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

   private int handleCancelledKeys() {
      Set<SelectionKey> cancelled = this.cancelledKeys();
      synchronized (cancelled) {
         int nchanged = 0;
         synchronized (this.regLock) {
            for (SelectionKey k : cancelled) {
               KQSelectionKey kqs = (KQSelectionKey)k;
               this.deregister(kqs);
               synchronized (this.selected) {
                  this.selected.remove(kqs);
               }

               KQSelector.Descriptor d = this.descriptors.get(kqs.getFD());
               if (d != null) {
                  d.keys.remove(kqs);
               }

               if (d == null || d.keys.isEmpty()) {
                  this.io.put(this.changebuf, nchanged++, kqs.getFD(), -1, 2);
                  this.io.put(this.changebuf, nchanged++, kqs.getFD(), -2, 2);
                  this.descriptors.remove(kqs.getFD());
               }

               if (nchanged >= 100) {
                  Native.libc().kevent(this.kqfd, this.changebuf, nchanged, null, 0, this.ZERO_TIMESPEC);
                  nchanged = 0;
               }
            }
         }

         cancelled.clear();
         return nchanged;
      }
   }

   // $VF: Compiled from KQSelector.java
   private static class Descriptor {
      private boolean write;
      private boolean read;
      private final int fd;
      private final Set<KQSelectionKey> keys = new HashSet<>();

      public Descriptor(int fd) {
         this.write = false;
         this.read = false;
         this.fd = fd;
      }
   }

   // $VF: Compiled from KQSelector.java
   private static final class EventIO {
      private static final KQSelector.EventIO INSTANCE = new KQSelector.EventIO();
      private final Type uintptr_t;
      private final KQSelector.EventLayout layout;

      public final int size() {
         return this.layout.size();
      }

      public static KQSelector.EventIO getInstance() {
         return INSTANCE;
      }

      public final void putFilter(Pointer buf, int index, int filter) {
         buf.putShort(index * this.layout.size() + this.layout.filter.offset(), (short)filter);
      }

      public final void putFlags(Pointer index, int flags, int buf) {
         buf.putShort(index * this.layout.size() + this.layout.flags.offset(), (short)flags);
      }

      public final void put(Pointer fd, int flags, int filt, int buf, int index) {
         buf.putInt(this.uintptr_t, index * this.layout.size() + this.layout.ident.offset(), fd);
         buf.putShort(index * this.layout.size() + this.layout.filter.offset(), (short)filt);
         buf.putShort(index * this.layout.size() + this.layout.flags.offset(), (short)flags);
      }

      int getFD(Pointer index, int ptr) {
         return (int)ptr.getInt(this.uintptr_t, index * this.layout.size() + this.layout.ident.offset());
      }

      public final int getFilter(Pointer index, int buf) {
         return buf.getShort(index * this.layout.size() + this.layout.filter.offset());
      }

      private EventIO() {
         boolean is_freebsd_12_or_later = false;
         if (Platform.getNativePlatform().getOS() == Platform.OS.FREEBSD) {
            String version = System.getProperty("os.version");
            if (version != null) {
               int tr_i = -1;

               for (char c : new char[]{' ', '_', '-', '+', '.'}) {
                  int i = version.indexOf(c);
                  if (i >= 0 && (tr_i == -1 || tr_i > i)) {
                     tr_i = i;
                  }
               }

               if (tr_i >= 0) {
                  version = version.substring(0, tr_i);
               }

               try {
                  int var10 = Integer.parseInt(version);
                  if (var10 > 11) {
                     is_freebsd_12_or_later = true;
                  }
               } catch (NumberFormatException var9) {
               }
            }
         }

         if (is_freebsd_12_or_later) {
            this.layout = new KQSelector.FreeBSD12EventLayout(NativeRuntime.getSystemRuntime());
         } else {
            this.layout = new KQSelector.LegacyEventLayout(NativeRuntime.getSystemRuntime());
         }

         this.uintptr_t = this.layout.getRuntime().findType(TypeAlias.uintptr_t);
      }
   }

   // $VF: Compiled from KQSelector.java
   private abstract static class EventLayout extends StructLayout {
      public final StructLayout.u_int16_t flags;
      public final StructLayout.u_int32_t fflags;
      public final StructLayout.int16_t filter;
      public final StructLayout.uintptr_t ident = new StructLayout.uintptr_t();

      private EventLayout(Runtime runtime) {
         super(runtime);
         this.filter = new StructLayout.int16_t();
         this.flags = new StructLayout.u_int16_t();
         this.fflags = new StructLayout.u_int32_t();
      }
   }

   // $VF: Compiled from KQSelector.java
   private static class FreeBSD12EventLayout extends KQSelector.EventLayout {
      public final StructLayout.u_int64_t[] ext;
      public final StructLayout.Pointer udata;
      public final StructLayout.int64_t data = new StructLayout.int64_t();

      private FreeBSD12EventLayout(Runtime runtime) {
         super(runtime);
         this.udata = new StructLayout.Pointer();
         this.ext = this.array(new StructLayout.u_int64_t[4]);
      }
   }

   // $VF: Compiled from KQSelector.java
   private static class LegacyEventLayout extends KQSelector.EventLayout {
      public final StructLayout.intptr_t data = new StructLayout.intptr_t();
      public final StructLayout.Pointer udata = new StructLayout.Pointer();

      private LegacyEventLayout(Runtime runtime) {
         super(runtime);
      }
   }
}
