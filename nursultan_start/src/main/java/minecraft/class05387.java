/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06581
 */
package minecraft;

import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06581;

public class class05387 {
    public static class01894 y(String string) {
        return class01894.y((String)("item/" + string));
    }

    public static class01894 N(class00891 class008912) {
        return class04206.i.y((Object)class008912).R("block/");
    }

    public static class01894 N(class06581 class065812, String string) {
        return class04206.B.y((Object)class065812).N(string2 -> "item/" + string2 + string);
    }

    public static class01894 N(class06581 class065812) {
        return class04206.B.y((Object)class065812).R("item/");
    }

    @Deprecated
    public static class01894 N(String string) {
        return class01894.y((String)("block/" + string));
    }

    public static class01894 N(class00891 class008912, String string) {
        return class04206.i.y((Object)class008912).N(string2 -> "block/" + string2 + string);
    }
}

