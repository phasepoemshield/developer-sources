/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09063
 *  Nursultan.class09064
 *  Nursultan.class09069
 *  Nursultan.class09087
 *  Nursultan.class09321
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11175
 *  Nursultan.class11192
 *  Nursultan.class11199
 *  Nursultan.class11213
 *  Nursultan.class11218
 *  Nursultan.class11231
 *  Nursultan.class11232
 *  Nursultan.class11237
 *  Nursultan.class11255
 *  Nursultan.class11263
 *  Nursultan.class11265
 *  Nursultan.class11382
 *  Nursultan.class11494
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11525
 *  Nursultan.class11782
 *  Nursultan.class11908
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  Nursultan.class12012
 *  Nursultan.class12036
 *  Nursultan.class12041
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00509
 *  minecraft.class00681
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class01687
 *  minecraft.class01938
 *  minecraft.class02294
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04477
 *  minecraft.class04507
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06078
 *  minecraft.class06202
 *  minecraft.class06658
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08066
 *  minecraft.class08476
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package Nursultan;

import Nursultan.class09063;
import Nursultan.class09064;
import Nursultan.class09069;
import Nursultan.class09087;
import Nursultan.class09321;
import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11175;
import Nursultan.class11192;
import Nursultan.class11199;
import Nursultan.class11213;
import Nursultan.class11218;
import Nursultan.class11231;
import Nursultan.class11232;
import Nursultan.class11237;
import Nursultan.class11255;
import Nursultan.class11263;
import Nursultan.class11265;
import Nursultan.class11382;
import Nursultan.class11494;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11525;
import Nursultan.class11782;
import Nursultan.class11908;
import Nursultan.class11925;
import Nursultan.class11938;
import Nursultan.class12012;
import Nursultan.class12036;
import Nursultan.class12041;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class00381;
import minecraft.class00509;
import minecraft.class00681;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class01687;
import minecraft.class01938;
import minecraft.class02294;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04507;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06078;
import minecraft.class06202;
import minecraft.class06658;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08066;
import minecraft.class08476;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@class11080(L="KillEffect", y=class11072.VISUAL, N=class11106.WORLD)
public class KillEffect
extends class11067 {
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;
    public Object i_6;
    public Object i_7;
    public boolean i_init;

    public KillEffect() {
        this.b();
        this.u_0 = new HashSet();
        this.u_1 = class09064.N(() -> ((class06202)this.y_0).e().N / 2, () -> ((class06202)this.y_0).e().y / 2).N(class11199.LINEAR, class11199.LINEAR).y(class11175.CLAMP_TO_EDGE).y(true).N().N(() -> !this.U());
        this.u_2 = class11213.N((class09087)((class09087)L_0), (int)65536);
        this.u_3 = class11213.N((class09087)((class09087)class09063.N_2), (int)256, (int)64);
        this.u_4 = class11218.N().N((class11192)new class11231(this, (class11213)this.u_2)).y((class09064)this.u_1).N_3(class093212 -> {
            this.b();
            if (((Boolean)((class11507)this.i_0).i()).booleanValue()) {
                return;
            }
            class11925.N((class08066)((class06202)this.y_0).e(), (class09064)((class09064)this.u_1), (int)0, (int)0, (int)((class06202)this.y_0).e().N, (int)((class06202)this.y_0).e().y, (int)0, (int)0, (int)((class09064)this.u_1).G(), (int)((class09064)this.u_1).u(), (int)256, (int)9728);
        }).N((class11192)new class11255(this, (class11213)this.u_3)).L(() -> ((class06202)((class06202)this.y_0)).e()).L((class09064)this.u_1).N();
        this.i_0 = class11524.N((class11512)this, (String)"behind-walls", (boolean)false);
        this.i_1 = class11524.N((class11512)this, (String)"color", (int)-11104513);
        this.i_2 = class11524.N((class11512)this, (String)"count", (float)30.0f, (float)5.0f, (float)50.0f, (float)1.0f);
        this.i_3 = class11524.N((class11512)this, (String)"duration", (class11494)new class11494(4.0f, 12.0f), (class11494)new class11494(5.0f, 8.0f), (float)1.0f);
        this.i_4 = new ArrayList();
    }

    static {
        KillEffect.l();
        L_0 = new class09087(new class09069[]{class09069.N((int)3).R(), class09069.N((int)1).R(), class09069.y().R()});
        L_1 = new class12012(true, 1, 1, 1, 1);
        L_2 = class12036.u().N((class12012)L_1).N();
    }

    private void b() {
        if (!this.i_init) {
            this.i_init = true;
            this.i_6 = 0;
            this.i_7 = false;
        }
    }

    private static void l() {
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = 100;
    }

    private void t() {
        this.b();
        if (!((Boolean)this.i_7).booleanValue() || class11938.j().y() - (Integer)this.i_6 >= 3) {
            return;
        }
        ((List)this.i_4).add(new class11263((class07438)this.i_5, class11938.j().y()));
        this.i_5 = null;
    }

    @class11782
    public void N(class11382 class113822) {
        class07438 class074382;
        this.b();
        class07049 class070492 = class113822.L();
        if (!(class070492 instanceof class07438) || (class074382 = (class07438)class070492) == (class04453)((class06202)this.y_0).T_4) {
            return;
        }
        this.i_5 = class074382;
        this.i_6 = class11938.j().y();
        this.i_7 = false;
    }

    @class11782
    public void N(class10990 class109902) {
        class00381 class003812 = class109902.u();
        Objects.requireNonNull(class003812);
        class00381 var2 = class003812;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class01938.class, class00509.class, class06658.class}, (Object)var2, (int)n)) {
            case 0: {
                class01938 class019382 = (class01938)var2;
                ((class06202)this.y_0).execute(() -> {
                    this.b();
                    if ((class07438)this.i_5 != null && ((class07438)this.i_5).method_5628() == class019382.N() && class11938.j().y() - (Integer)this.i_6 < 3) {
                        this.i_7 = true;
                    }
                });
                break;
            }
            case 1: {
                class00509 class005092 = (class00509)var2;
                ((class06202)this.y_0).execute(() -> {
                    this.b();
                    if (class005092.N() == 3 && (class03448)((class06202)this.y_0).T_3 != null && (class07438)this.i_5 != null && class005092.N((class07299)((class03448)((class06202)this.y_0).T_3)) == (class07438)this.i_5) {
                        this.t();
                    }
                });
                break;
            }
            case 2: {
                class06658 class066582 = (class06658)var2;
                ((class06202)this.y_0).execute(() -> class066582.N().forEach(n -> {
                    this.b();
                    if ((class07438)this.i_5 != null && ((class07438)this.i_5).method_5628() == n) {
                        this.t();
                    }
                }));
                break;
            }
        }
    }

    @class11782
    public void N(class10996 class109962) {
        this.b();
        int n = class11938.j().y();
        if (!((List)this.i_4).isEmpty()) {
            ((List)this.i_4).removeIf(class112632 -> {
                class07438 class074382 = class112632.y();
                if (class074382.fields_2212a028292fd3c078969e3ee4c71d9e8_2 > 0 || class074382.method_31481()) {
                    this.N(class074382);
                    return true;
                }
                return n - class112632.N() > 100;
            });
        }
        if (((Set)this.u_0).isEmpty()) {
            return;
        }
        Iterator iterator = ((Set)this.u_0).iterator();
        while (iterator.hasNext()) {
            List var4 = ((class11265)iterator.next()).N();
            var4.removeIf(class112322 -> {
                class112322.y();
                return class112322.N();
            });
            if (!var4.isEmpty()) continue;
            iterator.remove();
        }
    }

    private void N(class07438 class074382, class11265 class112652, int n2) {
        class04507 class045072 = ((class06202)this.y_0).Ng().N((class07049)class074382);
        if (!(class045072 instanceof class02294)) {
            return;
        }
        class02294 class022942 = (class02294)class045072;
        class02294 class022943 = class022942;
        class08476 class084762 = (class08476)class022943.method_55269();
        class022943.method_62354(class074382, class084762, 0.0f);
        class06078 var9 = ((class12041)class022943).N();
        var9.method_2819((Object)class084762);
        class01421 class014212 = new class01421();
        float f = class084762.NL;
        class014212.y(f, f, f);
        ((class12041)class022943).N(class084762, class014212, class084762.x, f);
        class014212.y(-1.0f, -1.0f, 1.0f);
        ((class12041)class022943).N(class084762, class014212);
        if (class074382 instanceof class04477) {
            class014212.y(0.9375f, 0.9375f, 0.9375f);
        }
        class014212.N(0.0f, -1.501f, 0.0f);
        class01686 class016862 = var9.method_63512();
        ArrayList arrayList = new ArrayList();
        AtomicReference<Float> atomicReference = new AtomicReference<Float>(Float.valueOf(0.0f));
        class016862.N(class014212, (class014232, string, n, class016872) -> {
            float f = (class016872.i - class016872.y) / 16.0f;
            float f2 = (class016872.R - class016872.L) / 16.0f;
            float f3 = (class016872.M - class016872.u) / 16.0f;
            float f4 = f * f2 * f3;
            if (f4 <= 0.0f) {
                return;
            }
            arrayList.add(new class11237(new Matrix4f((Matrix4fc)class014232.N()), class016872, f4));
            atomicReference.set(Float.valueOf(((Float)atomicReference.get()).floatValue() + f4));
        });
        if (arrayList.isEmpty() || atomicReference.get().floatValue() <= 0.0f) {
            return;
        }
        float f2 = atomicReference.get().floatValue();
        AtomicInteger atomicInteger = new AtomicInteger(n2);
        class06069 class060692 = class074382.method_59922();
        for (int i = 0; i < arrayList.size(); ++i) {
            int n3;
            class11237 class112372 = (class11237)arrayList.get(i);
            if (i == arrayList.size() - 1) {
                n3 = atomicInteger.get();
            } else {
                float f3 = class112372.N() / f2;
                n3 = Math.max(1, Math.round((float)n2 * f3));
                n3 = Math.min(n3, atomicInteger.get());
            }
            if (n3 <= 0) continue;
            atomicInteger.addAndGet(-n3);
            this.N(class074382, class112652, class112372.y(), class112372.L(), n3, class060692);
        }
    }

    private void N(class07438 class074382) {
        this.b();
        if (class074382 instanceof class00681) {
            return;
        }
        class11265 class112652 = new class11265(class074382);
        if (((Set)this.u_0).add(class112652)) {
            this.N(class074382, class112652, ((Float)((class11504)this.i_2).i()).intValue() * 10);
        }
    }

    private void N(class07438 class074382, class11265 class112652, Matrix4f matrix4f, class01687 class016872, int n, class06069 class060692) {
        this.b();
        double d = class074382.method_23317();
        double d2 = class074382.method_23318();
        double d3 = class074382.method_23321();
        for (int i = 0; i < n; ++i) {
            float f = class04995.N((class06069)class060692, (float)class016872.y, (float)class016872.i) / 16.0f;
            float f2 = class04995.N((class06069)class060692, (float)class016872.L, (float)class016872.R) / 16.0f;
            float f3 = class04995.N((class06069)class060692, (float)class016872.u, (float)class016872.M) / 16.0f;
            Vector3f vector3f = new Vector3f(f, f2, f3);
            Vector3f vector3f2 = matrix4f.transformPosition((Vector3fc)vector3f, new Vector3f());
            double d4 = d + (double)vector3f2.x();
            double d5 = d2 + (double)vector3f2.y();
            double d6 = d3 + (double)vector3f2.z();
            class06889 class068892 = new class06889(d4, d5, d6);
            class112652.N().add(new class11232(class068892, class068892, class11908.y((float)0.1f, (float)1.0f), class11908.N((int)((int)(20.0f * ((class11494)((class11525)this.i_3).i()).N())), (int)((int)(20.0f * ((class11494)((class11525)this.i_3).i()).L())))));
        }
    }

    @class11782
    public void N(class09321 class093212) {
        this.b();
        if (((Set)this.u_0).isEmpty()) {
            return;
        }
        ((class11218)this.u_4).execute((Object)class093212);
    }

    public static /* synthetic */ class06202 N(KillEffect killEffect) {
        return (class06202)killEffect.y_0;
    }
}

