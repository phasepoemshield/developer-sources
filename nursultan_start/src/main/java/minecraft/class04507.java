/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10972
 *  Nursultan.class11806
 *  Nursultan.class11816
 *  Nursultan.class11938
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class00392
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00772
 *  minecraft.class01237
 *  minecraft.class01383
 *  minecraft.class01421
 *  minecraft.class01590
 *  minecraft.class01781
 *  minecraft.class02566
 *  minecraft.class02607
 *  minecraft.class02726
 *  minecraft.class03042
 *  minecraft.class03831
 *  minecraft.class04782
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07376
 *  minecraft.class07504
 *  minecraft.class08050
 *  minecraft.class08337
 *  minecraft.class08453
 *  minecraft.class08800
 *  minecraft.class08804
 *  net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer
 *  net.caffeinemc.mods.sodium.mixin.core.render.world.EntityRendererAccessor
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10972;
import Nursultan.class11806;
import Nursultan.class11816;
import Nursultan.class11938;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import minecraft.class00392;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00772;
import minecraft.class01237;
import minecraft.class01383;
import minecraft.class01421;
import minecraft.class01590;
import minecraft.class01781;
import minecraft.class02566;
import minecraft.class02607;
import minecraft.class02726;
import minecraft.class03042;
import minecraft.class03831;
import minecraft.class04782;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07376;
import minecraft.class07504;
import minecraft.class08050;
import minecraft.class08337;
import minecraft.class08453;
import minecraft.class08800;
import minecraft.class08804;
import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import net.caffeinemc.mods.sodium.mixin.core.render.world.EntityRendererAccessor;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class04507<T extends class07049, S extends class08800>
implements EntityRendererAccessor {
    private static final float field_61797 = 0.5f;
    private static final float field_61798 = 32.0f;
    public static final float field_32921 = 0.025f;
    protected final class01781 field_4676;
    private final class01590 field_27761;
    protected float field_4673;
    protected float field_4672 = 1.0f;
    private static final NamespacedId NAME_TAG_ID = new NamespacedId("minecraft", "name_tag");
    private int lastId = -100;

    public class04507(class04832 class048322) {
        this.field_4676 = class048322.N();
        this.field_27761 = class048322.z();
    }

    private void handler$cgl000$nursultan$injectGetAndUpdateRenderState(class07049 class070492, float f, CallbackInfoReturnable callbackInfoReturnable) {
        class08800 class088002 = (class08800)callbackInfoReturnable.getReturnValue();
        if (class088002 instanceof class11806) {
            ((class11816)((class11806)class088002).dataManager()).N().N((Object)class070492);
        }
    }

    private boolean wrapOperation$cll000$sodium$preShouldRender(class01383 class013832, class00734 class007342, Operation operation, class07049 class070492) {
        SodiumWorldRenderer sodiumWorldRenderer = SodiumWorldRenderer.instanceNullable();
        if (sodiumWorldRenderer == null) {
            return (Boolean)operation.call(new Object[]{class013832, class007342});
        }
        return sodiumWorldRenderer.isEntityVisible(this, class070492) && (Boolean)operation.call(new Object[]{class013832, class007342}) != false;
    }

    private boolean wrapWithCondition$cgl000$nursultan$injectRender(class04507 class045072, class08800 class088002, class01421 class014212, class01237 class012372, class06959 class069592) {
        class10972 class109722 = class10972.N((class08800)class088002);
        class11938.L().L((Object)class109722);
        return !class109722.y();
    }

    public void method_62354(T t, S s, float f) {
        class07049 class070492;
        class02726 class027262;
        class07504 class075042;
        class07049 class070493;
        ((class08800)s).U = t.method_5864();
        ((class08800)s).E = class04995.u((double)f, (double)((class07049)t).field_6038, (double)t.method_23317());
        ((class08800)s).W = class04995.u((double)f, (double)((class07049)t).field_5971, (double)t.method_23318());
        ((class08800)s).m = class04995.u((double)f, (double)((class07049)t).field_5989, (double)t.method_23321());
        ((class08800)s).v = t.method_5767();
        ((class08800)s).P = (float)((class07049)t).field_6012 + f;
        ((class08800)s).s = t.method_17681();
        ((class08800)s).T = t.method_17682();
        ((class08800)s).b = t.method_5751();
        if (t.method_5765() && (class070493 = t.method_5854()) instanceof class07504 && (class070493 = (class075042 = (class07504)class070493).N()) instanceof class02726 && (class027262 = (class02726)class070493).P()) {
            double d = class04995.u((double)f, (double)class075042.field_6038, (double)class075042.method_23317());
            double d2 = class04995.u((double)f, (double)class075042.field_5971, (double)class075042.method_23318());
            double d3 = class04995.u((double)f, (double)class075042.field_5989, (double)class075042.method_23321());
            ((class08800)s).d = class027262.i(f).u(new class06889(d, d2, d3));
        } else {
            ((class08800)s).d = null;
        }
        if (this.field_4676.y != null) {
            boolean bl;
            ((class08800)s).j = this.field_4676.y(t);
            boolean bl2 = bl = ((class08800)s).j < 4096.0 && this.method_3921(t, ((class08800)s).j);
            if (bl) {
                ((class08800)s).w = this.method_62426(t);
                ((class08800)s).k = t.method_56072().N(class03831.field_47745, 0, t.method_61415(f));
            } else {
                ((class08800)s).w = null;
            }
        }
        ((class08800)s).n = t.method_21751();
        class075042 = t.method_73183();
        if (t instanceof class02607 && (class070492 = (class027262 = (class02607)t).yW()) instanceof class07049) {
            int n;
            class07049 class070494 = class070492;
            float f2 = t.method_60951(f) * ((float)Math.PI / 180);
            class06889 class068892 = class027262.M(f);
            class07209 class072092 = class07209.method_49638((class00737)t.method_5836(f));
            class07209 class072093 = class07209.method_49638((class00737)class070494.method_5836(f));
            int n2 = this.method_24087(t, class072092);
            int n3 = this.field_4676.N(class070494).method_24087(class070494, class072093);
            int n4 = class075042.method_8314(class00772.field_9284, class072092);
            int n5 = class075042.method_8314(class00772.field_9284, class072093);
            boolean bl = class070494.method_70986() && class027262.aa_();
            int n6 = n = bl ? 4 : 1;
            if (((class08800)s).Y == null || ((class08800)s).Y.size() != n) {
                ((class08800)s).Y = new ArrayList(n);
                for (int i = 0; i < n; ++i) {
                    ((class08800)s).Y.add(new class08804());
                }
            }
            if (bl) {
                float f3 = class070494.method_60951(f) * ((float)Math.PI / 180);
                class06889 class068893 = class070494.method_30950(f);
                class06889[] class06889Array = class027262.ab_();
                class06889[] class06889Array2 = class070494.method_70985();
                for (int i = 0; i < n; ++i) {
                    class08804 class088042 = (class08804)((class08800)s).Y.get(i);
                    class088042.N = class06889Array[i].y(-f2);
                    class088042.y = t.method_30950(f).i(class088042.N);
                    class088042.L = class068893.i(class06889Array2[i].y(-f3));
                    class088042.u = n2;
                    class088042.i = n3;
                    class088042.R = n4;
                    class088042.M = n5;
                    class088042.B = false;
                }
            } else {
                class06889 class068894 = class068892.y(-f2);
                class08804 class088043 = (class08804)((class08800)s).Y.getFirst();
                class088043.N = class068894;
                class088043.y = t.method_30950(f).i(class068894);
                class088043.L = class070494.method_30951(f);
                class088043.u = n2;
                class088043.i = n3;
                class088043.R = n4;
                class088043.M = n5;
            }
        } else {
            ((class08800)s).Y = null;
        }
        ((class08800)s).t = t.method_5862();
        class027262 = class06202.Nq();
        boolean bl = class027262.y(t);
        ((class08800)s).l = bl ? class02566.M((int)t.method_22861()) : 0;
        ((class08800)s).G = this.method_24088(t, f);
    }

    public void method_3936(S s, class01421 class014212, class01237 class012372, class06959 class069592) {
        block2: {
            class06959 class069593;
            class01237 class012373;
            class01421 class014213;
            S s2;
            class04507 class045072;
            if (((class08800)s).Y != null) {
                for (class08804 class088042 : ((class08800)s).Y) {
                    class012372.N(class014212, class088042);
                }
            }
            if (!this.wrapWithCondition$cgl000$nursultan$injectRender(class045072 = this, (class08800)(s2 = s), class014213 = class014212, class012373 = class012372, class069593 = class069592)) break block2;
            class045072.method_3926(s2, class014213, class012373, class069593);
        }
    }

    protected void method_73154(T t, S s) {
        class06202 class062022 = class06202.Nq();
        class07299 class072992 = t.method_73183();
        this.method_72979(s, class062022, class072992);
    }

    public class00734 method_62358(T t) {
        return t.method_5829();
    }

    public abstract S method_55269();

    public class01590 method_3932() {
        return this.field_27761;
    }

    protected @Nullable class00392 method_62426(T t) {
        return t.method_5476();
    }

    protected boolean method_3921(T t, double d) {
        return t.method_5733() || t.method_16914() && t == this.field_4676.L;
    }

    protected float method_55831(S s) {
        return this.field_4673;
    }

    protected float method_65247(S s) {
        return this.field_4672;
    }

    private void method_72979(S s, class06202 class062022, class07299 class072992) {
        ((class08800)s).O.clear();
        if (((Boolean)((class05630)class062022.i_7).Ny().method_41753()).booleanValue() && !((class08800)s).v) {
            double d;
            float f;
            float f2;
            ((class08800)s).Q = f2 = Math.min(this.method_55831(s), 32.0f);
            if (f2 > 0.0f && (f = (float)((1.0 - (d = ((class08800)s).j) / 256.0) * (double)this.method_65247(s))) > 0.0f) {
                int n = class04995.N((double)(((class08800)s).E - (double)f2));
                int n2 = class04995.N((double)(((class08800)s).E + (double)f2));
                int n3 = class04995.N((double)(((class08800)s).m - (double)f2));
                int n4 = class04995.N((double)(((class08800)s).m + (double)f2));
                float f3 = Math.min(f / 0.5f - 1.0f, f2);
                int n5 = class04995.N((double)(((class08800)s).W - (double)f3));
                int n6 = class04995.N((double)((class08800)s).W);
                class07218 class072182 = new class07218();
                for (int i = n3; i <= n4; ++i) {
                    for (int j = n; j <= n2; ++j) {
                        class072182.N(j, 0, i);
                        class08050 class080502 = class072992.method_8500((class07209)class072182);
                        for (int k = n5; k <= n6; ++k) {
                            class072182.method_10099(k);
                            this.method_72978(s, class072992, f, class072182, class080502);
                        }
                    }
                }
            }
        } else {
            ((class08800)s).Q = 0.0f;
        }
    }

    protected boolean method_62406(T t) {
        return true;
    }

    public boolean method_3933(T t, class01383 class013832, double d, double d2, double d3) {
        class07049 class070492;
        class00734 class007342;
        class01383 class013833;
        if (!t.method_5727(d, d2, d3)) {
            return false;
        }
        if (!this.method_62406(t)) {
            return true;
        }
        class00734 class007343 = this.method_62358(t).M(0.5);
        if (class007343.i() || class007343.N() == 0.0) {
            class007343 = new class00734(t.method_23317() - 2.0, t.method_23318() - 2.0, t.method_23321() - 2.0, t.method_23317() + 2.0, t.method_23318() + 2.0, t.method_23321() + 2.0);
        }
        if (this.wrapOperation$cll000$sodium$preShouldRender(class013833 = class013832, class007342 = class007343, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_4604, net.minecraft.class_238]");
            return ((class01383)objectArray[0]).method_23093((class00734)objectArray[1]);
        }, (class07049)t)) {
            return true;
        }
        if (t instanceof class02607 && (class070492 = ((class02607)t).yW()) != null) {
            class00734 class007344 = this.field_4676.N(class070492).method_62358(class070492);
            return class013832.method_23093(class007344) || class013832.method_23093(class007343.y(class007344));
        }
        return false;
    }

    protected void method_3926(S s, class01421 class014212, class01237 class012372, class06959 class069592) {
        if (((class08800)s).w != null) {
            class012372.N(class014212, ((class08800)s).k, 0, ((class08800)s).w, !((class08800)s).n, ((class08800)s).G, ((class08800)s).j, class069592);
        }
    }

    public class06889 method_23169(S s) {
        if (((class08800)s).d != null) {
            return ((class08800)s).d;
        }
        return class06889.L;
    }

    public int method_24087(T t, class07209 class072092) {
        if (t.method_5809()) {
            return 15;
        }
        return t.method_73183().method_8314(class00772.field_9282, class072092);
    }

    protected int method_27950(T t, class07209 class072092) {
        return t.method_73183().method_8314(class00772.field_9284, class072092);
    }

    public final int method_24088(T t, float f) {
        class07209 class072092 = class07209.method_49638((class00737)t.method_31166(f));
        return class03042.N((int)this.method_24087(t, class072092), (int)this.method_27950(t, class072092));
    }

    private static @Nullable class07049 method_68837(class07049 class070492) {
        class04782 class047822;
        class08337 class083372 = class06202.Nq().Na();
        if (class083372 != null && (class047822 = class083372.N(class070492.method_73183().method_27983())) != null) {
            return class047822.method_8469(class070492.method_5628());
        }
        return null;
    }

    private void method_72978(S s, class07299 class072992, float f, class07218 class072182, class08050 class080502) {
        float f2 = f - (float)(((class08800)s).W - (double)class072182.method_10264()) * 0.5f;
        class07209 class072092 = class072182.method_10074();
        class00500 class005002 = class080502.method_8320(class072092);
        if (class005002.b() == class06898.field_11455) {
            return;
        }
        int n = class072992.U((class07209)class072182);
        if (n <= 3) {
            return;
        }
        if (!class005002.W((class07290)class080502, class072092)) {
            return;
        }
        class00494 class004942 = class005002.R((class07290)class080502, class072092);
        if (class004942.method_1110()) {
            return;
        }
        float f3 = class04995.N((float)(f2 * 0.5f * class03042.N((class07376)class072992.method_8597(), (int)n)), (float)0.0f, (float)1.0f);
        float f4 = (float)((double)class072182.method_10263() - ((class08800)s).E);
        float f5 = (float)((double)class072182.method_10264() - ((class08800)s).W);
        float f6 = (float)((double)class072182.method_10260() - ((class08800)s).m);
        ((class08800)s).O.add(new class08453(f4, f5, f6, class004942, f3));
    }

    public final S method_62425(T t, float f) {
        S s = this.method_55269();
        this.method_62354(t, s, f);
        this.method_73154(t, s);
        S s2 = s;
        this.handler$cgl000$nursultan$injectGetAndUpdateRenderState((class07049)t, f, new CallbackInfoReturnable("", false, s2));
        return s2;
    }

    public /* synthetic */ class00734 sodium$getBoundingBoxForCulling(class07049 class070492) {
        return this.method_62358(class070492);
    }
}

