/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02071
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04654
 *  minecraft.class04702
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05190
 *  minecraft.class05220
 *  minecraft.class05231
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class05944
 *  minecraft.class06202
 *  minecraft.class06434
 *  minecraft.class06478
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04654;
import minecraft.class04702;
import minecraft.class04733;
import minecraft.class04734;
import minecraft.class04736;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05190;
import minecraft.class05220;
import minecraft.class05231;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class05944;
import minecraft.class06202;
import minecraft.class06434;
import minecraft.class06478;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04720
extends class05407 {
    private static final Logger L = LogUtils.getLogger();
    public static final class00392 N = class00392.L((String)"mco.upload.select.world.title");
    private static final class00392 u = class00392.L((String)"selectWorld.unable_to_load");
    private final @Nullable class04734 i;
    private final class04736 R;
    private final long M;
    private final int B;
    private final class03686 Z;
    protected @Nullable class04927 y;
    private @Nullable class05231 z;
    private @Nullable class05362 U;

    public class04720(@Nullable class04734 class047342, long l, int n, class04736 class047362) {
        super(N);
        Objects.requireNonNull((class01590)class06202.Nq().i_3);
        this.Z = new class03686((class05096)this, 8 + 9 + 8 + 20 + 4, 33);
        this.i = class047342;
        this.R = class047362;
        this.M = l;
        this.B = n;
    }

    private void N(class05944 class059442) {
        this.field_22787.N((class05096)new class04733(this.i, this.M, this.B, this.R, class059442.z()));
    }

    private void N(@Nullable class06434 class064342) {
        if (this.z != null && this.U != null) {
            this.U.field_22763 = this.z.method_25334() != null;
        }
    }

    public void method_25426() {
        class01885 class018852 = (class01885)this.Z.N((class02102)class01885.u().N(4));
        class018852.L().y();
        class018852.N((class02102)new class02071(this.field_22785, this.field_22793));
        this.y = (class04927)class018852.N((class02102)new class04927(this.field_22793, this.field_22789 / 2 - 100, 22, 200, 20, this.y, (class00392)class00392.L((String)"selectWorld.search")));
        this.y.method_1863(string -> {
            if (this.z != null) {
                this.z.N(string);
            }
        });
        try {
            this.z = (class05231)this.Z.L((class02102)new class05190(this.field_22787, (class05096)this).N(this.field_22789).y(this.Z.u()).N(this.y.method_1882()).N(this.z).N().N(this::N).y(this::N).y());
        }
        catch (Exception exception) {
            L.error("Couldn't load level list", (Throwable)exception);
            this.field_22787.N((class05096)new class04702(u, class00392.N((String)exception.getMessage()), (class05096)this.R));
            return;
        }
        class01885 class018853 = (class01885)this.Z.y((class02102)class01885.i().N(8));
        class018853.L().y();
        this.U = (class05362)class018853.N((class02102)class05362.method_46430((class00392)class00392.L((String)"mco.upload.button.name"), class053622 -> this.z.L().ifPresent(this::N)).N());
        class018853.N((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N());
        this.N((class06434)null);
        this.Z.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    protected void method_56131() {
        this.method_48265((class04654)this.y);
    }

    public void method_48640() {
        if (this.z != null) {
            this.z.method_57712(this.field_22789, this.Z);
        }
        this.Z.N();
    }

    public void method_25419() {
        this.field_22787.N((class05096)this.R);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{this.method_25440(), this.z()});
    }
}

