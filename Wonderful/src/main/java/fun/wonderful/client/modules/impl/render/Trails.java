package fun.wonderful.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.Wonderful;
import fun.wonderful.api.QClient;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.imageio.ImageIO;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.option.Perspective;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class Trails
extends Module {
    private static final String MODE_DEFAULT = "Обычный";
    private static final String MODE_DASH = "Фигуры";
    private static final String COLOR_THEME = "Тема";
    private static final String COLOR_RAINBOW = "Радуга";
    private static final Identifier DASH_BLOOM = Identifier.of((String)"wonderful", (String)"textures/dashtrail/dashbloomsample.png");
    private static final int[] DASH_ANIMATED_GROUPS = new int[]{11, 23, 32, 16, 32};
    private static final int MAX_DASHES = 96;
    private static final int MAX_SPARKS_PER_DASH = 6;
    private static final float DASH_BLOOM_LIFE_MS = 650.0f;
    private static final boolean DASH_SEGMENTS_ENABLED = true;
    private static final boolean DASH_DOTS_ENABLED = false;
    public static Trails INSTANCE = new Trails();
    private final ModeSetting mode = new ModeSetting("Режим", "Обычный", "Обычный", "Фигуры");
    private final FloatSetting duration = new FloatSetting("Длительность", 300.0f, 100.0f, 1000.0f, 10.0f).visible(() -> this.mode.is(MODE_DEFAULT));
    private final FloatSetting dashLength = new FloatSetting("Длина линии", 0.75f, 0.5f, 1.5f, 0.05f).visible(() -> this.mode.is(MODE_DASH));
    private final FloatSetting dashSize = new FloatSetting("Размер фигур", 1.45f, 0.5f, 2.5f, 0.05f).visible(() -> this.mode.is(MODE_DASH));
    private final ModeSetting colorMode = new ModeSetting("Цвет", "Тема", "Тема", "Радуга").visible(() -> this.mode.is(MODE_DASH));
    private final ListSetting targets = new ListSetting("Отображать", new BooleanSetting("На себе", true), new BooleanSetting("На друзьях", true), new BooleanSetting("На других", true)).visible(() -> this.mode.is(MODE_DASH));
    private final BooleanSetting lighting = new BooleanSetting("Свечение", true).visible(() -> this.mode.is(MODE_DASH));
    private final BooleanSetting showFirstPerson = new BooleanSetting("Отображать от первого лица", false);
    private final List<Point> points = new ArrayList<Point>();
    private final List<DashCubic> dashCubics = new ArrayList<DashCubic>();
    private final List<DashTextureFrame> dashTextures = new ArrayList<DashTextureFrame>();
    private final List<List<DashTextureFrame>> dashAnimatedTextures = new ArrayList<List<DashTextureFrame>>();
    private final Map<Integer, Vec3d> lastDashPlayerPositions = new HashMap<Integer, Vec3d>();
    private final Random random = new Random(1234567891L);

    public Trails() {
        super("Trails", "Красивый след за игроком", Module.ModuleCategory.RENDER);
        this.fillDashTextures();
        this.addSettings(this.mode, this.duration, this.dashLength, this.dashSize, this.colorMode, this.targets, this.showFirstPerson, this.lighting);
    }

    @Override
    public void onEnable() {
        this.lastDashPlayerPositions.clear();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        this.points.clear();
        this.dashCubics.clear();
        this.lastDashPlayerPositions.clear();
        super.onDisable();
    }

    @EventLink
    public void onUpdate(EventUpdate event) {
        if (!this.mode.is(MODE_DASH) || Trails.mc.player == null || Trails.mc.world == null) {
            return;
        }
        this.updateDashCubics();
        this.spawnDashCubics();
    }

    @EventLink
    public void onRender(Event3DRender event) {
        if (!this.showFirstPerson.isState() && Trails.mc.options.getPerspective() == Perspective.FIRST_PERSON) {
            return;
        }
        if (Trails.mc.player == null || Trails.mc.world == null) {
            return;
        }
        if (this.mode.is(MODE_DASH)) {
            this.renderDash(event);
            return;
        }
        this.renderDefaultTrail(event);
    }

    private void renderDefaultTrail(Event3DRender event) {
        long currentTime = System.currentTimeMillis();
        this.points.removeIf(p2 -> (float)(currentTime - p2.time) > this.duration.get());
        Vec3d playerPos = this.interpolatePlayerPosition(event.getTickDelta());
        this.points.add(new Point(playerPos));
        this.render3DPoints(event.getMatrices());
    }

    private Vec3d interpolatePlayerPosition(float partialTicks) {
        return new Vec3d(MathHelper.lerp((double)partialTicks, (double)Trails.mc.player.prevX, (double)Trails.mc.player.getX()), MathHelper.lerp((double)partialTicks, (double)Trails.mc.player.prevY, (double)Trails.mc.player.getY()), MathHelper.lerp((double)partialTicks, (double)Trails.mc.player.prevZ, (double)Trails.mc.player.getZ()));
    }

    private Vec3d interpolatePlayerPosition(PlayerEntity playerEntity, float partialTicks) {
        return new Vec3d(MathHelper.lerp((double)partialTicks, (double)playerEntity.prevX, (double)playerEntity.getX()), MathHelper.lerp((double)partialTicks, (double)playerEntity.prevY, (double)playerEntity.getY()), MathHelper.lerp((double)partialTicks, (double)playerEntity.prevZ, (double)playerEntity.getZ()));
    }

    private void render3DPoints(MatrixStack matrixStack) {
        if (this.points.size() < 2) {
            return;
        }
        this.startRendering();
        matrixStack.push();
        Vec3d view = Trails.mc.gameRenderer.getCamera().getPos();
        matrixStack.translate(-view.x, -view.y, -view.z);
        Matrix4f matrix = matrixStack.peek().getPositionMatrix();
        int themeColor = ColorUtils.getThemeColor();
        float red = ColorUtils.redf(themeColor);
        float green = ColorUtils.greenf(themeColor);
        float blue = ColorUtils.bluef(themeColor);
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);
        int index = 0;
        for (Point p2 : this.points) {
            float alpha = (float)index / (float)this.points.size() * 0.7f;
            int alphaInt = (int)(alpha * 255.0f);
            buffer.vertex(matrix, (float)p2.pos.x, (float)(p2.pos.y + (double)Trails.mc.player.getHeight()), (float)p2.pos.z).color((int)(red * 255.0f), (int)(green * 255.0f), (int)(blue * 255.0f), alphaInt);
            buffer.vertex(matrix, (float)p2.pos.x, (float)p2.pos.y, (float)p2.pos.z).color((int)(red * 255.0f), (int)(green * 255.0f), (int)(blue * 255.0f), alphaInt);
            ++index;
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        RenderSystem.lineWidth((float)2.0f);
        this.renderLineStrip(matrix, this.points, true, red, green, blue);
        this.renderLineStrip(matrix, this.points, false, red, green, blue);
        matrixStack.pop();
        this.stopRendering();
    }

    private void renderLineStrip(Matrix4f matrix, List<Point> points, boolean withHeight, float red, float green, float blue) {
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
        int index = 0;
        for (Point p2 : points) {
            float alpha = Math.min((float)index / (float)points.size() * 1.5f, 1.0f);
            int alphaInt = (int)(alpha * 255.0f);
            float y2 = withHeight ? (float)(p2.pos.y + (double)Trails.mc.player.getHeight()) : (float)p2.pos.y;
            buffer.vertex(matrix, (float)p2.pos.x, y2, (float)p2.pos.z).color((int)(red * 255.0f), (int)(green * 255.0f), (int)(blue * 255.0f), alphaInt);
            ++index;
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void startRendering() {
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
    }

    private void stopRendering() {
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void fillDashTextures() {
        this.dashTextures.clear();
        this.dashAnimatedTextures.clear();
        for (int i2 = 1; i2 <= 21; ++i2) {
            this.dashTextures.add(new DashTextureFrame(this, Identifier.of((String)"wonderful", (String)("textures/dashtrail/dashcubics/dashcubic" + i2 + ".png"))));
        }
        for (int group = 1; group <= DASH_ANIMATED_GROUPS.length; ++group) {
            ArrayList<DashTextureFrame> textures = new ArrayList<DashTextureFrame>();
            for (int frame = 1; frame <= DASH_ANIMATED_GROUPS[group - 1]; ++frame) {
                textures.add(new DashTextureFrame(this, Identifier.of((String)"wonderful", (String)("textures/dashtrail/dashcubics/group_dashs/group" + group + "/dashcubic" + frame + ".png"))));
            }
            this.dashAnimatedTextures.add(textures);
        }
    }

    private void updateDashCubics() {
        long now = System.currentTimeMillis();
        Iterator<DashCubic> iterator = this.dashCubics.iterator();
        while (iterator.hasNext()) {
            DashCubic cubic = iterator.next();
            cubic.update();
            if (!(cubic.getProgress(now) >= 1.0f) || !(cubic.alpha <= 0.02f)) continue;
            iterator.remove();
        }
    }

    private void spawnDashCubics() {
        HashSet<Integer> currentPlayers = new HashSet<Integer>();
        for (PlayerEntity player : Trails.mc.world.getPlayers()) {
            if (player == null || !player.isAlive()) continue;
            int playerId = player.getId();
            currentPlayers.add(playerId);
            if (!this.shouldDisplayDashOn(player)) {
                this.lastDashPlayerPositions.put(playerId, player.getPos());
                continue;
            }
            this.spawnDashCubics(player);
        }
        this.lastDashPlayerPositions.keySet().removeIf(id -> !currentPlayers.contains(id));
    }

    private void spawnDashCubics(PlayerEntity player) {
        int playerId = player.getId();
        Vec3d current = player.getPos();
        Vec3d last = this.lastDashPlayerPositions.put(playerId, current);
        if (last == null) {
            return;
        }
        Vec3d motion = current.subtract(last);
        double speedXZ = Math.sqrt(motion.x * motion.x + motion.z * motion.z);
        if (speedXZ < 0.08) {
            return;
        }
        int count = MathHelper.clamp((int)((int)(motion.length() / 0.08)), (int)1, (int)16);
        for (int i2 = 0; i2 < count && this.dashCubics.size() < 96; ++i2) {
            float offset = (float)i2 / (float)count;
            Vec3d spawn = current.subtract(motion.multiply((double)offset)).add(this.randomRange(-0.0875, 0.0875), (double)player.getHeight() * (0.32 + this.random.nextDouble() * 0.28), this.randomRange(-0.0875, 0.0875));
            Vec3d dashMotion = motion.multiply(0.04);
            this.dashCubics.add(new DashCubic(spawn, dashMotion, new DashTexture(this), this.randomDashColor(), this.randomDashTime()));
        }
    }

    private boolean shouldDisplayDashOn(PlayerEntity player) {
        if (player == Trails.mc.player) {
            return this.targets.is("На себе");
        }
        if (this.isFriend(player)) {
            return this.targets.is("На друзьях");
        }
        return this.targets.is("На других");
    }

    private boolean isFriend(PlayerEntity player) {
        return Wonderful.INSTANCE.friendStorage != null && Wonderful.INSTANCE.friendStorage.isFriend(player.getName().getString());
    }

    private int randomDashColor() {
        float brightness = 0.82f + this.random.nextFloat() * 0.18f;
        int base = this.colorMode.is(COLOR_RAINBOW) ? ColorUtils.rainbow(8, this.dashCubics.size() * 24, 0.9f, 1.0f, 1.0f) : ColorUtils.getThemeColor(this.dashCubics.size() * 18);
        int r2 = (int)((float)ColorUtils.red(base) * brightness);
        int g2 = (int)((float)ColorUtils.green(base) * brightness);
        int b2 = (int)((float)ColorUtils.blue(base) * brightness);
        return ColorUtils.getColor(r2, g2, b2, 255);
    }

    private int randomDashTime() {
        return (int)((float)(550 + this.random.nextInt(300)) * this.dashLength.get());
    }

    private double randomRange(double min, double max) {
        return min + this.random.nextDouble() * (max - min);
    }

    private void renderDash(Event3DRender event) {
        if (this.dashCubics.isEmpty()) {
            return;
        }
        Vec3d camera = event.getCamera().getPos();
        MatrixStack matrices = event.getMatrices();
        ArrayList<DashCubic> renderList = new ArrayList<DashCubic>(this.dashCubics);
        RenderSystem.enableBlend();
        RenderSystem.disableCull();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.enableDepthTest();
        RenderSystem.blendFunc((int)770, (int)1);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        this.renderDashSparks(matrices, camera, renderList, event.getTickDelta());
        for (DashCubic cubic : renderList) {
            DashTextureFrame texture = cubic.dashTexture.getFrame();
            this.renderDashQuad(matrices, camera, cubic, event.getTickDelta(), texture);
            if (!this.lighting.isState()) continue;
            this.renderDashBloom(matrices, camera, cubic, event.getTickDelta(), texture);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.defaultBlendFunc();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void renderDashQuad(MatrixStack matrices, Vec3d camera, DashCubic cubic, float tickDelta, DashTextureFrame texture) {
        float progress = cubic.getProgress(System.currentTimeMillis());
        if (cubic.alpha <= 0.01f) {
            return;
        }
        Vec3d pos = cubic.getRenderPos(tickDelta);
        float alpha = MathHelper.clamp((float)(cubic.alpha * Math.max(0.12f, 1.0f - progress * 0.35f)), (float)0.0f, (float)1.0f);
        float scale = 0.033f * alpha * this.dashSize.get();
        float extX = (float)texture.getWidth() * scale;
        float extY = (float)texture.getHeight() * scale;
        int color = ColorUtils.darken(cubic.color, alpha);
        int r2 = color >> 16 & 0xFF;
        int g2 = color >> 8 & 0xFF;
        int b2 = color & 0xFF;
        int a2 = (int)(220.0f * alpha);
        if (a2 <= 0) {
            return;
        }
        RenderSystem.setShaderTexture((int)0, (Identifier)texture.identifier);
        matrices.push();
        matrices.translate(pos.x - camera.x, pos.y - camera.y, pos.z - camera.z);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-Trails.mc.gameRenderer.getCamera().getYaw()));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Trails.mc.gameRenderer.getCamera().getPitch()));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(cubic.rotation));
        matrices.scale(-0.1f, -0.1f, 0.1f);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrix, -extX / 2.0f, -extY / 2.0f, 0.0f).texture(0.0f, 1.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, -extX / 2.0f, extY / 2.0f, 0.0f).texture(0.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, extX / 2.0f, extY / 2.0f, 0.0f).texture(1.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, extX / 2.0f, -extY / 2.0f, 0.0f).texture(1.0f, 1.0f).color(r2, g2, b2, a2);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        matrices.pop();
    }

    private void renderDashBloom(MatrixStack matrices, Vec3d camera, DashCubic cubic, float tickDelta, DashTextureFrame texture) {
        if (cubic.alpha <= 0.01f) {
            return;
        }
        float progress = cubic.getBloomProgress(System.currentTimeMillis());
        float alpha = MathHelper.clamp((float)(cubic.alpha * (1.0f - progress * 0.25f)), (float)0.0f, (float)1.0f);
        float scale = 0.033f * alpha * this.dashSize.get();
        float extX = (float)texture.getWidth() * scale;
        float extY = (float)texture.getHeight() * scale;
        float extXY = (float)Math.sqrt(extX * extX + extY * extY);
        float timeLeft = MathHelper.clamp((float)(1.0f - progress), (float)0.0f, (float)1.0f);
        Vec3d pos = cubic.getRenderPos(tickDelta);
        int color = ColorUtils.darken(cubic.color, 0.75f);
        int r2 = color >> 16 & 0xFF;
        int g2 = color >> 8 & 0xFF;
        int b2 = color & 0xFF;
        int coreAlpha = (int)(55.0f * alpha);
        int glowAlpha = (int)(90.0f * alpha);
        if (coreAlpha <= 0 && glowAlpha <= 0) {
            return;
        }
        RenderSystem.setShaderTexture((int)0, (Identifier)DASH_BLOOM);
        matrices.push();
        matrices.translate(pos.x - camera.x, pos.y - camera.y, pos.z - camera.z);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-Trails.mc.gameRenderer.getCamera().getYaw()));
        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(Trails.mc.gameRenderer.getCamera().getPitch()));
        matrices.scale(-0.1f, -0.1f, 0.1f);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        this.addTexturedDashQuad(buffer, matrix, extXY / 1.75f, r2, g2, b2, coreAlpha);
        this.addTexturedDashQuad(buffer, matrix, extXY * (1.0f + 6.0f * timeLeft * alpha) / 2.0f, r2, g2, b2, glowAlpha);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        matrices.pop();
    }

    private void addTexturedDashQuad(BufferBuilder buffer, Matrix4f matrix, float half, int r2, int g2, int b2, int a2) {
        if (a2 <= 0 || half <= 0.0f) {
            return;
        }
        buffer.vertex(matrix, -half, -half, 0.0f).texture(0.0f, 1.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, -half, half, 0.0f).texture(0.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, half, half, 0.0f).texture(1.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, half, -half, 0.0f).texture(1.0f, 1.0f).color(r2, g2, b2, a2);
    }

    private void renderDashSparks(MatrixStack matrices, Vec3d camera, List<DashCubic> cubics, float tickDelta) {
        long now = System.currentTimeMillis();
        boolean renderSegments = this.hasRenderableSparks(cubics, 80, now);
        boolean renderDots = false;
        if (!renderSegments && !renderDots) {
            return;
        }
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        matrices.push();
        matrices.translate(-camera.x, -camera.y, -camera.z);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        if (renderSegments) {
            BufferBuilder lines = Tessellator.getInstance().begin(VertexFormat.DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
            for (DashCubic cubic : cubics) {
                this.addSparkLines(lines, matrix, cubic, tickDelta, now);
            }
            BufferRenderer.drawWithGlobalProgram((BuiltBuffer)lines.end());
        }
        if (renderDots) {
            BufferBuilder dots = Tessellator.getInstance().begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            for (DashCubic cubic : cubics) {
                this.addSparkDots(dots, matrix, cubic, tickDelta, now);
            }
            BufferRenderer.drawWithGlobalProgram((BuiltBuffer)dots.end());
        }
        matrices.pop();
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
    }

    private boolean hasRenderableSparks(List<DashCubic> cubics, int alphaMultiplier, long now) {
        for (DashCubic cubic : cubics) {
            if (cubic.alpha <= 0.0f) continue;
            for (DashSpark spark : cubic.sparks) {
                if ((int)((float)alphaMultiplier * spark.alpha(now) * cubic.alpha) <= 0) continue;
                return true;
            }
        }
        return false;
    }

    private void addSparkLines(BufferBuilder buffer, Matrix4f matrix, DashCubic cubic, float tickDelta, long now) {
        Vec3d base = cubic.getRenderPos(tickDelta);
        int r2 = cubic.color >> 16 & 0xFF;
        int g2 = cubic.color >> 8 & 0xFF;
        int b2 = cubic.color & 0xFF;
        for (DashSpark spark : cubic.sparks) {
            Vec3d offset = spark.getRenderOffset(tickDelta);
            int alpha = (int)(80.0f * spark.alpha(now) * cubic.alpha);
            if (alpha <= 0) continue;
            Vec3d from = base.add(offset);
            Vec3d to = base.subtract(offset);
            buffer.vertex(matrix, (float)from.x, (float)from.y, (float)from.z).color(r2, g2, b2, alpha);
            buffer.vertex(matrix, (float)to.x, (float)to.y, (float)to.z).color(r2, g2, b2, alpha);
        }
    }

    private void addSparkDots(BufferBuilder buffer, Matrix4f matrix, DashCubic cubic, float tickDelta, long now) {
        Vec3d base = cubic.getRenderPos(tickDelta);
        int r2 = cubic.color >> 16 & 0xFF;
        int g2 = cubic.color >> 8 & 0xFF;
        int b2 = cubic.color & 0xFF;
        Vec3d right = new Vec3d(0.025, 0.0, 0.0);
        Vec3d up = new Vec3d(0.0, 0.025, 0.0);
        for (DashSpark spark : cubic.sparks) {
            int alpha = (int)(130.0f * spark.alpha(now) * cubic.alpha);
            if (alpha <= 0) continue;
            Vec3d offset = spark.getRenderOffset(tickDelta);
            this.addDot(buffer, matrix, base.add(offset), right, up, r2, g2, b2, alpha);
            this.addDot(buffer, matrix, base.subtract(offset), right, up, r2, g2, b2, alpha);
        }
    }

    private void addDot(BufferBuilder buffer, Matrix4f matrix, Vec3d center, Vec3d right, Vec3d up, int r2, int g2, int b2, int a2) {
        Vec3d p1 = center.subtract(right).subtract(up);
        Vec3d p2 = center.subtract(right).add(up);
        Vec3d p3 = center.add(right).add(up);
        Vec3d p4 = center.add(right).subtract(up);
        buffer.vertex(matrix, (float)p1.x, (float)p1.y, (float)p1.z).color(r2, g2, b2, a2);
        buffer.vertex(matrix, (float)p2.x, (float)p2.y, (float)p2.z).color(r2, g2, b2, a2);
        buffer.vertex(matrix, (float)p3.x, (float)p3.y, (float)p3.z).color(r2, g2, b2, a2);
        buffer.vertex(matrix, (float)p4.x, (float)p4.y, (float)p4.z).color(r2, g2, b2, a2);
    }

    private static class Point {
        public Vec3d pos;
        public long time;

        public Point(Vec3d pos) {
            this.pos = pos;
            this.time = System.currentTimeMillis();
        }
    }

    private class DashTextureFrame {
        private final Identifier identifier;
        private int width = 64;
        private int height = 64;
        private boolean loaded;

        private DashTextureFrame(Trails trails, Identifier identifier) {
            this.identifier = identifier;
        }

        private int getWidth() {
            this.loadSize();
            return this.width;
        }

        private int getHeight() {
            this.loadSize();
            return this.height;
        }

        private void loadSize() {
            if (this.loaded) {
                return;
            }
            this.loaded = true;
            try (InputStream stream = QClient.mc.getResourceManager().open(this.identifier);){
                BufferedImage image = ImageIO.read(stream);
                if (image != null) {
                    this.width = Math.max(1, image.getWidth());
                    this.height = Math.max(1, image.getHeight());
                }
            }
            catch (Exception ignored) {
                this.width = 64;
                this.height = 64;
            }
        }
    }

    private class DashCubic {
        private Vec3d pos;
        private Vec3d prevPos;
        private Vec3d motion;
        private final long startTime = System.currentTimeMillis();
        private final int lifeTime;
        private final DashTexture dashTexture;
        private final int color;
        private final float rotation;
        private final List<DashSpark> sparks = new ArrayList<DashSpark>();
        private float alpha;

        private DashCubic(Vec3d pos, Vec3d motion, DashTexture dashTexture, int color, int lifeTime) {
            this.pos = pos;
            this.prevPos = pos;
            this.motion = motion;
            this.dashTexture = dashTexture;
            this.color = color;
            this.lifeTime = lifeTime;
            this.rotation = this.getMotionYaw(motion) - 60.0f + Trails.this.random.nextFloat() * 30.0f;
            this.alpha = 0.0f;
        }

        private void update() {
            this.prevPos = this.pos;
            this.motion = this.motion.multiply(0.9523809523809523);
            this.pos = this.pos.add(this.motion.multiply(5.0, this.motion.y < 0.0 ? 5.0 : 1.45, 5.0));
            this.alpha = MathHelper.clamp((float)(this.alpha + 0.08f), (float)0.0f, (float)1.0f);
            if (this.getProgress(System.currentTimeMillis()) >= 1.0f) {
                this.alpha = Math.max(0.0f, this.alpha - 0.16f);
            }
            if (this.getProgress(System.currentTimeMillis()) < 0.3f && this.sparks.size() < 6 && Trails.this.random.nextInt(12) > 5) {
                this.sparks.add(new DashSpark());
            }
            this.sparks.forEach(DashSpark::update);
            this.sparks.removeIf(DashSpark::isDead);
        }

        private Vec3d getRenderPos(float tickDelta) {
            return new Vec3d(MathHelper.lerp((double)tickDelta, (double)this.prevPos.x, (double)this.pos.x), MathHelper.lerp((double)tickDelta, (double)this.prevPos.y, (double)this.pos.y), MathHelper.lerp((double)tickDelta, (double)this.prevPos.z, (double)this.pos.z));
        }

        private float getProgress(long now) {
            return MathHelper.clamp((float)((float)(now - this.startTime) / (float)this.lifeTime), (float)0.0f, (float)1.0f);
        }

        private float getBloomProgress(long now) {
            return MathHelper.clamp((float)((float)(now - this.startTime) / 650.0f), (float)0.0f, (float)1.0f);
        }

        private float getMotionYaw(Vec3d motion) {
            float yaw = (float)Math.toDegrees(Math.atan2(motion.z, motion.x) - 1.5707963267948966);
            return yaw < 0.0f ? yaw + 360.0f : yaw;
        }
    }

    private class DashTexture {
        private final List<DashTextureFrame> frames;
        private final boolean animated;
        private final long startTime = System.currentTimeMillis();
        private final long animationTime;

        private DashTexture(Trails trails) {
            boolean bl = this.animated = !trails.dashAnimatedTextures.isEmpty() && trails.random.nextInt(100) > 40;
            if (this.animated) {
                this.frames = trails.dashAnimatedTextures.get(trails.random.nextInt(trails.dashAnimatedTextures.size()));
                this.animationTime = trails.randomDashTime();
            } else {
                this.frames = List.of(trails.dashTextures.get(trails.random.nextInt(trails.dashTextures.size())));
                this.animationTime = 1L;
            }
        }

        private DashTextureFrame getFrame() {
            if (!this.animated || this.frames.size() <= 1) {
                return this.frames.get(0);
            }
            long elapsed = (System.currentTimeMillis() - this.startTime) % this.animationTime;
            float progress = (float)elapsed / (float)this.animationTime;
            int index = MathHelper.clamp((int)((int)(progress * (float)this.frames.size())), (int)0, (int)(this.frames.size() - 1));
            return this.frames.get(index);
        }
    }

    private class DashSpark {
        private Vec3d offset = Vec3d.ZERO;
        private Vec3d prevOffset = Vec3d.ZERO;
        private final double speed;
        private final double yaw;
        private final double pitch;
        private final long startTime;

        private DashSpark() {
            this.speed = Trails.this.random.nextDouble() / 50.0;
            this.yaw = Math.toRadians(Trails.this.random.nextDouble() * 360.0);
            this.pitch = Math.toRadians(-90.0 + Trails.this.random.nextDouble() * 180.0);
            this.startTime = System.currentTimeMillis();
        }

        private void update() {
            this.prevOffset = this.offset;
            this.offset = this.offset.add(Math.sin(this.yaw) * this.speed, Math.cos(this.pitch - 1.5707963267948966) * this.speed, Math.cos(this.yaw) * this.speed);
        }

        private Vec3d getRenderOffset(float tickDelta) {
            return new Vec3d(MathHelper.lerp((double)tickDelta, (double)this.prevOffset.x, (double)this.offset.x), MathHelper.lerp((double)tickDelta, (double)this.prevOffset.y, (double)this.offset.y), MathHelper.lerp((double)tickDelta, (double)this.prevOffset.z, (double)this.offset.z));
        }

        private float alpha() {
            return this.alpha(System.currentTimeMillis());
        }

        private float alpha(long now) {
            return 1.0f - MathHelper.clamp((float)((float)(now - this.startTime) / 1000.0f), (float)0.0f, (float)1.0f);
        }

        private boolean isDead() {
            return this.alpha() <= 0.0f;
        }
    }
}