/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02041
 *  minecraft.class02057
 *  minecraft.class02062
 *  minecraft.class02071
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class02252
 *  minecraft.class03286
 *  minecraft.class03608
 *  minecraft.class04141
 *  minecraft.class04927
 *  minecraft.class04961
 *  minecraft.class04981
 *  minecraft.class05092
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05362
 *  minecraft.class06202
 *  minecraft.class06541
 *  minecraft.class08302
 */
package minecraft;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00050;
import minecraft.class00061;
import minecraft.class00073;
import minecraft.class00081;
import minecraft.class00082;
import minecraft.class00089;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02041;
import minecraft.class02057;
import minecraft.class02062;
import minecraft.class02071;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class02252;
import minecraft.class03286;
import minecraft.class03608;
import minecraft.class04141;
import minecraft.class04927;
import minecraft.class04961;
import minecraft.class04981;
import minecraft.class05092;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05362;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class08302;

public class class00083
extends class03286
implements class00061 {
    private static final int L = 212;
    private static final int u = 2;
    private static final int i = 6;
    static final class00392 N = class00392.L((String)"mco.configure.world.settings.title");
    private static final class00392 R = class00392.L((String)"mco.configure.world.name");
    private static final class00392 M = class00392.L((String)"mco.configure.world.description");
    private static final class00392 B = class00392.L((String)"mco.configure.world.region_preference");
    private static final class04141 z = class04141.N((class00392)class00392.L((String)"mco.configure.world.name.validation.whitespace"));
    private final class05092 U;
    private final class06202 E;
    private class04981 W;
    private final Map<class00082, class00073> m;
    final class05362 y;
    private final class04927 P;
    private final class04927 s;
    private final class02071 T;
    private final class03608 b;
    private class08302 j;

    private void L() {
        this.E.N((class05096)new class00089((class05096)this.U, this::N, this.m, this.j));
    }

    @Override
    public void L(class04981 class049812) {
        this.N();
    }

    class00083(class05092 class050922, class06202 class062022, class04981 class049812, Map<class00082, class00073> map) {
        super(N);
        this.U = class050922;
        this.E = class062022;
        this.W = class049812;
        this.m = map;
        class02080 class020802 = this.Z.y(6).u(1);
        class020802.N((class02102)new class02071(R, class050922.method_64506()));
        this.s = new class04927((class01590)class062022.i_3, 0, 0, 212, 20, (class00392)class00392.L((String)"mco.configure.world.name"));
        this.s.method_1880(32);
        this.s.method_1863(string -> {
            if (!this.y()) {
                this.s.method_1868(-2142128);
                this.s.method_47400(z);
                return;
            }
            this.s.method_47400(null);
            this.s.method_1868(-2039584);
        });
        class020802.N((class02102)this.s);
        class020802.N((class02102)class02057.y((int)2));
        class020802.N((class02102)new class02071(M, class050922.method_64506()));
        this.P = new class04927((class01590)class062022.i_3, 0, 0, 212, 20, (class00392)class00392.L((String)"mco.configure.world.description"));
        this.P.method_1880(32);
        class020802.N((class02102)this.P);
        class020802.N((class02102)class02057.y((int)2));
        class020802.N((class02102)new class02071(B, class050922.method_64506()));
        Objects.requireNonNull(class050922.method_64506());
        class02041 class020412 = new class02041(0, 0, 212, 9, class02062.field_40789);
        Objects.requireNonNull(class050922.method_64506());
        this.T = (class02071)class020412.N((class02102)new class02071(192, 9, (class00392)class00392.i(), class050922.method_64506()));
        this.b = (class03608)class020412.N((class02102)class03608.N((int)10, (int)8, (class01894)class00073.field_60237.y()));
        class020802.N((class02102)class020412);
        class020802.N((class02102)class05362.method_46430((class00392)class00392.L((String)"mco.configure.world.buttons.region_preference"), class053622 -> this.L()).N(0, 0, 212, 20).N());
        class020802.N((class02102)class02057.y((int)2));
        this.y = (class05362)class020802.N((class02102)class05362.method_46430((class00392)class00392.i(), class053622 -> {
            if (class049812.R == class04961.field_19434) {
                class062022.N((class05096)class02252.N((class05096)class050922, (class00392)class00392.L((String)"mco.configure.world.close.question.title"), (class00392)class00392.L((String)"mco.configure.world.close.question.line1"), class037232 -> {
                    this.N();
                    class050922.i();
                }));
            } else {
                this.N();
                class050922.N(false);
            }
        }).N(0, 0, 212, 20).N());
        this.y.field_22763 = false;
        this.N(class049812);
    }

    private void u() {
        this.T.method_25355((class00392)class00083.N(this.j));
        this.b.N(class00083.N(this.j, this.m));
        this.b.field_22764 = this.j.N() == class00050.field_60228;
    }

    @Override
    public void y(class04981 class049812) {
        this.N(class049812);
    }

    private boolean y() {
        String string = this.s.method_1882();
        String string2 = string.trim();
        return !string2.isEmpty() && string.length() == string2.length();
    }

    @Override
    public void N(class04981 class049812) {
        this.W = class049812;
        if (class049812.d == null) {
            class049812.d = class00081.N;
        }
        if (class049812.d.y == class00050.field_60228 && class049812.d.L == null) {
            Optional var2 = this.m.keySet().stream().findFirst();
            var2.ifPresent(class000822 -> {
                class049812.d.L = class000822;
            });
        }
        String string = class049812.R == class04961.field_19434 ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
        this.y.method_25355((class00392)class00392.L((String)string));
        this.y.field_22763 = true;
        this.j = new class08302(class049812.d.y, class049812.d.L);
        this.s.method_1852(Objects.requireNonNullElse(class049812.y(), ""));
        this.P.method_1852(class049812.N());
        this.u();
    }

    private void N(class00050 class000502, class00082 class000822) {
        this.j = new class08302(class000502, class000822);
        this.u();
    }

    private static class01894 N(class08302 class083022, Map<class00082, class00073> map) {
        if (class083022.y() != null && map.containsKey((Object)class083022.y())) {
            return map.getOrDefault((Object)class083022.y(), class00073.field_60237).y();
        }
        return class00073.field_60237.y();
    }

    private static class05216 N(class08302 class083022) {
        return (class083022.N().equals((Object)class00050.field_60228) && class083022.y() != null ? class00392.L((String)class083022.y().field_60201) : class00392.L((String)class083022.N().field_60231)).N(class06541.field_1080);
    }

    public void N() {
        String string = this.s.method_1882().trim();
        if (this.W.d != null && Objects.equals(string, this.W.u) && Objects.equals(this.P.method_1882(), this.W.i) && this.j.N() == this.W.d.y && this.j.y() == this.W.d.L) {
            return;
        }
        this.U.N(string, this.P.method_1882(), this.j.N(), this.j.y());
    }
}

