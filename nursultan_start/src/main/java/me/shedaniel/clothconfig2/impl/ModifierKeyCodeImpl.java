/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.Modifier
 *  me.shedaniel.clothconfig2.api.ModifierKeyCode
 *  minecraft.class00392
 *  minecraft.class04655
 *  minecraft.class04671
 */
package me.shedaniel.clothconfig2.impl;

import me.shedaniel.clothconfig2.api.Modifier;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
import minecraft.class00392;
import minecraft.class04655;
import minecraft.class04671;

public class ModifierKeyCodeImpl
implements ModifierKeyCode {
    private class04671 keyCode;
    private Modifier modifier;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ModifierKeyCode)) {
            return false;
        }
        ModifierKeyCode modifierKeyCode = (ModifierKeyCode)object;
        return this.keyCode.equals((Object)modifierKeyCode.getKeyCode()) && this.modifier.equals((Object)modifierKeyCode.getModifier());
    }

    public String toString() {
        return this.getLocalizedName().getString();
    }

    public int hashCode() {
        int n = this.keyCode != null ? this.keyCode.hashCode() : 0;
        n = 31 * n + (this.modifier != null ? this.modifier.hashCode() : 0);
        return n;
    }

    public class04671 getKeyCode() {
        return this.keyCode;
    }

    public class00392 getLocalizedName() {
        class00392 class003922 = this.keyCode.u();
        if (this.modifier.hasShift()) {
            class003922 = class00392.N((String)"modifier.cloth-config.shift", (Object[])new Object[]{class003922});
        }
        if (this.modifier.hasControl()) {
            class003922 = class00392.N((String)"modifier.cloth-config.ctrl", (Object[])new Object[]{class003922});
        }
        if (this.modifier.hasAlt()) {
            class003922 = class00392.N((String)"modifier.cloth-config.alt", (Object[])new Object[]{class003922});
        }
        return class003922;
    }

    public ModifierKeyCode setKeyCode(class04671 class046712) {
        this.keyCode = class046712.N().N(class046712.y());
        if (class046712.equals((Object)class04655.yI)) {
            this.setModifier(Modifier.none());
        }
        return this;
    }

    public ModifierKeyCode setModifier(Modifier modifier) {
        this.modifier = Modifier.of((short)modifier.getValue());
        return this;
    }

    public Modifier getModifier() {
        return this.modifier;
    }
}

