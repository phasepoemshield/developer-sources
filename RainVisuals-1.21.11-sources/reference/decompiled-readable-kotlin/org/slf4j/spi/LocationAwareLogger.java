package org.slf4j.spi;

import org.slf4j.Logger;
import org.slf4j.Marker;

// $VF: Compiled from LocationAwareLogger.java
public interface LocationAwareLogger extends Logger {
   int WARN_INT = 30;
   int INFO_INT = 20;
   int DEBUG_INT = 10;
   int TRACE_INT = 0;
   int ERROR_INT = 40;

   void log(Marker var1, String var2, int var3, String var4, Object[] var5, Throwable var6);
}
