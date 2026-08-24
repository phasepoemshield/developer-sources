package moscow.rockstar.module.visuals;

import lombok.Generated;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SelectSetting;
@ModuleInfo(name = "Removals", category = ModuleCategory.VISUALS, enabledByDefault = true, desc = "Удаление различных визуальных и звуковых эффектов")
public class Removals extends BaseModule {
   private double oldFovEffectScale;
   private final SelectSetting effects = new SelectSetting(this, "Визуальные эффекты");
   private final SelectSetting.Value hurtCam = new SelectSetting.Value(this.effects, "Тряска при ударе").select();
   private final SelectSetting.Value scoreboard = new SelectSetting.Value(this.effects, "Скорборд");
   private final SelectSetting.Value bossBar = new SelectSetting.Value(this.effects, "Босс-бар");
   private final SelectSetting.Value portal = new SelectSetting.Value(this.effects, "Портал").select();
   private final SelectSetting.Value fire = new SelectSetting.Value(this.effects, "Огонь").select();
   private final SelectSetting.Value clip = new SelectSetting.Value(this.effects, "Клиппинг").select();
   private final SelectSetting.Value breakParticles = new SelectSetting.Value(this.effects, "Частицы разрушения");
   private final SelectSetting.Value water = new SelectSetting.Value(this.effects, "Вода");
   private final SelectSetting.Value nausea = new SelectSetting.Value(this.effects, "Тошнота").select();
   private final SelectSetting.Value blindness = new SelectSetting.Value(this.effects, "Слепота");
   private final SelectSetting.Value pumpkin = new SelectSetting.Value(this.effects, "Тыква");
   private final SelectSetting.Value fov = new SelectSetting.Value(this.effects, "FOV").select();
   private final SelectSetting.Value weather = new SelectSetting.Value(this.effects, "Погода");
   private final SelectSetting sounds = new SelectSetting(this, "Звуки");
   private final SelectSetting.Value beacon = new SelectSetting.Value(this.sounds, "Маяк");
   private final SelectSetting.Value phantoms = new SelectSetting.Value(this.sounds, "Фантомы");
   private final SelectSetting.Value weatherSound = new SelectSetting.Value(this.sounds, "Звуки погоды");
   private final EventListener<ClientPlayerTickEvent> onUpdateEvent = event -> {
      if (this.fov.isSelected()) {
         mc.options.getFovEffectScale().setValue(0.0);
      }
   };

   @Override
   public void onEnable() {
      this.oldFovEffectScale = (Double)mc.options.getFovEffectScale().getValue();
      super.onEnable();
   }

   @Override
   public void onDisable() {
      mc.options.getFovEffectScale().setValue(this.oldFovEffectScale);
      super.onDisable();
   }

   @Generated
   public double getOldFovEffectScale() {
      return this.oldFovEffectScale;
   }

   @Generated
   public SelectSetting getEffects() {
      return this.effects;
   }

   @Generated
   public SelectSetting.Value getHurtCam() {
      return this.hurtCam;
   }

   @Generated
   public SelectSetting.Value getScoreboard() {
      return this.scoreboard;
   }

   @Generated
   public SelectSetting.Value getBossBar() {
      return this.bossBar;
   }

   @Generated
   public SelectSetting.Value getPortal() {
      return this.portal;
   }

   @Generated
   public SelectSetting.Value getFire() {
      return this.fire;
   }

   @Generated
   public SelectSetting.Value getClip() {
      return this.clip;
   }

   @Generated
   public SelectSetting.Value getBreakParticles() {
      return this.breakParticles;
   }

   @Generated
   public SelectSetting.Value getWater() {
      return this.water;
   }

   @Generated
   public SelectSetting.Value getNausea() {
      return this.nausea;
   }

   @Generated
   public SelectSetting.Value getBlindness() {
      return this.blindness;
   }

   @Generated
   public SelectSetting.Value getPumpkin() {
      return this.pumpkin;
   }

   @Generated
   public SelectSetting.Value getFov() {
      return this.fov;
   }

   @Generated
   public SelectSetting.Value getWeather() {
      return this.weather;
   }

   @Generated
   public SelectSetting getSounds() {
      return this.sounds;
   }

   @Generated
   public SelectSetting.Value getBeacon() {
      return this.beacon;
   }

   @Generated
   public SelectSetting.Value getPhantoms() {
      return this.phantoms;
   }

   @Generated
   public SelectSetting.Value getWeatherSound() {
      return this.weatherSound;
   }

   @Generated
   public EventListener<ClientPlayerTickEvent> getOnUpdateEvent() {
      return this.onUpdateEvent;
   }
}
