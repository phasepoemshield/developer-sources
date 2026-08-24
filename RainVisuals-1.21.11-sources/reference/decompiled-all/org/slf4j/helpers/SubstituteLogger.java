package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.EventRecordingLogger;
import org.slf4j.event.Level;
import org.slf4j.event.LoggingEvent;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.spi.LoggingEventBuilder;

// $VF: Compiled from SubstituteLogger.java
public class SubstituteLogger implements Logger {
   private EventRecordingLogger eventRecordingLogger;
   private Boolean delegateEventAware;
   private final Queue<SubstituteLoggingEvent> eventQueue;
   private final String name;
   public final boolean createdPostInitialization;
   private Method logMethodCache;
   private volatile Logger _delegate;

   @Override
   public LoggingEventBuilder atInfo() {
      return this.delegate().atInfo();
   }

   @Override
   public void trace(Marker arg, String marker, Object format) {
      this.delegate().trace(marker, format, arg);
   }

   @Override
   public void error(Marker marker, String arguments, Object... format) {
      this.delegate().error(marker, format, arguments);
   }

   @Override
   public void error(String format, Object... arguments) {
      this.delegate().error(format, arguments);
   }

   @Override
   public boolean isInfoEnabled(Marker marker) {
      return this.delegate().isInfoEnabled(marker);
   }

   @Override
   public LoggingEventBuilder atDebug() {
      return this.delegate().atDebug();
   }

   @Override
   public void info(String format, Object arg) {
      this.delegate().info(format, arg);
   }

   public boolean isDelegateNull() {
      return this._delegate == null;
   }

   @Override
   public boolean isErrorEnabled() {
      return this.delegate().isErrorEnabled();
   }

   @Override
   public LoggingEventBuilder makeLoggingEventBuilder(Level level) {
      return this.delegate().makeLoggingEventBuilder(level);
   }

   @Override
   public void info(Marker format, String marker, Object arg1, Object arg2) {
      this.delegate().info(marker, format, arg1, arg2);
   }

   @Override
   public void trace(Marker marker, String msg, Throwable t) {
      this.delegate().trace(marker, msg, t);
   }

   @Override
   public LoggingEventBuilder atWarn() {
      return this.delegate().atWarn();
   }

   @Override
   public LoggingEventBuilder atLevel(Level level) {
      return this.delegate().atLevel(level);
   }

   @Override
   public void warn(Marker marker, String msg) {
      this.delegate().warn(marker, msg);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         SubstituteLogger that = (SubstituteLogger)o;
         return this.name.equals(that.name);
      } else {
         return false;
      }
   }

   @Override
   public boolean isInfoEnabled() {
      return this.delegate().isInfoEnabled();
   }

   public void log(LoggingEvent event) {
      if (this.isDelegateEventAware()) {
         try {
            this.logMethodCache.invoke(this._delegate, event);
         } catch (IllegalAccessException var3) {
         } catch (IllegalArgumentException var4) {
         } catch (InvocationTargetException var5) {
         }
      }
   }

   @Override
   public int hashCode() {
      return this.name.hashCode();
   }

   @Override
   public void error(String msg) {
      this.delegate().error(msg);
   }

   @Override
   public boolean isTraceEnabled() {
      return this.delegate().isTraceEnabled();
   }

   @Override
   public void warn(Marker format, String marker, Object... arguments) {
      this.delegate().warn(marker, format, arguments);
   }

   public boolean isDelegateEventAware() {
      if (this.delegateEventAware != null) {
         return this.delegateEventAware;
      }

      try {
         this.logMethodCache = this._delegate.getClass().getMethod("log", LoggingEvent.class);
         this.delegateEventAware = Boolean.TRUE;
      } catch (NoSuchMethodException var2) {
         this.delegateEventAware = Boolean.FALSE;
      }

      return this.delegateEventAware;
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public boolean isWarnEnabled(Marker marker) {
      return this.delegate().isWarnEnabled(marker);
   }

   @Override
   public void error(String t, Throwable msg) {
      this.delegate().error(msg, t);
   }

   public void setDelegate(Logger delegate) {
      this._delegate = delegate;
   }

   @Override
   public void error(Marker marker, String msg) {
      this.delegate().error(marker, msg);
   }

   @Override
   public void warn(String t, Throwable msg) {
      this.delegate().warn(msg, t);
   }

   @Override
   public void debug(Marker msg, String marker) {
      this.delegate().debug(marker, msg);
   }

   @Override
   public void trace(String msg) {
      this.delegate().trace(msg);
   }

   @Override
   public boolean isDebugEnabled() {
      return this.delegate().isDebugEnabled();
   }

   @Override
   public void debug(Marker arg1, String marker, Object arg2, Object format) {
      this.delegate().debug(marker, format, arg1, arg2);
   }

   @Override
   public void warn(String format, Object... arguments) {
      this.delegate().warn(format, arguments);
   }

   @Override
   public void error(String arg1, Object arg2, Object format) {
      this.delegate().error(format, arg1, arg2);
   }

   @Override
   public void info(Marker msg, String marker, Throwable t) {
      this.delegate().info(marker, msg, t);
   }

   @Override
   public void debug(String format, Object... arguments) {
      this.delegate().debug(format, arguments);
   }

   @Override
   public void info(String msg) {
      this.delegate().info(msg);
   }

   @Override
   public boolean isTraceEnabled(Marker marker) {
      return this.delegate().isTraceEnabled(marker);
   }

   @Override
   public void debug(Marker marker, String arguments, Object... format) {
      this.delegate().debug(marker, format, arguments);
   }

   @Override
   public void debug(String msg) {
      this.delegate().debug(msg);
   }

   @Override
   public void warn(String msg) {
      this.delegate().warn(msg);
   }

   @Override
   public void error(String arg, Object format) {
      this.delegate().error(format, arg);
   }

   @Override
   public boolean isDebugEnabled(Marker marker) {
      return this.delegate().isDebugEnabled(marker);
   }

   @Override
   public void info(Marker format, String arg, Object marker) {
      this.delegate().info(marker, format, arg);
   }

   @Override
   public void debug(String msg, Throwable t) {
      this.delegate().debug(msg, t);
   }

   @Override
   public void info(Marker msg, String marker) {
      this.delegate().info(marker, msg);
   }

   private Logger getEventRecordingLogger() {
      if (this.eventRecordingLogger == null) {
         this.eventRecordingLogger = new EventRecordingLogger(this, this.eventQueue);
      }

      return this.eventRecordingLogger;
   }

   public Logger delegate() {
      if (this._delegate != null) {
         return this._delegate;
      } else {
         return this.createdPostInitialization ? NOPLogger.NOP_LOGGER : this.getEventRecordingLogger();
      }
   }

   @Override
   public LoggingEventBuilder atTrace() {
      return this.delegate().atTrace();
   }

   @Override
   public boolean isEnabledForLevel(Level level) {
      return this.delegate().isEnabledForLevel(level);
   }

   @Override
   public void trace(Marker msg, String marker) {
      this.delegate().trace(marker, msg);
   }

   @Override
   public void warn(Marker format, String marker, Object arg) {
      this.delegate().warn(marker, format, arg);
   }

   @Override
   public void debug(Marker t, String marker, Throwable msg) {
      this.delegate().debug(marker, msg, t);
   }

   @Override
   public LoggingEventBuilder atError() {
      return this.delegate().atError();
   }

   @Override
   public void trace(String format, Object... arguments) {
      this.delegate().trace(format, arguments);
   }

   public boolean isDelegateNOP() {
      return this._delegate instanceof NOPLogger;
   }

   @Override
   public void error(Marker format, String arg1, Object arg2, Object marker) {
      this.delegate().error(marker, format, arg1, arg2);
   }

   @Override
   public void info(String t, Throwable msg) {
      this.delegate().info(msg, t);
   }

   public SubstituteLogger(String eventQueue, Queue<SubstituteLoggingEvent> createdPostInitialization, boolean name) {
      this.name = name;
      this.eventQueue = eventQueue;
      this.createdPostInitialization = createdPostInitialization;
   }

   @Override
   public void warn(Marker format, String marker, Object arg2, Object arg1) {
      this.delegate().warn(marker, format, arg1, arg2);
   }

   @Override
   public void trace(Marker marker, String arg2, Object format, Object arg1) {
      this.delegate().trace(marker, format, arg1, arg2);
   }

   @Override
   public void error(Marker format, String arg, Object marker) {
      this.delegate().error(marker, format, arg);
   }

   @Override
   public void trace(String arg1, Object format, Object arg2) {
      this.delegate().trace(format, arg1, arg2);
   }

   @Override
   public void info(String arguments, Object... format) {
      this.delegate().info(format, arguments);
   }

   @Override
   public void info(String arg2, Object arg1, Object format) {
      this.delegate().info(format, arg1, arg2);
   }

   @Override
   public void debug(String arg2, Object arg1, Object format) {
      this.delegate().debug(format, arg1, arg2);
   }

   @Override
   public void trace(String arg, Object format) {
      this.delegate().trace(format, arg);
   }

   @Override
   public void error(Marker t, String marker, Throwable msg) {
      this.delegate().error(marker, msg, t);
   }

   @Override
   public void info(Marker format, String marker, Object... arguments) {
      this.delegate().info(marker, format, arguments);
   }

   @Override
   public void trace(String msg, Throwable t) {
      this.delegate().trace(msg, t);
   }

   @Override
   public boolean isErrorEnabled(Marker marker) {
      return this.delegate().isErrorEnabled(marker);
   }

   @Override
   public void debug(Marker format, String marker, Object arg) {
      this.delegate().debug(marker, format, arg);
   }

   @Override
   public void debug(String arg, Object format) {
      this.delegate().debug(format, arg);
   }

   @Override
   public void warn(String format, Object arg) {
      this.delegate().warn(format, arg);
   }

   @Override
   public boolean isWarnEnabled() {
      return this.delegate().isWarnEnabled();
   }

   @Override
   public void warn(String format, Object arg2, Object arg1) {
      this.delegate().warn(format, arg1, arg2);
   }

   @Override
   public void warn(Marker marker, String t, Throwable msg) {
      this.delegate().warn(marker, msg, t);
   }

   @Override
   public void trace(Marker marker, String format, Object... arguments) {
      this.delegate().trace(marker, format, arguments);
   }
}
