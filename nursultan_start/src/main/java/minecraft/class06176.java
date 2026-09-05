/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00183
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00951
 *  minecraft.class01089
 *  minecraft.class01291
 *  minecraft.class01781
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02416
 *  minecraft.class03510
 *  minecraft.class03579
 *  minecraft.class04643
 *  minecraft.class04771
 *  minecraft.class04866
 *  minecraft.class06069
 *  minecraft.class06842
 *  minecraft.class08117
 *  minecraft.class08212
 *  minecraft.class08290
 *  minecraft.class08396
 *  minecraft.class08521
 *  minecraft.class08543
 *  minecraft.class08575
 *  minecraft.class08627
 *  minecraft.class08718
 *  minecraft.class09033
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys$Client
 *  net.fabricmc.fabric.impl.resource.FabricResourceReloader
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.MonthDay;
import java.util.List;
import java.util.Locale;
import minecraft.class00183;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00951;
import minecraft.class01089;
import minecraft.class01291;
import minecraft.class01781;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02416;
import minecraft.class03510;
import minecraft.class03579;
import minecraft.class04643;
import minecraft.class04771;
import minecraft.class04866;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06842;
import minecraft.class08117;
import minecraft.class08212;
import minecraft.class08290;
import minecraft.class08396;
import minecraft.class08521;
import minecraft.class08543;
import minecraft.class08575;
import minecraft.class08627;
import minecraft.class08718;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class class06176
extends class01291<List<class00392>>
implements FabricResourceReloader {
    private static final class00405 u = class00405.N.N(-256);
    public static final class00392 N = class06176.N("Merry X-mas!");
    public static final class00392 y = class06176.N("Happy new year!");
    public static final class00392 L = class06176.N("OOoooOOOoooo! Spooky!");
    private static final class01894 i = class01894.y((String)"texts/splashes.txt");
    private static final class06069 R = class06069.u();
    private List<class00392> M = List.of();
    private final class04771 B;
    private class01894 Z;

    public class06176(class04771 class047712) {
        this.B = class047712;
    }

    private static class00392 N(String string) {
        return class00392.y((String)string).y(u);
    }

    protected List<class00392> y(class01089 class010892, class04643 class046432) {
        List list;
        block8: {
            BufferedReader bufferedReader = class06202.Nq().Nm().i(i);
            try {
                list = bufferedReader.lines().map(String::trim).filter(string -> string.hashCode() != 125780783).map(class06176::N).toList();
                if (bufferedReader == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    return List.of();
                }
            }
            bufferedReader.close();
        }
        return list;
    }

    protected void N(List<class00392> list, class01089 class010892, class04643 class046432) {
        this.M = List.copyOf(list);
    }

    public @Nullable class03510 N() {
        MonthDay monthDay = class06842.N();
        if (monthDay.equals(class06842.L)) {
            return class03510.N;
        }
        if (monthDay.equals(class06842.u)) {
            return class03510.y;
        }
        if (monthDay.equals(class06842.N)) {
            return class03510.L;
        }
        if (this.M.isEmpty()) {
            return null;
        }
        if (this.B != null && R.y(this.M.size()) == 42) {
            return new class03510(class06176.N(this.B.L().toUpperCase(Locale.ROOT) + " IS YOU"));
        }
        return new class03510(this.M.get(R.y(this.M.size())));
    }

    public class01894 fabric$getId() {
        if (this.Z == null) {
            class06176 class061762 = this;
            this.Z = class061762 instanceof class08117 ? ResourceReloaderKeys.Client.ATLAS : (class061762 instanceof class00183 ? ResourceReloaderKeys.Client.MODELS : (class061762 instanceof class03579 ? ResourceReloaderKeys.Client.BLOCK_ENTITY_RENDERERS : (class061762 instanceof class01999 ? ResourceReloaderKeys.Client.BLOCK_RENDER_MANAGER : (class061762 instanceof class02416 ? ResourceReloaderKeys.Client.CLOUD_CELLS : (class061762 instanceof class08521 ? ResourceReloaderKeys.Client.DRY_FOLIAGE_COLORMAP : (class061762 instanceof class08718 ? ResourceReloaderKeys.Client.EQUIPMENT_MODELS : (class061762 instanceof class01781 ? ResourceReloaderKeys.Client.ENTITY_RENDERERS : (class061762 instanceof class04866 ? ResourceReloaderKeys.Client.FONTS : (class061762 instanceof class08575 ? ResourceReloaderKeys.Client.FOLIAGE_COLORMAP : (class061762 instanceof class08543 ? ResourceReloaderKeys.Client.GRASS_COLORMAP : (class061762 instanceof class08396 ? ResourceReloaderKeys.Client.LANGUAGES : (class061762 instanceof class00951 ? ResourceReloaderKeys.Client.PARTICLES : (class061762 instanceof class08212 ? ResourceReloaderKeys.Client.SHADERS : (class061762 instanceof class06176 ? ResourceReloaderKeys.Client.SPLASH_TEXTS : (class061762 instanceof class09033 ? ResourceReloaderKeys.Client.SOUNDS : (class061762 instanceof class08627 ? ResourceReloaderKeys.Client.TEXTURES : (class061762 instanceof class08290 ? ResourceReloaderKeys.Client.WAYPOINT_STYLE_ASSETS : class01894.y((String)("private/" + ((Object)((Object)class061762)).getClass().getSimpleName().toLowerCase(Locale.ROOT))))))))))))))))))));
        }
        return this.Z;
    }
}

