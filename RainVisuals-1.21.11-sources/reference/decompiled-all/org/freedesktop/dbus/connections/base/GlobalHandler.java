package org.freedesktop.dbus.connections.base;

import org.freedesktop.dbus.errors.UnknownObject;
import org.freedesktop.dbus.interfaces.Introspectable;
import org.freedesktop.dbus.interfaces.Peer;
import org.freedesktop.dbus.messages.ExportedObject;

// $VF: Compiled from GlobalHandler.java
public class GlobalHandler implements Peer, Introspectable {
   private final String objectpath;
   private final AbstractConnectionBase connection;

   @Override
   public String Introspect() {
      String intro = this.connection.getObjectTree().Introspect(this.objectpath);
      if (null == intro) {
         ExportedObject eo = this.connection.getFallbackContainer().get(this.objectpath);
         if (null != eo) {
            intro = eo.getIntrospectiondata();
         }
      }

      if (null == intro) {
         throw new UnknownObject("Introspecting on non-existant object");
      } else {
         return "<!DOCTYPE node PUBLIC \"-//freedesktop//DTD D-BUS Object Introspection 1.0//EN\" \"http://www.freedesktop.org/standards/dbus/1.0/introspect.dtd\">\n"
            + intro;
      }
   }

   @Override
   public void Ping() {
   }

   @Override
   public String getObjectPath() {
      return this.objectpath;
   }

   GlobalHandler(AbstractConnectionBase _objectpath, String _abstractConnection) {
      this.connection = _abstractConnection;
      this.objectpath = _objectpath;
   }

   @Override
   public boolean isRemote() {
      return false;
   }

   GlobalHandler(AbstractConnectionBase _abstractConnection) {
      this.connection = _abstractConnection;
      this.objectpath = null;
   }

   @Override
   public String GetMachineId() {
      return this.connection.getMachineId();
   }
}
