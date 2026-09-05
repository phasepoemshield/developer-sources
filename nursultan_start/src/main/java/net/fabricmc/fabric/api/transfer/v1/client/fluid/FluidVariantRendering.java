/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04206
 *  minecraft.class04651
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06497
 *  minecraft.class06524
 *  minecraft.class06541
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.client.fluid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class04206;
import minecraft.class04651;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06497;
import minecraft.class06524;
import minecraft.class06541;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap;
import net.fabricmc.fabric.api.transfer.v1.client.fluid.FluidVariantRenderHandler;
import net.fabricmc.fabric.api.transfer.v1.client.fluid.FluidVariantRendering$1;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class FluidVariantRendering {
    private static final ApiProviderMap<class04651, FluidVariantRenderHandler> HANDLERS = ApiProviderMap.create();
    private static final FluidVariantRenderHandler DEFAULT_HANDLER = new FluidVariantRendering$1();

    private FluidVariantRendering() {
    }

    public static void register(class04651 class046512, FluidVariantRenderHandler fluidVariantRenderHandler) {
        if (HANDLERS.putIfAbsent((Object)class046512, (Object)fluidVariantRenderHandler) != null) {
            throw new IllegalArgumentException("Duplicate handler registration for fluid " + String.valueOf(class046512));
        }
    }

    public static @Nullable FluidVariantRenderHandler getHandler(class04651 class046512) {
        return (FluidVariantRenderHandler)HANDLERS.get((Object)class046512);
    }

    public static List<class00392> getTooltip(FluidVariant fluidVariant, class06497 class064972) {
        ArrayList<class00392> arrayList = new ArrayList<class00392>();
        arrayList.add(FluidVariantAttributes.getName(fluidVariant));
        FluidVariantRendering.getHandlerOrDefault(fluidVariant.getFluid()).appendTooltip(fluidVariant, arrayList, class064972);
        if (class064972.N()) {
            arrayList.add((class00392)class00392.y((String)class04206.L.y((Object)fluidVariant.getFluid()).toString()).N(class06541.field_1063));
        }
        return arrayList;
    }

    public static List<class00392> getTooltip(FluidVariant fluidVariant) {
        return FluidVariantRendering.getTooltip(fluidVariant, (class06497)(((class05630)class06202.Nq().i_7).W ? class06524.y : class06524.N));
    }

    public static FluidVariantRenderHandler getHandlerOrDefault(class04651 class046512) {
        FluidVariantRenderHandler fluidVariantRenderHandler = (FluidVariantRenderHandler)HANDLERS.get((Object)class046512);
        return fluidVariantRenderHandler == null ? DEFAULT_HANDLER : fluidVariantRenderHandler;
    }

    public static int getColor(FluidVariant fluidVariant) {
        return FluidVariantRendering.getColor(fluidVariant, null, null);
    }

    public static int getColor(FluidVariant fluidVariant, @Nullable class07295 class072952, @Nullable class07209 class072092) {
        return FluidVariantRendering.getHandlerOrDefault(fluidVariant.getFluid()).getColor(fluidVariant, class072952, class072092);
    }

    public static @Nullable class08388 getSprite(FluidVariant fluidVariant) {
        class08388[] class08388Array = FluidVariantRendering.getSprites(fluidVariant);
        return class08388Array != null ? Objects.requireNonNull(class08388Array[0]) : null;
    }

    public static @Nullable class08388[] getSprites(FluidVariant fluidVariant) {
        return FluidVariantRendering.getHandlerOrDefault(fluidVariant.getFluid()).getSprites(fluidVariant);
    }
}

