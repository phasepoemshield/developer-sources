package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;

// $VF: Compiled from FileDescriptorAccess.java
public interface FileDescriptorAccess {
   FileDescriptor getFileDescriptor() throws IOException;
}
