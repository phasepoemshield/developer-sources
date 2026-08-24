package org.zenith.module;

import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.ItemRegistry;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.CloudRouter;
import org.zenith.core.LineShader;
import org.zenith.event.Event01;
import org.zenith.managers.EmoteManager;
import org.zenith.util.Item;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.rotation.Rotation;
import org.zenith.rotation.RotationMath;
import org.zenith.rotation.RotationTask;
import org.zenith.util.ScreenUtils;
import org.zenith.util.TaskScheduler;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;
import org.zenith.core.PlayerStateService;

import org.zenith.event.Event26;
import org.zenith.event.EventInjectAddEntity;
import org.zenith.event.EventInjectPlaced;
import org.zenith.event.PreventActionEvent;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.block.Blocks;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;

@ModuleInfo(
   name = "AutoExplosion",
   description = "",
   category = Category.COMBAT
)
public final class AutoExplosion extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoExplosion autoExplosion = new AutoExplosion();
   public int ticks = 0;
   public BlockPos blockPos7 = null;
   public BlockPos blockPos8 = null;
   int val164 = 0;
   public Slot slot = null;

   public AutoExplosion() {
   }

   @EventTarget
   public void on23(EventInjectPlaced var1) {
      if (var1.NoFriendDamage().getBlock() == Blocks.OBSIDIAN) {
         this.ticks = 5;
         Slot slot = ScreenUtils.SimpleItemBuilder(Items.END_CRYSTAL);
         if (slot == null) {
            return;
         }

         this.blockPos8 = var1.NameProtect();
      }
   }

   @EventTarget
   public void Easing(Event26 var1) {
      if (this.blockPos8 != null) {
         Rotation ililiiili1ll1li11 = val002.LineShader()
            .on23(
               ZenithClient.on23()
                  .CloudRouter()
                  .LineShader()
                  .EmoteManager(RotationMath.Event01(this.blockPos8.toCenterPos().add(0.0, 0.5, 0.0)))
            );
         val002.on23(
            new RotationTask(ililiiili1ll1li11, () -> ililiiili1ll1li11, val001.HudPreviewItem()), 4, this, 1
         );
      }

      if (this.blockPos7 != null) {
         if (this.val164 > 0) {
            Rotation ililiiili1ll1li111 = val002.LineShader()
               .on23(
                  ZenithClient.on23()
                     .CloudRouter()
                     .LineShader()
                     .EmoteManager(RotationMath.Event01(this.blockPos7.toCenterPos().add(0.0, 1.2F, 0.0)))
               );
            val002.on23(
               new RotationTask(ililiiili1ll1li111, () -> ililiiili1ll1li111, val001.HudPreviewItem()), 4, this, 1
            );
            this.val164--;
         }
      }
   }

   @EventTarget
   public void UiAnimation(EventInjectAddEntity var1) {
      if (var1.ElytraFly() instanceof EndCrystalEntity endcrystalentity && endcrystalentity.getBlockPos().equals(this.blockPos7)) {
         this.val164 = 4;
      }
   }

   @EventTarget
   public void UiAnimation(PreventActionEvent var1) {
      if (!var1.isCancelled()
         && this.blockPos7 != null
         && this.val164 > 0
         && minecraftClient3.crosshairTarget instanceof EntityHitResult entityhitresult
         && entityhitresult.getEntity() instanceof EndCrystalEntity) {
         PlayerStateService.Easing(entityhitresult.getEntity());
         this.blockPos7 = null;
         var1.setCancelled(true);
      }

      if (this.ticks > 0) {
         this.ticks--;
      }

      if (this.ticks <= 0) {
         this.blockPos8 = null;
         if (this.slot != null && TaskScheduler.Easing(AutoExplosion.class)) {
            Slot slot1 = this.slot;
            TaskScheduler.on23(AutoExplosion.class, () -> ScreenUtils.on23(slot1, Hand.MAIN_HAND, true));
            this.slot = null;
         }
      } else if (this.blockPos8 != null) {
         Slot slot = ScreenUtils.SimpleItemBuilder(Items.END_CRYSTAL);
         if (slot != null) {
            if (!var1.isCancelled()
               && minecraftClient3.crosshairTarget instanceof BlockHitResult blockhitresult
               && minecraftClient3.world.getBlockState(blockhitresult.getBlockPos()).getBlock() == Blocks.OBSIDIAN) {
               if (minecraftClient3.player.getMainHandStack().getItem() == Items.END_CRYSTAL) {
                  EffectEngine.on23(blockhitresult, Hand.MAIN_HAND);
                  var1.setCancelled(true);
                  this.blockPos7 = blockhitresult.getBlockPos().up();
                  this.blockPos8 = null;
                  this.ticks = -4;
               } else if (TaskScheduler.ItemRegistry(AutoExplosion.class)) {
                  TaskScheduler.on23(AutoExplosion.class, () -> ScreenUtils.on23(slot, Hand.MAIN_HAND, true));
                  if (this.slot == null) {
                     this.slot = slot;
                  }
               }
            }
         }
      }
   }
}
