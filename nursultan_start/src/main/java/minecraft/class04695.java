/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 *  minecraft.class06366
 *  minecraft.class08030
 */
package minecraft;

import java.util.ArrayList;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;
import minecraft.class06366;
import minecraft.class08030;

public class class04695
extends class05914 {
    private static final class00392 N = class00392.L((String)"options.skinCustomisation.title");

    public class04695(class05096 class050962, class05630 class056302) {
        super(class050962, class056302, N);
    }

    protected void method_60325() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (class08030 class080302 : class08030.values()) {
            arrayList.add(class06366.N((boolean)this.field_21336.N(class080302)).N(class080302.u(), (class063662, bl) -> this.field_21336.N(class080302, bl.booleanValue())));
        }
        arrayList.add(this.field_21336.O().method_57701(this.field_21336));
        this.field_51824.N(arrayList);
    }
}

