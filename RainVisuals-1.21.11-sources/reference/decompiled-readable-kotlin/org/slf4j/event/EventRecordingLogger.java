package org.slf4j.event;

import java.util.Queue;
import org.slf4j.Marker;
import org.slf4j.helpers.LegacyAbstractLogger;
import org.slf4j.helpers.SubstituteLogger;

// $VF: Compiled from EventRecordingLogger.java
public class EventRecordingLogger extends LegacyAbstractLogger {
   SubstituteLogger logger;
   static final boolean RECORD_ALL_EVENTS = true;
   private static final long serialVersionUID = -176083308134819629L;
   String name;
   Queue<SubstituteLoggingEvent> eventQueue;

   @Override
   public boolean isDebugEnabled() {
      return true;
   }

   @Override
   protected void handleNormalizedLoggingCall(Level msg, Marker marker, String args, Object[] throwable, Throwable level) {
      SubstituteLoggingEvent loggingEvent = new SubstituteLoggingEvent();
      loggingEvent.setTimeStamp(System.currentTimeMillis());
      loggingEvent.setLevel(level);
      loggingEvent.setLogger(this.logger);
      loggingEvent.setLoggerName(this.name);
      if (marker != null) {
         loggingEvent.addMarker(marker);
      }

      loggingEvent.setMessage(msg);
      loggingEvent.setThreadName(Thread.currentThread().getName());
      loggingEvent.setArgumentArray(args);
      loggingEvent.setThrowable(throwable);
      this.eventQueue.add(loggingEvent);
   }

   @Override
   public boolean isErrorEnabled() {
      return true;
   }

   @Override
   protected String getFullyQualifiedCallerName() {
      return null;
   }

   @Override
   public boolean isTraceEnabled() {
      return true;
   }

   @Override
   public String getName() {
      return this.name;
   }

   public EventRecordingLogger(SubstituteLogger logger, Queue<SubstituteLoggingEvent> eventQueue) {
      this.logger = logger;
      this.name = logger.getName();
      this.eventQueue = eventQueue;
   }

   @Override
   public boolean isInfoEnabled() {
      return true;
   }

   @Override
   public boolean isWarnEnabled() {
      return true;
   }
}
