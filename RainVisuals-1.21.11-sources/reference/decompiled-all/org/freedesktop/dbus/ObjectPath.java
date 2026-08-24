package org.freedesktop.dbus;

import java.util.Objects;

// $VF: Compiled from ObjectPath.java
public class ObjectPath extends DBusPath {
   private String source;

   public void setSource(String _source) {
      this.source = _source;
   }

   @Override
   public boolean equals(Object _obj) {
      if (this == _obj) {
         return true;
      }

      if (!super.equals(_obj)) {
         return false;
      }

      if (this.getClass() != _obj.getClass()) {
         return false;
      }

      ObjectPath other = (ObjectPath)_obj;
      return Objects.equals(this.source, other.source);
   }

   @Override
   public int hashCode() {
      int prime = 31;
      int result = super.hashCode();
      return 31 * result + Objects.hash(this.source);
   }

   public String getSource() {
      return this.source;
   }

   public ObjectPath(String _source, String _path) {
      super(_path);
      this.source = _source;
   }
}
