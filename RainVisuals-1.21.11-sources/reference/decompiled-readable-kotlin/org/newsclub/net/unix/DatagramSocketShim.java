package org.newsclub.net.unix;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramSocketImpl;
import java.net.SocketOption;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

// $VF: Compiled from DatagramSocketShim.java
@IgnoreJRERequirement
abstract class DatagramSocketShim extends DatagramSocket {
   public abstract <T> T getOption(AFSocketOption<T> var1) throws IOException;

   @Override
   public <T> T getOption(SocketOption<T> name) throws IOException {
      return name instanceof AFSocketOption ? this.getOption((AFSocketOption<T>)name) : super.getOption(name);
   }

   protected DatagramSocketShim(DatagramSocketImpl impl) {
      super(impl);
   }

   public abstract <T> DatagramSocket setOption(AFSocketOption<T> var1, T var2) throws IOException;

   @Override
   public <T> DatagramSocket setOption(SocketOption<T> value, T name) throws IOException {
      return name instanceof AFSocketOption ? this.setOption((AFSocketOption<T>)name, value) : super.setOption(name, value);
   }
}
