package moscow.rockstar.module.combat;

import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.SelectSetting;
import moscow.rockstar.systems.target.TargetSettings;
import moscow.rockstar.util.game.CombatUtility;
import moscow.rockstar.util.time.Timer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;
@ModuleInfo(name = "Trigger Bot", category = ModuleCategory.COMBAT, desc = "Автоматическая атака при наведении на цель")
public class TriggerBot extends BaseModule {
   private final Timer timer = new Timer();
   private final BooleanSetting onlyCrits = new BooleanSetting(this, "Только криты").enable();
   private final SelectSetting targets = new SelectSetting(this, "Цели");
   private final SelectSetting.Value players = new SelectSetting.Value(this.targets, "Игроки").select();
   private final SelectSetting.Value animals = new SelectSetting.Value(this.targets, "Животные").select();
   private final SelectSetting.Value mobs = new SelectSetting.Value(this.targets, "Мобы").select();
   private final SelectSetting.Value invisibles = new SelectSetting.Value(this.targets, "Невидимки").select();
   private final SelectSetting.Value nakedPlayers = new SelectSetting.Value(this.targets, "Голые игроки").select();
   private final SelectSetting.Value friends = new SelectSetting.Value(this.targets, "Друзья");

   @Override
   public void tick() {
      if (mc.player != null && mc.interactionManager != null) {
         TargetSettings settings = new TargetSettings.Builder()
            .targetPlayers(this.players.isSelected())
            .targetAnimals(this.animals.isSelected())
            .targetMobs(this.mobs.isSelected())
            .targetInvisibles(this.invisibles.isSelected())
            .targetNakedPlayers(this.nakedPlayers.isSelected())
            .targetFriends(this.friends.isSelected())
            .requiredRange(3.0F)
            .build();
         if (mc.targetedEntity instanceof LivingEntity livingEntity && settings.isEntityValid(livingEntity) && this.shouldAttack(livingEntity)) {
            mc.interactionManager.attackEntity(mc.player, mc.targetedEntity);
            mc.player.swingHand(Hand.MAIN_HAND);
            this.timer.reset();
         }

         super.tick();
      }
   }

   private boolean shouldAttack(LivingEntity entity) {
      if (mc.player == null) {
         return false;
      } else if (mc.player.getAttackCooldownProgress(0.5F) <= 0.93F) {
         return false;
      } else {
         return entity.distanceTo(mc.player) > 3.0F ? false : !this.onlyCrits.isEnabled() || CombatUtility.canPerformCriticalHit(entity, false);
      }
   }
}
