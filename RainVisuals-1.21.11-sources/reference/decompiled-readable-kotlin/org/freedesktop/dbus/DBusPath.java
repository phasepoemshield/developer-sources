package org.freedesktop.dbus;

import java.util.Objects;

// $VF: Compiled from DBusPath.java
public class DBusPath implements Comparable<DBusPath> {
   private String path;

   public String getPath() {
      return this.path;
   }

   @Override
   public boolean equals(Object _other) {
      return _other instanceof DBusPath dp && this.getPath() != null && this.getPath().equals(dp.getPath());
   }

   public int compareTo(DBusPath _that) {
      return this.getPath() != null && _that != null ? this.getPath().compareTo(_that.getPath()) : 0;
   }

   public DBusPath(String _path) {
      this.setPath(_path);
   }

   public void setPath(String _path) {
      this.path = _path;
   }

   @Override
   public int hashCode() {
      int prime = 31;
      int result = super.hashCode();
      return 31 * result + Objects.hash(this.path);
   }

   @Override
   public String toString() {
      return this.getPath();
   }
}
