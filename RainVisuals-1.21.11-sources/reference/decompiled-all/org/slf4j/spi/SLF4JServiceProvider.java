package org.slf4j.spi;

import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;

// $VF: Compiled from SLF4JServiceProvider.java
public interface SLF4JServiceProvider {
   void initialize();

   String getRequestedApiVersion();

   IMarkerFactory getMarkerFactory();

   MDCAdapter getMDCAdapter();

   ILoggerFactory getLoggerFactory();
}
