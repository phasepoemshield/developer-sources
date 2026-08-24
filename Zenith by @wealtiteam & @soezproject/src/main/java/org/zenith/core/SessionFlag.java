package org.zenith.core;

import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.Event20;
import org.zenith.event.Event49;

public enum SessionFlag {
   Event49("User"),
   Event20("Admin"),
   Event09("Alpha");

   final String Event13;

   public String getName() {
      return this.Event13;
   }

   private SessionFlag(String var3) {
      this.Event13 = var3;
   }
}
