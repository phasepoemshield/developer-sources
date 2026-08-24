package org.zenith.config;

import org.zenith.module.Module;

import org.zenith.module.ModuleManager;

import org.zenith.module.Debug;
import org.zenith.module.ElytraHelper;
import org.zenith.module.Emotes;


public record CosmeticEntry(String string37, long long99, int int140) {

   public static final CosmeticEntry var15Var143 = new CosmeticEntry("", 0L, 0);

   public CosmeticEntry(String string37, long long99, int int140) {
      string37 = string37 == null ? "" : string37;
      if (long99 < 0L) {
         long99 = 0L;
      }

      if (int140 < 0) {
         int140 = 0;
      }

      this.string37 = string37;
      this.long99 = long99;
      this.int140 = int140;
   }

   public boolean Debug() {
      return !this.string37.isBlank();
   }

   public String ModuleManager() {
      return this.string37;
   }

   public long ElytraHelper() {
      return this.long99;
   }

   public int Emotes() {
      return this.int140;
   }
}
