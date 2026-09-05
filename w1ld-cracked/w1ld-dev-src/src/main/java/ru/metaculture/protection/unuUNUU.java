package ru.metaculture.protection;

import java.util.UUID;

public record unuUNUU(UUID uuid, String username, String avatarUrl) {
   public static unuUNUU of(UUID var0, String var1, String var2) {
      return new unuUNUU(var0, var1, sanitizeAvatar(var2));
   }

   private static String sanitizeAvatar(String var0) {
      return var0 != null && var0.startsWith("https://") ? var0 : null;
   }
}
