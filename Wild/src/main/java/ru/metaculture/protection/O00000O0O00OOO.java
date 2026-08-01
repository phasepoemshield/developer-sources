package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.ReadableScoreboardScore;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;

final class O00000O0O00OOO {
   private static final MinecraftClient O00000000 = MinecraftClient.getInstance();
   static final O0000O000O0O00 O000000000 = new O0000O000O0O00(0.014F, 0.74F, 0.001F, 0.001F);
   static final O0000O000O0O00 O0000000000 = new O0000O000O0O00(0.012F, 0.8F, 0.001F, 0.001F);
   static final O0000O000O0O00 O00000000000 = new O0000O000O0O00(0.082F, 0.56F, 0.001F, 0.001F);
   static final O0000O000O0O00 O000000000000 = new O0000O000O0O00(0.066F, 0.7F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O0000000000000 = new O0000O000O0O00(0.072F, 0.62F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O000000000000O = new O0000O000O0O00(0.096F, 0.78F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O00000000000O = new O0000O000O0O00(0.028F, 0.92F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O00000000000O0 = new O0000O000O0O00(0.11F, 0.7F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O00000000000OO = new O0000O000O0O00(0.062F, 0.76F, 0.001F, 0.001F);
   private static final O0000O000O0O00 O0000000000O = new O0000O000O0O00(0.058F, 0.78F, 0.001F, 0.001F);
   private static final float O0000000000O0 = 96.0F;
   private static final float O0000000000O00 = 0.85F;
   private static final float O0000000000O0O = 1.35F;
   private static final float O0000000000OO = 11.5F;
   private static final float O0000000000OO0 = 29.0F;
   private static final float O0000000000OOO = 7.0F;
   private static final float O000000000O = 8.0F;
   private static final float O000000000O0 = 5.5F;
   private static final float O000000000O00 = 11.0F;
   private static final float O000000000O000 = 22.0F;
   private static final float O000000000O00O = 8.0F;
   private static final float O000000000O0O = 10.0F;
   private static final float O000000000O0O0 = 16.0F;
   private static final float O000000000O0OO = 7.0F;
   private static final float O000000000OO = 14.8F;
   private static final float O000000000OO0 = 11.2F;
   private static final float O000000000OO00 = 12.8F;
   private static final float O000000000OO0O = 9.4F;
   private static final float O000000000OOO = 3.6F;
   private static final float O000000000OOO0 = 5.0F;
   private static final float O000000000OOOO = 16.0F;
   private static final float O00000000O = 4.0F;
   private static final float O00000000O0 = 6.0F;
   private static final float O00000000O00 = 22.0F;
   private static final float O00000000O000 = 7.2F;
   private static final float O00000000O0000 = 92.0F;
   private static final float O00000000O000O = 340.0F;
   private static final float O00000000O00O = 4.0F;
   private static final float O00000000O00O0 = 1.35F;
   private static final float O00000000O00OO = 14.0F;
   private static final float O00000000O0O = 0.085F;
   private static final float O00000000O0O0 = 4.0F;
   private static final float O00000000O0O00 = 1.32F;
   private static final long O00000000O0O0O = 480L;
   private final Map<UUID, O00000O0O00OOO.W173> O00000000O0OO = new HashMap<>();

   void O00000000() {
      this.O00000000O0OO.clear();
   }

   void O00000000(O0000000O00O o0000000O00O, NameTags o00000O0O0O) {
      if (O00000000.world != null && O00000000.player != null && !(O00000000.currentScreen instanceof InventoryScreen)) {
         RenderManager var3 = o0000000O00O.O00000000000();
         O00000O0O00OOO.W172 var4 = this.O000000000();
         long var5 = System.currentTimeMillis();
         float var7 = O00000000.getRenderTickCounter().getTickProgress(true);
         HashSet var8 = new HashSet();

         for (PlayerEntity var10 : O00000000.world.getPlayers()) {
            if (this.O00000000(var10, o00000O0O0O)) {
               O00000O0O00OOO.W174 var11 = this.O00000000(var10, var7, o0000000O00O.O0000000000000(), o0000000O00O.O000000000000O());
               O00000O0O00OOO.W173 var12 = this.O00000000O0OO.get(var10.getUuid());
               if (var11 != null) {
                  if (var12 == null) {
                     var12 = this.O00000000O0OO.computeIfAbsent(var10.getUuid(), O00000O0O00OOO.W173::new);
                  }

                  this.O00000000(var12, var10, var11, o00000O0O0O, var5);
                  var8.add(var10.getUuid());
               } else if (var12 != null) {
                  this.O00000000(var12, var10, o00000O0O0O, var5);
                  var8.add(var10.getUuid());
               }
            }
         }

         for (Entry var15 : this.O00000000O0OO.entrySet()) {
            if (!var8.contains(var15.getKey())) {
               ((O00000O0O00OOO.W173)var15.getValue()).O00000000();
            }
         }

         ArrayList var14 = new ArrayList(this.O00000000O0OO.size());

         for (O00000O0O00OOO.W173 var18 : this.O00000000O0OO.values()) {
            O00000O0O00OOO.W175 var20 = this.O00000000(var18, o00000O0O0O, var5);
            if (var20 != null) {
               var14.add(var20);
            }
         }

         var3.O00000000(this.O00000000(var14.size()));
         var14.sort(Comparator.comparingDouble(O00000O0O00OOO.W175::distance).reversed());
         ArrayList var17 = new ArrayList(var14.size());

         for (O00000O0O00OOO.W175 var21 : (List<O00000O0O00OOO.W175>)var14) {
            this.O00000000(var3, var4, var21, var5);
            if (var21.itemReveal > 0.04F && !var21.state.O00000000O0O0.isEmpty()) {
               this.O0000000000(var3, var4, var21);
               var17.add(var21);
            }
         }

         this.O00000000(var3, var17);
         this.O00000000O0OO.entrySet().removeIf(entry -> entry.getValue().O00000000(var5));
      } else {
         this.O00000000();
      }
   }

   private void O00000000(O00000O0O00OOO.W173 o0000000000000, PlayerEntity playerEntity, O00000O0O00OOO.W174 o000000000000O, NameTags o00000O0O0O, long l) {
      boolean var7 = o0000000000000.O0000000000OO0;
      boolean var8 = o0000000000000.O0000000000OOO;
      o0000000000000.O0000000000OO0 = true;
      o0000000000000.O0000000000OOO = true;
      if (!var7 || !var8 && l - o0000000000000.O000000000O0O0 > 480L) {
         o0000000000000.O000000000O0O = l;
      }

      o0000000000000.O000000000O0O0 = l;
      if (!this.O000000000(o0000000000000, playerEntity, o00000O0O0O, l)) {
         o0000000000000.O0000000000OO0 = false;
         o0000000000000.O0000000000OOO = false;
      } else {
         o0000000000000.O0000000000O0O = o000000000000O;
         o0000000000000.O000000000O = this.O000000000(playerEntity, o00000O0O0O);
         o0000000000000.O000000000O0 = o0000000000000.O000000000O;
         o0000000000000.O000000000O00 = !o0000000000000.O00000000O0O0.isEmpty()
            && (o0000000000000.O000000000O || o0000000000000.O000000000OO0 <= o00000O0O0O.O000000000OO0O.O0000000000());
         o0000000000000.O000000000O00O = l;
         if (!o0000000000000.O0000000000OO) {
            o0000000000000.O0000000000.O00000000(0.0F);
            o0000000000000.O00000000000.O00000000(0.0F);
            o0000000000000.O000000000000.O00000000(0.0F);
            o0000000000000.O0000000000000.O00000000(0.0F);
            o0000000000000.O000000000000O.O00000000(o0000000000000.O000000000OO0O);
            o0000000000000.O00000000000O.O00000000(o0000000000000.O000000000OOO0);
            o0000000000000.O00000000000O0.O00000000(o0000000000000.O000000000OO00);
            o0000000000000.O00000000000OO.O00000000(o0000000000000.O000000000OO00);
            o0000000000000.O0000000000O.O00000000(0.0F);
            o0000000000000.O0000000000O0.O00000000(0.0F);
            o0000000000000.O0000000000O00.O00000000(0.0F);
            o0000000000000.O0000000000OO = true;
         }
      }
   }

   private void O00000000(O00000O0O00OOO.W173 o0000000000000, PlayerEntity playerEntity, NameTags o00000O0O0O, long l) {
      o0000000000000.O0000000000OO0 = true;
      o0000000000000.O0000000000OOO = false;
      if (!this.O000000000(o0000000000000, playerEntity, o00000O0O0O, l)) {
         o0000000000000.O0000000000OO0 = false;
      } else {
         o0000000000000.O000000000O00O = l;
         o0000000000000.O000000000O = false;
         o0000000000000.O000000000O0 = o0000000000000.O000000000O0 && o0000000000000.O000000000000.O00000000() > 0.08F;
         o0000000000000.O000000000O00 = o0000000000000.O000000000O00 && o0000000000000.O0000000000000.O00000000() > 0.08F;
      }
   }

   private boolean O000000000(O00000O0O00OOO.W173 o0000000000000, PlayerEntity playerEntity, NameTags o00000O0O0O, long l) {
      String var6 = this.O00000000(playerEntity.getGameProfile() != null ? playerEntity.getGameProfile().getName() : playerEntity.getName().getString());
      if (var6.isEmpty()) {
         return false;
      } else {
         o0000000000000.O00000000O0000 = ProtectInfo.O0000000000(var6);
         o0000000000000.O000000000O000 = FriendCommand.O00000000(var6);
         o0000000000000.O00000000O000O = TargetHud.O00000000(playerEntity);
         o0000000000000.O00000000O00O = TargetHud.O00000000(playerEntity, 16734824, 255) & 16777215;
         o0000000000000.O000000000OO0 = O00000000.player == null ? Float.MAX_VALUE : playerEntity.distanceTo(O00000000.player);
         o0000000000000.O00000000O0O0 = this.O0000000000(playerEntity, o00000O0O0O);
         o0000000000000.O00000000O0O00 = this.O00000000000(playerEntity, o00000O0O0O);
         o0000000000000.O00000000O00OO = this.O00000000(o0000000000000);
         o0000000000000.O00000000O0O = this.O00000000(playerEntity, o0000000000000);
         float var7 = this.O00000000(playerEntity);
         o0000000000000.O00000000O00O0 = this.O00000000(var7);
         float var8 = Math.max(1.0F, playerEntity.getMaxHealth());
         float var9 = this.O000000000(var7 / var8);
         if (o0000000000000.O0000000000OO && var9 + 0.004F < o0000000000000.O000000000OO00) {
            o0000000000000.O000000000O0OO = l;
         }

         o0000000000000.O000000000OO00 = var9;
         int var10 = this.O0000000000(o0000000000000);
         if (var10 != o0000000000000.O000000000OO) {
            this.O000000000(o0000000000000);
            o0000000000000.O000000000OO = var10;
         }

         return true;
      }
   }

   private O00000O0O00OOO.W175 O00000000(O00000O0O00OOO.W173 o0000000000000, NameTags o00000O0O0O, long l) {
      if (!o0000000000000.O0000000000OO) {
         return null;
      } else {
         float var5 = o0000000000000.O0000000000.O00000000(o0000000000000.O0000000000OO0 ? 1.0F : 0.0F, O000000000);
         float var6 = o0000000000000.O00000000000.O00000000(o0000000000000.O0000000000OO0 ? 1.0F : 0.0F, O0000000000);
         float var7 = o0000000000000.O00000000000O0.O00000000(o0000000000000.O000000000OO00, O000000000000O);
         float var8 = o0000000000000.O00000000000OO.O00000000();
         if (o0000000000000.O000000000OO00 >= var8) {
            o0000000000000.O00000000000OO.O00000000(o0000000000000.O000000000OO00);
            var8 = o0000000000000.O000000000OO00;
         } else {
            var8 = o0000000000000.O00000000000OO.O00000000(o0000000000000.O000000000OO00, O00000000000O);
         }

         float var9 = o0000000000000.O0000000000O0.O00000000(0.0F, O00000000000OO);
         if (o0000000000000.O0000000000OOO && o0000000000000.O0000000000O0O != null) {
            float var10 = o0000000000000.O000000000000.O00000000(o0000000000000.O000000000O0 ? 1.0F : 0.0F, O00000000000);
            float var11 = o0000000000000.O0000000000000.O00000000(o0000000000000.O000000000O00 ? 1.0F : 0.0F, O000000000000);
            float var12 = o0000000000000.O0000000000O.O00000000(o0000000000000.O000000000O ? 1.0F : 0.0F, O00000000000O0);
            float var13 = this.O00000000000(o0000000000000.O000000000OO0O, o0000000000000.O000000000OOO, var10);
            float var14 = this.O00000000000(o0000000000000.O000000000OOO0, o0000000000000.O000000000OOOO, var10);
            float var15 = o0000000000000.O000000000000O.O00000000(var13, O0000000000000);
            float var16 = o0000000000000.O00000000000O.O00000000(var14, O0000000000000);
            float var17 = this.O00000000(
               o0000000000000.O0000000000O0O.distance(), o0000000000000.O0000000000O0O.projectedHeight(), o00000O0O0O.O000000000OO00.O0000000000()
            );
            float var18 = var15 * var17;
            float var19 = var16 * var17;
            float var20 = this.O00000000(o0000000000000, var11, var17);
            float var21 = (1.0F - this.O0000000000(0.1F, 0.95F, var5)) * 5.0F * var17;
            float var22 = this.O0000000000(o0000000000000.O0000000000O0O.screenX() - var18 * 0.5F);
            float var23 = this.O0000000000(o0000000000000.O0000000000O0O.screenY() - var19 - 8.0F * var17 - var21);
            float var24 = this.O0000000000(0.02F, 0.94F, var5);
            float var25 = this.O000000000(o00000O0O0O.O00000000O00O0.O0000000000() * (0.14F + 0.86F * var24));
            if (var25 <= 0.01F) {
               return null;
            } else {
               float var26 = this.O00000000(var7, l, o0000000000000.O000000000);
               float var27 = this.O00000000(l - o0000000000000.O000000000O0O, 720L);
               float var28 = this.O00000000(l - o0000000000000.O000000000O0OO, 360L);
               float var29 = Math.max(var27, var28);
               var9 = o0000000000000.O0000000000O0.O00000000(var29, O00000000000OO);
               boolean var30 = var5 < 0.985F || var9 > 0.04F || o0000000000000.O000000000O0O >= l - 760L || var12 > 0.04F;
               return new O00000O0O00OOO.W175(
                  o0000000000000, var22, var23, var18, var19, var17, var20, var25, var5, var6, var10, var11, var12, var7, var8, var26, var9, var30
               );
            }
         } else {
            return null;
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O, long l) {
      float var6 = this.O00000000(o00000000000O);
      if (o00000000000O.shader) {
         this.O00000000(o0000O00OO0O0, o000000000000, o00000000000O);
         RenderManager.W384 var7 = o0000O00OO0O0.O000000000(o00000000000O.x, o00000000000O.y, o00000000000O.width, o00000000000O.height);
         if (var7 != null) {
            try {
               this.O00000000(o0000O00OO0O0, o000000000000, o00000000000O, 0.0F, 0.0F, O00000O0O00OOO.W168.GHOST);
            } finally {
               o0000O00OO0O0.O00000000(var7);
            }

            o0000O00OO0O0.O00000000(
               var7,
               o00000000000O.x,
               o00000000000O.y,
               o00000000000O.width,
               o00000000000O.height,
               11.5F * o00000000000O.scale,
               this.O00000000(o000000000000.shellTop, o00000000000O.alpha * 0.8F),
               this.O00000000(this.O00000000(o000000000000, o00000000000O), o00000000000O.alpha * (0.02F + o00000000000O.focus * 0.07F)),
               this.O00000000(
                  this.O000000000(o000000000000, o00000000000O), o00000000000O.alpha * (0.38F + o00000000000O.focus * 0.2F + o00000000000O.threat * 0.16F)
               ),
               this.O00000000(
                  this.O0000000000(o000000000000, o00000000000O), o00000000000O.alpha * (0.34F + o00000000000O.focus * 0.18F + o00000000000O.threat * 0.14F)
               ),
               o00000000000O.appear,
               var6,
               this.O00000000(l),
               o00000000000O.focus,
               o00000000000O.threat,
               o00000000000O.exposure
            );
            this.O00000000(o0000O00OO0O0, o000000000000, o00000000000O, o00000000000O.x, o00000000000O.y, O00000O0O00OOO.W168.OVERLAY);
            return;
         }
      }

      this.O000000000(o0000O00OO0O0, o000000000000, o00000000000O);
      this.O00000000(o0000O00OO0O0, o000000000000, o00000000000O, o00000000000O.x, o00000000000O.y, O00000O0O00OOO.W168.DIRECT);
   }

   private void O00000000(RenderManager o0000O00OO0O0, O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      float var4 = 11.5F * o00000000000O.scale;
      float var5 = this.O00000000(o00000000000O);
      o0000O00OO0O0.O00000000(
         o00000000000O.x,
         o00000000000O.y,
         o00000000000O.width,
         o00000000000O.height,
         var4,
         o00000000000O.alpha * (0.5F + o00000000000O.focus * 0.18F + (1.0F - var5) * 0.12F)
      );
      float var6 = o00000000000O.focus * 0.92F + o00000000000O.threat * 0.98F + o00000000000O.exposure * 0.68F;
      if (var6 > 0.03F) {
         int var7 = this.O00000000000(o000000000000, o00000000000O);
         o0000O00OO0O0.O00000000(
            o00000000000O.x,
            o00000000000O.y + o00000000000O.scale,
            o00000000000O.width,
            o00000000000O.height,
            var4,
            20.0F * o00000000000O.scale * var6,
            2.4F * o00000000000O.scale,
            this.O00000000(var7, o00000000000O.alpha * var6 * 0.15F)
         );
      }
   }

   private void O000000000(RenderManager o0000O00OO0O0, O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      float var4 = 11.5F * o00000000000O.scale;
      int var5 = this.O00000000(this.O00000000(o000000000000, o00000000000O), o00000000000O.alpha * (0.1F + o00000000000O.focus * 0.08F));
      int var6 = this.O00000000(o000000000000.shellTop, o00000000000O.alpha * 0.72F);
      int var7 = this.O00000000(o000000000000.shellBottom, o00000000000O.alpha * 0.88F);
      int var8 = this.O00000000000(o000000000000, o00000000000O);
      o0000O00OO0O0.O00000000(o00000000000O.x, o00000000000O.y, o00000000000O.width, o00000000000O.height, var4, o00000000000O.alpha * 0.52F);
      o0000O00OO0O0.O000000000(o00000000000O.x, o00000000000O.y, o00000000000O.width, o00000000000O.height, var4, var6, var7);
      o0000O00OO0O0.O000000000(
         o00000000000O.x + 1.0F,
         o00000000000O.y + 1.0F,
         Math.max(0.0F, o00000000000O.width - 2.0F),
         Math.max(0.0F, o00000000000O.height * 0.52F),
         Math.max(0.0F, var4 - 1.0F),
         this.O00000000(16777215, o00000000000O.alpha * 0.016F),
         this.O00000000(16777215, 0.0F)
      );
      o0000O00OO0O0.O00000000(
         o00000000000O.x, o00000000000O.y, o00000000000O.width, o00000000000O.height, var4, var5, Math.max(0.7F, o00000000000O.scale * 0.72F)
      );
      float var9 = o00000000000O.focus * 0.92F + o00000000000O.threat * 0.98F + o00000000000O.exposure * 0.68F;
      if (var9 > 0.03F) {
         o0000O00OO0O0.O00000000(
            o00000000000O.x,
            o00000000000O.y + o00000000000O.scale,
            o00000000000O.width,
            o00000000000O.height,
            var4,
            18.0F * o00000000000O.scale * var9,
            2.2F * o00000000000O.scale,
            this.O00000000(var8, o00000000000O.alpha * var9 * 0.13F)
         );
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O, float f, float g, O00000O0O00OOO.W168 o00000000
   ) {
      O00000O0O00OOO.W173 var7 = o00000000000O.state;
      float var8 = o00000000000O.scale;
      float var9 = 10.0F * var8;
      float var10 = 29.0F * var8;
      float var11 = 16.0F * var8;
      float var12 = 7.0F * var8;
      float var13 = 14.8F * var8;
      float var14 = 11.2F * var8;
      float var15 = 12.8F * var8;
      float var16 = 9.4F * var8;
      float var17 = this.O00000000(o00000000000O);
      float var18 = this.O00000000(o00000000000O, o00000000);
      float var19 = this.O00000000(o00000000000O, var18);
      float var20 = o00000000 == O00000O0O00OOO.W168.GHOST ? 0.48F : 1.0F;
      float var21 = o00000000 == O00000O0O00OOO.W168.GHOST ? 0.15F : 0.32F;
      float var22 = (1.0F - var17) * (o00000000 == O00000O0O00OOO.W168.OVERLAY ? 1.85F : 5.0F) * var8;
      float var23 = f + var9;
      float var24 = g + (var10 - var11) * 0.5F + var22 * 0.16F;
      float var25 = this.O0000000000(0.18F, 0.74F, var19);
      float var26 = var7.O00000000O * var8 * var25;
      float var27 = var23 + var11 + var12;
      float var28 = Math.max(0.0F, f + o00000000000O.width - var9 - var27 - var26 - 42.0F * var8);
      String var29 = var7.O00000000O000O.isEmpty() ? "" : this.O00000000(var7.O00000000O000O, var28, FontRegistry.O00000000, var14);
      float var30 = var29.isEmpty() ? 0.0F : this.O000000000(FontRegistry.O00000000, var29, var14);
      float var31 = var29.isEmpty() ? 0.0F : 5.0F * var8;
      float var32 = var27 + var30 + var31;
      float var33 = Math.max(10.0F * var8, f + o00000000000O.width - var9 - var32 - Math.max(0.0F, var26 + 8.0F * var8 * var25));
      String var34 = this.O00000000(var7.O00000000O0000, var33, FontRegistry.O00000000000, var13);
      O00000O0O00OOO.W176 var35 = this.O00000000(FontRegistry.O00000000000, var34, var13);
      float var36 = this.O00000000(g + var22 * 0.08F, var10 - 5.0F * var8, var35.height);
      o0000O00OO0O0.O00000000(
         var23, var24, var11, var11, var11 * 0.48F, this.O00000000(o000000000000.avatarBackdrop, o00000000000O.alpha * var20 * (0.14F + 0.2F * var18))
      );
      this.O00000000(
         o0000O00OO0O0,
         var7.O00000000,
         var7.O00000000O0000,
         var23,
         var24,
         var11,
         o00000000000O.alpha * (o00000000 == O00000O0O00OOO.W168.GHOST ? 0.18F + 0.42F * var18 : 0.42F + 0.58F * var18)
      );
      int var37 = this.O00000000(this.O000000000000(o000000000000, o00000000000O), o00000000000O.alpha * var18 * var20);
      if (!var29.isEmpty()) {
         O00000O0O00OOO.W176 var38 = this.O00000000(FontRegistry.O00000000, var29, var14);
         float var39 = this.O00000000(g + var22 * 0.08F, var10 - 5.0F * var8, var38.height);
         this.O00000000(
            o0000O00OO0O0,
            FontRegistry.O00000000,
            var29,
            var27,
            var39,
            var14,
            this.O00000000(var7.O00000000O00O, o00000000000O.alpha * var18 * var20),
            o00000000000O.alpha * var18 * var21
         );
      }

      this.O00000000(o0000O00OO0O0, FontRegistry.O00000000000, var34, var32, var36, var13, var37, o00000000000O.alpha * var18 * var21);
      if (var25 > 0.01F) {
         O00000O0O00OOO.W176 var50 = this.O00000000(FontRegistry.O00000000, var7.O00000000O00O0, var15);
         float var52 = this.O000000000(FontRegistry.O00000000, var7.O00000000O00O0, var15);
         float var40 = f + o00000000000O.width - var9 - var52;
         float var41 = this.O00000000(g + var22 * 0.08F, var10 - 5.0F * var8, var50.height);
         this.O00000000(
            o0000O00OO0O0,
            FontRegistry.O00000000,
            var7.O00000000O00O0,
            var40,
            var41,
            var15,
            this.O00000000(o000000000000.textPrimary, o00000000000O.alpha * var25 * var20),
            o00000000000O.alpha * var25 * var20 * 0.28F
         );
      }

      this.O00000000(
         o0000O00OO0O0,
         o000000000000,
         o00000000000O,
         f + var9,
         g + var10 - 5.0F * var8 + var22 * 0.1F,
         o00000000000O.width - var9 * 2.0F,
         3.6F * var8,
         var18,
         var20
      );
      if (!(var19 <= 0.01F)) {
         boolean var51 = this.O00000000000(var7);
         float var53 = g + var10 + 4.0F * var8;
         int var54 = this.O00000000(o000000000000.divider, o00000000000O.alpha * 0.1F * var19);
         o0000O00OO0O0.O00000000(
            f + var9,
            var53 - 1.5F * var8,
            o00000000000O.width - var9 * 2.0F,
            Math.max(1.0F, var8),
            0.5F * var8,
            var54,
            this.O00000000(o000000000000.divider, 0.0F)
         );
         if (var51) {
            float var55 = this.O0000000000(0.16F, 0.7F, var19) * var18 * var20;
            float var42 = this.O00000000(g, var8);
            float var43 = 10.0F * var8;
            float var44 = var7.O00000000O00 * var8;
            float var45 = Math.max(0.0F, o00000000000O.width - var9 * 2.0F - var44 - (var7.O00000000O0O.text.isEmpty() ? 0.0F : 8.0F * var8));
            String var46 = this.O00000000(var7.O00000000O00OO.text, var45, FontRegistry.O00000000, var16);
            float var47 = Math.max(0.0F, this.O000000000(FontRegistry.O00000000, var46, var16) + 8.0F * var8);
            if (!var46.isEmpty()) {
               o0000O00OO0O0.O00000000(
                  f + var9 - 3.0F * var8,
                  var42 - var43 * 0.72F,
                  var47,
                  var43,
                  var43 * 0.5F,
                  this.O00000000(this.O00000000(o000000000000.avatarBackdrop, 592656, 0.3F), o00000000000O.alpha * (0.34F * var55))
               );
               this.O00000000(
                  o0000O00OO0O0,
                  FontRegistry.O00000000,
                  var46,
                  f + var9,
                  var42,
                  var16,
                  this.O00000000(var7.O00000000O00OO.color, o00000000000O.alpha * var55),
                  o00000000000O.alpha * var55 * 0.26F
               );
            }

            if (!var7.O00000000O0O.text.isEmpty()) {
               float var48 = Math.max(var7.O00000000O00 * var8, this.O000000000(FontRegistry.O00000000, var7.O00000000O0O.text, var16));
               float var49 = f + o00000000000O.width - var9 - var48;
               o0000O00OO0O0.O00000000(
                  var49 - 3.0F * var8,
                  var42 - var43 * 0.72F,
                  var48 + 8.0F * var8,
                  var43,
                  var43 * 0.5F,
                  this.O00000000(this.O00000000(o000000000000.avatarBackdrop, 592656, 0.3F), o00000000000O.alpha * (0.34F * var55))
               );
               this.O00000000(
                  o0000O00OO0O0,
                  FontRegistry.O00000000,
                  var7.O00000000O0O.text,
                  var49,
                  var42,
                  var16,
                  this.O00000000(var7.O00000000O0O.color, o00000000000O.alpha * var55),
                  o00000000000O.alpha * var55 * 0.26F
               );
            }
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O, float f, float g, float h, float i, float j, float k
   ) {
      float var10 = i * 0.5F;
      float var11 = h * this.O000000000(o00000000000O.damage);
      float var12 = h * this.O000000000(o00000000000O.health);
      float var13 = o00000000000O.alpha * k * (0.24F + 0.76F * j);
      o0000O00OO0O0.O00000000(f, g, h, i, var10, this.O00000000(o000000000000.barTrack, var13 * 0.16F));
      o0000O00OO0O0.O000000000(f, g, h, Math.max(i * 0.64F, 1.0F), var10, this.O00000000(16777215, var13 * 0.02F), this.O00000000(16777215, 0.0F));
      float var14 = Math.max(0.0F, var11 - var12);
      if (var14 > 0.4F) {
         o0000O00OO0O0.O00000000(f + var12, g, var14, i, var10, this.O00000000(15988479, var13 * 0.34F), this.O00000000(16777215, var13 * 0.18F));
      }

      if (var12 > 0.5F) {
         int var15 = this.O00000000(this.O0000000000000(o000000000000, o00000000000O), var13);
         int var16 = this.O00000000(this.O000000000000O(o000000000000, o00000000000O), var13);
         o0000O00OO0O0.O00000000(f, g, var12, i, var10, var15, var16);
         o0000O00OO0O0.O000000000(f, g, var12, i * 0.58F, var10, this.O00000000(16777215, var13 * 0.15F), this.O00000000(16777215, 0.0F));
         float var17 = Math.max(i * 1.2F, 2.0F * o00000000000O.scale);
         float var18 = f + Math.max(0.0F, var12 - var17);
         o0000O00OO0O0.O000000000(
            var18,
            g - 0.15F * o00000000000O.scale,
            var17,
            i + 0.3F * o00000000000O.scale,
            var10,
            this.O00000000(16777215, var13 * 0.18F),
            this.O00000000(this.O000000000000O(o000000000000, o00000000000O), var13 * 0.1F)
         );
      }

      if (o00000000000O.threat > 0.01F) {
         o0000O00OO0O0.O00000000000();

         try {
            o0000O00OO0O0.O00000000(
               f,
               g,
               Math.max(1.0F, Math.max(var12, var11)),
               i,
               var10,
               7.2F * o00000000000O.scale * o00000000000O.threat,
               1.65F * o00000000000O.scale,
               this.O00000000(o000000000000.dangerGlow, o00000000000O.alpha * (0.1F + o00000000000O.threat * 0.12F))
            );
         } finally {
            o0000O00OO0O0.O000000000000();
         }
      }
   }

   private void O0000000000(RenderManager o0000O00OO0O0, O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      O00000O0O00OOO.W173 var4 = o00000000000O.state;
      if (!var4.O00000000O0O0.isEmpty() && !(o00000000000O.itemReveal <= 0.02F)) {
         float var5 = o00000000000O.scale;
         float var6 = 16.0F * var5;
         float var7 = 4.0F * var5;
         float var8 = this.O00000000(var4.O00000000O0O0, var6, var7);
         float var9 = o00000000000O.x + (o00000000000O.width - var8) * 0.5F;
         float var10 = this.O0000000000(o00000000000O);
         float var11 = this.O0000000000(0.1F, 0.84F, o00000000000O.itemReveal);

         for (int var12 = 0; var12 < var4.O00000000O0O0.size(); var12++) {
            float var13 = this.O000000000(var11, 0.08F + var12 * 0.06F, 0.2F);
            if (!(var13 <= 0.01F)) {
               float var14 = var9 + var12 * (var6 + var7);
               float var15 = var10 + (1.0F - var13) * 6.0F * var5;
               float var16 = var6 * 0.42F;
               int var17 = this.O00000000(this.O00000000(o000000000000.slotFill, 16777215, 0.06F), o00000000000O.alpha * (0.12F + var13 * 0.05F));
               int var18 = this.O00000000(this.O00000000(o000000000000.avatarBackdrop, 132103, 0.18F), o00000000000O.alpha * (0.64F + var13 * 0.06F));
               int var19 = this.O00000000(this.O00000000(o000000000000.rim, 16777215, 0.05F), o00000000000O.alpha * (0.06F + var13 * 0.04F));
               o0000O00OO0O0.O00000000(
                  var14, var15 + 0.8F * var5, var6, var6, var16, 4.8F * var5, 1.05F * var5, this.O00000000(0, o00000000000O.alpha * (0.08F + var13 * 0.05F))
               );
               o0000O00OO0O0.O000000000(var14, var15, var6, var6, var16, var17, var18);
               o0000O00OO0O0.O00000000(var14, var15, var6, var6, var16, var19, Math.max(0.58F, var5 * 0.7F));
            }
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, List<O00000O0O00OOO.W175> list) {
      if (!list.isEmpty() && O00000000.player != null) {
         o0000O00OO0O0.O0000000000();

         for (O00000O0O00OOO.W175 var4 : list) {
            O00000O0O00OOO.W173 var5 = var4.state;
            float var6 = this.O0000000000(0.1F, 0.84F, var4.itemReveal);
            if (!(var6 <= 0.01F) && !var5.O00000000O0O0.isEmpty()) {
               float var7 = var4.scale;
               float var8 = 16.0F * var7;
               float var9 = 4.0F * var7;
               float var10 = this.O00000000(var5.O00000000O0O0, var8, var9);
               float var11 = var4.x + (var4.width - var10) * 0.5F;
               float var12 = this.O0000000000(var4);

               for (int var13 = 0; var13 < var5.O00000000O0O0.size(); var13++) {
                  float var14 = this.O000000000(var6, 0.08F + var13 * 0.06F, 0.2F);
                  if (!(var14 <= 0.05F)) {
                     float var15 = var11 + var13 * (var8 + var9);
                     float var16 = var12 + (1.0F - var14) * 6.0F * var7;
                     float var17 = var8 * (0.6F + var14 * 0.24F) / 16.0F;
                     float var18 = 16.0F * var17;
                     float var19 = var15 + (var8 - var18) * 0.5F;
                     float var20 = var16 + (var8 - var18) * 0.5F;
                     int var10005 = var5.O000000000 + var13;
                     ItemRenderUtil.O00000000(o0000O00OO0O0, var5.O00000000O0O0.get(var13).stack, var19, var20, var17, var10005, false, var13);
                  }
               }
            }
         }
      }
   }

   private boolean O00000000(PlayerEntity playerEntity, NameTags o00000O0O0O) {
      return playerEntity != null
         && playerEntity.isAlive()
         && !playerEntity.isSpectator()
         && playerEntity != O00000000.player
         && (o00000O0O0O.O000000000OO.O0000000000() || !playerEntity.isInvisibleTo(O00000000.player));
   }

   private O00000O0O00OOO.W174 O00000000(PlayerEntity playerEntity, float f, int i, int j) {
      Vec3d var5 = playerEntity.getLerpedPos(f);
      double var6 = playerEntity.getHeight() + 0.3 - (playerEntity.isSneaking() ? 0.14 : 0.0);
      Vec3d var8 = new Vec3d(var5.x, var5.y + var6, var5.z);
      Vec3d var9 = new Vec3d(var5.x, var5.y + 0.02, var5.z);
      Vec3d var10 = O0000O000OOOOO.O00000000(var8);
      Vec3d var11 = O0000O000OOOOO.O00000000(var9);
      if (var10 == null || var11 == null) {
         return null;
      } else if (!(var10.z <= 0.001) && !(var10.z > 1.0) && !(var11.z <= 0.001) && !(var11.z > 1.0)) {
         double var12 = O00000000.gameRenderer.getCamera().getPos().distanceTo(var8);
         if (var12 > 96.0) {
            return null;
         } else {
            float var14 = Math.max(18.0F, Math.abs((float)(var11.y - var10.y)));
            float var15 = Math.max(18.0F, var14);
            if (!(var10.x < -var15 * 2.0F) && !(var10.x > i + var15 * 2.0F) && !(var10.y < -j * 0.6F) && !(var10.y > j + var15 * 2.0F)) {
               float var16 = this.O000000000000((float)var10.x, -var15 * 0.25F, i + var15 * 0.25F);
               float var17 = Math.max((float)var10.y, 18.0F);
               return new O00000O0O00OOO.W174(var16, var17, var12, var14, (float)var10.z);
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private boolean O000000000(PlayerEntity playerEntity, NameTags o00000O0O0O) {
      return O00000000.currentScreen == null && o00000O0O0O.O000000000OO0.O0000000000() && O00000000.targetedEntity == playerEntity;
   }

   private List<O00000O0O00OOO.W170> O0000000000(PlayerEntity playerEntity, NameTags o00000O0O0O) {
      ArrayList var3 = new ArrayList(6);
      if (o00000O0O0O.O000000000O000.O0000000000()) {
         this.O00000000(var3, playerEntity.getEquippedStack(EquipmentSlot.HEAD), EquipmentSlot.HEAD);
         this.O00000000(var3, playerEntity.getEquippedStack(EquipmentSlot.CHEST), EquipmentSlot.CHEST);
         this.O00000000(var3, playerEntity.getEquippedStack(EquipmentSlot.LEGS), EquipmentSlot.LEGS);
         this.O00000000(var3, playerEntity.getEquippedStack(EquipmentSlot.FEET), EquipmentSlot.FEET);
      }

      if (o00000O0O0O.O000000000O00O.O0000000000()) {
         this.O00000000(var3, playerEntity.getMainHandStack(), EquipmentSlot.MAINHAND);
      }

      if (o00000O0O0O.O000000000O0O.O0000000000()) {
         this.O00000000(var3, playerEntity.getOffHandStack(), EquipmentSlot.OFFHAND);
      }

      return var3;
   }

   private void O00000000(List<O00000O0O00OOO.W170> list, ItemStack itemStack, EquipmentSlot equipmentSlot) {
      if (itemStack != null && !itemStack.isEmpty()) {
         list.add(new O00000O0O00OOO.W170(itemStack.copy(), equipmentSlot));
      }
   }

   private List<O00000O0O00OOO.W169> O00000000000(PlayerEntity playerEntity, NameTags o00000O0O0O) {
      if (!o00000O0O0O.O000000000O0O0.O0000000000()) {
         return List.of();
      } else {
         ArrayList var3 = new ArrayList();

         for (StatusEffectInstance var5 : playerEntity.getStatusEffects()) {
            String var6 = this.O00000000(I18n.translate(((StatusEffect)var5.getEffectType().value()).getTranslationKey(), new Object[0]));
            if (!var6.isEmpty()) {
               String var7 = var6 + " " + this.O000000000(var5.getAmplifier() + 1);
               boolean var8 = ((StatusEffect)var5.getEffectType().value()).getCategory() == StatusEffectCategory.HARMFUL;
               int var9 = var8 ? 16732754 : 15133941;
               var3.add(new O00000O0O00OOO.W169(var7, var9, var8, var5.getDuration()));
            }
         }

         var3.sort(
            Comparator.<O00000O0O00OOO.W169, Boolean>comparing(o000000000 -> !o000000000.harmful)
               .thenComparingInt(O00000O0O00OOO.W169::duration)
               .reversed()
               .thenComparing(O00000O0O00OOO.W169::label)
         );
         return var3.size() > 2 ? List.copyOf(var3.subList(0, 2)) : List.copyOf(var3);
      }
   }

   private O00000O0O00OOO.W171 O00000000(O00000O0O00OOO.W173 o0000000000000) {
      if (!o0000000000000.O00000000O0O00.isEmpty()) {
         return new O00000O0O00OOO.W171(o0000000000000.O00000000O0O00.get(0).label, o0000000000000.O00000000O0O00.get(0).color);
      } else {
         return o0000000000000.O000000000O000 ? new O00000O0O00OOO.W171("ALLY", 10284799) : new O00000O0O00OOO.W171("", 15133941);
      }
   }

   private O00000O0O00OOO.W171 O00000000(PlayerEntity playerEntity, O00000O0O00OOO.W173 o0000000000000) {
      if (o0000000000000.O00000000O0O00.size() > 1) {
         return new O00000O0O00OOO.W171(o0000000000000.O00000000O0O00.get(1).label, o0000000000000.O00000000O0O00.get(1).color);
      } else {
         return playerEntity.getArmor() > 0 ? new O00000O0O00OOO.W171("ARM " + playerEntity.getArmor(), 12371672) : new O00000O0O00OOO.W171("", 12371672);
      }
   }

   private void O000000000(O00000O0O00OOO.W173 o0000000000000) {
      o0000000000000.O00000000O = this.O000000000(FontRegistry.O00000000, o0000000000000.O00000000O00O0, 12.8F);
      float var2 = this.O000000000(FontRegistry.O00000000000, o0000000000000.O00000000O0000, 14.8F);
      float var3 = o0000000000000.O00000000O000O.isEmpty() ? 0.0F : this.O000000000(FontRegistry.O00000000, o0000000000000.O00000000O000O, 11.2F) + 5.0F;
      o0000000000000.O00000000O0 = this.O000000000(FontRegistry.O00000000, o0000000000000.O00000000O00OO.text, 9.4F);
      o0000000000000.O00000000O00 = this.O000000000(FontRegistry.O00000000, o0000000000000.O00000000O0O.text, 9.4F);
      o0000000000000.O00000000O000 = this.O00000000(o0000000000000.O00000000O0O0, 16.0F, 4.0F);
      o0000000000000.O000000000OO0O = this.O000000000000(33.0F + var3 + var2 + 10.0F + 10.0F, 92.0F, 340.0F);
      float var4 = 33.0F + var3 + var2 + 12.0F + o0000000000000.O00000000O + 10.0F;
      float var5 = o0000000000000.O00000000O0
         + o0000000000000.O00000000O00
         + (!o0000000000000.O00000000O00OO.text.isEmpty() && !o0000000000000.O00000000O0O.text.isEmpty() ? 8.0F : 0.0F);
      o0000000000000.O000000000OOO = this.O000000000000(Math.max(o0000000000000.O000000000OO0O + 28.0F, Math.max(var4, var5 + 20.0F + 16.0F)), 92.0F, 340.0F);
      o0000000000000.O000000000OOO0 = 29.0F;
      float var6 = 0.0F;
      if (this.O00000000000(o0000000000000)) {
         var6 += 15.0F;
         var6 += 11.0F;
      }

      o0000000000000.O000000000OOOO = 29.0F + var6;
   }

   private int O0000000000(O00000O0O00OOO.W173 o0000000000000) {
      int var2 = o0000000000000.O00000000O0000.hashCode();
      var2 = 31 * var2 + o0000000000000.O00000000O000O.hashCode();
      var2 = 31 * var2 + o0000000000000.O00000000O00O;
      var2 = 31 * var2 + o0000000000000.O00000000O00O0.hashCode();
      var2 = 31 * var2 + o0000000000000.O00000000O00OO.text.hashCode();
      var2 = 31 * var2 + o0000000000000.O00000000O00OO.color;
      var2 = 31 * var2 + o0000000000000.O00000000O0O.text.hashCode();
      var2 = 31 * var2 + o0000000000000.O00000000O0O.color;

      for (O00000O0O00OOO.W170 var4 : o0000000000000.O00000000O0O0) {
         var2 = 31 * var2 + ItemStack.hashCode(var4.stack);
         var2 = 31 * var2 + var4.slot.ordinal();
      }

      for (O00000O0O00OOO.W169 var15 : o0000000000000.O00000000O0O00) {
         var2 = 31 * var2 + var15.label.hashCode();
         var2 = 31 * var2 + var15.color;
      }

      return var2;
   }

   private float O00000000(double d, float f, float g) {
      float var5 = this.O000000000000(f / 96.0F, 0.75F, 1.35F);
      float var6 = this.O000000000000((float)(1.35 - Math.log(d + 1.0) * 0.16), 0.75F, 1.25F);
      float var7 = this.O000000000000(var5 * 0.7F + var6 * 0.3F, 0.85F, 1.35F);
      return this.O000000000(var7 * g, 0.01F);
   }

   private float O00000000(PlayerEntity playerEntity) {
      float var2 = playerEntity.getHealth() + playerEntity.getAbsorptionAmount();
      if (O00000000.world != null) {
         Scoreboard var3 = O00000000.world.getScoreboard();
         ScoreboardObjective var4 = var3.getObjectiveForSlot(ScoreboardDisplaySlot.BELOW_NAME);
         if (var4 != null) {
            ReadableScoreboardScore var5 = var3.getScore(playerEntity, var4);
            if (var5 != null && var5.getScore() > 0) {
               var2 = var5.getScore();
            }
         }
      }

      return Math.max(0.0F, var2);
   }

   private void O00000000(RenderManager o0000O00OO0O0, UUID uUID, String string, float f, float g, float h, float i) {
      int var8 = this.O00000000(uUID);
      if (var8 > 0) {
         GlStateManager._bindTexture(var8);
         o0000O00OO0O0.O000000000000(i);

         try {
            float var15 = h * 0.48F;
            o0000O00OO0O0.O00000000(var8, f, g, h, h, 0.125F, 0.125F, 0.25F, 0.25F, var15);
            o0000O00OO0O0.O00000000(var8, f, g, h, h, 0.625F, 0.125F, 0.75F, 0.25F, var15);
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      } else {
         o0000O00OO0O0.O00000000(f, g, h, h, h * 0.48F, this.O00000000(1842983, i * 0.92F));
         String var9 = string != null && !string.isEmpty() ? string.substring(0, 1).toUpperCase(Locale.ROOT) : "?";
         float var10 = h * 0.62F;
         float var11 = this.O000000000(FontRegistry.O00000000000, var9, var10);
         float var12 = this.O0000000000(FontRegistry.O00000000000, var9, var10);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, f + (h - var11) * 0.5F, this.O00000000(g, h, var12), var10, var9, this.O00000000(15922683, i));
      }
   }

   private int O00000000(UUID uUID) {
      if (O00000000.getNetworkHandler() == null) {
         return 0;
      } else {
         PlayerListEntry var2 = O00000000.getNetworkHandler().getPlayerListEntry(uUID);
         if (var2 == null) {
            return 0;
         } else {
            Identifier var3 = var2.getSkinTextures().texture();
            if (var3 == null) {
               return 0;
            } else {
               AbstractTexture var4 = O00000000.getTextureManager().getTexture(var3);
               return var4 != null && var4.getGlTexture() instanceof GlTexture var5 && var5.getGlId() > 0 ? var5.getGlId() : 0;
            }
         }
      }
   }

   private O00000O0O00OOO.W172 O000000000() {
      Theme var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.WILD;
      boolean var2 = O00000OOOO00O0.O00000000000();
      int var3 = var1.O00000000().getRGB() & 16777215;
      int var4 = this.O000000000(var3, 1.18F);
      int var5 = this.O00000000(var3, 16777215, 0.18F);
      int var6 = var2
         ? this.O00000000(var1.O0000000000().getRGB() & 16777215, 16777215, 0.44F)
         : this.O00000000(var1.O0000000000().getRGB() & 16777215, 329224, 0.34F);
      int var7 = var2
         ? this.O00000000(var1.O000000000().getRGB() & 16777215, 15265269, 0.5F)
         : this.O00000000(var1.O000000000().getRGB() & 16777215, 197638, 0.44F);
      int var8 = var2 ? this.O00000000(var1.O000000000000().getRGB() & 16777215, 1120034, 0.72F) : var1.O000000000000().getRGB() & 16777215;
      int var9 = var2
         ? this.O00000000(var1.O0000000000000().getRGB() & 16777215, 4147287, 0.62F)
         : this.O00000000(var1.O0000000000000().getRGB() & 16777215, 15134199, 0.18F);
      int var10 = var2
         ? this.O00000000(var1.O00000000000().getRGB() & 16777215, var4, 0.34F)
         : this.O00000000(var1.O00000000000().getRGB() & 16777215, var4, 0.18F);
      return new O00000O0O00OOO.W172(
         var4,
         var5,
         var6,
         var7,
         var10,
         var8,
         var9,
         var2 ? 15594234 : 1514017,
         var2 ? 16251647 : 1843241,
         var2 ? 14213614 : 2501688,
         var2 ? 13029857 : 2962497,
         13775174,
         16729440,
         6094796
      );
   }

   private int O00000000(O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      if (o00000000000O.state.O000000000O000) {
         return this.O00000000(o000000000000.accentTop, 12122111, 0.34F);
      } else if (o00000000000O.focus > 0.02F) {
         return this.O00000000(o000000000000.accentTop, 16777215, 0.24F);
      } else {
         return o00000000000O.threat > 0.01F ? this.O00000000(o000000000000.danger, o000000000000.accentTop, 0.26F) : o000000000000.rim;
      }
   }

   private int O000000000(O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      if (o00000000000O.state.O000000000O000) {
         return this.O00000000(9105407, o000000000000.accentTop, 0.44F);
      } else {
         return o00000000000O.threat > 0.08F ? this.O00000000(o000000000000.dangerGlow, o000000000000.danger, 0.36F) : o000000000000.accentTop;
      }
   }

   private int O0000000000(O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      if (o00000000000O.state.O000000000O000) {
         return this.O00000000(14089215, o000000000000.accentBottom, 0.4F);
      } else {
         return o00000000000O.threat > 0.08F ? this.O00000000(16756920, o000000000000.dangerGlow, 0.46F) : o000000000000.accentBottom;
      }
   }

   private int O00000000000(O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      if (o00000000000O.threat > 0.08F) {
         return o000000000000.dangerGlow;
      } else if (o00000000000O.state.O000000000O000) {
         return 9366527;
      } else {
         return o00000000000O.focus > 0.1F ? this.O00000000(o000000000000.accentTop, 16777215, 0.16F) : o000000000000.accentTop;
      }
   }

   private int O00000000(O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O, EquipmentSlot equipmentSlot) {
      if (equipmentSlot == EquipmentSlot.MAINHAND || equipmentSlot == EquipmentSlot.OFFHAND) {
         return this.O000000000(o000000000000, o00000000000O);
      } else {
         return o00000000000O.state.O000000000O000
            ? this.O00000000(10219519, o000000000000.accentTop, 0.36F)
            : this.O00000000(o000000000000.rim, o000000000000.accentBottom, 0.24F);
      }
   }

   private int O000000000000(O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      if (o00000000000O.state.O000000000O000) {
         return this.O00000000(o000000000000.textPrimary, 9433855, 0.34F);
      } else {
         return o00000000000O.focus > 0.08F ? this.O00000000(o000000000000.textPrimary, o000000000000.accentTop, 0.18F) : o000000000000.textPrimary;
      }
   }

   private int O0000000000000(O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      return o00000000000O.state.O000000000O000
         ? this.O00000000(o000000000000.accentTop, o000000000000.safeGlow, 0.32F)
         : this.O00000000(o00000000000O.health, this.O00000000(12985918, o000000000000.danger, 0.45F), 15245893, 5427594);
   }

   private int O000000000000O(O00000O0O00OOO.W172 o000000000000, O00000O0O00OOO.W175 o00000000000O) {
      return o00000000000O.state.O000000000O000
         ? this.O00000000(o000000000000.accentBottom, o000000000000.safeGlow, 0.28F)
         : this.O00000000(o00000000000O.health, 16743309, 16765559, 10944454);
   }

   private int O00000000(float f, int i, int j, int k) {
      float var5 = this.O000000000(f);
      return var5 < 0.5F ? this.O00000000(i, j, var5 * 2.0F) : this.O00000000(j, k, (var5 - 0.5F) * 2.0F);
   }

   private String O00000000(float f) {
      float var2 = Math.round(f * 10.0F) / 10.0F;
      return !(var2 >= 10.0F) && var2 != (int)var2 ? String.format(Locale.US, "%.1f HP", var2) : Math.round(var2) + " HP";
   }

   private String O00000000(String string, float f, FontObject o0000O0O00O00O, float g) {
      String var5 = this.O00000000(string);
      if (var5.isEmpty()) {
         return "";
      } else if (this.O000000000(o0000O0O00O00O, var5, g) <= f) {
         return var5;
      } else {
         for (int var6 = var5.length() - 1; var6 > 0; var6--) {
            String var7 = var5.substring(0, var6).trim() + "...";
            if (this.O000000000(o0000O0O00O00O, var7, g) <= f) {
               return var7;
            }
         }

         return "...";
      }
   }

   private String O00000000(String string) {
      if (string != null && !string.isEmpty()) {
         String var2 = string.replaceAll("(?i)§[0-9A-FK-OR]", "").replace('\n', ' ').replace('\r', ' ').replaceAll("\\p{Cntrl}", "").trim();

         while (var2.contains("  ")) {
            var2 = var2.replace("  ", " ");
         }

         return var2;
      } else {
         return "";
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, String string, float f, float g, float h, int i, float j) {
      if (string != null && !string.isEmpty()) {
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f + 1.0F, g + 1.0F, h, string, this.O00000000(0, j));
         o0000O00OO0O0.O00000000(o0000O0O00O00O, f, g, h, string, i);
      }
   }

   private O00000O0O00OOO.W176 O00000000(FontObject o0000O0O00O00O, String string, float f) {
      FontRenderer.W409 var4 = RenderManager.O00000000(o0000O0O00O00O, string, f);
      return new O00000O0O00OOO.W176(var4.O00000000, var4.O000000000);
   }

   private float O000000000(FontObject o0000O0O00O00O, String string, float f) {
      return RenderManager.O00000000(o0000O0O00O00O, string, f).O00000000;
   }

   private float O0000000000(FontObject o0000O0O00O00O, String string, float f) {
      return RenderManager.O00000000(o0000O0O00O00O, string, f).O000000000;
   }

   private float O00000000(float f, float g, float h) {
      return f + (g - h) * 0.5F + h * 0.72F;
   }

   private float O00000000(float f, float g) {
      return f + 29.0F * g + 7.0F * g + 7.2F * g;
   }

   private float O00000000(O00000O0O00OOO.W175 o00000000000O) {
      float var2 = this.O0000000000(0.08F, 0.88F, o00000000000O.content);
      float var3 = this.O0000000000(0.04F, 0.58F, o00000000000O.appear);
      return this.O000000000(Math.max(var2, var3 * 0.74F));
   }

   private float O000000000(O00000O0O00OOO.W175 o00000000000O) {
      return this.O00000000(o00000000000O, this.O00000000(o00000000000O));
   }

   private float O00000000(O00000O0O00OOO.W175 o00000000000O, float f) {
      return this.O0000000000(0.1F, 0.92F, o00000000000O.detail) * (0.56F + 0.44F * f);
   }

   private float O00000000(O00000O0O00OOO.W175 o00000000000O, O00000O0O00OOO.W168 o00000000) {
      float var3 = this.O00000000(o00000000000O);

      return switch (o00000000) {
         case DIRECT -> var3;
         case GHOST -> this.O000000000(0.18F + var3 * 0.52F);
         case OVERLAY -> this.O000000000(0.62F + var3 * 0.38F);
      };
   }

   private float O00000000(O00000O0O00OOO.W173 o0000000000000, float f, float g) {
      return !o0000000000000.O00000000O0O0.isEmpty() && !(f <= 0.02F) ? 26.0F * g * this.O0000000000(0.1F, 0.72F, f) : 0.0F;
   }

   private float O0000000000(O00000O0O00OOO.W175 o00000000000O) {
      return o00000000000O.y - o00000000000O.topExtension + 2.0F * o00000000000O.scale;
   }

   private float O00000000(int i) {
      return i > 12 ? 10.0F : 13.0F;
   }

   private List<O00000O0O00OOO.W175> O00000000(List<O00000O0O00OOO.W175> list, int i) {
      if (list.isEmpty()) {
         return list;
      } else {
         ArrayList var3 = new ArrayList(list);
         var3.sort(Comparator.comparingDouble(O00000O0O00OOO.W175::y).reversed().thenComparingDouble(O00000O0O00OOO.W175::distance));
         ArrayList var4 = new ArrayList(var3.size());

         for (O00000O0O00OOO.W175 var6 : (List<O00000O0O00OOO.W175>)var3) {
            float var7 = 14.0F * var6.scale;
            float var8 = var6.y;

            boolean var9;
            do {
               var9 = false;

               for (O00000O0O00OOO.W175 var11 : (List<O00000O0O00OOO.W175>)var4) {
                  if (this.O00000000(var6, var11)
                     && this.O00000000(var6.x, var6.width, var11.x, var11.width, var7 * 0.45F)
                     && this.O000000000(
                        var8 - var6.topExtension,
                        var6.height + var6.topExtension,
                        var11.y - var11.topExtension,
                        var11.height + var11.topExtension,
                        var7 * 0.25F
                     )) {
                     var8 = var11.y - var11.topExtension - var6.height - var7;
                     var9 = true;
                  }
               }
            } while (var9);

            float var14 = 8.0F + var6.topExtension;
            float var15 = Math.max(var14, i - var6.height - 8.0F);
            float var12 = this.O000000000000(var8, var14, var15);
            float var13 = this.O000000000000(var6.y + var6.state.O0000000000O00.O00000000(var12 - var6.y, O0000000000O), var14, var15);
            var4.add(var6.withY(var13));
         }

         return var4;
      }
   }

   private boolean O00000000(O00000O0O00OOO.W175 o00000000000O, O00000O0O00OOO.W175 o00000000000O2) {
      float var3 = Math.abs(o00000000000O.state.O0000000000O0O.depth() - o00000000000O2.state.O0000000000O0O.depth());
      double var4 = Math.min(o00000000000O.distance(), o00000000000O2.distance());
      double var6 = Math.max(o00000000000O.distance(), o00000000000O2.distance());
      double var8 = var6 / Math.max(0.001, var4);
      double var10 = var6 - var4;
      return var3 <= 0.085F || var8 <= 1.32F || var10 <= 4.0;
   }

   private boolean O00000000(float f, float g, float h, float i, float j) {
      return f < h + i + j && f + g + j > h;
   }

   private boolean O000000000(float f, float g, float h, float i, float j) {
      return f < h + i + j && f + g + j > h;
   }

   private boolean O00000000000(O00000O0O00OOO.W173 o0000000000000) {
      return !o0000000000000.O00000000O00OO.text.isEmpty() || !o0000000000000.O00000000O0O.text.isEmpty();
   }

   private float O00000000(List<O00000O0O00OOO.W170> list, float f, float g) {
      return list.isEmpty() ? 0.0F : list.size() * f + Math.max(0, list.size() - 1) * g;
   }

   private float O000000000(float f, float g, float h) {
      return this.O0000000000(g, g + h, f);
   }

   private float O0000000000(float f, float g, float h) {
      float var4 = this.O000000000((h - f) / Math.max(1.0E-5F, g - f));
      return var4 * var4 * (3.0F - 2.0F * var4);
   }

   private float O00000000(float f, long l, int i) {
      float var5 = this.O000000000((0.2F - f) / 0.2F);
      if (var5 <= 0.0F) {
         return 0.0F;
      } else {
         float var6 = 0.5F + 0.5F * (float)Math.sin(this.O00000000(l) * 9.4F + i * 0.173F);
         return var5 * (0.58F + 0.42F * var6);
      }
   }

   private float O00000000(long l, long m) {
      if (l >= 0L && l < m) {
         float var5 = 1.0F - (float)l / (float)m;
         return var5 * var5 * (3.0F - 2.0F * var5);
      } else {
         return 0.0F;
      }
   }

   private float O00000000(long l) {
      return (float)(l % 1000000L) / 1000.0F;
   }

   private String O000000000(int i) {
      return switch (Math.max(1, Math.min(10, i))) {
         case 1 -> "I";
         case 2 -> "II";
         case 3 -> "III";
         case 4 -> "IV";
         case 5 -> "V";
         case 6 -> "VI";
         case 7 -> "VII";
         case 8 -> "VIII";
         case 9 -> "IX";
         default -> "X";
      };
   }

   private int O00000000(int i, float f) {
      int var3 = Math.max(0, Math.min(255, Math.round(this.O000000000(f) * 255.0F)));
      return var3 << 24 | i & 16777215;
   }

   private int O00000000(int i, int j, float f) {
      float var4 = this.O000000000(f);
      int var5 = Math.round((i >> 16 & 0xFF) + ((j >> 16 & 0xFF) - (i >> 16 & 0xFF)) * var4);
      int var6 = Math.round((i >> 8 & 0xFF) + ((j >> 8 & 0xFF) - (i >> 8 & 0xFF)) * var4);
      int var7 = Math.round((i & 0xFF) + ((j & 0xFF) - (i & 0xFF)) * var4);
      return var5 << 16 | var6 << 8 | var7;
   }

   private int O000000000(int i, float f) {
      Color var3 = new Color(i);
      int var4 = Math.max(0, Math.min(255, Math.round(var3.getRed() * f)));
      int var5 = Math.max(0, Math.min(255, Math.round(var3.getGreen() * f)));
      int var6 = Math.max(0, Math.min(255, Math.round(var3.getBlue() * f)));
      return var4 << 16 | var5 << 8 | var6;
   }

   private float O00000000000(float f, float g, float h) {
      return f + (g - f) * this.O000000000(h);
   }

   private float O000000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private float O000000000(float f) {
      return this.O000000000000(f, 0.0F, 1.0F);
   }

   private float O0000000000(float f) {
      return Math.round(f);
   }

   private float O000000000(float f, float g) {
      return g <= 0.0F ? f : Math.round(f / g) * g;
   }

   static enum W168 {
      DIRECT,
      GHOST,
      OVERLAY;
   }

   record W169(String label, int color, boolean harmful, int duration) {
   }

   record W170(ItemStack stack, EquipmentSlot slot) {
   }

   record W171(String text, int color) {

      W171(String text, int color) {
         text = Objects.requireNonNullElse(text, "");
         this.text = text;
         this.color = color;
      }
   }

   record W172(
      int accentTop,
      int accentBottom,
      int shellTop,
      int shellBottom,
      int rim,
      int textPrimary,
      int textSecondary,
      int avatarBackdrop,
      int slotFill,
      int barTrack,
      int divider,
      int danger,
      int dangerGlow,
      int safeGlow
   ) {
   }

   static final class W173 {
      final UUID O00000000;
      final int O000000000;
      final O0000O000O000O O0000000000 = new O0000O000O000O(0.0F);
      final O0000O000O000O O00000000000 = new O0000O000O000O(0.0F);
      final O0000O000O000O O000000000000 = new O0000O000O000O(0.0F);
      final O0000O000O000O O0000000000000 = new O0000O000O000O(0.0F);
      final O0000O000O000O O000000000000O = new O0000O000O000O(92.0F);
      final O0000O000O000O O00000000000O = new O0000O000O000O(29.0F);
      final O0000O000O000O O00000000000O0 = new O0000O000O000O(1.0F);
      final O0000O000O000O O00000000000OO = new O0000O000O000O(1.0F);
      final O0000O000O000O O0000000000O = new O0000O000O000O(0.0F);
      final O0000O000O000O O0000000000O0 = new O0000O000O000O(0.0F);
      final O0000O000O000O O0000000000O00 = new O0000O000O000O(0.0F);
      O00000O0O00OOO.W174 O0000000000O0O;
      boolean O0000000000OO;
      boolean O0000000000OO0;
      boolean O0000000000OOO;
      boolean O000000000O;
      boolean O000000000O0;
      boolean O000000000O00;
      boolean O000000000O000;
      long O000000000O00O;
      long O000000000O0O;
      long O000000000O0O0;
      long O000000000O0OO = Long.MIN_VALUE;
      int O000000000OO;
      float O000000000OO0 = Float.MAX_VALUE;
      float O000000000OO00 = 1.0F;
      float O000000000OO0O = 92.0F;
      float O000000000OOO = 92.0F;
      float O000000000OOO0 = 29.0F;
      float O000000000OOOO = 29.0F;
      float O00000000O;
      float O00000000O0;
      float O00000000O00;
      float O00000000O000;
      String O00000000O0000 = "";
      String O00000000O000O = "";
      int O00000000O00O = 16734824;
      String O00000000O00O0 = "20 HP";
      O00000O0O00OOO.W171 O00000000O00OO = new O00000O0O00OOO.W171("", 15133941);
      O00000O0O00OOO.W171 O00000000O0O = new O00000O0O00OOO.W171("", 12371672);
      List<O00000O0O00OOO.W170> O00000000O0O0 = List.of();
      List<O00000O0O00OOO.W169> O00000000O0O00 = List.of();

      private W173(UUID uUID) {
         this.O00000000 = uUID;
         this.O000000000 = uUID.hashCode();
      }

      void O00000000() {
         this.O0000000000OO0 = false;
         this.O0000000000OOO = false;
         this.O000000000O = false;
         this.O000000000O0 = false;
         this.O000000000O00 = false;
      }

      boolean O00000000(long l) {
         return !this.O0000000000OO0
            && this.O0000000000.O000000000(0.0F, O00000O0O00OOO.O000000000)
            && this.O00000000000.O000000000(0.0F, O00000O0O00OOO.O0000000000)
            && this.O000000000000.O000000000(0.0F, O00000O0O00OOO.O00000000000)
            && this.O0000000000000.O000000000(0.0F, O00000O0O00OOO.O000000000000)
            && l - this.O000000000O00O > 180L;
      }
   }

   record W174(float screenX, float screenY, double distance, float projectedHeight, float depth) {
   }

   record W175(
      O00000O0O00OOO.W173 state,
      float x,
      float y,
      float width,
      float height,
      float scale,
      float topExtension,
      float alpha,
      float appear,
      float content,
      float detail,
      float itemReveal,
      float focus,
      float health,
      float damage,
      float threat,
      float exposure,
      boolean shader
   ) {

      public double distance() {
         return this.state.O0000000000O0O.distance();
      }

      public O00000O0O00OOO.W175 withY(float f) {
         return new O00000O0O00OOO.W175(
            this.state,
            this.x,
            f,
            this.width,
            this.height,
            this.scale,
            this.topExtension,
            this.alpha,
            this.appear,
            this.content,
            this.detail,
            this.itemReveal,
            this.focus,
            this.health,
            this.damage,
            this.threat,
            this.exposure,
            this.shader
         );
      }
   }

   record W176(float width, float height) {
   }
}
