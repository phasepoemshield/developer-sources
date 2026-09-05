/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.render.fluid.v1;

import java.util.Objects;
import minecraft.class01894;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class SimpleFluidRenderHandler
implements FluidRenderHandler {
    public static final class01894 WATER_STILL = class01894.y((String)"block/water_still");
    public static final class01894 WATER_FLOWING = class01894.y((String)"block/water_flow");
    public static final class01894 WATER_OVERLAY = class01894.y((String)"block/water_overlay");
    public static final class01894 LAVA_STILL = class01894.y((String)"block/lava_still");
    public static final class01894 LAVA_FLOWING = class01894.y((String)"block/lava_flow");
    protected final class01894 stillTexture;
    protected final class01894 flowingTexture;
    protected final class01894 overlayTexture;
    protected final class08388[] sprites;
    protected final int tint;

    public SimpleFluidRenderHandler(class01894 class018942, class01894 class018943) {
        this(class018942, class018943, null, -1);
    }

    public SimpleFluidRenderHandler(class01894 class018942, class01894 class018943, int n) {
        this(class018942, class018943, null, n);
    }

    public SimpleFluidRenderHandler(class01894 class018942, class01894 class018943, class01894 class018944) {
        this(class018942, class018943, class018944, -1);
    }

    public SimpleFluidRenderHandler(class01894 class018942, class01894 class018943, @Nullable class01894 class018944, int n) {
        this.stillTexture = Objects.requireNonNull(class018942, "stillTexture");
        this.flowingTexture = Objects.requireNonNull(class018943, "flowingTexture");
        this.overlayTexture = class018944;
        this.sprites = new class08388[class018944 == null ? 2 : 3];
        this.tint = n;
    }

    @Override
    public class08388[] getFluidSprites(@Nullable class07295 class072952, @Nullable class07209 class072092, class04688 class046882) {
        return this.sprites;
    }

    @Override
    public int getFluidColor(@Nullable class07295 class072952, @Nullable class07209 class072092, class04688 class046882) {
        return this.tint;
    }

    @Override
    public void reloadTextures(class08626 class086262) {
        this.sprites[0] = class086262.N(this.stillTexture);
        this.sprites[1] = class086262.N(this.flowingTexture);
        if (this.overlayTexture != null) {
            this.sprites[2] = class086262.N(this.overlayTexture);
        }
    }

    public static SimpleFluidRenderHandler coloredWater(int n) {
        return new SimpleFluidRenderHandler(WATER_STILL, WATER_FLOWING, WATER_OVERLAY, n);
    }
}

