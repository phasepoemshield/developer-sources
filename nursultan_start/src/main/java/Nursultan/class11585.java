/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AnarchyHelper
 *  Nursultan.class10990
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class07261
 *  org.joml.Vector3i
 */
package Nursultan;

import Nursultan.AnarchyHelper;
import Nursultan.class10990;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11556;
import Nursultan.class11560;
import Nursultan.class11576;
import Nursultan.class11577;
import Nursultan.class11586;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class00381;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07261;
import org.joml.Vector3i;

public class class11585 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;

    public class11585(AnarchyHelper anarchyHelper, class11576 class115762) {
        this.Z();
        this.N_0 = class06202.Nq();
        this.N_1 = new ArrayList();
        this.N_4 = class11524.N((class11512)anarchyHelper, (String)"structure-detector", (boolean)true);
        this.N_2 = new class11577(class115762);
        this.N_3 = new class11586(class115762);
    }

    private void Z() {
    }

    public void y() {
        ((List)this.N_1).clear();
    }

    public void N() {
        if (!((Boolean)((class11507)this.N_4).i()).booleanValue() || ((List)this.N_1).isEmpty()) {
            return;
        }
        class11560 class115602 = this.R();
        ((class11577)this.N_2).N((List)this.N_1, class115602.N(), class115602.y());
        ((class11586)this.N_3).N((List)this.N_1, class115602.N(), class115602.y());
        ((List)this.N_1).clear();
    }

    public void N(class10990 class109902) {
        if (!((Boolean)((class11507)this.N_4).i()).booleanValue()) {
            return;
        }
        class00381 var3 = class109902.u();
        if (var3 instanceof class07261) {
            class07261 class072612 = (class07261)var3;
            ((class06202)this.N_0).execute(() -> class072612.N((class072092, class005002) -> {
                if (!class005002.P() && ((class04453)((class06202)this.N_0).T_4).method_5649((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260()) < 25600.0) {
                    ((List)this.N_1).add(new class11556(new class07209((class00753)class072092), (class00500)class005002));
                }
            }));
        }
    }

    private class11560 R() {
        Vector3i vector3i = new Vector3i(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        Vector3i vector3i2 = new Vector3i(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        Iterator iterator = ((List)this.N_1).iterator();
        while (iterator.hasNext()) {
            class07209 class072092 = ((class11556)((Object)iterator.next())).N();
            vector3i.x = Math.min(vector3i.x, class072092.method_10263());
            vector3i.y = Math.min(vector3i.y, class072092.method_10264());
            vector3i.z = Math.min(vector3i.z, class072092.method_10260());
            vector3i2.x = Math.max(vector3i2.x, class072092.method_10263());
            vector3i2.y = Math.max(vector3i2.y, class072092.method_10264());
            vector3i2.z = Math.max(vector3i2.z, class072092.method_10260());
        }
        return new class11560(vector3i, vector3i2);
    }
}

