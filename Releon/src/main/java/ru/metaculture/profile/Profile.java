package ru.metaculture.profile;

import net.minecraft.client.MinecraftClient;

public final class Profile {
   private Profile() {
   }

   public static String getUsername() {
      MinecraftClient mc = MinecraftClient.getInstance();
      return mc != null && mc.getSession() != null ? mc.getSession().getUsername() : "Unknown";
   }

   public static long getUid() {
      return Math.abs(getUsername().hashCode());
   }

   public static Role getRole() {
      return Role.USER;
   }

   public static String getAvatarUrl() {
      return "";
   }
}
