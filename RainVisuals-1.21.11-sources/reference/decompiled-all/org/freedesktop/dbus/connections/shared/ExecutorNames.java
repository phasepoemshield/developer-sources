package org.freedesktop.dbus.connections.shared;

// $VF: Compiled from ExecutorNames.java
public enum ExecutorNames {
   SIGNAL("SignalExecutor"),
   METHODRETURN("MethodReturnExecutor"),
   ERROR("ErrorExecutor"),
   METHODCALL("MethodCallExecutor");

   private final String description;

   public String getDescription() {
      return this.description;
   }

   @Override
   public String toString() {
      return this.description;
   }

   ExecutorNames(String _name) {
      this.description = _name;
   }
}
