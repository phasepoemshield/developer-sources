/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.WallClimb
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11534
 *  Nursultan.class11798
 *  Nursultan.class11807
 *  Nursultan.class11899
 *  Nursultan.class11907
 *  Nursultan.class11915
 *  Nursultan.class12010
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06918
 *  minecraft.class06942
 *  minecraft.class07050
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.WallClimb;
import Nursultan.class10992;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11534;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11899;
import Nursultan.class11907;
import Nursultan.class11915;
import Nursultan.class12010;
import java.util.Comparator;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06942;
import minecraft.class07050;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08036;

public class class10895
extends class11807<WallClimb> {
    public Object y_0;
    public Object y_1;
    public boolean y_init;

    public class10895(WallClimb wallClimb, String string, boolean bl) {
        super((Object)wallClimb, string, bl);
        this.N();
    }

    public void y(Object object) {
        this.N();
        if (object instanceof class10992) {
            class11297 class112973;
            this.y_0 = (Integer)this.y_0 - 1;
            if ((class11499)this.y_1 != null && (Integer)this.y_0 > 0) {
                class11534.y((class11499)((class11499)this.y_1));
            } else if ((Integer)this.y_0 == 0) {
                this.y_1 = null;
                class11322.i();
            }
            if (((class04453)((class06202)((class11798)this).N_0).T_4).method_18798().B > 0.0 || ((class04453)((class06202)((class11798)this).N_0).T_4).method_24828()) {
                return;
            }
            class07050 class070502 = null;
            if (this.N(((class04453)((class06202)((class11798)this).N_0).T_4).method_6079())) {
                class070502 = class07050.field_5810;
            } else {
                Optional<class11297> var3 = class11281.i(this::N).min(Comparator.comparingInt(class112972 -> {
                    int n = ((class04453)((class06202)((class11798)this).N_0).T_4).method_31548().N();
                    int n2 = Math.abs(class112972.y() - n);
                    return n2 == 8 ? 1 : n2;
                }));
                if (var3.isPresent()) {
                    class112973 = var3.get();
                    class070502 = class07050.field_5808;
                    class11322.u((int)class112973.y());
                }
            }
            if (class070502 == null) {
                return;
            }
            class06584 class065842 = ((class04453)((class06202)((class11798)this).N_0).T_4).method_5998(class070502);
            class06581 class065812 = class065842.B();
            if (class065812 instanceof class06918) {
                class112973 = (class06918)class065812;
                class065812 = class11899.N((int)1);
                class06889 class068892 = ((class04453)((class06202)((class11798)this).N_0).T_4).method_33571();
                class06889 class068893 = ((class04453)((class06202)((class11798)this).N_0).T_4).method_73189();
                for (int i = -1; i <= 0; ++i) {
                    class07209[] class07209Array = this.N(class07209.method_49638((class00737)new class06889(class068893.M, class068893.B - (double)i - 0.5, class068893.Z)));
                    for (int j = 0; j < 2; ++j) {
                        if (this.N((class12010)class112973, class07209Array, new class06889(class068893.M, Math.floor(class068893.B) + 0.9 - (double)i - (double)j, class068893.Z), class068892, class070502, class065842, (class11915)class065812)) {
                            return;
                        }
                        if (!this.N((class12010)class112973, class07209Array, new class06889(class068893.M, Math.floor(class068893.B) + 0.1 - (double)i - (double)j, class068893.Z), class068892, class070502, class065842, (class11915)class065812)) continue;
                        return;
                    }
                }
            }
        } else if (object instanceof WallClimb) {
            this.y_1 = null;
            this.y_0 = 0;
            if ((class04453)((class06202)((class11798)this).N_0).T_4 != null) {
                class11322.i();
            }
        }
    }

    private class06183 N(class11499 class114992, class06889 class068892, class00494 class004942, class07209 class072092) {
        class06889 class068893 = class068892.i(class114992.U().L(((class04453)((class06202)((class11798)this).N_0).T_4).method_55754()));
        return class004942.method_1092(class068892, class068893, class072092);
    }

    private boolean N(class12010 class120102, class07050 class070502, class06584 class065842, class06183 class061832, class11915 class119152) {
        class06942 class069422 = new class06942((class07299)((class03448)((class06202)((class11798)this).N_0).T_3), (class08036)((class04453)((class06202)((class11798)this).N_0).T_4), class070502, class065842, class061832);
        if (!class069422.N()) {
            return false;
        }
        class00500 class005002 = class120102.N(class069422);
        if (class005002 == null) {
            return false;
        }
        class00494 class004942 = class005002.M((class07290)((class03448)((class06202)((class11798)this).N_0).T_3), class069422.method_8037());
        if (class004942.method_1110()) {
            return false;
        }
        if (class004942.method_1107().N(class069422.method_8037()).L(class119152.u().i().method_5829())) {
            class11907.N((class07050)class070502, (class06183)class061832);
            return true;
        }
        return false;
    }

    private void N() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
        }
    }

    private boolean N(class12010 class120102, class07209[] class07209Array, class06889 class068892, class06889 class068893, class07050 class070502, class06584 class065842, class11915 class119152) {
        this.N();
        for (class07209 class072092 : class07209Array) {
            class06183 class061832;
            class11499 class114992;
            class11499 class114993;
            class11499 class114994;
            class06183 class061833;
            class00494 class004942 = ((class03448)((class06202)((class11798)this).N_0).T_3).method_8320(class072092).R((class07290)((class03448)((class06202)((class11798)this).N_0).T_3), class072092);
            Optional var14 = class004942.method_66507((class00753)class072092).method_33661(class068892);
            if (var14.isEmpty() || (class061833 = this.N(class114994 = (class114993 = class11505.N()).N(class114992 = class11505.N((class11499)class114993, (class06889)((class06889)var14.get()))).N(true).u(true), class068893, class004942, class072092)) == null || class061833.N() == class07113.field_1333) continue;
            if ((class11499)this.y_1 != null && (class061832 = this.N((class11499)this.y_1, class068893, class004942, class072092)) != null && class061832.N() != class07113.field_1333 && class061832.u().equals((Object)class061833.u()) && class061832.i().equals((Object)class061833.i())) {
                class114994 = (class11499)this.y_1;
                class061833 = class061832;
            }
            if (!this.N(class120102, class070502, class065842, class061833, class119152)) continue;
            class11534.y((class11499)class114994);
            this.y_1 = class114994;
            this.y_0 = 10;
            return true;
        }
        return false;
    }

    private boolean N(class06584 class065842) {
        class06581 class065812 = class065842.B();
        return class065812 instanceof class06918 && !((class06918)class065812).L().W().M((class07290)((class03448)((class06202)((class11798)this).N_0).T_3), class07209.field_10980).method_1110();
    }

    private class07209[] N(class07209 class072092) {
        class07209[] class07209Array = new class07209[5];
        for (int i = 0; i < 4; ++i) {
            class07209Array[i] = class072092.method_10093(class07211.N((double)(((class04453)((class06202)((class11798)this).N_0).T_4).method_36454() % 360.0f + (float)(i * 90))));
        }
        class07209Array[4] = class072092;
        return class07209Array;
    }
}

