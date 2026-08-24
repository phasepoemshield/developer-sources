package org.slf4j.spi;

import org.slf4j.ILoggerFactory;

// $VF: Compiled from LoggerFactoryBinder.java
/** @deprecated */
public interface LoggerFactoryBinder {
   String getLoggerFactoryClassStr();

   ILoggerFactory getLoggerFactory();
}
