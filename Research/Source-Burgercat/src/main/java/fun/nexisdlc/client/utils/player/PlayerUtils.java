package fun.nexisdlc.client.utils.player;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.client.other.Script;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.player.rotation.RotateVector;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.impl.player.PlayerUtilsFunction;
import fun.nexisdlc.modules.impl.utils.FixHP;
import fun.nexisdlc.modules.impl.utils.ServerAssistant;
import fun.nexisdlc.ui.gui.BaseClickGui;
import lombok.experimental.UtilityClass;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen;
import net.minecraft.client.gui.screen.ingame.AnvilScreen;
import net.minecraft.client.gui.screen.ingame.SignEditScreen;
import net.minecraft.client.gui.screen.ingame.StructureBlockScreen;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.ItemCooldownManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.scoreboard.ReadableScoreboardScore;
import net.minecraft.scoreboard.ScoreHolder;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static fun.nexisdlc.client.utils.player.PlayerInventoryUtil.processSwapPhase;

@UtilityClass
public class PlayerUtils implements IMinecraft {
    public final List<KeyBinding> moveKeys = List.of(
            mc.options.forwardKey,
            mc.options.backKey, mc.options.leftKey, mc.options.rightKey,
            mc.options.jumpKey, mc.options.sprintKey);
    public static final Script script = new Script(), postScript = new Script();
    public static boolean canMove = true;
    private static Float nextInteractYaw;
    private static Float nextInteractPitch;

    public void tick() {
        if (!PlayerUtils.canMove && mc.player != null) {
            PlayerUtils.disableMoveKeys();
            boolean keepSneak = mc.options.sneakKey.isPressed();
            mc.player.input.playerInput = new PlayerInput(false, false, false, false, false, keepSneak, false);
        }

        script.update();
        postScript.update();
        processSwapPhase();
    }

    public void interactItem(Hand hand, boolean swing) {
        if (swing) mc.player.swingHand(Hand.MAIN_HAND, false);

        float yaw = nextInteractYaw != null ? nextInteractYaw : RotationTask.visualHeadYaw;
        float pitch = nextInteractPitch != null ? nextInteractPitch : RotationTask.visualHeadPitch;
        nextInteractYaw = null;
        nextInteractPitch = null;

        sendSequencedPacket(i -> new PlayerInteractItemC2SPacket(hand, i, yaw, pitch));
    }

    public static void setNextInteractRotation(float yaw, float pitch) {
        nextInteractYaw = yaw;
        nextInteractPitch = pitch;
    }

    public static boolean isMoving() {
        return mc.player != null && mc.world != null && mc.player.input != null
                && (mc.player.input.getMovementInput().y != 0.0 || mc.player.input.getMovementInput().x != 0.0 || mc.player.fallDistance != 0.0);
    }

    public static boolean isMovingForward() {
        return mc.player != null && mc.world != null && mc.player.input != null
                && mc.player.input.getMovementInput().y > 0.0;
    }

    public static boolean isMovingSideways() {
        return mc.player != null && mc.world != null && mc.player.input != null
                && mc.player.input.getMovementInput().x != 0.0;
    }

    public void addTask(Runnable task) {
        if (script.isFinished() && hasPlayerMovement()) {
            switch (ServerUtil.getServer()) {
                case "FunTime" -> {
                    script.cleanup().addTickStep(0, () -> {
                        PlayerUtils.disableMoveKeys();
                    }).addTickStep(2, () -> {
                        task.run();
                        enableMoveKeys();
                    });
                    return;
                }
                case "ReallyWorld" -> {
                    script.cleanup().addTickStep(0, PlayerUtils::disableMoveKeys)
                            .addTickStep(3, task::run)
                            .addTickStep(4, PlayerUtils::enableMoveKeys);
                    return;
                }
                case "SpookyTime" -> {
                    script.cleanup().addTickStep(0, PlayerUtils::disableMoveKeys)
                            .addTickStep(2, task::run)
                            .addTickStep(3, PlayerUtils::enableMoveKeys);
                    return;
                }
                case "Свой" -> {
                    int extraDelayTicks = ServerAssistant.getDynamicExtraDelayTicks();
                    script.cleanup().addTickStep(0, PlayerUtils::disableMoveKeys)
                            .addTickStep(ServerAssistant.tickToRunAction.get().intValue() + extraDelayTicks, task::run)
                            .addTickStep(ServerAssistant.tickToReturnKeys.get().intValue() + extraDelayTicks, PlayerUtils::enableMoveKeys);
                    return;
                }
                case "HolyWorld" -> {
                    script.cleanup().addTickStep(0, () -> {
                        PlayerUtils.disableMoveKeys();
                    }).addTickStep(1, () -> {
                        task.run();
                    }).addTickStep(2, PlayerUtils::enableMoveKeys);
                }
                case "Без разницы" -> {
                    script.cleanup().addTickStep(0, task::run);
                    return;
                }
            }
        }
        postScript.cleanup().addTickStep(0, () -> {
            task.run();
            PlayerInventoryUtil.closeScreen(true);
        });
    }

    public void disableMoveKeys() {
        canMove = false;
        unPressMoveKeys();

        if (mc.player != null && mc.player.input != null) {
            boolean keepSneak = mc.options.sneakKey.isPressed();
            mc.player.input.playerInput = new PlayerInput(false, false, false, false, false, keepSneak, false);
        }
    }

    public void enableMoveKeys() {
        PlayerInventoryUtil.closeScreen(true);
        canMove = true;
        updateMoveKeys();
    }

    public void resetControlledKeys() {
        canMove = true;
        unPressMoveKeys();
        if (mc.options != null) {
            mc.options.useKey.setPressed(false);
            mc.options.attackKey.setPressed(false);
            mc.options.sneakKey.setPressed(false);
        }
    }

    public void unPressMoveKeys() {
        moveKeys.forEach(keyBinding -> keyBinding.setPressed(false));
    }

    public void updateMoveKeys() {
        if (!canMove || mc.getWindow() == null) return;
        moveKeys.forEach(keyBinding -> keyBinding.setPressed(InputUtil.isKeyPressed(mc.getWindow(), keyBinding.getDefaultKey().getCode())));
    }

    public boolean shouldSkipExecution() {
        return mc.currentScreen != null && !isChatOpen() && !(mc.currentScreen instanceof SignEditScreen) && !(mc.currentScreen instanceof AnvilScreen)
                && !(mc.currentScreen instanceof AbstractCommandBlockScreen) && !(mc.currentScreen instanceof StructureBlockScreen) && !(mc.currentScreen instanceof BaseClickGui);
    }

    public boolean shouldSkipExecutionGuiMove() {
        return mc.currentScreen != null && !isChatOpen() && !(mc.currentScreen instanceof SignEditScreen) && !(mc.currentScreen instanceof AnvilScreen)
                && !(mc.currentScreen instanceof AbstractCommandBlockScreen) && !(mc.currentScreen instanceof StructureBlockScreen) && !(mc.currentScreen instanceof BaseClickGui);
    }

    public static boolean isChatOpen() {
        return mc.currentScreen instanceof ChatScreen;
    }

    public static Entity getMouseOver(Entity target, float yaw, float pitch, double distance) {
        Entity entity = mc.getCameraEntity();
        if (entity == null || mc.world == null || target == null) {
            return null;
        }

        Box playerBox = entity.getBoundingBox();
        Box targetBox = target.getBoundingBox();
        Vec3d startVec = entity.getEyePos();
        Vec3d directionVec = getVectorForRotation(pitch, yaw);
        Vec3d endVec = startVec.add(
                directionVec.x * distance,
                directionVec.y * distance,
                directionVec.z * distance
        );

        if (playerBox.intersects(targetBox)) {
            EntityHitResult hitResult = raytraceEntity(distance, yaw, pitch, (e) -> e == target && !e.isSpectator() && e.canBeHitByProjectile());
            if (hitResult != null && hitResult.getEntity() == target) {
                return target;
            }
        }

        EntityHitResult entityHitResult = rayTraceEntities(
                entity,
                startVec,
                endVec,
                targetBox,
                (e) -> e == target && !e.isSpectator() && e.canBeHitByProjectile(),
                distance
        );

        if (entityHitResult != null && startVec.distanceTo(entityHitResult.getPos()) <= distance) {
            return entityHitResult.getEntity();
        }

        return null;
    }

    public static Entity getMouseOver(Entity target, float yaw, float pitch, double distance, float hitboxScale) {
        Entity entity = mc.getCameraEntity();
        if (entity == null || mc.world == null || target == null) {
            return null;
        }

        Vec3d startVec = entity.getEyePos();
        Vec3d directionVec = Vec3d.fromPolar(pitch, yaw);
        Vec3d endVec = startVec.add(directionVec.multiply(distance));

        Box originalBox = target.getBoundingBox();

        double xShrink = (originalBox.getLengthX() * (1.0F - hitboxScale)) / 2.0D;
        double zShrink = (originalBox.getLengthZ() * (1.0F - hitboxScale)) / 2.0D;

        Box scaledBox = originalBox.expand(-xShrink, 0, -zShrink);

        var hitResult = scaledBox.raycast(startVec, endVec);

        if (hitResult.isPresent()) {
            return target;
        }

        return null;
    }

    static float getEntityHealth(Entity target) {
        if (target == null || mc.world == null || !(target instanceof LivingEntity e)) {
            return mc.player != null ? mc.player.getHealth() : 0;
        }

        if (!Nexis.getFunctionManager().getFixHP().isState()) {
            return ((LivingEntity) target).getHealth();
        }

        if (!(target instanceof PlayerEntity)) {
            return e.getHealth();
        }

        if (target == mc.player) return mc.player.getHealth();
        if (target.isInvisible() && FixHP.mode.is("FunTime")) return 1000.0f;

        Scoreboard scoreboard = mc.world.getScoreboard();

        if (scoreboard != null && (FixHP.mode.is("FunTime") || FixHP.mode.is("ReallyWorld"))) {
            ScoreHolder scoreHolder = ScoreHolder.fromName(target.getName().getString());
            for (ScoreboardObjective objective : scoreboard.getObjectives()) {
                ReadableScoreboardScore score = scoreboard.getScore(scoreHolder, objective);
                if (score != null) {
                    return score.getScore();
                }
            }
        } else {
            return e.getHealth();
        }

        return 1000;
    }

    public static float getHealthFloat(LivingEntity target) {
        float health = getEntityHealth(target);
        if (!(target instanceof PlayerEntity)) {
            return health;
        }

        if (!Nexis.getFunctionManager().getFixHP().isState()) return target.getHealth();

        return health == 1000 ? 20 : health;
    }

    public static String getHealthString(LivingEntity target) {
        float health = getEntityHealth(target);
        if (!(target instanceof PlayerEntity)) {
            return Math.round(health) + "";
        }

        return health == 1000 ? "?" : Math.round(health) + "";
    }

    public static boolean isNoPushEnabled() {
        if (mc.player == null) {
            return false;
        }
        var function = Nexis.getFunctionManager().getPlayerUtilsFunction();
        return function != null && function.isState() && PlayerUtilsFunction.NoPush.get();
    }

    public static boolean shouldCancelEntityPush() {
        return isNoPushEnabled() && noPushModeEnabled(PlayerUtilsFunction.NOPUSH_ENTITIES);
    }

    public static boolean shouldCancelBlockPush() {
        return isNoPushEnabled() && noPushModeEnabled(PlayerUtilsFunction.NOPUSH_BLOCKS);
    }

    public static boolean noPushModeEnabled(String modeName) {
        if (modeName == null || modeName.isEmpty()) {
            return false;
        }
        if (PlayerUtilsFunction.noPushModes == null) {
            return false;
        }
        var mode = PlayerUtilsFunction.noPushModes.getByName(modeName);
        return mode != null && mode.get();
    }

    public static boolean shouldCancelFishingRodPull(EntityVelocityUpdateS2CPacket packet) {
        if (packet == null || mc.player == null || mc.world == null) {
            return false;
        }
        if (packet.getEntityId() != mc.player.getId()) {
            return false;
        }

        for (Entity entity : mc.world.getEntities()) {
            if (!(entity instanceof FishingBobberEntity bobber)) {
                continue;
            }
            Entity owner = bobber.getOwner();
            if (!(owner instanceof PlayerEntity) || owner == mc.player) {
                continue;
            }
            if (bobber.squaredDistanceTo(mc.player) <= 4.0D) {
                return true;
            }
        }
        return false;
    }

    private static Vec3d getVectorForRotation(float pitch, float yaw) {
        float yawRad = (float) Math.toRadians(yaw);
        float pitchRad = (float) Math.toRadians(pitch);
        float cosPitch = (float) Math.cos(-pitchRad);
        return new Vec3d(
                -Math.sin(yawRad) * cosPitch,
                -Math.sin(pitchRad),
                Math.cos(yawRad) * cosPitch
        );
    }

    private static EntityHitResult rayTraceEntities(Entity source, Vec3d start, Vec3d end, Box boundingBox, Predicate<Entity> predicate, double maxDistance) {
        World world = mc.world;
        double closestDistance = maxDistance;
        Entity closestEntity = null;
        Vec3d closestHitPos = null;

        for (Entity entity : world.getEntitiesByClass(Entity.class, boundingBox, predicate)) {
            if (entity == source) continue;

            Box entityBox = entity.getBoundingBox();
            var hit = entityBox.raycast(start, end);

            if (hit.isPresent()) {
                Vec3d hitPos = hit.get();
                double distance = start.distanceTo(hitPos);

                if (distance < closestDistance) {
                    closestEntity = entity;
                    closestHitPos = hitPos;
                    closestDistance = distance;
                }
            }
        }

        if (closestEntity != null) {
            return new EntityHitResult(closestEntity, closestHitPos);
        }
        return null;
    }

    public static BlockHitResult raycast(double range, float yaw, float pitch, boolean includeFluids) {
        Entity entity = mc.getCameraEntity();
        if (entity == null || mc.world == null) {
            return null;
        }

        Vec3d start = entity.getCameraPosVec(1.0F);
        float pitchRad = pitch * 0.017453292F;
        float yawRad = -yaw * 0.017453292F;
        float cosPitch = (float) Math.cos(pitchRad);
        float sinPitch = (float) Math.sin(pitchRad);
        float cosYaw = (float) Math.cos(yawRad);
        float sinYaw = (float) Math.sin(yawRad);
        Vec3d rotationVec = new Vec3d(sinYaw * cosPitch, -sinPitch, cosYaw * cosPitch);
        Vec3d end = start.add(rotationVec.x * range, rotationVec.y * range, rotationVec.z * range);

        World world = mc.world;
        RaycastContext.FluidHandling fluidHandling = includeFluids ? RaycastContext.FluidHandling.ANY : RaycastContext.FluidHandling.NONE;
        RaycastContext context = new RaycastContext(start, end, RaycastContext.ShapeType.OUTLINE, fluidHandling, entity);

        return world.raycast(context);
    }

    public static EntityHitResult raytraceEntity(double range, float yaw, float pitch, Predicate<Entity> filter) {
        Entity entity = mc.getCameraEntity();
        if (entity == null || mc.world == null) {
            return null;
        }

        Vec3d cameraVec = entity.getCameraPosVec(1.0F);
        float pitchRad = pitch * 0.017453292F;
        float yawRad = -yaw * 0.017453292F;
        float cosPitch = (float) Math.cos(pitchRad);
        float sinPitch = (float) Math.sin(pitchRad);
        float cosYaw = (float) Math.cos(yawRad);
        float sinYaw = (float) Math.sin(yawRad);
        Vec3d rotationVec = new Vec3d(sinYaw * cosPitch, -sinPitch, cosYaw * cosPitch);
        Vec3d end = cameraVec.add(rotationVec.x * range, rotationVec.y * range, rotationVec.z * range);
        Box box = entity.getBoundingBox().stretch(rotationVec.multiply(range)).expand(1.0, 1.0, 1.0);

        return ProjectileUtil.raycast(
                entity,
                cameraVec,
                end,
                box,
                filter,
                range * range
        );
    }

    public static Entity getRayTraceResult(Vec3d targetPos, Entity entity, double maxDistance, RotateVector rotateVector) {
        Entity cameraEntity = mc.getCameraEntity();
        if (mc.world == null || cameraEntity == null || entity == null || entity.isSpectator() || !entity.canHit()) {
            return null;
        }

        Vec3d eyePos = cameraEntity.getEyePos();
        float yaw = rotateVector.getYaw();
        float pitch = rotateVector.getPitch();

        Vec3d direction = getVectorForRotation(pitch, yaw);
        Vec3d endPos = eyePos.add(direction.x * maxDistance, direction.y * maxDistance, direction.z * maxDistance);

        Box originalBox = entity.getBoundingBox();
        Vec3d originalEyePos = entity.getEyePos();
        Vec3d offset = targetPos.subtract(originalEyePos);
        Box predictedBox = originalBox.offset(offset);

        if (originalBox.intersects(predictedBox)) {
            EntityHitResult hitResult = raytraceEntity(maxDistance, yaw, pitch, e -> e == entity && !e.isSpectator() && e.canHit());
            if (hitResult != null && hitResult.getEntity() == entity) {
                return entity;
            }
        }

        return predictedBox.raycast(eyePos, endPos).isPresent() ? entity : null;
    }

    public static double[] forward(final double d) {
        float f = mc.player.input.getMovementInput().y;
        float f2 = mc.player.input.getMovementInput().x;
        float f3 = getGlobalYaw();
        if (f != 0.0f) {
            if (f2 > 0.0f) {
                f3 += ((f > 0.0f) ? -45 : 45);
            } else if (f2 < 0.0f) {
                f3 += ((f > 0.0f) ? 45 : -45);
            }
            f2 = 0.0f;
            if (f > 0.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = -1.0f;
            }
        }
        final double d2 = Math.sin(Math.toRadians(f3 + 90.0f));
        final double d3 = Math.cos(Math.toRadians(f3 + 90.0f));
        final double d4 = f * d * d3 + f2 * d * d2;
        final double d5 = f * d * d2 - f2 * d * d3;
        return new double[]{d4, d5};
    }

    public void sendSequencedPacket(SequencedPacketCreator packetCreator) {
        mc.interactionManager.sendSequencedPacket(mc.world, packetCreator);
    }

    public void sendPacketWithOutEvent(Packet<?> packet) {
        mc.getNetworkHandler().getConnection().send(packet, null);
    }

    public static void jump(float yaw) {
        if (mc.player.isSprinting()) {
            float g = yaw * ((float) Math.PI / 180F);
            mc.player.addVelocityInternal(new Vec3d(-MathHelper.sin(g) * 0.2F, 0.0F, MathHelper.cos(g) * 0.2F));
        }
        mc.player.velocityDirty = true;
    }

    public Stream<Entity> streamEntities() {
        return StreamSupport.stream(mc.world.getEntities().spliterator(), false);
    }

    public boolean isBox(Box box, Predicate<BlockPos> pos) {
        return BlockPos.stream(box).anyMatch(pos);
    }

    public boolean hasPlayerMovement() {
        return mc.player != null && mc.player.input != null
                && (mc.player.input.getMovementInput().y != 0f
                || mc.player.input.getMovementInput().x != 0f
                || mc.options.jumpKey.isPressed());
    }

    public double[] calculateDirection(double distance) {
        return calculateDirection(mc.player.input.getMovementInput().y, mc.player.input.getMovementInput().x, distance);
    }

    public double[] calculateDirection(float forward, float sideways, double distance) {
        float yaw = mc.player.getYaw();
        if (forward != 0.0f) {
            if (sideways > 0.0f) {
                yaw += (forward > 0.0f) ? -45 : 45;
            } else if (sideways < 0.0f) {
                yaw += (forward > 0.0f) ? 45 : -45;
            }
            sideways = 0.0f;
            forward = (forward > 0.0f) ? 1.0f : -1.0f;
        }

        double sinYaw = Math.sin(Math.toRadians(yaw + 90.0f));
        double cosYaw = Math.cos(Math.toRadians(yaw + 90.0f));
        double xMovement = forward * distance * cosYaw + sideways * distance * sinYaw;
        double zMovement = forward * distance * sinYaw - sideways * distance * cosYaw;

        return new double[]{xMovement, zMovement};
    }

    public void setVelocity(double velocity) {
        final double[] direction = calculateDirection(velocity);
        Objects.requireNonNull(mc.player).setVelocity(direction[0], mc.player.getVelocity().getY(), direction[1]);
    }

    public void setVelocity(double velocity, double y) {
        final double[] direction = calculateDirection(velocity);
        Objects.requireNonNull(mc.player).setVelocity(direction[0], y, direction[1]);
    }

    public PlayerInput getDirectionalInputForDegrees(PlayerInput input, double dgs, float deadAngle) {
        boolean forwards = input.forward();
        boolean backwards = input.backward();
        boolean left = input.left();
        boolean right = input.right();

        if (dgs >= (-90.0F + deadAngle) && dgs <= (90.0F - deadAngle)) {
            forwards = true;
        } else if (dgs < (-90.0F - deadAngle) || dgs > (90.0F + deadAngle)) {
            backwards = true;
        }

        if (dgs >= (0.0F + deadAngle) && dgs <= (180.0F - deadAngle)) {
            right = true;
        } else if (dgs >= (-180.0F + deadAngle) && dgs <= (0.0F - deadAngle)) {
            left = true;
        }

        return new PlayerInput(forwards, backwards, left, right, input.jump(), input.sneak(), input.sprint());
    }

    public static Vec3d toVector(float yaw, float pitch) {
        float f = pitch * 0.017453292F;
        float g = -yaw * 0.017453292F;
        float h = MathHelper.cos(g);
        float i = MathHelper.sin(g);
        float j = MathHelper.cos(f);
        float k = MathHelper.sin(f);
        return new Vec3d(i * j, -k, h * j);
    }

    public float getGlobalYaw() {
        return RotationTask.visualHeadYaw;
    }

    public float getGlobalPitch() {
        return RotationTask.visualHeadPitch;
    }

    static final Pattern NAME_REGEX = Pattern.compile("^[A-zА-я0-9_]{3,16}$");

    public static boolean isNameValid(String name) {
        return NAME_REGEX.matcher(name).matches();
    }

    public static boolean isBlockUnder(float under) {
        if (mc.player.getY() < 0.0) {
            return false;
        } else {
            Iterator<VoxelShape> collisions = mc.world.getBlockCollisions(mc.player, mc.player.getBoundingBox().offset(0.0, -under, 0.0)).iterator();
            return !collisions.hasNext();
        }
    }

    public void updateKeyBindingsState(KeyBinding[] keyBindings) {
        if (keyBindings == null) return;
        for (KeyBinding keyBinding : keyBindings) {
            boolean isKeyPressed = InputUtil.isKeyPressed(mc.getWindow(), keyBinding.boundKey.getCode());
            keyBinding.setPressed(isKeyPressed);
        }
    }

    public void updateKeyBindingState(KeyBinding keyBinding) {
        if (keyBinding == null) return;

        boolean isKeyPressed = InputUtil.isKeyPressed(mc.getWindow(), keyBinding.boundKey.getCode());
        keyBinding.setPressed(isKeyPressed);
    }

    public static Text normalizeName(Text input) {
        if (input == null || input.getString().isEmpty()) return input;

        StringBuilder sb = new StringBuilder();
        for (char c : input.getString().toCharArray()) {
            char normalized = normalizeChar(c);
            if (normalized != 0) {
                sb.append(normalized);
            }
        }
        return Text.of(sb.toString());
    }

    public static String normalizeName(String input) {
        if (input == null || input.isEmpty()) return input;

        String cleanedInput = input.replaceAll("(?i)§[lmnok]", "");

        StringBuilder sb = new StringBuilder();
        for (char c : cleanedInput.toCharArray()) {
            char normalized = normalizeChar(c);
            if (normalized != 0) {
                sb.append(normalized);
            }
        }
        return sb.toString();
    }

    public static char normalizeChar(char c) {
        return switch (c) {
            case 'ᴀ' -> 'a';
            case 'ʙ' -> 'b';
            case 'ᴄ' -> 'c';
            case 'ᴅ' -> 'd';
            case 'ᴇ' -> 'e';
            case 'ꜰ', 'ғ' -> 'f';
            case 'ɢ' -> 'g';
            case 'ʜ' -> 'h';
            case 'ɪ', 'ⅰ' -> 'i';
            case 'ᴊ' -> 'j';
            case 'ᴋ' -> 'k';
            case 'ʟ' -> 'l';
            case 'ᴍ' -> 'm';
            case 'ɴ' -> 'n';
            case 'ᴏ' -> 'o';
            case 'ᴘ' -> 'p';
            case 'ʀ' -> 'r';
            case 'ꜱ' -> 's';
            case 'ᴛ' -> 't';
            case 'ᴜ' -> 'u';
            case 'ᴠ' -> 'v';
            case 'ᴡ' -> 'w';
            case 'ʏ' -> 'y';
            case 'ᴢ' -> 'z';

            case 'Ａ' -> 'A';
            case 'Ｂ' -> 'B';
            case 'Ｃ' -> 'C';
            case 'Ｄ' -> 'D';
            case 'Ｅ' -> 'E';
            case 'Ｆ' -> 'F';
            case 'Ｇ' -> 'G';
            case 'Ｈ' -> 'H';
            case 'Ｉ' -> 'I';
            case 'Ｊ' -> 'J';
            case 'Ｋ' -> 'K';
            case 'Ｌ' -> 'L';
            case 'Ｍ' -> 'M';
            case 'Ｎ' -> 'N';
            case 'Ｏ' -> 'O';
            case 'Ｐ' -> 'P';
            case 'Ｑ' -> 'Q';
            case 'Ｒ' -> 'R';
            case 'Ｓ' -> 'S';
            case 'Ｔ' -> 'T';
            case 'Ｕ' -> 'U';
            case 'Ｖ' -> 'V';
            case 'Ｗ' -> 'W';
            case 'Ｘ' -> 'X';
            case 'Ｙ' -> 'Y';
            case 'Ｚ' -> 'Z';

            case 'А' -> 'А';
            case 'Б' -> 'Б';
            case 'В' -> 'В';
            case 'Г' -> 'Г';
            case 'Д' -> 'Д';
            case 'Е' -> 'Е';
            case 'Ё' -> 'Ё';
            case 'Ж' -> 'Ж';
            case 'З' -> 'З';
            case 'И' -> 'И';
            case 'Й' -> 'Й';
            case 'К' -> 'К';
            case 'Л' -> 'Л';
            case 'М' -> 'М';
            case 'Н' -> 'Н';
            case 'О' -> 'О';
            case 'П' -> 'П';
            case 'Р' -> 'Р';
            case 'С' -> 'С';
            case 'Т' -> 'Т';
            case 'У' -> 'У';
            case 'Ф' -> 'Ф';
            case 'Х' -> 'Х';
            case 'Ц' -> 'Ц';
            case 'Ч' -> 'Ч';
            case 'Ш' -> 'Ш';
            case 'Щ' -> 'Щ';
            case 'Ъ' -> 'Ъ';
            case 'Ы' -> 'Ы';
            case 'Ь' -> 'Ь';
            case 'Э' -> 'Э';
            case 'Ю' -> 'Ю';
            case 'Я' -> 'Я';

            case 'а' -> 'а';
            case 'б' -> 'б';
            case 'в' -> 'в';
            case 'г' -> 'г';
            case 'д' -> 'д';
            case 'е' -> 'е';
            case 'ё' -> 'ё';
            case 'ж' -> 'ж';
            case 'з' -> 'з';
            case 'и' -> 'и';
            case 'й' -> 'й';
            case 'к' -> 'к';
            case 'л' -> 'л';
            case 'м' -> 'м';
            case 'н' -> 'н';
            case 'о' -> 'о';
            case 'п' -> 'п';
            case 'р' -> 'р';
            case 'с' -> 'с';
            case 'т' -> 'т';
            case 'у' -> 'у';
            case 'ф' -> 'ф';
            case 'х' -> 'х';
            case 'ц' -> 'ц';
            case 'ч' -> 'ч';
            case 'ш' -> 'ш';
            case 'щ' -> 'щ';
            case 'ъ' -> 'ъ';
            case 'ы' -> 'ы';
            case 'ь' -> 'ь';
            case 'э' -> 'э';
            case 'ю' -> 'ю';
            case 'я' -> 'я';

            case '✟', '✞', '☠', '☯', '⚡', '☣', '✿', '❤', '❥', '♡',
                 '⚔', '☮', '✪', '★', '☆', '✯', '✦', '❀', '◈', '◉',
                 '➤', '➢', '➣', '➧', '➨', '➛', '➜', '➝', '➞', '➟',
                 '✵', '✰', '✧', '❄', '☀', '☾', '☽', '♔', '♕', '♚', '♛',
                 '♜', '♖', '♝', '♗', '♞', '♘', '♟', '⚘', '✔', '✖',
                 '†', '‡', '¶', '©', '®', '™', '∞', '♪', '♫', '♬',
                 '☭', '☢', '✘', '☑', '☒', '☐', '☼', '☻' -> (char) 0;

            case '§', ' ', '.', ',', ':', '-', '+', '/', '\\', '&', '|', '*',
                 '_', '[', ']', '(', ')', '#',
                 '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                 'u', 'v', 'w', 'x', 'y', 'z',
                 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                 'U', 'V', 'W', 'X', 'Y', 'Z' -> c;

            default -> (char) 0;
        };
    }

    public static final int MOUSE_WHEEL_UP = 10001;
    public static final int MOUSE_WHEEL_DOWN = 10002;

    public String getBindName(int keyCode) {
        if (keyCode <= 0) {
            return "NONE";
        }
        if (keyCode == MOUSE_WHEEL_UP) {
            return "WHEEL UP";
        }
        if (keyCode == MOUSE_WHEEL_DOWN) {
            return "WHEEL DOWN";
        }
        if (isMouseButtonCode(keyCode)) {
            return switch (toGlfwMouseButton(keyCode)) {
                case org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_RIGHT -> "RMB";
                case org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_MIDDLE -> "MMB";
                case org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_4 -> "M4";
                case org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_5 -> "M5";
                case org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_6 -> "M6";
                case org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_7 -> "M7";
                case org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_8 -> "M8";
                default -> "M" + (toGlfwMouseButton(keyCode) + 1);
            };
        }
        if (keyCode >= org.lwjgl.glfw.GLFW.GLFW_KEY_A && keyCode <= org.lwjgl.glfw.GLFW.GLFW_KEY_Z) {
            return String.valueOf((char) ('A' + (keyCode - org.lwjgl.glfw.GLFW.GLFW_KEY_A)));
        }
        if (keyCode >= org.lwjgl.glfw.GLFW.GLFW_KEY_0 && keyCode <= org.lwjgl.glfw.GLFW.GLFW_KEY_9) {
            return String.valueOf((char) ('0' + (keyCode - org.lwjgl.glfw.GLFW.GLFW_KEY_0)));
        }
        String name = org.lwjgl.glfw.GLFW.glfwGetKeyName(keyCode, 0);
        if (name != null && !name.isBlank()) {
            return switch (keyCode) {
                case org.lwjgl.glfw.GLFW.GLFW_KEY_APOSTROPHE -> "'";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_COMMA -> ",";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_MINUS -> "-";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_PERIOD -> ".";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_SLASH -> "/";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_SEMICOLON -> ";";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_EQUAL -> "=";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_BRACKET -> "[";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_BRACKET -> "]";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_BACKSLASH -> "\\";
                case org.lwjgl.glfw.GLFW.GLFW_KEY_GRAVE_ACCENT -> "`";
                default -> name.toUpperCase(java.util.Locale.ENGLISH);
            };
        }
        return switch (keyCode) {
            case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SHIFT -> "RSHIFT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_SHIFT -> "LSHIFT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_CONTROL -> "LCTRL";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_CONTROL -> "RCTRL";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_ALT -> "LALT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_ALT -> "RALT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT_SUPER -> "LSUPER";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT_SUPER -> "RSUPER";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_ESCAPE -> "ESC";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_SPACE -> "SPC";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_ENTER -> "ENTER";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_TAB -> "TAB";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_BACKSPACE -> "BS";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_INSERT -> "INS";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_DELETE -> "DEL";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_HOME -> "HOME";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_END -> "END";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_PAGE_UP -> "PGUP";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_PAGE_DOWN -> "PGDN";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_UP -> "UP";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_DOWN -> "DOWN";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_LEFT -> "LEFT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_RIGHT -> "RIGHT";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_CAPS_LOCK -> "CAPS";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_SCROLL_LOCK -> "SCRLK";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_NUM_LOCK -> "NUMLK";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_PRINT_SCREEN -> "PRTSC";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_PAUSE -> "PAUSE";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_MENU -> "MENU";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_0 -> "KP_0";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_1 -> "KP_1";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_2 -> "KP_2";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_3 -> "KP_3";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_4 -> "KP_4";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_5 -> "KP_5";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_6 -> "KP_6";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_7 -> "KP_7";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_8 -> "KP_8";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_9 -> "KP_9";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_DECIMAL -> "KP_DEC";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_DIVIDE -> "KP_DIV";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_MULTIPLY -> "KP_MUL";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_SUBTRACT -> "KP_SUB";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_ADD -> "KP_ADD";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_ENTER -> "KP_ENTER";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_KP_EQUAL -> "KP_EQ";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F1 -> "F1";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F2 -> "F2";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F3 -> "F3";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F4 -> "F4";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F5 -> "F5";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F6 -> "F6";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F7 -> "F7";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F8 -> "F8";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F9 -> "F9";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F10 -> "F10";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F11 -> "F11";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F12 -> "F12";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F13 -> "F13";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F14 -> "F14";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F15 -> "F15";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F16 -> "F16";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F17 -> "F17";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F18 -> "F18";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F19 -> "F19";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F20 -> "F20";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F21 -> "F21";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F22 -> "F22";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F23 -> "F23";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F24 -> "F24";
            case org.lwjgl.glfw.GLFW.GLFW_KEY_F25 -> "F25";
            default -> "K" + keyCode;
        };
    }

    public boolean isMouseButtonCode(int keyCode) {
        int button = toGlfwMouseButton(keyCode);
        return button > org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_LEFT && button <= org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_LAST;
    }

    public int toGlfwMouseButton(int keyCode) {
        return keyCode >= 1000 && keyCode < 1000 + org.lwjgl.glfw.GLFW.GLFW_MOUSE_BUTTON_LAST + 1 ? keyCode - 1000 : keyCode;
    }

    public double getSpeedSqrt(Entity entity) {
        return Math.sqrt(entity.squaredDistanceTo(new Vec3d(entity.lastX, entity.lastY, entity.lastZ)));
    }

    public double getBPS() {
        if (mc.player == null) return 0;
        return MathUtil.round(getSpeedSqrt(mc.player) * 20.0F, 0.1F);
    }

    public float getCooldownProgress(Item item) {
        if (mc.player == null) {
            return 0f;
        }

        ItemCooldownManager cooldownManager = mc.player.getItemCooldownManager();
        ItemStack stack = item.getDefaultStack();
        var group = cooldownManager.getGroup(stack);
        ItemCooldownManager.Entry entry = cooldownManager.entries.get(group);
        if (entry == null) return 0;
        return Math.max(0, (entry.endTick - cooldownManager.tick) / 20F);
    }

    public Vec3d getPos(Entity entity) {
        return new Vec3d(entity.getX(), entity.getY(), entity.getZ());
    }

    public Vec3d getPlayerPos() {
        if (mc.player == null) return new Vec3d(0, 0, 0);
        return new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ());
    }
}
