/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01292
 *  minecraft.class01590
 *  minecraft.class01885
 *  minecraft.class02057
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03103
 *  minecraft.class03142
 *  minecraft.class03255
 *  minecraft.class04654
 *  minecraft.class04680
 *  minecraft.class04785
 *  minecraft.class04927
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05071
 *  minecraft.class05096
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class06095
 *  minecraft.class06132
 *  minecraft.class06202
 *  minecraft.class06290
 *  minecraft.class06434
 *  minecraft.class06478
 *  minecraft.class06541
 *  minecraft.class06601
 *  minecraft.class07536
 *  org.apache.commons.io.FileUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01292;
import minecraft.class01590;
import minecraft.class01885;
import minecraft.class02057;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03103;
import minecraft.class03142;
import minecraft.class03255;
import minecraft.class04654;
import minecraft.class04680;
import minecraft.class04785;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05071;
import minecraft.class05096;
import minecraft.class05210;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class06095;
import minecraft.class06132;
import minecraft.class06202;
import minecraft.class06290;
import minecraft.class06434;
import minecraft.class06478;
import minecraft.class06541;
import minecraft.class06601;
import minecraft.class07536;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;

public class class05227
extends class05096 {
    private static final Logger N = LogUtils.getLogger();
    private static final class00392 y = class00392.L((String)"selectWorld.enterName").N(class06541.field_1080);
    private static final class00392 L = class00392.L((String)"selectWorld.edit.resetIcon");
    private static final class00392 u = class00392.L((String)"selectWorld.edit.openFolder");
    private static final class00392 i = class00392.L((String)"selectWorld.edit.backup");
    private static final class00392 R = class00392.L((String)"selectWorld.edit.backupFolder");
    private static final class00392 M = class00392.L((String)"selectWorld.edit.optimize");
    private static final class00392 B = class00392.L((String)"optimizeWorld.confirm.title");
    private static final class00392 Z = class00392.L((String)"optimizeWorld.confirm.description");
    private static final class00392 z = class00392.L((String)"optimizeWorld.confirm.proceed");
    private static final class00392 U = class00392.L((String)"selectWorld.edit.save");
    private static final int E = 200;
    private static final int W = 4;
    private static final int m = 98;
    private final class01885 P = class01885.u().N(5);
    private final BooleanConsumer s;
    private final class04785 T;
    private final class04927 b;

    private static /* synthetic */ void L(class04785 class047852, class05362 class053622) {
        class047852.z().ifPresent(path -> FileUtils.deleteQuietly((File)path.toFile()));
        class053622.field_22763 = false;
    }

    private class05227(class06202 class062022, class04785 class047852, String string2, BooleanConsumer booleanConsumer) {
        super((class00392)class00392.L((String)"selectWorld.edit.title"));
        this.s = booleanConsumer;
        this.T = class047852;
        class01590 class015902 = (class01590)class062022.i_3;
        this.P.N((class02102)new class02057(200, 20));
        this.P.N((class02102)new class02071(y, class015902));
        this.b = (class04927)this.P.N((class02102)new class04927(class015902, 200, 20, y));
        this.b.method_1852(string2);
        class01885 class018852 = class01885.i().N(4);
        class05362 class053623 = (class05362)class018852.N((class02102)class05362.method_46430((class00392)U, class053622 -> this.N(this.b.method_1882())).N(98).N());
        class018852.N((class02102)class05362.method_46430((class00392)class05220.i, class053622 -> this.method_25419()).N(98).N());
        this.b.method_1863(string -> {
            class053622.field_22763 = !class05018.B((String)string);
        });
        ((class05362)this.P.N((class02102)class05362.method_46430((class00392)class05227.L, (class05361)(class05361)LambdaMetafactory.metafactory(null, null, null, (Lminecraft/class05362;)V, L(minecraft.class04785 minecraft.class05362 ), (Lminecraft/class05362;)V)((class04785)class047852)).N((int)200).N())).field_22763 = class047852.z().filter(path -> Files.isRegularFile(path, new LinkOption[0])).isPresent();
        this.P.N((class02102)class05362.method_46430((class00392)u, class053622 -> class07536.m().N(class047852.N(class05071.E))).N(200).N());
        this.P.N((class02102)class05362.method_46430((class00392)i, class053622 -> {
            boolean bl = class05227.N(class047852);
            this.s.accept(!bl);
        }).N(200).N());
        this.P.N((class02102)class05362.method_46430((class00392)R, class053622 -> {
            Path path = class062022.NL().u();
            try {
                class06290.L((Path)path);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
            class07536.m().N(path);
        }).N(200).N());
        this.P.N((class02102)class05362.method_46430((class00392)M, class053622 -> class062022.N((class05096)new class01292(() -> class062022.N((class05096)this), (bl, bl2) -> {
            if (bl) {
                class05227.N(class047852);
            }
            class062022.N((class05096)class05210.N(class062022, this.s, class062022.Nh(), class047852, bl2));
        }, B, Z, z, true))).N(200).N());
        this.P.N((class02102)new class02057(200, 20));
        this.P.N((class02102)class018852);
        this.P.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
    }

    public static class05227 N(class06202 class062022, class04785 class047852, BooleanConsumer booleanConsumer) throws IOException {
        class06434 class064342 = class047852.N(class047852.B());
        return new class05227(class062022, class047852, class064342.y(), booleanConsumer);
    }

    private void N(String string) {
        try {
            this.T.N(string);
        }
        catch (IOException | class03103 | class03142 throwable) {
            N.error("Failed to access world '{}'", (Object)this.T.R(), (Object)throwable);
            class06132.N((class06202)this.field_22787, (String)this.T.R());
        }
        this.s.accept(true);
    }

    public static boolean N(class04785 class047852) {
        long l = 0L;
        IOException iOException = null;
        try {
            l = class047852.E();
        }
        catch (IOException iOException2) {
            iOException = iOException2;
        }
        if (iOException != null) {
            class05216 class052162 = class00392.L((String)"selectWorld.edit.backupFailed");
            class05216 class052163 = class00392.y((String)iOException.getMessage());
            class06202.Nq().m().N((class04680)new class06132(class06095.y, (class00392)class052162, (class00392)class052163));
            return false;
        }
        class05216 class052164 = class00392.N((String)"selectWorld.edit.backupCreated", (Object[])new Object[]{class047852.R()});
        class05216 class052165 = class00392.N((String)"selectWorld.edit.backupSize", (Object[])new Object[]{class04995.L((double)((double)l / 1048576.0))});
        class06202.Nq().m().N((class04680)new class06132(class06095.y, (class00392)class052164, (class00392)class052165));
        return true;
    }

    public void method_25426() {
        this.method_48640();
    }

    protected void method_56131() {
        this.method_48265((class04654)this.b);
    }

    public boolean method_25404(class06601 class066012) {
        if (this.b.method_25370() && class066012.u()) {
            this.N(this.b.method_1882());
            this.method_25419();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_48640() {
        this.P.N();
        class02077.N((class02102)this.P, (class03255)this.method_48202());
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 15, -1);
    }

    public void method_25419() {
        this.s.accept(false);
    }
}

