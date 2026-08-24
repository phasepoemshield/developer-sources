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

// $VF: Compiled from AFSelector.java
final class AFSelector extends AbstractSelector {
   private final Set<SelectionKey> selectedKeysPublic;
   private final AFSelector.PollFd selectorPipePollFd;
   private final Set<AFSelectionKey> keysRegisteredKeySet;
   private final MapValueSet<SelectionKey, Integer> selectedKeysSet;
   private final Set<SelectionKey> keysRegisteredPublic;
   private final Map<AFSelectionKey, Integer> keysRegistered;
   private AFSelector.PollFd pollFd;
   private final AFPipe selectorPipe;
   private final ByteBuffer pipeMsgWakeUp = ByteBuffer.allocate(1);
   private final ByteBuffer pipeMsgReceiveBuffer = ByteBuffer.allocateDirect(256);
   private final AtomicInteger selectCount;

   @Override
   protected SelectionKey register(AbstractSelectableChannel att, int ch, Object ops) {
      AFSelectionKey key = new AFSelectionKey(this, ch, ops, att);
      synchronized (this) {
         this.pollFd = null;
         this.selectedKeysSet.markRemoved(key);
         return key;
      }
   }

   @Override
   public Set<SelectionKey> keys() {
      return this.keysRegisteredPublic;
   }

   private synchronized void consumeAllBytesAfterPoll() throws IOException {
      if (this.pollFd != null) {
         if ((this.pollFd.rops[0] & 1) != 0) {
            int options = this.selectorPipe.getOptions();
            int maxReceive;
            int bytesReceived;
            synchronized (this.pipeMsgReceiveBuffer) {
               this.pipeMsgReceiveBuffer.clear();
               maxReceive = this.pipeMsgReceiveBuffer.remaining();
               bytesReceived = NativeUnixSocket.receive(this.pollFd.fds[0], this.pipeMsgReceiveBuffer, 0, maxReceive, null, options, null, 1);
            }

            int var9;
            if (bytesReceived == maxReceive && maxReceive > 0) {
               do {
                  if ((var9 = NativeUnixSocket.poll(this.selectorPipePollFd, 0)) > 0) {
                     synchronized (this.pipeMsgReceiveBuffer) {
                        this.pipeMsgReceiveBuffer.clear();
                        var9 = NativeUnixSocket.receive(this.selectorPipePollFd.fds[0], this.pipeMsgReceiveBuffer, 0, maxReceive, null, options, null, 1);
                     }
                  }
               } while (var9 == maxReceive && var9 > 0);
            }
         }
      }
   }

   private AFSelector.PollFd initPollFd(AFSelector.PollFd existingPollFd) throws IOException {
      synchronized (this) {
         Iterator<AFSelectionKey> it = this.keysRegisteredKeySet.iterator();

         while (it.hasNext()) {
            AFSelectionKey size = it.next();
            if (size.getAFCore().fd.valid() && size.isValid()) {
               size.setOpsReady(0);
            } else {
               size.cancelNoRemove();
               it.remove();
               existingPollFd = null;
            }
         }

         if (existingPollFd != null && existingPollFd.keys != null && existingPollFd.keys.length - 1 == this.keysRegistered.size()) {
            boolean var13 = false;
            int var15 = 1;

            for (AFSelectionKey ops : this.keysRegisteredKeySet) {
               if (existingPollFd.keys[var15] != ops || !ops.isValid()) {
                  var13 = true;
                  break;
               }

               existingPollFd.ops[var15] = ops.interestOps();
               var15++;
            }

            if (!var13) {
               return existingPollFd;
            }
         }

         int var14 = this.keysRegistered.size();

         for (AFSelectionKey var18 : this.keysRegisteredKeySet) {
            if (!var18.isValid()) {
               var14--;
            }
         }

         int var17 = var14 + 1;
         FileDescriptor[] var19 = new FileDescriptor[var17];
         int[] var20 = new int[var17];
         AFSelectionKey[] keys = new AFSelectionKey[var17];
         var19[0] = this.selectorPipe.sourceFD();
         var20[0] = 1;
         int i = 1;

         for (AFSelectionKey key : this.keysRegisteredKeySet) {
            if (key.isValid()) {
               keys[i] = key;
               var19[i] = key.getAFCore().fd;
               var20[i] = key.interestOps();
               i++;
            }
         }

         return new AFSelector.PollFd(keys, var19, var20);
      }
   }

   @Override
   public int select(long timeout) throws IOException {
      if (timeout > 2147483647L) {
         timeout = 2147483647L;
      } else if (timeout < 0L) {
         throw new IllegalArgumentException("Timeout must not be negative");
      }

      return this.select0((int)timeout);
   }

   synchronized void remove(AFSelectionKey key) {
      this.selectedKeysSet.remove(key);
      this.deregister(key);
      this.pollFd = null;
   }

   private int updateSelectCount() {
      int selectId = this.selectCount.incrementAndGet();
      if (selectId == 0) {
         this.selectedKeysSet.markAllRemoved();
         selectId = this.selectCount.incrementAndGet();
      }

      return selectId;
   }

   @Override
   public int selectNow() throws IOException {
      return this.select0(0);
   }

   @Override
   protected void implCloseSelector() throws IOException {
      this.wakeup();
      Set<SelectionKey> keys;
      synchronized (this) {
         keys = this.keys();
         this.keysRegistered.clear();
      }

      for (SelectionKey key : keys) {
         ((AFSelectionKey)key).cancelNoRemove();
      }

      this.selectorPipe.close();
   }

   @Override
   public int select() throws IOException {
      try {
         return this.select0(-1);
      } catch (SocketTimeoutException var2) {
         return 0;
      }
   }

   private void setOpsReady(AFSelector.PollFd selectId, int pfd) {
      if (pfd != null) {
         for (int i = 1; i < pfd.rops.length; i++) {
            int rops = pfd.rops[i];
            AFSelectionKey key = pfd.keys[i];
            key.setOpsReady(rops);
            if (rops != 0 && this.keysRegistered.containsKey(key)) {
               this.keysRegistered.put(key, selectId);
            }
         }
      }
   }

   @Override
   public Selector wakeup() {
      if (this.isOpen()) {
         try {
            synchronized (this.pipeMsgWakeUp) {
               this.pipeMsgWakeUp.clear();

               try {
                  this.selectorPipe.sink().write(this.pipeMsgWakeUp);
               } catch (SocketException e) {
                  if (this.selectorPipe.sinkFD().valid()) {
                     throw e;
                  }
               }
            }
         } catch (IOException var6) {
            StackTraceUtil.printStackTrace(var6);
         }
      }

      return this;
   }

   private void deregister(AFSelectionKey key) {
      try {
         NativeUnixSocket.deregisterSelectionKey((AbstractSelectableChannel)key.channel(), key);
      } catch (ClassCastException var3) {
      }
   }

   private int select0(int timeout) throws IOException {
      int selectId = this.updateSelectCount();
      AFSelector.PollFd pfd;
      synchronized (this) {
         if (!this.isOpen()) {
            throw new ClosedSelectorException();
         }

         pfd = this.pollFd = this.initPollFd(this.pollFd);
      }

      int num;
      try {
         this.begin();
         num = NativeUnixSocket.poll(pfd, timeout);
      } finally {
         this.end();
      }

      synchronized (this) {
         pfd = this.pollFd;
         if (pfd != null) {
            AFSelectionKey[] keys = pfd.keys;
            if (keys != null) {
               for (AFSelectionKey key : keys) {
                  if (key != null && key.hasOpInvalid()) {
                     SelectableChannel ch = key.channel();
                     if (ch != null && ch.isOpen()) {
                        ch.close();
                     }
                  }
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

   AFSelector(AFSelectorProvider<?> provider) throws IOException {
      super(provider);
      this.keysRegistered = new ConcurrentHashMap<>();
      this.keysRegisteredKeySet = this.keysRegistered.keySet();
      this.keysRegisteredPublic = Collections.unmodifiableSet(this.keysRegisteredKeySet);
      this.selectCount = new AtomicInteger(0);
      this.selectedKeysSet = new MapValueSet<>(this.keysRegistered, this.selectCount::get, 0);
      this.selectedKeysPublic = new UngrowableSet<>(this.selectedKeysSet);
      this.pollFd = null;
      this.selectorPipe = AFUNIXSelectorProvider.getInstance().openSelectablePipe();
      this.selectorPipePollFd = new AFSelector.PollFd(this.selectorPipe.sourceFD());
   }

   @Override
   public Set<SelectionKey> selectedKeys() {
      return this.selectedKeysPublic;
   }

   // $VF: Compiled from AFSelector.java
   static final class PollFd {
      final int[] ops;
      final FileDescriptor[] fds;
      final int[] rops;
      final AFSelectionKey[] keys;

      PollFd(FileDescriptor op, int pipeSourceFd) {
         this.fds = new FileDescriptor[]{pipeSourceFd};
         this.ops = new int[]{op};
         this.rops = new int[1];
         this.keys = null;
      }

      PollFd(AFSelectionKey[] keys, FileDescriptor[] fds, int[] ops) {
         this.keys = keys;
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
