package org.freedesktop.dbus.messages;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.types.UInt32;

// $VF: Compiled from MethodBase.java
public abstract class MethodBase extends Message {
   protected MethodBase(byte _methodCall, byte _flags, byte _endianness) throws DBusException {
      super(_endianness, _methodCall, _flags);
   }

   MethodBase() {
   }

   void appendFileDescriptors(List<Object> _args, Object... _hargs) {
      Objects.requireNonNull(_hargs);
      long totalFileDes = _args == null ? 0L : Arrays.stream(_args).filter(FileDescriptor.class::isInstance).count();
      if (totalFileDes > 0L) {
         _hargs.add(this.createHeaderArgs((byte)9, "u", new UInt32(totalFileDes)));
      }
   }
}
