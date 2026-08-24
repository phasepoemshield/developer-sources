package org.slf4j.event;

import java.util.List;
import org.slf4j.Marker;

// $VF: Compiled from LoggingEvent.java
public interface LoggingEvent {
   List<KeyValuePair> getKeyValuePairs();

   long getTimeStamp();

   String getThreadName();

   String getMessage();

   default String getCallerBoundary() {
      return null;
   }

   Level getLevel();

   List<Marker> getMarkers();

   List<Object> getArguments();

   Object[] getArgumentArray();

   Throwable getThrowable();

   String getLoggerName();
}
