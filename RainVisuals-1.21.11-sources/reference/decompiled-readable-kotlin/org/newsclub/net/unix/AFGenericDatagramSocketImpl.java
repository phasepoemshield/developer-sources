package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;

// $VF: Compiled from AFGenericDatagramSocketImpl.java
final class AFGenericDatagramSocketImpl extends AFDatagramSocketImpl<AFGenericSocketAddress> {
   AFGenericDatagramSocketImpl(FileDescriptor fd, AFSocketType socketType) throws IOException {
      super(AFGenericSelectorProvider.AF_GENERIC, fd, socketType);
   }
}
