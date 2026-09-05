/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  org.joml.Vector3d
 *  org.joml.Vector3dc
 */
package Nursultan;

import Nursultan.class11223;
import Nursultan.class11225;
import Nursultan.class11241;
import Nursultan.class11264;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class01231;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public class class11228 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;

    public void L() {
        ((Vector3d)this.N_2).add(0.0, -((class11225)((Object)this.N_3)).L(), 0.0);
    }

    private void M() {
    }

    public class11228(class11225 class112252, class11264 class112642) {
        this.M();
        this.N_0 = class06202.Nq();
        this.N_1 = new Vector3d();
        this.N_2 = new Vector3d();
        this.N_3 = class112252;
        this.N_4 = class112642;
    }

    public class11228(class11225 class112252) {
        this(class112252, null);
    }

    public void u() {
        float f = ((class11225)((Object)this.N_3)).N();
        if (((class03448)((class06202)this.N_0).T_3).method_31601((int)((Vector3d)this.N_1).y) && ((class03448)((class06202)this.N_0).T_3).method_8316(class07209.method_49637((double)((Vector3d)this.N_1).x, (double)((Vector3d)this.N_1).y, (double)((Vector3d)this.N_1).z)).N(class01231.N)) {
            f = ((class11225)((Object)this.N_3)).y();
        }
        ((Vector3d)this.N_2).mul((double)f);
    }

    public void y() {
    }

    public class11241 N(class07049 class070492, class06889 class068892, class06889 class068893) {
        ArrayList<class06889> arrayList = new ArrayList<class06889>();
        ((Vector3d)this.N_1).set(class068892.M, class068892.B, class068892.Z);
        ((Vector3d)this.N_2).set(class068893.M, class068893.B, class068893.Z);
        for (int i = 0; i < 300; ++i) {
            this.N();
            class11241 class112412 = this.N(class070492, arrayList, i);
            if (class112412 != null) {
                return class112412;
            }
            ((Vector3d)this.N_1).add((Vector3dc)((Vector3d)this.N_2));
            if ((double)((class03448)((class06202)this.N_0).T_3).method_31607() > ((Vector3d)this.N_1).y) break;
            this.y();
            arrayList.add(new class06889(((Vector3d)this.N_1).x, ((Vector3d)this.N_1).y, ((Vector3d)this.N_1).z));
        }
        return new class11241(arrayList, Optional.empty());
    }

    public void N() {
        this.L();
        this.u();
    }

    public class11241 N(class07049 class070492, List<class06889> list, int n) {
        class06889 class068892 = new class06889(((Vector3d)this.N_1).x, ((Vector3d)this.N_1).y, ((Vector3d)this.N_1).z);
        class06889 class068893 = new class06889(((Vector3d)this.N_1).x + ((Vector3d)this.N_2).x, ((Vector3d)this.N_1).y + ((Vector3d)this.N_2).y, ((Vector3d)this.N_1).z + ((Vector3d)this.N_2).z);
        class06183 class061832 = ((class03448)((class06202)this.N_0).T_3).y(new class05862(class068892, class068893, class05849.field_17558, class05835.field_1348, (class07049)((class04453)((class06202)this.N_0).T_4)));
        class11241 class112412 = null;
        if (class061832.N() != class07113.field_1333) {
            list.add(class061832.y());
            class112412 = new class11241(list, Optional.of(new class11223(class061832.y(), (class07089)class061832, n, class070492)));
        }
        if ((class11264)this.N_4 != null) {
            class06889 class068894 = new class06889(((Vector3d)this.N_2).x, ((Vector3d)this.N_2).y, ((Vector3d)this.N_2).z);
            return ((class11264)this.N_4).predict(this, class112412, class070492, class068892, class068894, list, n);
        }
        return class112412;
    }
}

