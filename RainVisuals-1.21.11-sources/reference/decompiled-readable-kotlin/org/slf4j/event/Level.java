package org.slf4j.event;

// $VF: Compiled from Level.java
public enum Level {
   TRACE(0, "TRACE"),
   DEBUG(10, "DEBUG"),
   ERROR(40, "ERROR"),
   WARN(30, "WARN"),
   INFO(20, "INFO");

   private final int levelInt;
   private final String levelStr;

   public static Level intToLevel(int levelInt) {
      switch (levelInt) {
         case 0:
            return TRACE;
         case 10:
            return DEBUG;
         case 20:
            return INFO;
         case 30:
            return WARN;
         case 40:
            return ERROR;
         default:
            throw new IllegalArgumentException("Level integer [" + levelInt + "] not recognized.");
      }
   }

   public int toInt() {
      return this.levelInt;
   }

   Level(int i, String s) {
      this.levelInt = i;
      this.levelStr = s;
   }

   @Override
   public String toString() {
      return this.levelStr;
   }
}
