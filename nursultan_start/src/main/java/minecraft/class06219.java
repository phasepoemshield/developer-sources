/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10561
 *  Nursultan.class10562
 *  Nursultan.class10563
 *  Nursultan.class10566
 *  minecraft.class00392
 *  minecraft.class05220
 *  minecraft.class05630
 *  minecraft.class06541
 */
package minecraft;

import Nursultan.class10561;
import Nursultan.class10562;
import Nursultan.class10563;
import Nursultan.class10566;
import minecraft.class00392;
import minecraft.class05220;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06541;

public abstract class class06219
extends Enum<class06219> {
    private static String[] strings_01e6bc0aa454033828fc8487f86a51a5a;
    public static class06219 staticFields_01e6bc0aa454033828fc8487f86a51a5a_0;
    public static class06219 staticFields_01e6bc0aa454033828fc8487f86a51a5a_1;
    public static class06219 staticFields_01e6bc0aa454033828fc8487f86a51a5a_2;
    public static class06219 staticFields_01e6bc0aa454033828fc8487f86a51a5a_3;
    public static Object staticFields_01e6bc0aa454033828fc8487f86a51a5a_4;
    public static class06219[] staticFields_01e6bc0aa454033828fc8487f86a51a5a_5;
    public class00392 fields_01e6bc0aa454033828fc8487f86a51a5a_0;

    private static void L() {
    }

    public class06219(class00392 class003922) {
        this.u();
        this.fields_01e6bc0aa454033828fc8487f86a51a5a_0 = class003922;
    }

    static {
        class06219.y();
        class06219.L();
        staticFields_01e6bc0aa454033828fc8487f86a51a5a_0 = new class10561(strings_01e6bc0aa454033828fc8487f86a51a5a[0], 0, class05220.N);
        staticFields_01e6bc0aa454033828fc8487f86a51a5a_1 = new class10566(strings_01e6bc0aa454033828fc8487f86a51a5a[1], 1, (class00392)class00392.L((String)strings_01e6bc0aa454033828fc8487f86a51a5a[2]).N(class06541.field_1061));
        staticFields_01e6bc0aa454033828fc8487f86a51a5a_2 = new class10562(strings_01e6bc0aa454033828fc8487f86a51a5a[3], 2, (class00392)class00392.L((String)strings_01e6bc0aa454033828fc8487f86a51a5a[4]).N(class06541.field_1061));
        staticFields_01e6bc0aa454033828fc8487f86a51a5a_3 = new class10563(strings_01e6bc0aa454033828fc8487f86a51a5a[5], 3, (class00392)class00392.N((String)strings_01e6bc0aa454033828fc8487f86a51a5a[6], (Object[])new Object[]{class00392.u((String)((class05630)((class06202)((Object)class06202.j_0)).i_7).o.U())}).N(class06541.field_1061));
        staticFields_01e6bc0aa454033828fc8487f86a51a5a_5 = class06219.B();
        staticFields_01e6bc0aa454033828fc8487f86a51a5a_4 = class00392.L((String)strings_01e6bc0aa454033828fc8487f86a51a5a[7]);
    }

    public static class06219[] values() {
        return (class06219[])staticFields_01e6bc0aa454033828fc8487f86a51a5a_5.clone();
    }

    public static class06219 valueOf(String string) {
        return Enum.valueOf(class06219.class, string);
    }

    private static /* synthetic */ class06219[] B() {
        return new class06219[]{staticFields_01e6bc0aa454033828fc8487f86a51a5a_0, staticFields_01e6bc0aa454033828fc8487f86a51a5a_1, staticFields_01e6bc0aa454033828fc8487f86a51a5a_2, staticFields_01e6bc0aa454033828fc8487f86a51a5a_3};
    }

    private void u() {
    }

    private static void y() {
        strings_01e6bc0aa454033828fc8487f86a51a5a = new String[8];
        class06219.strings_01e6bc0aa454033828fc8487f86a51a5a[0] = "ENABLED";
        class06219.strings_01e6bc0aa454033828fc8487f86a51a5a[1] = "DISABLED_BY_OPTIONS";
        class06219.strings_01e6bc0aa454033828fc8487f86a51a5a[2] = "chat.disabled.options";
        class06219.strings_01e6bc0aa454033828fc8487f86a51a5a[3] = "DISABLED_BY_LAUNCHER";
        class06219.strings_01e6bc0aa454033828fc8487f86a51a5a[4] = "chat.disabled.launcher";
        class06219.strings_01e6bc0aa454033828fc8487f86a51a5a[5] = "DISABLED_BY_PROFILE";
        class06219.strings_01e6bc0aa454033828fc8487f86a51a5a[6] = "chat.disabled.profile";
        class06219.strings_01e6bc0aa454033828fc8487f86a51a5a[7] = "chat.disabled.profile.moreInfo";
    }

    public class00392 N() {
        return this.fields_01e6bc0aa454033828fc8487f86a51a5a_0;
    }

    public abstract boolean N(boolean var1);
}

