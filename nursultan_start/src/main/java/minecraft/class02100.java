/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Stack
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class03734
 *  minecraft.class06513
 *  minecraft.class07151
 */
package minecraft;

import it.unimi.dsi.fastutil.Stack;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class02098;
import minecraft.class02115;
import minecraft.class03734;
import minecraft.class06513;
import minecraft.class07151;

public class class02100 {
    private static final int N = 2;

    public static void N(class03734 class037342, Predicate<class03734> predicate, class02098 class020982) {
        class03734 class037343 = class037342.u();
        ObjectArrayList objectArrayList = new ObjectArrayList();
        for (int i = 0; i <= 2; ++i) {
            objectArrayList.push((Object)class02115.field_41740);
        }
        class02100.N(class037343, (Stack<class02115>)objectArrayList, predicate, class020982);
    }

    private static boolean N(class03734 class037342, Stack<class02115> stack, Predicate<class03734> predicate, class02098 class020982) {
        boolean bl = predicate.test(class037342);
        class02115 class021152 = class02100.N(class037342.N(), bl);
        boolean bl2 = bl;
        stack.push((Object)class021152);
        for (class03734 class037343 : class037342.i()) {
            bl2 |= class02100.N(class037343, stack, predicate, class020982);
        }
        boolean bl3 = bl2 || class02100.N(stack);
        stack.pop();
        class020982.accept(class037342, bl3);
        return bl2;
    }

    private static boolean N(Stack<class02115> stack) {
        for (int i = 0; i <= 2; ++i) {
            class02115 class021152 = (class02115)((Object)stack.peek(i));
            if (class021152 == class02115.field_41738) {
                return true;
            }
            if (class021152 != class02115.field_41739) continue;
            return false;
        }
        return false;
    }

    private static class02115 N(class07151 class071512, boolean bl) {
        Optional var2 = class071512.L();
        if (var2.isEmpty()) {
            return class02115.field_41739;
        }
        if (bl) {
            return class02115.field_41738;
        }
        if (((class06513)var2.get()).z()) {
            return class02115.field_41739;
        }
        return class02115.field_41740;
    }
}

