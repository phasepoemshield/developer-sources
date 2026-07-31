package sg.mx;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.destra.core.DestraClient;
import ru.destra.event.MotionTickEvent;
import ru.destra.misc.ChatCommandSender2;

@Mixin(ClientPlayerEntity.class)
public abstract non-sealed class ClientPlayerEntityMixin implements ChatCommandSender2 {
   MotionTickEvent movement = new MotionTickEvent(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

   @Inject(method = "sendMovementPackets", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/ClientPlayerEntity;isCamera()Z"))
   public void move(CallbackInfo var1) {
      if (this.movement == null) {
         this.movement = new MotionTickEvent(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      }
      this.movement.setX(MinecraftClient.getInstance().player.getX());
      this.movement.setY(MinecraftClient.getInstance().player.getY());
      this.movement.setZ(MinecraftClient.getInstance().player.getZ());
      this.movement.setPrevX(MinecraftClient.getInstance().player.prevX);
      this.movement.setPrevY(MinecraftClient.getInstance().player.prevY);
      this.movement.setPrevZ(MinecraftClient.getInstance().player.prevZ);
      DestraClient.getInstance().getEventBus().post(this.movement);
   }
}
