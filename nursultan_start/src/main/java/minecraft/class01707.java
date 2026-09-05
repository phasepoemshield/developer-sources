/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  minecraft.class00381
 *  minecraft.class01683
 *  minecraft.class01700
 *  minecraft.class01894
 *  minecraft.class02090
 *  minecraft.class03448
 *  minecraft.class03711
 *  minecraft.class03734
 *  minecraft.class04680
 *  minecraft.class04683
 *  minecraft.class06202
 *  minecraft.class06513
 *  minecraft.class07166
 *  minecraft.class07176
 *  minecraft.class07299
 *  minecraft.class07339
 *  minecraft.class08019
 *  minecraft.class08077
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import minecraft.class00381;
import minecraft.class01683;
import minecraft.class01700;
import minecraft.class01894;
import minecraft.class02090;
import minecraft.class03448;
import minecraft.class03711;
import minecraft.class03734;
import minecraft.class04680;
import minecraft.class04683;
import minecraft.class06202;
import minecraft.class06513;
import minecraft.class07166;
import minecraft.class07176;
import minecraft.class07299;
import minecraft.class07339;
import minecraft.class08019;
import minecraft.class08077;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01707 {
    private static final Logger N = LogUtils.getLogger();
    private final class06202 y;
    private final class02090 L;
    private final class07166 u = new class07166();
    private final Map<class03711, class08019> i = new Object2ObjectOpenHashMap();
    private @Nullable class01700 R;
    private @Nullable class03711 M;

    public class01707(class06202 class062022, class02090 class020902) {
        this.y = class062022;
        this.L = class020902;
    }

    public void N(@Nullable class01700 class017002) {
        this.R = class017002;
        this.u.N((class07176)class017002);
        if (class017002 != null) {
            this.i.forEach((class037112, class080192) -> {
                class03734 class037342 = this.u.N(class037112);
                if (class037342 != null) {
                    class017002.N(class037342, class080192);
                }
            });
            class017002.N(this.M);
        }
    }

    public @Nullable class03711 N(class01894 class018942) {
        class03734 class037342 = this.u.N(class018942);
        return class037342 != null ? class037342.y() : null;
    }

    public void N(class08077 class080772) {
        if (class080772.u()) {
            this.u.N();
            this.i.clear();
        }
        this.u.N(class080772.y());
        this.u.N((Collection)class080772.N());
        for (Map.Entry entry : class080772.L().entrySet()) {
            class03734 class037342 = this.u.N((class01894)entry.getKey());
            if (class037342 != null) {
                class08019 class080192 = (class08019)entry.getValue();
                class080192.N(class037342.N().R());
                this.i.put(class037342.y(), class080192);
                if (this.R != null) {
                    this.R.N(class037342, class080192);
                }
                if (class080772.u() || !class080192.N()) continue;
                if ((class03448)this.y.T_3 != null) {
                    this.L.N((class07299)((class03448)this.y.T_3), class037342.y());
                }
                Optional var6 = class037342.N().L();
                if (!class080772.M() || !var6.isPresent() || !((class06513)var6.get()).B()) continue;
                this.y.m().N((class04680)new class04683(class037342.y()));
                continue;
            }
            N.warn("Server informed client about progress for unknown advancement {}", entry.getKey());
        }
    }

    public void N(@Nullable class03711 class037112, boolean bl) {
        class01683 class016832 = this.y.NE();
        if (class016832 != null && class037112 != null && bl) {
            class016832.N((class00381)class07339.N((class03711)class037112));
        }
        if (this.M != class037112) {
            this.M = class037112;
            if (this.R != null) {
                this.R.N(class037112);
            }
        }
    }

    public class07166 N() {
        return this.u;
    }
}

