package org.newsclub.net.unix;

// $VF: Compiled from AFSocketProtocol.java
public enum AFSocketProtocol {
   DEFAULT(0);

   private final int id;

   AFSocketProtocol(int id) {
      this.id = id;
   }

   int getId() {
      return this.id;
   }
}
