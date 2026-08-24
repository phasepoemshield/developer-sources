package org.freedesktop.dbus.connections.transports;

import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

// $VF: Compiled from IFileBasedBusAddress.java
public interface IFileBasedBusAddress {
   void updatePermissions(String var1, String var2, Set<PosixFilePermission> var3);
}
