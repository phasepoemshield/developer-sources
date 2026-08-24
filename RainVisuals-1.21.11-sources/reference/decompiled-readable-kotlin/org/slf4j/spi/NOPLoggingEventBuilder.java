package org.slf4j.spi;

import java.util.function.Supplier;
import org.slf4j.Marker;

// $VF: Compiled from NOPLoggingEventBuilder.java
public class NOPLoggingEventBuilder implements LoggingEventBuilder {
   static final NOPLoggingEventBuilder SINGLETON = new NOPLoggingEventBuilder();

   @Override
   public void log() {
   }

   public static LoggingEventBuilder singleton() {
      return SINGLETON;
   }

   @Override
   public void log(Supplier<String> messageSupplier) {
   }

   @Override
   public LoggingEventBuilder addArgument(Object p) {
      return singleton();
   }

   @Override
   public LoggingEventBuilder setCause(Throwable cause) {
      return singleton();
   }

   @Override
   public void log(String message, Object... args) {
   }

   @Override
   public LoggingEventBuilder addKeyValue(String key, Object value) {
      return singleton();
   }

   private NOPLoggingEventBuilder() {
   }

   @Override
   public LoggingEventBuilder setMessage(String message) {
      return this;
   }

   @Override
   public LoggingEventBuilder setMessage(Supplier<String> messageSupplier) {
      return this;
   }

   @Override
   public void log(String arg, Object message) {
   }

   @Override
   public LoggingEventBuilder addArgument(Supplier<?> objectSupplier) {
      return singleton();
   }

   @Override
   public LoggingEventBuilder addMarker(Marker marker) {
      return singleton();
   }

   @Override
   public void log(String message) {
   }

   @Override
   public LoggingEventBuilder addKeyValue(String key, Supplier<Object> value) {
      return singleton();
   }

   @Override
   public void log(String message, Object arg0, Object arg1) {
   }
}
