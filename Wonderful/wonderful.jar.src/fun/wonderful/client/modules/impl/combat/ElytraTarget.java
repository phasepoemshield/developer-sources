package fun.wonderful.client.modules.impl.combat;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.combat.PredictUtils;
import fun.wonderful.api.utils.math.Timer;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.combat.Aura;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import lombok.Generated;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;
import ru.ocz.protection.annotation.Compile;

public class ElytraTarget
extends Module {
    private static final float ELYTRA_FORWARD = 2.2f;
    public static ElytraTarget INSTANCE = new ElytraTarget();
    private static final Identifier GLOW_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/trajectories/glow.png");
    private static final float BOX_GLOW_OUTER_THICKNESS = 0.17f;
    private static final float BOX_GLOW_MID_THICKNESS = 0.13f;
    private static final float BOX_GLOW_CORE_THICKNESS = 0.11f;
    private static final float BOX_GLOW_LINE_U = 0.4f;
    private static final int[][] BOX_EDGES = new int[][]{{0, 2}, {2, 6}, {6, 4}, {4, 0}, {1, 3}, {3, 7}, {7, 5}, {5, 1}, {0, 1}, {2, 3}, {6, 7}, {4, 5}};
    public final BooleanSetting prediction = new BooleanSetting("Перегонять", true);
    public final FloatSetting pursuitDistance = new FloatSetting("Дистанция преследования", 30.0f, 10.0f, 100.0f, 5.0f);
    public final ModeSetting predictMode = new ModeSetting("Режим предикта", "Reallyworld", "Reallyworld", "Default");
    public final FloatSetting distance = new FloatSetting("Дистанция Перегона", 3.0f, 1.0f, 10.0f, 0.5f);
    private final BooleanSetting full = new BooleanSetting("Фулл", false);
    private final BooleanSetting xorys = new BooleanSetting("Авто хорус", false);
    private final BooleanSetting box = new BooleanSetting("Рендерить Бокс", false);
    private final ModeSetting targetMode = new ModeSetting("Цель в", "Обычная", "Обычная", "Ноги");
    boolean non = false;
    int lastslot = 0;
    public boolean isEating;
    public boolean status = true;
    public boolean disableForward = false;
    private final Timer hurtTimer = Timer.create();
    private double bps;
    public double scale;
    private Box smoothedPredictionBox;
    private LivingEntity smoothedTarget;

    public ElytraTarget() {
        super("Elytra Target", "Таргет на элитрах", Module.ModuleCategory.MOVEMENT);
        this.addSettings(this.prediction, this.pursuitDistance, this.predictMode, this.distance, this.full, this.xorys, this.box, this.targetMode);
    }

    @EventLink
    @Compile
    public native void onEvent(EventUpdate var1);

    @EventLink
    public void onRender3D(Event3DRender event) {
        if (ElytraTarget.mc.player == null || ElytraTarget.mc.world == null || !this.box.isState()) {
            this.resetPredictionSmoothing();
            return;
        }
        if (!ElytraTarget.mc.player.isGliding()) {
            this.resetPredictionSmoothing();
            return;
        }
        Aura aura = ModuleClass.aura;
        if (aura == null || !aura.isEnable()) {
            this.resetPredictionSmoothing();
            return;
        }
        LivingEntity target = aura.getTarget();
        if (target == null || !target.isAlive() || !target.isGliding()) {
            this.resetPredictionSmoothing();
            return;
        }
        Box predictedBox = this.buildPredictedBox(target);
        this.renderPredictionBox(event, this.smoothPredictionBox(target, predictedBox));
    }

    private double getTargetBps(LivingEntity target) {
        double x2 = target.getX() - target.prevX;
        double y2 = target.getY() - target.prevY;
        double z2 = target.getZ() - target.prevZ;
        return Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2) * 20.0;
    }

    private void useItem() {
        ElytraTarget.mc.player.getInventory().selectedSlot = this.getSlotInInventoryOrHotbar(Items.CHORUS_FRUIT, true);
    }

    private void startEating() {
        if (!ElytraTarget.mc.options.useKey.isPressed()) {
            ElytraTarget.mc.options.useKey.setPressed(true);
            this.isEating = true;
        }
    }

    private void stopEating() {
        ElytraTarget.mc.options.useKey.setPressed(false);
        this.isEating = false;
    }

    public int getSlotInInventoryOrHotbar(Item item, boolean inHotBar) {
        int firstSlot = inHotBar ? 0 : 9;
        int lastSlot = inHotBar ? 9 : 36;
        int finalSlot = -1;
        for (int i2 = firstSlot; i2 < lastSlot; ++i2) {
            if (ElytraTarget.mc.player.getInventory().getStack(i2).getItem() != item) continue;
            finalSlot = i2;
        }
        return finalSlot;
    }

    public static boolean doesHotbarHaveItem(Item item) {
        MinecraftClient mc = MinecraftClient.getInstance();
        for (int i2 = 0; i2 < 9; ++i2) {
            if (mc.player.getInventory().getStack(i2).getItem() != item) continue;
            return true;
        }
        return false;
    }

    public double getPrediction(Entity target) {
        return this.scale;
    }

    public float getElytraForward() {
        return 2.2f;
    }

    public boolean shouldTarget(LivingEntity livingEntity) {
        if (!this.isEnable() || livingEntity == null || this.disableForward) {
            return false;
        }
        boolean isTargetValid = livingEntity.isGliding();
        return ElytraTarget.mc.player != null && this.status && ElytraTarget.mc.player.isGliding() && isTargetValid;
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.resetPredictionSmoothing();
        this.disableForward = false;
        this.status = false;
        this.bps = 0.0;
        this.scale = 0.0;
    }

    private Box smoothPredictionBox(LivingEntity target, Box predictedBox) {
        if (this.smoothedPredictionBox == null || this.smoothedTarget != target || this.smoothedPredictionBox.getCenter().squaredDistanceTo(predictedBox.getCenter()) > 144.0) {
            this.smoothedPredictionBox = predictedBox;
            this.smoothedTarget = target;
            return predictedBox;
        }
        double distance = Math.sqrt(this.smoothedPredictionBox.getCenter().squaredDistanceTo(predictedBox.getCenter()));
        double smoothFactor = MathHelper.clamp((double)(0.08 + distance * 0.035), (double)0.08, (double)0.18);
        this.smoothedPredictionBox = this.lerpBox(this.smoothedPredictionBox, predictedBox, smoothFactor);
        return this.smoothedPredictionBox;
    }

    private void resetPredictionSmoothing() {
        this.smoothedPredictionBox = null;
        this.smoothedTarget = null;
    }

    private Box buildPredictedBox(LivingEntity target) {
        Box currentBox = target.getBoundingBox();
        Vec3d lastAim = PredictUtils.getLastAimWorldPoint();
        if (!lastAim.equals((Object)Vec3d.ZERO)) {
            Vec3d offset = lastAim.subtract(currentBox.getCenter());
            return currentBox.offset(offset);
        }
        Vec3d predictedCenter = PredictUtils.predict(target, currentBox.getCenter(), Math.max(0, (int)this.getElytraForward()));
        Vec3d offset = predictedCenter.subtract(currentBox.getCenter());
        return currentBox.offset(offset);
    }

    private Box lerpBox(Box from, Box to, double factor) {
        return new Box(MathHelper.lerp((double)factor, (double)from.minX, (double)to.minX), MathHelper.lerp((double)factor, (double)from.minY, (double)to.minY), MathHelper.lerp((double)factor, (double)from.minZ, (double)to.minZ), MathHelper.lerp((double)factor, (double)from.maxX, (double)to.maxX), MathHelper.lerp((double)factor, (double)from.maxY, (double)to.maxY), MathHelper.lerp((double)factor, (double)from.maxZ, (double)to.maxZ));
    }

    private void renderPredictionBox(Event3DRender event, Box box) {
        MatrixStack matrices = event.getMatrices();
        Camera camera = event.getCamera();
        Vec3d cameraPos = camera.getPos();
        int themeColor = ColorUtils.getThemeColor();
        int outerColor = ColorUtils.setAlphaColor(themeColor, 118);
        int midColor = ColorUtils.setAlphaColor(ColorUtils.interpolateColor(themeColor, -1, 0.24f), 210);
        int coreColor = ColorUtils.setAlphaColor(ColorUtils.interpolateColor(themeColor, -1, 0.6f), 255);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((int)770, (int)1);
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShaderTexture((int)0, (Identifier)GLOW_TEXTURE);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder quads = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        this.addGlowBox(quads, matrix, cameraPos, box, outerColor, 0.17f);
        this.addGlowBox(quads, matrix, cameraPos, box, midColor, 0.13f);
        this.addGlowBox(quads, matrix, cameraPos, box, coreColor, 0.11f);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)quads.end());
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.defaultBlendFunc();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
    }

    private void addGlowBox(BufferBuilder buffer, Matrix4f matrix, Vec3d camera, Box box, int color, float thickness) {
        Vec3d[] corners = this.getBoxVectors(box);
        for (int[] edge : BOX_EDGES) {
            this.addGlowEdge(buffer, matrix, camera, corners[edge[0]], corners[edge[1]], color, thickness);
        }
    }

    private void addGlowEdge(BufferBuilder buffer, Matrix4f matrix, Vec3d camera, Vec3d start, Vec3d end, int color, float thickness) {
        Vec3d side;
        Vec3d edge = end.subtract(start);
        if (edge.lengthSquared() <= 1.0E-6) {
            return;
        }
        Vec3d direction = edge.normalize();
        double overlap = thickness * 0.22f;
        start = start.subtract(direction.multiply(overlap));
        end = end.add(direction.multiply(overlap));
        edge = end.subtract(start);
        Vec3d center = start.add(end).multiply(0.5);
        Vec3d toCamera = camera.subtract(center);
        if (toCamera.lengthSquared() <= 1.0E-6) {
            toCamera = new Vec3d(0.0, 1.0, 0.0);
        }
        if ((side = edge.crossProduct(toCamera)).lengthSquared() <= 1.0E-6 && (side = edge.crossProduct(new Vec3d(0.0, 1.0, 0.0))).lengthSquared() <= 1.0E-6) {
            side = edge.crossProduct(new Vec3d(1.0, 0.0, 0.0));
        }
        side = side.normalize().multiply((double)(thickness * 0.48f));
        Vec3d p1 = start.add(side).subtract(camera);
        Vec3d p2 = start.subtract(side).subtract(camera);
        Vec3d p3 = end.subtract(side).subtract(camera);
        Vec3d p4 = end.add(side).subtract(camera);
        float[] rgba = ColorUtils.rgba(color);
        buffer.vertex(matrix, (float)p1.x, (float)p1.y, (float)p1.z).texture(0.4f, 0.0f).color(rgba[0], rgba[1], rgba[2], rgba[3]);
        buffer.vertex(matrix, (float)p2.x, (float)p2.y, (float)p2.z).texture(0.4f, 1.0f).color(rgba[0], rgba[1], rgba[2], rgba[3]);
        buffer.vertex(matrix, (float)p3.x, (float)p3.y, (float)p3.z).texture(0.4f, 1.0f).color(rgba[0], rgba[1], rgba[2], rgba[3]);
        buffer.vertex(matrix, (float)p4.x, (float)p4.y, (float)p4.z).texture(0.4f, 0.0f).color(rgba[0], rgba[1], rgba[2], rgba[3]);
    }

    private Vec3d[] getBoxVectors(Box box) {
        return new Vec3d[]{new Vec3d(box.minX, box.minY, box.minZ), new Vec3d(box.minX, box.maxY, box.minZ), new Vec3d(box.maxX, box.minY, box.minZ), new Vec3d(box.maxX, box.maxY, box.minZ), new Vec3d(box.minX, box.minY, box.maxZ), new Vec3d(box.minX, box.maxY, box.maxZ), new Vec3d(box.maxX, box.minY, box.maxZ), new Vec3d(box.maxX, box.maxY, box.maxZ)};
    }

    @Generated
    public BooleanSetting getPrediction() {
        return this.prediction;
    }

    @Generated
    public FloatSetting getPursuitDistance() {
        return this.pursuitDistance;
    }

    @Generated
    public ModeSetting getPredictMode() {
        return this.predictMode;
    }

    @Generated
    public FloatSetting getDistance() {
        return this.distance;
    }

    @Generated
    public BooleanSetting getFull() {
        return this.full;
    }

    @Generated
    public BooleanSetting getXorys() {
        return this.xorys;
    }

    @Generated
    public BooleanSetting getBox() {
        return this.box;
    }

    @Generated
    public ModeSetting getTargetMode() {
        return this.targetMode;
    }

    @Generated
    public boolean isNon() {
        return this.non;
    }

    @Generated
    public int getLastslot() {
        return this.lastslot;
    }

    @Generated
    public boolean isEating() {
        return this.isEating;
    }

    @Generated
    public boolean isStatus() {
        return this.status;
    }

    @Generated
    public boolean isDisableForward() {
        return this.disableForward;
    }

    @Generated
    public Timer getHurtTimer() {
        return this.hurtTimer;
    }

    @Generated
    public double getBps() {
        return this.bps;
    }

    @Generated
    public double getScale() {
        return this.scale;
    }

    @Generated
    public Box getSmoothedPredictionBox() {
        return this.smoothedPredictionBox;
    }

    @Generated
    public LivingEntity getSmoothedTarget() {
        return this.smoothedTarget;
    }
}