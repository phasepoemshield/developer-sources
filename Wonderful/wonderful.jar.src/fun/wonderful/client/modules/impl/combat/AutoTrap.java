package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventBinding;
import fun.wonderful.api.events.implement.EventGameUpdate;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.rotate.RotationUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.combat.AntiBot;
import fun.wonderful.client.modules.settings.implement.BindSetting;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.MathHelper;
import ru.ocz.protection.annotation.Compile;

public class AutoTrap
extends Module {
    public static AutoTrap INSTANCE = new AutoTrap();
    private final ModeSetting mode = new ModeSetting("Мод", "Obsidian", "Obsidian", "CobWeb");
    private final FloatSetting distance = new FloatSetting("Дистанция", 3.0f, 1.0f, 5.0f, 0.1f);
    private final BindSetting bind = new BindSetting("Бинд", -1);
    private final BooleanSetting fromInventory = new BooleanSetting("Из инвентаря", false);
    private final BooleanSetting rotation = new BooleanSetting("Ротация", true);
    private final ListSetting targets = new ListSetting("Таргеты", new BooleanSetting("Игроки", true), new BooleanSetting("Невидимые", true), new BooleanSetting("Себя", false));
    private final BooleanSetting reverseRotate = new BooleanSetting("Реверс ротейт", true).visible(this.rotation::isState);
    private PlayerEntity target;
    private int oldSlot = -1;
    private int inventorySlot = -1;
    private boolean placing = false;
    private boolean use = false;
    private final List<BlockPos> blocksToPlace = new ArrayList<BlockPos>();
    private int placeIndex = 0;
    private BlockPos currentBlock = null;
    private boolean waitingForRotation = false;
    private int rotationTicks = 0;
    private float restoreYaw;
    private float restorePitch;

    public AutoTrap() {
        super("AutoTrap", "Автоматически ставит ловушку", Module.ModuleCategory.COMBAT);
        this.addSettings(this.mode, this.distance, this.bind, this.fromInventory, this.rotation, this.reverseRotate, this.targets);
    }

    @EventLink
    public void onBinding(EventBinding event) {
        if (AutoTrap.mc.currentScreen != null) {
            return;
        }
        if (event.getKey() == this.bind.getKey()) {
            this.use = true;
        }
    }

    @EventLink
    public void onGameUpdate(EventGameUpdate e2) {
        if (AutoTrap.mc.player == null || AutoTrap.mc.world == null) {
            return;
        }
        if (!this.placing || this.currentBlock == null || !this.rotation.isState()) {
            return;
        }
        this.rotateToBlock(this.currentBlock);
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);

    @Compile
    private native void rotateToBlock(BlockPos var1);

    private Vec3d getHitVec(BlockPos neighbor, Direction face) {
        Vec3d center = Vec3d.ofCenter((Vec3i)neighbor);
        return center.add((double)face.getOffsetX() * 0.5, (double)face.getOffsetY() * 0.5, (double)face.getOffsetZ() * 0.5);
    }

    private boolean isRotatedToBlock(BlockPos pos) {
        if (!this.rotation.isState()) {
            return true;
        }
        Direction side = this.getPlaceSide(pos);
        if (side == null) {
            return false;
        }
        BlockPos neighbor = pos.offset(side);
        Direction opposite = side.getOpposite();
        Vec3d hitVec = this.getHitVec(neighbor, opposite);
        Vec2f targetRot = RotationUtils.getRotations(hitVec);
        float yawDiff = Math.abs(MathHelper.wrapDegrees((float)(targetRot.x - AutoTrap.mc.player.getYaw())));
        float pitchDiff = Math.abs(MathHelper.wrapDegrees((float)(targetRot.y - AutoTrap.mc.player.getPitch())));
        return yawDiff < 5.0f && pitchDiff < 5.0f;
    }

    private void startPlacing() {
        this.blocksToPlace.clear();
        this.placeIndex = 0;
        this.waitingForRotation = false;
        this.rotationTicks = 0;
        BlockPos targetPos = this.target.getBlockPos();
        if (this.mode.is("Obsidian")) {
            this.blocksToPlace.add(targetPos.add(1, 0, 0));
            this.blocksToPlace.add(targetPos.add(-1, 0, 0));
            this.blocksToPlace.add(targetPos.add(0, 0, 1));
            this.blocksToPlace.add(targetPos.add(0, 0, -1));
            this.blocksToPlace.add(targetPos.add(1, 1, 0));
            this.blocksToPlace.add(targetPos.add(-1, 1, 0));
            this.blocksToPlace.add(targetPos.add(0, 1, 1));
            this.blocksToPlace.add(targetPos.add(0, 1, -1));
            this.blocksToPlace.add(targetPos.add(0, 2, 0));
            this.blocksToPlace.add(targetPos.add(1, 2, 0));
            this.blocksToPlace.add(targetPos.add(-1, 2, 0));
            this.blocksToPlace.add(targetPos.add(0, 2, 1));
            this.blocksToPlace.add(targetPos.add(0, 2, -1));
        } else {
            this.blocksToPlace.add(targetPos);
            this.blocksToPlace.add(targetPos.up());
        }
        if (this.fromInventory.isState()) {
            this.oldSlot = AutoTrap.mc.player.getInventory().selectedSlot;
            int slot = this.findItemSlot();
            if (slot == -1) {
                this.placing = false;
                return;
            }
            if (slot < 9) {
                AutoTrap.mc.player.getInventory().selectedSlot = slot;
                this.inventorySlot = -1;
            } else {
                this.inventorySlot = slot;
                AutoTrap.mc.interactionManager.clickSlot(AutoTrap.mc.player.currentScreenHandler.syncId, slot, this.oldSlot, SlotActionType.SWAP, (PlayerEntity)AutoTrap.mc.player);
            }
        }
        this.placing = true;
    }

    private void processPlacing() {
        BlockPos pos;
        if (this.target != null && (!this.target.isAlive() || AntiBot.checkBot((LivingEntity)this.target) || AutoTrap.mc.player.distanceTo((Entity)this.target) > this.distance.getValue().floatValue())) {
            this.finishPlacing();
            return;
        }
        if (this.placeIndex >= this.blocksToPlace.size()) {
            this.finishPlacing();
            return;
        }
        this.currentBlock = pos = this.blocksToPlace.get(this.placeIndex);
        if (!AutoTrap.mc.world.getBlockState(pos).isReplaceable()) {
            ++this.placeIndex;
            this.waitingForRotation = false;
            this.rotationTicks = 0;
            return;
        }
        Direction side = this.getPlaceSide(pos);
        if (side == null) {
            ++this.placeIndex;
            this.waitingForRotation = false;
            this.rotationTicks = 0;
            return;
        }
        if (this.rotation.isState()) {
            if (!this.waitingForRotation) {
                this.rotateToBlock(pos);
                this.waitingForRotation = true;
                this.rotationTicks = 0;
                return;
            }
            ++this.rotationTicks;
            if (!this.isRotatedToBlock(pos) || this.rotationTicks < 2) {
                this.rotateToBlock(pos);
                return;
            }
        }
        this.placeBlock(pos);
        ++this.placeIndex;
        this.waitingForRotation = false;
        this.rotationTicks = 0;
    }

    private void finishPlacing() {
        if (this.fromInventory.isState()) {
            if (this.inventorySlot != -1) {
                AutoTrap.mc.interactionManager.clickSlot(AutoTrap.mc.player.currentScreenHandler.syncId, this.inventorySlot, this.oldSlot, SlotActionType.SWAP, (PlayerEntity)AutoTrap.mc.player);
                this.inventorySlot = -1;
            } else if (this.oldSlot != -1) {
                AutoTrap.mc.player.getInventory().selectedSlot = this.oldSlot;
            }
            this.oldSlot = -1;
        }
        this.placing = false;
        this.target = null;
        this.currentBlock = null;
        this.blocksToPlace.clear();
        this.placeIndex = 0;
        this.waitingForRotation = false;
        this.rotationTicks = 0;
    }

    private Direction getPlaceSide(BlockPos pos) {
        BlockState state;
        BlockPos neighbor;
        Direction[] priority;
        for (Direction dir : priority = new Direction[]{Direction.DOWN, Direction.UP, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST}) {
            neighbor = pos.offset(dir);
            state = AutoTrap.mc.world.getBlockState(neighbor);
            if (state.isReplaceable() || state.isLiquid() || !state.isSolidBlock((BlockView)AutoTrap.mc.world, neighbor)) continue;
            return dir;
        }
        for (Direction dir : priority) {
            neighbor = pos.offset(dir);
            state = AutoTrap.mc.world.getBlockState(neighbor);
            if (state.isReplaceable() || state.isLiquid()) continue;
            return dir;
        }
        return null;
    }

    @Compile
    private native void placeBlock(BlockPos var1);

    private int findItemSlot() {
        Item item = this.mode.is("Obsidian") ? Items.OBSIDIAN : Items.COBWEB;
        for (int i2 = 0; i2 < 36; ++i2) {
            if (AutoTrap.mc.player.getInventory().getStack(i2).getItem() != item) continue;
            return i2;
        }
        return -1;
    }

    private PlayerEntity findTarget() {
        if (this.targets.is("Себя")) {
            return AutoTrap.mc.player;
        }
        ArrayList<PlayerEntity> playerTargets = new ArrayList<PlayerEntity>();
        for (Entity entity : AutoTrap.mc.world.getEntities()) {
            PlayerEntity player;
            if (!(entity instanceof PlayerEntity) || (player = (PlayerEntity)entity) == AutoTrap.mc.player || !player.isAlive() || AntiBot.checkBot((LivingEntity)player) || !this.targets.is("Игроки") || player.hasStatusEffect(StatusEffects.INVISIBILITY) && !this.targets.is("Невидимые") || Wonderful.INSTANCE.friendStorage.isFriend(player.getName().getString()) || AutoTrap.mc.player.distanceTo((Entity)player) > this.distance.getValue().floatValue()) continue;
            playerTargets.add(player);
        }
        if (playerTargets.isEmpty()) {
            return null;
        }
        playerTargets.sort(Comparator.comparingDouble(p2 -> AutoTrap.mc.player.distanceTo((Entity)p2)));
        return (PlayerEntity)playerTargets.get(0);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        if (this.placing) {
            this.finishPlacing();
        }
        this.target = null;
        this.placing = false;
        this.use = false;
        this.currentBlock = null;
        this.blocksToPlace.clear();
        this.placeIndex = 0;
        this.oldSlot = -1;
        this.inventorySlot = -1;
        this.waitingForRotation = false;
        this.rotationTicks = 0;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.placing = false;
        this.use = false;
        this.currentBlock = null;
        this.blocksToPlace.clear();
        this.placeIndex = 0;
        this.oldSlot = -1;
        this.inventorySlot = -1;
        this.waitingForRotation = false;
        this.rotationTicks = 0;
    }
}