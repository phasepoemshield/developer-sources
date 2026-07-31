package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventPacket;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.movement.Sprint;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import net.minecraft.util.Formatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.TntEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import ru.ocz.protection.annotation.Compile;

public class AutoTotem
extends Module {
    public static AutoTotem INSTANCE = new AutoTotem();
    private final ListSetting triggers = new ListSetting("Брать от", new BooleanSetting("Кристалл рядом", true), new BooleanSetting("Кристалл в руке", true), new BooleanSetting("Обсидиан в руке", true), new BooleanSetting("Падения", true));
    private final FloatSetting hp = new FloatSetting("Брать от хп", 6.0f, 1.0f, 20.0f, 0.5f);
    private final FloatSetting hpOnElytra = new FloatSetting("Хп на элитрах", 10.0f, 1.0f, 20.0f, 0.5f);
    private final FloatSetting crystalRadius = new FloatSetting("Радиус кристалла", 6.0f, 1.0f, 12.0f, 0.5f).visible(this::isCrystalRadiusVisible);
    private final BooleanSetting tntNearby = new BooleanSetting("Динамит рядом", true);
    private final FloatSetting tntRadius = new FloatSetting("Радиус динамита", 10.0f, 1.0f, 16.0f, 0.5f).visible(this.tntNearby::isState);
    private final FloatSetting fallHeight = new FloatSetting("Высота падения", 10.0f, 3.0f, 50.0f, 1.0f).visible(() -> this.triggers.is("Падения"));
    private final BooleanSetting saveEnchanted = new BooleanSetting("Сохранять зачар", true);
    private final BooleanSetting returnTotem = new BooleanSetting("Возвращать предмет", true);
    private final FloatSetting returnDelay = new FloatSetting("Задержка возврата", 20.0f, 5.0f, 100.0f, 5.0f).visible(this.returnTotem::isState);
    private final BooleanSetting bypassgrim = new BooleanSetting("Обходить Grim", true);
    private final ModeSetting swapVersion = new ModeSetting("Версия свапа", "1.21.4", "1.21.4", "1.16.5");
    private int bypassTicks;
    private boolean sprintPaused;
    private int swapCooldown;
    private int savedTotemSlot = -1;
    private ItemStack originalOffhandItem = ItemStack.EMPTY;
    private boolean totemTakenByUs = false;
    private boolean returnMode = false;
    private boolean needFastSwap = false;
    private int safeTicks = 0;
    private int tntBlockHintTicks = 0;
    private int tntScanCooldown = 0;
    private boolean cachedTntBlockDanger = false;
    private boolean tntWarningShown = false;

    public AutoTotem() {
        super("AutoTotem", "Автоматически берёт тотем", Module.ModuleCategory.COMBAT);
        this.addSettings(this.hp, this.hpOnElytra, this.saveEnchanted, this.bypassgrim, this.returnTotem, this.swapVersion, this.returnDelay, this.triggers, this.crystalRadius, this.tntNearby, this.tntRadius, this.fallHeight);
    }

    @EventLink
    public void onInput(EventMoveInput e2) {
        if (this.bypassgrim.isState() && this.bypassTicks > 0) {
            if (AutoTotem.mc.player == null) {
                return;
            }
            AutoTotem.mc.player.setSprinting(false);
            e2.setForward(0.0f);
            e2.setStrafe(0.0f);
            e2.setJump(false);
            e2.setSneak(false);
        }
    }

    @EventLink
    public void onUpdate(EventUpdate e2) {
        boolean isSafe;
        if (AutoTotem.mc.player == null || AutoTotem.mc.world == null) {
            return;
        }
        boolean isCrystalDanger = this.isCrystalDanger();
        boolean isTntDanger = this.isTntDanger();
        if (isCrystalDanger) {
            this.needFastSwap = true;
            this.safeTicks = 0;
        }
        if (isTntDanger) {
            this.needFastSwap = true;
            this.safeTicks = 0;
            if (!this.tntWarningShown) {
                ChatUtils.sendMessage(String.valueOf(Formatting.RED) + String.valueOf(Formatting.BOLD) + "Рядом динамит! Тотем в оффхенд.");
                this.tntWarningShown = true;
            }
        } else {
            this.tntWarningShown = false;
        }
        if (this.swapCooldown > 0) {
            --this.swapCooldown;
        }
        if (this.bypassgrim.isState() && this.bypassTicks > 0) {
            AutoTotem.mc.player.setSprinting(false);
            --this.bypassTicks;
            if (this.bypassTicks <= 0) {
                if (this.returnMode) {
                    this.performReturn();
                } else {
                    this.performSwap();
                }
                this.restoreSprint();
            }
            return;
        }
        boolean needTotem = this.shouldTakeTotem(isCrystalDanger, isTntDanger);
        if (needTotem && !this.hasTotemInOffhand()) {
            int totemSlot = this.findTotemSlot();
            if (totemSlot == -1) {
                return;
            }
            if (!this.needFastSwap && this.swapCooldown > 0) {
                return;
            }
            if (this.originalOffhandItem.isEmpty() && !this.totemTakenByUs) {
                this.originalOffhandItem = AutoTotem.mc.player.getOffHandStack().copy();
            }
            this.savedTotemSlot = totemSlot;
            this.returnMode = false;
            this.safeTicks = 0;
            if (this.bypassgrim.isState()) {
                this.disableSprint();
                this.bypassTicks = this.needFastSwap ? 1 : 2;
                this.swapCooldown = this.needFastSwap ? 0 : 2;
            } else {
                this.performSwap();
                this.swapCooldown = this.needFastSwap ? 0 : 2;
            }
        }
        boolean bl = isSafe = !needTotem;
        this.safeTicks = isSafe ? ++this.safeTicks : 0;
        if (this.returnTotem.isState() && this.totemTakenByUs && AutoTotem.mc.player.getOffHandStack().isEmpty()) {
            if (!this.needFastSwap && this.swapCooldown > 0) {
                return;
            }
            this.returnMode = true;
            if (this.bypassgrim.isState()) {
                this.disableSprint();
                this.bypassTicks = this.needFastSwap ? 1 : 2;
                this.swapCooldown = this.needFastSwap ? 0 : 2;
            } else {
                this.performReturn();
                this.swapCooldown = this.needFastSwap ? 0 : 2;
            }
            return;
        }
        if (this.returnTotem.isState() && !needTotem && this.totemTakenByUs && this.safeTicks >= this.returnDelay.getValue().intValue()) {
            if (!this.needFastSwap && this.swapCooldown > 0) {
                return;
            }
            this.returnMode = true;
            if (this.bypassgrim.isState()) {
                this.disableSprint();
                this.bypassTicks = this.needFastSwap ? 1 : 2;
                this.swapCooldown = this.needFastSwap ? 0 : 2;
            } else {
                this.performReturn();
                int n2 = this.swapCooldown = this.needFastSwap ? 0 : 2;
            }
        }
        if (!isCrystalDanger && !isTntDanger) {
            this.needFastSwap = false;
        }
        if (this.tntBlockHintTicks > 0) {
            --this.tntBlockHintTicks;
        }
    }

    @EventLink
    public void onPacket(EventPacket event) {
        Packet<?> class_25962;
        if (AutoTotem.mc.player == null || AutoTotem.mc.world == null || event.getType() != EventPacket.Type.RECEIVE) {
            return;
        }
        if (!this.tntNearby.isState() || !((class_25962 = event.getPacket()) instanceof BlockUpdateS2CPacket)) {
            return;
        }
        BlockUpdateS2CPacket packet = (BlockUpdateS2CPacket)class_25962;
        if (packet.getState().isOf(Blocks.TNT) && this.isWithinTntRadius(packet.getPos())) {
            this.tntBlockHintTicks = 20;
        }
    }

    private boolean isCrystalDanger() {
        float radius = this.crystalRadius.getValue().floatValue();
        double radiusSq = radius * radius;
        if (this.triggers.is("Кристалл рядом")) {
            for (Entity entity : AutoTotem.mc.world.getEntities()) {
                if (!(entity instanceof EndCrystalEntity) || !(AutoTotem.mc.player.squaredDistanceTo(entity) <= radiusSq)) continue;
                return true;
            }
        }
        if (this.triggers.is("Кристалл в руке")) {
            for (PlayerEntity player : AutoTotem.mc.world.getPlayers()) {
                if (player == AutoTotem.mc.player || !(AutoTotem.mc.player.squaredDistanceTo((Entity)player) <= radiusSq) || !player.getMainHandStack().isOf(Items.END_CRYSTAL) && !player.getOffHandStack().isOf(Items.END_CRYSTAL)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean shouldTakeTotem(boolean isCrystalDanger, boolean isTntDanger) {
        float hpThreshold;
        float currentHp = AutoTotem.mc.player.getHealth() + AutoTotem.mc.player.getAbsorptionAmount();
        boolean isGliding = AutoTotem.mc.player.getEquippedStack(EquipmentSlot.CHEST).isOf(Items.ELYTRA) && AutoTotem.mc.player.isGliding();
        float f2 = hpThreshold = isGliding ? this.hpOnElytra.getValue().floatValue() : this.hp.getValue().floatValue();
        if (currentHp <= hpThreshold) {
            return true;
        }
        if (isCrystalDanger) {
            return true;
        }
        if (isTntDanger) {
            return true;
        }
        float radius = this.crystalRadius.getValue().floatValue();
        double radiusSq = radius * radius;
        if (this.triggers.is("Обсидиан в руке")) {
            for (PlayerEntity player : AutoTotem.mc.world.getPlayers()) {
                if (player == AutoTotem.mc.player || !(AutoTotem.mc.player.squaredDistanceTo((Entity)player) <= radiusSq) || !player.getMainHandStack().isOf(Items.OBSIDIAN) && !player.getOffHandStack().isOf(Items.OBSIDIAN)) continue;
                return true;
            }
        }
        return this.triggers.is("Падения") && AutoTotem.mc.player.fallDistance >= this.fallHeight.getValue().floatValue() && !isGliding;
    }

    private boolean isTntDanger() {
        if (!this.tntNearby.isState()) {
            return false;
        }
        float radius = this.tntRadius.getValue().floatValue();
        double radiusSq = radius * radius;
        if (this.tntBlockHintTicks > 0) {
            return true;
        }
        for (Entity entity : AutoTotem.mc.world.getEntities()) {
            if (!(entity instanceof TntEntity) || !entity.isAlive() || !(AutoTotem.mc.player.squaredDistanceTo(entity) <= radiusSq)) continue;
            return true;
        }
        if (this.tntScanCooldown > 0) {
            --this.tntScanCooldown;
            return this.cachedTntBlockDanger;
        }
        this.tntScanCooldown = 5;
        this.cachedTntBlockDanger = false;
        BlockPos playerPos = AutoTotem.mc.player.getBlockPos();
        int radiusInt = (int)Math.ceil(radius);
        int minY = Math.max(AutoTotem.mc.world.getBottomY(), playerPos.getY() - radiusInt);
        int maxY = Math.min(AutoTotem.mc.world.getTopYInclusive(), playerPos.getY() + radiusInt);
        BlockPos.class_2339 mutable = new BlockPos.class_2339();
        for (int dx = -radiusInt; dx <= radiusInt; ++dx) {
            for (int dy = minY - playerPos.getY(); dy <= maxY - playerPos.getY(); ++dy) {
                for (int dz = -radiusInt; dz <= radiusInt; ++dz) {
                    if ((double)(dx * dx + dy * dy + dz * dz) > radiusSq) continue;
                    mutable.set(playerPos.getX() + dx, playerPos.getY() + dy, playerPos.getZ() + dz);
                    if (!AutoTotem.mc.world.getBlockState((BlockPos)mutable).isOf(Blocks.TNT)) continue;
                    this.cachedTntBlockDanger = true;
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isWithinTntRadius(BlockPos pos) {
        double centerZ;
        double centerY;
        float radius = this.tntRadius.getValue().floatValue();
        double centerX = (double)pos.getX() + 0.5;
        return AutoTotem.mc.player.squaredDistanceTo(centerX, centerY = (double)pos.getY() + 0.5, centerZ = (double)pos.getZ() + 0.5) <= (double)(radius * radius);
    }

    private boolean hasTotemInOffhand() {
        return AutoTotem.mc.player.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING);
    }

    private int findTotemSlot() {
        int normalTotem = -1;
        int enchantedTotem = -1;
        for (int i2 = 9; i2 < 45; ++i2) {
            ItemStack stack = AutoTotem.mc.player.playerScreenHandler.getSlot(i2).getStack();
            if (!stack.isOf(Items.TOTEM_OF_UNDYING)) continue;
            boolean isEnchanted = stack.hasEnchantments();
            if (isEnchanted) {
                if (enchantedTotem != -1) continue;
                enchantedTotem = i2;
                continue;
            }
            if (normalTotem != -1) continue;
            normalTotem = i2;
        }
        if (this.saveEnchanted.isState()) {
            return normalTotem != -1 ? normalTotem : enchantedTotem;
        }
        return enchantedTotem != -1 ? enchantedTotem : normalTotem;
    }

    @Compile
    private native void performSwap();

    @Compile
    private native void performReturn();

    private int findSlotForItem(ItemStack item) {
        if (item.isEmpty()) {
            return -1;
        }
        for (int i2 = 9; i2 < 45; ++i2) {
            ItemStack stack = AutoTotem.mc.player.playerScreenHandler.getSlot(i2).getStack();
            if (!ItemStack.areItemsEqual((ItemStack)stack, (ItemStack)item) || !ItemStack.areEqual((ItemStack)stack, (ItemStack)item)) continue;
            return i2;
        }
        return -1;
    }

    @Compile
    private native void doSwap(int var1);

    @Compile
    private native void doSwap1214(int var1);

    private void doSwap1165(int slot) {
        AutoTotem.mc.interactionManager.clickSlot(0, slot, 40, SlotActionType.SWAP, (PlayerEntity)AutoTotem.mc.player);
    }

    private void disableSprint() {
        if (this.sprintPaused) {
            return;
        }
        Sprint.pushPause(1000L);
        this.sprintPaused = true;
    }

    private void restoreSprint() {
        if (!this.sprintPaused) {
            return;
        }
        this.sprintPaused = false;
        Sprint.popPause();
    }

    private boolean isCrystalRadiusVisible() {
        return this.triggers.is("Кристалл рядом") || this.triggers.is("Кристалл в руке") || this.triggers.is("Обсидиан в руке");
    }

    @Override
    public void onDisable() {
        this.bypassTicks = 0;
        this.swapCooldown = 0;
        this.savedTotemSlot = -1;
        this.originalOffhandItem = ItemStack.EMPTY;
        this.totemTakenByUs = false;
        this.returnMode = false;
        this.needFastSwap = false;
        this.safeTicks = 0;
        this.tntBlockHintTicks = 0;
        this.tntScanCooldown = 0;
        this.cachedTntBlockDanger = false;
        this.tntWarningShown = false;
        this.restoreSprint();
        super.onDisable();
    }
}