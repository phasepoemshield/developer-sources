package moscow.rockstar.module.player;

import java.util.HashSet;
import java.util.Set;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.util.game.WorldUtility;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(name = "Click Through", category = ModuleCategory.PLAYER, desc = "Возможность кликать сквозь предметы в инвентаре")
public class ClickThrough extends BaseModule {
   private final Set<BlockPos> visited = new HashSet<>();

   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (mc.player == null || mc.world == null || mc.interactionManager == null) {
         return;
      }
      if (!mc.options.useKey.isPressed() || mc.options.sneakKey.isPressed()) {
         return;
      }

      this.visited.clear();
      Vec3d eye = this.eyePos(mc.getRenderTickCounter().getTickDelta(true));
      Vec3d look = mc.player.getRotationVec(1.0F);

      for (int i = 1; i < 16; i++) {
         Vec3d point = eye.add(look.multiply(i * 0.25));
         BlockPos pos = BlockPos.ofFloored(point);
         if (!this.visited.add(pos) || mc.player.getPos().distanceTo(Vec3d.ofCenter(pos)) > 4.25) {
            continue;
         }

         for (BlockEntity be : WorldUtility.blockEntities) {
            if (!be.getPos().equals(pos)) {
               continue;
            }

            Direction face = Direction.getFacing(eye.x - pos.getX(), eye.y - pos.getY(), eye.z - pos.getZ());
            if (face == Direction.UP || face == Direction.DOWN) {
               face = Direction.NORTH;
            }
            BlockHitResult hit = new BlockHitResult(Vec3d.ofCenter(pos), face, pos, true);
            mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, hit);
            mc.player.swingHand(Hand.MAIN_HAND);
            return;
         }
      }
   };

   private Vec3d eyePos(float tickDelta) {
      double x = MathHelper.lerp(tickDelta, mc.player.prevX, mc.player.getX());
      double y = MathHelper.lerp(tickDelta, mc.player.prevY, mc.player.getY()) + mc.player.getEyeHeight(mc.player.getPose());
      double z = MathHelper.lerp(tickDelta, mc.player.prevZ, mc.player.getZ());
      return new Vec3d(x, y, z);
   }
}
