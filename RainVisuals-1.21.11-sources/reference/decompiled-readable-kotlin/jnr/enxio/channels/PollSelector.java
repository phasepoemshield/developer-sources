package jnr.enxio.channels;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import jnr.constants.platform.Errno;

// $VF: Compiled from PollSelector.java
class PollSelector extends AbstractSelector {
   private final Set<SelectionKey> selected;
   private final int[] pipefd;
   private static final int FD_OFFSET = 0;
   private ByteBuffer pollData;
   static final int POLLOUT = 4;
   private final Map<SelectionKey, Boolean> keys;
   static final int POLLIN = 1;
   private PollSelectionKey[] keyArray = new PollSelectionKey[0];
   private static final int POLLFD_SIZE = 8;
   static final int POLLHUP = 16;
   private final Object regLock;
   private int nfds;
   static final int POLLERR = 8;
   private static final int EVENTS_OFFSET = 4;
   private static final int REVENTS_OFFSET = 6;

   private void putPollFD(int fd, int idx) {
      this.pollData.putInt(idx * 8 + 0, fd);
   }

   private int getPollFD(int idx) {
      return this.pollData.getInt(idx * 8 + 0);
   }

   private void putPollRevents(int events, int idx) {
      this.pollData.putShort(idx * 8 + 6, (short)events);
   }

   private int poll(long timeout) throws IOException {
      Set<SelectionKey> cancelled = this.cancelledKeys();
      synchronized (cancelled) {
         for (SelectionKey k : cancelled) {
            this.remove((PollSelectionKey)k);
         }

         cancelled.clear();
      }

      int nready = 0;

      try {
         this.begin();

         do {
            nready = Native.libc().poll(this.pollData, this.nfds, (int)timeout);
         } while (nready < 0 && Errno.EINTR.equals(Errno.valueOf(Native.getRuntime().getLastError())));
      } finally {
         this.end();
      }

      if (nready < 1) {
         return nready;
      }

      if ((this.getPollRevents(0) & 1) != 0) {
         this.wakeupReceived();
      }

      int var17 = 0;

      for (SelectionKey k : this.keys.keySet()) {
         PollSelectionKey pk = (PollSelectionKey)k;
         int revents = this.getPollRevents(pk.getIndex());
         if (revents != 0) {
            this.putPollRevents(pk.getIndex(), 0);
            int iops = k.interestOps();
            int ops = 0;
            if ((revents & 1) != 0) {
               ops |= iops & 17;
            }

            if ((revents & 4) != 0) {
               ops |= iops & 12;
            }

            if ((revents & 24) != 0) {
               ops = iops;
            }

            ((PollSelectionKey)k).readyOps(ops);
            var17++;
            if (!this.selected.contains(k)) {
               this.selected.add(k);
            }
         }
      }

      return var17;
   }

   @Override
   public Set<SelectionKey> selectedKeys() {
      return this.selected;
   }

   private void add(PollSelectionKey k) {
      synchronized (this.regLock) {
         this.nfds++;
         if (this.keyArray.length < this.nfds) {
            PollSelectionKey[] newArray = new PollSelectionKey[this.nfds + this.nfds / 2];
            System.arraycopy(this.keyArray, 0, newArray, 0, this.nfds - 1);
            this.keyArray = newArray;
            ByteBuffer newBuffer = ByteBuffer.allocateDirect(newArray.length * 8);
            if (this.pollData != null) {
               newBuffer.put(this.pollData);
            }

            ((Buffer)newBuffer).position(0);
            this.pollData = newBuffer.order(ByteOrder.nativeOrder());
         }

         k.setIndex(this.nfds - 1);
         this.keyArray[this.nfds - 1] = k;
         this.putPollFD(k.getIndex(), k.getFD());
         this.putPollEvents(k.getIndex(), 0);
         this.keys.put(k, true);
      }
   }

   public PollSelector(SelectorProvider provider) {
      super(provider);
      this.pollData = null;
      this.pipefd = new int[]{-1, -1};
      this.regLock = new Object();
      this.keys = new ConcurrentHashMap<>();
      this.selected = new HashSet<>();
      Native.libc().pipe(this.pipefd);
      this.pollData = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder());
      this.putPollFD(0, this.pipefd[0]);
      this.putPollEvents(0, 1);
      this.nfds = 1;
      this.keyArray = new PollSelectionKey[1];
   }

   private short getPollEvents(int idx) {
      return this.pollData.getShort(idx * 8 + 4);
   }

   @Override
   protected void implCloseSelector() throws IOException {
      if (this.pipefd[0] != -1) {
         Native.close(this.pipefd[0]);
      }

      if (this.pipefd[1] != -1) {
         Native.close(this.pipefd[1]);
      }

      for (SelectionKey key : this.keys.keySet()) {
         this.remove((PollSelectionKey)key);
      }
   }

   @Override
   public Set<SelectionKey> keys() {
      return new HashSet<>(Arrays.asList(this.keyArray).subList(1, this.nfds));
   }

   @Override
   protected SelectionKey register(AbstractSelectableChannel ops, int att, Object ch) {
      PollSelectionKey key = new PollSelectionKey(this, (NativeSelectableChannel)ch);
      this.add(key);
      key.attach(att);
      key.interestOps(ops);
      return key;
   }

   private void putPollEvents(int idx, int events) {
      this.pollData.putShort(idx * 8 + 4, (short)events);
   }

   @Override
   public int select() throws IOException {
      return this.poll(-1L);
   }

   void interestOps(PollSelectionKey k, int ops) {
      short events = 0;
      if ((ops & 17) != 0) {
         events = (short)(events | 1);
      }

      if ((ops & 12) != 0) {
         events = (short)(events | 4);
      }

      this.putPollEvents(k.getIndex(), events);
   }

   private void remove(PollSelectionKey k) {
      int idx = k.getIndex();
      synchronized (this.regLock) {
         if (idx < this.nfds - 1) {
            PollSelectionKey last = this.keyArray[this.nfds - 1];
            this.keyArray[idx] = last;
            this.putPollFD(idx, this.getPollFD(last.getIndex()));
            this.putPollEvents(idx, this.getPollEvents(last.getIndex()));
            last.setIndex(idx);
         } else {
            this.putPollFD(idx, -1);
            this.putPollEvents(idx, 0);
         }

         this.keyArray[this.nfds - 1] = null;
         this.nfds--;
         synchronized (this.selected) {
            this.selected.remove(k);
         }

         this.keys.remove(k);
      }

      this.deregister(k);
   }

   @Override
   public Selector wakeup() {
      try {
         Native.write(this.pipefd[1], ByteBuffer.allocate(1));
         return this;
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   @Override
   public int select(long timeout) throws IOException {
      return this.poll(timeout > 0L ? timeout : -1L);
   }

   private void wakeupReceived() throws IOException {
      Native.read(this.pipefd[0], ByteBuffer.allocate(1));
   }

   @Override
   public int selectNow() throws IOException {
      return this.poll(0L);
   }

   private short getPollRevents(int idx) {
      return this.pollData.getShort(idx * 8 + 6);
   }
}
