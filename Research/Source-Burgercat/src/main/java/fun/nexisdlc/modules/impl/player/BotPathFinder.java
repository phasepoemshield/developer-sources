package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.player.MoveInputEvent;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import net.minecraft.block.*;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import java.util.*;

public class BotPathFinder implements IMinecraft {

    public enum MoveType {
        WALK(1.0),
        STEP_UP(1.5),
        STEP_DOWN(0.9);

        public final double cost;
        MoveType(double cost) { this.cost = cost; }
    }

    public static class Move {
        public final BlockPos from;
        public final BlockPos to;
        public final MoveType type;
        public final double cost;
        public final boolean diagonal;

        Move(BlockPos from, BlockPos to, MoveType type, double cost, boolean diagonal) {
            this.from = from;
            this.to = to;
            this.type = type;
            this.cost = cost;
            this.diagonal = diagonal;
        }
    }

    private static class Node {
        final BlockPos pos;
        final Move move;
        final Node parent;
        final double g, f;
        Node(BlockPos pos, Move move, Node parent, double g, double f) {
            this.pos = pos;
            this.move = move;
            this.parent = parent;
            this.g = g;
            this.f = f;
        }
    }

    // ── State ──
    private BlockPos goal;
    private Vec3d goalPos;
    private final Random random = new Random();
    private float aimYaw;
    private float aimPitch;
    private float yawOffset;
    private boolean stopBeforeAttack;
    private boolean rotationInitialized;
    private boolean jumpPressed;
    private long nextJumpMs;
    private double lastDistanceSq;
    private long lastProgressMs;
    private boolean rerouteStrafeLeft;
    private boolean rerouting;
    private long rerouteUntilMs;
    private double stopDistanceSq = 2.25;
    private long blockedStartMs;
    private boolean jumpDisabledByMining;

    private List<Move> path;
    private int pathIndex;
    private BlockPos pathGoal;
    private long lastPathfindMs;
    private long moveStartMs;
    private boolean jumpHeld;
    private long jumpHeldSinceMs;
    private boolean overrideAttack;
    private boolean overrideAttackState;
    private Vec3d exactLookTarget;
    private long exactLookTargetUntilMs;

    private static final long PATH_REBUILD_INTERVAL = 1000L;
    private static final long STUCK_TIMEOUT = 600L;
    private static final long REROUTE_DURATION = 500L;
    private static final long BLOCKED_THRESHOLD = 100L;
    private static final long JUMP_COOLDOWN = 600L;
    private static final long LIQUID_JUMP_COOLDOWN = 200L;
    private static final long PATH_VALIDITY_CHECK = 200L;
    private static final int MAX_NODES = 4096;
    private static final int MAX_PATH_DIST = 48;
    private static final int DEEP_DROP_BLOCKS = 3;
    private static final double WAYPOINT_REACH_SQ = 0.36;
    private static final double STUCK_PROGRESS_EPSILON = 0.05;
    private static final double DIAGONAL_COST = 1.414;
    private static final double SIDE_CHECK_RANGE = 0.6;
    private static final double REROUTE_YAW_OFFSET = 8f;
    private static final double SMOOTH_SPEED = 0.75f;
    private static final int ALPHA_PATH_AFTER = 50;
    private static final int ALPHA_PATH_CURRENT = 200;
    private static final int ALPHA_PATH_GOAL = 100;

    private final PriorityQueue<Node> cachedOpen = new PriorityQueue<>(Comparator.comparingDouble(n -> n.f));
    private final Set<Long> cachedClosed = new HashSet<>();
    private final Map<Long, Double> cachedBestG = new HashMap<>();

    public void setStopDistanceSq(double d) {
        this.stopDistanceSq = d;
    }

    public void setOverrideAttack(boolean state) {
        this.overrideAttack = state;
        if (!state) this.overrideAttackState = false;
    }

    public void setExactLookTarget(Vec3d target, long durationMs) {
        this.exactLookTarget = target;
        this.exactLookTargetUntilMs = target != null ? System.currentTimeMillis() + durationMs : 0L;
    }

    public void clearExactLookTarget() {
        this.exactLookTarget = null;
        this.exactLookTargetUntilMs = 0L;
    }

    public void tick(BlockPos target, boolean canMine) {
        tick(target, canMine, true);
    }

    public void tick(BlockPos target, boolean canMine, boolean attackEnabled) {
        tick(target != null ? target.toCenterPos() : null, target, canMine, attackEnabled);
    }

    public void tick(Vec3d targetPos, boolean canMine, boolean attackEnabled) {
        tick(targetPos, targetPos != null ? BlockPos.ofFloored(targetPos) : null, canMine, attackEnabled);
    }

    private void tick(Vec3d targetPos, BlockPos targetBlock, boolean canMine, boolean attackEnabled) {
        if (mc.player == null || mc.world == null || targetPos == null) {
            reset();
            return;
        }

        boolean targetChanged = !Objects.equals(this.goalPos, targetPos);
        this.goal = targetBlock;
        this.goalPos = targetPos;

        if (targetChanged) {
            path = null;
            pathIndex = 0;
            pathGoal = null;
            yawOffset = 0f;
            rerouteUntilMs = 0L;
        }

        if (!rotationInitialized) {
            aimYaw = mc.player.getYaw();
            aimPitch = mc.player.getPitch();
            rotationInitialized = true;
        }

        long now = System.currentTimeMillis();
        jumpDisabledByMining = canMine && attackEnabled;
        maybeRebuildPath(now);

        stopBeforeAttack = isStopDistanceReached(goalPos);

        Move current = getCurrentMove();

        if (current != null) {
            if (pathIndex < path.size() - 1 && isWaypointReached(current)) {
                advancePath(now);
                current = getCurrentMove();
            }
        }

        Vec3d lookTarget = goalPos;
        if (current != null && !stopBeforeAttack) {
            lookTarget = current.to.toCenterPos();
        }

        if (exactLookTarget != null && exactLookTargetUntilMs > now) {
            lookTarget = exactLookTarget;
        }

        float targetYaw = getYawToTarget(lookTarget) + yawOffset;
        float targetPitch = getPitchToTarget(lookTarget) + pitchOffset();
        aimYaw = smoothAngle(aimYaw, targetYaw, (float)SMOOTH_SPEED);
        aimPitch = smoothAngle(aimPitch, targetPitch, (float)SMOOTH_SPEED);
        RotationTask.setTargetRotation(aimYaw, aimPitch, 3);

        if (mc.options == null) return;
        double distSq = mc.player.squaredDistanceTo(goalPos);

        if (current != null) {
            executeMove(current, now);
        } else {
            updateMovementFallback(distSq, now);
        }

        updateStuckState(distSq, now);
        updateAttackKey(attackEnabled, now);
    }

    private void advancePath(long now) {
        pathIndex++;
        moveStartMs = now;
        jumpHeld = false;
        jumpHeldSinceMs = 0L;
        nextJumpMs = now + 100L;
        jumpPressed = false;
    }

    private Move getCurrentMove() {
        if (path == null || pathIndex >= path.size()) return null;
        return path.get(pathIndex);
    }

    private void executeMove(Move move, long now) {
        if (moveStartMs == 0L) moveStartMs = now;

        boolean needJump = pathHasStepUp();
        boolean deepDrop = mc.player.isOnGround() && isDeepDropAhead() && !jumpDisabledByMining;

        if (deepDrop || (jumpDisabledByMining && !needJump)) {
            jumpPressed = false;
            jumpHeld = false;
        } else if (needJump) {
            if (!jumpHeld && mc.player.isOnGround() && now >= nextJumpMs) {
                jumpHeld = true;
                jumpHeldSinceMs = now;
                jumpPressed = true;
                nextJumpMs = now + JUMP_COOLDOWN;
            } else if (jumpHeld) {
                if (now - jumpHeldSinceMs > 200L) {
                    jumpHeld = false;
                    jumpPressed = false;
                } else {
                    jumpPressed = true;
                }
            } else {
                jumpPressed = false;
            }
        } else {
            jumpPressed = false;
            jumpHeld = false;
        }

        BlockState feet = mc.world.getBlockState(mc.player.getBlockPos());
        if (!jumpDisabledByMining && isLiquid(feet) && mc.player.isOnGround() && now >= nextJumpMs) {
            jumpPressed = true;
            nextJumpMs = now + LIQUID_JUMP_COOLDOWN;
        }

        mc.options.forwardKey.setPressed(!deepDrop);
        mc.options.sprintKey.setPressed(true);
        mc.options.jumpKey.setPressed(jumpPressed);
        mc.options.leftKey.setPressed(false);
        mc.options.rightKey.setPressed(false);
    }

    private boolean isWaypointReached(Move move) {
        if (mc.player == null) return true;
        double dx = mc.player.getX() - (move.to.getX() + 0.5);
        double dz = mc.player.getZ() - (move.to.getZ() + 0.5);
        return dx * dx + dz * dz <= WAYPOINT_REACH_SQ;
    }

    private boolean pathHasStepUp() {
        if (path == null) return false;
        for (int i = Math.max(0, pathIndex - 1); i < path.size(); i++) {
            if (path.get(i).type == MoveType.STEP_UP) return true;
        }
        return false;
    }

    private void updateMovementFallback(double distSq, long now) {
        rerouting = rerouteUntilMs > now;

        if (!rerouting && !stopBeforeAttack && mc.player.isOnGround() && isBlockedAhead()) {
            if (blockedStartMs == 0L) blockedStartMs = now;
            if (now - blockedStartMs > BLOCKED_THRESHOLD) {
                rerouteUntilMs = now + REROUTE_DURATION;
                rerouteStrafeLeft = chooseRerouteSide();
                yawOffset = (random.nextFloat() * (float)REROUTE_YAW_OFFSET * 2f) - (float)REROUTE_YAW_OFFSET;
                nextJumpMs = now;
                jumpPressed = false;
                rotationInitialized = false;
                lastProgressMs = now;
                lastDistanceSq = distSq;
                rerouting = true;
                blockedStartMs = 0L;
            }
            if (!jumpDisabledByMining) {
                BlockPos aheadFeet = BlockPos.ofFloored(
                    mc.player.getX() - MathHelper.sin(aimYaw * MathHelper.RADIANS_PER_DEGREE),
                    mc.player.getY(),
                    mc.player.getZ() + MathHelper.cos(aimYaw * MathHelper.RADIANS_PER_DEGREE)
                );
                if (mc.world.getBlockState(aheadFeet).isAir()) {
                    jumpPressed = true;
                    nextJumpMs = now + JUMP_COOLDOWN;
                }
            }
        } else {
            blockedStartMs = 0L;
        }

        mc.options.forwardKey.setPressed(!stopBeforeAttack && !rerouting);
        mc.options.sprintKey.setPressed(false);
        mc.options.jumpKey.setPressed(jumpPressed);

        if (rerouting) {
            jumpPressed = false;
            mc.options.leftKey.setPressed(rerouteStrafeLeft);
            mc.options.rightKey.setPressed(!rerouteStrafeLeft);
            return;
        }
        mc.options.leftKey.setPressed(false);
        mc.options.rightKey.setPressed(false);
    }

    public void onMoveInput(MoveInputEvent event) {
        if (mc.player == null || goalPos == null) return;
        event.setYaw(aimYaw);
        event.setNeedFix(true);
        event.setOverrideForwardBackward(true);
        event.setForwardPressed(!stopBeforeAttack);
        event.setBackwardPressed(false);
        event.setOverrideLeftRight(true);
        boolean activeReroute = rerouteUntilMs > System.currentTimeMillis();
        if (activeReroute) {
            event.setLeft(rerouteStrafeLeft);
            event.setRight(!rerouteStrafeLeft);
        } else {
            event.setLeft(false);
            event.setRight(false);
        }
        event.setOverrideJump(true);
        event.setJumpPressed(jumpPressed);
    }

    public void reset() { reset(true); }
    public void softReset() { reset(false); }

    private void reset(boolean resetRotation) {
        goal = null;
        goalPos = null;
        path = null;
        pathIndex = 0;
        pathGoal = null;
        yawOffset = 0f;
        nextJumpMs = 0L;
        lastDistanceSq = Double.MAX_VALUE;
        lastProgressMs = 0L;
        rerouteUntilMs = 0L;
        rerouteStrafeLeft = false;
        jumpDisabledByMining = false;
        rotationInitialized = false;
        stopBeforeAttack = false;
        jumpPressed = false;
        moveStartMs = 0L;
        jumpHeld = false;
        jumpHeldSinceMs = 0L;
        overrideAttack = false;
        overrideAttackState = false;
        setAttackState(false);

        if (mc.options != null) {
            mc.options.forwardKey.setPressed(false);
            if (mc.player != null) mc.player.setSprinting(false);
            mc.options.jumpKey.setPressed(false);
        }
        if (!resetRotation) return;
        RotationTask.rotationState = RotationTask.RotationState.RESET;
        RotationTask.returnStartTime = System.currentTimeMillis() - 100L;
        RotationTask.rotationPriority = 0;
        RotationTask.inactiveMs = 0L;
        RotationTask.needSmoothReset = true;
        RotationTask.resetDelayMs = 400L;
    }

    // ── Pathfinding ──

    private void maybeRebuildPath(long now) {
        if (mc.player == null || goal == null) return;
        if (path != null && Objects.equals(pathGoal, goal)) {
            if (now - lastPathfindMs < PATH_REBUILD_INTERVAL) {
                if (now - lastPathfindMs > PATH_VALIDITY_CHECK && isCurrentPathBlocked()) {
                    path = null;
                } else {
                    return;
                }
            }
        }
        BlockPos feet = mc.player.getBlockPos();
        double dist = feet.getSquaredDistance(goal);
        if (dist > MAX_PATH_DIST * MAX_PATH_DIST) {
            path = createDirectPath(feet, goal);
            pathGoal = goal;
            pathIndex = 0;
            lastPathfindMs = now;
            moveStartMs = now;
            return;
        }
        List<Move> newPath = searchPath(feet, goal);
        if (newPath != null && !newPath.isEmpty()) {
            path = newPath;
        } else {
            path = createDirectPath(feet, goal);
        }
        pathGoal = goal;
        pathIndex = 0;
        lastPathfindMs = now;
        moveStartMs = now;
    }

    private List<Move> searchPath(BlockPos start, BlockPos goal) {
        if (mc.world == null) return null;

        cachedOpen.clear();
        cachedClosed.clear();
        cachedBestG.clear();

        cachedOpen.add(new Node(start, null, null, 0, heuristic(start, goal)));
        cachedBestG.put(pack(start), 0.0);

        int iters = 0;
        while (!cachedOpen.isEmpty() && iters < MAX_NODES) {
            iters++;
            Node cur = cachedOpen.poll();
            long packed = pack(cur.pos);
            if (cachedClosed.contains(packed)) continue;
            cachedClosed.add(packed);

            if (cur.pos.equals(goal) || cur.pos.getSquaredDistance(goal) <= 1) {
                cachedOpen.clear();
                cachedClosed.clear();
                cachedBestG.clear();
                return reconstructPath(cur, goal);
            }

            for (Move m : getMoves(cur.pos)) {
                long np = pack(m.to);
                if (cachedClosed.contains(np)) continue;
                double g = cur.g + m.cost;
                Double prev = cachedBestG.get(np);
                if (prev != null && g >= prev) continue;
                cachedBestG.put(np, g);
                cachedOpen.add(new Node(m.to, m, cur, g, g + heuristic(m.to, goal)));
            }
        }
        return null;
    }

    private List<Move> getMoves(BlockPos pos) {
        List<Move> moves = new ArrayList<>();
        int x = pos.getX(), y = pos.getY(), z = pos.getZ();
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        int[][] diagDirs = {{1,1},{-1,1},{1,-1},{-1,-1}};

        for (int[] d : dirs) {
            addCardinalMove(moves, pos, x, y, z, d[0], d[1], 1.0);
        }

        for (int[] d : diagDirs) {
            addDiagonalMove(moves, pos, x, y, z, d[0], d[1]);
        }

        return moves;
    }

    private void addCardinalMove(List<Move> moves, BlockPos pos, int x, int y, int z, int dx, int dz, double costMul) {
        int nx = x + dx, nz = z + dz;

        BlockPos same = new BlockPos(nx, y, nz);
        if (isWalkable(same)) {
            moves.add(new Move(pos, same, MoveType.WALK, MoveType.WALK.cost * costMul, false));
        } else {
            BlockPos up = new BlockPos(nx, y + 1, nz);
            if (isStandable(up)) {
                moves.add(new Move(pos, up, MoveType.STEP_UP, MoveType.STEP_UP.cost * costMul, false));
            }
        }

        BlockPos down = new BlockPos(nx, y - 1, nz);
        if (isStandable(down) && !isWalkable(same)) {
            moves.add(new Move(pos, down, MoveType.STEP_DOWN, MoveType.STEP_DOWN.cost * costMul, false));
        }
    }

    private void addDiagonalMove(List<Move> moves, BlockPos pos, int x, int y, int z, int dx, int dz) {
        if (!isPassableCardinal(x + dx, y, z) || !isPassableCardinal(x, y, z + dz)) return;
        addCardinalMove(moves, pos, x, y, z, dx, dz, DIAGONAL_COST);
    }

    private boolean isPassableCardinal(int x, int y, int z) {
        if (mc.world == null) return false;
        BlockPos pos = new BlockPos(x, y, z);
        BlockState state = mc.world.getBlockState(pos);
        return state.isAir() || state.isReplaceable() || isLiquid(state);
    }

    private boolean isWalkable(BlockPos pos) {
        if (mc.world == null) return false;
        BlockState feet = mc.world.getBlockState(pos);
        BlockState head = mc.world.getBlockState(pos.up());
        BlockState ground = mc.world.getBlockState(pos.down());

        if (isSolid(feet) || isSolid(head)) return false;
        if (isDangerous(feet) || isDangerous(head)) return false;
        if (ground.isAir()) return false;
        if (isDangerous(ground)) return false;
        if (isLiquid(feet)) {
            if (isLiquid(ground)) return false;
            return !isLiquid(head);
        }
        return true;
    }

    private boolean isStandable(BlockPos pos) {
        if (mc.world == null) return false;
        BlockState feet = mc.world.getBlockState(pos);
        BlockState head = mc.world.getBlockState(pos.up());
        BlockState ground = mc.world.getBlockState(pos.down());

        if (isSolid(head)) return false;
        if (isDangerous(feet) || isDangerous(head) || isDangerous(ground)) return false;
        if (isSolid(feet) && !isLiquid(feet)) return false;
        if (ground.isAir()) return false;
        return true;
    }

    private boolean isCurrentPathBlocked() {
        if (path == null || mc.world == null) return false;
        for (int i = pathIndex; i < path.size(); i++) {
            Move m = path.get(i);
            if (!isValidMove(m)) return true;
        }
        return false;
    }

    private boolean isValidMove(Move m) {
        if (mc.world == null) return false;
        BlockState tFeet = mc.world.getBlockState(m.to);
        BlockState tHead = mc.world.getBlockState(m.to.up());
        if (isSolid(tFeet) || isSolid(tHead)) return false;
        if (isDangerous(tFeet) || isDangerous(tHead)) return false;
        return true;
    }

    private List<Move> createDirectPath(BlockPos from, BlockPos to) {
        List<Move> p = new ArrayList<>();
        p.add(new Move(from, to, MoveType.WALK, 1.0, false));
        return p;
    }

    private List<Move> reconstructPath(Node node, BlockPos goal) {
        List<Move> result = new ArrayList<>();
        Node cur = node;
        while (cur != null && cur.move != null) {
            result.add(cur.move);
            cur = cur.parent;
        }
        Collections.reverse(result);

        if (!result.isEmpty()) {
            Move last = result.get(result.size() - 1);
            if (!last.to.equals(goal)) {
                result.add(new Move(last.to, goal, MoveType.WALK, 1.0, false));
            }
        } else if (!node.pos.equals(goal)) {
            result.add(new Move(node.pos, goal, MoveType.WALK, 1.0, false));
        }

        result = smoothPath(result);
        return result;
    }

    private List<Move> smoothPath(List<Move> path) {
        if (path.size() < 3) return path;
        List<Move> smoothed = new ArrayList<>();
        smoothed.add(path.get(0));
        for (int i = 1; i < path.size() - 1; i++) {
            BlockPos prev = smoothed.get(smoothed.size() - 1).to;
            Move cur = path.get(i);
            Move next = path.get(i + 1);
            boolean sameLine = (prev.getX() == cur.to.getX() && cur.to.getX() == next.to.getX())
                            || (prev.getZ() == cur.to.getZ() && cur.to.getZ() == next.to.getZ());
            boolean sameY = prev.getY() == cur.to.getY() && cur.to.getY() == next.to.getY();
            if (!sameLine || !sameY) {
                smoothed.add(cur);
            }
        }
        Move last = path.get(path.size() - 1);
        if (!smoothed.get(smoothed.size() - 1).to.equals(last.to)) {
            smoothed.add(last);
        }
        return smoothed;
    }

    private static long pack(BlockPos pos) {
        return ((long) pos.getX() & 0xFFFFFF) << 40
             | ((long) pos.getY() & 0xFFFF)   << 24
             | ((long) pos.getZ() & 0xFFFFFF);
    }

    private double heuristic(BlockPos a, BlockPos b) {
        double dx = Math.abs(a.getX() - b.getX());
        double dy = Math.abs(a.getY() - b.getY());
        double dz = Math.abs(a.getZ() - b.getZ());
        return dx + dy + dz;
    }

    // ── Stuck ──

    private void updateStuckState(double distSq, long now) {
        if (isInCobweb()) {
            lastProgressMs = now;
            lastDistanceSq = distSq;
            return;
        }
        if (lastProgressMs == 0L) {
            lastProgressMs = now;
            lastDistanceSq = distSq;
            return;
        }
        if (distSq + STUCK_PROGRESS_EPSILON < lastDistanceSq) {
            lastDistanceSq = distSq;
            lastProgressMs = now;
            return;
        }
        if (now - lastProgressMs < STUCK_TIMEOUT) return;

        rerouteUntilMs = now + REROUTE_DURATION;
        rerouteStrafeLeft = chooseRerouteSide();
        yawOffset = (random.nextFloat() * (float)REROUTE_YAW_OFFSET * 2f) - (float)REROUTE_YAW_OFFSET;
        nextJumpMs = now;
        jumpPressed = false;
        rotationInitialized = false;
        lastProgressMs = now;
        lastDistanceSq = distSq;
        path = null;
        pathIndex = 0;
        pathGoal = null;
    }

    private boolean isInCobweb() {
        if (mc.world == null || mc.player == null) return false;
        return mc.world.getBlockState(mc.player.getBlockPos()).getBlock() == Blocks.COBWEB;
    }

    private boolean isDeepDropAhead() {
        if (mc.world == null || mc.player == null) return false;
        float rad = aimYaw * MathHelper.RADIANS_PER_DEGREE;
        double dx = -MathHelper.sin(rad) * 0.6;
        double dz = MathHelper.cos(rad) * 0.6;
        BlockPos feet = BlockPos.ofFloored(
            mc.player.getX() + dx,
            mc.player.getY(),
            mc.player.getZ() + dz
        );
        for (int i = 1; i <= DEEP_DROP_BLOCKS; i++) {
            if (!mc.world.getBlockState(feet.down(i)).isAir()) return false;
        }
        return true;
    }

    private boolean chooseRerouteSide() {
        boolean leftBlocked = isSideBlocked(-1);
        boolean rightBlocked = isSideBlocked(1);
        if (leftBlocked && !rightBlocked) return false;
        if (rightBlocked && !leftBlocked) return true;
        return !rerouteStrafeLeft;
    }

    private boolean isSideBlocked(int side) {
        if (mc.world == null || mc.player == null) return true;
        float rad = aimYaw * MathHelper.RADIANS_PER_DEGREE;
        double dx = -MathHelper.sin(rad) * SIDE_CHECK_RANGE + side * MathHelper.cos(rad) * SIDE_CHECK_RANGE;
        double dz = MathHelper.cos(rad) * SIDE_CHECK_RANGE + side * MathHelper.sin(rad) * SIDE_CHECK_RANGE;
        BlockPos check = BlockPos.ofFloored(
            mc.player.getX() + dx,
            mc.player.getY(),
            mc.player.getZ() + dz
        );
        return !mc.world.getBlockState(check).isAir();
    }

    private boolean isBlockedAhead() {
        if (mc.world == null || mc.player == null) return false;
        float rad = aimYaw * MathHelper.RADIANS_PER_DEGREE;
        double dx = -MathHelper.sin(rad);
        double dz = MathHelper.cos(rad);
        for (double range : new double[]{0.6, 1.0}) {
            for (double height : new double[]{0.0, 0.9, 1.8}) {
                BlockPos check = BlockPos.ofFloored(
                    mc.player.getX() + dx * range,
                    mc.player.getY() + height,
                    mc.player.getZ() + dz * range
                );
                if (!mc.world.getBlockState(check).isAir()) return true;
            }
        }
        return false;
    }

    // ── Attack ──

    private void setAttackState(boolean state) {
        if (mc.options == null) return;
        mc.options.attackKey.setPressed(state);
    }

    private void updateAttackKey(boolean attackEnabled, long now) {
        if (mc.player == null || mc.world == null) { setAttackState(false); return; }
        if (!attackEnabled) { setAttackState(false); return; }
        if (overrideAttack) { setAttackState(overrideAttackState); return; }
        setAttackState(stopBeforeAttack);
    }

    // ── Render ──

    public void renderPath(WorldRenderer renderer, Camera camera, int color) {
        if (mc.player == null || path == null || path.isEmpty()) return;
        Vec3d cameraPos = camera.getCameraPos();

        RenderLayer layer = WorldRenderLayers.LINES_NO_DEPTH(3.0);
        WorldGeometryEmitter lineEmitter = renderer.lineEmitter(layer);

        Vec3d prev = mc.player.getEyePos();

        for (int i = 0; i < path.size(); i++) {
            Move m = path.get(i);
            Vec3d wp = m.to.toCenterPos();
            int alpha = (i > pathIndex) ? ALPHA_PATH_AFTER : ALPHA_PATH_CURRENT;
            int segColor = (color & 0x00FFFFFF) | (alpha << 24);

            lineEmitter.emitLine(
                prev.x - cameraPos.x, prev.y - cameraPos.y, prev.z - cameraPos.z,
                wp.x - cameraPos.x, wp.y - cameraPos.y, wp.z - cameraPos.z,
                segColor
            );

            prev = wp;
        }

        if (goalPos != null) {
            int gColor = (color & 0x00FFFFFF) | (ALPHA_PATH_GOAL << 24);
            lineEmitter.emitLine(
                prev.x - cameraPos.x, prev.y - cameraPos.y, prev.z - cameraPos.z,
                goalPos.x - cameraPos.x, goalPos.y - cameraPos.y, goalPos.z - cameraPos.z,
                gColor
            );
        }
    }



    // ── Block checks ──

    private boolean isSolid(BlockState state) {
        if (state.isAir()) return false;
        if (state.isReplaceable()) return false;
        if (isLiquid(state)) return false;
        return !state.getCollisionShape(mc.world, BlockPos.ORIGIN).isEmpty();
    }

    private boolean isPassable(BlockState state) {
        return state.isAir() || state.isReplaceable() || isLiquid(state);
    }

    private boolean isLiquid(BlockState state) {
        return state.getFluidState().isIn(net.minecraft.registry.tag.FluidTags.WATER)
            || state.getFluidState().isIn(net.minecraft.registry.tag.FluidTags.LAVA);
    }

    private boolean isDangerous(BlockState state) {
        Block b = state.getBlock();
        return b == Blocks.LAVA
            || b == Blocks.FIRE
            || b == Blocks.CACTUS
            || b == Blocks.MAGMA_BLOCK
            || b == Blocks.CAMPFIRE
            || b == Blocks.SOUL_CAMPFIRE
            || b == Blocks.SWEET_BERRY_BUSH
            || b == Blocks.WITHER_ROSE
            || b == Blocks.POWDER_SNOW
            || state.getFluidState().isIn(net.minecraft.registry.tag.FluidTags.LAVA);
    }

    // ── Helpers ──

    private boolean isStopDistanceReached(Vec3d targetPos) {
        if (mc.player == null || targetPos == null) return false;
        double dx = targetPos.x - mc.player.getX();
        double dz = targetPos.z - mc.player.getZ();
        return dx * dx + dz * dz <= stopDistanceSq;
    }

    private float getYawToTarget(Vec3d targetPos) {
        double dx = targetPos.x - mc.player.getX();
        double dz = targetPos.z - mc.player.getZ();
        return (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(dz, dx)) - 90.0);
    }

    private float getPitchToTarget(Vec3d targetPos) {
        Vec3d eye = mc.player.getEyePos();
        double dx = targetPos.x - eye.x;
        double dy = targetPos.y - eye.y;
        double dz = targetPos.z - eye.z;
        double horizontal = Math.sqrt(dx * dx + dz * dz);
        return (float) MathHelper.clamp(Math.toDegrees(-Math.atan2(dy, horizontal)), -89.0, 89.0);
    }

    private float pitchOffset() {
        return 0f;
    }

    private float smoothAngle(float current, float target, float speed) {
        return current + MathHelper.wrapDegrees(target - current) * speed;
    }
}
