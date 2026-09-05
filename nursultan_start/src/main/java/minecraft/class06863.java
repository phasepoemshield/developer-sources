/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03719
 *  minecraft.class03762
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06521
 */
package minecraft;

import java.util.function.Function;
import minecraft.class01894;
import minecraft.class03719;
import minecraft.class03762;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06521;

public class class06863 {
    private final Function<class03762, class06521<?>> N;

    public class06863(Function<class03762, class06521<?>> function) {
        this.N = function;
    }

    private class05946 N(class05946 class059462, class03719 class037192) {
        return class05946.N((class05946)class059462.L(), (class01894)class037192.getRecipeIdentifier(class059462.N()));
    }

    public void N(class03719 class037192, class05946<class06521<?>> class059462) {
        class059462 = this.N(class059462, class037192);
        class037192.method_53819(class059462, this.N.apply(class03762.field_40251), null);
    }

    public void N(class03719 class037192, String string) {
        this.N(class037192, class05946.N((class05946)class04227.yV, (class01894)class01894.N((String)string)));
    }

    public static class06863 N(Function<class03762, class06521<?>> function) {
        return new class06863(function);
    }
}

