package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

@FunctionAdd(name = "ItemRadius", alias = "Item Radius", category = Category.Render, description = "Отображает радиус вокруг игрока при держании определённых предметов")
public class ItemRadius extends Function {

    private final BooleanSetting enderEye = new BooleanSetting("Дезка", true);
    private final BooleanSetting sugar = new BooleanSetting("Явка", true);
    private final BooleanSetting fireCharge = new BooleanSetting("Огненый Заряд", true);
    private final BooleanSetting phantomMembrane = new BooleanSetting("Божья Аура", true);
    private final BooleanSetting netheriteScrap = new BooleanSetting("Трапка", true);
    private final BooleanSetting driedKelp = new BooleanSetting("Пласт", true);
    private final BooleanSetting filled = new BooleanSetting("Заполненный", true);

    private int currentOutlineColor = 0xFFFFFFFF;
    private int targetOutlineColor = 0xFFFFFFFF;
    private float transitionTimer = 0.0f;
    private boolean lastPlayersInRadius = false;
    private static final float TRANSITION_DURATION = 0.5f;

    private Vec3d plastSmoothedCenter = Vec3d.ZERO;
    private float plastSmoothedYawDeg = 0.0f;
    private float plastSmoothedPitchDeg = 0.0f;
    private boolean plastHasSmoothedPose = false;

    

    public ItemRadius() {
        addSettings(enderEye, sugar, fireCharge, phantomMembrane, netheriteScrap, driedKelp, filled);
    }

    @EventHandler
    public void onRender3D(EventRender.World event) {
        if (nullCheck() || mc.player == null || mc.world == null) {
            return;
        }

        ItemStack main = mc.player.getMainHandStack();
        ItemStack off = mc.player.getOffHandStack();

        boolean handled = false;

        if (enderEye.get() && (isHolding(main, Items.ENDER_EYE) || isHolding(off, Items.ENDER_EYE))) {
            ItemStack eyeStack = isHolding(main, Items.ENDER_EYE) ? main : off;
            if (containsCyrillicLetter(eyeStack, 'Я')) {
                handled = true;
                float radius = 10.0f;
                Vec3d center = getCircleCenter(RenderUtil.getTickDelta());
                boolean playersInRadius = checkPlayersInRadius(mc.player, center, radius);
                updateOutlineColor(playersInRadius, RenderUtil.getTickDelta());
                renderCircle(event, center, radius, playersInRadius);
            }
        }

        if (!handled && sugar.get() && (isHolding(main, Items.SUGAR) || isHolding(off, Items.SUGAR))) {
            ItemStack sugarStack = isHolding(main, Items.SUGAR) ? main : off;
            if (containsCyrillicLetter(sugarStack, 'Я')) {
                handled = true;
                float radius = 10.0f;
                Vec3d center = getCircleCenter(RenderUtil.getTickDelta());
                boolean playersInRadius = checkPlayersInRadius(mc.player, center, radius);
                updateOutlineColor(playersInRadius, RenderUtil.getTickDelta());
                renderCircle(event, center, radius, playersInRadius);
            }
        }

        if (!handled && fireCharge.get() && (isHolding(main, Items.FIRE_CHARGE) || isHolding(off, Items.FIRE_CHARGE))) {
            ItemStack fireChargeStack = isHolding(main, Items.FIRE_CHARGE) ? main : off;
            if (containsCyrillicLetter(fireChargeStack, 'С')) {
                handled = true;
                float radius = 10.0f;
                Vec3d center = getCircleCenter(RenderUtil.getTickDelta());
                boolean playersInRadius = checkPlayersInRadius(mc.player, center, radius);
                updateOutlineColor(playersInRadius, RenderUtil.getTickDelta());
                renderCircle(event, center, radius, playersInRadius);
            }
        }

        if (!handled && phantomMembrane.get() && (isHolding(main, Items.PHANTOM_MEMBRANE) || isHolding(off, Items.PHANTOM_MEMBRANE))) {
            ItemStack membraneStack = isHolding(main, Items.PHANTOM_MEMBRANE) ? main : off;
            if (containsCyrillicLetter(membraneStack, 'У')) {
                handled = true;
                float radius = 2.0f;
                Vec3d center = getCircleCenter(RenderUtil.getTickDelta());
                boolean playersInRadius = checkPlayersInRadius(mc.player, center, radius);
                boolean friendsInRadius = checkFriendsInRadius(mc.player, center, radius);
                updateOutlineColor(playersInRadius, RenderUtil.getTickDelta());
                renderCircle(event, center, radius, friendsInRadius);
            }
        }

        if (!handled && netheriteScrap.get() && (isHolding(main, Items.NETHERITE_SCRAP) || isHolding(off, Items.NETHERITE_SCRAP))) {
            ItemStack scrapStack = isHolding(main, Items.NETHERITE_SCRAP) ? main : off;
            if (containsCyrillicLetter(scrapStack, 'А')) {
                handled = true;
                Vec3d p = getLerpedPlayerPos(RenderUtil.getTickDelta());
                Vec3d cubeCenter = new Vec3d(p.x, p.y + 0.5 + 1.625, p.z);
                boolean playersInRadius = checkPlayersInRadius(mc.player, cubeCenter, 2.5);
                updateOutlineColor(playersInRadius, RenderUtil.getTickDelta());
                renderCubeOutline(event, cubeCenter, 4.0f);
            }
        }

        if (!handled && driedKelp.get() && (isHolding(main, Items.DRIED_KELP) || isHolding(off, Items.DRIED_KELP))) {
            ItemStack kelpStack = isHolding(main, Items.DRIED_KELP) ? main : off;
            if (containsCyrillicLetter(kelpStack, 'П')) {
                handled = true;
                PlanePose pose = smoothPlastPose(computePlanePose(RenderUtil.getTickDelta()), RenderUtil.getTickDelta());
                boolean playersInRadius = checkPlayersInRadius(mc.player, pose.center, 2.5);
                renderPlane(event, pose, playersInRadius);
            }
        }

        if (!handled) {
            plastHasSmoothedPose = false;
        }
    }

    private void renderCircle(EventRender.World event, Vec3d center, float radius, boolean playersInRadius) {
        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);

        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                event.getMatrixStack().peek().getPositionMatrix(),
                mc.gameRenderer.getBasicProjectionMatrix(fov))) {

            Vec3d cameraPos = camera.getCameraPos();
            float y = (float) (center.y + mc.player.getHeight());
            float cx = (float) (center.x - cameraPos.x);
            float cy = (float) (y - cameraPos.y);
            float cz = (float) (center.z - cameraPos.z);

            if (filled.get()) {
                int fillColor = playersInRadius ? 0x3300FF00 : 0x330000FF;
                int fr = (fillColor >> 16) & 0xFF;
                int fg = (fillColor >> 8) & 0xFF;
                int fb = fillColor & 0xFF;
                int fa = (fillColor >> 24) & 0xFF;

                MatrixStack identity = new MatrixStack();
                WorldGeometryEmitter quadEmitter = new WorldGeometryEmitter(
                        camera,
                        identity.peek(),
                        renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_NO_DEPTH())
                );

                int stepDeg = 5;
                float prevX = cx;
                float prevZ = cz;
                boolean hasPrev = false;

                for (int deg = 0; deg <= 360; deg += stepDeg) {
                    double rad = Math.toRadians(deg);
                    float x = cx + (float) (MathHelper.sin((float) rad) * radius);
                    float z = cz + (float) (-MathHelper.cos((float) rad) * radius);

                    if (!hasPrev) {
                        prevX = x;
                        prevZ = z;
                        hasPrev = true;
                        continue;
                    }

                    quadEmitter.emitQuad(
                            new Vec3d(cx, cy, cz),
                            new Vec3d(prevX, cy, prevZ),
                            new Vec3d(x, cy, z),
                            new Vec3d(cx, cy, cz),
                            fr, fg, fb, fa
                    );

                    prevX = x;
                    prevZ = z;
                }
            }

            RenderLayer lineLayer = WorldRenderLayers.LINES_NO_DEPTH(5.0);
            WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);
            int outlineColor = currentOutlineColor;

            int stepDeg = 5;
            float firstX = 0.0f;
            float firstZ = 0.0f;
            float prevXLine = 0.0f;
            float prevZLine = 0.0f;
            boolean hasPrev = false;

            for (int deg = 0; deg <= 360; deg += stepDeg) {
                double rad = Math.toRadians(deg);
                float x = cx + (float) (MathHelper.sin((float) rad) * radius);
                float z = cz + (float) (-MathHelper.cos((float) rad) * radius);

                if (!hasPrev) {
                    firstX = x;
                    firstZ = z;
                    prevXLine = x;
                    prevZLine = z;
                    hasPrev = true;
                    continue;
                }

                lineEmitter.emitLine(new Vec3d(prevXLine, cy, prevZLine), new Vec3d(x, cy, z), outlineColor);
                prevXLine = x;
                prevZLine = z;
            }

            if (hasPrev) {
                lineEmitter.emitLine(new Vec3d(prevXLine, cy, prevZLine), new Vec3d(firstX, cy, firstZ), outlineColor);
            }

            renderer.flush();
        }
    }

    private void renderCubeOutline(EventRender.World event, Vec3d center, float size) {
        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);

        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                event.getMatrixStack().peek().getPositionMatrix(),
                mc.gameRenderer.getBasicProjectionMatrix(fov))) {

            Vec3d cameraPos = camera.getCameraPos();
            float half = size / 2.0f;
            float minX = (float) (center.x - cameraPos.x - half);
            float minY = (float) (center.y - cameraPos.y - half);
            float minZ = (float) (center.z - cameraPos.z - half);
            float maxX = minX + size;
            float maxY = minY + size;
            float maxZ = minZ + size;

            RenderLayer lineLayer = WorldRenderLayers.LINES_NO_DEPTH(6.0);
            WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);
            int color = currentOutlineColor;

            Vec3d p000 = new Vec3d(minX, minY, minZ);
            Vec3d p001 = new Vec3d(minX, minY, maxZ);
            Vec3d p010 = new Vec3d(minX, maxY, minZ);
            Vec3d p011 = new Vec3d(minX, maxY, maxZ);
            Vec3d p100 = new Vec3d(maxX, minY, minZ);
            Vec3d p101 = new Vec3d(maxX, minY, maxZ);
            Vec3d p110 = new Vec3d(maxX, maxY, minZ);
            Vec3d p111 = new Vec3d(maxX, maxY, maxZ);

            lineEmitter.emitLine(p000, p100, color);
            lineEmitter.emitLine(p100, p101, color);
            lineEmitter.emitLine(p101, p001, color);
            lineEmitter.emitLine(p001, p000, color);

            lineEmitter.emitLine(p010, p110, color);
            lineEmitter.emitLine(p110, p111, color);
            lineEmitter.emitLine(p111, p011, color);
            lineEmitter.emitLine(p011, p010, color);

            lineEmitter.emitLine(p000, p010, color);
            lineEmitter.emitLine(p100, p110, color);
            lineEmitter.emitLine(p101, p111, color);
            lineEmitter.emitLine(p001, p011, color);

            renderer.flush();
        }
    }

    private void renderPlane(EventRender.World event, PlanePose pose, boolean playersInRadius) {
        Camera camera = mc.gameRenderer.getCamera();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);

        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                event.getMatrixStack().peek().getPositionMatrix(),
                mc.gameRenderer.getBasicProjectionMatrix(fov))) {

            Vec3d cameraPos = camera.getCameraPos();

            float width = 4.0f;
            float height = 4.0f;
            float thickness = 1.5f;

            float halfW = width / 2.0f;
            float halfH = height / 2.0f;
            float halfT = thickness / 2.0f;

            float minX = -halfW;
            float maxX = halfW;
            float minY = -halfH;
            float maxY = halfH;
            float minZ = -halfT;
            float maxZ = halfT;

            MatrixStack matrixStack = new MatrixStack();
            matrixStack.translate(pose.center.x - cameraPos.x, pose.center.y - cameraPos.y, pose.center.z - cameraPos.z);

            if (Math.abs(pose.pitchDeg) > 0.001f) {
                matrixStack.multiply(net.minecraft.util.math.RotationAxis.POSITIVE_X.rotationDegrees(pose.pitchDeg));
            }
            if (Math.abs(pose.yawDeg) > 0.001f) {
                matrixStack.multiply(net.minecraft.util.math.RotationAxis.POSITIVE_Y.rotationDegrees(pose.yawDeg));
            }

            if (playersInRadius) {
                int fillColor = 0x66FF0000;
                int r = (fillColor >> 16) & 0xFF;
                int g = (fillColor >> 8) & 0xFF;
                int b = fillColor & 0xFF;
                int a = (fillColor >> 24) & 0xFF;

                WorldGeometryEmitter quadEmitter = new WorldGeometryEmitter(
                        camera,
                        matrixStack.peek(),
                        renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_NO_DEPTH())
                );

                drawBoxFaces(quadEmitter, minX, minY, minZ, maxX, maxY, maxZ, r, g, b, a);
            }

            int outlineColor = playersInRadius ? 0xFFFF0000 : 0xFF00FF00;
            RenderLayer lineLayer = WorldRenderLayers.LINES_NO_DEPTH(3.0);
            WorldGeometryEmitter lineEmitter = renderer.lineEmitter(lineLayer);

            drawBoxEdges(lineEmitter, minX, minY, minZ, maxX, maxY, maxZ, outlineColor);

            renderer.flush();
        }
    }

    private static void drawBoxFaces(WorldGeometryEmitter emitter,
                                     float minX, float minY, float minZ,
                                     float maxX, float maxY, float maxZ,
                                     int r, int g, int b, int a) {
        int c0 = (a << 24) | (r << 16) | (g << 8) | b;
        int c1 = c0;
        int c2 = c0;
        int c3 = c0;

        Vec3d p000 = new Vec3d(minX, minY, maxZ);
        Vec3d p100 = new Vec3d(maxX, minY, maxZ);
        Vec3d p110 = new Vec3d(maxX, maxY, maxZ);
        Vec3d p010 = new Vec3d(minX, maxY, maxZ);
        emitter.emitQuad(p000, p100, p110, p010, c0, c1, c2, c3);

        p000 = new Vec3d(maxX, minY, minZ);
        p100 = new Vec3d(minX, minY, minZ);
        p110 = new Vec3d(minX, maxY, minZ);
        p010 = new Vec3d(maxX, maxY, minZ);
        emitter.emitQuad(p000, p100, p110, p010, c0, c1, c2, c3);

        p000 = new Vec3d(minX, maxY, minZ);
        p100 = new Vec3d(minX, maxY, maxZ);
        p110 = new Vec3d(maxX, maxY, maxZ);
        p010 = new Vec3d(maxX, maxY, minZ);
        emitter.emitQuad(p000, p100, p110, p010, c0, c1, c2, c3);

        p000 = new Vec3d(minX, minY, maxZ);
        p100 = new Vec3d(minX, minY, minZ);
        p110 = new Vec3d(maxX, minY, minZ);
        p010 = new Vec3d(maxX, minY, maxZ);
        emitter.emitQuad(p000, p100, p110, p010, c0, c1, c2, c3);

        p000 = new Vec3d(minX, minY, minZ);
        p100 = new Vec3d(minX, minY, maxZ);
        p110 = new Vec3d(minX, maxY, maxZ);
        p010 = new Vec3d(minX, maxY, minZ);
        emitter.emitQuad(p000, p100, p110, p010, c0, c1, c2, c3);

        p000 = new Vec3d(maxX, minY, maxZ);
        p100 = new Vec3d(maxX, minY, minZ);
        p110 = new Vec3d(maxX, maxY, minZ);
        p010 = new Vec3d(maxX, maxY, maxZ);
        emitter.emitQuad(p000, p100, p110, p010, c0, c1, c2, c3);
    }

    private static void drawBoxEdges(WorldGeometryEmitter emitter,
                                     float minX, float minY, float minZ,
                                     float maxX, float maxY, float maxZ,
                                     int color) {
        Vec3d p000 = new Vec3d(minX, minY, minZ);
        Vec3d p001 = new Vec3d(minX, minY, maxZ);
        Vec3d p010 = new Vec3d(minX, maxY, minZ);
        Vec3d p011 = new Vec3d(minX, maxY, maxZ);
        Vec3d p100 = new Vec3d(maxX, minY, minZ);
        Vec3d p101 = new Vec3d(maxX, minY, maxZ);
        Vec3d p110 = new Vec3d(maxX, maxY, minZ);
        Vec3d p111 = new Vec3d(maxX, maxY, maxZ);

        emitter.emitLine(p000, p100, color);
        emitter.emitLine(p100, p101, color);
        emitter.emitLine(p101, p001, color);
        emitter.emitLine(p001, p000, color);

        emitter.emitLine(p010, p110, color);
        emitter.emitLine(p110, p111, color);
        emitter.emitLine(p111, p011, color);
        emitter.emitLine(p011, p010, color);

        emitter.emitLine(p000, p010, color);
        emitter.emitLine(p100, p110, color);
        emitter.emitLine(p101, p111, color);
        emitter.emitLine(p001, p011, color);
    }

    private PlanePose smoothPlastPose(PlanePose target, float tickDelta) {
        if (!plastHasSmoothedPose) {
            plastSmoothedCenter = target.center;
            plastSmoothedYawDeg = target.yawDeg;
            plastSmoothedPitchDeg = target.pitchDeg;
            plastHasSmoothedPose = true;
            return target;
        }

        float speed = 12.0f;
        float t = 1.0f - (float) Math.exp(-speed * Math.max(0.0f, tickDelta));

        plastSmoothedCenter = plastSmoothedCenter.lerp(target.center, t);
        plastSmoothedYawDeg = lerpAngleDeg(plastSmoothedYawDeg, target.yawDeg, t);
        plastSmoothedPitchDeg = lerpAngleDeg(plastSmoothedPitchDeg, target.pitchDeg, t);

        return new PlanePose(plastSmoothedCenter, plastSmoothedYawDeg, plastSmoothedPitchDeg);
    }

    private static float lerpAngleDeg(float from, float to, float t) {
        float delta = MathHelper.wrapDegrees(to - from);
        return from + delta * t;
    }

    private void updateOutlineColor(boolean playersInRadius, float tickDelta) {
        if (playersInRadius != lastPlayersInRadius) {
            transitionTimer = 0.0f;
            lastPlayersInRadius = playersInRadius;
        }

        int baseOutline = 0xFFFFFFFF;
        int lightOutline = 0xFF00FF00;
        targetOutlineColor = playersInRadius ? lightOutline : baseOutline;

        float step = TRANSITION_DURATION <= 0.0001f ? 1.0f : (tickDelta / TRANSITION_DURATION);
        transitionTimer = Math.min(transitionTimer + step, 1.0f);
        currentOutlineColor = lerpColor(currentOutlineColor, targetOutlineColor, transitionTimer);
    }

    private static int lerpColor(int startColor, int endColor, float t) {
        int startA = (startColor >> 24) & 0xFF;
        int startR = (startColor >> 16) & 0xFF;
        int startG = (startColor >> 8) & 0xFF;
        int startB = startColor & 0xFF;

        int endA = (endColor >> 24) & 0xFF;
        int endR = (endColor >> 16) & 0xFF;
        int endG = (endColor >> 8) & 0xFF;
        int endB = endColor & 0xFF;

        int a = (int) (startA + (endA - startA) * t);
        int r = (int) (startR + (endR - startR) * t);
        int g = (int) (startG + (endG - startG) * t);
        int b = (int) (startB + (endB - startB) * t);

        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static boolean isHolding(ItemStack stack, Item item) {
        return stack != null && !stack.isEmpty() && stack.isOf(item);
    }

    private static boolean containsCyrillicLetter(ItemStack stack, char letter) {
        if (stack == null || stack.isEmpty()) return false;
        String name = stack.getName().getString();
        if (name == null || name.isEmpty()) return false;
        String upper = name.toUpperCase();
        return upper.indexOf(Character.toUpperCase(letter)) >= 0;
    }

    private boolean checkPlayersInRadius(PlayerEntity self, Vec3d centerPos, double radius) {
        if (mc.world == null) return false;
        double r2 = radius * radius;
        for (PlayerEntity p : mc.world.getPlayers()) {
            if (p == null || p == self) continue;
            if (p.squaredDistanceTo(centerPos) <= r2) {
                return true;
            }
        }
        return false;
    }

    private boolean checkFriendsInRadius(PlayerEntity self, Vec3d centerPos, double radius) {
        if (mc.world == null) return false;
        double r2 = radius * radius;
        for (PlayerEntity p : mc.world.getPlayers()) {
            if (p == null || p == self) continue;
            if (p.squaredDistanceTo(centerPos) > r2) continue;

            String name = p.getName().getString();
            if (name != null && fun.nexisdlc.Nexis.getInstance().getFriendStorage().isFriend(name)) {
                return true;
            }
        }
        return false;
    }

    private Vec3d getLerpedPlayerPos(float tickDelta) {
        if (mc.player == null) return Vec3d.ZERO;
        double x = mc.player.lastRenderX + (mc.player.getX() - mc.player.lastRenderX) * tickDelta;
        double y = mc.player.lastRenderY + (mc.player.getY() - mc.player.lastRenderY) * tickDelta;
        double z = mc.player.lastRenderZ + (mc.player.getZ() - mc.player.lastRenderZ) * tickDelta;
        return new Vec3d(x, y, z);
    }

    private Vec3d getCircleCenter(float tickDelta) {
        Vec3d pos = getLerpedPlayerPos(tickDelta);
        return pos.add(0.0, -1.4, 0.0);
    }

    private record PlanePose(Vec3d center, float yawDeg, float pitchDeg) {
    }

    private PlanePose computePlanePose(float tickDelta) {
        Vec3d playerPos = getLerpedPlayerPos(tickDelta);
        Vec3d start = playerPos.add(0.0, mc.player.getEyeHeight(mc.player.getPose()), 0.0);
        Vec3d lookVec = mc.player.getRotationVec(tickDelta);
        Vec3d end = start.add(lookVec.multiply(4.0));

        BlockHitResult hit = mc.world.raycast(new RaycastContext(
                start,
                end,
                RaycastContext.ShapeType.COLLIDER,
                RaycastContext.FluidHandling.NONE,
                mc.player
        ));

        float pitch = mc.player.getPitch(tickDelta);
        boolean isLookingDown = pitch > 45.0f;
        boolean isLookingUp = pitch < -45.0f;
        boolean isLookingHorizontal = !isLookingDown && !isLookingUp;

        float thickness = 1.5f;
        float halfThickness = thickness / 2.0f;

        Vec3d center;
        float yawDeg;
        float pitchDeg;

        if (hit.getType() == HitResult.Type.BLOCK && hit.getPos().distanceTo(start) <= 4.0) {
            Vec3d hitPos = hit.getPos();
            Direction face = hit.getSide();

            if (isLookingDown) {
                center = new Vec3d(
                        Math.floor(hitPos.x) + 0.5,
                        Math.floor(hitPos.y + 1.0) - 1.8 + halfThickness,
                        Math.floor(hitPos.z) + 0.5
                );
                yawDeg = 0.0f;
                pitchDeg = 90.0f;
            } else if (isLookingUp) {
                center = new Vec3d(
                        Math.floor(hitPos.x) + 0.5,
                        Math.floor(hitPos.y) - halfThickness + 1.6,
                        Math.floor(hitPos.z) + 0.5
                );
                yawDeg = 0.0f;
                pitchDeg = -90.0f;
            } else {
                double offsetX = face.getOffsetX() != 0 ? face.getOffsetX() * halfThickness : 0.0;
                double offsetZ = face.getOffsetZ() != 0 ? face.getOffsetZ() * halfThickness : 0.0;
                center = new Vec3d(
                        Math.floor(hitPos.x) + 0.5 + offsetX,
                        Math.floor(hitPos.y) + 0.5 + 1.6,
                        Math.floor(hitPos.z) + 0.5 + offsetZ
                );

                yawDeg = switch (face) {
                    case NORTH -> 180.0f;
                    case SOUTH -> 0.0f;
                    case WEST -> 90.0f;
                    case EAST -> -90.0f;
                    default -> -mc.player.getYaw(tickDelta);
                };
                pitchDeg = 0.0f;
            }
        } else {
            Vec3d approx = start.add(lookVec.multiply(4.0));
            double y = Math.floor(approx.y) + (isLookingDown ? (-1.8 + halfThickness) : isLookingUp ? (-halfThickness + 1.6) : (0.5 + 1.6));
            center = new Vec3d(Math.floor(approx.x) + 0.5, y, Math.floor(approx.z) + 0.5);
            yawDeg = -mc.player.getYaw(tickDelta);
            pitchDeg = 0.0f;
        }

        if (!isLookingHorizontal) {
            yawDeg = -mc.player.getYaw(tickDelta);
        }

        return new PlanePose(center, yawDeg, pitchDeg);
    }
}



