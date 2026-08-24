package moscow.rockstar.module.movement;

import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.game.EntityJumpEvent;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.event.impl.player.InputEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.util.inventory.InventoryUtility;
import moscow.rockstar.util.inventory.ItemSlot;
import moscow.rockstar.util.inventory.group.SlotGroup;
import moscow.rockstar.util.inventory.group.SlotGroups;
import moscow.rockstar.util.inventory.slots.HotbarSlot;
import moscow.rockstar.util.inventory.slots.OffhandSlot;
import net.minecraft.block.BlockState;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;

@ModuleInfo(name = "Spider", category = ModuleCategory.MOVEMENT, desc = "Возможность лазить по стенам как паук")
public class Spider extends BaseModule {
   private final ModeSetting mode = new ModeSetting(this, "Режим");
   private final ModeSetting.Value vanilla = new ModeSetting.Value(this.mode, "Ванильный").select();
   private final ModeSetting.Value funTimeAim = new ModeSetting.Value(this.mode, "FunTimeAim");
   private final ModeSetting.Value water = new ModeSetting.Value(this.mode, "Водный");
   private final ModeSetting.Value sphere = new ModeSetting.Value(this.mode, "Сферический");
   private int waterSlot = -1;
   private int waterPreviousSlot = -1;
   private int sphereSlot = -1;
   private int spherePreviousSlot = -1;
   private Hand sphereHand = Hand.MAIN_HAND;
   private final EventListener<ClientPlayerTickEvent> onUpdateEvent = event -> {
      if (mc.player == null || mc.world == null || !this.isNearWall()) {
         return;
      }

      if (this.water.isSelected() && this.waterSlot != -1) {
         mc.options.useKey.setPressed(true);
         BlockHitResult hit = (BlockHitResult)mc.player.raycast(4.5, 0.0F, false);
         if (hit.getType() == HitResult.Type.BLOCK) {
            mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, hit);
         }
      } else if (this.sphere.isSelected() && mc.player.horizontalCollision) {
         mc.options.useKey.setPressed(true);
         Vec3d eye = mc.player.getEyePos();
         Vec3d look = mc.player.getRotationVector();
         BlockHitResult hit = mc.world.raycast(
            new RaycastContext(eye, eye.add(look.multiply(3.0)), RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, mc.player)
         );
         if (hit.getType() == HitResult.Type.BLOCK) {
            mc.interactionManager.interactBlock(mc.player, this.sphereHand, hit);
         }
      } else if ((this.vanilla.isSelected() || this.funTimeAim.isSelected()) && mc.player.horizontalCollision) {
         mc.player.setOnGround(true);
         mc.player.setVelocity(mc.player.getVelocity().x, 0.42, mc.player.getVelocity().z);
      }
   };
   private final EventListener<InputEvent> onInput = event -> {
      if (mc.player != null && this.isNearWall() && (this.vanilla.isSelected() || this.funTimeAim.isSelected())) {
         event.setJump(mc.player.horizontalCollision);
      }
   };
   private final EventListener<EntityJumpEvent> onJump = event -> {};

   @Override
   public void onEnable() {
      if (this.water.isSelected()) {
         this.prepareWaterBucket();
      } else if (this.sphere.isSelected()) {
         this.prepareSphereHead();
      }
   }

   @Override
   public void onDisable() {
      this.restoreSlots();
      mc.options.useKey.setPressed(false);
   }

   private void prepareWaterBucket() {
      SlotGroup<ItemSlot> group = SlotGroups.inventory().and(SlotGroups.hotbar());
      ItemSlot bucketSlot = group.findItem(Items.WATER_BUCKET);
      if (bucketSlot == null) {
         this.toggle();
         return;
      }

      this.waterPreviousSlot = mc.player.getInventory().selectedSlot;
      if (bucketSlot instanceof HotbarSlot hotbarSlot) {
         InventoryUtility.selectHotbarSlot(hotbarSlot);
         this.waterSlot = hotbarSlot.getSlotId();
      } else {
         InventoryUtility.hotbarSwap(bucketSlot.getIdForServer(), this.waterPreviousSlot);
         this.waterSlot = bucketSlot.getIdForServer();
      }
   }

   private void prepareSphereHead() {
      SlotGroup<ItemSlot> group = SlotGroups.offhand().and(SlotGroups.hotbar()).and(SlotGroups.inventory());
      ItemSlot headSlot = group.findItem(Items.PLAYER_HEAD);
      if (headSlot == null) {
         this.toggle();
         return;
      }

      if (headSlot instanceof OffhandSlot) {
         this.sphereHand = Hand.OFF_HAND;
         this.sphereSlot = -1;
         this.spherePreviousSlot = -1;
      } else {
         this.sphereHand = Hand.MAIN_HAND;
         this.spherePreviousSlot = mc.player.getInventory().selectedSlot;
         if (headSlot instanceof HotbarSlot hotbarSlot) {
            InventoryUtility.selectHotbarSlot(hotbarSlot);
            this.sphereSlot = hotbarSlot.getSlotId();
         } else {
            InventoryUtility.hotbarSwap(headSlot.getIdForServer(), this.spherePreviousSlot);
            this.sphereSlot = headSlot.getIdForServer();
         }
      }
   }

   private void restoreSlots() {
      if (mc.player == null) {
         return;
      }

      if (this.waterSlot != -1) {
         InventoryUtility.hotbarSwap(this.waterSlot, mc.player.getInventory().selectedSlot);
      }

      if (this.sphereSlot != -1) {
         InventoryUtility.hotbarSwap(this.sphereSlot, mc.player.getInventory().selectedSlot);
      }

      if (this.spherePreviousSlot != -1) {
         InventoryUtility.selectHotbarSlot(this.spherePreviousSlot);
      } else if (this.waterPreviousSlot != -1) {
         InventoryUtility.selectHotbarSlot(this.waterPreviousSlot);
      }

      this.waterSlot = -1;
      this.waterPreviousSlot = -1;
      this.sphereSlot = -1;
      this.spherePreviousSlot = -1;
      this.sphereHand = Hand.MAIN_HAND;
   }

   private boolean isNearWall() {
      if (mc.world == null || mc.player == null) {
         return false;
      }

      Box box = mc.player.getBoundingBox();
      double expand = Math.max(mc.player.getWidth() * 0.15, 0.03);
      Box expanded = box.expand(expand, 0.0, expand);
      BlockPos min = BlockPos.ofFloored(expanded.minX, box.minY, expanded.minZ);
      BlockPos max = BlockPos.ofFloored(expanded.maxX, box.maxY, expanded.maxZ);

      for (BlockPos pos : BlockPos.iterate(min, max)) {
         BlockState state = mc.world.getBlockState(pos);
         if (this.intersectsCollisionShape(state, pos, box, expanded)) {
            return true;
         }
      }

      return false;
   }

   private boolean intersectsCollisionShape(BlockState state, BlockPos pos, Box playerBox, Box expandedBox) {
      if (state.isAir()) {
         return false;
      }

      VoxelShape shape = state.getCollisionShape(mc.world, pos);
      if (shape.isEmpty() || !VoxelShapes.matchesAnywhere(shape, VoxelShapes.fullCube(), BooleanBiFunction.NOT_SAME)) {
         return false;
      }

      for (Box part : shape.getBoundingBoxes()) {
         Box offset = part.offset(pos);
         if (offset.intersects(expandedBox) && offset.maxY > playerBox.minY && offset.minY < playerBox.maxY) {
            return true;
         }
      }

      return false;
   }
}
