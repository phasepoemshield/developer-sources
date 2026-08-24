package org.zenith.module;

import org.zenith.core.Easing;
import org.zenith.core.WaypointData;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.NbtItemSpec;
import org.zenith.util.ScreenUtils;
import org.zenith.util.StopWatch;
import org.zenith.util.TaskScheduler;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.BlockInteractEvent;
import org.zenith.event.EventMouseScrollHook;
import org.zenith.event.EventTick;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Comparator;
import java.util.Objects;
import net.minecraft.block.BlockState;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

@ModuleInfo(
   name = "AutoTool",
   category = Category.MISC,
   description = "\u0412\u044b\u0431\u0438\u0440\u0430\u0435\u0442 \u043b\u0443\u0447\u0448\u0438\u0439 \u0438\u043d\u0441\u0442\u0440\u0443\u043c\u0435\u043d\u0442 \u0434\u043b\u044f \u0434\u043e\u0431\u044b\u0447\u0438 \u0431\u043b\u043e\u043a\u043e\u0432"
)
public final class AutoTool extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoTool autoTool = new AutoTool();
   public final StopWatch stopWatch = new StopWatch();
   public Slot slot = null;

   public AutoTool() {
   }

   @EventTarget
   public void on23(EventMouseScrollHook var1) {
      if (this.slot != null) {
         var1.setCancelled(true);
      }
   }

   @EventTarget
   public void on23(BlockInteractEvent var1) {
      this.stopWatch.reset();
      if (!Objects.requireNonNull(minecraftClient3.player).isCreative()) {
         Slot slot = this.NbtItemSpec(var1.WaypointData());
         if (slot != null && slot != ScreenUtils.call119()) {
            if (this.slot == null) {
               this.slot = slot;
            }

            if (TaskScheduler.Easing(AutoTool.class)) {
               TaskScheduler.on23(AutoTool.class, () -> {
                  if (!(minecraftClient3.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                     ScreenUtils.closeScreen();
                  }

                  ScreenUtils.on23(slot, Hand.MAIN_HAND, true);
               });
            }
         }
      }
   }

   @EventTarget
   public void ItemSpec(EventTick var1) {
      if (TaskScheduler.Easing(AutoTool.class)
         && this.slot != null
         && this.stopWatch.BotFeatureRegistry(400.0)
         && !minecraftClient3.options.attackKey.isPressed()) {
         Slot slot = this.slot;
         TaskScheduler.on23(AutoTool.class, () -> {
            if (!(minecraftClient3.player.currentScreenHandler instanceof PlayerScreenHandler)) {
               ScreenUtils.closeScreen();
            }

            ScreenUtils.on23(slot, Hand.MAIN_HAND, true);
         });
         this.slot = null;
      }
   }

   public Slot NbtItemSpec(BlockPos var1) {
      BlockState blockstate = minecraftClient3.world.getBlockState(var1);
      return EffectEngine.ItemSpec(blockstate)
         ? ScreenUtils.call119()
         : minecraftClient3.player
            .playerScreenHandler
            .slots
            .stream()
            .sorted(Comparator.comparing(var0 -> var0.equals(ScreenUtils.call119())))
            .filter(var1x -> var1x.getStack().getMiningSpeedMultiplier(blockstate) != 1.0F)
            .max(Comparator.comparingDouble(var1x -> (double)var1x.getStack().getMiningSpeedMultiplier(blockstate)))
            .orElse(null);
   }
}
