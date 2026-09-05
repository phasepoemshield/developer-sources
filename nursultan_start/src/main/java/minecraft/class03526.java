/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01424
 *  minecraft.class03152
 *  minecraft.class03153
 *  minecraft.class03154
 *  minecraft.class03171
 *  minecraft.class03173
 *  minecraft.class07001
 */
package minecraft;

import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class01424;
import minecraft.class03152;
import minecraft.class03153;
import minecraft.class03154;
import minecraft.class03171;
import minecraft.class03173;
import minecraft.class07001;

public class class03526
extends class03171 {
    private final Deque<class03173> N = new ArrayDeque<class03173>();

    public class03526(class03152 ... class03152Array) {
        class03173 class031732 = class03173.N();
        for (class03152 class031522 : class03152Array) {
            class031732.N(class031522);
        }
        this.N.push(class031732);
    }

    public class03154 y() {
        if (this.i() == this.N.element().y()) {
            this.N.pop();
        }
        return super.y();
    }

    public class03153 N(class01424<?> class014242, String string) {
        class03173 class031732;
        class03173 class031733 = this.N.element();
        if (class031733.N(class014242, string)) {
            return class03153.field_36249;
        }
        if (class014242 == class07001.y && (class031732 = (class03173)class031733.u().get(string)) != null) {
            this.N.push(class031732);
        }
        return super.N(class014242, string);
    }
}

