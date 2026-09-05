/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11328
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class11328;
import Nursultan.class11929;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07438;

public class class11933
extends Enum<class11933> {
    private static String[] strings_0d3a21382a7b83848bd4500e6adef3cae;
    public static class11933 staticFields_0d3a21382a7b83848bd4500e6adef3cae_0;
    public static class11933 staticFields_0d3a21382a7b83848bd4500e6adef3cae_1;
    public static class11933 staticFields_0d3a21382a7b83848bd4500e6adef3cae_2;
    public static class11933 staticFields_0d3a21382a7b83848bd4500e6adef3cae_3;
    public static class11933 staticFields_0d3a21382a7b83848bd4500e6adef3cae_4;
    public static class11933[] staticFields_0d3a21382a7b83848bd4500e6adef3cae_5;
    public Integer fields_0d3a21382a7b83848bd4500e6adef3cae_0;
    public Integer fields_0d3a21382a7b83848bd4500e6adef3cae_1;
    public class07085 fields_0d3a21382a7b83848bd4500e6adef3cae_2;
    public class11328 fields_0d3a21382a7b83848bd4500e6adef3cae_3;

    public int L() {
        return this.fields_0d3a21382a7b83848bd4500e6adef3cae_0;
    }

    private class11933(int n2, int n3, class07085 class070852, class11328 class113282) {
        this.z();
        this.fields_0d3a21382a7b83848bd4500e6adef3cae_0 = n2;
        this.fields_0d3a21382a7b83848bd4500e6adef3cae_1 = n3;
        this.fields_0d3a21382a7b83848bd4500e6adef3cae_2 = class070852;
        this.fields_0d3a21382a7b83848bd4500e6adef3cae_3 = class113282;
    }

    static {
        class11933.Z();
        class11933.i();
        staticFields_0d3a21382a7b83848bd4500e6adef3cae_0 = new class11933(2, 6, class07085.field_6174, class065842 -> class07438.method_63624((class06584)class065842, (class07085)class07085.field_6174));
        staticFields_0d3a21382a7b83848bd4500e6adef3cae_1 = new class11933(3, 5, class07085.field_6169, class065842 -> class11929.N(class065842, class07085.field_6169));
        staticFields_0d3a21382a7b83848bd4500e6adef3cae_2 = new class11933(2, 6, class07085.field_6174, class065842 -> class11929.N(class065842, class07085.field_6174));
        staticFields_0d3a21382a7b83848bd4500e6adef3cae_3 = new class11933(1, 7, class07085.field_6172, class065842 -> class11929.N(class065842, class07085.field_6172));
        staticFields_0d3a21382a7b83848bd4500e6adef3cae_4 = new class11933(0, 8, class07085.field_6166, class065842 -> class11929.N(class065842, class07085.field_6166));
        staticFields_0d3a21382a7b83848bd4500e6adef3cae_5 = class11933.U();
    }

    public static class11933[] values() {
        return (class11933[])staticFields_0d3a21382a7b83848bd4500e6adef3cae_5.clone();
    }

    public static class11933 valueOf(String string) {
        return Enum.valueOf(class11933.class, string);
    }

    private static void Z() {
        strings_0d3a21382a7b83848bd4500e6adef3cae = new String[5];
        class11933.strings_0d3a21382a7b83848bd4500e6adef3cae[0] = "ELYTRA";
        class11933.strings_0d3a21382a7b83848bd4500e6adef3cae[1] = "HELMET";
        class11933.strings_0d3a21382a7b83848bd4500e6adef3cae[2] = "CHESTPLATE";
        class11933.strings_0d3a21382a7b83848bd4500e6adef3cae[3] = "LEGGINGS";
        class11933.strings_0d3a21382a7b83848bd4500e6adef3cae[4] = "BOOTS";
    }

    private static void i() {
    }

    private static /* synthetic */ class11933[] U() {
        return new class11933[]{staticFields_0d3a21382a7b83848bd4500e6adef3cae_0, staticFields_0d3a21382a7b83848bd4500e6adef3cae_1, staticFields_0d3a21382a7b83848bd4500e6adef3cae_2, staticFields_0d3a21382a7b83848bd4500e6adef3cae_3, staticFields_0d3a21382a7b83848bd4500e6adef3cae_4};
    }

    private void z() {
        this.fields_0d3a21382a7b83848bd4500e6adef3cae_0 = 0;
        this.fields_0d3a21382a7b83848bd4500e6adef3cae_1 = 0;
    }

    public class11328 u() {
        return this.fields_0d3a21382a7b83848bd4500e6adef3cae_3;
    }

    public class07085 y() {
        return this.fields_0d3a21382a7b83848bd4500e6adef3cae_2;
    }

    public int N() {
        return this.fields_0d3a21382a7b83848bd4500e6adef3cae_1;
    }
}

