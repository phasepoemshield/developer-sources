package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;

// $VF: Compiled from AFUNIXSocketExtensions.java
public interface AFUNIXSocketExtensions extends AFSocketExtensions {
   FileDescriptor[] getReceivedFileDescriptors() throws IOException;

   boolean hasOutboundFileDescriptors();

   AFUNIXSocketCredentials getPeerCredentials() throws IOException;

   void clearReceivedFileDescriptors();

   void setOutboundFileDescriptors(FileDescriptor... var1) throws IOException;
}
