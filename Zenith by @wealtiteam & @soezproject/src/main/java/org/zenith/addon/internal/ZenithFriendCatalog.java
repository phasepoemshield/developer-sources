package org.zenith.addon.internal;

import org.zenith.core.ItemServiceBase;
import org.zenith.core.MediaTrackInfo;

import org.zenith.addon.api.frontend.FriendCatalog;
import org.zenith.ZenithClient;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.FriendStore;















import java.util.List;

final class ZenithFriendCatalog implements FriendCatalog {
   ZenithFriendCatalog() {
   }

   @Override
   public List<String> friends() {
      FriendStore lilii1lililli1liil1iiiill1l = this.manager();
      return lilii1lililli1liil1iiiill1l != null && lilii1lililli1liil1iiiill1l.getItems() != null
         ? lilii1lililli1liil1iiiill1l.getItems()
            .stream()
            .filter(var0 -> var0 != null && !var0.isBlank())
            .map(String::trim)
            .distinct()
            .sorted(String.CASE_INSENSITIVE_ORDER)
            .toList()
         : List.of();
   }

   @Override
   public boolean isFriend(String var1) {
      FriendStore lilii1lililli1liil1iiiill1l = this.manager();
      String s = normalize(var1);
      return lilii1lililli1liil1iiiill1l != null && s != null && lilii1lililli1liil1iiiill1l.isFriend(s);
   }

   @Override
   public boolean add(String var1) {
      FriendStore lilii1lililli1liil1iiiill1l = this.manager();
      String s = normalize(var1);
      if (lilii1lililli1liil1iiiill1l != null && s != null && findLocal(lilii1lililli1liil1iiiill1l, s) == null) {
         lilii1lililli1liil1iiiill1l.add(s);
         lilii1lililli1liil1iiiill1l.save();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean remove(String var1) {
      FriendStore lilii1lililli1liil1iiiill1l = this.manager();
      String s = normalize(var1);
      if (lilii1lililli1liil1iiiill1l != null && s != null) {
         String s1 = findLocal(lilii1lililli1liil1iiiill1l, s);
         if (s1 == null) {
            return false;
         } else {
            lilii1lililli1liil1iiiill1l.ItemServiceBase(s1);
            lilii1lililli1liil1iiiill1l.save();
            return true;
         }
      } else {
         return false;
      }
   }

   public FriendStore manager() {
      return ZenithClient.on23().MediaTrackInfo();
   }

   public static String findLocal(FriendStore var0, String var1) {
      return var0.getItems() == null ? null : var0.getItems().stream().filter(var1x -> var1x != null && var1x.equalsIgnoreCase(var1)).findFirst().orElse(null);
   }

   public static String normalize(String var0) {
      if (var0 == null) {
         return null;
      } else {
         String s = var0.trim();
         return !s.isEmpty() && s.length() <= 64 ? s : null;
      }
   }
}
