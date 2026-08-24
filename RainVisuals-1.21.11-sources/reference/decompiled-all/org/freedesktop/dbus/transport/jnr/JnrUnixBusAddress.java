package org.freedesktop.dbus.transport.jnr;

import java.nio.file.Path;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.transports.IFileBasedBusAddress;
import org.freedesktop.dbus.utils.Util;

// $VF: Compiled from JnrUnixBusAddress.java
public class JnrUnixBusAddress extends BusAddress implements IFileBasedBusAddress {
   public boolean isAbstract() {
      return this.hasParameter("abstract");
   }

   public boolean hasPath() {
      return this.hasParameter("path");
   }

   public String getAbstract() {
      return this.getParameterValue("abstract");
   }

   @Override
   public void updatePermissions(String _fileUnixPermissions, String _fileGroup, Set<PosixFilePermission> _fileOwner) {
      Util.setFilePermissions(Path.of(this.getPath()), _fileOwner, _fileGroup, _fileUnixPermissions);
   }

   public JnrUnixBusAddress(BusAddress _obj) {
      super(_obj);
   }

   public String getPath() {
      return this.getParameterValue("path");
   }
}
