package moscow.rockstar.module.movement;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.game.WorldChangeEvent;
import moscow.rockstar.systems.event.impl.network.SendPacketEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.util.math.Vec3d;
@ModuleInfo(name = "Air Stuck", category = ModuleCategory.MOVEMENT)
public class AirStuck extends BaseModule {
  private final BooleanSetting catchMoment = new BooleanSetting(this, "Ловить момент").enable();
   private double peakY = Double.NaN;
   private boolean stuck;
   private Vec3d stuckPos = Vec3d.ZERO;

   private final EventListener<SendPacketEvent> onSendPacket = event -> {
      if (this.stuck && event.getPacket() instanceof PlayerMoveC2SPacket) {
         event.cancel();
      }
   };
   private final EventListener<WorldChangeEvent> onWorldChange = event -> this.reset();

   @Override
   public void onEnable() {
      this.stuck = false;
      this.stuckPos = Vec3d.ZERO;
      if (mc.player == null) {
         this.peakY = Double.NaN;
         return;
      }

      if (this.catchMoment.isEnabled()) {
         this.peakY = mc.player.isOnGround() ? Double.NaN : mc.player.getY();
      } else {
         this.peakY = mc.player.getY();
         this.freezePlayer();
      }

      super.onEnable();
   }

   @Override
   public void tick() {
      if (mc.player == null) {
         this.reset();
         super.tick();
         return;
      }

      if (this.catchMoment.isEnabled()) {
         double y = mc.player.getY();
         if (mc.player.isOnGround()) {
            this.peakY = Double.NaN;
            this.stuck = false;
         } else if (!this.stuck) {
            if (Double.isNaN(this.peakY) || y > this.peakY) {
               this.peakY = y;
            } else if (y < this.peakY) {
               this.freezePlayer();
            }
         }
      }

      if (this.stuck) {
         mc.player.setVelocity(Vec3d.ZERO);
         mc.player.setPosition(this.stuckPos);
         if (mc.player.input != null) {
            mc.player.input.movementForward = 0.0F;
            mc.player.input.movementSideways = 0.0F;
         }
      }

      super.tick();
   }

   @Override
   public void onDisable() {
      this.reset();
      super.onDisable();
   }

   private void freezePlayer() {
      if (mc.player == null) {
         return;
      }

      this.stuck = true;
      this.stuckPos = mc.player.getPos();
      this.peakY = mc.player.getY();
   }

   private void reset() {
      this.stuck = false;
      this.peakY = Double.NaN;
      this.stuckPos = Vec3d.ZERO;
   }
}
