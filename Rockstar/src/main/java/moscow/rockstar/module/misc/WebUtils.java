package moscow.rockstar.module.misc;

import java.util.ArrayList;
import java.util.List;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.SelectSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.time.Timer;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;

@ModuleInfo(name = "Web Utils", category = ModuleCategory.OTHER, desc = "Утилиты для работы с паутиной (установка, обход, ловушки)")
public class WebUtils extends BaseModule {
   private final SelectSetting features = new SelectSetting(this, "Функции").min(1);
   private final SelectSetting.Value noWeb = new SelectSetting.Value(this.features, "Обход паутины");
   private final SelectSetting.Value trapWeb = new SelectSetting.Value(this.features, "Ловушка из паутины");
   private final SelectSetting placementMode = new SelectSetting(this, "Режим установки", () -> !this.trapWeb.isSelected()).min(1);
   private final SelectSetting.Value defaultPlacement = new SelectSetting.Value(this.placementMode, "Стандартный").select();
   private final SelectSetting.Value fullBody = new SelectSetting.Value(this.placementMode, "Полное тело");
   private final SelectSetting.Value sides = new SelectSetting.Value(this.placementMode, "По сторонам");
   private final SliderSetting count = new SliderSetting(this, "Количество", () -> !this.trapWeb.isSelected())
      .min(1.0F)
      .max(6.0F)
      .step(1.0F)
      .currentValue(1.0F);
   private final SliderSetting delay = new SliderSetting(this, "Задержка", () -> !this.trapWeb.isSelected())
      .min(0.0F)
      .max(1000.0F)
      .step(50.0F)
      .currentValue(0.0F)
      .suffix("мс");
   private final SliderSetting noWebSpeed = new SliderSetting(this, "Скорость обхода паутины", () -> !this.noWeb.isSelected())
      .min(0.1F)
      .max(1.0F)
      .step(0.01F)
      .currentValue(0.57F);
   private final Timer placeTimer = new Timer();
   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      this.handleNoWeb();
      if (!this.trapWeb.isSelected() || mc.player == null || mc.world == null || !this.placeTimer.finished((long)this.delay.getCurrentValue())) {
         return;
      }

      for (LivingEntity entity : mc.world.getEntitiesByClass(LivingEntity.class, mc.player.getBoundingBox().expand(5.0), target -> target != mc.player && target.isAlive())) {
         for (BlockPos pos : this.getPlacementPositions(entity)) {
            int slot = this.findWebSlot();
            if (slot != -1 && this.placeWeb(slot, pos)) {
               this.placeTimer.reset();
               return;
            }
         }
      }
   };

   private void handleNoWeb() {
      if (mc.player == null || mc.world == null || !this.noWeb.isSelected() || !this.isInWeb()) {
         return;
      }

      double vertical = mc.options.jumpKey.isPressed() ? 1.3 : (mc.options.sneakKey.isPressed() ? -1.3 : 0.0);
      float yaw = mc.player.getYaw() * (float)Math.PI / 180.0F;
      float speed = this.noWebSpeed.getCurrentValue();
      float forward = mc.player.input.movementForward * speed;
      float strafe = mc.player.input.movementSideways * speed;
      if (forward != 0.0F || strafe != 0.0F) {
         mc.player.setVelocity(
            -MathHelper.sin(yaw) * forward + MathHelper.cos(yaw) * strafe,
            vertical,
            MathHelper.cos(yaw) * forward + MathHelper.sin(yaw) * strafe
         );
      } else {
         mc.player.setVelocity(0.0, vertical, 0.0);
      }
   }

   private boolean isInWeb() {
      Box box = mc.player.getBoundingBox();
      int minX = MathHelper.floor(box.minX);
      int minY = MathHelper.floor(box.minY);
      int minZ = MathHelper.floor(box.minZ);
      int maxX = MathHelper.ceil(box.maxX);
      int maxY = MathHelper.ceil(box.maxY);
      int maxZ = MathHelper.ceil(box.maxZ);
      BlockPos.Mutable mutable = new BlockPos.Mutable();
      for (int x = minX; x < maxX; x++) {
         for (int y = minY; y < maxY; y++) {
            for (int z = minZ; z < maxZ; z++) {
               if (mc.world.getBlockState(mutable.set(x, y, z)).isOf(Blocks.COBWEB)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private int findWebSlot() {
      for (int i = 0; i < 45; i++) {
         if (mc.player.getInventory().getStack(i).isOf(Items.COBWEB)) {
            return i < 9 ? i + 36 : i;
         }
      }

      return -1;
   }

   private boolean placeWeb(int slot, BlockPos pos) {
      if (mc.interactionManager == null || mc.world == null || !mc.world.isAir(pos)) {
         return false;
      }

      if (slot == 40) {
         BlockHitResult hit = new BlockHitResult(pos.down().toCenterPos(), Direction.UP, pos.down(), false);
         mc.interactionManager.sendSequencedPacket(mc.world, sequence -> new PlayerInteractBlockC2SPacket(Hand.MAIN_HAND, hit, sequence));
      } else if (slot >= 36) {
         mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(slot - 36));
         BlockHitResult hit = new BlockHitResult(pos.down().toCenterPos(), Direction.UP, pos.down(), false);
         mc.interactionManager.sendSequencedPacket(mc.world, sequence -> new PlayerInteractBlockC2SPacket(Hand.MAIN_HAND, hit, sequence));
         mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(mc.player.getInventory().selectedSlot));
      } else {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, slot, 0, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, 44, 0, SlotActionType.PICKUP, mc.player);
      }

      return true;
   }

   private List<BlockPos> getPlacementPositions(LivingEntity entity) {
      BlockPos base = entity.getBlockPos();
      List<BlockPos> positions = new ArrayList<>();
      if (this.defaultPlacement.isSelected()) {
         this.addPosition(positions, base);
      }

      if (this.fullBody.isSelected()) {
         this.addPosition(positions, base);
         this.addPosition(positions, base.up());
      }

      if (this.sides.isSelected()) {
         this.addPosition(positions, base.north());
         this.addPosition(positions, base.south());
         this.addPosition(positions, base.east());
         this.addPosition(positions, base.west());
         this.addPosition(positions, base.north().up());
         this.addPosition(positions, base.south().up());
      }

      return positions;
   }

   private void addPosition(List<BlockPos> positions, BlockPos pos) {
      if (!positions.contains(pos)) {
         positions.add(pos);
      }
   }
}
