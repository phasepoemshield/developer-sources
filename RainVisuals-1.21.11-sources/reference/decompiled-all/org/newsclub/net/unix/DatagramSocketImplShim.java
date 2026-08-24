package org.newsclub.net.unix;

import java.io.IOException;
import java.net.DatagramSocketImpl;
import java.net.SocketOption;
import java.util.Set;

// $VF: Compiled from DatagramSocketImplShim.java
abstract class DatagramSocketImplShim extends DatagramSocketImpl {
   @Override
   protected <T> T getOption(SocketOption<T> name) throws IOException {
      if (name instanceof AFSocketOption) {
         return ((AFDatagramSocketImpl)this).getCore().getOption((AFSocketOption<T>)name);
      }

      Integer optionId = SocketOptionsMapper.resolve(name);
      return (T)(optionId == null ? super.getOption(name) : this.getOption(optionId));
   }

   protected DatagramSocketImplShim() {
   }

   @Override
   protected Set<SocketOption<?>> supportedOptions() {
      return SocketOptionsMapper.SUPPORTED_SOCKET_OPTIONS;
   }

   @Override
   protected <T> void setOption(SocketOption<T> value, T name) throws IOException {
      if (name instanceof AFSocketOption) {
         ((AFDatagramSocketImpl)this).getCore().setOption((AFSocketOption<T>)name, value);
      } else {
         Integer optionId = SocketOptionsMapper.resolve(name);
         if (optionId == null) {
            super.setOption(name, value);
         } else {
            this.setOption(optionId, value);
         }
      }
   }
}
