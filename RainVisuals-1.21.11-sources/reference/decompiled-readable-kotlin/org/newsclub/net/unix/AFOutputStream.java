package org.newsclub.net.unix;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

// $VF: Compiled from AFOutputStream.java
@IgnoreJRERequirement
public abstract class AFOutputStream extends OutputStream implements FileDescriptorAccess {
   public long transferFrom(InputStream in) throws IOException {
      return in.transferTo(this);
   }

   AFOutputStream() {
   }
}
