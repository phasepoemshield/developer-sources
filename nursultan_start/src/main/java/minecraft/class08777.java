/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class00394
 *  minecraft.class01296
 *  minecraft.class02578
 *  minecraft.class02586
 *  minecraft.class02609
 *  minecraft.class02613
 *  minecraft.class03476
 *  minecraft.class07211
 *  minecraft.class08871
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import minecraft.class00394;
import minecraft.class01296;
import minecraft.class02578;
import minecraft.class02586;
import minecraft.class02609;
import minecraft.class02613;
import minecraft.class03476;
import minecraft.class07211;
import minecraft.class08728;
import minecraft.class08743;
import minecraft.class08744;
import minecraft.class08749;
import minecraft.class08765;
import minecraft.class08871;
import org.jspecify.annotations.Nullable;

public class class08777
implements class08744 {
    public static final class08744 N = new class08765();
    public static final class08744 y = new class08749();
    private final List<class00394> L;
    private final class03476 u;
    private final @Nullable class02578 i;
    private @Nullable class08728 R;
    private final Map<class08743, class08871> M = new EnumMap<class08743, class08871>(class08743.class);

    @Override
    public boolean L() {
        return this.M.containsKey((Object)class08743.field_60926);
    }

    public class08777(class08728 class087282, class02586 class025862) {
        this.R = class087282;
        this.u = class025862.L;
        this.L = class025862.N;
        this.i = class025862.u;
    }

    @Override
    public void close() {
        this.M.values().forEach(class08871::close);
        this.M.clear();
    }

    public @Nullable class02578 u() {
        return this.i;
    }

    @Override
    public boolean y(class08728 class087282) {
        return !class087282.equals(this.R);
    }

    @Override
    public @Nullable class08871 y(class08743 class087432) {
        return this.M.get((Object)class087432);
    }

    @Override
    public List<class00394> y() {
        return this.L;
    }

    public void N(class08728 class087282) {
        this.R = class087282;
    }

    public void N(class08743 class087432, class02613 class026132, long l) {
        class08871 class088712 = this.y(class087432);
        if (class088712 == null) {
            return;
        }
        if (class088712.y() == null) {
            class088712.N_89(RenderSystem.getDevice().createBuffer(() -> "Section index buffer - layer: " + class087432.L() + "; cords: " + class01296.y((long)l) + ", " + class01296.L((long)l) + ", " + class01296.u((long)l), 72, class026132.N()));
        } else {
            CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
            if (!class088712.y().isClosed()) {
                commandEncoder.writeToBuffer(class088712.y().slice(), class026132.N());
            }
        }
    }

    @Override
    public boolean N(class07211 class072112, class07211 class072113) {
        return this.u.N(class072112, class072113);
    }

    public void N(class08743 class087432, class02609 class026092, long l) {
        CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
        class08871 class088712 = this.y(class087432);
        if (class088712 != null) {
            if (class088712.N().size() < (long)class026092.N().remaining()) {
                class088712.N().close();
                class088712.y(RenderSystem.getDevice().createBuffer(() -> "Section vertex buffer - layer: " + class087432.L() + "; cords: " + class01296.y((long)l) + ", " + class01296.L((long)l) + ", " + class01296.u((long)l), 40, class026092.N()));
            } else if (!class088712.N().isClosed()) {
                commandEncoder.writeToBuffer(class088712.N().slice(), class026092.N());
            }
            ByteBuffer byteBuffer = class026092.y();
            if (byteBuffer != null) {
                if (class088712.y() == null || class088712.y().size() < (long)byteBuffer.remaining()) {
                    if (class088712.y() != null) {
                        class088712.y().close();
                    }
                    class088712.N_89(RenderSystem.getDevice().createBuffer(() -> "Section index buffer - layer: " + class087432.L() + "; cords: " + class01296.y((long)l) + ", " + class01296.L((long)l) + ", " + class01296.u((long)l), 72, byteBuffer));
                } else if (!class088712.y().isClosed()) {
                    commandEncoder.writeToBuffer(class088712.y().slice(), byteBuffer);
                }
            } else if (class088712.y() != null) {
                class088712.y().close();
                class088712.N_89(null);
            }
            class088712.N_21(class026092.L().L());
            class088712.N(class026092.L().i());
        } else {
            GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Section vertex buffer - layer: " + class087432.L() + "; cords: " + class01296.y((long)l) + ", " + class01296.L((long)l) + ", " + class01296.u((long)l), 40, class026092.N());
            ByteBuffer byteBuffer = class026092.y();
            GpuBuffer gpuBuffer2 = byteBuffer != null ? RenderSystem.getDevice().createBuffer(() -> "Section index buffer - layer: " + class087432.L() + "; cords: " + class01296.y((long)l) + ", " + class01296.L((long)l) + ", " + class01296.u((long)l), 72, byteBuffer) : null;
            class08871 class088713 = new class08871(gpuBuffer, gpuBuffer2, class026092.L().L(), class026092.L().i());
            this.M.put(class087432, class088713);
        }
    }

    @Override
    public boolean N() {
        return !this.M.isEmpty();
    }

    @Override
    public boolean N(class08743 class087432) {
        return !this.M.containsKey((Object)class087432);
    }
}

