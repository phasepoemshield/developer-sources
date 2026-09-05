/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09079
 *  Nursultan.class09080
 *  Nursultan.class09093
 *  Nursultan.class10964
 *  Nursultan.class10967
 *  Nursultan.class11031
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11190
 *  Nursultan.class11213
 *  Nursultan.class11300
 *  Nursultan.class11361
 *  Nursultan.class11368
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11911
 *  Nursultan.class11921
 *  Nursultan.class11925
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  Nursultan.class11998
 *  Nursultan.class12031
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class00392
 *  minecraft.class00717
 *  minecraft.class00891
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02118
 *  minecraft.class02128
 *  minecraft.class02484
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05096
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class06563
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06922
 *  minecraft.class06937
 *  minecraft.class07027
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07510
 *  minecraft.class08066
 *  minecraft.class08394
 *  org.joml.Vector2ic
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09079;
import Nursultan.class09080;
import Nursultan.class09093;
import Nursultan.class10964;
import Nursultan.class10967;
import Nursultan.class11031;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11190;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11361;
import Nursultan.class11368;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11911;
import Nursultan.class11921;
import Nursultan.class11925;
import Nursultan.class11929;
import Nursultan.class11938;
import Nursultan.class11998;
import Nursultan.class12031;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import minecraft.class00392;
import minecraft.class00717;
import minecraft.class00891;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02118;
import minecraft.class02128;
import minecraft.class02484;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05096;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06563;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06922;
import minecraft.class06937;
import minecraft.class07027;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07510;
import minecraft.class08066;
import minecraft.class08394;
import org.joml.Vector2ic;
import org.joml.Vector4f;

@class11080(L="ShulkerPreview", y=class11072.VISUAL, N=class11106.SCREEN)
public class ShulkerPreview
extends class11067 {
    public Object L_0;
    public Object L_1;
    public static Object u_0;
    public static Object u_1;
    public static Object u_2;

    private void P() {
    }

    public ShulkerPreview() {
        this.P();
        this.L_0 = class11911.N((String)"icons/3x9.png");
        this.L_1 = class11524.N((class11512)this, (String)"show-in-world", (boolean)true);
    }

    static {
        ShulkerPreview.v();
    }

    private static void v() {
        u_0 = 8;
        u_1 = -12698050;
        u_2 = -16777216;
    }

    private void N(class01054 class010542, int n, int n2, int n3, class06584 class065842) {
        this.P();
        class010542.N(class08394.Na, (class01894)this.L_0, n - 4, n2 + n3 + 5, 0.0f, 0.0f, 256, 256, 256, 256, this.N(class065842, false));
    }

    private void N(class09093 class090932, class06584 class065842, int n, int n2) {
        int n3 = class065842.c();
        if (n3 <= 1) {
            return;
        }
        String string = Integer.toString(n3);
        float f = class090932.y(string, 8.0f, class09079.REGULAR, false);
        class11176.N((class09093)class090932, (String)string, (float)((float)(n + 17) - f), (float)(n2 + 9), (float)8.0f, (int)-1, (int)-12698050);
    }

    private class00392 N(List<class06584> list) {
        return class11921.N((String)"shulker.contains", (Object[])new Object[]{list.size()}).N(class06541.field_1080);
    }

    @class11782(y=class11777.AFTER)
    public void N(class10967 class109672) {
        this.P();
        if (!((Boolean)((class11507)this.L_1).i()).booleanValue()) {
            return;
        }
        boolean bl = false;
        for (class07049 class070492 : ((class03448)((class06202)this.y_0).T_3).M()) {
            List var7;
            Vector4f vector4f;
            class06584 class065842;
            if (class070492.method_5864() != class07078.Nt || !class11925.y((class07049)class070492) || !class11929.y((class06584)(class065842 = ((class00717)class070492).N())) || (vector4f = class11925.N((class07049)class070492, (boolean)true)) == null || (var7 = class11929.i((class06584)class065842)).isEmpty()) continue;
            int n = (int)(vector4f.x() + (vector4f.z() - vector4f.x()));
            int n2 = (int)vector4f.y();
            int n3 = 18;
            class11176.N((class11213)((class11174)class11190.y_0).u(), (float)((n += 12) - 4), (float)((n2 -= n3) + n3 + 5), (float)256.0f, (float)256.0f, (float)0.0f, (float)0.0f, (float)1.0f, (float)1.0f, (int)this.N(class065842, true));
            bl = true;
            this.N(var7, n, n2, n3);
        }
        if (!bl) {
            return;
        }
        class11925.N((class08066)((class06202)this.y_0).e(), (boolean)true);
        ((class11174)class11190.y_0).N((T class093222) -> {
            class093222.z("u_projection").N(class11925.L());
            class093222.z("u_view").N(RenderSystem.getModelViewMatrix());
            class093222.M("texture_in").N(((class12031)class11998.N_4).N());
        });
    }

    private void N(List<class06584> list, int n, int n2, int n3) {
        class09093 class090932 = class09080.i();
        for (int i = 0; i < list.size(); ++i) {
            int n4 = n + 4 + i % 9 * 18;
            int n5 = n2 + n3 + 13 + i / 9 * 18;
            class06584 class065842 = list.get(i);
            class11938.k().N(class065842, (float)n4, (float)n5, 16.0f);
            this.N(class065842, n4, n5);
            this.N(class090932, class065842, n4, n5);
        }
    }

    private void N(class06584 class065842, int n, int n2) {
        if (!class065842.m()) {
            return;
        }
        int n3 = class065842.s();
        if (n3 <= 0) {
            return;
        }
        float f = 1.0f - (float)class065842.P() / (float)n3;
        class11213 class112132 = ((class11174)class11190.N_0).u();
        class11176.N((class11213)class112132, (float)(n + 2), (float)(n2 + 13), (float)13.0f, (float)2.0f, (int)-16777216);
        int n4 = Math.round(f * 13.0f);
        if (n4 > 0) {
            class11176.N((class11213)class112132, (float)(n + 2), (float)(n2 + 13), (float)n4, (float)1.0f, (int)class11300.N((float)f));
        }
    }

    @class11782
    public void N(class11361 class113612) {
        if (class11929.i((class06584)class113612.y()).isEmpty() || ((class06202)this.y_0).s()) {
            return;
        }
        List var4 = class113612.N();
        var4.add(1, class11921.N((String)"shulker.holdControl").N(class06541.field_1080));
        var4.add(2, class00392.y((String)" "));
    }

    private void N(class01054 class010542, List<class06584> list, int n, int n2, int n3) {
        for (int i = 0; i < list.size(); ++i) {
            int n4 = n + 4 + i % 9 * 18;
            int n5 = n2 + n3 + 13 + i / 9 * 18;
            class06584 class065842 = list.get(i);
            class11925.N((class01054)class010542, (class06584)class065842, (float)n4, (float)n5);
            class010542.N((class01590)((class06202)this.y_0).i_3, class065842, n4, n5);
        }
    }

    @class11782
    public void N(class11368 class113682) {
        class06937 class069372;
        if (class113682.u() == -111) {
            class113682.N();
        }
        if ((class069372 = class113682.L()) == null || !class069372.R()) {
            return;
        }
        class06584 class065842 = class069372.i();
        List var4 = class11929.i((class06584)class065842);
        if (var4.isEmpty() || !((class06202)this.y_0).s()) {
            return;
        }
        if (class113682.M() != class07510.field_7790 || class113682.R() != 1) {
            return;
        }
        class113682.N();
        class06922 class069222 = new class06922(-111, ((class04453)((class06202)this.y_0).T_4).method_31548());
        class069222.L().addAll((Collection)var4);
        for (int i = 0; i < var4.size(); ++i) {
            ((class06937)class069222.T.get(i)).u((class06584)var4.get(i));
        }
        class05096 class050962 = (class05096)((class06202)this.y_0).v_3;
        class05096 class050963 = (class05096)((class06202)this.y_0).v_3;
        if (class050963 instanceof class11031) {
            class050962 = (class05096)((class11031)class050963).N_0;
        }
        ((class06202)this.y_0).N((class05096)new class11031(class069222, ((class04453)((class06202)this.y_0).T_4).method_31548(), class065842.d(), class050962));
    }

    private int N(class06584 class065842, boolean bl) {
        class00891 class008912 = class00891.N((class06581)class065842.B());
        if (class008912 instanceof class07027 && (class008912 = ((class07027)class008912).y()) != null) {
            return class11300.N((int)class008912.u().NU, (int)(bl ? 100 : 255));
        }
        return class11300.N((int)class06563.field_7945.u().NU, (int)(bl ? 100 : 255));
    }

    @class11782
    public void N(class10964 class109642) {
        class06584 class065842 = class109642.L();
        List var3 = class11929.i((class06584)class065842);
        if (var3.isEmpty() || !((class06202)this.y_0).s()) {
            return;
        }
        class109642.N();
        class00392 class003922 = this.N(var3);
        class00392 class003923 = class065842.d();
        int n = Math.max(((class01590)((class06202)this.y_0).i_3).N((class05936)class003922), ((class01590)((class06202)this.y_0).i_3).N((class05936)class003923));
        int n2 = 18;
        int n3 = class109642.i();
        int n4 = class109642.R() - n2;
        class01054 class010542 = class109642.u();
        Vector2ic vector2ic = class02128.N.method_47944(class010542.N(), class010542.y(), n3, n4, n, n2);
        n3 = vector2ic.x();
        n4 = vector2ic.y();
        class02118.N((class01054)class010542, (int)n3, (int)n4, (int)n, (int)n2, (class01894)((class01894)class065842.method_58694(class02484.V)));
        this.N(class010542, n3, n4, n2, class065842);
        class010542.y((class01590)((class06202)this.y_0).i_3, class003923.method_30937(), n3, n4, -1);
        class010542.y((class01590)((class06202)this.y_0).i_3, class003922.method_30937(), n3, n4 + 10, -1);
        this.N(class010542, var3, n3, n4, n2);
    }
}

