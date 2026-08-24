package jnr.enxio.channels;

import java.io.IOException;
import java.net.ProtocolFamily;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Pipe;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;

// $VF: Compiled from NativeFileSelectorProvider.java
public final class NativeFileSelectorProvider extends SelectorProvider {
   @Override
   public AbstractSelector openSelector() throws IOException {
      return new PollSelector(this);
   }

   @Override
   public DatagramChannel openDatagramChannel() throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   public static final SelectorProvider getInstance() {
      return NativeFileSelectorProvider.SingletonHolder.INSTANCE;
   }

   @Override
   public ServerSocketChannel openServerSocketChannel() throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public SocketChannel openSocketChannel() throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public DatagramChannel openDatagramChannel(ProtocolFamily family) throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public Pipe openPipe() throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   // $VF: Compiled from NativeFileSelectorProvider.java
   private static final class SingletonHolder {
      static NativeFileSelectorProvider INSTANCE = new NativeFileSelectorProvider();
   }
}
