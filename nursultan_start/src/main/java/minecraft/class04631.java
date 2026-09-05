/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09458
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class01246
 *  minecraft.class01274
 *  minecraft.class03063
 *  minecraft.class04343
 *  minecraft.class04344
 *  minecraft.class04369
 *  minecraft.class04370
 *  minecraft.class04760
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05630
 *  minecraft.class05801
 *  minecraft.class05914
 *  minecraft.class06202
 *  minecraft.class06221
 *  minecraft.class06366
 *  minecraft.class06478
 *  minecraft.class06532
 *  minecraft.class06541
 *  minecraft.class06613
 *  minecraft.class08844
 *  net.irisshaders.iris.gui.option.IrisVideoSettings
 *  net.irisshaders.iris.gui.screen.ShaderPackScreen
 */
package minecraft;

import Nursultan.class09458;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01246;
import minecraft.class01274;
import minecraft.class03063;
import minecraft.class04343;
import minecraft.class04344;
import minecraft.class04369;
import minecraft.class04370;
import minecraft.class04760;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05630;
import minecraft.class05801;
import minecraft.class05914;
import minecraft.class06202;
import minecraft.class06221;
import minecraft.class06366;
import minecraft.class06478;
import minecraft.class06532;
import minecraft.class06541;
import minecraft.class06613;
import minecraft.class08844;
import net.irisshaders.iris.gui.option.IrisVideoSettings;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;

public class class04631
extends class05914 {
    private static final class00392 N = class00392.L((String)"options.videoTitle");
    private static final class00392 y = class00392.L((String)"options.improvedTransparency").N(class06541.field_1056);
    private static final class00392 L = class00392.N((String)"options.graphics.warning.message", (Object[])new Object[]{y, y});
    private static final class00392 u = class00392.L((String)"options.graphics.warning.title").N(class06541.field_1061);
    private static final class00392 i = class00392.L((String)"options.graphics.warning.accept");
    private static final class00392 R = class00392.L((String)"options.graphics.warning.cancel");
    private static final class00392 M = class00392.L((String)"options.video.display.header");
    private static final class00392 B = class00392.L((String)"options.video.quality.header");
    private static final class00392 Z = class00392.L((String)"options.video.preferences.header");
    private final class01246 z;
    private final int U;
    private final int E;
    private final class06532 W;

    private static class04370<?>[] L(class05630 class056302) {
        return new class04370[]{class056302.NG(), class056302.P(), class056302.X(), class056302.b()};
    }

    public class04631(class05096 class050962, class06202 class062022, class05630 class056302) {
        super(class050962, class056302, N);
        this.z = class062022.Ns();
        this.z.R();
        if (((Boolean)class056302.s().method_41753()).booleanValue()) {
            this.z.u();
        }
        this.U = (Integer)class056302.V().method_41753();
        this.E = (Integer)class056302.e().method_41753();
        this.W = (class06532)class056302.c().method_41753();
    }

    private static class04370<?>[] y(class05630 class056302) {
        return new class04370[]{class056302.B(), class056302.NN(), class056302.z(), class056302.Nq(), class056302.NP(), class056302.No()};
    }

    public void N() {
        class04370 var1;
        class06478 class064782;
        if (this.field_51824 != null && (class064782 = this.field_51824.y(var1 = this.field_21336.s())) != null) {
            ((class06366)class064782).N((Object)((Boolean)var1.method_41753()));
        }
    }

    private class04370[] N(class04370[] class04370Array) {
        class04370[] class04370Array2 = new class04370[class04370Array.length + 2];
        System.arraycopy(class04370Array, 0, class04370Array2, 0, class04370Array.length);
        class04370Array2[class04370Array2.length - 2] = new class04370("options.iris.shaderPackSelection", class04370.method_42717((class00392)class00392.i()), (class003922, bl) -> class00392.i(), (class04344)class04370.field_38278, (Object)true, bl -> this.field_22787.N((class05096)new ShaderPackScreen((class05096)this)));
        class04370Array2[class04370Array2.length - 1] = IrisVideoSettings.RENDER_DISTANCE;
        return class04370Array2;
    }

    private static class04370<?>[] N(class05630 class056302) {
        return new class04370[]{class056302.a(), class056302.i(), class056302.j(), class056302.R(), class056302.T(), class056302.U(), class056302.NK(), class056302.V(), class056302.Ny(), class056302.M(), class056302.G(), class056302.E(), class056302.m(), class056302.s(), class056302.c(), class056302.e(), class056302.W()};
    }

    public void N(boolean bl) {
        class06478 class064782;
        if (this.field_51824 != null && (class064782 = this.field_51824.y(this.field_21336.NP())) != null) {
            ((class06366)class064782).N((Object)bl);
        }
    }

    public void method_25393() {
        class06478 class064782;
        if (this.field_51824 != null && (class064782 = this.field_51824.y(this.field_21336.e())) instanceof class05801) {
            ((class05801)class064782).field_22763 = this.field_21336.c().method_41753() == class06532.field_64665;
        }
        super.method_25393();
    }

    public void method_25432() {
        if ((Integer)this.field_21336.V().method_41753() != this.U || (Integer)this.field_21336.e().method_41753() != this.E || this.field_21336.c().method_41753() != this.W) {
            this.field_22787.N(((Integer)this.field_21336.V().method_41753()).intValue());
            this.field_22787.Nw();
        }
        super.method_25432();
    }

    public void method_25419() {
        this.field_22787.Nt().R();
        super.method_25419();
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.field_22787.s()) {
            class04370 var9 = this.field_21336.Nq();
            class04344 var11 = var9.method_41754();
            if (var11 instanceof class04343) {
                class06366 class063662;
                class04343 class043432 = (class04343)var11;
                int n = (Integer)var9.method_41753();
                int n2 = (n == 0 ? class043432.L() + 1 : n) + (int)Math.signum(d4);
                if (n2 != 0 && n2 <= class043432.L() && n2 >= class043432.aA_() && (class063662 = (class06366)this.field_51824.y(var9)) != null) {
                    var9.method_41748((Object)n2);
                    class063662.N((Object)n2);
                    this.field_51824.method_44382(0.0);
                    return true;
                }
            }
            return false;
        }
        return super.method_25401(d, d2, d3, d4);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (super.method_25402(class066132, bl)) {
            if (this.z.i()) {
                String string;
                String string2;
                ArrayList arrayList = Lists.newArrayList((Object[])new class00392[]{L, class05220.n});
                String string3 = this.z.M();
                if (string3 != null) {
                    arrayList.add(class05220.n);
                    arrayList.add(class00392.N((String)"options.graphics.warning.renderer", (Object[])new Object[]{string3}).N(class06541.field_1080));
                }
                if ((string2 = this.z.Z()) != null) {
                    arrayList.add(class05220.n);
                    arrayList.add(class00392.N((String)"options.graphics.warning.vendor", (Object[])new Object[]{string2}).N(class06541.field_1080));
                }
                if ((string = this.z.B()) != null) {
                    arrayList.add(class05220.n);
                    arrayList.add(class00392.N((String)"options.graphics.warning.version", (Object[])new Object[]{string}).N(class06541.field_1080));
                }
                this.field_22787.N((class05096)new class01274(u, (List)arrayList, ImmutableList.of((Object)new class09458(i, class053622 -> {
                    this.field_21336.s().method_41748((Object)true);
                    ((class03063)class06202.Nq().B_2).u();
                    this.z.u();
                    this.field_22787.N((class05096)this);
                }), (Object)new class09458(R, class053622 -> {
                    this.z.u();
                    this.field_21336.s().method_41748((Object)false);
                    this.N();
                    this.field_22787.N((class05096)this);
                }))));
            }
            return true;
        }
        return false;
    }

    protected void method_60325() {
        int n2;
        int n3 = -1;
        class08844 class088442 = this.field_22787.Nt();
        class06221 class062212 = class088442.v();
        if (class062212 == null) {
            n2 = -1;
        } else {
            Optional var5 = class088442.i();
            n2 = var5.map(arg_0 -> ((class06221)class062212).N(arg_0)).orElse(-1);
        }
        class04370 class043702 = new class04370("options.fullscreen.resolution", class04370.method_42399(), (class003922, n) -> {
            if (class062212 == null) {
                return class00392.L((String)"options.fullscreen.unavailable");
            }
            if (n == -1) {
                return class05630.N((class00392)class003922, (class00392)class00392.L((String)"options.fullscreen.current"));
            }
            class04760 class047602 = class062212.N(n.intValue());
            return class05630.N((class00392)class003922, (class00392)class00392.N((String)"options.fullscreen.entry", (Object[])new Object[]{class047602.N(), class047602.y(), class047602.R(), class047602.L() + class047602.u() + class047602.i()}));
        }, (class04344)new class04369(-1, class062212 != null ? class062212.i() - 1 : -1), (Object)n2, n -> {
            if (class062212 == null) {
                return;
            }
            class088442.N(n == -1 ? Optional.empty() : Optional.of(class062212.N(n.intValue())));
        });
        this.field_51824.N(M);
        this.field_51824.N(class043702);
        class04370<?>[] var6 = class04631.y(this.field_21336);
        this.field_51824.N(this.N(var6));
        this.field_51824.N(B);
        this.field_51824.N(this.field_21336.Z());
        var6 = class04631.N(this.field_21336);
        this.field_51824.N(this.N(var6));
        this.field_51824.N(Z);
        var6 = class04631.L(this.field_21336);
        this.field_51824.N(this.N(var6));
    }
}

