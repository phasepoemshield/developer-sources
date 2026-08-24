package moscow.rockstar.module.visuals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.base.CustomDrawContext;
import moscow.rockstar.framework.msdf.Font;
import moscow.rockstar.framework.msdf.Fonts;
import moscow.rockstar.framework.objects.BorderRadius;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.render.HudRenderEvent;
import moscow.rockstar.systems.localization.Language;
import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.systems.theme.Theme;
import moscow.rockstar.util.animation.base.Animation;
import moscow.rockstar.util.animation.base.Easing;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.colors.Colors;
import net.minecraft.item.ItemStack;
@ModuleInfo(name = "Interface", category = ModuleCategory.VISUALS, enabledByDefault = true, desc = "Настройка интерфейса (тема, прозрачность, язык)")
public class Interface extends BaseModule {
   private final ModeSetting mode = new ModeSetting(this, "Режим интерфейса");
   private final ModeSetting.Value liquidGlass = new ModeSetting.Value(this.mode, "Жидкое стекло");
   private final ModeSetting.Value minimalism = new ModeSetting.Value(this.mode, "Минимализм");
   private final ModeSetting themeMode = new ModeSetting(this, "Тема", this.liquidGlass::isSelected);
   public final ModeSetting.Value dark = new ModeSetting.Value(this.themeMode, "Тёмная");
   public final ModeSetting.Value light = new ModeSetting.Value(this.themeMode, "Светлая");
   private final SliderSetting glassOpacity = new SliderSetting(this, "Прозрачность", () -> !this.liquidGlass.isSelected())
      .min(0.0F)
      .max(100.0F)
      .step(1.0F)
      .currentValue(20.0F)
      .suffix("%");
   private final SliderSetting glassStrength = new SliderSetting(this, "Сила эффекта", () -> !this.liquidGlass.isSelected())
      .min(0.0F)
      .max(100.0F)
      .step(1.0F)
      .currentValue(25.0F);
   private final SliderSetting glassDistortion = new SliderSetting(this, "Искажение", () -> !this.liquidGlass.isSelected())
      .min(-0.2F)
      .max(0.2F)
      .step(0.01F)
      .currentValue(0.08F);
   private final SliderSetting glassBlur = new SliderSetting(this, "Сила размытия", () -> !this.liquidGlass.isSelected())
      .min(0.0F)
      .max(8.0F)
      .step(0.25F)
      .currentValue(0.5F);
   private final SliderSetting glassRounding = new SliderSetting(this, "Скругление HUD", () -> !this.liquidGlass.isSelected())
      .min(0.0F)
      .max(8.0F)
      .step(1.0F)
      .currentValue(7.0F);
   private final ModeSetting language = new ModeSetting(this, "Язык");
   private final Animation liquidGlassAnim = new Animation(500L, Easing.BOTH_CUBIC);
   private final Animation[] slotNumbers = new Animation[9];
   private final ExecutorService executor = Executors.newSingleThreadExecutor();
   private boolean languageAutoDetected;
   private int lastLang = 0;
   private final EventListener<HudRenderEvent> onHudRenderEvent = event -> {
      this.liquidGlassAnim.setEasing(Easing.FIGMA_EASE_IN_OUT);
      this.liquidGlassAnim.update(this.liquidGlass.isSelected());
      int lang = this.language.getValues().indexOf(this.language.getValue());
      if (lang != this.lastLang) {
         Localizator.setLanguage(lang == 0 ? Language.RU_RU : (lang == 1 ? Language.EN_US : (lang == 2 ? Language.UK_UA : Language.PL_PL)));
         this.languageAutoDetected = false;
      }

      this.lastLang = lang;
      Rockstar.getInstance().getThemeManager().setCurrentTheme(this.dark.isSelected() ? Theme.DARK : Theme.LIGHT);

      if (mc.player != null && mc.world != null) {
         this.renderCustomHotbar(event.getContext());
      }
   };

   public Interface() {
      new ModeSetting.Value(this.language, "Русский");
      new ModeSetting.Value(this.language, "English");
      new ModeSetting.Value(this.language, "Українська");
      new ModeSetting.Value(this.language, "polski");

      for (int i = 0; i < 9; i++) {
         this.slotNumbers[i] = new Animation(200L, 0.0F, Easing.BOTH_CUBIC);
      }
   }

   private void detectLanguageByIP() {
      this.executor.submit(() -> {
         try {
            String countryCode = this.getCountryCodeByIP();
            if (countryCode != null) {
               String var2 = countryCode.toUpperCase();
               switch (var2) {
                  case "UA":
                     this.language.setValue(this.language.getValues().get(2));
                     Localizator.setLanguage(Language.UK_UA);
                     break;
                  case "PL":
                     this.language.setValue(this.language.getValues().get(3));
                     Localizator.setLanguage(Language.PL_PL);
                     break;
                  default:
                     this.language.setValue(this.language.getValues().getFirst());
                     Localizator.setLanguage(Language.RU_RU);
               }

               this.languageAutoDetected = true;
               this.lastLang = this.language.getValues().indexOf(this.language.getValue());
            }
         } catch (Exception var4) {
            Rockstar.LOGGER.error("Failed to detect language by IP", var4);
         }
      });
   }

   private String getCountryCodeByIP() throws IOException {
      URL url = new URL("http://ip-api.com/json/?fields=countryCode");
      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
      connection.setRequestMethod("GET");

      try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
         StringBuilder response = new StringBuilder();

         String line;
         while ((line = reader.readLine()) != null) {
            response.append(line);
         }

         String json = response.toString();
         int start = json.indexOf("countryCode\":\"") + 14;
         if (start >= 14) {
            int end = json.indexOf("\"", start);
            return json.substring(start, end);
         }
      }

      return null;
   }

   public static boolean glassSelected() {
      return Rockstar.getInstance().getModuleManager().getModule(Interface.class).liquidGlass.isSelected();
   }

   public static float glass() {
      return Rockstar.getInstance().getModuleManager().getModule(Interface.class).liquidGlassAnim.getValue();
   }

   public static float minimalizm() {
      return 1.0F - glass();
   }

   public static boolean showGlass() {
      return glass() > 0.0F;
   }

   public static boolean showMinimalizm() {
      return glass() < 1.0F;
   }

   private static Interface module() {
      return Rockstar.getInstance().getModuleManager().getModule(Interface.class);
   }

   public static float glassOpacity() {
      try {
         return module().glassOpacity.getCurrentValue();
      } catch (Exception e) {
         return 20.0F;
      }
   }

   public static float glassStrength() {
      try {
         return module().glassStrength.getCurrentValue();
      } catch (Exception e) {
         return 25.0F;
      }
   }

   public static float glassDistortion() {
      try {
         return module().glassDistortion.getCurrentValue();
      } catch (Exception e) {
         return 0.08F;
      }
   }

   public static float glassBlur() {
      try {
         return module().glassBlur.getCurrentValue();
      } catch (Exception e) {
         return 0.5F;
      }
   }

   public static float glassRounding() {
      try {
         return module().glassRounding.getCurrentValue();
      } catch (Exception e) {
         return 7.0F;
      }
   }

   private void renderCustomHotbar(CustomDrawContext ctx) {
      int sw = mc.getWindow().getScaledWidth();
      int sh = mc.getWindow().getScaledHeight();
      float slot = 20.0F;
      float hbW = 182.0F;
      float hbH = slot + 2.0F;
      float rounding = Interface.glassRounding();
      float alpha = 1.0F;
      boolean dark = Rockstar.getInstance().getThemeManager().getCurrentTheme() == Theme.DARK;

      float x = (sw - hbW) / 2.0F;
      float y = sh - hbH - 8.0F;
      float itemY = y + 1.0F;

      ctx.getMatrices().push();

      if (Interface.showMinimalizm()) {
         ctx.drawBlurredRect(x, y, hbW, hbH, 45.0F, 1.0F, BorderRadius.all(rounding),
            ColorRGBA.WHITE.withAlpha(255.0F * alpha * Interface.minimalizm()));
      }

      if (Interface.showGlass()) {
         ctx.drawLiquidGlass(x, y, hbW, hbH, 1.0F, Interface.glassDistortion(),
            BorderRadius.all(rounding), ColorRGBA.WHITE.withAlpha(255.0F * alpha * Interface.glass()));
      }

      float glassOverlay = Interface.glassOpacity() / 100.0F;
      float fillAlpha = dark ? 0.8F - (0.8F - glassOverlay) * Interface.glass() : 0.7F;
      ctx.drawSquircle(x, y, hbW, hbH, 1.0F, BorderRadius.all(rounding),
         Colors.getBackgroundColor().withAlpha(255.0F * fillAlpha * alpha));

      int selected = mc.player.getInventory().selectedSlot;

      for (int i = 0; i < 9; i++) {
         float sx = x + 1.0F + i * slot;
         float sy = itemY;

         if (i == selected) {
            ctx.drawSquircle(sx, sy, slot, slot, 1.0F, BorderRadius.all(rounding / 2.0F),
               Colors.getAccent().withAlpha(70.0F));
         }

         ItemStack stack = mc.player.getInventory().main.get(i);
         boolean hasStack = !stack.isEmpty() && stack.getCount() > 1;

          if (!stack.isEmpty()) {
             ctx.drawItem(stack, sx + 1.0F, sy + 1.0F, 1.125F);

            if (hasStack) {
               Font countFont = Fonts.SEMIBOLD.getFont(7.0F);
               String countStr = String.valueOf(stack.getCount());
               float cx = sx + slot - 1.0F - countFont.width(countStr);
               float cy = sy + slot - 1.0F - countFont.height() + 1.0F;
               ctx.drawText(countFont, countStr, cx + 1.0F, cy + 1.0F, ColorRGBA.BLACK.withAlpha(150.0F));
               ctx.drawText(countFont, countStr, cx, cy, ColorRGBA.WHITE.withAlpha(255.0F));
            }
         }

         if (!hasStack) {
            String numStr = String.valueOf(i + 1);
            this.slotNumbers[i].update(i == selected);
            float grow = this.slotNumbers[i].getValue();
            Font numFont = Fonts.REGULAR.getFont(7.0F);
            float nw = numFont.width(numStr);
            float nh = numFont.height();
            float nx = sx + (slot - nw) / 2.0F;
            float ny = sy + (slot - nh) / 2.0F - 0.5F;
            float pop = 1.0F + 0.2F * grow;
            ColorRGBA numColor = i == selected
               ? Colors.getAccent().withAlpha(255.0F)
               : Colors.getTextColor().withAlpha(dark ? 140.0F : 170.0F);
            ctx.getMatrices().push();
            ctx.getMatrices().translate(nx + nw / 2.0F, ny + nh / 2.0F, 0.0F);
            ctx.getMatrices().scale(pop, pop, 1.0F);
            ctx.getMatrices().translate(-(nx + nw / 2.0F), -(ny + nh / 2.0F), 0.0F);
            ctx.drawText(numFont, numStr, nx, ny, numColor);
            ctx.getMatrices().pop();
         }
      }

       ctx.getMatrices().pop();
   }

   @Generated
   public ModeSetting getMode() {
      return this.mode;
   }

   @Generated
   public ModeSetting.Value getLiquidGlass() {
      return this.liquidGlass;
   }

   @Generated
   public ModeSetting.Value getMinimalism() {
      return this.minimalism;
   }

   @Generated
   public ModeSetting getThemeMode() {
      return this.themeMode;
   }

   @Generated
   public ModeSetting.Value getDark() {
      return this.dark;
   }

   @Generated
   public ModeSetting getLanguage() {
      return this.language;
   }

    @Generated
    public Animation getLiquidGlassAnim() {
      return this.liquidGlassAnim;
   }

   @Generated
   public ExecutorService getExecutor() {
      return this.executor;
   }

   @Generated
   public boolean isLanguageAutoDetected() {
      return this.languageAutoDetected;
   }

   @Generated
   public int getLastLang() {
      return this.lastLang;
   }

   @Generated
   public EventListener<HudRenderEvent> getOnHudRenderEvent() {
      return this.onHudRenderEvent;
   }
}
