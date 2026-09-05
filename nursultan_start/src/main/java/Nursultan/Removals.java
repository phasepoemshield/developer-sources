/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09315
 *  Nursultan.class09323
 *  Nursultan.class09326
 *  Nursultan.class09338
 *  Nursultan.class09350
 *  Nursultan.class10956
 *  Nursultan.class10960
 *  Nursultan.class10962
 *  Nursultan.class10978
 *  Nursultan.class10979
 *  Nursultan.class10981
 *  Nursultan.class10993
 *  Nursultan.class10995
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11406
 *  Nursultan.class11416
 *  Nursultan.class11417
 *  Nursultan.class11418
 *  Nursultan.class11422
 *  Nursultan.class11451
 *  Nursultan.class11455
 *  Nursultan.class11504
 *  Nursultan.class11512
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  minecraft.class04891
 *  minecraft.class04909
 */
package Nursultan;

import Nursultan.class09315;
import Nursultan.class09323;
import Nursultan.class09326;
import Nursultan.class09338;
import Nursultan.class09350;
import Nursultan.class10956;
import Nursultan.class10960;
import Nursultan.class10962;
import Nursultan.class10978;
import Nursultan.class10979;
import Nursultan.class10981;
import Nursultan.class10993;
import Nursultan.class10995;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11406;
import Nursultan.class11416;
import Nursultan.class11417;
import Nursultan.class11418;
import Nursultan.class11422;
import Nursultan.class11451;
import Nursultan.class11455;
import Nursultan.class11504;
import Nursultan.class11512;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11782;
import java.util.Iterator;
import java.util.List;
import minecraft.class04891;
import minecraft.class04909;

@class11080(L="Removals", y=class11072.VISUAL, N=class11106.SCREEN)
public class Removals
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object u_0;
    public Object u_1;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public Object R_5;
    public Object R_6;
    public Object R_7;
    public Object M_0;
    public Object M_1;

    private void T() {
    }

    public Removals() {
        this.T();
        this.L_0 = new class11422("tilt-view", true, new Class[]{class09315.class});
        this.L_1 = new class11422("vignette-overlay", true, new Class[]{class09338.class});
        this.L_2 = new class11422("fire-overlay", true, new Class[]{class10962.class});
        this.L_3 = new class11422("under-water-overlay", true, new Class[]{class10960.class});
        this.M_0 = new class11422("wall-overlay", true, new Class[]{class10978.class});
        this.M_1 = new class11422("rain", true, new Class[]{class09323.class});
        this.i_0 = new class11422("fog", true, new Class[]{class10981.class});
        this.i_1 = new class11422("blindness", true, new Class[]{class10993.class});
        this.i_2 = new class11422("nausea", true, new Class[]{class10956.class});
        this.R_0 = new class11422("totem-pop", true, new Class[]{class09350.class});
        this.R_1 = new class11422("status-effect-overlay", true, new Class[]{class10995.class});
        this.R_2 = new class11422("scoreboard", true, new Class[]{class10979.class});
        this.R_3 = new class11451("holograms", true);
        this.R_4 = new class11418("camera-clip", true);
        this.R_5 = new class11416("heart-effect", true);
        this.R_6 = new class11455("fishing-bobber", true);
        this.R_7 = class11524.y((class11512)this, (String)"removals", (class11535[])new class11417[]{(class11422)this.M_0, (class11422)this.L_3, (class11422)this.L_2, (class11422)this.L_0, (class11422)this.L_1, (class11451)this.R_3, (class11418)this.R_4, (class11422)this.i_1, (class11416)this.R_5, (class11422)this.i_2, (class11422)this.M_1, (class11422)this.i_0, (class11422)this.R_0, (class11422)this.R_1, (class11422)this.R_2, (class11455)this.R_6});
        this.u_0 = class11524.y((class11512)this, (String)"sounds", (class11535[])new class11406[]{new class11406("trident", true, new class04891[]{class04909.QC, class04909.yh}), new class11406("wither-spawn", true, new class04891[]{class04909.Jy}), new class11406("end-portal-open", true, new class04891[]{class04909.Ui}), new class11406("anarchy-events", true, new class04891[]{class04909.Oa, class04909.zK, class04909.db}), new class11406("exp-bottle", true, new class04891[]{class04909.QB, class04909.Us})});
        this.u_1 = class11524.N((class11512)this, (String)"sound-multiplier", (float)0.5f, (float)0.0f, (float)1.0f, (float)0.01f);
    }

    private void N(Object object) {
        this.T();
        ((List)((class11523)this.R_7).i()).forEach(class114172 -> class114172.y(object));
    }

    @class11782
    public void N(class09326 class093262) {
        this.T();
        Iterator iterator = ((List)((class11523)this.u_0).i()).iterator();
        while (iterator.hasNext()) {
            if (!((class11406)iterator.next()).test(class093262)) continue;
            class093262.N(((Float)((class11504)this.u_1).i()).floatValue());
        }
    }
}

