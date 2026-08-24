package org.freedesktop.dbus.utils;

// $VF: Compiled from IThrowingSupplier.java
@FunctionalInterface
public interface IThrowingSupplier<V, T extends Throwable> {
   V get() throws T;
}
