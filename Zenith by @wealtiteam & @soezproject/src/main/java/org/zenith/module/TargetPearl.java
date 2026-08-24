package org.zenith.module;

import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.PotionItemBuilder;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.MediaTrackInfo;
import org.zenith.core.CloudRouter;
import org.zenith.core.LineShader;
import org.zenith.event.Event01;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.EventMotion;
import org.zenith.managers.EmoteManager;
import org.zenith.setting.Setting;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Aura;
import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.util.MathUtils;
import org.zenith.module.Module;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.rotation.Rotation;
import org.zenith.rotation.RotationMath;
import org.zenith.rotation.RotationTask;
import org.zenith.util.ScreenUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.Event26;
import org.zenith.event.Event33;
import org.zenith.event.EventInjectAddEntity;
import org.zenith.event.RefreshCacheEvent;

import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;
import org.zenith.setting.StringSetting2;






import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;

@ModuleInfo(
   name = "TargetPearl",
   description = "Target Pearl",
   category = Category.COMBAT
)
public final class TargetPearl extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final TargetPearl targetPearl = new TargetPearl();
   public final CooldownTimer zClass06737 = new CooldownTimer();
   public final ModeSetting3 modeSetting = new ModeSetting3(
      "module.targetPearl.modeSetting", "module.targetPearl.modeSetting.desc", "module.targetPearl.modeBind", "module.targetPearl.modeAlways"
   );
   public final ModeSetting3 targetSetting = new ModeSetting3(
      "module.targetPearl.targetSetting", "module.targetPearl.targetSetting.desc", "module.targetPearl.targetTarget", "module.targetPearl.targetAll"
   );
   public final StringSetting2 throwSetting = new StringSetting2(
      "module.targetPearl.throwSetting", "module.targetPearl.throwSetting.desc", () -> this.modeSetting.is(0)
   );
   public final NumberSetting distanceSetting2 = new NumberSetting(
      "module.targetPearl.distanceSetting", 6.0F, 3.0F, 15.0F, 1.0F, "module.targetPearl.distanceSetting.desc", "b"
   );
   public Rotation rotation = null;
   public HitResult hitResult = null;
   int int88 = 0;

   public TargetPearl() {
   }

   @EventTarget
   public void Easing(EventInjectAddEntity var1) {
      if (var1.ElytraFly() instanceof EnderPearlEntity enderpearlentity) {
         minecraftClient3.world
            .getPlayers()
            .stream()
            .filter(var1x -> var1x.distanceTo(enderpearlentity) <= 3.0F)
            .min(Comparator.comparingDouble(var1x -> (double)var1x.distanceTo(enderpearlentity)))
            .ifPresent(enderpearlentity::setOwner);
      }
   }

   @EventTarget
   public void ItemRegistry(Event26 var1) {
      LivingEntity livingentity = Aura.aura.var11813();
      Slot slot = ScreenUtils.SimpleItemBuilder(Items.ENDER_PEARL);
      if (slot != null && this.zClass06737.EventModifyMouseRotationInput(1000L)) {
         if (!this.modeSetting.is(0) || EffectEngine.on23(this.throwSetting)) {
            if (!EffectEngine.double66()
               .filter(EnderPearlEntity.class::isInstance)
               .map(EnderPearlEntity.class::cast)
               .anyMatch(var0 -> Objects.equals(var0.getOwner(), minecraftClient3.player))) {
               Predictions lii1l1lll1 = Predictions.predictions;
               EffectEngine.double66()
                  .filter(EnderPearlEntity.class::isInstance)
                  .map(EnderPearlEntity.class::cast)
                  .sorted(
                     Comparator.comparingDouble(
                        var1x -> (double)ZenithClient.on23()
                              .CloudRouter()
                              .LineShader()
                              .EmoteManager(RotationMath.Event01(lii1l1lll1.on23(var1x).getPos()))
                              .gson2()
                     )
                  )
                  .filter(
                     var2x -> !ZenithClient.on23().MediaTrackInfo().UiAnimation(var2x.getOwner())
                           && (this.targetSetting.is(1) || livingentity != null && livingentity.equals(var2x.getOwner()))
                  )
                  .findFirst()
                  .ifPresent(
                     var2x -> {
                        HitResult hitresult = lii1l1lll1.on23(var2x);
                        this.hitResult = hitresult;
                        if (hitresult != null
                           && !(
                              MathUtils.PotionItemBuilder(minecraftClient3.player.getPos(), hitresult.getPos())
                                 < (double)this.distanceSetting2.getCurrent()
                           )) {
                           float f = RotationMath.Event01(hitresult.getPos()).GrimGlide();
                           IntStream.range(-89, 89)
                              .mapToObj(var1xx -> new Rotation(f, (float)var1xx))
                              .filter(
                                 var2xx -> {
                                    HitResult hitresult1 = lii1l1lll1.on23(
                                       var2xx.int202(),
                                       new EnderPearlEntity(EntityType.ENDER_PEARL, minecraftClient3.world),
                                       1.5
                                    );
                                    return hitresult1 == null
                                       ? false
                                       : MathUtils.PotionItemBuilder(hitresult1.getPos(), hitresult.getPos()) <= 3.0;
                                 }
                              )
                              .max(Comparator.comparingDouble(Rotation::GuiWalk))
                              .ifPresent(var2xx -> {
                                 this.rotation = var2xx;
                                 this.int88 = 0;
                                 ScreenUtils.ItemServiceBase(Items.ENDER_PEARL);
                                 var2x.setOwner(null);
                                 this.zClass06737.reset();
                              });
                        }
                     }
                  );
            }
         }
      }
   }

   @EventTarget(0)
   public void UiAnimation(RefreshCacheEvent var1) {
      if (this.hitResult != null) {
         Predictions lii1l1lll1 = Predictions.predictions;
         float f = RotationMath.Event01(this.hitResult.getPos()).GrimGlide();
         IntStream.range(-89, 89)
            .mapToObj(var1x -> new Rotation(f, (float)var1x))
            .filter(
               var2x -> {
                  HitResult hitresult = lii1l1lll1.on23(
                     var2x.int202(), new EnderPearlEntity(EntityType.ENDER_PEARL, minecraftClient3.world), 1.5
                  );
                  return hitresult != null && hitresult.getType() != Type.ENTITY
                     ? MathUtils.PotionItemBuilder(hitresult.getPos(), this.hitResult.getPos()) <= 3.0
                     : false;
               }
            )
            .max(Comparator.comparingDouble(Rotation::GuiWalk))
            .ifPresent(var1x -> {
               this.rotation = var1x;
               this.zClass06737.reset();
            });
         if (this.rotation != null) {
            if (ZenithClient.on23()
               .CloudRouter()
               .LineShader()
               .EmoteManager(this.rotation)
               .EventMotion(10.0F)) {
               if (this.int88 >= 1) {
                  this.hitResult = null;
                  return;
               }

               this.int88++;
            }

            ZenithClient.on23()
               .CloudRouter()
               .on23(
                  new RotationTask(
                     this.rotation,
                     () -> val001.on23(Aura.aura.zClass088(), this.rotation),
                     Aura.aura.zClass088()
                  ),
                  20,
                  this,
                  2
               );
            var1.cancel();
         }
      }
   }

   @EventTarget
   public void UiAnimation(Event33 var1) {
   }
}
