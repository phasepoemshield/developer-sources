package org.freedesktop.dbus.handlers;

import org.freedesktop.dbus.interfaces.ObjectManager;

// $VF: Compiled from AbstractInterfacesRemovedHandler.java
public abstract class AbstractInterfacesRemovedHandler extends AbstractSignalHandlerBase<ObjectManager.InterfacesRemoved> {
   @Override
   public final Class<ObjectManager.InterfacesRemoved> getImplementationClass() {
      return ObjectManager.InterfacesRemoved.class;
   }
}
