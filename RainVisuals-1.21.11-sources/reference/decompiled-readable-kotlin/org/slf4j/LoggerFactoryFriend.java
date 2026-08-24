package org.slf4j;

// $VF: Compiled from LoggerFactoryFriend.java
public class LoggerFactoryFriend {
   public static void reset() {
      LoggerFactory.reset();
   }

   public static void setDetectLoggerNameMismatch(boolean enabled) {
      LoggerFactory.DETECT_LOGGER_NAME_MISMATCH = enabled;
   }
}
