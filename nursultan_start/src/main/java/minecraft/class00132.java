/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05733
 *  minecraft.class06202
 *  minecraft.class08781
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00134;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05733;
import minecraft.class06202;
import minecraft.class08781;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class00132
extends class05733 {
    private final MutableObject<@Nullable class05096> N;

    private class00132(class06202 class062022, class08781 class087812, MutableObject<class05096> mutableObject) {
        super(bl -> {
            if (bl) {
                class087812.N(class00134.y);
            } else {
                class062022.N((class05096)mutableObject.get());
            }
        }, (class00392)class00392.L((String)"menu.custom_screen_info.title"), (class00392)class00392.L((String)"menu.custom_screen_info.contents"), class05220.y((boolean)class062022.q()), class05220.U);
        this.N = mutableObject;
    }

    public void N(@Nullable class05096 class050962) {
        this.N.setValue((Object)class050962);
    }

    public @Nullable class05096 N() {
        return (class05096)this.N.get();
    }

    public static class05096 N(class06202 class062022, class08781 class087812, class05096 class050962) {
        return new class00132(class062022, class087812, (MutableObject<class05096>)new MutableObject((Object)class050962));
    }
}

