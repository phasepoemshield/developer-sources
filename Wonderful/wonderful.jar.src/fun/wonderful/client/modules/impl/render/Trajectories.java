package fun.wonderful.client.modules.impl.render;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.Event3DRender;
import fun.wonderful.api.utils.color.ColorUtils;
import fun.wonderful.api.utils.player.InventoryUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import java.util.Optional;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.TridentItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.render.BuiltBuffer;
import org.joml.Matrix4f;

public class Trajectories
extends Module {
    public static Trajectories INSTANCE = new Trajectories();
    private static final int MAX_STEPS = 440;
    private static final double SIMULATION_STEP = 0.5;
    private static final double SPLASH_RADIUS = 4.0;
    private static final Identifier GLOW_TEXTURE = Identifier.of((String)"wonderful", (String)"textures/trajectories/glow.png");
    private final FloatSetting lineWidth = new FloatSetting("Ширина линии", 2.2f, 0.5f, 5.0f, 0.1f);

    public Trajectories() {
        super("Trajectories", "Показывает траекторию предмета в руке", Module.ModuleCategory.RENDER);
        this.addSettings(this.lineWidth);
    }

    @EventLink
    public void onRender3D(Event3DRender event) {
        if (Trajectories.mc.player == null || Trajectories.mc.world == null) {
            return;
        }
        ItemStack stack = this.getHeldProjectileStack();
        if (stack.isEmpty()) {
            return;
        }
        ProjectileParams params = this.getParams(stack);
        if (params == null) {
            return;
        }
        float tickDelta = event.getTickDelta();
        Vec3d startPos = Trajectories.mc.player.getCameraPosVec(tickDelta);
        Vec3d[] directions = this.getShotDirections(stack, tickDelta);
        PredictionResult[] results = new PredictionResult[directions.length];
        int resultCount = 0;
        for (Vec3d direction : directions) {
            PredictionResult result = this.predict((PlayerEntity)Trajectories.mc.player, params, startPos, direction);
            if (result == null || result.points.length < 2) continue;
            results[resultCount++] = result;
        }
        if (resultCount == 0) {
            return;
        }
        MatrixStack matrices = event.getMatrices();
        Camera camera = event.getCamera();
        Vec3d cameraPos = camera.getPos();
        int themeColor = ColorUtils.getThemeColor();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
        RenderSystem.lineWidth((float)this.lineWidth.getValue().floatValue());
        matrices.push();
        matrices.translate(-cameraPos.x, -cameraPos.y, -cameraPos.z);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        for (int i2 = 0; i2 < resultCount; ++i2) {
            PredictionResult result = results[i2];
            this.drawTrajectoryLine(matrix, result.points, ColorUtils.setAlphaColor(themeColor, 190));
            if (result.entityHit != null && result.entityHit.isAlive()) {
                this.drawEntityBox(matrix, result.entityHit, ColorUtils.rgba(255, 70, 70, 210));
            } else if (result.blockHit != null) {
                this.drawImpactMarker(matrix, result.hitPos, result.blockHit.getSide(), ColorUtils.setAlphaColor(themeColor, 230));
            }
            if (!stack.isOf(Items.SPLASH_POTION) || result.hitPos == null) continue;
            this.drawPotionRadiusGlow(matrices, result.hitPos, themeColor);
        }
        matrices.pop();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableCull();
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    }

    private ItemStack getHeldProjectileStack() {
        ItemStack main = Trajectories.mc.player.getMainHandStack();
        if (!main.isEmpty() && this.getParams(main) != null) {
            return main;
        }
        ItemStack off = Trajectories.mc.player.getOffHandStack();
        if (!off.isEmpty() && this.getParams(off) != null) {
            return off;
        }
        return ItemStack.EMPTY;
    }

    private ProjectileParams getParams(ItemStack stack) {
        Item item = stack.getItem();
        if (item == Items.ENDER_PEARL || item == Items.SNOWBALL || item == Items.EGG) {
            return new ProjectileParams(1.5, 0.03, 0.99);
        }
        if (item == Items.SPLASH_POTION || item == Items.LINGERING_POTION) {
            return new ProjectileParams(0.5, 0.05, 0.99);
        }
        if (item instanceof BowItem) {
            double velocity;
            float power = 1.0f;
            if (Trajectories.mc.player.isUsingItem() && Trajectories.mc.player.getActiveItem() == stack) {
                float use = Trajectories.mc.player.getItemUseTime();
                float f2 = use / 20.0f;
                f2 = (f2 * f2 + f2 * 2.0f) / 3.0f;
                power = Math.min(f2, 1.0f);
            }
            return (velocity = 3.0 * (double)power) <= 0.01 ? null : new ProjectileParams(velocity, 0.05, 0.99);
        }
        if (item instanceof CrossbowItem) {
            if (!CrossbowItem.isCharged((ItemStack)stack)) {
                return null;
            }
            return new ProjectileParams(3.15, 0.05, 0.99);
        }
        if (item instanceof TridentItem) {
            return new ProjectileParams(2.5, 0.05, 0.99);
        }
        return null;
    }

    private Vec3d[] getShotDirections(ItemStack stack, float tickDelta) {
        Vec3d baseDir = Trajectories.mc.player.getRotationVec(tickDelta).normalize();
        if (!(stack.getItem() instanceof CrossbowItem) || InventoryUtils.getEnchantmentLevel(stack, (RegistryKey<Enchantment>)Enchantments.MULTISHOT) <= 0) {
            return new Vec3d[]{baseDir};
        }
        float baseYaw = (float)(MathHelper.atan2((double)baseDir.z, (double)baseDir.x) * 57.29577951308232) - 90.0f;
        float basePitch = (float)(-(MathHelper.atan2((double)baseDir.y, (double)MathHelper.sqrt((float)((float)(baseDir.x * baseDir.x + baseDir.z * baseDir.z)))) * 57.29577951308232));
        return new Vec3d[]{this.getDirectionFromYawPitch(baseYaw - 10.0f, basePitch), baseDir, this.getDirectionFromYawPitch(baseYaw + 10.0f, basePitch)};
    }

    private Vec3d getDirectionFromYawPitch(float yawDeg, float pitchDeg) {
        float yaw = yawDeg * ((float)Math.PI / 180);
        float pitch = pitchDeg * ((float)Math.PI / 180);
        float x2 = MathHelper.sin((float)(-yaw - (float)Math.PI)) * -MathHelper.cos((float)(-pitch));
        float y2 = MathHelper.sin((float)(-pitch));
        float z2 = MathHelper.cos((float)(-yaw - (float)Math.PI)) * -MathHelper.cos((float)(-pitch));
        return new Vec3d((double)x2, (double)y2, (double)z2).normalize();
    }

    private PredictionResult predict(PlayerEntity player, ProjectileParams params, Vec3d startPos, Vec3d direction) {
        Vec3d pos = startPos;
        Vec3d motion = direction.normalize().multiply(params.velocity);
        Vec3d[] points = new Vec3d[441];
        int count = 0;
        points[count++] = pos;
        Entity entityHit = null;
        Vec3d entityHitPos = null;
        for (int i2 = 0; i2 < 440; ++i2) {
            BlockHitResult blockHit;
            EntityHit hit;
            Vec3d prev = pos;
            Vec3d next = pos.add(motion.multiply(0.5));
            if (entityHit == null && (hit = this.rayTraceEntities(prev, next, (Entity)player)) != null) {
                entityHit = hit.entity;
                entityHitPos = hit.hitPos;
            }
            if ((blockHit = Trajectories.mc.world.raycast(new RaycastContext(prev, next, RaycastContext.class_3960.COLLIDER, RaycastContext.class_242.NONE, (Entity)player))).getType() == HitResult.class_240.BLOCK) {
                points[count++] = blockHit.getPos();
                return new PredictionResult(this.copyPoints(points, count), blockHit, blockHit.getPos(), entityHit, entityHitPos);
            }
            points[count++] = next;
            pos = next;
            boolean inWater = Trajectories.mc.world.getBlockState(BlockPos.ofFloored((Position)pos)).isOf(Blocks.WATER);
            double drag = Math.pow(inWater ? 0.8 : params.drag, 0.5);
            motion = motion.multiply(drag).subtract(0.0, params.gravity * 0.5, 0.0);
            if (pos.y <= (double)Trajectories.mc.world.getBottomY()) break;
        }
        Vec3d hitPos = entityHitPos != null ? entityHitPos : points[count - 1];
        return new PredictionResult(this.copyPoints(points, count), null, hitPos, entityHit, entityHitPos);
    }

    private Vec3d[] copyPoints(Vec3d[] points, int count) {
        Vec3d[] out = new Vec3d[count];
        System.arraycopy(points, 0, out, 0, count);
        return out;
    }

    private EntityHit rayTraceEntities(Vec3d from, Vec3d to, Entity owner) {
        Box search = new Box(from, to).expand(1.0);
        Entity closest = null;
        Vec3d closestHit = null;
        double closestDistance = Double.MAX_VALUE;
        for (Entity entity2 : Trajectories.mc.world.getOtherEntities(owner, search, entity -> entity != null && entity.isAlive() && entity.canHit())) {
            double distance;
            Optional hit = entity2.getBoundingBox().expand(0.3).raycast(from, to);
            if (hit.isEmpty() || !((distance = from.squaredDistanceTo((Vec3d)hit.get())) < closestDistance)) continue;
            closestDistance = distance;
            closest = entity2;
            closestHit = (Vec3d)hit.get();
        }
        return closest == null ? null : new EntityHit(closest, closestHit);
    }

    private void drawTrajectoryLine(Matrix4f matrix, Vec3d[] points, int color) {
        int r2 = color >> 16 & 0xFF;
        int g2 = color >> 8 & 0xFF;
        int b2 = color & 0xFF;
        int a2 = color >> 24 & 0xFF;
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.DEBUG_LINES, VertexFormats.POSITION_COLOR);
        for (int i2 = 0; i2 < points.length - 1; ++i2) {
            Vec3d start = points[i2];
            Vec3d end = points[i2 + 1];
            buffer.vertex(matrix, (float)start.x, (float)start.y, (float)start.z).color(r2, g2, b2, a2);
            buffer.vertex(matrix, (float)end.x, (float)end.y, (float)end.z).color(r2, g2, b2, a2);
        }
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void drawImpactMarker(Matrix4f matrix, Vec3d pos, Direction side, int color) {
        Vec3d normal = Vec3d.of((Vec3i)side.getVector()).normalize();
        Vec3d u2 = side == Direction.UP || side == Direction.DOWN ? new Vec3d(1.0, 0.0, 0.0) : normal.crossProduct(new Vec3d(0.0, 1.0, 0.0)).normalize();
        Vec3d v2 = normal.crossProduct(u2).normalize();
        Vec3d center = pos.add(normal.multiply(0.004));
        double radius = 0.35;
        int r2 = color >> 16 & 0xFF;
        int g2 = color >> 8 & 0xFF;
        int b2 = color & 0xFF;
        int a2 = color >> 24 & 0xFF;
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.DEBUG_LINES, VertexFormats.POSITION_COLOR);
        int segments = 48;
        Vec3d previous = null;
        for (int i2 = 0; i2 <= segments; ++i2) {
            double angle = Math.PI * 2 * (double)i2 / (double)segments;
            Vec3d point = center.add(u2.multiply(Math.cos(angle) * radius)).add(v2.multiply(Math.sin(angle) * radius));
            if (previous != null) {
                buffer.vertex(matrix, (float)previous.x, (float)previous.y, (float)previous.z).color(r2, g2, b2, a2);
                buffer.vertex(matrix, (float)point.x, (float)point.y, (float)point.z).color(r2, g2, b2, a2);
            }
            previous = point;
        }
        Vec3d left = center.add(u2.multiply(-radius));
        Vec3d right = center.add(u2.multiply(radius));
        Vec3d down = center.add(v2.multiply(-radius));
        Vec3d up = center.add(v2.multiply(radius));
        buffer.vertex(matrix, (float)left.x, (float)left.y, (float)left.z).color(r2, g2, b2, a2);
        buffer.vertex(matrix, (float)right.x, (float)right.y, (float)right.z).color(r2, g2, b2, a2);
        buffer.vertex(matrix, (float)down.x, (float)down.y, (float)down.z).color(r2, g2, b2, a2);
        buffer.vertex(matrix, (float)up.x, (float)up.y, (float)up.z).color(r2, g2, b2, a2);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void drawEntityBox(Matrix4f matrix, Entity entity, int color) {
        Box box = entity.getBoundingBox();
        int r2 = color >> 16 & 0xFF;
        int g2 = color >> 8 & 0xFF;
        int b2 = color & 0xFF;
        int a2 = color >> 24 & 0xFF;
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.DEBUG_LINES, VertexFormats.POSITION_COLOR);
        this.vertexBox(buffer, matrix, box, r2, g2, b2, a2);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
    }

    private void vertexBox(BufferBuilder buffer, Matrix4f matrix, Box box, int r2, int g2, int b2, int a2) {
        float minX = (float)box.minX;
        float minY = (float)box.minY;
        float minZ = (float)box.minZ;
        float maxX = (float)box.maxX;
        float maxY = (float)box.maxY;
        float maxZ = (float)box.maxZ;
        this.line(buffer, matrix, minX, minY, minZ, maxX, minY, minZ, r2, g2, b2, a2);
        this.line(buffer, matrix, maxX, minY, minZ, maxX, minY, maxZ, r2, g2, b2, a2);
        this.line(buffer, matrix, maxX, minY, maxZ, minX, minY, maxZ, r2, g2, b2, a2);
        this.line(buffer, matrix, minX, minY, maxZ, minX, minY, minZ, r2, g2, b2, a2);
        this.line(buffer, matrix, minX, maxY, minZ, maxX, maxY, minZ, r2, g2, b2, a2);
        this.line(buffer, matrix, maxX, maxY, minZ, maxX, maxY, maxZ, r2, g2, b2, a2);
        this.line(buffer, matrix, maxX, maxY, maxZ, minX, maxY, maxZ, r2, g2, b2, a2);
        this.line(buffer, matrix, minX, maxY, maxZ, minX, maxY, minZ, r2, g2, b2, a2);
        this.line(buffer, matrix, minX, minY, minZ, minX, maxY, minZ, r2, g2, b2, a2);
        this.line(buffer, matrix, maxX, minY, minZ, maxX, maxY, minZ, r2, g2, b2, a2);
        this.line(buffer, matrix, maxX, minY, maxZ, maxX, maxY, maxZ, r2, g2, b2, a2);
        this.line(buffer, matrix, minX, minY, maxZ, minX, maxY, maxZ, r2, g2, b2, a2);
    }

    private void line(BufferBuilder buffer, Matrix4f matrix, float x1, float y1, float z1, float x2, float y2, float z2, int r2, int g2, int b2, int a2) {
        buffer.vertex(matrix, x1, y1, z1).color(r2, g2, b2, a2);
        buffer.vertex(matrix, x2, y2, z2).color(r2, g2, b2, a2);
    }

    private void drawPotionRadiusGlow(MatrixStack matrices, Vec3d pos, int themeColor) {
        int color = ColorUtils.setAlphaColor(themeColor, 82);
        int r2 = color >> 16 & 0xFF;
        int g2 = color >> 8 & 0xFF;
        int b2 = color & 0xFF;
        int a2 = color >> 24 & 0xFF;
        float radius = 4.0f;
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_TEX_COLOR);
        RenderSystem.setShaderTexture((int)0, (Identifier)GLOW_TEXTURE);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        matrices.push();
        matrices.translate(pos.x, pos.y + 0.012, pos.z);
        Matrix4f matrix = matrices.peek().getPositionMatrix();
        BufferBuilder buffer = Tessellator.getInstance().begin(VertexFormat.class_5596.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
        buffer.vertex(matrix, -radius, 0.0f, -radius).texture(0.0f, 0.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, -radius, 0.0f, radius).texture(0.0f, 1.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, radius, 0.0f, radius).texture(1.0f, 1.0f).color(r2, g2, b2, a2);
        buffer.vertex(matrix, radius, 0.0f, -radius).texture(1.0f, 0.0f).color(r2, g2, b2, a2);
        BufferRenderer.drawWithGlobalProgram((BuiltBuffer)buffer.end());
        matrices.pop();
        RenderSystem.setShaderTexture((int)0, (int)0);
        RenderSystem.setShader((ShaderProgramKey)ShaderProgramKeys.POSITION_COLOR);
    }

    private record ProjectileParams(double velocity, double gravity, double drag) {
    }

    private record PredictionResult(Vec3d[] points, BlockHitResult blockHit, Vec3d hitPos, Entity entityHit, Vec3d entityHitPos) {
    }

    private record EntityHit(Entity entity, Vec3d hitPos) {
    }
}