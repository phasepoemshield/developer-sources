/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00250
 *  minecraft.class00253
 *  minecraft.class00681
 *  minecraft.class00682
 *  minecraft.class00683
 *  minecraft.class00690
 *  minecraft.class01238
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01377
 *  minecraft.class01489
 *  minecraft.class01964
 *  minecraft.class02976
 *  minecraft.class03630
 *  minecraft.class04995
 *  minecraft.class05292
 *  minecraft.class06018
 *  minecraft.class06091
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07141
 *  minecraft.class07144
 *  minecraft.class07147
 *  minecraft.class07153
 *  minecraft.class07155
 *  minecraft.class07182
 *  minecraft.class07487
 *  minecraft.class07504
 *  minecraft.class07528
 *  minecraft.class07560
 *  minecraft.class07628
 *  minecraft.class07633
 *  minecraft.class07862
 *  minecraft.class07877
 *  minecraft.class08004
 *  minecraft.class08036
 *  minecraft.class08042
 */
package com.viaversion.viafabricplus.features.entity.riding_offset;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class00250;
import minecraft.class00253;
import minecraft.class00681;
import minecraft.class00682;
import minecraft.class00683;
import minecraft.class00690;
import minecraft.class01238;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01377;
import minecraft.class01489;
import minecraft.class01964;
import minecraft.class02976;
import minecraft.class03630;
import minecraft.class04995;
import minecraft.class05292;
import minecraft.class06018;
import minecraft.class06091;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07141;
import minecraft.class07144;
import minecraft.class07147;
import minecraft.class07153;
import minecraft.class07155;
import minecraft.class07182;
import minecraft.class07487;
import minecraft.class07504;
import minecraft.class07528;
import minecraft.class07560;
import minecraft.class07628;
import minecraft.class07633;
import minecraft.class07862;
import minecraft.class07877;
import minecraft.class08004;
import minecraft.class08036;
import minecraft.class08042;

public final class EntityRidingOffsetsPre1_20_2 {
    public static class06889 getMountedHeightOffset(class07049 class070492, class07049 class070493) {
        double d = class070492.method_17682() * 0.75f;
        if (class070492 instanceof class00250) {
            double d2;
            class00250 class002502 = (class00250)class070492;
            if (!class002502.method_5626(class070493)) {
                return class06889.L;
            }
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
                d = -0.3f;
                double d3 = class04995.P((double)(class002502.method_36454() * (float)Math.PI / 180.0f));
                double d4 = class04995.m((double)(class002502.method_36454() * (float)Math.PI / 180.0f));
                return new class06889((double)0.4f * d3, d, (double)0.4f * d4);
            }
            d = class002502.method_31481() ? (double)0.01f : (class002502.method_5864() == class07078.E || class002502.method_5864() == class07078.U ? 0.25 : (double)-0.1f);
            double d5 = d2 = class002502 instanceof class00253 ? (double)0.15f : 0.0;
            if (class002502.method_5685().size() > 1) {
                int n = class002502.method_5685().indexOf(class070493);
                d2 = n == 0 ? (double)0.2f : (double)-0.6f;
                if (class070493 instanceof class07633) {
                    d2 += (double)0.2f;
                }
            }
            return new class06889(d2, d, 0.0).y(-1.5707964f);
        }
        if (class070492 instanceof class02976) {
            class02976 class029762 = (class02976)class070492;
            if (!class029762.method_5626(class070493)) {
                return class06889.L;
            }
            boolean bl = class029762.method_5685().indexOf(class070493) == 0;
            d = class029762.method_18377(class029762.yy() ? class01312.field_40118 : class01312.field_18076).y() - (class029762.method_6109() ? 0.35f : 0.6f);
            d = class029762.method_31481() ? (double)0.01f : class029762.N(bl, 0.0f, class01325.L((float)0.0f, (float)((float)((double)(0.375f * class029762.method_17825()) + d))), class029762.method_17825());
            double d6 = 0.5;
            if (class029762.method_5685().size() > 1) {
                if (!bl) {
                    d6 = -0.7f;
                }
                if (class070493 instanceof class07633) {
                    d6 += (double)0.2f;
                }
            }
            return new class06889(0.0, d, d6);
        }
        if (class070492 instanceof class07628) {
            class07628 class076282 = (class07628)class070492;
            return new class06889(0.0, class076282.method_23323(0.5) - class076282.method_23318(), (double)-0.1f);
        }
        if (class070492 instanceof class00690) {
            class00690 class006902 = (class00690)class070492;
            d = class006902.u.method_17682();
        } else if (class070492 instanceof class06018) {
            class06018 class060182 = (class06018)class070492;
            d = class060182.method_17682() - (class060182.method_6109() ? 0.2f : 0.15f);
        } else {
            if (class070492 instanceof class00683) {
                return new class06889(0.0, (double)(class070492.method_17682() * 0.6f), (double)-0.3f);
            }
            if (class070492 instanceof class07155) {
                d = class070492.method_5751();
            } else if (class070492 instanceof class01489) {
                d = class070492.method_17682() * 0.92f;
            } else if (class070492 instanceof class07153) {
                d = 2.1f;
            } else if (class070492 instanceof class00682) {
                d -= 0.1875;
            } else if (class070492 instanceof class01964) {
                d = 1.8f;
            } else if (class070492 instanceof class07141) {
                d = class070492.method_17682() * 0.5f;
            } else if (class070492 instanceof class01377) {
                class01377 class013772 = (class01377)class070492;
                float f = Math.min(0.25f, class013772.fields_3212a028292fd3c078969e3ee4c71d9e8_3.y());
                float f2 = class013772.fields_3212a028292fd3c078969e3ee4c71d9e8_3.L();
                d = class013772.method_17682() - 0.19f + 0.12f * class04995.P((double)(f2 * 1.5f)) * 2.0f * f;
            } else if (class070492 instanceof class05292) {
                class05292 class052922 = (class05292)class070492;
                d = class052922.method_17682() - (class052922.method_6109() ? 0.2f : 0.15f);
            } else if (class070492 instanceof class07877) {
                d -= 0.25;
            } else if (class070492 instanceof class07504) {
                d = 0.0;
            }
        }
        if (class070492 instanceof class07862) {
            class07862 class078622 = (class07862)class070492;
            if (class078622.p > 0.0f) {
                return new class06889(0.0, d + (double)(0.15f * class078622.p), (double)(-0.7f * class078622.p));
            }
        }
        return new class06889(0.0, d, 0.0);
    }

    public static double getHeightOffset(class07049 class070492) {
        if (class070492 instanceof class03630 || class070492 instanceof class08042) {
            if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_1)) {
                return 0.0;
            }
            return 0.4;
        }
        if (class070492 instanceof class00681) {
            class00681 class006812 = (class00681)class070492;
            return class006812.i() ? 0.0 : 0.1;
        }
        if (class070492 instanceof class07560) {
            return 0.1;
        }
        if (class070492 instanceof class07144) {
            class07144 class071442 = (class07144)class070492;
            class07078 class070782 = class071442.method_5854().method_5864();
            return !(class071442.method_5854() instanceof class07487) && class070782 != class07078.NK ? 0.0 : 0.1875 - EntityRidingOffsetsPre1_20_2.getMountedHeightOffset((class07049)class071442.method_5854(), null).B;
        }
        if (class070492 instanceof class07147) {
            return 0.1;
        }
        if (class070492 instanceof class07182) {
            class07182 class071822 = (class07182)class070492;
            return class071822.method_6109() ? -0.05 : -0.45;
        }
        if (class070492 instanceof class08004) {
            class08004 class080042 = (class08004)class070492;
            return class080042.method_6109() ? 0.0 : -0.45;
        }
        if (class070492 instanceof class07633) {
            return 0.14;
        }
        if (class070492 instanceof class06091) {
            return -0.45;
        }
        if (class070492 instanceof class08036) {
            return -0.35;
        }
        if (class070492 instanceof class01238) {
            class01238 class012382 = (class01238)class070492;
            return class012382.method_6109() ? -0.05 : -0.45;
        }
        if (class070492 instanceof class07528) {
            return -0.6;
        }
        return 0.0;
    }
}

