/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.logging.LogUtils
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02063
 *  minecraft.class03711
 *  minecraft.class03734
 *  minecraft.class04227
 *  minecraft.class04643
 *  minecraft.class05703
 *  minecraft.class05961
 *  minecraft.class06482
 *  minecraft.class07151
 *  minecraft.class07166
 *  minecraft.class07285
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Server
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02063;
import minecraft.class03711;
import minecraft.class03734;
import minecraft.class04227;
import minecraft.class04482;
import minecraft.class04490;
import minecraft.class04643;
import minecraft.class05703;
import minecraft.class05961;
import minecraft.class06482;
import minecraft.class07151;
import minecraft.class07166;
import minecraft.class07285;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04478
extends class05703<class07151>
implements FabricResourceReloader {
    private static final Logger N = LogUtils.getLogger();
    private Map<class01894, class03711> y = Map.of();
    private class07166 L = new class07166();
    private final class01929 u;
    private class01894 i;

    public class04478(class01929 class019292) {
        super(class019292, class07151.N, class04227.yK);
        this.u = class019292;
    }

    public Collection<class03711> y() {
        return this.y.values();
    }

    protected void N(Map<class01894, class07151> map, class01089 class010892, class04643 class046432) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        map.forEach((class018942, class071512) -> {
            this.N((class01894)class018942, (class07151)class071512);
            builder.put(class018942, (Object)new class03711(class018942, class071512));
        });
        this.y = builder.buildOrThrow();
        class07166 class071662 = new class07166();
        class071662.N(this.y.values());
        for (class03734 class037342 : class071662.y()) {
            if (!class037342.y().y().L().isPresent()) continue;
            class07285.N((class03734)class037342);
        }
        this.L = class071662;
    }

    public @Nullable class03711 N(class01894 class018942) {
        return this.y.get(class018942);
    }

    public class07166 N() {
        return this.L;
    }

    private void N(class01894 class018942, class07151 class071512) {
        class04482 class044822 = new class04482();
        class071512.N((class04490)class044822, (class02063)this.u);
        if (!class044822.N()) {
            N.warn("Found validation problems in advancement {}: \n{}", (Object)class018942, (Object)class044822.y());
        }
    }

    public class01894 fabric$getId() {
        if (this.i == null) {
            class04478 var1 = this;
            this.i = var1 instanceof class06482 ? ResourceReloaderKeys.Server.RECIPES : (var1 instanceof class04478 ? ResourceReloaderKeys.Server.ADVANCEMENTS : (var1 instanceof class05961 ? ResourceReloaderKeys.Server.FUNCTIONS : class01894.y((String)("private/" + ((Object)((Object)var1)).getClass().getSimpleName().toLowerCase(Locale.ROOT)))));
        }
        return this.i;
    }
}

