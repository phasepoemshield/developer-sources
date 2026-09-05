/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09080
 *  Nursultan.class09093
 *  Nursultan.class09321
 *  Nursultan.class10967
 *  Nursultan.class10996
 *  Nursultan.class11176
 *  Nursultan.class11910
 *  Nursultan.class11925
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class06889
 *  org.joml.Vector2f
 */
package Nursultan;

import Nursultan.class09080;
import Nursultan.class09093;
import Nursultan.class09321;
import Nursultan.class10967;
import Nursultan.class10996;
import Nursultan.class11176;
import Nursultan.class11473;
import Nursultan.class11481;
import Nursultan.class11910;
import Nursultan.class11925;
import java.util.List;
import java.util.Objects;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class06889;
import org.joml.Vector2f;

public class class11484
extends class11473<class11481> {
    public Object y_0;

    public class11484() {
        this.u();
        this.y_0 = class06202.Nq();
    }

    private void u() {
    }

    @Override
    public void N(class10996 class109962) {
        class06889 class068892 = class11925.y();
        for (class11481 class114812 : this.N()) {
            if (!Objects.equals(class114812.s(), class11910.L())) {
                class114812.y(true);
                continue;
            }
            class114812.N((int)class068892.R(class114812.W()));
            class114812.y(false);
        }
    }

    @Override
    public void N(class10967 class109672) {
        this.u();
        List var2 = this.N();
        if (var2.isEmpty()) {
            return;
        }
        class09093 class090932 = class09080.u();
        int n = 18;
        for (class11481 class114812 : var2) {
            if (class114812.b()) continue;
            class06889 class068892 = class114812.W().u(((class03386)((class06202)this.y_0).i_5).s().y());
            Vector2f vector2f = class11925.N((float)((float)class068892.M), (float)((float)class068892.B), (float)((float)class068892.Z));
            if (vector2f == null) continue;
            vector2f = vector2f.round();
            String string = class114812.m() + " " + class114812.E() + "m";
            class11176.N((class09093)class090932, (String)string, (int)18, (float)vector2f.x, (float)vector2f.y);
        }
    }

    @Override
    public void N(class09321 class093212) {
    }
}

