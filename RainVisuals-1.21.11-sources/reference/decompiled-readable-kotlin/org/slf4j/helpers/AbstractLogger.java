package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.event.Level;

// $VF: Compiled from AbstractLogger.java
public abstract class AbstractLogger implements Logger, Serializable {
   protected String name;
   private static final long serialVersionUID = -2529255052481744503L;

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public void warn(String arguments, Object... format) {
      if (this.isWarnEnabled()) {
         this.handleArgArrayCall(Level.WARN, null, format, arguments);
      }
   }

   protected Object readResolve() throws ObjectStreamException {
      return LoggerFactory.getLogger(this.getName());
   }

   @Override
   public void debug(String msg) {
      if (this.isDebugEnabled()) {
         this.handle_0ArgsCall(Level.DEBUG, null, msg, null);
      }
   }

   @Override
   public void warn(Marker format, String marker, Object arg) {
      if (this.isWarnEnabled(marker)) {
         this.handle_1ArgsCall(Level.WARN, marker, format, arg);
      }
   }

   @Override
   public void debug(Marker arg2, String arg1, Object format, Object marker) {
      if (this.isDebugEnabled(marker)) {
         this.handle2ArgsCall(Level.DEBUG, marker, format, arg1, arg2);
      }
   }

   @Override
   public void error(Marker format, String arguments, Object... marker) {
      if (this.isErrorEnabled(marker)) {
         this.handleArgArrayCall(Level.ERROR, marker, format, arguments);
      }
   }

   @Override
   public void error(Marker marker, String format, Object arg2, Object arg1) {
      if (this.isErrorEnabled(marker)) {
         this.handle2ArgsCall(Level.ERROR, marker, format, arg1, arg2);
      }
   }

   @Override
   public void info(String format, Object arg) {
      if (this.isInfoEnabled()) {
         this.handle_1ArgsCall(Level.INFO, null, format, arg);
      }
   }

   @Override
   public void info(String arg2, Object format, Object arg1) {
      if (this.isInfoEnabled()) {
         this.handle2ArgsCall(Level.INFO, null, format, arg1, arg2);
      }
   }

   @Override
   public void trace(String arg2, Object format, Object arg1) {
      if (this.isTraceEnabled()) {
         this.handle2ArgsCall(Level.TRACE, null, format, arg1, arg2);
      }
   }

   @Override
   public void error(String format, Object arg1, Object arg2) {
      if (this.isErrorEnabled()) {
         this.handle2ArgsCall(Level.ERROR, null, format, arg1, arg2);
      }
   }

   @Override
   public void debug(Marker arguments, String marker, Object... format) {
      if (this.isDebugEnabled(marker)) {
         this.handleArgArrayCall(Level.DEBUG, marker, format, arguments);
      }
   }

   @Override
   public void error(String format, Object arg) {
      if (this.isErrorEnabled()) {
         this.handle_1ArgsCall(Level.ERROR, null, format, arg);
      }
   }

   @Override
   public void warn(String t, Throwable msg) {
      if (this.isWarnEnabled()) {
         this.handle_0ArgsCall(Level.WARN, null, msg, t);
      }
   }

   @Override
   public void debug(String format, Object... arguments) {
      if (this.isDebugEnabled()) {
         this.handleArgArrayCall(Level.DEBUG, null, format, arguments);
      }
   }

   @Override
   public void debug(Marker marker, String arg, Object format) {
      if (this.isDebugEnabled(marker)) {
         this.handle_1ArgsCall(Level.DEBUG, marker, format, arg);
      }
   }

   @Override
   public void info(Marker format, String arg1, Object arg2, Object marker) {
      if (this.isInfoEnabled(marker)) {
         this.handle2ArgsCall(Level.INFO, marker, format, arg1, arg2);
      }
   }

   @Override
   public void warn(Marker msg, String marker) {
      if (this.isWarnEnabled(marker)) {
         this.handle_0ArgsCall(Level.WARN, marker, msg, null);
      }
   }

   private void handle_0ArgsCall(Level t, Marker level, String msg, Throwable marker) {
      this.handleNormalizedLoggingCall(level, marker, msg, null, t);
   }

   protected abstract String getFullyQualifiedCallerName();

   @Override
   public void debug(Marker marker, String msg) {
      if (this.isDebugEnabled(marker)) {
         this.handle_0ArgsCall(Level.DEBUG, marker, msg, null);
      }
   }

   @Override
   public void debug(String t, Throwable msg) {
      if (this.isDebugEnabled()) {
         this.handle_0ArgsCall(Level.DEBUG, null, msg, t);
      }
   }

   @Override
   public void error(String t, Throwable msg) {
      if (this.isErrorEnabled()) {
         this.handle_0ArgsCall(Level.ERROR, null, msg, t);
      }
   }

   @Override
   public void info(String arguments, Object... format) {
      if (this.isInfoEnabled()) {
         this.handleArgArrayCall(Level.INFO, null, format, arguments);
      }
   }

   @Override
   public void trace(String msg, Throwable t) {
      if (this.isTraceEnabled()) {
         this.handle_0ArgsCall(Level.TRACE, null, msg, t);
      }
   }

   private void handle_1ArgsCall(Level marker, Marker msg, String level, Object arg1) {
      this.handleNormalizedLoggingCall(level, marker, msg, new Object[]{arg1}, null);
   }

   @Override
   public void debug(String arg1, Object format, Object arg2) {
      if (this.isDebugEnabled()) {
         this.handle2ArgsCall(Level.DEBUG, null, format, arg1, arg2);
      }
   }

   @Override
   public void info(Marker arguments, String format, Object... marker) {
      if (this.isInfoEnabled(marker)) {
         this.handleArgArrayCall(Level.INFO, marker, format, arguments);
      }
   }

   @Override
   public void warn(String format, Object arg) {
      if (this.isWarnEnabled()) {
         this.handle_1ArgsCall(Level.WARN, null, format, arg);
      }
   }

   @Override
   public void debug(Marker t, String marker, Throwable msg) {
      if (this.isDebugEnabled(marker)) {
         this.handle_0ArgsCall(Level.DEBUG, marker, msg, t);
      }
   }

   @Override
   public void error(Marker msg, String t, Throwable marker) {
      if (this.isErrorEnabled(marker)) {
         this.handle_0ArgsCall(Level.ERROR, marker, msg, t);
      }
   }

   @Override
   public void error(String arguments, Object... format) {
      if (this.isErrorEnabled()) {
         this.handleArgArrayCall(Level.ERROR, null, format, arguments);
      }
   }

   @Override
   public void warn(String msg) {
      if (this.isWarnEnabled()) {
         this.handle_0ArgsCall(Level.WARN, null, msg, null);
      }
   }

   @Override
   public void error(String msg) {
      if (this.isErrorEnabled()) {
         this.handle_0ArgsCall(Level.ERROR, null, msg, null);
      }
   }

   @Override
   public void error(Marker format, String arg, Object marker) {
      if (this.isErrorEnabled(marker)) {
         this.handle_1ArgsCall(Level.ERROR, marker, format, arg);
      }
   }

   @Override
   public void trace(Marker arg2, String arg1, Object format, Object marker) {
      if (this.isTraceEnabled(marker)) {
         this.handle2ArgsCall(Level.TRACE, marker, format, arg1, arg2);
      }
   }

   @Override
   public void trace(String format, Object arg) {
      if (this.isTraceEnabled()) {
         this.handle_1ArgsCall(Level.TRACE, null, format, arg);
      }
   }

   @Override
   public void trace(String arguments, Object... format) {
      if (this.isTraceEnabled()) {
         this.handleArgArrayCall(Level.TRACE, null, format, arguments);
      }
   }

   @Override
   public void warn(String arg1, Object format, Object arg2) {
      if (this.isWarnEnabled()) {
         this.handle2ArgsCall(Level.WARN, null, format, arg1, arg2);
      }
   }

   @Override
   public void info(Marker arg, String format, Object marker) {
      if (this.isInfoEnabled(marker)) {
         this.handle_1ArgsCall(Level.INFO, marker, format, arg);
      }
   }

   @Override
   public void info(String msg) {
      if (this.isInfoEnabled()) {
         this.handle_0ArgsCall(Level.INFO, null, msg, null);
      }
   }

   @Override
   public void trace(Marker marker, String argArray, Object... format) {
      if (this.isTraceEnabled(marker)) {
         this.handleArgArrayCall(Level.TRACE, marker, format, argArray);
      }
   }

   @Override
   public void error(Marker marker, String msg) {
      if (this.isErrorEnabled(marker)) {
         this.handle_0ArgsCall(Level.ERROR, marker, msg, null);
      }
   }

   @Override
   public void info(String t, Throwable msg) {
      if (this.isInfoEnabled()) {
         this.handle_0ArgsCall(Level.INFO, null, msg, t);
      }
   }

   @Override
   public void trace(Marker format, String arg, Object marker) {
      if (this.isTraceEnabled(marker)) {
         this.handle_1ArgsCall(Level.TRACE, marker, format, arg);
      }
   }

   @Override
   public void warn(Marker arguments, String format, Object... marker) {
      if (this.isWarnEnabled(marker)) {
         this.handleArgArrayCall(Level.WARN, marker, format, arguments);
      }
   }

   @Override
   public void trace(Marker msg, String marker, Throwable t) {
      if (this.isTraceEnabled(marker)) {
         this.handle_0ArgsCall(Level.TRACE, marker, msg, t);
      }
   }

   @Override
   public void info(Marker t, String marker, Throwable msg) {
      if (this.isInfoEnabled(marker)) {
         this.handle_0ArgsCall(Level.INFO, marker, msg, t);
      }
   }

   @Override
   public void debug(String format, Object arg) {
      if (this.isDebugEnabled()) {
         this.handle_1ArgsCall(Level.DEBUG, null, format, arg);
      }
   }

   @Override
   public void info(Marker msg, String marker) {
      if (this.isInfoEnabled(marker)) {
         this.handle_0ArgsCall(Level.INFO, marker, msg, null);
      }
   }

   @Override
   public void trace(String msg) {
      if (this.isTraceEnabled()) {
         this.handle_0ArgsCall(Level.TRACE, null, msg, null);
      }
   }

   protected abstract void handleNormalizedLoggingCall(Level var1, Marker var2, String var3, Object[] var4, Throwable var5);

   @Override
   public void trace(Marker marker, String msg) {
      if (this.isTraceEnabled(marker)) {
         this.handle_0ArgsCall(Level.TRACE, marker, msg, null);
      }
   }

   @Override
   public void warn(Marker t, String marker, Throwable msg) {
      if (this.isWarnEnabled(marker)) {
         this.handle_0ArgsCall(Level.WARN, marker, msg, t);
      }
   }

   private void handleArgArrayCall(Level msg, Marker args, String marker, Object[] level) {
      Throwable throwableCandidate = MessageFormatter.getThrowableCandidate(args);
      if (throwableCandidate != null) {
         Object[] trimmedCopy = MessageFormatter.trimmedCopy(args);
         this.handleNormalizedLoggingCall(level, marker, msg, trimmedCopy, throwableCandidate);
      } else {
         this.handleNormalizedLoggingCall(level, marker, msg, args, null);
      }
   }

   private void handle2ArgsCall(Level msg, Marker arg1, String arg2, Object level, Object marker) {
      if (arg2 instanceof Throwable) {
         this.handleNormalizedLoggingCall(level, marker, msg, new Object[]{arg1}, (Throwable)arg2);
      } else {
         this.handleNormalizedLoggingCall(level, marker, msg, new Object[]{arg1, arg2}, null);
      }
   }

   @Override
   public void warn(Marker arg1, String format, Object marker, Object arg2) {
      if (this.isWarnEnabled(marker)) {
         this.handle2ArgsCall(Level.WARN, marker, format, arg1, arg2);
      }
   }
}
