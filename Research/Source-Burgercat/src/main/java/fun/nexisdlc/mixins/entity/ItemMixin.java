package fun.nexisdlc.mixins.entity;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.RotationFixEvent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ItemMixin {
    @Inject(method = "raycast", at = @At("HEAD"), cancellable = true)
    private static void onRaycast(World world, PlayerEntity player, RaycastContext.FluidHandling fluidHandling, CallbackInfoReturnable<BlockHitResult> cir) {
        var rotateFixEvent = new RotationFixEvent();
        Nexis.getEventBus().post(rotateFixEvent);

        if (rotateFixEvent.isCancelled()) {
            Vec3d vec3d = player.getEyePos();
            Vec3d vec3d2 = vec3d.add(player.getRotationVector(rotateFixEvent.getPitch(), rotateFixEvent.getYaw()).multiply(player.getBlockInteractionRange()));
            cir.setReturnValue(world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.OUTLINE, fluidHandling, player)));
        }
    }
}
