package moscow.rockstar.module.combat;

import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SelectSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.systems.target.TargetSettings;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
@ModuleInfo(name = "Hitboxes", category = ModuleCategory.COMBAT, desc = "Увеличение хитбоксов сущностей для облегчения попаданий")
public class Hitboxes extends BaseModule {
   private final SliderSetting scale = new SliderSetting(this, "Размер").min(0.0F).max(1.0F).step(0.1F).currentValue(0.3F);
   private final SelectSetting targets = new SelectSetting(this, "Цели");
   private final SelectSetting.Value players = new SelectSetting.Value(this.targets, "Игроки").select();
   private final SelectSetting.Value animals = new SelectSetting.Value(this.targets, "Животные").select();
   private final SelectSetting.Value mobs = new SelectSetting.Value(this.targets, "Мобы").select();
   private final SelectSetting.Value invisibles = new SelectSetting.Value(this.targets, "Невидимки").select();
   private final SelectSetting.Value nakedPlayers = new SelectSetting.Value(this.targets, "Голые игроки").select();
   private final SelectSetting.Value friends = new SelectSetting.Value(this.targets, "Друзья");

   public boolean shouldModifyHitbox(LivingEntity entity) {
      TargetSettings settings = new TargetSettings.Builder()
         .targetPlayers(this.players.isSelected())
         .targetAnimals(this.animals.isSelected())
         .targetMobs(this.mobs.isSelected())
         .targetInvisibles(this.invisibles.isSelected())
         .targetNakedPlayers(this.nakedPlayers.isSelected())
         .targetFriends(this.friends.isSelected())
         .build();
      if (entity instanceof ClientPlayerEntity) {
         return false;
      } else if (entity.isDead()) {
         return false;
      } else {
         return Rockstar.getInstance().isPanic() ? false : settings.isEntityValid(entity);
      }
   }

   @Generated
   public SliderSetting getScale() {
      return this.scale;
   }
}
