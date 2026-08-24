package moscow.rockstar.module.visuals;

import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.framework.shader.impl.SkyShaderProgram;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.network.ReceivePacketEvent;
import moscow.rockstar.systems.event.impl.render.Render3DEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ColorSetting;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SelectSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.game.EntityUtility;
import moscow.rockstar.util.render.DynamicLightUtility;
import moscow.rockstar.util.render.DrawUtility;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkSectionPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LightType;
import org.joml.Vector3f;

@ModuleInfo(name = "Ambience", category = ModuleCategory.VISUALS, desc = "Настройка атмосферы (небо, цвета, время суток, освещение)")
public class Ambience extends BaseModule {
   private static final int CLIENT_NIGHT_VISION_DURATION = 400;
   private static final int CLIENT_NIGHT_VISION_REFRESH_TICKS = 220;
   private static final double DYNAMIC_UPDATE_DISTANCE_SQUARED = 0.0225;

   public final BooleanSetting endSky = new BooleanSetting(this, "Небо Энда");

   private final SelectSetting changeColor = new SelectSetting(this, "Изменение цвета");
   private final SelectSetting.Value skyColorTarget = new SelectSetting.Value(this.changeColor, "Небо");
   private final SelectSetting.Value cloudColorTarget = new SelectSetting.Value(this.changeColor, "Облака");
   private final SelectSetting.Value starsColorTarget = new SelectSetting.Value(this.changeColor, "Звёзды");
   private final BooleanSetting themeSync = new BooleanSetting(this, "Синхронизация с темой").enable();
   private final ColorSetting skyColor = new ColorSetting(this, "Цвет неба", () -> this.themeSync.isEnabled() || !this.skyColorTarget.isSelected())
      .color(Colors.ACCENT)
      .alpha(false);
   private final ColorSetting cloudColor = new ColorSetting(this, "Цвет облаков", () -> this.themeSync.isEnabled() || !this.cloudColorTarget.isSelected())
      .color(Colors.ACCENT)
      .alpha(false);
   private final ColorSetting starsColor = new ColorSetting(this, "Цвет звёзд", () -> this.themeSync.isEnabled() || !this.starsColorTarget.isSelected())
      .color(Colors.ACCENT);

   private final ModeSetting skybox = new ModeSetting(this, "Скайбокс");
   private final ModeSetting.Value defaultSkybox = new ModeSetting.Value(this.skybox, "Стандартный").select();
   private final ModeSetting.Value brightCloudsSkybox = new ModeSetting.Value(this.skybox, "Яркие облака");
   private final ModeSetting.Value lakeSkybox = new ModeSetting.Value(this.skybox, "Озеро");
   private final ModeSetting.Value cloudSpaceSkybox = new ModeSetting.Value(this.skybox, "Космос облаков");
   private final ModeSetting.Value clearEveningSkybox = new ModeSetting.Value(this.skybox, "Ясный вечер");
   private final ModeSetting.Value underwaterSkybox = new ModeSetting.Value(this.skybox, "Под водой");

   private final BooleanSetting shader = new BooleanSetting(this, "Шейдер");
   private final ModeSetting shaderType = new ModeSetting(this, "Тип шейдера", () -> !this.shader.isEnabled());
   private final ModeSetting.Value nebulaShader = new ModeSetting.Value(this.shaderType, "Туманность").select();
   private final ModeSetting.Value causticShader = new ModeSetting.Value(this.shaderType, "Каустика");
   private final SliderSetting shaderOpacity = new SliderSetting(this, "Прозрачность шейдера", () -> !this.shader.isEnabled())
      .min(0.0F)
      .max(100.0F)
      .step(5.0F)
      .currentValue(70.0F)
      .suffix("%");

   private final BooleanSetting customTime = new BooleanSetting(this, "Своё время");
   private final SliderSetting time = new SliderSetting(this, "Время", () -> !this.customTime.isEnabled())
      .step(1000.0F)
      .min(0.0F)
      .max(24000.0F)
      .currentValue(12000.0F);

   private final BooleanSetting nightMode = new BooleanSetting(this, "Ночной режим");
   public final BooleanSetting bright = new BooleanSetting(this, "Яркость", () -> this.nightMode.isEnabled()).enable();
   private final ModeSetting brightnessMode = new ModeSetting(this, "Режим яркости", () -> !this.isBrightnessEnabled());
   private final ModeSetting.Value gammaBrightness = new ModeSetting.Value(this.brightnessMode, "Гамма").select();
   private final ModeSetting.Value effectBrightness = new ModeSetting.Value(this.brightnessMode, "Эффект");
   private final ModeSetting.Value dynamicBrightness = new ModeSetting.Value(this.brightnessMode, "Динамическая");
   private final SliderSetting dynamicRadius = new SliderSetting(
         this,
         "Радиус динамического освещения",
         () -> !this.isBrightnessEnabled() || !this.dynamicBrightness.isSelected()
      )
      .min(4.0F)
      .max(12.0F)
      .step(0.5F)
      .currentValue(7.5F);
   private final SliderSetting dynamicLight = new SliderSetting(
         this,
         "Интенсивность динамического света",
         () -> !this.isBrightnessEnabled() || !this.dynamicBrightness.isSelected()
      )
      .min(8.0F)
      .max(15.0F)
      .step(1.0F)
      .currentValue(15.0F);
   private final BooleanSetting dynamicOnlyInCave = new BooleanSetting(
      this,
      "Только в пещерах",
      () -> !this.isBrightnessEnabled() || !this.dynamicBrightness.isSelected()
   );
   private final BooleanSetting nightModeThemeSync = new BooleanSetting(this, "Синхронизация темы ночного режима", () -> !this.nightMode.isEnabled())
      .enable();
   private final ColorSetting nightModeColor = new ColorSetting(
         this,
         "Цвет ночного режима",
         () -> !this.nightMode.isEnabled() || this.nightModeThemeSync.isEnabled()
      )
      .color(new ColorRGBA(80.0F, 120.0F, 220.0F, 255.0F))
      .alpha(false);
   private final SliderSetting nightModeStrength = new SliderSetting(this, "Сила ночного режима", () -> !this.nightMode.isEnabled())
      .min(0.0F)
      .max(100.0F)
      .step(1.0F)
      .currentValue(70.0F)
      .suffix("%");

   private long oldTime;
   private Vec3d dynamicLightPos;
   private int dynamicLightRadius = -1;
   private int dynamicLightLevel = -1;
   private boolean dynamicLightActive;
   private final EventListener<ReceivePacketEvent> onReceivePacket = event -> {
      if (event.getPacket() instanceof WorldTimeUpdateS2CPacket && this.customTime.isEnabled()) {
         event.cancel();
      }
   };
   private final EventListener<Render3DEvent> onRender3D = event -> this.updateDynamicBrightness();

   public boolean isBrightnessEnabled() {
      return this.bright.isEnabled() && !this.nightMode.isEnabled();
   }

   public boolean shouldUseGammaBrightness() {
      return this.isEnabled() && this.isBrightnessEnabled() && this.gammaBrightness.isSelected();
   }

   public boolean isNightModeActive() {
      return this.isEnabled() && this.nightMode.isEnabled();
   }

   public Vector3f getNightModeTint() {
      ColorRGBA color = this.nightModeThemeSync.isEnabled() ? Colors.getFlatColor() : this.nightModeColor.getColor();
      return new Vector3f(color.getRed() / 255.0F, color.getGreen() / 255.0F, color.getBlue() / 255.0F);
   }

   public float getNightModeStrengthValue() {
      return this.nightModeStrength.getCurrentValue() / 100.0F;
   }

   public boolean hasCustomSkybox() {
      return !this.skybox.is(this.defaultSkybox);
   }

   public boolean hasShaderSkybox() {
      return this.shader.isEnabled();
   }

   public boolean shouldRenderCustomSkybox() {
      if (!this.isEnabled()) return false;
      if (this.hasShaderSkybox()) return true;
      if (!this.hasCustomSkybox()) return false;
      int index = this.skybox.getValues().indexOf(this.skybox.getValue());
      return index > 0;
   }

   public boolean shouldTintSky() {
      return this.isEnabled() && this.skyColorTarget.isSelected();
   }

   public boolean shouldTintClouds() {
      return this.isEnabled() && this.cloudColorTarget.isSelected();
   }

   public boolean shouldTintStars() {
      return this.isEnabled() && this.starsColorTarget.isSelected();
   }

   public ColorRGBA getResolvedSkyColor() {
      return this.themeSync.isEnabled() ? Colors.getFlatColor() : this.skyColor.getColor();
   }

   public ColorRGBA getResolvedCloudColor() {
      return this.themeSync.isEnabled() ? Colors.getFlatColor() : this.cloudColor.getColor();
   }

   public ColorRGBA getResolvedStarsColor() {
      return this.themeSync.isEnabled() ? Colors.getFlatColor() : this.starsColor.getColor();
   }

   // Теперь возвращает null если скайбокс дефолтный — вызывающий код должен проверять на null
   public Identifier getSkyboxTexture() {
      if (this.skybox.is(this.defaultSkybox)) {
         return null;
      }
      int index = this.skybox.getValues().indexOf(this.skybox.getValue());
      if (index <= 0) return null;
      return Rockstar.id("sky/" + index + ".png");
   }

   public SkyShaderProgram getSkyShaderProgram() {
      if (this.causticShader.isSelected()) {
         return DrawUtility.skyCausticProgram;
      } else {
         return DrawUtility.skyNebulaProgram;
      }
   }

   public float getShaderOpacity() {
      return this.shaderOpacity.getCurrentValue() / 100.0F;
   }

   @Override
   public void tick() {
      if (mc.world == null) {
         this.removeClientNightVision();
         this.clearDynamicBrightness();
         return;
      }

      if (this.customTime.isEnabled()) {
         mc.world.getLevelProperties().setTimeOfDay((long)this.time.getCurrentValue());
      }

      this.updateBrightnessEffect();
      if (!this.shouldUseDynamicBrightness()) {
         this.clearDynamicBrightness();
      }

      super.tick();
   }

   @Override
   public void onEnable() {
      if (EntityUtility.isInGame() && mc.world != null) {
         this.oldTime = mc.world.getTime();
         super.onEnable();
      }
   }

   @Override
   public void onDisable() {
      this.removeClientNightVision();
      this.clearDynamicBrightness();
      if (EntityUtility.isInGame() && mc.world != null) {
         mc.world.getLevelProperties().setTimeOfDay(this.oldTime);
         super.onDisable();
      }
   }

   private void updateBrightnessEffect() {
      if (mc.player == null) {
         return;
      }

      if (!this.shouldUseEffectBrightness()) {
         this.removeClientNightVision();
         return;
      }

      StatusEffectInstance current = mc.player.getStatusEffect(StatusEffects.NIGHT_VISION);
      if (current == null || this.isClientNightVision(current) && current.getDuration() <= CLIENT_NIGHT_VISION_REFRESH_TICKS) {
         mc.player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, CLIENT_NIGHT_VISION_DURATION, 0, false, false, false));
      }
   }

   private boolean shouldUseEffectBrightness() {
      return this.isEnabled() && this.isBrightnessEnabled() && this.effectBrightness.isSelected();
   }

   private boolean shouldUseDynamicBrightness() {
      return this.isEnabled()
         && this.isBrightnessEnabled()
         && this.dynamicBrightness.isSelected()
         && (!this.dynamicOnlyInCave.isEnabled() || this.isPlayerInCave());
   }

   private boolean isPlayerInCave() {
      if (mc.player == null || mc.world == null) {
         return false;
      }

      BlockPos pos = BlockPos.ofFloored(mc.player.getPos());
      return !mc.world.isSkyVisible(pos) && mc.world.getLightLevel(LightType.SKY, pos) < 4;
   }

   private void removeClientNightVision() {
      if (mc.player == null) {
         return;
      }

      StatusEffectInstance current = mc.player.getStatusEffect(StatusEffects.NIGHT_VISION);
      if (this.isClientNightVision(current)) {
         mc.player.removeStatusEffect(StatusEffects.NIGHT_VISION);
      }
   }

   private boolean isClientNightVision(StatusEffectInstance effect) {
      return effect != null
         && effect.getEffectType() == StatusEffects.NIGHT_VISION
         && effect.getAmplifier() == 0
         && effect.getDuration() <= CLIENT_NIGHT_VISION_DURATION;
   }

   private void updateDynamicBrightness() {
      if (mc.player == null || mc.world == null || !this.shouldUseDynamicBrightness()) {
         this.clearDynamicBrightness();
         return;
      }

      Vec3d pos = mc.player.getPos().add(0.0, (double)mc.player.getHeight() * 0.5, 0.0);
      float radius = this.dynamicRadius.getCurrentValue();
      float light = this.dynamicLight.getCurrentValue();
      int radiusCeil = MathHelper.ceil(radius);
      int lightFloor = MathHelper.floor(light);
      DynamicLightUtility.set(pos.x, pos.y, pos.z, radius, light);

      if (this.shouldRefreshDynamicBrightness(pos, radiusCeil, lightFloor)) {
         this.refreshDynamicBrightnessArea(this.dynamicLightPos, this.dynamicLightRadius);
         this.refreshDynamicBrightnessArea(pos, radiusCeil);
         this.dynamicLightPos = pos;
         this.dynamicLightRadius = radiusCeil;
         this.dynamicLightLevel = lightFloor;
         this.dynamicLightActive = true;
      }
   }

   private boolean shouldRefreshDynamicBrightness(Vec3d pos, int radius, int light) {
      if (!this.dynamicLightActive || this.dynamicLightPos == null) {
         return true;
      }

      return this.dynamicLightRadius != radius || this.dynamicLightLevel != light || pos.squaredDistanceTo(this.dynamicLightPos) >= DYNAMIC_UPDATE_DISTANCE_SQUARED;
   }

   private void clearDynamicBrightness() {
      if (!this.dynamicLightActive) {
         DynamicLightUtility.clear();
         return;
      }

      DynamicLightUtility.clear();
      this.refreshDynamicBrightnessArea(this.dynamicLightPos, this.dynamicLightRadius);
      this.dynamicLightActive = false;
      this.dynamicLightPos = null;
      this.dynamicLightRadius = -1;
      this.dynamicLightLevel = -1;
   }

   private void refreshDynamicBrightnessArea(Vec3d pos, int radius) {
      if (pos == null || radius <= 0 || mc.worldRenderer == null) {
         return;
      }

      int padding = Math.max(1, MathHelper.ceil((float)radius / Math.max(this.dynamicLight.getCurrentValue(), 1.0F)));
      int minX = ChunkSectionPos.getSectionCoord(MathHelper.floor(pos.x) - radius - padding);
      int minY = ChunkSectionPos.getSectionCoord(MathHelper.floor(pos.y) - radius - padding);
      int minZ = ChunkSectionPos.getSectionCoord(MathHelper.floor(pos.z) - radius - padding);
      int maxX = ChunkSectionPos.getSectionCoord(MathHelper.floor(pos.x) + radius + padding);
      int maxY = ChunkSectionPos.getSectionCoord(MathHelper.floor(pos.y) + radius + padding);
      int maxZ = ChunkSectionPos.getSectionCoord(MathHelper.floor(pos.z) + radius + padding);
      mc.worldRenderer.scheduleChunkRenders(minX, minY, minZ, maxX, maxY, maxZ);
   }

   @Generated
   public BooleanSetting getEndSky() {
      return this.endSky;
   }

   @Generated
   public SelectSetting getChangeColor() {
      return this.changeColor;
   }

   @Generated
   public SelectSetting.Value getSkyColorTarget() {
      return this.skyColorTarget;
   }

   @Generated
   public SelectSetting.Value getCloudColorTarget() {
      return this.cloudColorTarget;
   }

   @Generated
   public SelectSetting.Value getStarsColorTarget() {
      return this.starsColorTarget;
   }

   @Generated
   public BooleanSetting getThemeSync() {
      return this.themeSync;
   }

   @Generated
   public ColorSetting getSkyColor() {
      return this.skyColor;
   }

   @Generated
   public ColorSetting getCloudColor() {
      return this.cloudColor;
   }

   @Generated
   public ColorSetting getStarsColor() {
      return this.starsColor;
   }

   @Generated
   public ModeSetting getSkybox() {
      return this.skybox;
   }

   @Generated
   public BooleanSetting getShader() {
      return this.shader;
   }

   @Generated
   public ModeSetting getShaderType() {
      return this.shaderType;
   }

   @Generated
   public SliderSetting getShaderOpacitySetting() {
      return this.shaderOpacity;
   }

   @Generated
   public BooleanSetting getCustomTime() {
      return this.customTime;
   }

   @Generated
   public SliderSetting getTime() {
      return this.time;
   }

   @Generated
   public BooleanSetting getNightMode() {
      return this.nightMode;
   }

   @Generated
   public BooleanSetting getBright() {
      return this.bright;
   }

   @Generated
   public ModeSetting getBrightnessMode() {
      return this.brightnessMode;
   }

   @Generated
   public SliderSetting getDynamicRadius() {
      return this.dynamicRadius;
   }

   @Generated
   public SliderSetting getDynamicLight() {
      return this.dynamicLight;
   }

   @Generated
   public BooleanSetting getDynamicOnlyInCave() {
      return this.dynamicOnlyInCave;
   }

   @Generated
   public BooleanSetting getNightModeThemeSync() {
      return this.nightModeThemeSync;
   }

   @Generated
   public ColorSetting getNightModeColor() {
      return this.nightModeColor;
   }

   @Generated
   public SliderSetting getNightModeStrength() {
      return this.nightModeStrength;
   }

   @Generated
   public long getOldTime() {
      return this.oldTime;
   }

   @Generated
   public EventListener<ReceivePacketEvent> getOnReceivePacket() {
      return this.onReceivePacket;
   }

   @Generated
   public EventListener<Render3DEvent> getOnRender3D() {
      return this.onRender3D;
   }
}
