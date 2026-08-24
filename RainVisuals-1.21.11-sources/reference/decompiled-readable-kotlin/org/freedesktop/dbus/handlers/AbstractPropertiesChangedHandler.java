package org.freedesktop.dbus.handlers;

import org.freedesktop.dbus.interfaces.Properties;

// $VF: Compiled from AbstractPropertiesChangedHandler.java
public abstract class AbstractPropertiesChangedHandler extends AbstractSignalHandlerBase<Properties.PropertiesChanged> {
   @Override
   public final Class<Properties.PropertiesChanged> getImplementationClass() {
      return Properties.PropertiesChanged.class;
   }
}
