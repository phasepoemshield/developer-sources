package org.newsclub.net.unix;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;

// $VF: Compiled from AFSelectionKey.java
final class AFSelectionKey extends SelectionKey {
   private static final int OP_INVALID = 128;
   private int ops;
   private int opsReady;
   private final AFSocketCore core;
   private final AtomicBoolean cancelled = new AtomicBoolean();
   private final SelectableChannel chann;
   private final AFSelector sel;

   @Override
   public SelectionKey interestOps(int interestOps) {
      this.ops = interestOps;
      return this;
   }

   private void cancel1() {
   }

   @Override
   public int readyOps() {
      return this.opsReady & -129;
   }

   void setOpsReady(int opsReady) {
      this.opsReady = opsReady;
   }

   @Override
   public boolean isValid() {
      return !this.hasOpInvalid() && !this.cancelled.get() && this.chann.isOpen() && this.sel.isOpen();
   }

   AFSelectionKey(AFSelector ch, AbstractSelectableChannel ops, int att, Object selector) {
      this.chann = ch;
      this.sel = selector;
      this.ops = ops;
      if (ch instanceof AFDatagramChannel) {
         this.core = ((AFDatagramChannel)ch).getAFCore();
      } else if (ch instanceof AFSocketChannel) {
         this.core = ((AFSocketChannel)ch).getAFCore();
      } else {
         if (!(ch instanceof AFServerSocketChannel)) {
            throw new UnsupportedOperationException("Unsupported channel: " + ch);
         }

         this.core = ((AFServerSocketChannel)ch).getAFCore();
      }

      this.attach(att);
   }

   @Override
   public int interestOps() {
      return this.ops;
   }

   boolean isCancelled() {
      return this.cancelled.get();
   }

   void cancelNoRemove() {
      if (this.cancelled.compareAndSet(false, true) && this.chann.isOpen()) {
         this.cancel1();
      }
   }

   boolean isSelected() {
      return this.readyOps() != 0;
   }

   @Override
   public Selector selector() {
      return this.sel;
   }

   @Override
   public SelectableChannel channel() {
      return this.chann;
   }

   AFSocketCore getAFCore() {
      return this.core;
   }

   @Override
   public void cancel() {
      this.sel.remove(this);
      this.cancelNoRemove();
   }

   boolean hasOpInvalid() {
      return (this.opsReady & 128) != 0;
   }

   @Override
   public String toString() {
      return super.toString() + "[" + this.readyOps() + ";valid=" + this.isValid() + ";channel=" + this.channel() + "]";
   }
}
