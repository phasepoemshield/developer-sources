package org.slf4j;

// $VF: Compiled from IMarkerFactory.java
public interface IMarkerFactory {
   boolean exists(String var1);

   boolean detachMarker(String var1);

   Marker getDetachedMarker(String var1);

   Marker getMarker(String var1);
}
