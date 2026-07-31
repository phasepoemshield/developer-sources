package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.scoreboard.ReadableScoreboardScore;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import net.minecraft.text.MutableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec3d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Quaternionf;
import org.joml.Vector3f;

@O0000000OOO0(
   O00000000 = "TargetHUD",
   O000000000 = "w"
)
public final class TargetHud extends HudElement {
   private static final TargetHud O00000000 = new TargetHud();
   private static final Logger O000000000OO0 = LogManager.getLogger("TargetHUD");
   private static final O0000O00O0OO O000000000OO00 = new O0000O00O0OO();
   private static final O0000O00O0OO O000000000OO0O = new O0000O00O0OO();
   private static final O0000O000O00O O000000000OOO = new O0000O000O00O(0.0F);
   private static final O0000O000O00O O000000000OOO0 = new O0000O000O00O(0.0F);
   private static final O0000O000O00O O000000000OOOO = new O0000O000O00O(0.0F);
   private static final List<TargetHud.W163> O00000000O = new ArrayList<>();
   private static final ItemStack[] O00000000O0 = new ItemStack[4];
   private static final Pattern O00000000O00 = Pattern.compile("(?i)(?:\\u00A7|\\u0412\\u00A7).");
   private static final Pattern O00000000O000 = Pattern.compile("\\d+(?:[\\.,]\\d+)?");
   private static final Pattern O00000000O0000 = Pattern.compile("[^A-Za-z\\u0410-\\u042F\\u0430-\\u044F\\u0401\\u04510-9\\s\\[\\]()_\\-.,!<>:|]");
   private final BooleanSetting O00000000O000O = new BooleanSetting("При наводке", false);
   private final BooleanSetting O00000000O00O = new BooleanSetting("Анимировать при ударе", true);
   private final BooleanSetting O00000000O00O0 = new BooleanSetting("Золотые сердца", true);
   private final ModeSetting O00000000O00OO = new ModeSetting("Вид отображения", "Голова", "Голова", "От 3-лица");
   private final ModeSetting O00000000O0O = new ModeSetting("Позиция", "На экране", "На экране", "На цели");
   private final NumberSetting O00000000O0O0 = new NumberSetting("Смещение X", 0.0F, -0.25F, 0.25F, 0.01F, false)
      .O00000000(() -> !this.O00000000O0O.O000000000("На цели"));
   private static float O00000000O0O00;
   private static float O00000000O0O0O;
   private static final float O00000000O0OO = 0.58F;
   private static final float O00000000O0OO0 = 130.0F;
   private static float O00000000O0OOO;
   private static float O00000000OO;
   private static float O00000000OO0;
   private static LivingEntity O00000000OO00;
   private static int O00000000OO000 = Integer.MIN_VALUE;
   private static int O00000000OO00O = Integer.MIN_VALUE;
   private static int O00000000OO0O = Integer.MIN_VALUE;
   private static int O00000000OO0O0;
   private static float O00000000OO0OO = Float.NaN;
   private static int O00000000OOO = 1;
   private static final long O00000000OOO0 = 1000L;
   private static final Map<String, Long> O00000000OOO00 = new HashMap<>();
   private static final Map<String, Long> O00000000OOO0O = new HashMap<>();

   private TargetHud() {
      this.O00000000(this.O00000000O000O);
      this.O00000000(this.O00000000O00O);
      this.O00000000(this.O00000000O00O0);
      this.O00000000(this.O00000000O00OO);
      this.O00000000(this.O00000000O0O);
      this.O00000000(this.O00000000O0O0);
      ru.metaculture.protection.O000000000O0O0.O00000000(this);
   }

   public static TargetHud O000000000() {
      return O00000000;
   }

   public static float O00000000(LivingEntity livingEntity) {
      if (livingEntity instanceof PlayerEntity var1) {
         Float var2 = O000000000(var1);
         if (var2 != null) {
            return Math.max(0.0F, var2);
         }
      }

      float var3 = livingEntity.getHealth() + O0000000000(livingEntity);
      return Math.max(0.0F, var3);
   }

   private static float O000000000(LivingEntity livingEntity) {
      if (livingEntity instanceof PlayerEntity var1) {
         Float var2 = O000000000(var1);
         if (var2 != null) {
            return Math.max(0.0F, var2);
         }
      }

      return O0000O00OO0OO0.O00000000000OO(livingEntity.getHealth(), 0.0F, livingEntity.getMaxHealth());
   }

   private static Float O000000000(PlayerEntity playerEntity) {
      if (MinecraftAccessor.a_.world != null) {
         Float var1 = O00000000(playerEntity, MinecraftAccessor.a_.world.getScoreboard());
         if (var1 != null) {
            return var1;
         }
      }

      return O00000000(playerEntity, playerEntity.getScoreboard());
   }

   private static Float O00000000(PlayerEntity playerEntity, Scoreboard scoreboard) {
      if (scoreboard == null) {
         return null;
      } else {
         ScoreboardObjective var2 = scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.BELOW_NAME);
         if (var2 == null) {
            return null;
         } else {
            ReadableScoreboardScore var3 = scoreboard.getScore(playerEntity, var2);
            if (var3 == null) {
               return null;
            } else {
               MutableText var4 = ReadableScoreboardScore.getFormattedScore(var3, var2.getNumberFormatOr(StyledNumberFormat.EMPTY));
               Float var5 = O00000000000(var4.getString());
               return var5 != null ? var5 : (float)var3.getScore();
            }
         }
      }
   }

   private static Float O00000000000(String string) {
      if (string != null && !string.isBlank()) {
         String var1 = O00000000O00.matcher(string).replaceAll("").replace(',', '.');
         Matcher var2 = O00000000O000.matcher(var1);
         if (!var2.find()) {
            return null;
         } else {
            try {
               return Float.parseFloat(var2.group());
            } catch (NumberFormatException var4) {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private static float O0000000000(LivingEntity livingEntity) {
      try {
         return Math.max(0.0F, livingEntity.getAbsorptionAmount());
      } catch (Throwable var2) {
         return 0.0F;
      }
   }

   public static void O00000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      O00000000.O000000000(o0000O00OO0O0, drawContext);
   }

   public void O000000000(RenderManager o0000O00OO0O0, DrawContext drawContext) {
      if (!(MinecraftAccessor.a_.currentScreen instanceof InventoryScreen)) {
         Object var3 = null;
         LivingEntity var5 = AttackAura.O00000000OO0;
         if (var5 instanceof LivingEntity) {
            var3 = var5;
         }

         if (var3 == null) {
            LivingEntity var4 = TriggerBot.O0000000000O0();
            if (var4 != null) {
               var3 = var4;
            }
         }

         if (var3 == null && this.O00000000O000O.O0000000000() && MinecraftAccessor.a_.targetedEntity instanceof LivingEntity var97 && var97.isAlive()) {
            var3 = var97;
         }

         if (var3 == null && MinecraftAccessor.a_.currentScreen instanceof ChatScreen && MinecraftAccessor.a_.player != null) {
            var3 = MinecraftAccessor.a_.player;
         }

         boolean var96 = var3 != null;
         if (var96) {
            O00000000OO00 = (LivingEntity)var3;
         }

         O000000000OO00.O00000000();
         O000000000OO00.O00000000(var96 ? 1.0 : 0.0, 0.22F, O0000O00O0OO0O.O0000000000O0O, true);
         float var98 = O000000000OO00.O000000000000();
         Object var6 = var96 ? var3 : O00000000OO00;
         if (!(var98 <= 0.01F) && var6 != null) {
            boolean var7 = this.O00000000O00O0.O0000000000();
            Float var8 = var6 instanceof PlayerEntity var9 ? O000000000(var9) : null;
            float var99 = var8 != null ? Math.max(0.0F, var8) : (var7 ? O000000000((LivingEntity)var6) : O00000000((LivingEntity)var6));
            float var10 = var7 && var8 == null ? O0000000000((LivingEntity)var6) : 0.0F;
            float var11 = var7 ? var99 + var10 : var99;
            float var12 = Math.max(1.0F, Math.max(((LivingEntity)var6).getMaxHealth(), var99));
            float var13 = Math.min(1.0F, var99 / var12);
            float var14 = Math.min(1.0F, var10 / var12);
            float var15 = O00000000000O((LivingEntity)var6);
            if (var8 != null) {
               O000000000OOOO.O00000000(0.0F);
            }

            if (O00000000OO000 != ((LivingEntity)var6).getId()) {
               O00000000OO000 = ((LivingEntity)var6).getId();
               O000000000OOO.O00000000(var13);
               O000000000OOO0.O00000000(var15);
               O000000000OOOO.O00000000(var14);
            }

            O00000000O0OOO = O0000O00OO0OO0.O00000000000OO(O000000000OOO.O00000000(var13, O0000O000O0O00.O00000000000O0()), 0.0F, 1.0F);
            O00000000OO = O0000O00OO0OO0.O00000000000OO(O000000000OOO0.O00000000(var15, O0000O000O0O00.O00000000000O0()), 0.0F, 1.0F);
            O00000000OO0 = O0000O00OO0OO0.O00000000000OO(O000000000OOOO.O00000000(var14, O0000O000O0O00.O00000000000O0()), 0.0F, 1.0F);
            boolean var16 = O00000000((LivingEntity)var6, var11);
            O000000000OO0O.O00000000();
            if (var16 && this.O00000000O00O.O0000000000()) {
               O00000000OOO = (System.nanoTime() & 1L) == 0L ? 1 : -1;
               O000000000OO0O.O0000000000000(1.0);
            }

            O000000000OO0O.O00000000(0.0, 0.34F, O0000O00O0OO0O.O0000000000O0O, false);
            float var17 = this.O00000000O00O.O0000000000() ? O0000O00OO0OO0.O00000000000OO(O000000000OO0O.O000000000000(), 0.0F, 1.0F) : 0.0F;
            String var18 = "";
            float var19 = var98 * this.O000000000O0.O0000000000();
            boolean var20 = this.O0000000000O();
            String var21 = ((LivingEntity)var6).getName().getString();
            if (var6 instanceof PlayerEntity var22) {
               var18 = O00000000(var22);
            }

            var21 = ProtectInfo.O0000000000(var21);
            if (!var18.isEmpty()) {
               var18 = var18 + " ";
            }

            var21 = O000000000000(var21);
            String var102 = O0000000000O0(var11);
            String var23 = " hp";
            float var24 = 252.204F;
            float var25 = 85.472F;
            float var26 = MinecraftAccessor.a_.getWindow().getFramebufferHeight();
            float var27 = MinecraftAccessor.a_.getWindow().getFramebufferWidth();
            boolean var28 = this.O00000000O0O.O000000000("На цели");
            O00000OO000O.W219 var34 = null;
            TargetHud.W162 var35 = null;
            float var29;
            float var30;
            float var31;
            float var32;
            float var33;
            if (var28) {
               float var36 = MinecraftAccessor.a_.getRenderTickCounter().getTickProgress(true);
               var35 = this.O00000000((LivingEntity)var6, var36, (int)var27, (int)var26);
               if (var35 == null) {
                  return;
               }

               float var37 = this.O0000000000OO0();
               var33 = var37;
               var31 = var24 * var37;
               var32 = var25 * var37;
               var29 = var35.x - var31 * 0.5F;
               var30 = var35.y - var32 * 0.5F;
               if (MinecraftAccessor.a_.currentScreen instanceof ChatScreen) {
                  var34 = O00000OO000O.O00000000().O000000000("HUD_TargetHUD", var29, var30, var24, var25);
                  var33 = Math.min(var34.O00000000000 / var24, var34.O000000000000 / var25);
                  var31 = var24 * var33;
                  var32 = var25 * var33;
                  var29 = var35.x - var31 * 0.5F;
                  var30 = var35.y - var32 * 0.5F;
               }
            } else {
               var34 = O00000OO000O.O00000000().O00000000("HUD_TargetHUD", 10.0F, Math.max(10.0F, var26 - var25 - 10.0F), var24, var25);
               float var103 = var34.O000000000;
               float var105 = var34.O0000000000;
               float var38 = var34.O00000000000;
               float var39 = var34.O000000000000;
               var33 = Math.min(var38 / var24, var39 / var25);
               var31 = var24 * var33;
               var32 = var25 * var33;
               var29 = var103 + (var38 - var31) / 2.0F;
               var30 = var105 + (var39 - var32) / 2.0F;
            }

            this.O00000000(var29, var30, var31, var32);
            int var104 = (int)(255.0F * var19);
            int var106 = this.O000000000000(var19);
            int var107 = var106;
            if (var6 instanceof PlayerEntity var108) {
               var107 = O00000000(var108, var106, var104);
            }

            float var109 = 14.0F * var33;
            int var40 = this.O00000000000(var19);
            int var41 = this.O000000000(var19);
            float var43 = O0000O00OO0OO0.O00000000000OO((O00000000O0OOO - 0.16F) / 0.84F, 0.0F, 1.0F);
            int var44 = O00000000(O0000O000OO000.O0000000000(255, 84, 96, var104), O0000O000OO000.O0000000000(128, 255, 171, var104), var43);
            int var45 = O00000000(O0000O000OO000.O0000000000(210, 35, 52, var104), O0000O000OO000.O0000000000(34, 213, 122, var104), var43);
            int var46 = O0000O000OO000.O0000000000(192, 220, 255, var104);
            int var47 = O0000O000OO000.O0000000000(86, 132, 202, var104);
            int var48 = this.O0000000000000(var19);
            float var49 = var29 + 7.0F * var33;
            float var50 = var30 + 6.834F * var33;
            float var51 = 71.799F * var33;
            float var52 = 71.803F * var33;
            float var53 = 54.367F * var33;
            float var54 = var29 + 15.716F * var33;
            float var55 = var30 + 15.552F * var33;
            float var56 = var28 ? var19 : var19 * O0000O00OO0OO0.O00000000000OO((var98 - 0.42F) / 0.58F, 0.0F, 1.0F);
            boolean var57 = this.O00000000O00OO.O00000000000.size() > 1
               && this.O00000000O00OO.O0000000000().equalsIgnoreCase(this.O00000000O00OO.O00000000000.get(1));
            float var58 = var29 + 84.185F * var33;
            float var59 = 161.02F * var33;
            float var60 = var30 + 6.834F * var33;
            float var61 = 31.592F * var33;
            if (var20) {
               O00000OOOO00O0.O00000000();
            }

            try {
               this.O00000000(o0000O00OO0O0, var29, var30, var31, var32, var109, var19);
               this.O000000000(o0000O00OO0O0, var49, var50, var51, var52, 10.0F * var33, var19);
               this.O000000000(o0000O00OO0O0, var58, var60, var59, var61, 9.0F * var33, var19);
               if (var20) {
                  O00000OOOO00O0.O000000000();
               }

               float var62 = 30.0F * var33;
               float var63 = 20.0F * var33;
               float var64 = var29 + 94.33F * var33;
               float var65 = var60 + var61 / 2.0F + 6.6F * var33;
               float var66 = var58 + var59 - 10.0F * var33;
               if (!var18.isEmpty()) {
                  int var67 = var107 == var106 ? O0000O000OO000.O0000000000(255, 50, 50, var104) : var107;
                  String var68 = var18.trim().toUpperCase(Locale.ROOT);
                  float var69 = TextMeasureCache.O00000000(FontRegistry.O00000000000, var68, var63).O00000000;
                  String var70 = O00000000(o0000O00OO0O0, var21, var62, Math.max(20.0F * var33, var66 - var64 - var69 - 5.0F * var33));
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var64, var65, var62, var70, var106);
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var66 - var69, var65 - 0.5F * var33, var63, var68, var67);
               } else {
                  String var115 = O00000000(o0000O00OO0O0, var21, var62, Math.max(20.0F * var33, var66 - var64));
                  o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var64, var65, var62, var115, var106);
               }
            } finally {
               if (var20) {
                  O00000OOOO00O0.O0000000000();
               }
            }

            float var110 = var30 + 43.426F * var33;
            float var111 = 35.211F * var33;
            this.O000000000(o0000O00OO0O0, var58, var110, var59, var111, 9.0F * var33, var19);
            float var112 = 16.01F * var33;
            float var113 = var28 ? var19 : var19 * O0000O00OO0OO0.O00000000000OO((var98 - 0.42F) / 0.58F, 0.0F, 1.0F);
            O00000000(
               o0000O00OO0O0,
               drawContext,
               this,
               var29 + 90.04F * var33,
               var30 + 48.53F * var33,
               (LivingEntity)var6,
               var19,
               var113,
               var33,
               var41,
               var40,
               var112,
               var20
            );
            float var114 = 24.0F * var33;
            float var116 = TextMeasureCache.O00000000(FontRegistry.O00000000, var102, var114).O00000000;
            float var117 = TextMeasureCache.O00000000(FontRegistry.O00000000, var23, var114).O00000000;
            float var118 = var58 + var59 - var116 - var117 - 9.2F * var33;
            float var119 = var110 + 19.1F * var33;
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var118, var119, var114, var102, var106);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var118 + var116, var119, var114, var23, var48);
            float var71 = var29 + 90.339F * var33;
            float var72 = var29 + 90.339F * var33;
            float var73 = var30 + 65.28F * var33;
            float var74 = 76.0F * var33;
            float var75 = 3.72F * var33;
            float var76 = var75 * 0.5F;
            this.O000000000(o0000O00OO0O0, var72, var73, var74, var75, var76, var19);
            float var77 = Math.min(var75 * 0.32F, Math.max(0.72F * var33, 0.45F));
            float var78 = Math.max(0.0F, (var74 - var77 * 2.0F) * O00000000OO);
            if (var78 > 0.35F) {
               float var79 = Math.max(1.0F, var75 - var77 * 2.0F);
               o0000O00OO0O0.O00000000(
                  var72 + var77, var73 + var77, Math.max(1.0F, var74 - var77 * 2.0F), var79, var79 * 0.5F, var79 * 0.5F, var79 * 0.5F, var79 * 0.5F
               );
               o0000O00OO0O0.O00000000(var72 + var77, var73 + var77, var78, var79, var79 * 0.5F, var47, var46);
               o0000O00OO0O0.O0000000000000();
            }

            float var120 = var30 + 70.12F * var33;
            float var80 = 146.92F * var33;
            float var81 = 6.72F * var33;
            float var82 = var81 * 0.5F;
            this.O000000000(o0000O00OO0O0, var71, var120, var80, var81, var82, var19);
            float var83 = Math.max(1.15F * var33, 0.85F);
            float var84 = var71 + var83;
            float var85 = var120 + var83;
            float var86 = Math.max(1.0F, var81 - var83 * 2.0F);
            float var87 = Math.max(0.0F, (var80 - var83 * 2.0F) * O00000000O0OOO);
            float var88 = var86 * 0.5F;
            if (var87 > 0.5F) {
               float var89 = O0000O00OO0OO0.O00000000000OO(Math.abs(O000000000OOO.O0000000000()) * 0.018F, 0.0F, 0.075F);
               float var90 = Math.min(var80 - var83 * 2.0F, var87 + (var80 - var83 * 2.0F) * var89);
               o0000O00OO0O0.O00000000(var84, var85, Math.max(1.0F, var80 - var83 * 2.0F), var86, var88, var88, var88, var88);
               o0000O00OO0O0.O000000000(var84, var85, var90, var86, var88, var44, var45);
               o0000O00OO0O0.O00000000(
                  var84 + var88 * 0.5F,
                  var85 + var86 * 0.18F,
                  Math.max(0.0F, var90 - var88),
                  Math.max(1.0F, var86 * 0.22F),
                  var86 * 0.11F,
                  O0000O000OO000.O0000000000(255, 255, 255, (int)(58.0F * var19))
               );
               o0000O00OO0O0.O0000000000000();
            }

            if (var7 && O00000000OO0 > 0.001F) {
               int var121 = O0000O000OO000.O0000000000(255, 224, 92, (int)(245.0F * var19));
               int var123 = O0000O000OO000.O0000000000(232, 154, 35, (int)(245.0F * var19));
               float var91 = Math.max(1.0F, var80 - var83 * 2.0F);
               float var92 = var91 * O0000O00OO0OO0.O00000000000OO(O00000000OO0, 0.0F, 1.0F);
               if (var92 > 0.5F) {
                  o0000O00OO0O0.O00000000(var84, var85, var91, var86, var88, var88, var88, var88);
                  o0000O00OO0O0.O000000000(var84, var85, var92, var86, var88, var121, var123);
                  o0000O00OO0O0.O0000000000000();
               }
            }

            if (var56 > 0.01F) {
               O00000000(o0000O00OO0O0, drawContext, (LivingEntity)var6, var54, var55, var53, var56, var17, var57);
               O0000000000(o0000O00OO0O0, var29, var30, var33, var56);
            }

            if (var34 != null) {
               HudModule.O00000000("HUD_TargetHUD", var29, var30, var31, var32);
               O00000OO000O var122 = O00000OO000O.O00000000();
               var122.O000000000(var34, var29, var30, var31, var32);
               if (var28) {
                  O00000O0O00O.O00000000(
                     o0000O00OO0O0,
                     this,
                     var29,
                     var30,
                     var31,
                     var32,
                     MinecraftAccessor.a_.getWindow().getScaledWidth(),
                     MinecraftAccessor.a_.getWindow().getScaledHeight(),
                     var34.O000000000000O,
                     var122.O000000000000O(),
                     var122.O00000000000O(),
                     var122.O00000000000OO(),
                     var122.O00000000000O0()
                  );
               } else {
                  O00000O0O00O.O00000000(
                     o0000O00OO0O0, this, var34, var122, MinecraftAccessor.a_.getWindow().getScaledWidth(), MinecraftAccessor.a_.getWindow().getScaledHeight()
                  );
               }
            } else if (var35 != null) {
               HudModule.O00000000("HUD_TargetHUD", var29, var30, var31, var32);
            }
         } else {
            O00000000O0OOO = 0.0F;
            O00000000OO = 0.0F;
            O00000000OO0 = 0.0F;
            O000000000OOO.O00000000(0.0F);
            O000000000OOO0.O00000000(0.0F);
            O000000000OOOO.O00000000(0.0F);
            O00000000OO000 = Integer.MIN_VALUE;
            O00000000OO00O = Integer.MIN_VALUE;
            if (!var96) {
               O00000000OO00 = null;
            }
         }
      }
   }

   private float O0000000000OO0() {
      O00000OO000O.W223 var1 = O00000OO000O.O00000000().O000000000000().get("HUD_TargetHUD");
      return var1 == null ? 1.0F : O0000O00OO0OO0.O00000000000OO(Math.min(var1.scaleX(), var1.scaleY()), 0.72F, 1.48F);
   }

   private TargetHud.W162 O00000000(LivingEntity livingEntity, float f, int i, int j) {
      if (livingEntity != null
         && !livingEntity.isRemoved()
         && i > 1
         && j > 1
         && MinecraftAccessor.a_.gameRenderer != null
         && MinecraftAccessor.a_.gameRenderer.getCamera() != null) {
         Vec3d var5 = livingEntity.getLerpedPos(f);
         double var6 = Math.max(0.65, (double)livingEntity.getHeight());
         Vec3d var8 = new Vec3d(var5.x, var5.y + var6 * 0.5, var5.z);
         Vec3d var9 = O0000O000OOOOO.O00000000(var8);
         if (var9 != null && !(var9.z <= 0.001) && !(var9.z > 1.0)) {
            float var10 = (float)var9.x + 130.0F * this.O00000000O0O0.O0000000000();
            float var11 = (float)var9.y;
            if (livingEntity.getId() != O00000000OO00O) {
               O00000000OO00O = livingEntity.getId();
               O00000000O0O00 = var10;
               O00000000O0O0O = var11;
            } else {
               O00000000O0O00 = O00000000O0O00 + (var10 - O00000000O0O00) * 0.58F;
               O00000000O0O0O = O00000000O0O0O + (var11 - O00000000O0O0O) * 0.58F;
            }

            return new TargetHud.W162(O00000000O0O00, O00000000O0O0O);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, LivingEntity livingEntity, float f, float g, float h, float i, float j, boolean bl
   ) {
      float var9 = ItemRenderUtil.O00000000(f);
      float var10 = ItemRenderUtil.O00000000(g);
      float var11 = ItemRenderUtil.O000000000(h);
      float var12 = Math.max(2.0F, (float)Math.round(var11 * 0.11F));
      if (!bl || !O00000000(o0000O00OO0O0, drawContext, livingEntity, var9, var10, var11, var12, i, j, true)) {
         if (livingEntity instanceof PlayerEntity var13 && MinecraftAccessor.a_.getNetworkHandler() != null) {
            PlayerListEntry var14 = MinecraftAccessor.a_.getNetworkHandler().getPlayerListEntry(var13.getUuid());
            if (var14 != null) {
               try {
                  Identifier var15 = var14.getSkinTextures().texture();
                  AbstractTexture var16 = MinecraftAccessor.a_.getTextureManager().getTexture(var15);
                  if (var16 != null && var16.getGlTexture() instanceof GlTexture var17 && var17.getGlId() > 0) {
                     ItemRenderUtil.O00000000(var15);
                     int var35 = var17.getGlId();
                     GlStateManager._bindTexture(var35);
                     O00000000(o0000O00OO0O0, var9, var10, var11, j);

                     try {
                        o0000O00OO0O0.O000000000000(i);

                        try {
                           o0000O00OO0O0.O00000000(var35, -var11 * 0.5F, -var11 * 0.5F, var11, var11, 0.125F, 0.125F, 0.25F, 0.25F, var12);
                           o0000O00OO0O0.O00000000(var35, -var11 * 0.5F, -var11 * 0.5F, var11, var11, 0.625F, 0.125F, 0.75F, 0.25F, var12);
                        } finally {
                           o0000O00OO0O0.O00000000000OO();
                        }

                        O000000000(o0000O00OO0O0, var11, var12, i, j);
                     } finally {
                        O00000000(o0000O00OO0O0);
                     }

                     return;
                  }
               } catch (Throwable var29) {
               }
            }
         }

         int var30 = O0000O000OO000.O0000000000(30, 30, 30, (int)(120.0F * i));
         o0000O00OO0O0.O00000000(var9, var10, var11, var11, var12, var30);
         int var31 = O0000O000OO000.O0000000000(200, 200, 200, (int)(200.0F * i));
         float var32 = var11 * 1.3F;
         String var33 = "a";
         float var34 = TextMeasureCache.O00000000(FontRegistry.O0000000000, var33, var32).O00000000;
         o0000O00OO0O0.O00000000(FontRegistry.O0000000000, var9 + (var11 - var34) / 2.0F, var10 + var11 / 2.0F + var32 * 0.25F, var32, var33, var31);
      }
   }

   private static boolean O00000000(
      RenderManager o0000O00OO0O0, DrawContext drawContext, LivingEntity livingEntity, float f, float g, float h, float i, float j, float k, boolean bl
   ) {
      if (livingEntity != null && MinecraftAccessor.a_ != null && drawContext != null && !(MinecraftAccessor.a_.currentScreen instanceof InventoryScreen)) {
         float var10 = MinecraftAccessor.a_.getWindow().getScaleFactor();
         if (var10 <= 0.0F) {
            return false;
         } else {
            float var11 = O0000O00OO0OO0.O00000000000OO(k, 0.0F, 1.0F);
            float var12 = 1.0F - var11 * 0.085F;
            float var13 = h * var12;
            float var14 = f + (h - var13) * 0.5F;
            float var15 = g + (h - var13) * 0.5F;
            int var16 = Math.round(var14 / var10);
            int var17 = Math.round(var15 / var10);
            int var18 = Math.max(1, Math.round(var13 / var10));
            float var19 = Math.max(0.65F, livingEntity.getHeight());
            float var20 = O0000O00OO0OO0.O00000000000OO(1.8F / var19, 0.72F, 1.65F);
            int var21 = Math.max(8, Math.round(var18 * (bl ? 1.02F : 1.15F) * var20));
            int var22 = Math.max(var18 + 1, Math.round(var18 * (bl ? 2.24F : 2.05F)));
            int var23 = var17 - Math.round(var18 * (bl ? 0.12F : 0.0F));
            int var24 = var23 + var22;
            float var25 = var16 + var18 * 0.5F;
            float var26 = (var23 + var24) * 0.5F;
            float var27 = (bl ? 24.0F : 8.0F) + O00000000OOO * var11 * 50.0F;
            float var28 = bl ? -7.0F : -4.0F;
            float var29 = var25 - (float)Math.tan(var27 / 20.0F) * 5.0F;
            float var30 = var26 - (float)Math.tan(-var28 / 20.0F);
            o0000O00OO0O0.O0000000000();

            label109: {
               boolean var32;
               try {
                  drawContext.enableScissor(var16, var17, var16 + var18, var17 + var18);
                  O00000000(drawContext, var16, var23, var16 + var18, var24, var21, 0.0625F, var29, var30, livingEntity);
                  break label109;
               } catch (Throwable var42) {
                  var32 = false;
               } finally {
                  try {
                     drawContext.disableScissor();
                  } catch (Throwable var41) {
                  }
               }

               return var32;
            }

            if (var11 > 0.001F) {
               o0000O00OO0O0.O00000000(var14, var15, var13, var13, i, O0000O000OO000.O0000000000(255, 55, 55, (int)(58.0F * j * var11)));
            }

            return true;
         }
      } else {
         return false;
      }
   }

   private static void O00000000(DrawContext drawContext, int i, int j, int k, int l, int m, float f, float g, float h, LivingEntity livingEntity) {
      float var10 = (i + k) * 0.5F;
      float var11 = (j + l) * 0.5F;
      float var12 = (float)Math.atan((var10 - g) / 40.0F);
      float var13 = (float)Math.atan((var11 - h) / 40.0F);
      Quaternionf var14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf var15 = new Quaternionf().rotateX(var13 * 20.0F * (float) (Math.PI / 180.0));
      var14.mul(var15);
      EntityRenderer var16 = MinecraftAccessor.a_.getEntityRenderDispatcher().getRenderer(livingEntity);
      EntityRenderState var17 = var16.getAndUpdateRenderState(livingEntity, 1.0F);
      var17.hitbox = null;
      if (var17 instanceof LivingEntityRenderState var18) {
         float var19 = 180.0F + var12 * 20.0F;
         var18.bodyYaw = var19;
         var18.relativeHeadYaw = 180.0F + var12 * 40.0F - var19;
         var18.pitch = -var13 * 20.0F;
      }

      float var20 = Math.max(0.001F, livingEntity.getScale());
      Vector3f var21 = new Vector3f(0.0F, livingEntity.getHeight() / 2.0F + f * var20, 0.0F);
      drawContext.addEntity(var17, m / var20, var21, var14, var15, i, j, k, l);
   }

   private static void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      float var5 = O0000O00OO0OO0.O00000000000OO(i, 0.0F, 1.0F);
      float var6 = f + h * 0.5F;
      float var7 = g + h * 0.5F;
      float var8 = 1.0F - var5 * 0.085F;
      float var9 = O00000000OOO * var5 * 8.5F;
      o0000O00OO0O0.O00000000(var6, var7);
      o0000O00OO0O0.O000000000(var9);
      o0000O00OO0O0.O000000000(var8, var8);
   }

   private static void O00000000(RenderManager o0000O00OO0O0) {
      o0000O00OO0O0.O00000000000O0();
      o0000O00OO0O0.O000000000000O();
      o0000O00OO0O0.O00000000000O();
   }

   private static void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      float var5 = O0000O00OO0OO0.O00000000000OO(i, 0.0F, 1.0F);
      if (!(var5 <= 0.001F)) {
         o0000O00OO0O0.O00000000(-f * 0.5F, -f * 0.5F, f, f, g, O0000O000OO000.O0000000000(255, 55, 55, (int)(58.0F * h * var5)));
      }
   }

   private static void O00000000(LivingEntity livingEntity, boolean bl, String string, String string2) {
      long var4 = System.currentTimeMillis();
      String var6 = string + "|" + O00000000000(livingEntity) + "|" + bl;
      Long var7 = O00000000OOO00.get(var6);
      if (var7 == null || var4 - var7 >= 1000L) {
         O00000000OOO00.put(var6, var4);
      }
   }

   private static void O00000000(LivingEntity livingEntity, boolean bl, String string, String string2, Throwable throwable) {
      long var5 = System.currentTimeMillis();
      String var7 = throwable == null ? "none" : throwable.getClass().getName();
      String var8 = string + "|" + O00000000000(livingEntity) + "|" + bl + "|" + var7;
      Long var9 = O00000000OOO0O.get(var8);
      if (var9 == null || var5 - var9 >= 1000L) {
         O00000000OOO0O.put(var8, var5);
         O000000000OO0.warn(
            "[portrait] stage={} target={} id={} type={} class={} thirdPerson={} {}",
            string,
            O000000000000(livingEntity),
            O00000000000(livingEntity),
            O0000000000000(livingEntity),
            O000000000000O(livingEntity),
            bl,
            string2,
            throwable
         );
      }
   }

   private static int O00000000000(LivingEntity livingEntity) {
      return livingEntity == null ? Integer.MIN_VALUE : livingEntity.getId();
   }

   private static String O000000000000(LivingEntity livingEntity) {
      if (livingEntity == null) {
         return "null";
      } else {
         try {
            return livingEntity.getName().getString();
         } catch (Throwable var2) {
            return "name-error";
         }
      }
   }

   private static String O0000000000000(LivingEntity livingEntity) {
      if (livingEntity == null) {
         return "null";
      } else {
         try {
            return String.valueOf(livingEntity.getType());
         } catch (Throwable var2) {
            return "type-error";
         }
      }
   }

   private static String O000000000000O(LivingEntity livingEntity) {
      return livingEntity == null ? "null" : livingEntity.getClass().getName();
   }

   private static boolean O00000000(LivingEntity livingEntity, float f) {
      int var2 = livingEntity.getId();
      if (var2 != O00000000OO0O) {
         O00000000OO0O = var2;
         O00000000OO0O0 = 0;
         O00000000OO0OO = f;
         O00000000O.clear();
         O000000000OO0O.O0000000000000(0.0);
         return false;
      } else {
         boolean var3 = livingEntity.hurtTime > 0 && (O00000000OO0O0 == 0 || livingEntity.hurtTime > O00000000OO0O0);
         boolean var4 = !Float.isNaN(O00000000OO0OO) && f < O00000000OO0OO - 0.05F;
         if (var3 || var4) {
            O0000000000OOO();
         }

         O00000000OO0O0 = livingEntity.hurtTime;
         O00000000OO0OO = f;
         return var3 || var4;
      }
   }

   private static void O0000000000OOO() {
      byte var0 = 24;
      float var1 = (float)(System.nanoTime() & 7L) * 0.06F;

      for (int var2 = 0; var2 < var0; var2++) {
         float var3 = (float)((Math.PI * 2) * var2 / var0) + var1;
         float var4 = 1.35F + var2 % 5 * 0.15F;
         float var5 = 43.0F + (var2 % 3 - 1) * 3.1F;
         float var6 = 42.8F + (var2 % 2 == 0 ? -2.8F : 2.8F);
         float var7 = (float)Math.cos(var3) * var4;
         float var8 = (float)Math.sin(var3) * var4 - 0.08F;
         float var9 = 1.32F + var2 % 3 * 0.32F;
         int var10 = 56 + var2 % 10;
         O00000000O.add(new TargetHud.W163(var5, var6, var7, var8, var9, var10));
      }
   }

   private static void O0000000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i) {
      for (int var5 = O00000000O.size() - 1; var5 >= 0; var5--) {
         TargetHud.W163 var6 = O00000000O.get(var5);
         var6.O000000000000O++;
         if (var6.O000000000000O >= var6.O0000000000000) {
            O00000000O.remove(var5);
         } else {
            var6.O00000000 = var6.O00000000 + var6.O0000000000;
            var6.O000000000 = var6.O000000000 + var6.O00000000000;
            var6.O0000000000 *= 0.988F;
            var6.O00000000000 = var6.O00000000000 * 0.988F + 0.012F;
            float var7 = (float)var6.O000000000000O / var6.O0000000000000;
            float var8 = 1.0F - (1.0F - var7) * (1.0F - var7);
            float var9 = Math.max(0.0F, 1.0F - var7) * i;
            float var10 = f + var6.O00000000 * h;
            float var11 = g + var6.O000000000 * h;
            float var12 = var6.O000000000000 * h * (1.0F + var8 * 0.28F);
            o0000O00OO0O0.O000000000(var10, var11, var12 * 4.2F, 0.0F, 1.0F, O0000O000OO000.O0000000000(146, 170, 255, (int)(32.0F * var9)));
            o0000O00OO0O0.O000000000(var10, var11, var12, 0.0F, 1.0F, O0000O000OO000.O0000000000(146, 170, 255, (int)(235.0F * var9)));
         }
      }
   }

   private static String O0000000000O0(float f) {
      int var1 = Math.max(0, Math.round(f * 10.0F));
      return var1 / 10 + "." + var1 % 10;
   }

   private static float O00000000000O(LivingEntity livingEntity) {
      if (livingEntity == null) {
         return 0.0F;
      } else {
         float var1 = 0.0F;
         EquipmentSlot[] var2 = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

         for (EquipmentSlot var6 : var2) {
            ItemStack var7 = livingEntity.getEquippedStack(var6);
            if (var7 != null && !var7.isEmpty()) {
               if (var7.isDamageable() && var7.getMaxDamage() > 0) {
                  var1 += O0000O00OO0OO0.O00000000000OO(1.0F - (float)var7.getDamage() / var7.getMaxDamage(), 0.0F, 1.0F);
               } else {
                  var1++;
               }
            }
         }

         return O0000O00OO0OO0.O00000000000OO(var1 / var2.length, 0.0F, 1.0F);
      }
   }

   private static int O00000000(int i, int j, float f) {
      float var3 = O0000O00OO0OO0.O00000000000OO(f, 0.0F, 1.0F);
      int var4 = i >>> 24 & 0xFF;
      int var5 = i >>> 16 & 0xFF;
      int var6 = i >>> 8 & 0xFF;
      int var7 = i & 0xFF;
      int var8 = j >>> 24 & 0xFF;
      int var9 = j >>> 16 & 0xFF;
      int var10 = j >>> 8 & 0xFF;
      int var11 = j & 0xFF;
      int var12 = Math.round(var4 + (var8 - var4) * var3);
      int var13 = Math.round(var5 + (var9 - var5) * var3);
      int var14 = Math.round(var6 + (var10 - var6) * var3);
      int var15 = Math.round(var7 + (var11 - var7) * var3);
      return (var12 & 0xFF) << 24 | (var13 & 0xFF) << 16 | (var14 & 0xFF) << 8 | var15 & 0xFF;
   }

   private static String O000000000000(String string) {
      return string != null && !string.isEmpty() ? O00000000O0000.matcher(O00000000O00.matcher(string).replaceAll("")).replaceAll("").trim() : "";
   }

   public static String O00000000(PlayerEntity playerEntity) {
      return playerEntity != null && playerEntity.getScoreboardTeam() != null
         ? O000000000000(ProtectInfo.O0000000000(playerEntity.getScoreboardTeam().getPrefix().getString()))
         : "";
   }

   public static int O00000000(PlayerEntity playerEntity, int i, int j) {
      if (playerEntity != null && playerEntity.getScoreboardTeam() != null) {
         Formatting var3 = playerEntity.getScoreboardTeam().getColor();
         return var3 != null && var3.getColorValue() != null ? O0000O000OO000.O000000000000(var3.getColorValue(), j) : i;
      } else {
         return i;
      }
   }

   private static String O00000000(RenderManager o0000O00OO0O0, String string, float f, float g) {
      if (string != null && !string.isEmpty() && !(TextMeasureCache.O00000000(FontRegistry.O00000000, string, f).O00000000 <= g)) {
         String var4 = "...";

         for (int var5 = string.length(); var5 > 0; var5--) {
            String var6 = string.substring(0, var5).trim() + var4;
            if (TextMeasureCache.O00000000(FontRegistry.O00000000, var6, f).O00000000 <= g) {
               return var6;
            }
         }

         return var4;
      } else {
         return string == null ? "" : string;
      }
   }

   private static void O00000000(
      RenderManager o0000O00OO0O0,
      DrawContext drawContext,
      HudElement o00000O00OO00O,
      float f,
      float g,
      LivingEntity livingEntity,
      float h,
      float i,
      float j,
      int k,
      int l,
      float m,
      boolean bl
   ) {
      if (livingEntity != null) {
         O00000000O0[0] = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
         O00000000O0[1] = livingEntity.getEquippedStack(EquipmentSlot.CHEST);
         O00000000O0[2] = livingEntity.getEquippedStack(EquipmentSlot.LEGS);
         O00000000O0[3] = livingEntity.getEquippedStack(EquipmentSlot.FEET);
      } else {
         O00000000O0[0] = null;
         O00000000O0[1] = null;
         O00000000O0[2] = null;
         O00000000O0[3] = null;
      }

      float var13 = 3.99F * j;

      for (int var14 = 0; var14 < 4; var14++) {
         float var15 = f + var14 * (m + var13);
         if (o00000O00OO00O == null || !o00000O00OO00O.O0000000000O0() && !o00000O00OO00O.O0000000000O00()) {
            if (!bl || !O00000OOOO00O0.O00000000(null, var15, g, m, m, 4.0F * j, Math.max(1.6F, 2.8F * j), Math.max(3.0F, 5.5F * j), 0.82F, 2, true, h)) {
               o0000O00OO0O0.O00000000(var15, g, m, m, 4.0F * j, k);
               o0000O00OO0O0.O00000000(var15, g, m, m, 4.0F * j, l, 1.0F * j);
            }
         } else {
            o00000O00OO00O.O000000000(o0000O00OO0O0, var15, g, m, m, 4.0F * j, h);
         }
      }

      O00000OOOO00O0.O000000000();
      o0000O00OO0O0.O0000000000();
      if (!(i <= 0.01F)) {
         o0000O00OO0O0.O000000000000(i);

         for (int var21 = 0; var21 < 4; var21++) {
            float var22 = f + var21 * (m + var13);
            ItemStack var16 = O00000000O0[var21];
            if (var16 != null && !var16.isEmpty()) {
               float var17 = m / 16.0F * 0.72F;
               float var18 = 16.0F * var17;
               float var19 = var22 + (m - var18) / 2.0F;
               float var20 = g + (m - var18) / 2.0F;
               ItemRenderUtil.O00000000(o0000O00OO0O0, var16, var19, var20, var17, var21, false, 0);
            }
         }

         o0000O00OO0O0.O00000000000OO();
      }
   }

   record W162(float x, float y) {
   }

   static final class W163 {
      float O00000000;
      float O000000000;
      float O0000000000;
      float O00000000000;
      final float O000000000000;
      final int O0000000000000;
      int O000000000000O;

      W163(float f, float g, float h, float i, float j, int k) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
         this.O000000000000 = j;
         this.O0000000000000 = k;
      }
   }
}
