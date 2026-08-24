package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.event.SubstituteLoggingEvent;

// $VF: Compiled from SubstituteLoggerFactory.java
public class SubstituteLoggerFactory implements ILoggerFactory {
   final Map<String, SubstituteLogger> loggers;
   volatile boolean postInitialization = false;
   final LinkedBlockingQueue<SubstituteLoggingEvent> eventQueue;

   public List<SubstituteLogger> getLoggers() {
      return new ArrayList<>(this.loggers.values());
   }

   public LinkedBlockingQueue<SubstituteLoggingEvent> getEventQueue() {
      return this.eventQueue;
   }

   @Override
   public synchronized Logger getLogger(String name) {
      SubstituteLogger logger = this.loggers.get(name);
      if (logger == null) {
         logger = new SubstituteLogger(name, this.eventQueue, this.postInitialization);
         this.loggers.put(name, logger);
      }

      return logger;
   }

   public void postInitialization() {
      this.postInitialization = true;
   }

   public void clear() {
      this.loggers.clear();
      this.eventQueue.clear();
   }

   public List<String> getLoggerNames() {
      return new ArrayList<>(this.loggers.keySet());
   }

   public SubstituteLoggerFactory() {
      this.loggers = new ConcurrentHashMap<>();
      this.eventQueue = new LinkedBlockingQueue<>();
   }
}
