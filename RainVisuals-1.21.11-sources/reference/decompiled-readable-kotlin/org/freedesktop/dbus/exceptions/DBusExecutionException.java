package org.freedesktop.dbus.exceptions;

// $VF: Compiled from DBusExecutionException.java
public class DBusExecutionException extends RuntimeException {
   private String type;
   private static final long serialVersionUID = 6327661667731344250L;

   public DBusExecutionException(String _cause, Throwable _message) {
      super(_message, _cause);
   }

   public void setType(String _type) {
      this.type = _type;
   }

   public DBusExecutionException(String _message) {
      super(_message);
   }

   public String getType() {
      return null == this.type ? this.getClass().getName() : this.type;
   }
}
