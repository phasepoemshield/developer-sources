package org.freedesktop.dbus.handlers;

import org.freedesktop.dbus.interfaces.ObjectManager;

// $VF: Compiled from AbstractInterfacesAddedHandler.java
public abstract class AbstractInterfacesAddedHandler extends AbstractSignalHandlerBase<ObjectManager.InterfacesAdded> {
   @Override
   public final Class<ObjectManager.InterfacesAdded> getImplementationClass() {
      return ObjectManager.InterfacesAdded.class;
   }
}
