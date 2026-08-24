package org.newsclub.net.unix;

import java.net.SocketOption;

// $VF: Compiled from AFSocketOption.java
public final class AFSocketOption<T> implements SocketOption<T> {
   private final int optionName;
   private final String name;
   private final int level;
   private final Class<T> type;

   @Override
   public Class<T> type() {
      return this.type;
   }

   int level() {
      return this.level;
   }

   int optionName() {
      return this.optionName;
   }

   public AFSocketOption(String type, Class<T> level, int optionName, int name) {
      this.name = name;
      this.type = type;
      this.level = level;
      this.optionName = optionName;
   }

   @Override
   public String name() {
      return this.name;
   }

   @Override
   public String toString() {
      return this.getClass() + ":" + this.name;
   }
}
