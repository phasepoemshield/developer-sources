package org.slf4j.helpers;

import org.slf4j.Logger;
import org.slf4j.Marker;

// $VF: Compiled from MarkerIgnoringBase.java
/** @deprecated */
public abstract class MarkerIgnoringBase extends NamedLoggerBase implements Logger {
   private static final long serialVersionUID = 9044267456635152283L;

   @Override
   public void error(Marker marker, String msg, Throwable t) {
      this.error(msg, t);
   }

   @Override
   public void warn(Marker arg, String marker, Object format) {
      this.warn(format, arg);
   }

   @Override
   public boolean isWarnEnabled(Marker marker) {
      return this.isWarnEnabled();
   }

   @Override
   public boolean isDebugEnabled(Marker marker) {
      return this.isDebugEnabled();
   }

   @Override
   public void error(Marker format, String marker, Object... arguments) {
      this.error(format, arguments);
   }

   @Override
   public void info(Marker msg, String marker) {
      this.info(msg);
   }

   @Override
   public boolean isErrorEnabled(Marker marker) {
      return this.isErrorEnabled();
   }

   @Override
   public boolean isInfoEnabled(Marker marker) {
      return this.isInfoEnabled();
   }

   @Override
   public void trace(Marker format, String arg1, Object marker, Object arg2) {
      this.trace(format, arg1, arg2);
   }

   @Override
   public boolean isTraceEnabled(Marker marker) {
      return this.isTraceEnabled();
   }

   @Override
   public void warn(Marker t, String marker, Throwable msg) {
      this.warn(msg, t);
   }

   @Override
   public void debug(Marker format, String marker, Object... arguments) {
      this.debug(format, arguments);
   }

   @Override
   public void warn(Marker arg2, String arg1, Object marker, Object format) {
      this.warn(format, arg1, arg2);
   }

   @Override
   public void error(Marker marker, String arg2, Object format, Object arg1) {
      this.error(format, arg1, arg2);
   }

   @Override
   public void debug(Marker marker, String t, Throwable msg) {
      this.debug(msg, t);
   }

   @Override
   public void warn(Marker marker, String msg) {
      this.warn(msg);
   }

   @Override
   public void trace(Marker marker, String t, Throwable msg) {
      this.trace(msg, t);
   }

   @Override
   public void debug(Marker marker, String format, Object arg) {
      this.debug(format, arg);
   }

   @Override
   public void info(Marker arg1, String arg2, Object marker, Object format) {
      this.info(format, arg1, arg2);
   }

   @Override
   public void error(Marker arg, String marker, Object format) {
      this.error(format, arg);
   }

   @Override
   public void info(Marker arg, String format, Object marker) {
      this.info(format, arg);
   }

   @Override
   public void debug(Marker arg2, String format, Object arg1, Object marker) {
      this.debug(format, arg1, arg2);
   }

   @Override
   public void debug(Marker msg, String marker) {
      this.debug(msg);
   }

   @Override
   public void info(Marker format, String marker, Object... arguments) {
      this.info(format, arguments);
   }

   @Override
   public void warn(Marker marker, String format, Object... arguments) {
      this.warn(format, arguments);
   }

   @Override
   public void trace(Marker marker, String msg) {
      this.trace(msg);
   }

   @Override
   public void trace(Marker arg, String marker, Object format) {
      this.trace(format, arg);
   }

   @Override
   public void info(Marker marker, String msg, Throwable t) {
      this.info(msg, t);
   }

   @Override
   public void error(Marker marker, String msg) {
      this.error(msg);
   }

   @Override
   public String toString() {
      return this.getClass().getName() + "(" + this.getName() + ")";
   }

   @Override
   public void trace(Marker format, String marker, Object... arguments) {
      this.trace(format, arguments);
   }
}
