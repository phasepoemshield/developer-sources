package org.zenith.module;

import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.ItemSpec;
import org.zenith.core.NbtEditor;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.LineShader;
import org.zenith.managers.EmoteManager;
import org.zenith.ZenithClient;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.util.MovementUtils;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.core.ItemServiceBase;
import org.zenith.rotation.Rotation;
import org.zenith.rotation.RotationTask;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.Event26;
import org.zenith.event.MovementInputEvent;


import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.client.input.KeyboardInput;

@ModuleInfo(
   name = "Strafe",
   description = "",
   category = Category.MOVEMENT
)
public final class Strafe extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final Strafe strafe = new Strafe();

   public Strafe() {
   }

   @EventTarget
   public void ItemServiceBase(Event26 var1) {
      float f = KeyboardInput.getMovementMultiplier(
         minecraftClient3.options.forwardKey.isPressed(), minecraftClient3.options.backKey.isPressed()
      );
      float f1 = KeyboardInput.getMovementMultiplier(
         minecraftClient3.options.leftKey.isPressed(), minecraftClient3.options.rightKey.isPressed()
      );
      if (f != 0.0F || f1 != 0.0F) {
         float f2 = minecraftClient3.player.getYaw();
         float f3 = (float)Math.toDegrees(Math.atan2((double)(-f1), (double)f));
         float f4 = f2 + f3;
         Rotation ililiiili1ll1li11 = val002.LineShader()
            .on23(
               val002.LineShader()
                  .EmoteManager(new Rotation(f4, minecraftClient3.player.getPitch()))
            );
         val002.on23(
            new RotationTask(
               ililiiili1ll1li11,
               () -> val002.int150().on23(val001.HudPreviewItem(), ililiiili1ll1li11),
               val001.HudPreviewItem()
            ),
            -1,
            this
         );
      }
   }

   @EventTarget
   public void ProfileItemBuilder(MovementInputEvent var1) {
      if (MovementUtils.double64() && val002.list49() == this) {
         var1.NbtEditor(false);
         var1.SimpleItemBuilder(false);
         var1.ItemServiceBase(false);
         var1.ItemSpec(
            minecraftClient3.options.forwardKey.isPressed()
               || minecraftClient3.options.backKey.isPressed()
               || minecraftClient3.options.rightKey.isPressed()
               || minecraftClient3.options.leftKey.isPressed()
         );
      }
   }
}
