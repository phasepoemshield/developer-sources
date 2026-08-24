/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.PlantBlock
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.VertexConsumer
 *  net.minecraft.client.render.VertexConsumerProvider
 *  net.minecraft.client.render.VertexConsumerProvider$Immediate
 *  net.minecraft.client.util.BufferAllocator
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.client.util.math.MatrixStack$Entry
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.BlockView
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.HitWavesModule;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001]B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001f\u0010 J'\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b(\u0010)JG\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002\u00a2\u0006\u0004\b5\u00106JO\u00108\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00107\u001a\u00020\u00102\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002\u00a2\u0006\u0004\b8\u00109Jo\u0010@\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00102\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002\u00a2\u0006\u0004\b@\u0010AJW\u0010G\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u00102\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u000200H\u0002\u00a2\u0006\u0004\bG\u0010HR\u0014\u0010I\u001a\u0002008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010O\u001a\u00020\u00108\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bO\u0010LR\u0014\u0010\u0011\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010QR\u0014\u0010\u0012\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bX\u0010TR$\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\u00170Yj\b\u0012\u0004\u0012\u00020\u0017`Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b[\u0010\\\u00a8\u0006^"}, d2={"Loxxxde/\u0636\u0639;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onDisable", "onEnable", "Loxxxde/\u0630\u0645;", "event", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Loxxxde/\u0634\u062b;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_243;", "center", "", "radius", "speed", "Ljava/awt/Color;", "color", "spawnWave", "(Lnet/minecraft/class_243;FFLjava/awt/Color;)V", "Loxxxde/\u064d;", "wave", "distance", "waveFront", "computeAlphaForBlock", "(Lkotakbaz/rain/module/modules/render/HitWavesModule$Wave;FF)F", "", "Lnet/minecraft/class_2338;", "collectSurfaceBlocks", "(Lnet/minecraft/class_243;F)Ljava/util/List;", "Lnet/minecraft/class_2680;", "aboveState", "state", "pos", "", "isSurfaceBlock", "(Lnet/minecraft/class_2680;Lnet/minecraft/class_2680;Lnet/minecraft/class_2338;)Z", "selectedColor", "()Ljava/awt/Color;", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_4588;", "buffer", "Lnet/minecraft/class_238;", "box", "", "red", "green", "blue", "alpha", "drawSolidBox", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;Lnet/minecraft/class_238;IIII)V", "width", "drawWireframeBox", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;Lnet/minecraft/class_238;FIIII)V", "minX", "minY", "minZ", "maxX", "maxY", "maxZ", "addBoxVertices", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_4588;FFFFFFIIII)V", "Lnet/minecraft/class_4587$class_4665;", "entry", "x", "y", "z", "addVertex", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFIIII)V", "BUFFER_SIZE", "I", "WAVE_THICKNESS", "F", "FILLED_ALPHA_SCALE", "OUTLINE_WIDTH", "END_FADE_PORTION", "Loxxxde/\u0637\u064f;", "Loxxxde/\u0637\u064f;", "Loxxxde/\u062e\u0630;", "useClientColor", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0631\u062a;", "waveColor", "Loxxxde/\u0631\u062a;", "hh", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "waves", "Ljava/util/ArrayList;", "Wave", "rain-visuals"})
@RecompileFormat
public final class \u0636\u0639
extends Module {
    @NotNull
    private static final SliderSetting speed;
    private static final float FILLED_ALPHA_SCALE = 0.35f;
    private static final int BUFFER_SIZE = 262144;
    @NotNull
    private static final SliderSetting radius;
    @NotNull
    public static final \u0636\u0639 INSTANCE;
    private static final float WAVE_THICKNESS = 1.0f;
    private static final float END_FADE_PORTION = 0.35f;
    @NotNull
    private static final ArrayList<HitWavesModule.Wave> waves;
    @NotNull
    private static final BooleanSetting useClientColor;
    @NotNull
    private static final BooleanSetting hh;
    @NotNull
    private static final ColorSetting waveColor;
    private static final float OUTLINE_WIDTH = 0.015f;

    @Override
    public void onEnable() {
        waves.clear();
    }

    private final void addVertex(VertexConsumer buffer, MatrixStack.Entry entry, float x, float y, float z, int red, int green, int blue, int alpha) {
        buffer.vertex(entry, x, y, z).color(red, green, blue, alpha);
    }

    private static final boolean waveColor$lambda$0() {
        return !((Boolean)useClientColor.getValue()).booleanValue() || !\u0638\u062b.INSTANCE.isEnabled();
    }

    private final void spawnWave(Vec3d center, float radius, float speed, Color color) {
        float expansionDuration;
        List<BlockPos> surfaceBlocks = this.collectSurfaceBlocks(center, radius);
        float actualDuration = expansionDuration = radius / Math.max(0.1f, speed);
        waves.add(new HitWavesModule.Wave(center, radius, speed, actualDuration, color, System.currentTimeMillis(), surfaceBlocks));
    }

    private final boolean isSurfaceBlock(BlockState aboveState, BlockState state, BlockPos pos) {
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return false;
        }
        ClientWorld world = clientWorld;
        if (state.isAir()) {
            return false;
        }
        if (!aboveState.isAir()) {
            return false;
        }
        return !state.getCollisionShape((BlockView)world, pos).isEmpty();
    }

    static {
        INSTANCE = new \u0636\u0639();
        radius = Module.slider$default(INSTANCE, "\u0420\u0430\u0434\u0438\u0443\u0441", 10.0f, 8.0f, 16.0f, 0.5f, null, 32, null);
        speed = Module.slider$default(INSTANCE, "\u0421\u043a\u043e\u0440\u043e\u0441\u0442\u044c", 20.0f, 10.0f, 18.0f, 0.5f, null, 32, null);
        useClientColor = Module.boolean$default(INSTANCE, "\u0426\u0432\u0435\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430", false, null, 4, null).setVisible(\u0636\u0639::useClientColor$lambda$0);
        Module module = INSTANCE;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, "WHITE");
        waveColor = Module.color$default(module, "\u0426\u0432\u0435\u0442", color, null, 4, null).setVisible(\u0636\u0639::waveColor$lambda$0);
        hh = Module.boolean$default(INSTANCE, "\u041e\u0431\u0432\u043e\u0434\u043a\u0430", true, null, 4, null);
        waves = new ArrayList();
    }

    private final Color selectedColor() {
        return (Boolean)useClientColor.getValue() != false && \u0638\u062b.INSTANCE.isEnabled() ? \u0638\u062b.INSTANCE.getClientColor() : (Color)waveColor.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private final void drawWireframeBox(MatrixStack matrices, VertexConsumer buffer, Box box, float width, int red, int green, int blue, int alpha) {
        void var8_8;
        void var7_7;
        void var6_6;
        void var5_5;
        void var14_14;
        void var4_4;
        float minX = (float)box.minX;
        float minY = (float)box.minY;
        float minZ = (float)box.minZ;
        float maxX = (float)box.maxX;
        float maxY = (float)box.maxY;
        float maxZ = (float)box.maxZ;
        this.addBoxVertices(matrices, buffer, minX - width, minY, minZ - width, minX + width, maxY, minZ + width, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, maxX - width, minY, minZ - width, maxX + width, maxY, minZ + width, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, minX - width, minY, maxZ - width, minX + width, maxY, maxZ + width, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, maxX - width, minY, maxZ - width, maxX + width, maxY, maxZ + width, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, minX, minY - width, minZ - width, maxX, minY + width, minZ + width, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, minX, minY - width, maxZ - width, maxX, minY + width, maxZ + width, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, minX, maxY - width, minZ - width, maxX, maxY + width, minZ + width, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, minX, maxY - width, maxZ - width, maxX, maxY + width, maxZ + width, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, minX - width, minY - width, minZ, minX + width, minY + width, maxZ, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, maxX - width, minY - width, minZ, maxX + width, minY + width, maxZ, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, minX - width, maxY - width, minZ, minX + width, maxY + width, maxZ, red, green, blue, alpha);
        this.addBoxVertices(matrices, buffer, maxX - width, maxY - width, minZ, maxX + width, maxY + var4_4, (float)var14_14, (int)var5_5, (int)var6_6, (int)var7_7, (int)var8_8);
    }

    private static final boolean useClientColor$lambda$0() {
        return \u0638\u062b.INSTANCE.isEnabled();
    }

    private final float computeAlphaForBlock(HitWavesModule.Wave wave, float distance, float waveFront) {
        float baseAlpha = Math.min((float)wave.getColor().getAlpha() / 255.0f, 0.8f);
        float distanceToWave = Math.abs(distance - waveFront);
        if (distanceToWave > 1.0f) {
            return 0.0f;
        }
        return baseAlpha * (1.0f - distanceToWave / 1.0f);
    }

    private \u0636\u0639() {
        super("HitWaves", \u0638\u0646.getRENDER(), "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u0430\u044f \u0432\u043e\u043b\u043d\u0430 \u043f\u0440\u0438 \u0443\u0434\u0430\u0440\u0435");
    }

    /*
     * WARNING - void declaration
     */
    private final void addBoxVertices(MatrixStack matrices, VertexConsumer buffer, float minX, float minY, float minZ, float maxX, float maxY, float maxZ, int red, int green, int blue, int alpha) {
        void var12_12;
        void var11_11;
        void var10_10;
        void var9_9;
        void var5_5;
        void var4_4;
        void var3_3;
        void var13_13;
        void var2_2;
        MatrixStack.Entry entry = matrices.peek();
        Intrinsics.checkNotNullExpressionValue(entry, "last(...)");
        MatrixStack.Entry entry2 = entry;
        this.addVertex(buffer, entry2, minX, minY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, minY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, minY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, minY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, maxY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, maxY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, maxY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, maxY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, minY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, maxY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, maxY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, minY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, minY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, maxY, minZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, maxY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, minY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, minY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, maxX, maxY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, maxY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, minY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, minY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, maxY, maxZ, red, green, blue, alpha);
        this.addVertex(buffer, entry2, minX, maxY, minZ, red, green, blue, alpha);
        this.addVertex((VertexConsumer)var2_2, (MatrixStack.Entry)var13_13, (float)var3_3, (float)var4_4, (float)var5_5, (int)var9_9, (int)var10_10, (int)var11_11, (int)var12_12);
    }

    private final List<BlockPos> collectSurfaceBlocks(Vec3d center, float radius) {
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return CollectionsKt.emptyList();
        }
        ClientWorld world = clientWorld;
        ArrayList<BlockPos> result = new ArrayList<BlockPos>();
        int limit = (int)Math.ceil(radius);
        BlockPos blockPos = BlockPos.ofFloored((Position)((Position)center));
        Intrinsics.checkNotNullExpressionValue(blockPos, "containing(...)");
        BlockPos origin = blockPos;
        float radiusSquared = radius * radius;
        int x = -limit;
        if (x <= limit) {
            while (true) {
                int y;
                if ((y = -limit) <= limit) {
                    while (true) {
                        int z;
                        if ((z = -limit) <= limit) {
                            while (true) {
                                BlockPos candidate;
                                Intrinsics.checkNotNullExpressionValue(origin.add(x, y, z), "offset(...)");
                                Vec3d candidateCenter = new Vec3d((double)candidate.getX() + 0.5, (double)candidate.getY() + 0.5, (double)candidate.getZ() + 0.5);
                                if (!(candidateCenter.squaredDistanceTo(center) > (double)radiusSquared)) {
                                    BlockState state;
                                    BlockPos surfacePos = candidate;
                                    Intrinsics.checkNotNullExpressionValue(world.getBlockState(surfacePos), "getBlockState(...)");
                                    if (state.getBlock() instanceof PlantBlock) {
                                        BlockState belowState;
                                        BlockPos belowPos;
                                        Intrinsics.checkNotNullExpressionValue(surfacePos.down(), "below(...)");
                                        Intrinsics.checkNotNullExpressionValue(world.getBlockState(belowPos), "getBlockState(...)");
                                        if (!belowState.isAir()) {
                                            surfacePos = belowPos;
                                            state = belowState;
                                        }
                                    }
                                    BlockState blockState = world.getBlockState(surfacePos.up());
                                    Intrinsics.checkNotNullExpressionValue(blockState, "getBlockState(...)");
                                    if (this.isSurfaceBlock(blockState, state, surfacePos)) {
                                        result.add(surfacePos);
                                    }
                                }
                                if (z == limit) break;
                                ++z;
                            }
                        }
                        if (y == limit) break;
                        ++y;
                    }
                }
                if (x == limit) break;
                ++x;
            }
        }
        return result;
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled()) {
            return;
        }
        if (\u0636\u0643.getMc().world == null) {
            return;
        }
        this.spawnWave(\u0637\u062b.getPos(event.getEntity()), ((Number)radius.getValue()).floatValue(), ((Number)speed.getValue()).floatValue(), this.selectedColor());
    }

    @Override
    public void onDisable() {
        waves.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isEnabled() || waves.isEmpty()) {
            return;
        }
        BufferAllocator allocator = new BufferAllocator(262144);
        GameRenderer gameRenderer = \u0636\u0643.getMc().gameRenderer;
        Intrinsics.checkNotNullExpressionValue(gameRenderer, "gameRenderer");
        Vec3d cameraPos = \u0637\u062b.getPos(\u0637\u062b.getCamera(gameRenderer));
        long now = System.currentTimeMillis();
        GlStateManager._enableBlend();
        GlStateManager._blendFuncSeparate((int)770, (int)771, (int)1, (int)0);
        GlStateManager._enableDepthTest();
        GlStateManager._disableCull();
        try {
            void var6_5;
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)allocator);
            Intrinsics.checkNotNullExpressionValue(immediate, "immediate(...)");
            VertexConsumerProvider.Immediate consumers = immediate;
            VertexConsumer vertexConsumer = consumers.getBuffer(RainRenderLayers.getHitBoxQuad(true));
            Intrinsics.checkNotNullExpressionValue(vertexConsumer, "getBuffer(...)");
            VertexConsumer boxBuffer = vertexConsumer;
            event.getMatrices().push();
            event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z);
            Iterator<HitWavesModule.Wave> iterator2 = waves.iterator();
            Intrinsics.checkNotNullExpressionValue(iterator2, "iterator(...)");
            Iterator<HitWavesModule.Wave> iterator3 = iterator2;
            while (iterator3.hasNext()) {
                HitWavesModule.Wave wave;
                Intrinsics.checkNotNullExpressionValue(iterator3.next(), "next(...)");
                float elapsedSeconds = (float)(now - wave.getStartTime()) / 1000.0f;
                if (elapsedSeconds > wave.getDurationSeconds()) {
                    iterator3.remove();
                    continue;
                }
                float waveFront = Math.min(elapsedSeconds * wave.getSpeed(), wave.getRadius());
                float fadeDuration = RangesKt.coerceAtLeast(wave.getDurationSeconds() * 0.35f, 0.001f);
                float endFade = RangesKt.coerceIn((wave.getDurationSeconds() - elapsedSeconds) / fadeDuration, 0.0f, 1.0f);
                for (BlockPos blockPos : wave.getBlocks()) {
                    void var23_26;
                    void var25_29;
                    void var24_27;
                    Box filledBox;
                    Vec3d blockCenter = new Vec3d((double)blockPos.getX() + 0.5, (double)blockPos.getY() + 0.5, (double)blockPos.getZ() + 0.5);
                    float distance = (float)Math.sqrt(blockCenter.squaredDistanceTo(wave.getCenter()));
                    if (distance > wave.getRadius()) continue;
                    float alpha = this.computeAlphaForBlock(wave, distance, waveFront) * endFade;
                    if (alpha <= 0.0f) continue;
                    int filledAlpha = RangesKt.coerceIn((int)(150.0f * alpha * 0.35f), 0, 255);
                    Color baseColor = wave.getColor();
                    Box $this$expand$iv = new Box(blockPos);
                    double value$iv = 0.002;
                    boolean $i$f$expand = false;
                    Intrinsics.checkNotNullExpressionValue($this$expand$iv.expand(value$iv), "inflate(...)");
                    this.drawSolidBox(event.getMatrices(), boxBuffer, filledBox, baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), filledAlpha);
                    if (!((Boolean)hh.getValue()).booleanValue()) continue;
                    int outlineAlpha = RangesKt.coerceIn((int)(255.0f * alpha), 0, 255);
                    Color outlineColor = new Color(RangesKt.coerceAtMost(baseColor.getRed() + 40, 255), RangesKt.coerceAtMost(baseColor.getGreen() + 40, 255), RangesKt.coerceAtMost(baseColor.getBlue() + 40, 255), outlineAlpha);
                    MatrixStack matrixStack = event.getMatrices();
                    Box $this$expand$iv2 = new Box(blockPos);
                    double value$iv2 = 0.005;
                    boolean $i$f$expand2 = false;
                    Box box = var24_27.expand((double)var25_29);
                    Intrinsics.checkNotNullExpressionValue(box, "inflate(...)");
                    this.drawWireframeBox(matrixStack, boxBuffer, box, 0.015f, outlineColor.getRed(), outlineColor.getGreen(), var23_26.getBlue(), var23_26.getAlpha());
                }
            }
            event.getMatrices().pop();
            void var9_9 = var6_5;
            boolean bl = false;
            var9_9.draw();
        }
        catch (Throwable throwable) {
            void var2_2;
            var2_2.close();
            GlStateManager._enableCull();
            GlStateManager._disableBlend();
            throw throwable;
        }
        allocator.close();
        GlStateManager._enableCull();
        GlStateManager._disableBlend();
    }

    /*
     * WARNING - void declaration
     */
    private final void drawSolidBox(MatrixStack matrices, VertexConsumer buffer, Box box, int red, int green, int blue, int alpha) {
        void var7_7;
        this.addBoxVertices(matrices, buffer, (float)box.minX, (float)box.minY, (float)box.minZ, (float)box.maxX, (float)box.maxY, (float)box.maxZ, red, green, blue, (int)var7_7);
    }
}

