package fun.nexisdlc.modules.impl.render;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.client.tweaks.crosshair.DrawContextFloatDrawTexture;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.ProjectionUtil;
import fun.nexisdlc.client.utils.render.easy.RenderUtil;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.client.utils.render.main.text.TextRenderer;
import fun.nexisdlc.client.utils.render.main.world.WorldGeometryEmitter;
import fun.nexisdlc.client.utils.render.main.world.WorldLineRenderer;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderLayers;
import fun.nexisdlc.client.utils.render.main.world.WorldRenderer;
import fun.nexisdlc.mixins.accessors.GameRendererAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.*;
import net.minecraft.entity.projectile.thrown.*;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import org.joml.Vector3d;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionAdd(name = "ProjectilePrediction", alias = "Projectile Prediction", category = Category.Render, description = "Показывает точку и траекторию падения летящих снарядов")
public class ProjectilePrediction extends Function {
    private static final double LINE_WIDTH_PX = 4.0;
    private static final long MAX_LIFETIME_MS = 2000L;

    private final BooleanSetting showPearls = new BooleanSetting("Эндер жемчуг", true);
    private final BooleanSetting showArrows = new BooleanSetting("Стрелы", true);
    private final BooleanSetting showSnowballs = new BooleanSetting("Снежки", true);
    private final BooleanSetting showEggs = new BooleanSetting("Яйца", true);
    private final BooleanSetting showPotions = new BooleanSetting("Зелья", true);
    private final BooleanSetting showBottles = new BooleanSetting("Опыт", true);
    private final BooleanSetting showTridents = new BooleanSetting("Трезубцы", true);
    private final SliderSetting scanRange = new SliderSetting("Дистанция поиска", 96f, 16f, 256f, 4f);

    private final List<PredictedPoint> activePoints = new ArrayList<>();

    public ProjectilePrediction() {
        addSettings(showPearls, showArrows, showSnowballs, showEggs, showPotions, showBottles, showTridents, scanRange);
    }

    @Override
    public void onDisable() {
        activePoints.clear();
        super.onDisable();
    }

    @EventHandler
    public void onRenderWorld(EventRender.World event) {
        if (mc.world == null || mc.player == null || ClientContainer.isHide() || activePoints.isEmpty()) {
            return;
        }
        Camera camera = mc.gameRenderer.getCamera();
        float tickDelta = RenderUtil.getTickDelta();
        float fov = ((GameRendererAccessor) mc.gameRenderer).invokeGetFov(camera, event.getTicks(), true);
        Vec3d cameraPos = camera.getCameraPos();
        try (WorldRenderer renderer = WorldRenderer.begin(
                mc,
                mc.getRenderTickCounter(),
                camera,
                event.getMatrixStack().peek().getPositionMatrix(),
                mc.gameRenderer.getBasicProjectionMatrix(fov))) {
            WorldGeometryEmitter lineEmitter = new WorldGeometryEmitter(
                    camera, new MatrixStack().peek(),
                    renderer.getBuffer(WorldRenderLayers.POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH()));
            for (PredictedPoint point : activePoints) {
                if (!(point.entity instanceof ProjectileEntity projectile)) {
                    continue;
                }
                // пересчёт каждый кадр от интерполированной позиции снаряда -> линия следует за ним
                List<Vec3d> path = predictPathLive(projectile, tickDelta);
                if (path.size() < 2) {
                    continue;
                }
                int startColor = ClientColors.applyAlpha(ClientColors.GRADIENT_START.getRGB(), 0.95f);
                int endColor = ClientColors.applyAlpha(ClientColors.GRADIENT_END.getRGB(), 0.95f);
                int last = path.size() - 1;
                for (int i = 1; i <= last; i++) {
                    float fromT = (i - 1) / (float) last;
                    float toT = i / (float) last;
                    WorldLineRenderer.line(
                            lineEmitter,
                            path.get(i - 1),
                            path.get(i),
                            cameraPos,
                            lerpColor(startColor, endColor, fromT),
                            lerpColor(startColor, endColor, toT),
                            LINE_WIDTH_PX);
                }
            }
            renderer.flush();
        } catch (Throwable ignored) {
        }
    }

    private List<Vec3d> predictPathLive(ProjectileEntity projectile, float tickDelta) {
        List<Vec3d> path = new ArrayList<>();
        double sx = projectile.lastRenderX + (projectile.getX() - projectile.lastRenderX) * tickDelta;
        double sy = projectile.lastRenderY + (projectile.getY() - projectile.lastRenderY) * tickDelta;
        double sz = projectile.lastRenderZ + (projectile.getZ() - projectile.lastRenderZ) * tickDelta;
        Vec3d pos = new Vec3d(sx, sy, sz);
        Vec3d motion = projectile.getVelocity();
        path.add(pos);
        for (int i = 0; i < 220; i++) {
            Vec3d prev = pos;
            pos = pos.add(motion);
            path.add(pos);
            HitResult ray = mc.world.raycast(new RaycastContext(prev, pos, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, projectile));
            if (ray.getType() == HitResult.Type.BLOCK) {
                break;
            }
            motion = applyMotion(projectile, motion, pos);
            if (pos.y < -64 || pos.y > 512) {
                break;
            }
        }
        return path;
    }

    @EventHandler
    public void onRenderHud(EventRender.Screen.UnderHud event) {
        if (mc.world == null || mc.player == null || mc.options.hudHidden || ClientContainer.isHide()) {
            activePoints.clear();
            return;
        }

        DrawContext context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) {
            return;
        }

        refreshPoints();
        if (activePoints.isEmpty()) {
            return;
        }

        renderPoints(event.getRenderer(), context);
    }

    private void refreshPoints() {
        activePoints.removeIf(point -> System.currentTimeMillis() - point.createdAt > MAX_LIFETIME_MS || point.entity.isRemoved() || point.entity.isOnGround());

        double maxRangeSq = scanRange.get() * scanRange.get();
        for (Entity entity : mc.world.getEntities()) {
            if (!(entity instanceof ProjectileEntity projectile)) {
                continue;
            }
            if (projectile.isOnGround() || !isSupported(projectile)) {
                continue;
            }
            if (mc.player.squaredDistanceTo(entity.getX(), entity.getY(), entity.getZ()) > maxRangeSq) {
                continue;
            }
            if (activePoints.stream().anyMatch(point -> point.entity == entity)) {
                continue;
            }

            HitResult hit = predictHit(projectile);
            if (hit == null || hit.getType() != HitResult.Type.BLOCK) {
                continue;
            }

            Vec3d pos = hit.getPos();
            if (mc.player.squaredDistanceTo(pos.x, pos.y, pos.z) > maxRangeSq) {
                continue;
            }

            activePoints.add(new PredictedPoint(entity, pos, getStackForProjectile(projectile), System.currentTimeMillis(), predictPath(projectile)));
        }
    }

    private void renderPoints(Renderer2D renderer, DrawContext context) {
        List<PredictedPoint> sorted = activePoints.stream()
                .sorted(Comparator.comparingDouble(point -> mc.player.squaredDistanceTo(point.pos.x, point.pos.y, point.pos.z)))
                .toList();

        for (PredictedPoint point : sorted) {
            Vector3d screen = ProjectionUtil.toScreen(point.pos.x, point.pos.y + 0.15, point.pos.z);
            if (screen.z < 0 || ProjectionUtil.noNeedRender(screen)) {
                continue;
            }

            float x = (float) screen.x;
            float y = (float) screen.y;

            renderer.pushTranslation(x, y);
            renderWaypointMarker(renderer, point);
            renderer.popTransform();
        }
    }

    private void renderWaypointMarker(Renderer2D renderer, PredictedPoint point) {
        // Получаем данные
        String projectileName = getProjectileName(point.entity);
        float timeToImpact = getTimeToImpact(point);
        String firstLine = projectileName + String.format(" (%.1fs)", timeToImpact);
        String throwerName = getThrowerName(point.entity);
        String secondLine = "от " + throwerName;

        var font = FontRegistry.SF_MEDIUM;
        float fontSize = 16f;
        float paddingX = 4f;
        float paddingY = 1f;
        float lineSpacing = 1f;
        float iconSize = 17f;
        float iconTextSpacing = 2f;
        int bgColor = ClientColors.applyAlpha(0xFF000000, 0.75f);
        float rounding = 0f;

        // Измеряем первую строку
        TextRenderer.TextMetrics firstLineWidth = renderer.measureText(font, firstLine, fontSize);
        float firstLineHeight = fontSize;

        // Фон для первой строки
        float firstBgWidth = firstLineWidth.width + paddingX * 2;
        float firstBgHeight = firstLineHeight + paddingY * 3;
        float firstBgX = -firstBgWidth / 2f;
        float firstBgY = -firstBgHeight - lineSpacing / 2f;
        renderer.rect(firstBgX, firstBgY, firstBgWidth, firstBgHeight, rounding, bgColor);

        // Рендер первой строки
        renderer.text(font, -firstLineWidth.width / 2f, firstBgY + paddingY + firstLineHeight - 1, fontSize, firstLine, -1);

        // Вторая строка с иконкой
        if (throwerName != null && !throwerName.isEmpty()) {
            TextRenderer.TextMetrics secondLineTextWidth = renderer.measureText(font, secondLine, fontSize);
            float secondLineTotalWidth = iconSize + iconTextSpacing + secondLineTextWidth.width;
            float secondBgWidth = secondLineTotalWidth + paddingX * 2;
            float secondBgHeight = firstBgHeight;
            float secondBgX = -secondBgWidth / 2f;
            float secondBgY = firstBgY + firstBgHeight + lineSpacing;

            // Фон для второй строки
            renderer.rect(secondBgX, secondBgY, secondBgWidth, secondBgHeight, rounding, bgColor);

            // Иконка игрока
            float iconX = secondBgX + paddingX;
            float iconY = secondBgY + paddingY;
            renderPlayerFace(renderer, throwerName, iconX, iconY, iconSize);

            // Текст
            float textX = iconX + iconSize + iconTextSpacing;
            float textY = secondBgY + paddingY + secondBgHeight - paddingY * 2 - 2;
            renderer.text(font, textX, textY, fontSize, secondLine, -1);
        }
    }

    private String getProjectileName(Entity entity) {
        if (entity instanceof EnderPearlEntity) return "Эндер жемчуг";
        if (entity instanceof SnowballEntity) return "Снежок";
        if (entity instanceof EggEntity) return "Яйцо";
        if (entity instanceof PotionEntity) return "Зелье";
        if (entity instanceof ExperienceBottleEntity) return "Опыт";
        if (entity instanceof TridentEntity) return "Трезубец";
        if (entity instanceof SpectralArrowEntity) return "Спектральная стрела";
        if (entity instanceof ArrowEntity) return "Стрела";
        return "Снаряд";
    }

    private float getTimeToImpact(PredictedPoint point) {
        // Получаем текущую позицию снаряда и его скорость
        Vec3d currentPos = point.entity.getEntityPos();
        Vec3d velocity = point.entity.getVelocity();
        Vec3d targetPos = point.pos;

        // Расстояние до точки падения
        double distance = currentPos.distanceTo(targetPos);

        // Скорость снаряда
        double speed = velocity.length();

        if (speed < 0.01) {
            // Если снаряд почти остановился
            return 0.1f;
        }

        // Примерное время = расстояние / скорость
        float time = (float) (distance / speed);

        // Ограничиваем от 0 до 10 секунд
        return Math.max(0.05f, Math.min(10f, time));
    }

    private String getThrowerName(Entity entity) {
        // Пытаемся получить владельца снаряда

        if (entity instanceof ProjectileEntity projectile) {
            if (projectile.getOwner() instanceof net.minecraft.entity.player.PlayerEntity player) {
                return player.getName().getString();
            }
        }
        // Если не удалось определить владельца
        return "Неизвестный";
    }

    private void renderPlayerFace(Renderer2D renderer, String playerName, float x, float y, float size) {
        if (mc.world == null) return;

        // Ищем игрока по имени
        net.minecraft.entity.player.PlayerEntity targetPlayer = null;
        for (net.minecraft.entity.player.PlayerEntity player : mc.world.getPlayers()) {
            if (player.getName().getString().equals(playerName)) {
                targetPlayer = player;
                break;
            }
        }

        if (targetPlayer instanceof AbstractClientPlayerEntity abstractPlayer) {
            Identifier skin = abstractPlayer.getSkin().body().texturePath();
            float u0 = 8f / 64f;
            float v0 = 8f / 64f;
            float u1 = 16f / 64f;
            float v1 = 16f / 64f;

            // Рендер лица
            drawSkinRegionNearest(renderer, skin, x - 2, y, size, size, u0, v0, u1, v1, 0xFFFFFFFF, 4);

            // Рендер шляпы
            float hatU0 = 40f / 64f;
            float hatU1 = 48f / 64f;
            float hatSize = size + 2f;
            float hatX = x;
            float hatY = y - 1f;
            drawSkinRegionNearest(renderer, skin, hatX, hatY, hatSize, hatSize, hatU0, v0, hatU1, v1, 0xFFFFFFFF, 4);
        } else {
            // Если игрок не найден, рисуем заглушку
            renderer.rect(x, y, size, size, size / 2f, 0xFF888888);
        }
    }

    private void drawSkinRegionNearest(Renderer2D renderer, Identifier texture, float x, float y, float w, float h,
                                       float u0, float v0, float u1, float v1, int tint, float rounding) {
        int glId = renderer.getTextureGlIdDirect(texture);
        if (glId <= 0) {
            renderer.drawTextureRegionRounded(texture, x, y, w, h, u0, v0, u1, v1, tint, rounding);
            return;
        }

        renderer.flush();
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, glId);
        int previousMinFilter = GL11.glGetTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER);
        int previousMagFilter = GL11.glGetTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        try {
            renderer.drawTextureRegionRounded(texture, x, y, w, h, u0, v0, u1, v1, tint, rounding);
            renderer.flush();
        } finally {
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, glId);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, previousMinFilter);
            GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, previousMagFilter);
            GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
        }
    }

    private void renderVanillaItem(Renderer2D renderer, ItemStack stack,
                                   float originX, float originY, float scale,
                                   float x, float y, float size) {
        if (stack == null || stack.isEmpty()) return;
        if (mc == null || mc.getItemRenderer() == null) return;
        var context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) return;
        if (size <= 0f) return;

        var window = mc.getWindow();
        double scaleFactor = window.getScaleFactor();
        if (scaleFactor <= 0.0) return;

        float absX = (originX + x) * scale;
        float absY = (originY + y) * scale;
        float absSize = size * scale;

        float guiX = (float) (absX / scaleFactor);
        float guiY = (float) (absY / scaleFactor);
        float guiScale = (float) (absSize / (16f * scaleFactor));

        renderer.flush();
        var matrices = context.getMatrices();
        matrices.pushMatrix();
        matrices.translate(guiX, guiY);
        matrices.scale(guiScale, guiScale);
        context.drawItemWithoutEntity(stack, 0, 0, 0);
        matrices.popMatrix();
        renderer.resetPipelineState();
    }

    private void renderItem(Renderer2D renderer, DrawContext context, ItemStack stack, float x, float y, float size) {
        if (stack == null || stack.isEmpty()) {
            return;
        }

        var transform = renderer.getTransformStack().current();
        float absX = x;
        float absY = y;
        float absSize = size;
        if (transform != null && transform.length >= 6) {
            float scaleX = (float) Math.sqrt(transform[0] * transform[0] + transform[3] * transform[3]);
            float scaleY = (float) Math.sqrt(transform[1] * transform[1] + transform[4] * transform[4]);
            absX = transform[0] * x + transform[1] * y + transform[2];
            absY = transform[3] * x + transform[4] * y + transform[5];
            absSize = size * Math.min(scaleX, scaleY);
        }
        if (!Float.isFinite(absX) || !Float.isFinite(absY) || !Float.isFinite(absSize) || absSize <= 0f) {
            return;
        }

        double windowScale = mc.getWindow().getScaleFactor();
        if (windowScale <= 0.0) {
            return;
        }

        float guiX = (float) (absX / windowScale);
        float guiY = (float) (absY / windowScale);
        float guiScale = (float) (absSize / (16f * windowScale));
        if (!Float.isFinite(guiX) || !Float.isFinite(guiY) || !Float.isFinite(guiScale) || guiScale <= 0f) {
            return;
        }

        renderer.flush();
        var matrices = context.getMatrices();
        matrices.pushMatrix();
        try {
            matrices.translate(guiX, guiY);
            matrices.scale(guiScale, guiScale);
            ((DrawContextFloatDrawTexture) context).nexis$drawItem(stack, 0, 0, false, "ProjectilePrediction");
        } catch (Throwable ignored) {
        } finally {
            matrices.popMatrix();
            renderer.resetPipelineState();
        }
    }

    private boolean isSupported(ProjectileEntity projectile) {
        if (projectile instanceof EnderPearlEntity) return showPearls.get();
        if (projectile instanceof SnowballEntity) return showSnowballs.get();
        if (projectile instanceof EggEntity) return showEggs.get();
        if (projectile instanceof PotionEntity) return showPotions.get();
        if (projectile instanceof ExperienceBottleEntity) return showBottles.get();
        if (projectile instanceof ArrowEntity || projectile instanceof SpectralArrowEntity) return showArrows.get();
        if (projectile instanceof TridentEntity) return showTridents.get();
        if (projectile instanceof PersistentProjectileEntity) return showArrows.get() || showTridents.get();
        return true;
    }

    private ItemStack getStackForProjectile(ProjectileEntity projectile) {
        if (projectile instanceof EnderPearlEntity) return new ItemStack(Items.ENDER_PEARL);
        if (projectile instanceof SnowballEntity) return new ItemStack(Items.SNOWBALL);
        if (projectile instanceof EggEntity) return new ItemStack(Items.EGG);
        if (projectile instanceof PotionEntity) return new ItemStack(Items.SPLASH_POTION);
        if (projectile instanceof ExperienceBottleEntity) return new ItemStack(Items.EXPERIENCE_BOTTLE);
        if (projectile instanceof TridentEntity) return new ItemStack(Items.TRIDENT);
        if (projectile instanceof SpectralArrowEntity) return new ItemStack(Items.SPECTRAL_ARROW);
        if (projectile instanceof ArrowEntity || projectile instanceof PersistentProjectileEntity)
            return new ItemStack(Items.ARROW);
        return ItemStack.EMPTY;
    }

    private HitResult predictHit(ProjectileEntity projectile) {
        Vec3d pos = new Vec3d(projectile.getX(), projectile.getY(), projectile.getZ());
        Vec3d motion = projectile.getVelocity();
        for (int i = 0; i < 220; i++) {
            Vec3d prev = pos;
            pos = pos.add(motion);
            HitResult ray = mc.world.raycast(new RaycastContext(prev, pos, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, projectile));
            if (ray.getType() == HitResult.Type.BLOCK) {
                return ray;
            }
            motion = applyMotion(projectile, motion, pos);
            if (pos.y < -64 || pos.y > 512) {
                break;
            }
        }
        return new BlockHitResult(pos, Direction.UP, BlockPos.ofFloored(pos), false);
    }

    private List<Vec3d> predictPath(ProjectileEntity projectile) {
        List<Vec3d> path = new ArrayList<>();
        Vec3d pos = new Vec3d(projectile.getX(), projectile.getY(), projectile.getZ());
        Vec3d motion = projectile.getVelocity();
        path.add(pos);
        for (int i = 0; i < 220; i++) {
            Vec3d prev = pos;
            pos = pos.add(motion);
            path.add(pos);
            HitResult ray = mc.world.raycast(new RaycastContext(prev, pos, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, projectile));
            if (ray.getType() == HitResult.Type.BLOCK) {
                break;
            }
            motion = applyMotion(projectile, motion, pos);
            if (pos.y < -64 || pos.y > 512) {
                break;
            }
        }
        return path;
    }

    private Vec3d applyMotion(ProjectileEntity projectile, Vec3d motion, Vec3d pos) {
        double drag = 0.99;
        double gravity = 0.03;

        if (projectile instanceof PersistentProjectileEntity) {
            gravity = 0.05;
        } else if (projectile instanceof ExperienceBottleEntity) {
            gravity = 0.07;
            drag = 0.95;
        } else if (projectile instanceof PotionEntity) {
            gravity = 0.05;
            drag = 0.95;
        }

        boolean inWater = mc.world.getBlockState(BlockPos.ofFloored(pos)).getFluidState().isIn(net.minecraft.registry.tag.FluidTags.WATER);
        if (inWater) {
            drag *= 0.8;
        }

        return motion.multiply(drag).add(0.0, -gravity, 0.0);
    }

    private int lerpColor(int from, int to, float t) {
        t = Math.max(0f, Math.min(1f, t));
        int fa = (from >>> 24) & 0xFF;
        int fr = (from >>> 16) & 0xFF;
        int fg = (from >>> 8) & 0xFF;
        int fb = from & 0xFF;
        int ta = (to >>> 24) & 0xFF;
        int tr = (to >>> 16) & 0xFF;
        int tg = (to >>> 8) & 0xFF;
        int tb = to & 0xFF;

        int a = Math.round(fa + (ta - fa) * t);
        int r = Math.round(fr + (tr - fr) * t);
        int g = Math.round(fg + (tg - fg) * t);
        int b = Math.round(fb + (tb - fb) * t);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private record PredictedPoint(Entity entity, Vec3d pos, ItemStack stack, long createdAt, List<Vec3d> path) {
    }
}
