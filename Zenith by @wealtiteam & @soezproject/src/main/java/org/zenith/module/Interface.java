package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.NbtEditor;
import org.zenith.core.ServiceException;
import org.zenith.core.CloudResponse;
import org.zenith.core.ContainerScanner;
import org.zenith.event.Event19;
import org.zenith.utility.render.display.base.HudDrawContext;
import org.zenith.utility.render.display.base.RenderMathUtils;

import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.base.comand.CommandManager;
import org.zenith.module.Category;
import org.zenith.hud.HudElement;
import org.zenith.hud.HudElement_Var159;
import org.zenith.hud.HudElementMedia;
import org.zenith.hud.HudElementMessage;
import org.zenith.hud.HudElementMessages;
import org.zenith.hud.HudElementText;
import org.zenith.hud.HudElementText2;
import org.zenith.hud.HudElementValue;
import org.zenith.render.HudPreviewRenderQueue;
import org.zenith.util.MathUtils;
import org.zenith.module.Module;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.TextScanner;
import org.zenith.core.Easing;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.HudEffectIcons;
import org.zenith.core.HudArmorPanel;
import org.zenith.core.HudInventoryPanel;
import org.zenith.core.HudTextPanel;
import org.zenith.core.HudTabList;
import org.zenith.core.HudScoreboard;
import org.zenith.core.HudSelectedItemPanel;
import org.zenith.core.HudInfoBoxPrimary;
import org.zenith.core.HudClockPanel;
import org.zenith.core.HudMediaPanel;
import org.zenith.core.HudInfoBoxSecondary;
import org.zenith.core.HudTargetPanel;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.HudStatusPanel;
import org.zenith.core.GameCoordinator;
import org.zenith.core.AvatarRenderer;

import org.zenith.event.EventMouseButton;
import org.zenith.event.EventRenderScreenHook;
import org.zenith.event.EventTick;

import org.zenith.setting.BooleanSetting3;
import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting_Var159;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.Setting;

import org.zenith.client.screens.nlgui.NLMenuScreen;
import org.zenith.utility.render.display.base.HudQueuedContext;
















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.util.math.Vector2f;
import org.lwjgl.glfw.GLFW;

@ModuleInfo(
   name = "Interface",
   category = Category.RENDER,
   description = "\u0418\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441 \u041a\u043b\u0438\u0435\u043d\u0442\u0430"
)
public final class Interface extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final List<HudElement> list44 = new ArrayList<>();
   public final Map<String, HudElement> map19 = new HashMap<>();
   public final HudPreviewRenderQueue hudPreviewRenderQueue3 = new HudPreviewRenderQueue();
   public HudElement var129 = null;
   public static final Interface interfaceField = new Interface();
   public float dragOffsetX;
   public float dragOffsetY;
   public HudElement var1292 = null;
   public float float77;
   public float float78;
   public float float79;
   public long long100 = 0L;
   public boolean boolean108 = false;
   public final ModeSetting cosmetics = new ModeSetting("module.interface.cosmetics");
   public final ModeSetting_Var159 modeSettingVar15910 = new ModeSetting_Var159(
      this.cosmetics, "module.interface.blur", true
   );
   public final ModeSetting_Var159 modeSettingVar15911 = new ModeSetting_Var159(
      this.cosmetics, "module.interface.glass", false
   );
   public final ModeSetting_Var159 modeSettingVar15912 = new ModeSetting_Var159(
      this.cosmetics, "module.interface.glow", true
   );
   public final ModeSetting_Var159 modeSettingVar15913 = new ModeSetting_Var159(
      this.cosmetics, "module.interface.whiteNoise", false
   );
   public final ModeSetting3 glowMode = new ModeSetting3(
      "module.interface.glowMode", "module.interface.glowMode.desc", () -> true, "module.interface.glowMode.outline", "module.interface.fill"
   );
   public final NumberSetting glowRadius = new NumberSetting(
      "module.interface.glowRadius", 8.0F, 5.0F, 15.0F, 1.0F, "module.interface.glowRadius.desc", "px", () -> true, null
   );
   public final BooleanSetting3 glowSettings = new BooleanSetting3(
      "module.interface.glowSettings",
      "module.interface.glowSettings.desc",
      this.modeSettingVar15912::isEnabled,
      this.glowMode,
      this.glowRadius
   );
   public final NumberSetting glareSpeed = new NumberSetting(
      "module.interface.glareSpeed", 0.2F, 0.05F, 1.0F, 0.05F, "module.interface.glareSpeed.desc", "x", () -> true, null
   );
   public final BooleanSetting3 glassSettings = new BooleanSetting3(
      "module.interface.glassSettings", "module.interface.glassSettings.desc", this.modeSettingVar15911::isEnabled, this.glareSpeed
   );
   public final NumberSetting volume = new NumberSetting(
      "module.interface.volume", 0.5F, 0.1F, 1.0F, 0.1F, "module.interface.volume.desc", "%", this::boolean67, null
   );
   public final NumberSetting round = new NumberSetting(
      "module.interface.round", 6.0F, 0.0F, 6.0F, 0.1F, "module.interface.round.desc", "px"
   );
   public final NumberSetting scale = new NumberSetting(
      "module.interface.hudElement.scale", 100.0F, 90.0F, 250.0F, 1.0F, "module.interface.hudElement.scale.desc", "%", () -> true, (var1x, var2) -> {
         for (HudElement i1i1l111li : this.list44) {
            i1i1l111li.int171().setCurrent(var2);
         }
      }
   );

   @Override
   public List<Setting> getSettings() {
      return List.of(this.cosmetics, this.glowSettings, this.glassSettings, this.scale, this.round, this.volume);
   }

   public Interface() {
      this.on23(
         new HudArmorPanel("ItemBinds", 349.0F, 0.0F, 960.0F, 495.5F, -11.5F, 146.0F, HudElement_Var159.val093)
      );
      this.on23(new HudTextPanel("Watermark", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 10.0F, HudElement_Var159.val015));
      this.on23(new HudEffectIcons("Potions", 0.0F, 0.0F, 960.0F, 495.5F, 119.15234F, 73.0F, HudElement_Var159.val015));
      this.on23(new HudElementMedia("Staffs", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 73.0F, HudElement_Var159.val015));
      HudStatusPanel li1llil1lllil111il11l = new HudStatusPanel(
         "Notifications", 181.80615F, 135.5F, 960.0F, 495.5F, 157.03516F, -72.5F, HudElement_Var159.val125
      );
      this.on23(li1llil1lllil111il11l);
      ZenithClient.on23().ConfigJsonUtil().on23(li1llil1lllil111il11l);
      this.on23(
         new HudSelectedItemPanel("Inventory", 269.0F, 229.0F, 960.0F, 495.5F, -11.5F, -74.0F, HudElement_Var159.val128)
      );
      this.on23(
         new HudInventoryPanel("Cooldowns", 349.0F, 0.0F, 960.0F, 495.5F, -11.5F, 73.0F, HudElement_Var159.val093)
      );
      this.on23(new HudInfoBoxSecondary("Information", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 41.5F, HudElement_Var159.val015));
      this.on23(new HudClockPanel("TimerBar", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 57.5F, HudElement_Var159.val015));
      this.on23(
         new HudInfoBoxPrimary("Coordinates", 0.0F, 0.0F, 960.0F, 495.5F, 10.0F, 41.5F, HudElement_Var159.val015)
      );
      this.on23(
         new HudElementText2("Keybinds", 349.0F, 0.0F, 960.0F, 495.5F, -122.0F, 73.0F, HudElement_Var159.val093)
      );
      this.on23(
         new HudTargetPanel("TargetHud", 166.5F, 128.5F, 960.0F, 495.5F, 0.0F, 31.75F, HudElement_Var159.val125)
      );
      this.on23(new HudMediaPanel("MusicInfo", 342.0F, 257.0F, 960.0F, 495.5F, -11.5F, -16.5F, HudElement_Var159.val128));
      this.on23(
         new HudElementValue("HootBar", 116.5F, 265.0F, 960.0F, 495.5F, 0.0F, -16.5F, HudElement_Var159.val127)
      );
      this.on23(new HudScoreboard("ScoreBoard", 0.0F, 0.0F, 960.0F, 495.5F, -10.0F, 10.0F, HudElement_Var159.val126));
      this.on23(new HudTabList("AnimatedTab"));
      this.on23(new HudElementText("ArmorHud", 0.0F, 0.0F, 960.0F, 495.5F, -10.0F, 10.0F, HudElement_Var159.val126));
      this.on23(
         new HudElementMessages("TargetPotions", 0.0F, 0.0F, 960.0F, 495.5F, 119.15234F, 90.0F, HudElement_Var159.val015)
      );
      this.on23(new HudElementMessage("Events", 116.5F, 265.0F, 960.0F, 495.5F, 0.0F, -16.5F, HudElement_Var159.val127));
   }

   @Override
   public void onEnable() {
      super.onEnable();
   }

   @Override
   public JsonObject save() {
      JsonObject jsonobject = super.save();
      JsonObject jsonobject1 = new JsonObject();

      for (HudElement i1i1l111li : this.list44) {
         jsonobject1.add(i1i1l111li.getName(), i1i1l111li.save());
      }

      jsonobject.add("HudElements", jsonobject1);
      return jsonobject;
   }

   @Override
   public void load(JsonObject var1) {
      super.load(var1);
      if (var1.has("HudElements") && var1.get("HudElements").isJsonObject()) {
         JsonObject jsonobject = var1.getAsJsonObject("HudElements");

         for (HudElement i1i1l111li : this.list44) {
            String s = i1i1l111li.getName();
            if (jsonobject.has(s) && jsonobject.get(s).isJsonObject()) {
               i1i1l111li.load(jsonobject.getAsJsonObject(s));
            }
         }
      }
   }

   public void on23(HudElement var1) {
      this.list44.add(var1);
      this.map19.put(var1.getName(), var1);
   }

   public List<HudElement> float211() {
      return Collections.unmodifiableList(this.list44);
   }

   @Override
   public boolean isRenderSetting() {
      return false;
   }

   @EventTarget
   public void on23(EventRenderScreenHook var1) {
      if (minecraftClient3.world != null
         && minecraftClient3.interactionManager != null
         && minecraftClient3.player != null
         && !minecraftClient3.options.hudHidden) {
         if (!(minecraftClient3.currentScreen instanceof ChatScreen)) {
            if (this.var129 != null) {
               this.var129.double109();
               this.var129 = null;
            }

            if (this.var1292 != null) {
               this.var1292 = null;
            }

            this.int112();
         }

         org.zenith.utility.render.display.base.HudDrawContext ililll1lli1i11l11l111i1l1 = var1.WarpFarm();
         HudQueuedContext hudqueuedcontext = HudQueuedContext.of(ililll1lli1i11l11l111i1l1);
         float f = (float)minecraftClient3.getWindow().getScaledWidth();
         float f1 = (float)minecraftClient3.getWindow().getScaledHeight();
         ililll1lli1i11l11l111i1l1.pushMatrix();
         HudPreviewRenderQueue.on23(this.hudPreviewRenderQueue3);

         try {
            for (HudElement i1i1l111li : this.list44) {
               if (this.ColorAnimator(i1i1l111li)) {
                  try {
                     i1i1l111li.on23((org.zenith.utility.render.display.base.HudDrawContext)hudqueuedcontext);
                  } catch (Exception exception) {
                     exception.printStackTrace();
                  }
               }
            }

            this.hudPreviewRenderQueue3.flush();
         } finally {
            HudPreviewRenderQueue.UiAnimation(this.hudPreviewRenderQueue3);
         }

         if (minecraftClient3.currentScreen instanceof ChatScreen) {
            Vector2f vector2f = this.int213();
            float f9 = vector2f.getX();
            float f2 = vector2f.getY();
            if (this.var129 != null) {
               this.var129.on23(ililll1lli1i11l11l111i1l1, f9 - this.dragOffsetX, f2 - this.dragOffsetY, this, f, f1);
            }

            if (this.var1292 != null) {
               float f3 = this.var1292.getX();
               float f4 = this.var1292.getY();
               float f5 = (float)Math.sqrt(
                  (double)((this.float77 - f3) * (this.float77 - f3) + (this.float78 - f4) * (this.float78 - f4))
               );
               float f6 = (float)Math.sqrt((double)((f9 - f3) * (f9 - f3) + (f2 - f4) * (f2 - f4)));
               if (f5 > 1.0F) {
                  float f7 = f6 / f5;
                  float f8 = this.float79 * f7;
                  f8 = Math.clamp(f8, this.var1292.int171().getMin(), this.var1292.int171().getMax());
                  this.var1292.int171().setCurrent(f8);
               }
            }

            HudElement i1i1l111li1 = this.TextScanner((double)f9, (double)f2);
            if (this.var1292 == null && (i1i1l111li1 == null || !i1i1l111li1.ItemRegistry((double)f9, (double)f2))) {
               this.int112();
            } else {
               this.boolean62();
            }
         } else {
            this.int112();
         }

         ililll1lli1i11l11l111i1l1.popMatrix();
      }
   }

   public float UiAnimation(HudElement var1) {
      return var1.blockPos30();
   }

   public float Easing(HudElement var1) {
      return var1.blockPos31();
   }

   public boolean ColorAnimator(HudElement var1) {
      return this.isEnabled() && var1.isEnabled();
   }

   public static float float212() {
      return interfaceField.round.getCurrent();
   }

   @EventTarget
   public void UiAnimation(EventMouseButton var1) {
      if (!(minecraftClient3.currentScreen instanceof ChatScreen)) {
         if (this.var129 != null) {
            this.var129.double109();
            this.var129 = null;
         }

         if (this.var1292 != null) {
            this.var1292 = null;
            this.int112();
         }
      } else {
         Vector2f vector2f = this.int213();
         double d0 = (double)vector2f.getX();
         double d1 = (double)vector2f.getY();
         if (var1.TridentAimbot() == 0 && var1.ContainerScanner() == 1) {
            HudElement i1i1l111li1 = this.TextScanner(d0, d1);
            if (i1i1l111li1 != null) {
               if (this.var129 != null) {
                  this.var129.double109();
                  this.var129 = null;
               }

               this.ItemRegistry(i1i1l111li1);
            }
         } else {
            if (var1.TridentAimbot() == 1 && var1.ContainerScanner() == 0) {
               HudElement i1i1l111li = this.TextScanner(d0, d1);
               if (i1i1l111li != null) {
                  if (i1i1l111li.ItemRegistry(d0, d1)) {
                     this.var1292 = i1i1l111li;
                     this.float77 = (float)d0;
                     this.float78 = (float)d1;
                     this.float79 = i1i1l111li.int171().getCurrent();
                  } else if (!i1i1l111li.on23(var1)) {
                     this.var129 = i1i1l111li;
                     this.dragOffsetX = (float)d0 - this.UiAnimation(i1i1l111li);
                     this.dragOffsetY = (float)d1 - this.Easing(i1i1l111li);
                  }

                  System.out.println(i1i1l111li);
               }
            } else if (var1.TridentAimbot() == 0) {
               if (this.var1292 != null) {
                  this.var1292 = null;
                  this.int112();
               }

               if (this.var129 != null) {
                  this.var129.double109();
                  this.var129 = null;
               }
            }
         }
      }
   }

   public void boolean62() {
      if (!this.boolean108) {
         if (this.long100 == 0L) {
            this.long100 = GLFW.glfwCreateStandardCursor(221189);
         }

         if (this.long100 != 0L) {
            GLFW.glfwSetCursor(minecraftClient3.getWindow().getHandle(), this.long100);
            this.boolean108 = true;
         }
      }
   }

   public void int112() {
      if (this.boolean108) {
         GLFW.glfwSetCursor(minecraftClient3.getWindow().getHandle(), 0L);
         this.boolean108 = false;
      }
   }

   public HudElement TextScanner(double var1, double var3) {
      for (int i = this.list44.size() - 1; i >= 0; i--) {
         HudElement i1i1l111li = this.list44.get(i);
         if (this.ColorAnimator(i1i1l111li) && i1i1l111li.ColorAnimator(var1, var3)) {
            return i1i1l111li;
         }
      }

      return null;
   }

   public void ItemRegistry(HudElement var1) {
      NLMenuScreen nlmenuscreen = ZenithClient.on23().NbtEditor();
      if (nlmenuscreen != null && var1 != null) {
         if (minecraftClient3.currentScreen != nlmenuscreen) {
            if (!Menu.menu.isEnabled()) {
               Menu.menu.toggle();
            } else {
               minecraftClient3.setScreen(nlmenuscreen);
            }
         }

         nlmenuscreen.openHudElementSettings(var1);
      }
   }

   public float boolean63() {
      return (float)minecraftClient3.getWindow().getScaleFactor();
   }

   public Vector2f int213() {
      return org.zenith.utility.render.display.base.RenderMathUtils.CloudResponse((double)this.boolean63());
   }

   public org.joml.Vector2f CommandManager(float var1, float var2) {
      float f = Float.MAX_VALUE;
      float f1 = Float.MAX_VALUE;
      float f2 = 2.0F;
      org.joml.Vector2f vector2f = new org.joml.Vector2f(-1.0F, -1.0F);
      float f3 = (float)minecraftClient3.getWindow().getScaledWidth() / 2.0F;
      float f4 = (float)minecraftClient3.getWindow().getScaledHeight() / 2.0F;
      float f5 = this.CommandManager(f3, f3, f3, var1);
      float f6 = this.CommandManager(f4, f4, f4, var2);
      float f7 = MathUtils.Event19(f5, var1);
      float f8 = MathUtils.Event19(f6, var2);
      boolean flag = false;
      if (f7 < f && f7 < f2) {
         vector2f.x = f5;
         flag = true;
      }

      if (f8 < f1 && f8 < f2) {
         vector2f.y = f6;
         flag = true;
      }

      if (flag) {
         return vector2f;
      } else {
         for (HudElement i1i1l111li : this.list44) {
            if (!i1i1l111li.equals(this.var129) && this.ColorAnimator(i1i1l111li)) {
               f5 = this.UiAnimation(i1i1l111li);
               f6 = this.Easing(i1i1l111li);
               f7 = f5 + i1i1l111li.zClass06744();
               f8 = f6 + i1i1l111li.int437();
               float f14 = f5 + i1i1l111li.zClass06744() / 2.0F;
               float f9 = f6 + i1i1l111li.int437() / 2.0F;
               float f10 = this.CommandManager(f5, f7, f14, var1);
               float f11 = this.CommandManager(f6, f8, f9, var2);
               float f12 = MathUtils.Event19(f10, var1);
               float f13 = MathUtils.Event19(f11, var2);
               if (f12 < f) {
                  f = f12;
                  if (f12 < f2) {
                     vector2f.x = f10;
                  }
               }

               if (f13 < f1) {
                  f1 = f13;
                  if (f13 < f2) {
                     vector2f.y = f11;
                  }
               }
            }
         }

         return vector2f;
      }
   }

   public float CommandManager(float var1, float var2, float var3, float var4) {
      float f = var1;
      if (MathUtils.Event19(var2, var4) < MathUtils.Event19(var1, var4)) {
         f = var2;
      }

      if (MathUtils.Event19(var3, var4) < MathUtils.Event19(f, var4)) {
         f = var3;
      }

      return f;
   }

   public boolean boolean64() {
      return this.GameCoordinator("ScoreBoard");
   }

   public boolean boolean65() {
      return this.GameCoordinator("HootBar");
   }

   public boolean boolean66() {
      return this.GameCoordinator("AnimatedTab");
   }

   public boolean boolean67() {
      return this.GameCoordinator("Notifications");
   }

   public boolean GameCoordinator(String var1) {
      HudElement i1i1l111li = this.map19.get(var1);
      return i1i1l111li != null && i1i1l111li.isEnabled();
   }

   @EventTarget
   public void ItemSpec(EventTick var1) {
      float f = (float)minecraftClient3.getWindow().getScaledWidth();
      float f1 = (float)minecraftClient3.getWindow().getScaledHeight();
      if (AvatarRenderer.hashMap2.size() > 400) {
         AvatarRenderer.hashMap2.values().removeIf(var0 -> {
            if (var0.call152()) {
               var0.destroy();
               return true;
            } else {
               return false;
            }
         });
      }

      for (HudElement i1i1l111li : this.list44) {
         if (this.ColorAnimator(i1i1l111li)) {
            try {
               i1i1l111li.tick();
            } catch (Throwable throwable) {
               System.out.println(i1i1l111li.getName());
               throwable.printStackTrace();
            }
         }

         if (i1i1l111li != this.var129) {
            i1i1l111li.ServiceException(f, f1);
         }
      }
   }

   public boolean string88() {
      return this.modeSettingVar15910.isEnabled();
   }

   public boolean float30() {
      return this.modeSettingVar15911.isEnabled();
   }

   public boolean string129() {
      return this.modeSettingVar15912.isEnabled();
   }

   public boolean boolean68() {
      return this.modeSettingVar15913.isEnabled();
   }

   public boolean float31() {
      return this.modeSettingVar15912.isEnabled() && this.glowMode.is(0);
   }

   public boolean isFalse() {
      return false;
   }

   public int boolean69() {
      return (int)this.glowRadius.getCurrent();
   }

   public ArgbColor float32() {
      return ZenithClient.on23().TextScanner().getCurrentStyle().getGlareColor().getColor();
   }

   public float boolean70() {
      return this.glareSpeed.getCurrent();
   }

   public boolean float33() {
      return this.GameCoordinator("Potions");
   }
}
