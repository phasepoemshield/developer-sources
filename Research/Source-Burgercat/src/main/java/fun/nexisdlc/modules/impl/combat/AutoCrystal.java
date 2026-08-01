package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.events.impl.client.TickEvent;
import fun.nexisdlc.client.events.impl.client.FastestEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.block.Blocks;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

@FunctionAdd(
    name = "AutoCrystal",
    alias = "Auto Crystal",
    category = Category.Combat,
    description = "Автоматически размещает и взрывает кристаллы энда после установки обсидиана"
)
public class AutoCrystal extends Function {
    
    SliderSetting placeDelay = new SliderSetting("Задержка размещения (мс)", 0, 0, 500, 10);
    SliderSetting breakDelay = new SliderSetting("Задержка взрыва (мс)", 0, 0, 500, 10);
    BooleanSetting autoRotate = new BooleanSetting("Авто-поворот", true);

    private static final int CRYSTAL_ROTATION_PRIORITY = 100;
    private static final String ROTATION_TASK_NAME = "autocrystal";
    private static final int MAX_FAILED_ATTEMPTS = 5;
    private static final long RESET_TIMEOUT_MS = 2000L;
    
    private BlockPos obsidianPos = null;
    private EndCrystalEntity targetCrystal = null;
    private long obsidianPlaceTime = 0;
    private long crystalPlaceTime = 0;
    private int slotToRestore = -1;
    private boolean needPlaceCrystal = false;
    private boolean needBreakCrystal = false;
    private int failedPlaceAttempts = 0;
    private int failedBreakAttempts = 0;
    private long cycleStartTime = 0;
    private Random random = new Random();
    
    public AutoCrystal() {
        addSettings(placeDelay, breakDelay, autoRotate);
    }
    
    @Override
    public void onEnable() {
        super.onEnable();
        reset();
    }
    
    @Override
    public void onDisable() {
        super.onDisable();
        reset();
        if (autoRotate.get()) {
            RotationTask.rotationState = RotationTask.RotationState.IDLE;
            RotationTask.rotationPriority = 0;
        }
    }
    
    private void reset() {
        obsidianPos = null;
        targetCrystal = null;
        obsidianPlaceTime = 0;
        crystalPlaceTime = 0;
        slotToRestore = -1;
        needPlaceCrystal = false;
        needBreakCrystal = false;
        failedPlaceAttempts = 0;
        failedBreakAttempts = 0;
        cycleStartTime = 0;
    }
    
    @EventHandler
    public void onPacket(EventPacket e) {
        if (nullCheck()) return;
        
        // Ловим установку обсидиана
        if (e.isSend() && e.getPacket() instanceof PlayerInteractBlockC2SPacket packet) {
            if (mc.player.getMainHandStack().isOf(Blocks.OBSIDIAN.asItem()) || 
                mc.player.getOffHandStack().isOf(Blocks.OBSIDIAN.asItem())) {
                
                obsidianPos = packet.getBlockHitResult().getBlockPos().offset(packet.getBlockHitResult().getSide());
                obsidianPlaceTime = System.currentTimeMillis();
                needPlaceCrystal = true;
                needBreakCrystal = false;
                targetCrystal = null;
            }
        }
    }
    
    @EventHandler
    public void onTick(TickEvent e) {
        if (nullCheck()) return;
        
        // Восстанавливаем слот если нужно
        if (slotToRestore != -1) {
            mc.player.getInventory().setSelectedSlot(slotToRestore);
            slotToRestore = -1;
        }
        
        if (!hasCrystalsInHotbar()) {
            reset();
            return;
        }
        
        // Ищем кристалл если нужно взорвать
        if (needBreakCrystal && (targetCrystal == null || targetCrystal.isRemoved())) {
            findTargetCrystal();
        }
    }
    
    @EventHandler
    public void onFastest(FastestEvent e) {
        if (nullCheck()) return;
        
        long now = System.currentTimeMillis();
        
        // Проверка общего таймаута цикла
        if (cycleStartTime > 0 && now - cycleStartTime > RESET_TIMEOUT_MS) {
            reset();
            resetRotation();
            return;
        }
        
        // Размещение кристалла
        if (needPlaceCrystal && obsidianPos != null) {
            long elapsed = now - obsidianPlaceTime;
            
            if (elapsed >= placeDelay.get()) {
                // Проверка на слишком много неудачных попыток
                if (failedPlaceAttempts >= MAX_FAILED_ATTEMPTS) {
                    reset();
                    resetRotation();
                    return;
                }
                
                // Размещаем кристалл
                if (placeCrystal()) {
                    needPlaceCrystal = false;
                    needBreakCrystal = true;
                    crystalPlaceTime = now;
                    failedPlaceAttempts = 0;
                    if (cycleStartTime == 0) cycleStartTime = now;
                } else {
                    failedPlaceAttempts++;
                    // Применяем ротацию только если есть шанс на успех
                    if (autoRotate.get() && failedPlaceAttempts <= MAX_FAILED_ATTEMPTS) {
                        Vec3d targetPos = Vec3d.ofCenter(obsidianPos).add(0, 0.5, 0);
                        applyRotation(targetPos);
                    }
                }
            }
        }
        
        // Взрыв кристалла
        if (needBreakCrystal) {
            long elapsed = now - crystalPlaceTime;
            
            if (failedBreakAttempts >= MAX_FAILED_ATTEMPTS) {
                reset();
                resetRotation();
                return;
            }
            
            // Ищем кристалл
            if (targetCrystal == null || targetCrystal.isRemoved()) {
                findTargetCrystal();
            }
            
            if (targetCrystal != null && !targetCrystal.isRemoved() && elapsed >= breakDelay.get()) {
                // Применяем ротацию
                if (autoRotate.get()) {
                    Vec3d crystalCenter = new Vec3d(
                        targetCrystal.getX(),
                        targetCrystal.getY() + targetCrystal.getHeight() / 2.0,
                        targetCrystal.getZ()
                    );
                    applyRotation(crystalCenter);
                }
                
                // Взрываем кристалл
                if (breakCrystal()) {
                    resetRotation();
                    reset();
                } else {
                    failedBreakAttempts++;
                }
            } else if (targetCrystal == null || targetCrystal.isRemoved()) {
                failedBreakAttempts++;
            }
        }
    }
    
    private void resetRotation() {
        if (autoRotate.get()) {
            RotationTask.rotationState = RotationTask.RotationState.RESET;
            RotationTask.returnStartTime = System.currentTimeMillis() - 460;
            RotationTask.rotationPriority = 0;
            RotationTask.inactiveMs = 0L;
            RotationTask.needSmoothReset = true;
            RotationTask.resetDelayMs = 10;
        }
    }
    
    private boolean hasCrystalsInHotbar() {
        return PlayerInventoryUtil.getHotbarSlot(Items.END_CRYSTAL) != null;
    }
    
    private boolean placeCrystal() {
        if (mc.world == null || mc.player == null || obsidianPos == null) return false;
        
        // Проверки
        if (mc.player.squaredDistanceTo(Vec3d.ofCenter(obsidianPos)) > 11.85) return false;
        if (!mc.world.getBlockState(obsidianPos).isOf(Blocks.OBSIDIAN)) return false;
        
        BlockPos crystalPos = obsidianPos.up();
        if (!mc.world.getBlockState(crystalPos).isAir()) return false;
        if (!mc.world.getBlockState(crystalPos.up()).isAir()) return false;
        
        // Переключаем на кристалл
        Slot crystalSlot = PlayerInventoryUtil.getHotbarSlot(Items.END_CRYSTAL);
        if (crystalSlot == null) return false;
        
        slotToRestore = mc.player.getInventory().getSelectedSlot();
        int crystalHotbarSlot = crystalSlot.id - 36;
        if (crystalHotbarSlot >= 0 && crystalHotbarSlot < 9) {
            mc.player.getInventory().setSelectedSlot(crystalHotbarSlot);
        }
        
        // Размещаем
        BlockHitResult hitResult = new BlockHitResult(
            Vec3d.ofCenter(obsidianPos).add(0, 0.5, 0),
            Direction.UP,
            obsidianPos,
            false
        );
        
        ActionResult result = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, hitResult);
        if (result.isAccepted()) {
            mc.player.swingHand(Hand.MAIN_HAND);
            return true;
        }
        
        return false;
    }
    
    private void findTargetCrystal() {
        if (mc.world == null || mc.player == null) return;
        
        EndCrystalEntity nearestCrystal = null;
        double nearestDistance = Double.MAX_VALUE;
        
        if (obsidianPos != null) {
            Vec3d expectedPos = Vec3d.ofCenter(obsidianPos.up());
            
            for (var entity : mc.world.getEntities()) {
                if (entity instanceof EndCrystalEntity crystal) {
                    Vec3d crystalPos = new Vec3d(crystal.getX(), crystal.getY(), crystal.getZ());
                    double distanceToExpected = crystalPos.distanceTo(expectedPos);
                    
                    if (distanceToExpected < 2.0 && distanceToExpected < nearestDistance) {
                        nearestCrystal = crystal;
                        nearestDistance = distanceToExpected;
                    }
                }
            }
        }
        
        targetCrystal = nearestCrystal;
    }
    
    private boolean breakCrystal() {
        if (targetCrystal == null || targetCrystal.isRemoved()) return false;
        if (mc.player.distanceTo(targetCrystal) > 3.44) return false;
        
        mc.interactionManager.attackEntity(mc.player, targetCrystal);
        mc.player.swingHand(Hand.MAIN_HAND);
        return true;
    }
    
    private void applyRotation(Vec3d target) {
        if (mc.player == null || target == null) return;
        
        RotationTask.create(ROTATION_TASK_NAME, CRYSTAL_ROTATION_PRIORITY);
        
        float[] rotation = calculateRotation(target);
        
        RotationTask.setTargetRotation(
            rotation[0],
            rotation[1],
            Float.MAX_VALUE,
            Float.MAX_VALUE,
            2000f,
            2000f,
            0,
            CRYSTAL_ROTATION_PRIORITY,
            -1L
        );
    }
    
    private float[] calculateRotation(Vec3d target) {
        if (mc.player == null) return new float[]{0, 0};
        
        Vec3d eyePos = mc.player.getEyePos();
        double deltaX = target.x - eyePos.x;
        double deltaY = target.y - eyePos.y;
        double deltaZ = target.z - eyePos.z;
        
        double distance = Math.sqrt(deltaX * deltaX + deltaZ * deltaZ);
        
        float yaw = (float) (Math.atan2(deltaZ, deltaX) * 180.0 / Math.PI) - 90.0f;
        float pitch = (float) -(Math.atan2(deltaY, distance) * 180.0 / Math.PI);
        
        return new float[]{yaw, pitch};
    }
}
