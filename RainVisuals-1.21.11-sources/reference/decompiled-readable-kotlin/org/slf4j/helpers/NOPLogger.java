package org.slf4j.helpers;

import org.slf4j.Logger;
import org.slf4j.Marker;

// $VF: Compiled from NOPLogger.java
public class NOPLogger extends NamedLoggerBase implements Logger {
   public static final NOPLogger NOP_LOGGER = new NOPLogger();
   private static final long serialVersionUID = -517220405410904473L;

   @Override
   public final void warn(String format, Object arg1) {
   }

   @Override
   public final boolean isDebugEnabled() {
      return false;
   }

   @Override
   public final void info(String format, Object... argArray) {
   }

   @Override
   public final void warn(String argArray, Object... format) {
   }

   @Override
   public final boolean isInfoEnabled() {
      return false;
   }

   @Override
   public final void trace(String arg2, Object arg1, Object format) {
   }

   @Override
   public final void error(String arg2, Object arg1, Object format) {
   }

   @Override
   public final void warn(String arg1, Object format, Object arg2) {
   }

   @Override
   public final void debug(String arg1, Object arg2, Object format) {
   }

   @Override
   public final void debug(Marker arg2, String arg1, Object marker, Object format) {
   }

   @Override
   public final void info(String arg1, Object arg2, Object format) {
   }

   @Override
   public final void debug(String msg, Throwable t) {
   }

   @Override
   public final void warn(Marker arg1, String format, Object marker, Object arg2) {
   }

   @Override
   public final void debug(String format, Object arg) {
   }

   @Override
   public final void info(Marker marker, String msg) {
   }

   @Override
   public final void trace(String format, Object... argArray) {
   }

   @Override
   public final boolean isErrorEnabled(Marker marker) {
      return false;
   }

   @Override
   public final void trace(Marker marker, String argArray, Object... format) {
   }

   @Override
   public final void trace(String t, Throwable msg) {
   }

   @Override
   public final void trace(Marker arg, String format, Object marker) {
   }

   @Override
   public final void warn(String msg) {
   }

   @Override
   public final void info(Marker arg, String marker, Object format) {
   }

   @Override
   public final void trace(Marker msg, String marker) {
   }

   @Override
   public final void warn(Marker msg, String marker) {
   }

   @Override
   public boolean isInfoEnabled(Marker marker) {
      return false;
   }

   @Override
   public final void trace(Marker marker, String msg, Throwable t) {
   }

   @Override
   public final void error(String format, Object... argArray) {
   }

   @Override
   public final void info(String msg) {
   }

   @Override
   public final void info(String t, Throwable msg) {
   }

   @Override
   public final void trace(String msg) {
   }

   @Override
   public final void debug(Marker marker, String arguments, Object... format) {
   }

   @Override
   public final void warn(Marker marker, String arg, Object format) {
   }

   @Override
   public final void info(Marker marker, String t, Throwable msg) {
   }

   @Override
   public final void debug(Marker format, String arg, Object marker) {
   }

   @Override
   public final void error(Marker marker, String format, Object arg2, Object arg1) {
   }

   @Override
   public final void debug(Marker marker, String msg, Throwable t) {
   }

   @Override
   public final boolean isDebugEnabled(Marker marker) {
      return false;
   }

   @Override
   public final void error(String t, Throwable msg) {
   }

   @Override
   public final void error(Marker marker, String format, Object... arguments) {
   }

   @Override
   public final void trace(Marker arg2, String format, Object marker, Object arg1) {
   }

   protected NOPLogger() {
   }

   @Override
   public final void info(Marker marker, String arguments, Object... format) {
   }

   @Override
   public final void error(String msg) {
   }

   @Override
   public final void info(String format, Object arg1) {
   }

   @Override
   public final void warn(Marker marker, String arguments, Object... format) {
   }

   @Override
   public final void error(Marker msg, String marker) {
   }

   @Override
   public final void error(String arg1, Object format) {
   }

   @Override
   public final void debug(Marker msg, String marker) {
   }

   @Override
   public final boolean isErrorEnabled() {
      return false;
   }

   @Override
   public final void error(Marker format, String marker, Object arg) {
   }

   @Override
   public final void warn(Marker marker, String t, Throwable msg) {
   }

   @Override
   public final void info(Marker format, String arg1, Object marker, Object arg2) {
   }

   @Override
   public final void error(Marker t, String marker, Throwable msg) {
   }

   @Override
   public String getName() {
      return "NOP";
   }

   @Override
   public final boolean isWarnEnabled() {
      return false;
   }

   @Override
   public final void debug(String msg) {
   }

   @Override
   public final void trace(String format, Object arg) {
   }

   @Override
   public final boolean isWarnEnabled(Marker marker) {
      return false;
   }

   @Override
   public final void warn(String msg, Throwable t) {
   }

   @Override
   public final boolean isTraceEnabled(Marker marker) {
      return false;
   }

   @Override
   public final void debug(String argArray, Object... format) {
   }

   @Override
   public final boolean isTraceEnabled() {
      return false;
   }
}
