package moscow.rockstar.module.misc;

import moscow.rockstar.Rockstar;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.ui.menu.MenuScreen;
import moscow.rockstar.util.sounds.ClientSounds;

@ModuleInfo(name = "Globals Menu", category = ModuleCategory.OTHER, key = 345, desc = "Глобальное меню с настройками клиента (видимость, уведомления, голосовой чат)")
public class GlobalsMenu extends BaseModule {
   private final ModeSetting visibility = new ModeSetting(this, "Видимость");
   private final ModeSetting.Value visibilityAll = new ModeSetting.Value(this.visibility, "Все").select();
   private final ModeSetting.Value visibilityFriends = new ModeSetting.Value(this.visibility, "Друзья");
   private final ModeSetting.Value visibilityNone = new ModeSetting.Value(this.visibility, "Никто");

   private final ModeSetting notifications = new ModeSetting(this, "Уведомления");
   private final ModeSetting.Value notificationsAll = new ModeSetting.Value(this.notifications, "Все").select();
   private final ModeSetting.Value notificationsFriends = new ModeSetting.Value(this.notifications, "Друзья");
   private final ModeSetting.Value notificationsNone = new ModeSetting.Value(this.notifications, "Никто");

   private final BooleanSetting voiceEnabled = new BooleanSetting(this, "Голосовой чат");
   private final SliderSetting micVolume = new SliderSetting(this, "Громкость микрофона").min(0.0F).max(2.0F).step(0.1F).currentValue(1.0F);
   private final SliderSetting speakerVolume = new SliderSetting(this, "Громкость динамиков").min(0.0F).max(2.0F).step(0.1F).currentValue(1.0F);
   private final BooleanSetting denoiser = new BooleanSetting(this, "Шумоподавление").enable();
   private final BooleanSetting loopback = new BooleanSetting(this, "Обратная связь");

   @Override
   public void onEnable() {
      if (!(mc.currentScreen instanceof MenuScreen)) {
         MenuScreen menu = Rockstar.getInstance().getMenuScreen();
         if (menu != null) {
            mc.setScreen(menu);
            Sounds sounds = Rockstar.getInstance().getModuleManager().getModule(Sounds.class);
            if (sounds != null && sounds.isEnabled()) {
               ClientSounds.CLICKGUI_OPEN.play(sounds.getVolume().getCurrentValue());
            }
         }
      }
      this.setEnabled(false, true);
   }

   public boolean shouldNotify(boolean isFriend) {
      if (this.notificationsNone.isSelected()) {
         return false;
      }
      if (this.notificationsAll.isSelected()) {
         return true;
      }
      return this.notificationsFriends.isSelected() && isFriend;
   }

   public boolean isVoiceEnabled() {
      return this.voiceEnabled.isEnabled();
   }

   public float getMicVolume() {
      return this.micVolume.getCurrentValue();
   }

   public float getSpeakerVolume() {
      return this.speakerVolume.getCurrentValue();
   }
}
