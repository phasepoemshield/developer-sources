/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09109
 *  minecraft.class00058
 *  minecraft.class00183
 *  minecraft.class00951
 *  minecraft.class01089
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class03069
 *  minecraft.class03579
 *  minecraft.class04643
 *  minecraft.class04866
 *  minecraft.class05703
 *  minecraft.class05946
 *  minecraft.class06176
 *  minecraft.class08117
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class08923
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 */
package minecraft;

import Nursultan.class09109;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00058;
import minecraft.class00183;
import minecraft.class00951;
import minecraft.class01089;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class03069;
import minecraft.class03579;
import minecraft.class04643;
import minecraft.class04866;
import minecraft.class05703;
import minecraft.class05946;
import minecraft.class06176;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08301;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class08923;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;

@Environment(value=EnvType.CLIENT)
public class class08290
extends class05703<class08301>
implements FabricResourceReloader {
    private static final class03069 N = class03069.N((String)"waypoint_style");
    private static final class08301 y = new class08301(0, 1, List.of(class08923.L()));
    private Map<class05946<class09109>, class08301> L = Map.of();
    private class01894 u;

    public class08290() {
        super(class08301.u, N);
    }

    public class08301 N(class05946<class09109> class059462) {
        return this.L.getOrDefault(class059462, y);
    }

    protected void N(Map<class01894, class08301> map, class01089 class010892, class04643 class046432) {
        this.L = map.entrySet().stream().collect(Collectors.toUnmodifiableMap(entry -> class05946.N((class05946)class00058.N, (class01894)((class01894)entry.getKey())), Map.Entry::getValue));
    }

    public class01894 fabric$getId() {
        if (this.u == null) {
            class08290 var1 = this;
            this.u = var1 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (var1 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (var1 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (var1 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (var1 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (var1 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (var1 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (var1 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (var1 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (var1 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (var1 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (var1 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (var1 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (var1 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (var1 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (var1 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (var1 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (var1 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + ((Object)((Object)var1)).getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.u;
    }
}

