package org.freedesktop.dbus;

import java.util.Optional;
import org.freedesktop.dbus.exceptions.MarshallingException;
import org.freedesktop.dbus.spi.message.ISocketProvider;
import org.freedesktop.dbus.utils.ReflectionFileDescriptorHelper;

// $VF: Compiled from FileDescriptor.java
public final class FileDescriptor {
   private final int fd;

   @Override
   public String toString() {
      return FileDescriptor.class.getSimpleName() + "[fd=" + this.fd + "]";
   }

   @Override
   public boolean equals(Object _o) {
      if (this == _o) {
         return true;
      } else if (_o != null && this.getClass() == _o.getClass()) {
         FileDescriptor that = (FileDescriptor)_o;
         return this.fd == that.fd;
      } else {
         return false;
      }
   }

   public static FileDescriptor fromJavaFileDescriptor(java.io.FileDescriptor _data, ISocketProvider _provider) throws MarshallingException {
      if (_provider != null) {
         Optional<Integer> result = _provider.getFileDescriptorValue(_data);
         if (result.isPresent()) {
            return new FileDescriptor(result.get());
         }
      }

      return new FileDescriptor(
         ReflectionFileDescriptorHelper.getInstance()
            .flatMap(helper -> helper.getFileDescriptorValue(_data))
            .orElseThrow(() -> new MarshallingException("Could not get FileDescriptor value"))
      );
   }

   @Override
   public int hashCode() {
      return this.fd;
   }

   public FileDescriptor(int _fd) {
      this.fd = _fd;
   }

   public java.io.FileDescriptor toJavaFileDescriptor(ISocketProvider _provider) throws MarshallingException {
      if (_provider != null) {
         Optional<java.io.FileDescriptor> result = _provider.createFileDescriptor(this.fd);
         if (result.isPresent()) {
            return result.get();
         }
      }

      return ReflectionFileDescriptorHelper.getInstance()
         .flatMap(helper -> helper.createFileDescriptor(this.fd))
         .orElseThrow(() -> new MarshallingException("Could not create new FileDescriptor instance"));
   }

   public int getIntFileDescriptor() {
      return this.fd;
   }
}
