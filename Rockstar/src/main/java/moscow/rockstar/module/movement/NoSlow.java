package moscow.rockstar.module.movement;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.network.SendPacketEvent;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.event.impl.player.InputEvent;
import moscow.rockstar.systems.event.impl.player.SlowDownEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.ModeSetting;
import net.minecraft.block.Blocks;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;

@ModuleInfo(name = "No Slow", category = ModuleCategory.MOVEMENT, desc = "Отмена замедления при использовании предметов (еда, блоки, лук)")
public class NoSlow extends BaseModule {
   private final ModeSetting mode = new ModeSetting(this, "Режим");
   private final ModeSetting.Value grim = new ModeSetting.Value(this.mode, "Grim");
   private final ModeSetting.Value grimNew = new ModeSetting.Value(this.mode, "GrimNew").select();
   private final ModeSetting.Value grimTick = new ModeSetting.Value(this.mode, "GrimTick");
   private final ModeSetting.Value spooky = new ModeSetting.Value(this.mode, "Spooky");
   private final ModeSetting.Value holyWorld = new ModeSetting.Value(this.mode, "HolyWorld");
   private final ModeSetting.Value vonTam = new ModeSetting.Value(this.mode, "VonTam");
   private final ModeSetting.Value lonyGrief = new ModeSetting.Value(this.mode, "LonyGrief");

   private int ticks;
   private int sprintTick = -1;
   private boolean sprintState;

   private final EventListener<SlowDownEvent> onSlowDown = event -> {
      if (mc.player == null || mc.world == null || mc.interactionManager == null) {
         return;
      }

      if (this.grimNew.isSelected() || this.grimTick.isSelected()) {
         this.handleGrimNewSlow(event);
         return;
      }

      if (!mc.player.isUsingItem()) {
         this.ticks = 0;
         return;
      }

      if (this.spooky.isSelected() || this.holyWorld.isSelected()) {
         this.ticks++;
      }

      if ((mc.player.getMainHandStack().getUseAction() != UseAction.BLOCK && mc.player.getOffHandStack().getUseAction() != UseAction.EAT
            || mc.player.getActiveHand() != Hand.MAIN_HAND)
         && mc.player.isUsingItem()) {
         mc.player.setSprinting(true);
         if (mc.player.getActiveHand() == Hand.MAIN_HAND && !this.spooky.isSelected()) {
            mc.interactionManager.sendSequencedPacket(
               mc.world, sequence -> new PlayerInteractItemC2SPacket(Hand.OFF_HAND, sequence, mc.player.getYaw(), mc.player.getPitch())
            );
            event.cancel();
         } else {
            if (!this.spooky.isSelected() && !this.holyWorld.isSelected()) {
               mc.interactionManager.sendSequencedPacket(
                  mc.world, sequence -> new PlayerInteractItemC2SPacket(Hand.MAIN_HAND, sequence, mc.player.getYaw(), mc.player.getPitch())
               );
            }

            if (this.ticks >= 2 || this.grim.isSelected() || this.holyWorld.isSelected()) {
               event.cancel();
               this.ticks = 0;
            }
         }
      }
   };

   private final EventListener<InputEvent> onInput = event -> {
      if (this.vonTam.isSelected() && mc.player != null && mc.player.isUsingItem()) {
         event.setForward(event.getForward() * 1.02F);
      }
   };

   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (this.grimNew.isSelected()) {
         this.updateGrimNewSprint();
      } else {
         this.sprintTick = -1;
         this.sprintState = false;
      }

      if (this.grimTick.isSelected()) {
         this.sendDropPacket();
      }
   };

   private final EventListener<SendPacketEvent> onSend = event -> {
      if (this.lonyGrief.isSelected() && event.getPacket() instanceof PlayerActionC2SPacket) {
         this.sendDropPacket();
      }
   };

   @Override
   public void onDisable() {
      this.sprintTick = -1;
      this.sprintState = false;
      this.ticks = 0;
   }

   private void handleGrimNewSlow(SlowDownEvent event) {
      if (mc.player.isGliding() || !mc.player.isUsingItem()) {
         return;
      }

      if (mc.player.getActiveHand() == Hand.OFF_HAND) {
         if (mc.player.age % 2 == 0 && !mc.player.isSneaking()) {
            event.cancel();
         }
         return;
      }

      if (mc.player.getItemUseTime() > 0) {
         event.cancel();
      }
   }

   private void updateGrimNewSprint() {
      if (mc.player == null) {
         return;
      }

      int age = mc.player.age;
      if (this.sprintTick != age) {
         this.sprintState = this.sprintTick != -1 && !this.sprintState;
         this.sprintTick = age;
      }

      mc.player.setSprinting(this.sprintState);
   }

   private void sendDropPacket() {
      if (mc.player == null || mc.player.networkHandler == null || mc.player.isGliding()) {
         return;
      }

      if (mc.player.isUsingItem() && mc.player.getItemUseTime() == 0) {
         mc.player.networkHandler.sendPacket(
            new PlayerActionC2SPacket(PlayerActionC2SPacket.Action.DROP_ALL_ITEMS, BlockPos.ORIGIN, mc.player.getHorizontalFacing())
         );
      }
   }

   public boolean isOnSlowBlock() {
      if (mc.player == null || mc.world == null) {
         return false;
      }

      BlockPos below = BlockPos.ofFloored(mc.player.getPos()).down();
      BlockPos at = BlockPos.ofFloored(mc.player.getPos());
      return mc.world.getBlockState(below).isOf(Blocks.SNOW)
         || mc.world.getBlockState(below).isOf(Blocks.SHORT_GRASS)
         || mc.world.getBlockState(at).isOf(Blocks.SNOW)
         || mc.world.getBlockState(at).isOf(Blocks.SHORT_GRASS);
   }
}
