package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventPlaceBlock;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.RotationStorage;
import fun.wonderful.api.utils.rotate.Rotation;
import fun.wonderful.api.utils.rotate.RotationUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.mixin.ClientPlayerInteractionManagerAccessor;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ItemConvertible;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.hit.BlockHitResult;

public final class AutoExplosion
extends Module {
    public static AutoExplosion INSTANCE = new AutoExplosion();
    private final ModeSetting modeBaxa = new ModeSetting("Режим взрыва", "Авто", "Авто", "По бинду");
    private final BindSetting bind = new BindSetting("Бинд", -1).visible(() -> this.modeBaxa.is("По бинду"));
    private final BooleanSetting explosionOnRightClick = new BooleanSetting("Взрыв по ПКМ", true);
    private final BooleanSetting keepCrystal = new BooleanSetting("Оставлять кристалл", false);
    private final BooleanSetting protectResources = new BooleanSetting("Не взрывать ресурсы", false);
    private static final double INTERACT_RANGE = 4.5;
    private static final double RESOURCE_PROTECTION_RADIUS = 5.5;
    private boolean rotatingForCrystal;
    private BlockPos targetPos;
    private int targetSlot = -1;
    private int oldSlot = -1;
    private boolean needSync;
    private Box crystalArea;
    private boolean blocked;
    private boolean internalInteract;
    private boolean placedThisUpdate;
    private BlockPos pendingObsidianPos;
    private int pendingObsidianTicks;
    private int placeWaitTicks;
    private Hand targetHand = Hand.MAIN_HAND;
    private final List<BlockPos> ourPlacedPositions = new ArrayList<BlockPos>();
    private final List<PendingCrystal> pendingCrystals = new ArrayList<PendingCrystal>();
    private int lastSyncedSlot = -1;

    public AutoExplosion() {
        super("AutoExplosion", "Автоматически взрывает кристалл", Module.ModuleCategory.COMBAT);
        this.addSettings(this.modeBaxa, this.bind, this.explosionOnRightClick, this.keepCrystal, this.protectResources);
    }

    @EventLink
    public void onBinding(EventBinding var1) {
    }

    @EventLink
    public void onPacket(EventPacket event) {
        if (AutoExplosion.mc.player == null || AutoExplosion.mc.world == null) {
            return;
        }
        if (event.getType() != EventPacket.Type.SEND) {
            return;
        }
        if (this.internalInteract) {
            return;
        }
        Packet<?> class_25962 = event.getPacket();
        if (class_25962 instanceof PlayerInteractBlockC2SPacket) {
            PlayerInteractBlockC2SPacket packet = (PlayerInteractBlockC2SPacket)class_25962;
            BlockHitResult hit = packet.getBlockHitResult();
            BlockPos clickedPos = hit.getBlockPos();
            if (this.explosionOnRightClick.isState() && this.shouldPlaceByRightClick(clickedPos) && this.placeCrystalFromOffhand(hit, clickedPos)) {
                event.cancel();
            }
        }
    }

    @EventLink
    public void onPlaceBlock(EventPlaceBlock event) {
        if (AutoExplosion.mc.player == null || AutoExplosion.mc.world == null) {
            return;
        }
        if (event.getBlock() != Blocks.OBSIDIAN && event.getBlock() != Blocks.BEDROCK) {
            return;
        }
        if (!this.isInRange(event.getPos())) {
            return;
        }
        if (AutoExplosion.mc.player.getItemCooldownManager().isCoolingDown(new ItemStack((ItemConvertible)Items.END_CRYSTAL))) {
            return;
        }
        if (!this.hasCrystalAvailable() || this.shouldProtectResourcesAt(event.getPos().up())) {
            return;
        }
        if (this.hasLiveCrystalAt(event.getPos().up())) {
            return;
        }
        if (this.pendingObsidianPos != null || this.targetPos != null) {
            return;
        }
        this.queueCrystalAfterObsidian(event.getPos());
    }

    @EventLink
    public void onTick(EventUpdate var1) {
    }

    private void prepareAttackRotation() {
        if (this.placedThisUpdate) {
            return;
        }
        for (PendingCrystal pending : this.pendingCrystals) {
            EndCrystalEntity crystal = pending.crystal;
            if (!crystal.isAlive() || AutoExplosion.mc.world.getEntityById(crystal.getId()) == null || AutoExplosion.mc.player.getEyePos().squaredDistanceTo(crystal.getPos()) > 20.25 || this.shouldProtectResourcesInBox(crystal.getBoundingBox().expand(5.5))) continue;
            if (!pending.rotationReady) {
                this.rotateTo(crystal.getBoundingBox().getCenter());
                pending.rotationReady = true;
                this.rotatingForCrystal = true;
            }
            return;
        }
        this.rotatingForCrystal = false;
    }

    public boolean isRotatingForCrystal() {
        return this.isEnable() && this.rotatingForCrystal;
    }

    private void tryPlaceCrystalFast(BlockPos pos) {
        BlockPos crystalPos;
        ActionResult actionResult;
        Vec3d eyeVec = AutoExplosion.mc.player.getEyePos();
        Vec3d hitVec = this.getClosestVecOnBlock(eyeVec, pos);
        Vec3d offset = hitVec.subtract(eyeVec).negate();
        if (this.placeWaitTicks > 0) {
            this.rotateTo(hitVec);
            return;
        }
        if (!this.validateCrystalTarget()) {
            this.selectCrystalTarget();
        }
        if (!this.validateCrystalTarget() || !this.canTryPlaceCrystal(pos)) {
            this.targetPos = null;
            return;
        }
        this.rotateTo(hitVec);
        if (this.targetHand == Hand.MAIN_HAND && AutoExplosion.mc.player.getInventory().selectedSlot != this.targetSlot) {
            if (this.oldSlot == -1) {
                this.oldSlot = AutoExplosion.mc.player.getInventory().selectedSlot;
            }
            this.switchSelectedSlot(this.targetSlot);
        } else if (this.targetHand == Hand.MAIN_HAND) {
            this.switchSelectedSlot(this.targetSlot);
        }
        BlockHitResult result = new BlockHitResult(hitVec, this.getFaceFromOffset(offset), pos, false);
        this.internalInteract = true;
        try {
            actionResult = AutoExplosion.mc.interactionManager.interactBlock(AutoExplosion.mc.player, this.targetHand, result);
        }
        finally {
            this.internalInteract = false;
        }
        this.targetPos = null;
        this.placedThisUpdate = true;
        if (!actionResult.isAccepted()) {
            if (this.oldSlot != -1 && !this.keepCrystal.isState()) {
                this.restoreSelectedSlot();
            }
            return;
        }
        AutoExplosion.mc.player.swingHand(this.targetHand);
        if (this.oldSlot != -1 && !this.keepCrystal.isState()) {
            this.needSync = true;
        }
        if (!this.ourPlacedPositions.contains(crystalPos = pos.up())) {
            this.ourPlacedPositions.add(crystalPos);
        }
        this.crystalArea = this.boxFromBlock(crystalPos).expand(0.1);
    }

    private boolean shouldPlaceByRightClick(BlockPos clickedPos) {
        if (AutoExplosion.mc.player.getItemCooldownManager().isCoolingDown(new ItemStack((ItemConvertible)Items.END_CRYSTAL))) {
            return false;
        }
        if (this.isHoldingBlockForPlace()) {
            return false;
        }
        Block block = AutoExplosion.mc.world.getBlockState(clickedPos).getBlock();
        if (block != Blocks.OBSIDIAN && block != Blocks.BEDROCK) {
            return false;
        }
        return AutoExplosion.mc.world.getBlockState(clickedPos.up()).isAir();
    }

    private boolean placeCrystalFromOffhand(BlockHitResult var1, BlockPos var2) {
        return false;
    }


    private void placeObsidianByCrosshair() {
        ActionResult actionResult;
        Hand placeHand;
        HitResult ItemStackParticleEffect = AutoExplosion.mc.crosshairTarget;
        if (!(ItemStackParticleEffect instanceof BlockHitResult)) {
            return;
        }
        BlockHitResult hit = (BlockHitResult)ItemStackParticleEffect;
        if (hit.getType() != HitResult.Type.BLOCK) {
            return;
        }
        if (AutoExplosion.mc.world.getBlockState(hit.getBlockPos()).isAir()) {
            return;
        }
        BlockPos placePos = hit.getBlockPos().offset(hit.getSide());
        if (this.shouldProtectResourcesAt(placePos.up())) {
            return;
        }
        int restoreHotbarSlot = -1;
        int swappedInventorySlot = -1;
        if (AutoExplosion.mc.player.getOffHandStack().getItem() == Items.OBSIDIAN) {
            placeHand = Hand.OFF_HAND;
        } else {
            int hotbarSlot = this.findHotbarSlot(Items.OBSIDIAN);
            if (hotbarSlot != -1) {
                placeHand = Hand.MAIN_HAND;
                if (AutoExplosion.mc.player.getInventory().selectedSlot != hotbarSlot) {
                    restoreHotbarSlot = AutoExplosion.mc.player.getInventory().selectedSlot;
                    this.switchSelectedSlot(hotbarSlot);
                }
            } else {
                int obsidianSlot = this.findScreenSlot(Items.OBSIDIAN);
                if (obsidianSlot == -1) {
                    return;
                }
                this.swapSlotToOffhand(obsidianSlot);
                swappedInventorySlot = obsidianSlot;
                placeHand = Hand.OFF_HAND;
            }
        }
        this.internalInteract = true;
        try {
            actionResult = AutoExplosion.mc.interactionManager.interactBlock(AutoExplosion.mc.player, placeHand, hit);
        }
        finally {
            this.internalInteract = false;
        }
        if (actionResult.isAccepted()) {
            AutoExplosion.mc.player.swingHand(placeHand);
        }
        if (swappedInventorySlot != -1) {
            this.swapSlotToOffhand(swappedInventorySlot);
        }
        if (restoreHotbarSlot != -1) {
            this.switchSelectedSlot(restoreHotbarSlot);
        }
        if (!actionResult.isAccepted()) {
            return;
        }
    }

    private void queueCrystalAfterObsidian(BlockPos pos) {
        this.pendingObsidianPos = pos;
        this.pendingObsidianTicks = 0;
        this.placeWaitTicks = 1;
        this.targetPos = null;
        this.blocked = false;
    }

    private void tickPendingObsidian() {
    }


    private boolean hasLiveCrystalAt(BlockPos pos) {
        if (AutoExplosion.mc.world == null) {
            return false;
        }
        Box box = this.boxFromBlock(pos).expand(0.1);
        for (Entity entity : AutoExplosion.mc.world.getOtherEntities(null, box)) {
            EndCrystalEntity crystal;
            if (!(entity instanceof EndCrystalEntity) || !(crystal = (EndCrystalEntity)entity).isAlive()) continue;
            return true;
        }
        return false;
    }

    private void clearPendingObsidian() {
        this.pendingObsidianPos = null;
        this.pendingObsidianTicks = 0;
    }

    private void attackCrystal(EndCrystalEntity crystal) {
        AutoExplosion.mc.player.networkHandler.sendPacket((Packet)PlayerInteractEntityC2SPacket.attack((Entity)crystal, (boolean)AutoExplosion.mc.player.isSneaking()));
        AutoExplosion.mc.player.swingHand(Hand.MAIN_HAND);
    }

    private void collectOurCrystals() {
        this.collectCrystalsFromTrackedPositions();
        this.collectCrystalsFromArea();
    }

    private void collectCrystalsFromTrackedPositions() {
        if (this.ourPlacedPositions.isEmpty() || AutoExplosion.mc.world == null || AutoExplosion.mc.player == null) {
            return;
        }
        Box scan = AutoExplosion.mc.player.getBoundingBox().expand(6.0);
        for (Entity entity : AutoExplosion.mc.world.getOtherEntities(null, scan)) {
            BlockPos crystalPos;
            EndCrystalEntity crystal;
            if (!(entity instanceof EndCrystalEntity) || !(crystal = (EndCrystalEntity)entity).isAlive() || !this.isInRange(crystal.getBlockPos()) || !this.ourPlacedPositions.contains(crystalPos = crystal.getBlockPos()) || this.shouldProtectResourcesInBox(crystal.getBoundingBox().expand(5.5))) continue;
            this.addPendingCrystal(crystal);
        }
        this.ourPlacedPositions.removeIf(pos -> AutoExplosion.mc.player.getEyePos().squaredDistanceTo(Vec3d.ofCenter((Vec3i)pos)) > 144.0);
    }

    private void collectCrystalsFromArea() {
        if (this.crystalArea == null || AutoExplosion.mc.world == null || AutoExplosion.mc.player == null) {
            return;
        }
        boolean foundAny = false;
        for (Entity entity : AutoExplosion.mc.world.getOtherEntities(null, this.crystalArea)) {
            EndCrystalEntity crystal;
            if (!(entity instanceof EndCrystalEntity) || !(crystal = (EndCrystalEntity)entity).isAlive() || !this.isInRange(crystal.getBlockPos()) || this.shouldProtectResourcesInBox(crystal.getBoundingBox().expand(5.5))) continue;
            this.addPendingCrystal(crystal);
            foundAny = true;
        }
        if (foundAny) {
            this.crystalArea = null;
            return;
        }
        BlockPos base = BlockPos.ofFloored((double)(this.crystalArea.minX + 0.5), (double)(this.crystalArea.minY - 0.5), (double)(this.crystalArea.minZ + 0.5));
        Block block = AutoExplosion.mc.world.getBlockState(base).getBlock();
        if (block != Blocks.OBSIDIAN && block != Blocks.BEDROCK || AutoExplosion.mc.player.getEyePos().squaredDistanceTo(Vec3d.ofCenter((Vec3i)base)) > 20.25) {
            this.crystalArea = null;
        }
    }

    private void beginCrystalPlacement(BlockPos pos) {
        this.targetPos = pos;
        this.blocked = this.placeWaitTicks == 0;
    }

    private void tickPendingCrystals() {
        this.pendingCrystals.removeIf(pending -> {
            ++pending.ageTicks;
            if (pending.ageTicks > 40) {
                this.ourPlacedPositions.remove(pending.crystal.getBlockPos());
                return true;
            }
            if (!this.isCrystalAlive(pending.crystal)) {
                this.ourPlacedPositions.remove(pending.crystal.getBlockPos());
                return true;
            }
            return false;
        });
    }

    private void attackPendingCrystals() {
        if (this.placedThisUpdate || this.pendingCrystals.isEmpty()) {
            return;
        }
        this.pendingCrystals.removeIf(pending -> {
            EndCrystalEntity crystal = pending.crystal;
            if (!this.isCrystalAlive(crystal)) {
                this.ourPlacedPositions.remove(crystal.getBlockPos());
                return true;
            }
            if (AutoExplosion.mc.player.getEyePos().squaredDistanceTo(crystal.getPos()) > 20.25) {
                return false;
            }
            if (this.shouldProtectResourcesInBox(crystal.getBoundingBox().expand(5.5))) {
                return true;
            }
            if (!pending.rotationReady) {
                return false;
            }
            if (pending.attacked) {
                return false;
            }
            this.attackCrystal(crystal);
            pending.attacked = true;
            this.rotatingForCrystal = false;
            RotationStorage.instance.idleTicks(RotationStorage.instance.currentTimeout());
            this.crystalArea = null;
            this.ourPlacedPositions.remove(crystal.getBlockPos());
            return true;
        });
    }

    private boolean isCrystalAlive(EndCrystalEntity crystal) {
        return crystal.isAlive() && AutoExplosion.mc.world.getEntityById(crystal.getId()) != null;
    }

    private void addPendingCrystal(EndCrystalEntity crystal) {
        for (PendingCrystal pending : this.pendingCrystals) {
            if (pending.crystal != crystal && pending.crystal.getId() != crystal.getId()) continue;
            return;
        }
        this.pendingCrystals.add(new PendingCrystal(crystal));
    }

    private Vec3d getClosestVecOnBlock(Vec3d eye, BlockPos pos) {
        Box box = new Box(pos);
        return new Vec3d(Math.max(box.minX, Math.min(eye.x, box.maxX)), Math.max(box.minY, Math.min(eye.y, box.maxY)), Math.max(box.minZ, Math.min(eye.z, box.maxZ)));
    }

    private Direction getFaceFromOffset(Vec3d offset) {
        double ax2 = Math.abs(offset.x);
        double ay2 = Math.abs(offset.y);
        double az2 = Math.abs(offset.z);
        if (ay2 >= ax2 && ay2 >= az2) {
            return offset.y > 0.0 ? Direction.UP : Direction.DOWN;
        }
        if (ax2 >= az2) {
            return offset.x > 0.0 ? Direction.EAST : Direction.WEST;
        }
        return offset.z > 0.0 ? Direction.SOUTH : Direction.NORTH;
    }

    private void rotateTo(Vec3d vec) {
        Vec2f rotation = RotationUtils.getRotations(vec);
        RotationStorage.update(new Rotation(rotation.x, rotation.y), 360.0f, 360.0f, 360.0f, 360.0f, 1, 1, false);
    }

    private boolean canTryPlaceCrystal(BlockPos pos) {
        if (this.shouldProtectResourcesAt(pos.up())) {
            return false;
        }
        BlockPos up1 = pos.up();
        if (!AutoExplosion.mc.world.getBlockState(up1).isAir()) {
            return false;
        }
        Box checkBox = this.boxFromBlock(up1).expand(0.1);
        for (Entity entity : AutoExplosion.mc.world.getOtherEntities(null, checkBox)) {
            EndCrystalEntity crystal;
            if (!(entity instanceof EndCrystalEntity) || !(crystal = (EndCrystalEntity)entity).isAlive()) continue;
            return false;
        }
        return true;
    }

    private boolean hasCrystalAvailable() {
        return AutoExplosion.mc.player.getOffHandStack().getItem() == Items.END_CRYSTAL || this.findCrystalSlot() != -1;
    }

    private boolean selectCrystalTarget() {
        int slot = this.findCrystalSlot();
        if (slot != -1) {
            this.targetHand = Hand.MAIN_HAND;
            this.targetSlot = slot;
            return true;
        }
        if (AutoExplosion.mc.player.getOffHandStack().getItem() == Items.END_CRYSTAL) {
            this.targetHand = Hand.OFF_HAND;
            this.targetSlot = -1;
            return true;
        }
        return false;
    }

    private boolean validateCrystalTarget() {
        if (this.targetHand == Hand.OFF_HAND) {
            return AutoExplosion.mc.player.getOffHandStack().getItem() == Items.END_CRYSTAL;
        }
        return this.targetSlot >= 0 && this.targetSlot <= 8 && AutoExplosion.mc.player.getInventory().getStack(this.targetSlot).getItem() == Items.END_CRYSTAL;
    }

    private boolean shouldProtectResourcesAt(BlockPos crystalPos) {
        if (!this.protectResources.isState()) {
            return false;
        }
        return this.shouldProtectResourcesInBox(this.boxFromBlock(crystalPos).expand(5.5));
    }

    private boolean shouldProtectResourcesInBox(Box box) {
        if (!this.protectResources.isState() || AutoExplosion.mc.world == null) {
            return false;
        }
        for (Entity entity : AutoExplosion.mc.world.getOtherEntities(null, box)) {
            ItemEntity itemEntity;
            if (!(entity instanceof ItemEntity) || !this.isProtectedResource((itemEntity = (ItemEntity)entity).getStack())) continue;
            return true;
        }
        return false;
    }

    private boolean isProtectedResource(ItemStack stack) {
        Item item = stack.getItem();
        return item == Items.NETHERITE_HELMET || item == Items.NETHERITE_CHESTPLATE || item == Items.NETHERITE_LEGGINGS || item == Items.NETHERITE_BOOTS || item == Items.PLAYER_HEAD || item == Items.END_CRYSTAL || item == Items.GOLDEN_APPLE || item == Items.ENCHANTED_GOLDEN_APPLE || item == Items.ELYTRA || item == Items.TOTEM_OF_UNDYING;
    }

    private int findCrystalSlot() {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (AutoExplosion.mc.player.getInventory().getStack(i2).getItem() != Items.END_CRYSTAL) continue;
            return i2;
        }
        return -1;
    }

    private int findHotbarSlot(Item item) {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (AutoExplosion.mc.player.getInventory().getStack(i2).getItem() != item) continue;
            return i2;
        }
        return -1;
    }

    private int findScreenSlot(Item item) {
        for (int i2 = 9; i2 < 45; ++i2) {
            ItemStack stack = AutoExplosion.mc.player.playerScreenHandler.getSlot(i2).getStack();
            if (stack.getItem() != item) continue;
            return i2;
        }
        return -1;
    }

    private void swapSlotToOffhand(int slot) {
        if (slot >= 36 && slot <= 44) {
            AutoExplosion.mc.interactionManager.clickSlot(0, 45, slot - 36, SlotActionType.SWAP, (PlayerEntity)AutoExplosion.mc.player);
            return;
        }
        AutoExplosion.mc.interactionManager.clickSlot(0, slot, 0, SlotActionType.SWAP, (PlayerEntity)AutoExplosion.mc.player);
        AutoExplosion.mc.interactionManager.clickSlot(0, 45, 0, SlotActionType.SWAP, (PlayerEntity)AutoExplosion.mc.player);
        AutoExplosion.mc.interactionManager.clickSlot(0, slot, 0, SlotActionType.SWAP, (PlayerEntity)AutoExplosion.mc.player);
    }

    private void switchSelectedSlot(int slot) {
        AutoExplosion.mc.player.getInventory().selectedSlot = slot;
        if (this.lastSyncedSlot != slot) {
            this.lastSyncedSlot = slot;
            ((ClientPlayerInteractionManagerAccessor)AutoExplosion.mc.interactionManager).wonderful$syncSelectedSlot();
        }
    }

    private void restoreSelectedSlot() {
        if (this.oldSlot != -1) {
            this.switchSelectedSlot(this.oldSlot);
            this.oldSlot = -1;
        }
    }

    private Box boxFromBlock(BlockPos pos) {
        return new Box((double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), (double)pos.getX() + 1.0, (double)pos.getY() + 1.0, (double)pos.getZ() + 1.0);
    }

    private boolean isHoldingBlockForPlace() {
        Item main = AutoExplosion.mc.player.getMainHandStack().getItem();
        Item off = AutoExplosion.mc.player.getOffHandStack().getItem();
        return main instanceof BlockItem && main != Items.PLAYER_HEAD || off instanceof BlockItem && off != Items.PLAYER_HEAD;
    }

    private boolean isInRange(BlockPos pos) {
        return AutoExplosion.mc.player.getEyePos().distanceTo(Vec3d.ofCenter((Vec3i)pos)) <= 4.5;
    }

    private void reset() {
        if (this.oldSlot != -1 && AutoExplosion.mc.player != null && mc.getNetworkHandler() != null) {
            this.restoreSelectedSlot();
        }
        this.targetPos = null;
        this.targetSlot = -1;
        this.targetHand = Hand.MAIN_HAND;
        this.needSync = false;
        this.crystalArea = null;
        this.clearPendingObsidian();
        this.placeWaitTicks = 0;
        this.blocked = false;
        this.internalInteract = false;
        this.placedThisUpdate = false;
        this.rotatingForCrystal = false;
        this.ourPlacedPositions.clear();
        this.pendingCrystals.clear();
        this.lastSyncedSlot = -1;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.reset();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.reset();
    }

    @Generated
    public ModeSetting getModeBaxa() {
        return this.modeBaxa;
    }

    @Generated
    public BindSetting getBind() {
        return this.bind;
    }

    @Generated
    public BooleanSetting getExplosionOnRightClick() {
        return this.explosionOnRightClick;
    }

    @Generated
    public BooleanSetting getKeepCrystal() {
        return this.keepCrystal;
    }

    @Generated
    public BooleanSetting getProtectResources() {
        return this.protectResources;
    }

    @Generated
    public BlockPos getTargetPos() {
        return this.targetPos;
    }

    @Generated
    public int getTargetSlot() {
        return this.targetSlot;
    }

    @Generated
    public int getOldSlot() {
        return this.oldSlot;
    }

    @Generated
    public boolean isNeedSync() {
        return this.needSync;
    }

    @Generated
    public Box getCrystalArea() {
        return this.crystalArea;
    }

    @Generated
    public boolean isBlocked() {
        return this.blocked;
    }

    @Generated
    public boolean isInternalInteract() {
        return this.internalInteract;
    }

    @Generated
    public boolean isPlacedThisUpdate() {
        return this.placedThisUpdate;
    }

    @Generated
    public BlockPos getPendingObsidianPos() {
        return this.pendingObsidianPos;
    }

    @Generated
    public int getPendingObsidianTicks() {
        return this.pendingObsidianTicks;
    }

    @Generated
    public int getPlaceWaitTicks() {
        return this.placeWaitTicks;
    }

    @Generated
    public Hand getTargetHand() {
        return this.targetHand;
    }

    @Generated
    public List<BlockPos> getOurPlacedPositions() {
        return this.ourPlacedPositions;
    }

    @Generated
    public List<PendingCrystal> getPendingCrystals() {
        return this.pendingCrystals;
    }

    @Generated
    public int getLastSyncedSlot() {
        return this.lastSyncedSlot;
    }

    @Generated
    public void setRotatingForCrystal(boolean rotatingForCrystal) {
        this.rotatingForCrystal = rotatingForCrystal;
    }

    @Generated
    public void setTargetPos(BlockPos targetPos) {
        this.targetPos = targetPos;
    }

    @Generated
    public void setTargetSlot(int targetSlot) {
        this.targetSlot = targetSlot;
    }

    @Generated
    public void setOldSlot(int oldSlot) {
        this.oldSlot = oldSlot;
    }

    @Generated
    public void setNeedSync(boolean needSync) {
        this.needSync = needSync;
    }

    @Generated
    public void setCrystalArea(Box crystalArea) {
        this.crystalArea = crystalArea;
    }

    @Generated
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Generated
    public void setInternalInteract(boolean internalInteract) {
        this.internalInteract = internalInteract;
    }

    @Generated
    public void setPlacedThisUpdate(boolean placedThisUpdate) {
        this.placedThisUpdate = placedThisUpdate;
    }

    @Generated
    public void setPendingObsidianPos(BlockPos pendingObsidianPos) {
        this.pendingObsidianPos = pendingObsidianPos;
    }

    @Generated
    public void setPendingObsidianTicks(int pendingObsidianTicks) {
        this.pendingObsidianTicks = pendingObsidianTicks;
    }

    @Generated
    public void setPlaceWaitTicks(int placeWaitTicks) {
        this.placeWaitTicks = placeWaitTicks;
    }

    @Generated
    public void setTargetHand(Hand targetHand) {
        this.targetHand = targetHand;
    }

    @Generated
    public void setLastSyncedSlot(int lastSyncedSlot) {
        this.lastSyncedSlot = lastSyncedSlot;
    }

    private static final class PendingCrystal {
        final EndCrystalEntity crystal;
        int ageTicks;
        boolean rotationReady;
        boolean attacked;

        PendingCrystal(EndCrystalEntity crystal) {
            this.crystal = crystal;
        }
    }
}