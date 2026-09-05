/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02060
 *  minecraft.class02071
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class03776
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05934
 *  minecraft.class05944
 *  minecraft.class05964
 *  minecraft.class05978
 *  minecraft.class06202
 *  minecraft.class06290
 *  minecraft.class06434
 *  minecraft.class06478
 *  minecraft.class07086
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07312
 *  minecraft.class07529
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02060;
import minecraft.class02071;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class03776;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05190;
import minecraft.class05213;
import minecraft.class05220;
import minecraft.class05231;
import minecraft.class05362;
import minecraft.class05934;
import minecraft.class05944;
import minecraft.class05964;
import minecraft.class05978;
import minecraft.class06202;
import minecraft.class06290;
import minecraft.class06434;
import minecraft.class06478;
import minecraft.class07086;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07312;
import minecraft.class07529;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05205
extends class05096 {
    private static final Logger u = LogUtils.getLogger();
    public static final class05934 N = new class05934((long)"test1".hashCode(), true, false);
    protected final class05096 y;
    private final class03686 i;
    private @Nullable class05362 R;
    private @Nullable class05362 M;
    private @Nullable class05362 B;
    private @Nullable class05362 Z;
    protected @Nullable class04927 L;
    private @Nullable class05231 z;

    public class05205(class05096 class050962) {
        super((class00392)class00392.L((String)"selectWorld.title"));
        Objects.requireNonNull((class01590)class06202.Nq().i_3);
        this.i = new class03686((class05096)this, 8 + 9 + 8 + 20 + 4, 60);
        this.y = class050962;
    }

    private class05362 N() {
        return class05362.method_46430((class00392)class00392.y((String)"DEBUG recreate"), class053622 -> {
            try {
                Object object;
                class05978 class059782;
                String string = "DEBUG world";
                if (this.z != null && !this.z.method_25396().isEmpty() && (class059782 = (class05978)this.z.method_25396().getFirst()) instanceof class05944 && (object = (class05944)class059782).Z().equals("DEBUG world")) {
                    object.u();
                }
                class059782 = new class07312("DEBUG world", class07282.field_9219, false, class07086.field_5802, true, new class07305(class03776.u.y()), class03776.u);
                object = class06290.N((Path)this.field_22787.NL().L(), (String)"DEBUG world", (String)"");
                this.field_22787.S().N((String)object, (class07312)class059782, N, class05964::N, (class05096)this);
            }
            catch (IOException iOException) {
                u.error("Failed to recreate the debug world", (Throwable)iOException);
            }
        }).N(72).N();
    }

    public void N(@Nullable class06434 class064342) {
        if (this.M == null || this.B == null || this.Z == null || this.R == null) {
            return;
        }
        if (class064342 == null) {
            this.M.method_25355(class06434.N);
            this.M.field_22763 = false;
            this.B.field_22763 = false;
            this.Z.field_22763 = false;
            this.R.field_22763 = false;
        } else {
            this.M.method_25355(class064342.v());
            this.M.field_22763 = class064342.n();
            this.B.field_22763 = class064342.G();
            this.Z.field_22763 = class064342.l();
            this.R.field_22763 = class064342.d();
        }
    }

    private void N(Consumer<class05944> consumer, class05231 class052312) {
        class02060 class020602 = (class02060)this.i.y((class02102)new class02060().N(8).y(4));
        class020602.L().y();
        class02080 class020802 = class020602.u(4);
        this.M = (class05362)class020802.N((class02102)class05362.method_46430((class00392)class06434.N, class053622 -> class052312.L().ifPresent(consumer)).N(), 2);
        class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectWorld.create"), class053622 -> class05213.N(this.field_22787, class052312::u)).N(), 2);
        this.B = (class05362)class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectWorld.edit"), class053622 -> class052312.L().ifPresent(class05944::i)).N(71).N());
        this.R = (class05362)class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectWorld.delete"), class053622 -> class052312.L().ifPresent(class05944::L)).N(71).N());
        this.Z = (class05362)class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"selectWorld.recreate"), class053622 -> class052312.L().ifPresent(class05944::R)).N(71).N());
        class020802.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.field_22787.N(this.y)).N(71).N());
    }

    public void method_25426() {
        class01885 class018852 = (class01885)this.i.N((class02102)class01885.u().N(4));
        class018852.L().y();
        class018852.N((class02102)new class02071(this.field_22785, this.field_22793));
        class01885 class018853 = (class01885)class018852.N((class02102)class01885.i().N(4));
        if (class07529.Nc) {
            class018853.N((class02102)this.N());
        }
        this.L = (class04927)class018853.N((class02102)new class04927(this.field_22793, this.field_22789 / 2 - 100, 22, 200, 20, this.L, (class00392)class00392.L((String)"selectWorld.search")));
        this.L.method_1863(string -> {
            if (this.z != null) {
                this.z.N((String)string);
            }
        });
        this.L.method_47404((class00392)class00392.L((String)"gui.selectWorld.search").y(class04927.field_62466));
        Consumer<class05944> consumer = class05944::y;
        this.z = (class05231)this.i.L((class02102)new class05190(this.field_22787, this).N(this.field_22789).y(this.i.u()).N(this.L.method_1882()).N(this.z).N(this::N).y(consumer).y());
        this.N(consumer, this.z);
        this.i.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
        this.N((class06434)null);
    }

    protected void method_56131() {
        if (this.L != null) {
            this.method_48265((class04654)this.L);
        }
    }

    public void method_48640() {
        if (this.z != null) {
            this.z.method_57712(this.field_22789, this.i);
        }
        this.i.N();
    }

    public void method_25432() {
        if (this.z != null) {
            this.z.method_25396().forEach(class05978::close);
        }
    }

    public void method_25419() {
        this.field_22787.N(this.y);
    }
}

