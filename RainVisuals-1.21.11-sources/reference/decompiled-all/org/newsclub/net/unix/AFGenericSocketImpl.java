package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.net.SocketException;

// $VF: Compiled from AFGenericSocketImpl.java
final class AFGenericSocketImpl extends AFSocketImpl<AFGenericSocketAddress> {
   @Override
   public void setOption(int optID, Object value) throws SocketException {
      this.setOptionLenient(optID, value);
   }

   @Override
   public Object getOption(int optID) throws SocketException {
      return this.getOptionLenient(optID);
   }

   AFGenericSocketImpl(FileDescriptor fdObj) {
      super(AFGenericSelectorProvider.AF_GENERIC, fdObj);
   }
}
