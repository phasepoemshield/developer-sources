package org.slf4j.spi;

import org.slf4j.IMarkerFactory;

// $VF: Compiled from MarkerFactoryBinder.java
/** @deprecated */
public interface MarkerFactoryBinder {
   IMarkerFactory getMarkerFactory();

   String getMarkerFactoryClassStr();
}
