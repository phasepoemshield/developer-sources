package org.freedesktop.dbus.connections.shared;

// $VF: Compiled from IThreadPoolRetryHandler.java
@FunctionalInterface
public interface IThreadPoolRetryHandler {
   boolean handle(ExecutorNames var1, Exception var2);
}
