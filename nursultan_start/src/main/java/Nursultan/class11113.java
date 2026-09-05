/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ItemRelease
 *  Nursultan.Trajectory
 *  Nursultan.class11223
 *  Nursultan.class11225
 *  Nursultan.class11228
 *  Nursultan.class11249
 *  Nursultan.class11264
 *  Nursultan.class11266
 *  Nursultan.class11907
 *  minecraft.class02484
 *  minecraft.class02820
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06593
 *  minecraft.class06889
 *  minecraft.class07050
 *  minecraft.class08036
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
package Nursultan;

import Nursultan.ItemRelease;
import Nursultan.Trajectory;
import Nursultan.class11131;
import Nursultan.class11223;
import Nursultan.class11225;
import Nursultan.class11228;
import Nursultan.class11249;
import Nursultan.class11264;
import Nursultan.class11266;
import Nursultan.class11907;
import java.util.ArrayList;
import java.util.function.Function;
import minecraft.class02484;
import minecraft.class02820;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06593;
import minecraft.class06889;
import minecraft.class07050;
import minecraft.class08036;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class class11113
extends class11131 {
    public Object y_0;

    private void L() {
    }

    public class11113(ItemRelease itemRelease, String string, boolean bl) {
        super(itemRelease, string, bl);
        this.L();
        this.y_0 = new class11249((class11225)class11225.L_0, class11264.N);
    }

    @Override
    public void y(class06202 class062022, class07050 class070502) {
        if (((class04453)class062022.T_4).method_6115()) {
            ((class03443)class062022.T_2).y((class08036)((class04453)class062022.T_4));
        } else {
            class11907.N((class07050)class070502);
        }
    }

    @Override
    public boolean test(class06202 class062022, class07050 class070502) {
        return class06593.u((class06584)((class04453)class062022.T_4).method_5998(class070502));
    }

    @Override
    public boolean N(class06202 class062022, class07050 class070502, Function<class11223, Boolean> function) {
        this.L();
        class06584 class065842 = ((class04453)class062022.T_4).method_5998(class070502);
        class06889 class068892 = new class06889(((Double)((class04453)class062022.T_4).M_1).doubleValue(), (Double)((class04453)class062022.T_4).M_2 + (double)((class04453)class062022.T_4).method_18381(((class04453)class062022.T_4).method_18376()), ((Double)((class04453)class062022.T_4).R_0).doubleValue());
        float f = ((Float)((class04453)class062022.T_4).R_2).floatValue();
        float f2 = ((Float)((class04453)class062022.T_4).R_1).floatValue();
        int[] nArray = ((class02820)class065842.a_(class02484.x, (Object)class02820.N)).N().size() == 1 ? new int[]{0} : new int[]{-10, 0, 10};
        ArrayList<class11266> arrayList = new ArrayList<class11266>();
        for (int n : nArray) {
            class06889 class068893 = ((class04453)class062022.T_4).method_18864(1.0f);
            Quaternionf quaternionf = new Quaternionf().setAngleAxis((double)((float)n * ((float)Math.PI / 180)), class068893.M, class068893.B, class068893.Z);
            Vector3f vector3f = ((class04453)class062022.T_4).method_5631(f, f2).W().rotate((Quaternionfc)quaternionf);
            class06889 class068894 = Trajectory.N((double)vector3f.x, (double)vector3f.y, (double)vector3f.z, (float)3.15f);
            arrayList.add(new class11266(class068892, class068894, (class11228)((class11249)this.y_0)));
        }
        Object object = arrayList.iterator();
        while (object.hasNext()) {
            class11266 class112662 = (class11266)object.next();
            if (!class112662.y().N().map(function).orElse(false).booleanValue()) continue;
            return true;
        }
        return false;
    }
}

