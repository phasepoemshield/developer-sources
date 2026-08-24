package jnr.enxio.channels;

import java.io.IOException;
import java.net.ProtocolFamily;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Pipe;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import jnr.ffi.Platform;

// $VF: Compiled from NativeSelectorProvider.java
public final class NativeSelectorProvider extends SelectorProvider {
   @Override
   public ServerSocketChannel openServerSocketChannel() throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public DatagramChannel openDatagramChannel() throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public AbstractSelector openSelector() throws IOException {
      return Platform.getNativePlatform().isBSD() ? new KQSelector(this) : new PollSelector(this);
   }

   @Override
   public DatagramChannel openDatagramChannel(ProtocolFamily family) throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   @Override
   public SocketChannel openSocketChannel() throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   public static final SelectorProvider getInstance() {
      return NativeSelectorProvider.SingletonHolder.INSTANCE;
   }

   @Override
   public Pipe openPipe() throws IOException {
      throw new UnsupportedOperationException("Not supported yet.");
   }

   // $VF: Compiled from NativeSelectorProvider.java
   private static final class SingletonHolder {
      static NativeSelectorProvider INSTANCE = new NativeSelectorProvider();
   }
}
