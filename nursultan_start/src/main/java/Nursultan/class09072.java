/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11192
 *  Nursultan.class11213
 */
package Nursultan;

import Nursultan.class09067;
import Nursultan.class09101;
import Nursultan.class09322;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11213;

public class class09072
implements class11192<class09101> {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;

    private static void M() {
        N_0 = new float[]{1.0f, 0.0f};
        N_1 = new float[]{0.0f, 1.0f};
        N_2 = 0;
    }

    public class09072(class11213 class112132, float[] fArray) {
        this.u();
        this.y_0 = class112132;
        this.y_1 = Float.valueOf(fArray[0]);
        this.y_2 = Float.valueOf(fArray[1]);
        boolean bl = ((Float)this.y_1).floatValue() != 0.0f;
        this.y_3 = new class09067(class112132, (class09322)class11185.U_3, true, true, "weights");
        this.y_4 = new class09067(class112132, bl ? (class09322)class11185.U_4 : (class09322)class11185.U_5, false, false, null);
        this.y_5 = new class09067(class112132, bl ? (class09322)class11185.U_6 : (class09322)class11185.B_0, false, false, null);
        this.y_6 = new class09067(class112132, bl ? (class09322)class11185.B_1 : (class09322)class11185.B_2, false, false, null);
    }

    static {
        class09072.M();
    }

    private void u() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_1 = Float.valueOf(0.0f);
            this.y_2 = Float.valueOf(0.0f);
        }
    }

    public static class09072 N(class11213 class112132, float[] fArray) {
        return new class09072(class112132, fArray);
    }

    public void execute(class09101 class091012) {
        class11176.N((class11213)((class11213)this.y_0), (float)class091012.Z(), (float)class091012.R(), (float)class091012.B(), (float)class091012.i(), (float)class091012.u(), (float)class091012.L(), (float)class091012.U(), (float)class091012.M(), (int)-1);
        this.N(class091012.N()).N(class091012, ((Float)this.y_1).floatValue(), ((Float)this.y_2).floatValue());
    }

    private class09067 N(int n) {
        return switch (n) {
            case 5 -> (class09067)this.y_4;
            case 10 -> (class09067)this.y_5;
            case 15 -> (class09067)this.y_6;
            default -> (class09067)this.y_3;
        };
    }
}

