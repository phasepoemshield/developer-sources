package jnr.enxio.channels;

import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelectionKey;

// $VF: Compiled from PollSelectionKey.java
class PollSelectionKey extends AbstractSelectionKey {
   private final NativeSelectableChannel channel;
   private final PollSelector selector;
   private int readyOps;
   private int index;
   private int interestOps = 0;

   void setIndex(int index) {
      this.index = index;
   }

   int getIndex() {
      return this.index;
   }

   @Override
   public SelectionKey interestOps(int ops) {
      this.interestOps = ops;
      this.selector.interestOps(this, ops);
      return this;
   }

   @Override
   public int interestOps() {
      return this.interestOps;
   }

   @Override
   public SelectableChannel channel() {
      return (SelectableChannel)this.channel;
   }

   void readyOps(int readyOps) {
      this.readyOps = readyOps;
   }

   public PollSelectionKey(PollSelector selector, NativeSelectableChannel channel) {
      this.readyOps = 0;
      this.index = -1;
      this.selector = selector;
      this.channel = channel;
   }

   @Override
   public int readyOps() {
      return this.readyOps;
   }

   int getFD() {
      return this.channel.getFD();
   }

   @Override
   public Selector selector() {
      return this.selector;
   }
}
