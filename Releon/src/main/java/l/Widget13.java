package l;

import antidaunleak.api.UserProfile;
import com.google.gson.Gson;
import com.mojang.blaze3d.systems.RenderSystem;
import fat.releon.Releon;
import fat.releon.common.discord.DiscordManager;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;

public class Widget13 extends Helper296 {
   private String editingConfig = null;
   private String newName = "";
   private int editCursor = 0;
   private boolean isDefaultTab = true;
   private float highlightX = 55.0F;
   private List<Map<String, Object>> configs = new ArrayList<>();
   private String configInput = "";
   private boolean editingInput = false;
   private int inputCursor = 0;
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;
   private boolean loadedConfigs = false;
   private boolean cloudLoading = false;
   private long cloudLoadStartTime = 0L;
   private boolean cloudDataReady = false;
   private List<Map<String, Object>> tempConfigs = new ArrayList<>();
   private float loadingAlpha = 0.0F;
   private float configsAlpha = 0.0F;
   int clientColor = Hud.method1824().colorSetting.method2553();

   public Widget13() {
   }

   @Override
   public void method246(DrawContext var1, int var2, int var3, float var4) {
      MatrixStack var5 = var1.getMatrices();
      if (!Widget16.INSTANCE.method2892()) {
         DateTimeFormatter var6 = DateTimeFormatter.ofPattern("HH:mm:ss");
         String var7 = LocalTime.now().format(var6);
         String var8 = " • ";
         DiscordManager var9 = Releon.method71().method27();
         Releon.method71().method30().method1209(var5.peek().getPositionMatrix(), 0.0F, 0.0F, window.getScaledWidth(), window.getScaledHeight());
         blur.method677(
            Helper80.method841(var5, this.x, this.y, this.width, this.height)
               .method826(8.0F)
               .method838(64.0F)
               .method823(new Color(0, 0, 0, 255).getRGB())
               .method840()
         );
         rectangle.method677(
            Helper80.method841(var5, this.x, this.y, this.width, this.height)
               .method826(8.0F)
               .method834(22.0F)
               .method835(1231.0F)
               .method839(new Color(0, 0, 0, 255).getRGB())
               .method825(
                  new Color(0, 0, 0, 255).getRGB(), new Color(0, 0, 0, 255).getRGB(), new Color(0, 0, 0, 255).getRGB(), new Color(0, 0, 0, 255).getRGB()
               )
               .method840()
         );
         List<Map<String, Object>> var10 = new ArrayList<>();
         if (Widget16.INSTANCE.getCategory() == Helper269.CONFIGS) {
            if (!this.loadedConfigs) {
               this.method424();
               this.loadedConfigs = true;
            }

            if (this.cloudLoading && !this.isDefaultTab) {
               if (this.cloudDataReady && System.currentTimeMillis() - this.cloudLoadStartTime >= 3000L) {
                  this.configs = this.tempConfigs;
                  this.cloudLoading = false;
               }

               this.loadingAlpha = Helper147.method1245(this.loadingAlpha, 1.0F, 0.1F);
               this.configsAlpha = Helper147.method1245(this.configsAlpha, 0.0F, 0.1F);
            } else {
               this.loadingAlpha = Helper147.method1245(this.loadingAlpha, 0.0F, 0.1F);
               this.configsAlpha = Helper147.method1245(this.configsAlpha, 1.0F, 0.1F);
            }

            rectangle.method677(
               Helper80.method841(var1.getMatrices(), this.x + 55.0F, this.y + 38.0F, 70.0, 15.0)
                  .method826(3.0F)
                  .method835(2.0F)
                  .method834(1.0F)
                  .method839(new Color(54, 54, 56, 255).getRGB())
                  .method825(
                     new Color(0, 0, 0, 255).getRGB(),
                     new Color(31, 27, 35, 75).getRGB(),
                     new Color(31, 27, 35, 75).getRGB(),
                     new Color(31, 27, 35, 75).getRGB()
                  )
                  .method840()
            );
            float var11 = this.isDefaultTab ? 55.0F : 90.0F;
            this.highlightX = Helper147.method1245(this.highlightX, var11, 0.2F);
            rectangle.method677(
               Helper80.method841(var1.getMatrices(), this.x + this.highlightX, this.y + 38.0F, 35.0, 15.0)
                  .method826(3.0F)
                  .method835(0.0F)
                  .method834(0.0F)
                  .method839(new Color(54, 54, 56, 0).getRGB())
                  .method825(
                     new Color(0, 0, 0, 255).getRGB(),
                     new Color(65, 65, 65, 255).getRGB(),
                     new Color(65, 65, 65, 255).getRGB(),
                     new Color(65, 65, 65, 255).getRGB()
                  )
                  .method840()
            );
            rectangle.method677(
               Helper80.method841(var1.getMatrices(), this.x + 43.0F, this.y + 60.0F, this.width - 43.0F, 0.5)
                  .method825(
                     new Color(0, 0, 0, 255).getRGB(),
                     new Color(55, 55, 70, 15).getRGB(),
                     new Color(55, 55, 70, 250).getRGB(),
                     new Color(55, 55, 70, 15).getRGB()
                  )
                  .method840()
            );
            Helper103.method927(16, Helper101.DEFAULT).method1474(var5, "Default", this.x + 60.0F, this.y + 43.0F, Helper133.method1159(0.7F));
            Helper103.method927(16, Helper101.DEFAULT).method1474(var5, "Cloud", this.x + 97.0F, this.y + 43.0F, Helper133.method1159(0.7F));
            blur.method677(
               Helper80.method841(var1.getMatrices(), this.x + 340.0F, this.y + 38.0F, 80.0, 15.0)
                  .method826(3.0F)
                  .method838(64.0F)
                  .method823(new Color(0, 0, 0, 255).getRGB())
                  .method840()
            );
            rectangle.method677(
               Helper80.method841(var1.getMatrices(), this.x + 340.0F, this.y + 38.0F, 80.0, 15.0)
                  .method826(3.0F)
                  .method834(2.0F)
                  .method835(0.5F)
                  .method839(new Color(18, 19, 20, 225).getRGB())
                  .method825(
                     new Color(18, 19, 20, 175).getRGB(),
                     new Color(0, 2, 5, 175).getRGB(),
                     new Color(0, 2, 5, 175).getRGB(),
                     new Color(18, 19, 20, 175).getRGB()
                  )
                  .method840()
            );
            blur.method677(
               Helper80.method841(var1.getMatrices(), this.x + 292.0F, this.y + 38.0F, 40.0, 15.0)
                  .method826(3.0F)
                  .method838(64.0F)
                  .method823(new Color(0, 0, 0, 200).getRGB())
                  .method840()
            );
            rectangle.method677(
               Helper80.method841(var1.getMatrices(), this.x + 292.0F, this.y + 38.0F, 40.0, 15.0)
                  .method826(3.0F)
                  .method834(2.0F)
                  .method835(0.5F)
                  .method839(new Color(18, 19, 20, 225).getRGB())
                  .method825(
                     new Color(18, 19, 20, 175).getRGB(),
                     new Color(0, 2, 5, 175).getRGB(),
                     new Color(0, 2, 5, 175).getRGB(),
                     new Color(18, 19, 20, 175).getRGB()
                  )
                  .method840()
            );
            rectangle.method677(
               Helper80.method841(var5, this.x + 405.0F, this.y + 42.0F, 0.5, 7.0).method823(new Color(155, 155, 155, 55).getRGB()).method840()
            );
            Helper103.method927(20, Helper101.GUIICONS).method1474(var5, "r", this.x + 296.0F, this.y + 42.0F, Helper133.method1159(1.0F));
            Helper103.method927(16, Helper101.REGULAR).method1474(var5, "Save", this.x + 307.0F, this.y + 43.5F, Helper133.method1159(1.0F));
            blur.method677(
               Helper80.method841(var1.getMatrices(), this.x + 250.0F, this.y + 38.0F, 38.0, 15.0)
                  .method826(3.0F)
                  .method838(64.0F)
                  .method823(new Color(0, 0, 0, 200).getRGB())
                  .method840()
            );
            rectangle.method677(
               Helper80.method841(var1.getMatrices(), this.x + 250.0F, this.y + 38.0F, 38.0, 15.0)
                  .method826(3.0F)
                  .method834(2.0F)
                  .method835(0.5F)
                  .method839(new Color(18, 19, 20, 225).getRGB())
                  .method825(
                     new Color(18, 19, 20, 175).getRGB(),
                     new Color(0, 2, 5, 175).getRGB(),
                     new Color(0, 2, 5, 175).getRGB(),
                     new Color(18, 19, 20, 175).getRGB()
                  )
                  .method840()
            );
            Helper103.method927(21, Helper101.GUIICONS).method1474(var5, "O", this.x + 253.0F, this.y + 43.0F, Helper133.method1159(1.0F));
            Helper103.method927(16, Helper101.REGULAR).method1474(var5, "Clear", this.x + 263.0F, this.y + 43.5F, Helper133.method1159(1.0F));
            String var12 = this.isDefaultTab ? "Поиск" : "Добавить по ID";
            String var13 = this.configInput.isEmpty() && !this.editingInput ? var12 : this.configInput;
            Helper103.method927(15, Helper101.REGULAR).method1474(var5, var13, this.x + 343.0F, this.y + 43.5F, Helper133.method1159(0.6F));
            Helper103.method927(26, Helper101.ICONS).method1474(var5, "U", this.x + 405.0F, this.y + 41.0F, Helper133.method1159(0.6F));
            if (this.editingInput && System.currentTimeMillis() % 1000L < 500L) {
               float var14 = Helper103.method927(15, Helper101.REGULAR).method1479(this.configInput.substring(0, this.inputCursor));
               Helper103.method927(15, Helper101.DEFAULT)
                  .method1474(var5, "|", this.x + 342.0F + var14, this.y + 43.5F - 0.5F, Helper133.method1159(0.7F));
            }

            var10 = this.isDefaultTab
               ? this.configs
                  .stream()
                  .filter(var1x -> ((String)var1x.get("name")).toLowerCase().contains(this.configInput.toLowerCase()))
                  .collect(Collectors.toList())
               : this.configs;
            byte var50 = 2;
            int var15 = var10.size();
            int var16 = (var15 + var50 - 1) / var50;
            float var17 = var15 > 0 ? 50.0F + (var16 - 1) * 55.0F : 0.0F;
            float var18 = this.height - 70.0F;
            float var19 = Math.max(0.0F, var17 - var18) + 7.0F;
            if (var15 < 7) {
               var19 = 0.0F;
               this.scroll = 0.0F;
               this.smoothedScroll = 0.0F;
            }

            this.scroll = MathHelper.clamp(this.scroll, -var19, 0.0F);
            this.smoothedScroll = Helper147.method1245(this.smoothedScroll, this.scroll, 0.2F);
            Matrix4f var20 = var5.peek().getPositionMatrix();
            Helper140 var21 = Releon.method71().method30();
            float var22 = this.x + 43.0F;
            float var23 = this.y + 65.0F;
            float var24 = this.width - 43.0F - 15.0F;
            var21.method1209(var20, var22, var23, var24, var18);
            if (!this.isDefaultTab) {
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, this.configsAlpha);
            }

            float var26 = this.y + 70.0F + this.smoothedScroll;
            int var27 = 0;

            for (Map<String, Object> var29 : var10) {
               String var30 = (String)var29.get("name");
               float var31 = this.x + 55.0F + var27 % var50 * 190;
               if (var27 % var50 == 0 && var27 > 0) {
                  var26 += 55.0F;
               }

               if (var26 + 50.0F > this.y + 60.0F && var26 < this.y + this.height) {
                  blur.method677(
                     Helper80.method841(var5, var31, var26, 180.0, 50.0)
                        .method826(5.0F)
                        .method838(64.0F)
                        .method823(new Color(0, 0, 0, 200).getRGB())
                        .method840()
                  );
                  rectangle.method677(
                     Helper80.method841(var5, var31, var26, 180.0, 50.0)
                        .method826(5.0F)
                        .method834(2.0F)
                        .method835(0.1F)
                        .method839(new Color(28, 29, 30, 225).getRGB())
                        .method825(
                           new Color(18, 19, 20, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(18, 19, 20, 175).getRGB()
                        )
                        .method840()
                  );
                  rectangle.method677(
                     Helper80.method841(var1.getMatrices(), var31, var26 + 22.0F, 180.0, 0.5)
                        .method825(
                           new Color(55, 55, 70, 250).getRGB(),
                           new Color(55, 55, 70, 15).getRGB(),
                           new Color(55, 55, 70, 250).getRGB(),
                           new Color(55, 55, 70, 15).getRGB()
                        )
                        .method840()
                  );
                  rectangle.method677(
                     Helper80.method841(var1.getMatrices(), var31, var26, 20.5, 19.0)
                        .method828(1.0F, 7.0F, 4.0F, 1.0F)
                        .method835(2.0F)
                        .method834(1.0F)
                        .method839(new Color(54, 54, 56, 255).getRGB())
                        .method825(
                           new Color(55, 55, 55, 255).getRGB(),
                           new Color(55, 55, 55, 255).getRGB(),
                           new Color(55, 55, 55, 255).getRGB(),
                           new Color(55, 55, 55, 255).getRGB()
                        )
                        .method840()
                  );
                  Helper103.method927(26, Helper101.ICONSCATEGORY).method1474(var5, "F", var31 + 3.5F, var26 + 5.0F, Helper133.method1160());
                  if (var30.equals(this.editingConfig)) {
                     String var32 = this.newName;
                     Helper103.method927(16, Helper101.DEFAULT).method1474(var5, var32, var31 + 25.0F, var26 + 9.0F, Helper133.method1160());
                     if (System.currentTimeMillis() % 1000L < 500L) {
                        float var33 = Helper103.method927(16, Helper101.DEFAULT).method1479(this.newName.substring(0, this.editCursor));
                        Helper103.method927(16, Helper101.DEFAULT)
                           .method1474(var5, "|", var31 + 24.0F + var33, var26 + 9.0F - 0.5F, Helper133.method1160());
                     }
                  } else {
                     Helper103.method927(16, Helper101.DEFAULT).method1474(var5, var30, var31 + 25.0F, var26 + 9.0F, Helper133.method1160());
                  }

                  Number var58 = (Number)var29.getOrDefault("created", 0L);
                  Number var34 = (Number)var29.getOrDefault("updated", 0L);
                  long var35 = var58.longValue();
                  long var37 = var34.longValue();
                  String var39 = var35 == 0L
                     ? "unknown"
                     : LocalDateTime.ofInstant(Instant.ofEpochMilli(var35), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                  String var40 = var37 == 0L
                     ? "unknown"
                     : LocalDateTime.ofInstant(Instant.ofEpochMilli(var37), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                  Helper103.method927(11, Helper101.REGULAR)
                     .method1474(var5, "Created: " + var39, var31 + 4.0F, var26 + 35.0F, Helper133.method1159(1.0F));
                  String var41 = "Updated: " + var40;
                  boolean var42 = (Boolean)var29.getOrDefault("has_update", false);
                  if (var42) {
                     var41 = var41 + " (доступно обновлений: 1)";
                  }

                  Helper103.method927(11, Helper101.REGULAR).method1474(var5, var41, var31 + 4.0F, var26 + 28.0F, Helper133.method1159(1.0F));
                  String var43 = (String)var29.getOrDefault("owner", this.isDefaultTab ? UserProfile.getInstance().profile("username") : "Unknown");
                  Helper103.method927(11, Helper101.REGULAR)
                     .method1474(var5, "Author: " + var43, var31 + 4.0F, var26 + 42.0F, Helper133.method1159(1.0F));
                  Object var44 = var29.getOrDefault("avatar_hash", var9.getAvatarId());
                  String var45;
                  if (var44 instanceof Map var46) {
                     var45 = (String)var46.get("namespace") + ":" + (String)var46.get("path");
                  } else {
                     var45 = var44.toString();
                  }

                  Helper178.method1507(var1, Identifier.of(var45), var31 + 157.0F, var26 + 3.0F, 16.0F, 7.5F, 0, 15, 21, Helper133.method1155(1.0F));
                  blur.method677(
                     Helper80.method841(var1.getMatrices(), var31 + 162.0F, var26 + 35.0F, 14.0, 15.0)
                        .method828(3.0F, 0.0F, 3.0F, 0.0F)
                        .method838(64.0F)
                        .method823(new Color(0, 0, 0, 200).getRGB())
                        .method840()
                  );
                  rectangle.method677(
                     Helper80.method841(var1.getMatrices(), var31 + 162.0F, var26 + 35.0F, 14.0, 15.0)
                        .method828(3.0F, 0.0F, 3.0F, 0.0F)
                        .method834(2.0F)
                        .method835(0.1F)
                        .method839(new Color(18, 19, 20, 225).getRGB())
                        .method825(
                           new Color(28, 29, 30, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(28, 29, 30, 175).getRGB()
                        )
                        .method840()
                  );
                  blur.method677(
                     Helper80.method841(var1.getMatrices(), var31 + 146.0F, var26 + 35.0F, 14.0, 15.0)
                        .method828(3.0F, 0.0F, 3.0F, 0.0F)
                        .method838(64.0F)
                        .method823(new Color(0, 0, 0, 200).getRGB())
                        .method840()
                  );
                  rectangle.method677(
                     Helper80.method841(var1.getMatrices(), var31 + 146.0F, var26 + 35.0F, 14.0, 15.0)
                        .method828(3.0F, 0.0F, 3.0F, 0.0F)
                        .method834(2.0F)
                        .method835(0.1F)
                        .method839(new Color(18, 19, 20, 225).getRGB())
                        .method825(
                           new Color(28, 29, 30, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(28, 29, 30, 175).getRGB()
                        )
                        .method840()
                  );
                  blur.method677(
                     Helper80.method841(var1.getMatrices(), var31 + 130.25F, var26 + 35.0F, 14.0, 15.0)
                        .method828(3.0F, 0.0F, 3.0F, 0.0F)
                        .method838(64.0F)
                        .method823(new Color(0, 0, 0, 200).getRGB())
                        .method840()
                  );
                  rectangle.method677(
                     Helper80.method841(var1.getMatrices(), var31 + 130.25F, var26 + 35.0F, 14.0, 15.0)
                        .method828(3.0F, 0.0F, 3.0F, 0.0F)
                        .method834(2.0F)
                        .method835(0.1F)
                        .method839(new Color(18, 19, 20, 225).getRGB())
                        .method825(
                           new Color(28, 29, 30, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(28, 29, 30, 175).getRGB()
                        )
                        .method840()
                  );
                  blur.method677(
                     Helper80.method841(var1.getMatrices(), var31 + 114.35F, var26 + 35.0F, 14.0, 15.0)
                        .method828(3.0F, 0.0F, 3.0F, 0.0F)
                        .method838(64.0F)
                        .method823(new Color(0, 0, 0, 200).getRGB())
                        .method840()
                  );
                  rectangle.method677(
                     Helper80.method841(var1.getMatrices(), var31 + 114.35F, var26 + 35.0F, 14.0, 15.0)
                        .method828(3.0F, 0.0F, 3.0F, 0.0F)
                        .method834(2.0F)
                        .method835(0.1F)
                        .method839(new Color(18, 19, 20, 225).getRGB())
                        .method825(
                           new Color(28, 29, 30, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(0, 2, 5, 175).getRGB(),
                           new Color(28, 29, 30, 175).getRGB()
                        )
                        .method840()
                  );
                  Helper103.method927(31, Helper101.GUIICONS).method1474(var5, "P", var31 + 164.0F, var26 + 36.0F, Helper133.method1159(1.0F));
                  Helper103.method927(21, Helper101.GUIICONS).method1474(var5, "N", var31 + 149.0F, var26 + 39.5F, Helper133.method1159(1.0F));
                  Helper103.method927(22, Helper101.GUIICONS).method1474(var5, "M", var31 + 133.0F, var26 + 38.5F, Helper133.method1159(1.0F));
                  Helper103.method927(24, Helper101.GUIICONS).method1474(var5, "O", var31 + 117.0F, var26 + 38.0F, Helper133.method1159(1.0F));
               }

               var27++;
            }

            if (!this.isDefaultTab) {
               RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            }

            var21.method1210();
            if (var19 > 0.0F) {
               float var53 = 4.0F;
               float var54 = this.x + this.width - 10.0F;
               float var55 = this.y + 65.0F;
               float var56 = this.height - 70.0F;
               rectangle.method677(
                  Helper80.method841(var1.getMatrices(), var54, var55, var53, var56)
                     .method826(2.0F)
                     .method823(new Color(30, 30, 30, 100).getRGB())
                     .method840()
               );
               float var57 = Math.max(20.0F, var56 * (var18 / var17));
               float var59 = var19 > 0.0F ? -this.smoothedScroll / var19 : 0.0F;
               float var60 = var55 + (var56 - var57) * var59;
               rectangle.method677(
                  Helper80.method841(var1.getMatrices(), var54, var60, var53, var57)
                     .method826(2.0F)
                     .method823(new Color(100, 100, 100, 150).getRGB())
                     .method840()
               );
            }
         } else {
            this.loadedConfigs = false;
         }

         rectangle.method677(
            Helper80.method841(var1.getMatrices(), this.x + 42.5F, this.y, 0.5, this.height)
               .method825(
                  new Color(55, 55, 70, 0).getRGB(), new Color(55, 55, 70, 0).getRGB(), new Color(55, 55, 70, 0).getRGB(), new Color(55, 55, 70, 0).getRGB()
               )
               .method840()
         );
         rectangle.method677(
            Helper80.method841(var1.getMatrices(), this.x + 405.0F, this.y + 28.0F, this.width - 43.0F, 0.5)
               .method825(
                  new Color(55, 55, 70, 0).getRGB(), new Color(55, 55, 70, 0).getRGB(), new Color(55, 55, 70, 0).getRGB(), new Color(55, 55, 70, 0).getRGB()
               )
               .method840()
         );
         blur.method677(
            Helper80.method841(var5, this.x + 405.0F, this.y + 5.0F, 20.0, 20.0)
               .method826(5.0F)
               .method838(64.0F)
               .method823(new Color(0, 0, 0, 0).getRGB())
               .method840()
         );
         rectangle.method677(
            Helper80.method841(var5, this.x + 405.0F, this.y + 5.0F, 20.0, 20.0)
               .method826(5.0F)
               .method834(22.0F)
               .method835(0.1F)
               .method839(new Color(18, 19, 20, 0).getRGB())
               .method825(new Color(18, 19, 20, 0).getRGB(), new Color(0, 2, 5, 0).getRGB(), new Color(0, 2, 5, 0).getRGB(), new Color(18, 19, 20, 0).getRGB())
               .method840()
         );
         Helper103.method927(26, Helper101.ICONS).method1474(var5, "G", this.x + 408.5F, this.y + 10.0F, this.clientColor);
         String var47 = "";
         switch (Widget16.INSTANCE.getCategory()) {
            case COMBAT:
               var47 = "";
               break;
            case MOVEMENT:
               var47 = "";
               break;
            case RENDER:
               var47 = "";
               break;
            case PLAYER:
               var47 = "";
               break;
            case MISC:
               var47 = "";
         }

         Helper103.method927(18, Helper101.ICONSCATEGORY).method1474(var5, var47, this.x + 54.0F, this.y + 14.0F, new Color(225, 225, 255, 255).getRGB());
         if (Widget16.INSTANCE.getCategory() == Helper269.CONFIGS && var10.isEmpty()) {
            String var48 = "Тута пуста :(";
            float var49 = 0.7F;
            if (!this.isDefaultTab && this.cloudLoading) {
               long var51 = System.currentTimeMillis() - this.cloudLoadStartTime;
               int var52 = (int)(var51 / 500L % 3L) + 1;
               var48 = "Loading" + ".".repeat(var52);
               var49 = this.loadingAlpha;
            } else if (!this.cloudLoading) {
               var49 = this.configsAlpha;
            }

            Helper103.method927(20, Helper101.DEFAULT)
               .method1474(
                  var5,
                  var48,
                  this.x + this.width / 2.0F - Helper103.method927(20, Helper101.DEFAULT).method1479(var48) / 2.0F + 10.0F,
                  this.y + this.height / 2.0F + 15.0F,
                  Helper133.method1159(var49)
               );
         }

         if (Widget16.INSTANCE.getCategory() == Helper269.CONFIGS) {
            Helper103.method927(15, Helper101.DEFAULT)
               .method1474(
                  var5, var8 + Widget16.INSTANCE.getCategory().method2734() + " | Beta", this.x + 63.0F, this.y + 13.5F, new Color(0, 0, 0, 255).getRGB()
               );
         } else {
            Helper103.method927(15, Helper101.DEFAULT)
               .method1474(var5, var8 + Widget16.INSTANCE.getCategory().method2734(), this.x + 63.0F, this.y + 13.5F, new Color(0, 0, 0, 255).getRGB());
         }

         Releon.method71().method30().method1210();
      }
   }

   @Override
   public boolean method247(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.editingInput = false;
      }

      if (Widget16.INSTANCE.getCategory() == Helper269.CONFIGS && var5 == 0) {
         if (Helper147.method1224(var1, var3, this.x + 55.0F, this.y + 38.0F, 35.0, 15.0)) {
            this.isDefaultTab = true;
            this.loadingAlpha = 0.0F;
            this.configsAlpha = 1.0F;
            this.method424();
            return true;
         }

         if (Helper147.method1224(var1, var3, this.x + 90.0F, this.y + 38.0F, 35.0, 15.0)) {
            this.isDefaultTab = false;
            this.loadingAlpha = 0.0F;
            this.configsAlpha = 0.0F;
            this.method424();
            return true;
         }

         if (Helper147.method1224(var1, var3, this.x + 340.0F, this.y + 38.0F, 80.0, 15.0)) {
            this.editingInput = true;
            this.inputCursor = this.configInput.length();
            return true;
         }

         if (Helper147.method1224(var1, var3, this.x + 292.0F, this.y + 38.0F, 40.0, 15.0)) {
            if (this.isDefaultTab) {
               this.method427();
            } else {
               this.method428();
            }

            this.method424();
            return true;
         }

         if (Helper147.method1224(var1, var3, this.x + 250.0F, this.y + 38.0F, 38.0, 15.0)) {
            this.method429();
            this.method424();
            return true;
         }

         List<Map<String, Object>> var6 = this.isDefaultTab
            ? this.configs
               .stream()
               .filter(var1x -> ((String)var1x.get("name")).toLowerCase().contains(this.configInput.toLowerCase()))
               .collect(Collectors.toList())
            : this.configs;
         float var7 = this.y + 70.0F + this.smoothedScroll;
         int var8 = 0;

         for (Map<String, Object> var10 : var6) {
            String var11 = (String)var10.get("name");
            float var12 = this.x + 55.0F + var8 % 2 * 190;
            if (var8 % 2 == 0 && var8 > 0) {
               var7 += 55.0F;
            }

            double var13 = var12 + 25.0F;
            double var15 = var7 + 9.0F;
            double var17 = Helper103.method927(16, Helper101.DEFAULT).method1479(var11);
            double var19 = 10.0;
            if (Helper147.method1224(var1, var3, var13, var15 - 2.0, var17, var19)) {
               if (this.isDefaultTab) {
                  this.editingConfig = var11;
                  this.newName = var11;
                  this.editCursor = this.newName.length();
               } else {
                  MinecraftClient.getInstance().keyboard.setClipboard(var11);
               }

               return true;
            }

            if (Helper147.method1224(var1, var3, var12 + 162.0F, var7 + 35.0F, 14.0, 15.0)) {
               if (this.isDefaultTab) {
                  try {
                     File var30 = new File(Releon.method71().method31().method3925(), "Custom");
                     File var33 = new File(var30, var11 + ".json");
                     String var35 = new String(Files.readAllBytes(var33.toPath()));
                     File var37 = new File(Releon.method71().method31().method3927(), "temp.json");
                     Files.write(var37.toPath(), var35.getBytes());
                     Releon.method71().method29().method899("temp.json");
                     var37.delete();
                  } catch (Helper122 | IOException var25) {
                  }
               } else {
                  this.method435(var11);
                  this.isDefaultTab = true;
                  this.method424();
               }

               return true;
            }

            if (Helper147.method1224(var1, var3, var12 + 146.0F, var7 + 35.0F, 14.0, 15.0)) {
               if (this.isDefaultTab) {
                  try {
                     File var29 = new File(Releon.method71().method31().method3925(), "Custom");
                     File var32 = new File(var29, var11 + ".json");
                     String var34 = new String(Files.readAllBytes(var32.toPath()));
                     File var36 = new File(Releon.method71().method31().method3927(), "temp.json");
                     Files.write(var36.toPath(), var34.getBytes());
                     Releon.method71().method29().method899("temp.json");
                     var36.delete();
                  } catch (Helper122 | IOException var26) {
                  }
               } else {
                  this.method435(var11);
                  this.isDefaultTab = true;
                  this.method424();
               }

               return true;
            }

            if (Helper147.method1224(var1, var3, var12 + 130.25, var7 + 35.0F, 14.0, 15.0)) {
               if (this.isDefaultTab) {
                  String var28 = (String)var10.get("cloud_id");
                  if (var28 != null) {
                     this.method436(var11, var28);
                  } else {
                     try {
                        File var31 = new File(Releon.method71().method31().method3925(), "Custom");
                        File var23 = new File(var31, var11 + ".json");
                        String var24 = this.method430();
                        Files.write(var23.toPath(), var24.getBytes());
                     } catch (IOException var27) {
                     }
                  }
               } else {
                  this.method433(var11);
               }

               this.method424();
               return true;
            }

            if (Helper147.method1224(var1, var3, var12 + 114.35, var7 + 35.0F, 14.0, 15.0)) {
               if (this.isDefaultTab) {
                  File var21 = new File(Releon.method71().method31().method3925(), "Custom");
                  File var22 = new File(var21, var11 + ".json");
                  var22.delete();
               } else {
                  this.method437(var11);
               }

               this.method424();
               return true;
            }

            var8++;
         }
      } else {
         this.editingConfig = null;
         this.editingInput = false;
      }

      return super.method247(var1, var3, var5);
   }

   @Override
   public boolean method249(double var1, double var3, double var5) {
      if (Widget16.INSTANCE.getCategory() == Helper269.CONFIGS
         && Helper147.method1224(var1, var3, this.x + 43.0F, this.y + 65.0F, this.width - 43.0F - 15.0F, this.height - 70.0F)) {
         this.scroll = (float)(this.scroll + var5 * 20.0);
         return true;
      } else {
         return super.method249(var1, var3, var5);
      }
   }

   @Override
   public boolean method250(int var1, int var2, int var3) {
      if (this.editingInput) {
         if (var1 == 257) {
            if (!this.isDefaultTab && this.configInput.length() == 8 && this.configInput.matches("\\d+")) {
               this.method435(this.configInput);
               this.isDefaultTab = true;
            }

            this.configInput = "";
            this.inputCursor = 0;
            this.editingInput = false;
            this.method424();
            return true;
         }

         if (var1 == 256) {
            this.configInput = "";
            this.inputCursor = 0;
            this.editingInput = false;
            return true;
         }

         if (var1 == 259) {
            if (this.inputCursor > 0) {
               this.configInput = this.configInput.substring(0, this.inputCursor - 1) + this.configInput.substring(this.inputCursor);
               this.inputCursor--;
            }

            return true;
         }

         if (var1 == 263) {
            if (this.inputCursor > 0) {
               this.inputCursor--;
            }

            return true;
         }

         if (var1 == 262) {
            if (this.inputCursor < this.configInput.length()) {
               this.inputCursor++;
            }

            return true;
         }

         if (var1 == 86 && (var3 & 2) != 0) {
            String var4 = MinecraftClient.getInstance().keyboard.getClipboard().trim();
            if (!this.isDefaultTab) {
               var4 = var4.replaceAll("\\D", "");
               int var5 = 8 - this.configInput.length();
               if (var4.length() > var5) {
                  var4 = var4.substring(0, var5);
               }
            } else {
               int var9 = 15 - this.configInput.length();
               if (var4.length() > var9) {
                  var4 = var4.substring(0, var9);
               }
            }

            this.configInput = this.configInput.substring(0, this.inputCursor) + var4 + this.configInput.substring(this.inputCursor);
            this.inputCursor = this.inputCursor + var4.length();
            return true;
         }
      } else if (this.editingConfig != null) {
         if (var1 == 257) {
            if (this.isDefaultTab) {
               File var8 = new File(Releon.method71().method31().method3925(), "Custom");
               File var11 = new File(var8, this.editingConfig + ".json");
               File var6 = new File(var8, this.newName + ".json");
               if (!this.newName.isEmpty() && this.newName.length() <= 15 && var11.exists() && (!var6.exists() || this.newName.equals(this.editingConfig))) {
                  var11.renameTo(var6);
               }
            }

            this.editingConfig = null;
            this.method424();
            return true;
         }

         if (var1 == 256) {
            this.editingConfig = null;
            return true;
         }

         if (var1 == 259) {
            if (this.editCursor > 0) {
               this.newName = this.newName.substring(0, this.editCursor - 1) + this.newName.substring(this.editCursor);
               this.editCursor--;
            }

            return true;
         }

         if (var1 == 263) {
            if (this.editCursor > 0) {
               this.editCursor--;
            }

            return true;
         }

         if (var1 == 262) {
            if (this.editCursor < this.newName.length()) {
               this.editCursor++;
            }

            return true;
         }

         if (var1 == 86 && (var3 & 2) != 0) {
            String var7 = MinecraftClient.getInstance().keyboard.getClipboard().trim();
            int var10 = 15 - this.newName.length();
            if (var7.length() > var10) {
               var7 = var7.substring(0, var10);
            }

            this.newName = this.newName.substring(0, this.editCursor) + var7 + this.newName.substring(this.editCursor);
            this.editCursor = this.editCursor + var7.length();
            return true;
         }
      }

      return super.method250(var1, var2, var3);
   }

   @Override
   public boolean method251(char var1, int var2) {
      if (this.editingInput) {
         if (this.isDefaultTab && this.configInput.length() < 15 && Character.isLetterOrDigit(var1)) {
            this.configInput = this.configInput.substring(0, this.inputCursor) + var1 + this.configInput.substring(this.inputCursor);
            this.inputCursor++;
            return true;
         }

         if (!this.isDefaultTab && this.configInput.length() < 8 && Character.isDigit(var1)) {
            this.configInput = this.configInput.substring(0, this.inputCursor) + var1 + this.configInput.substring(this.inputCursor);
            this.inputCursor++;
            return true;
         }
      } else if (this.editingConfig != null && this.newName.length() < 15 && Character.isLetterOrDigit(var1)) {
         this.newName = this.newName.substring(0, this.editCursor) + var1 + this.newName.substring(this.editCursor);
         this.editCursor++;
         return true;
      }

      return super.method251(var1, var2);
   }

   private void method424() {
      if (this.isDefaultTab) {
         this.configs = this.method425();
      } else {
         if (this.cloudLoading) {
            return;
         }

         this.cloudLoading = true;
         this.cloudDataReady = false;
         this.configs = new ArrayList<>();
         this.cloudLoadStartTime = System.currentTimeMillis();
         new Thread(() -> {
            List var1 = this.method426();
            MinecraftClient.getInstance().execute(() -> {
               this.tempConfigs = var1;
               this.cloudDataReady = true;
            });
         }).start();
      }
   }

   private List<Map<String, Object>> method425() {
      ArrayList var1 = new ArrayList();
      File var2 = new File(Releon.method71().method31().method3925(), "Custom");
      File[] var3 = var2.listFiles();
      if (var3 != null) {
         for (File var7 : var3) {
            if (var7.isFile() && var7.getName().endsWith(".json")) {
               String var8 = var7.getName().replace(".json", "");
               long var9 = var7.lastModified();
               HashMap var11 = new HashMap();
               var11.put("name", var8);
               var11.put("created", var9);
               var11.put("updated", var9);
               String var12 = "";

               try {
                  var12 = new String(Files.readAllBytes(var7.toPath()));
               } catch (IOException var19) {
               }

               if (!var12.isEmpty()) {
                  Gson var13 = new Gson();
                  Map var14 = (Map)var13.fromJson(var12, Map.class);
                  String var15 = (String)var14.get("cloud_id");
                  if (var15 != null) {
                     var11.put("cloud_id", var15);
                     Map var16 = this.method432(var15);
                     if (var16 != null) {
                        long var17 = ((Number)var16.get("updated")).longValue();
                        if (var17 > var9) {
                           var11.put("has_update", true);
                        }

                        var11.put("owner", var16.get("owner"));
                        var11.put("avatar_hash", var16.get("avatar_hash"));
                     }
                  }
               }

               var1.add(var11);
            }
         }
      }

      return var1;
   }

   private List<Map<String, Object>> method426() {
      try {
         if (!Releon.method71().method34().method1611()) {
            return new ArrayList<>();
         }

         Gson var1 = new Gson();
         HashMap var2 = new HashMap();
         var2.put("command", "list");
         var2.put("username", UserProfile.getInstance().profile("username"));
         var2.put("uuid", UserProfile.getInstance().profile("uid"));
         String var3 = var1.toJson(var2);
         String var4 = Releon.method71().method34().method1612(var3);
         if (var4 == null) {
            return new ArrayList<>();
         }

         Map var5 = (Map)var1.fromJson(var4, Map.class);
         if ((Boolean)var5.get("success")) {
            return (List<Map<String, Object>>)var5.get("data");
         }
      } catch (Exception var6) {
         System.err.println("Failed to get cloud configs: " + var6.getMessage());
      }

      return new ArrayList<>();
   }

   private void method427() {
      Random var1 = new Random();
      File var2 = new File(Releon.method71().method31().method3925(), "Custom");

      String var3;
      do {
         var3 = "ReleonConfig" + String.format("%03d", var1.nextInt(1000));
      } while (new File(var2, var3 + ".json").exists());

      try {
         File var4 = new File(var2, var3 + ".json");
         String var5 = this.method430();
         Files.write(var4.toPath(), var5.getBytes());
      } catch (IOException var6) {
      }
   }

   private void method428() {
      Random var1 = new Random();

      String var2;
      do {
         var2 = String.format("%08d", var1.nextInt(100000000));
      } while (this.method431(var2) != null);

      this.method433(var2);
   }

   private void method429() {
      if (this.isDefaultTab) {
         File var1 = new File(Releon.method71().method31().method3925(), "Custom");
         File[] var2 = var1.listFiles();
         if (var2 != null) {
            for (File var6 : var2) {
               if (var6.getName().endsWith(".json")) {
                  var6.delete();
               }
            }
         }
      } else {
         for (Map var8 : this.configs) {
            this.method437((String)var8.get("name"));
         }
      }
   }

   private String method430() {
      String var1 = "";
      File var2 = new File(Releon.method71().method31().method3925(), "Custom");
      File var3 = new File(var2, "temp.json");

      try {
         Releon.method71().method29().method898("temp.json");
         var1 = new String(Files.readAllBytes(var3.toPath()));
      } catch (IOException | Helper111 var8) {
      } finally {
         var3.delete();
      }

      return var1;
   }

   private String method431(String var1) {
      try {
         if (!Releon.method71().method34().method1611()) {
            return null;
         }

         Gson var2 = new Gson();
         HashMap var3 = new HashMap();
         var3.put("command", "load");
         var3.put("username", UserProfile.getInstance().profile("username"));
         var3.put("uuid", UserProfile.getInstance().profile("uid"));
         var3.put("configName", var1);
         String var4 = var2.toJson(var3);
         String var5 = Releon.method71().method34().method1612(var4);
         if (var5 == null) {
            return null;
         }

         Map var6 = (Map)var2.fromJson(var5, Map.class);
         if ((Boolean)var6.get("success")) {
            Object var7 = var6.get("data");
            return var2.toJson(var7);
         }
      } catch (Exception var8) {
         System.err.println("Failed to get cloud config: " + var8.getMessage());
      }

      return null;
   }

   private Map<String, Object> method432(String var1) {
      try {
         if (!Releon.method71().method34().method1611()) {
            return null;
         }

         Gson var2 = new Gson();
         HashMap var3 = new HashMap();
         var3.put("command", "metadata");
         var3.put("username", UserProfile.getInstance().profile("username"));
         var3.put("uuid", UserProfile.getInstance().profile("uid"));
         var3.put("configName", var1);
         String var4 = var2.toJson(var3);
         String var5 = Releon.method71().method34().method1612(var4);
         if (var5 == null) {
            return null;
         }

         Map var6 = (Map)var2.fromJson(var5, Map.class);
         if ((Boolean)var6.get("success")) {
            return (Map<String, Object>)var6.get("data");
         }
      } catch (Exception var7) {
         System.err.println("Failed to get cloud metadata: " + var7.getMessage());
      }

      return null;
   }

   private void method433(String var1) {
      String var2 = this.method430();
      if (!var2.isEmpty()) {
         Gson var3 = new Gson();
         LinkedHashMap var4 = new LinkedHashMap();
         long var5 = System.currentTimeMillis();
         String var7 = this.method431(var1);
         long var8 = var5;
         if (var7 != null) {
            Map var10 = (Map)var3.fromJson(var7, Map.class);
            var8 = ((Number)var10.get("created")).longValue();
         }

         var4.put("owner", UserProfile.getInstance().profile("username"));
         var4.put("created", var8);
         var4.put("updated", var5);
         var4.put("avatar_hash", Releon.method71().method27().getAvatarId().toString());
         Map var12 = (Map)var3.fromJson(var2, Map.class);
         var4.putAll(var12);
         var2 = var3.toJson(var4);
         this.method434(var1, var2);
      }
   }

   private void method434(String var1, String var2) {
      if (!var2.isEmpty()) {
         try {
            if (!Releon.method71().method34().method1611()) {
               System.err.println("Cannot save: WebSocket not connected");
               return;
            }

            Gson var3 = new Gson();
            HashMap var4 = new HashMap();
            var4.put("command", "save");
            var4.put("username", UserProfile.getInstance().profile("username"));
            var4.put("uuid", UserProfile.getInstance().profile("uid"));
            var4.put("configName", var1);
            var4.put("configData", var3.fromJson(var2, Map.class));
            String var5 = var3.toJson(var4);
            Releon.method71().method34().method1612(var5);
         } catch (Exception var6) {
            System.err.println("Failed to save cloud config: " + var6.getMessage());
         }
      }
   }

   private void method435(String var1) {
      String var2 = this.method431(var1);
      if (var2 != null && !var2.trim().isEmpty()) {
         Gson var3 = new Gson();

         Map var4;
         try {
            var4 = (Map)var3.fromJson(var2, Map.class);
         } catch (Exception var25) {
            System.err.println("Failed to parse cloud config JSON for " + var1 + ": " + var25.getMessage());
            return;
         }

         String var5 = (String)var4.get("owner");
         if (var4.get("created") instanceof Number) {
            ((Number)var4.get("created")).longValue();
         } else {
            long var10000 = 0L;
         }

         if (var4.get("updated") instanceof Number) {
            ((Number)var4.get("updated")).longValue();
         } else {
            long var33 = 0L;
         }

         Object var10 = var4.get("avatar_hash");
         Object var11 = null;
         if (var10 != null) {
            if (var10 instanceof Map var12) {
               String var13 = (String)var12.get("namespace");
               String var14 = (String)var12.get("path");
               if (var13 != null && var14 != null) {
                  var11 = var13 + ":" + var14;
               }
            } else {
               var11 = var10.toString();
            }
         }

         var4.remove("owner");
         var4.remove("created");
         var4.remove("updated");
         var4.remove("avatar_hash");
         var4.put("cloud_id", var1);
         String var29 = var3.toJson(var4);
         File var30 = new File(Releon.method71().method31().method3925(), "Custom");
         File var31 = new File(var30, "temp.json");

         try {
            Files.write(var31.toPath(), var29.getBytes());
            Releon.method71().method29().method899("temp.json");
         } catch (Helper122 | IOException var24) {
            System.err.println("Failed to load cloud config " + var1 + ": " + var24.getMessage());
         } finally {
            if (var31.exists()) {
               var31.delete();
            }
         }

         String var15 = (var5 != null ? var5 : "Unknown") + " Config";
         String var16 = var15;
         if (var5 != null && !var5.equals(UserProfile.getInstance().profile("username"))) {
            int var17 = 1;

            while (new File(var30, var16 + ".json").exists()) {
               var16 = var15 + " (" + var17++ + ")";
            }
         } else {
            var16 = "Cloud_" + var1;
         }

         File var32 = new File(var30, var16 + ".json");

         try {
            Files.write(var32.toPath(), var29.getBytes());
         } catch (IOException var23) {
            System.err.println("Failed to save local copy of cloud config " + var1 + ": " + var23.getMessage());
         }
      } else {
         System.err.println("Cloud config " + var1 + " not found or empty");
      }
   }

   private void method436(String var1, String var2) {
      String var3 = this.method431(var2);
      if (var3 != null) {
         Gson var4 = new Gson();
         Map var5 = (Map)var4.fromJson(var3, Map.class);
         var5.remove("owner");
         var5.remove("created");
         var5.remove("updated");
         var5.remove("avatar_hash");
         var5.put("cloud_id", var2);
         var3 = var4.toJson(var5);
         File var6 = new File(Releon.method71().method31().method3925(), "Custom");
         File var7 = new File(var6, "temp.json");

         try {
            Files.write(var7.toPath(), var3.getBytes());
            Releon.method71().method29().method899("temp.json");
            Files.write(new File(var6, var1 + ".json").toPath(), var3.getBytes());
         } catch (Helper122 | IOException var12) {
         } finally {
            var7.delete();
         }
      }
   }

   private void method437(String var1) {
      try {
         if (!Releon.method71().method34().method1611()) {
            System.err.println("Cannot remove: WebSocket not connected");
            return;
         }

         Gson var2 = new Gson();
         HashMap var3 = new HashMap();
         var3.put("command", "remove");
         var3.put("username", UserProfile.getInstance().profile("username"));
         var3.put("uuid", UserProfile.getInstance().profile("uid"));
         var3.put("configName", var1);
         String var4 = var2.toJson(var3);
         Releon.method71().method34().method1612(var4);
      } catch (Exception var5) {
         System.err.println("Failed to remove cloud config: " + var5.getMessage());
      }
   }

   public Widget13 method438(String var1) {
      this.editingConfig = var1;
      return this;
   }

   public Widget13 method439(String var1) {
      this.newName = var1;
      return this;
   }

   public Widget13 method440(int var1) {
      this.editCursor = var1;
      return this;
   }

   public Widget13 method441(boolean var1) {
      this.isDefaultTab = var1;
      return this;
   }

   public Widget13 method442(float var1) {
      this.highlightX = var1;
      return this;
   }

   public Widget13 method443(List<Map<String, Object>> var1) {
      this.configs = var1;
      return this;
   }

   public Widget13 method444(String var1) {
      this.configInput = var1;
      return this;
   }

   public Widget13 method445(boolean var1) {
      this.editingInput = var1;
      return this;
   }

   public Widget13 method446(int var1) {
      this.inputCursor = var1;
      return this;
   }

   public Widget13 method447(float var1) {
      this.scroll = var1;
      return this;
   }

   public Widget13 method448(float var1) {
      this.smoothedScroll = var1;
      return this;
   }

   public Widget13 method449(boolean var1) {
      this.loadedConfigs = var1;
      return this;
   }

   public Widget13 method450(boolean var1) {
      this.cloudLoading = var1;
      return this;
   }

   public Widget13 method451(long var1) {
      this.cloudLoadStartTime = var1;
      return this;
   }

   public Widget13 method452(boolean var1) {
      this.cloudDataReady = var1;
      return this;
   }

   public Widget13 method453(List<Map<String, Object>> var1) {
      this.tempConfigs = var1;
      return this;
   }

   public Widget13 method454(float var1) {
      this.loadingAlpha = var1;
      return this;
   }

   public Widget13 method455(float var1) {
      this.configsAlpha = var1;
      return this;
   }

   public Widget13 method456(int var1) {
      this.clientColor = var1;
      return this;
   }
}
