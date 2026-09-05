/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AutoJoin
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11127
 *  Nursultan.class11322
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11533
 *  Nursultan.class11787
 *  Nursultan.class11801
 *  Nursultan.class11910
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00147
 *  minecraft.class00176
 *  minecraft.class00381
 *  minecraft.class00486
 *  minecraft.class00524
 *  minecraft.class00539
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05873
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07510
 *  minecraft.class07843
 *  minecraft.class08082
 */
package Nursultan;

import Nursultan.AutoJoin;
import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11127;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11533;
import Nursultan.class11787;
import Nursultan.class11801;
import Nursultan.class11910;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.regex.Pattern;
import minecraft.class00147;
import minecraft.class00176;
import minecraft.class00381;
import minecraft.class00486;
import minecraft.class00524;
import minecraft.class00539;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05873;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07510;
import minecraft.class07843;
import minecraft.class08082;

public class class11158
extends class11127
implements class11801<AutoJoin> {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public boolean L_init;

    private boolean L(String string) {
        this.B();
        String string2 = "#" + ((class11533)this.L_0).i();
        int n = string.indexOf(string2);
        while (n != -1) {
            int n2 = n + string2.length();
            if (n2 >= string.length() || !Character.isDigit(string.charAt(n2))) {
                return true;
            }
            n = string.indexOf(string2, n2);
        }
        return false;
    }

    private void M() {
        int n2 = class11281.R(class06570.jJ);
        if (!class11281.y(n2)) {
            class11322.i((int)n2);
            class11499 class114992 = class11505.N();
            ((class03443)((class06202)((class11787)this).N_0).T_2).N((class03448)((class06202)((class11787)this).N_0).T_3, n -> new class07843(class07050.field_5808, n, class114992.y(), class114992.R()));
        }
    }

    public class11158(AutoJoin autoJoin, String string, boolean bl) {
        super(autoJoin, string, bl);
        this.B();
    }

    private void B() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = (short)0;
            this.L_2 = 0;
            this.L_3 = 0;
            this.L_4 = 0;
        }
    }

    private void m() {
        this.B();
        this.L_4 = 0;
        this.L_1 = (short)-1;
        this.L_2 = -1;
        this.L_3 = -1;
        this.L_5 = null;
    }

    public void y(Object object) {
        this.B();
        if (object instanceof class10996) {
            this.L_4 = (Integer)this.L_4 - 1;
            if ((class00176)this.L_5 != null) {
                if ((Integer)this.L_4 < 0) {
                    Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
                    int2ObjectOpenHashMap.put((int)((Short)this.L_1).shortValue(), (Object)((class00176)this.L_5));
                    class11910.N((class00381)new class00539(((Integer)this.L_2).intValue(), ((Integer)this.L_3).intValue(), ((Short)this.L_1).shortValue(), 0, class07510.field_7790, (Int2ObjectMap)int2ObjectOpenHashMap, (class00176)this.L_5));
                    this.L_4 = 40;
                }
            } else {
                this.M();
            }
        } else if (object instanceof class10990) {
            class00381 var3;
            class10990 class109902 = (class10990)object;
            class00381 var4 = var3 = class109902.u();
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class00524.class, class05873.class, class00486.class, class08082.class}, (Object)var4, (int)n)) {
                case 0: {
                    class00524 class005242 = (class00524)var4;
                    ((class06202)((class11787)this).N_0).execute(() -> {
                        this.B();
                        if ((class04453)((class06202)((class11787)this).N_0).T_4 == null || ((class06202)((class11787)this).N_0).NE() == null) {
                            return;
                        }
                        List var2 = class005242.L();
                        for (int i = 0; i < var2.size(); ++i) {
                            String string = ((class06584)var2.get(i)).d().getString();
                            int n = class005242.N();
                            int n2 = class005242.y();
                            if (string.contains("\u0413\u0420\u0418\u0424\u0415\u0420\u0421\u041a\u041e\u0415 \u0412\u042b\u0416\u0418\u0412\u0410\u041d\u0418\u0415")) {
                                class00176 class001762 = class00176.y((class06584)((class06584)var2.get(i)), (class00147)((class06202)((class11787)this).N_0).NE().Q());
                                Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
                                int2ObjectOpenHashMap.put(i, (Object)class001762);
                                class11910.N((class00381)new class00539(n, n2, (short)i, 0, class07510.field_7790, (Int2ObjectMap)int2ObjectOpenHashMap, class001762));
                                break;
                            }
                            if (!this.L(string)) continue;
                            this.L_2 = n;
                            this.L_3 = n2;
                            this.L_1 = (short)i;
                            this.L_5 = class00176.y((class06584)((class06584)var2.get(i)), (class00147)((class06202)((class11787)this).N_0).NE().Q());
                            break;
                        }
                    });
                    break;
                }
                case 1: {
                    class05873 class058732 = (class05873)var4;
                    class109902.N();
                    break;
                }
                case 2: {
                    class00486 class004862 = (class00486)var4;
                    this.m();
                    class109902.N();
                    break;
                }
                case 3: {
                    class08082 class080822 = (class08082)var4;
                    ((class06202)((class11787)this).N_0).execute(() -> ((AutoJoin)this.y_0).N(false));
                    break;
                }
            }
        }
    }

    public void N() {
        this.m();
    }

    public void N(AutoJoin autoJoin) {
        this.B();
        this.L_0 = (class11533)class11524.N((class11512)autoJoin, (String)"grief", (String)"1", (Pattern)Pattern.compile("^[1-9]\\d{0,18}$")).N(class115362 -> this.U());
    }

    public void b_() {
        this.m();
        super.b_();
    }
}

