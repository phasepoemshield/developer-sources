package org.freedesktop.dbus;

import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from MethodTuple.java
public class MethodTuple {
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final String name;
   private final String sig;

   public String getName() {
      return this.name;
   }

   public MethodTuple(String _name, String _sig) {
      this.name = _name;
      if (null != _sig) {
         this.sig = _sig;
      } else {
         this.sig = "";
      }

      this.logger.trace("new MethodTuple({}, {})", this.name, this.sig);
   }

   @Override
   public boolean equals(Object _obj) {
      if (this == _obj) {
         return true;
      } else {
         return !(_obj instanceof MethodTuple other) ? false : Objects.equals(this.name, other.name) && Objects.equals(this.sig, other.sig);
      }
   }

   public String getSig() {
      return this.sig;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.sig);
   }

   public Logger getLogger() {
      return this.logger;
   }
}
