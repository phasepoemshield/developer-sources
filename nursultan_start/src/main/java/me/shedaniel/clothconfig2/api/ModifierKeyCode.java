/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.impl.ModifierKeyCodeImpl
 *  minecraft.class00392
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class04671
 *  minecraft.class06202
 *  minecraft.class08844
 *  org.lwjgl.glfw.GLFW
 */
package me.shedaniel.clothconfig2.api;

import me.shedaniel.clothconfig2.api.Modifier;
import me.shedaniel.clothconfig2.impl.ModifierKeyCodeImpl;
import minecraft.class00392;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class04671;
import minecraft.class06202;
import minecraft.class08844;
import org.lwjgl.glfw.GLFW;

public interface ModifierKeyCode {
    public String toString();

    public static ModifierKeyCode copyOf(ModifierKeyCode modifierKeyCode) {
        return ModifierKeyCode.of(modifierKeyCode.getKeyCode(), modifierKeyCode.getModifier());
    }

    public static ModifierKeyCode of(class04671 class046712, Modifier modifier) {
        return new ModifierKeyCodeImpl().setKeyCodeAndModifier(class046712, modifier);
    }

    default public class04648 getType() {
        return this.getKeyCode().N();
    }

    default public ModifierKeyCode copy() {
        return ModifierKeyCode.copyOf(this);
    }

    default public boolean matchesKey(int n, int n2) {
        if (this.isUnknown()) {
            return false;
        }
        if (n == class04655.yI.y()) {
            return this.getType() == class04648.field_1671 && this.getKeyCode().y() == n2 && this.getModifier().matchesCurrent();
        }
        return this.getType() == class04648.field_1668 && this.getKeyCode().y() == n && this.getModifier().matchesCurrent();
    }

    public static ModifierKeyCode unknown() {
        return ModifierKeyCode.of(class04655.yI, Modifier.none());
    }

    default public boolean isUnknown() {
        return this.getKeyCode().equals((Object)class04655.yI);
    }

    public class04671 getKeyCode();

    public class00392 getLocalizedName();

    public ModifierKeyCode setKeyCode(class04671 var1);

    default public boolean matchesMouse(int n) {
        return !this.isUnknown() && this.getType() == class04648.field_1672 && this.getKeyCode().y() == n && this.getModifier().matchesCurrent();
    }

    public ModifierKeyCode setModifier(Modifier var1);

    default public boolean matchesCurrentKey() {
        return !this.isUnknown() && this.getType() == class04648.field_1668 && this.getModifier().matchesCurrent() && class04655.N((class08844)class06202.Nq().Nt(), (int)this.getKeyCode().y());
    }

    default public ModifierKeyCode clearModifier() {
        return this.setModifier(Modifier.none());
    }

    public Modifier getModifier();

    default public ModifierKeyCode setKeyCodeAndModifier(class04671 class046712, Modifier modifier) {
        this.setKeyCode(class046712);
        this.setModifier(modifier);
        return this;
    }

    default public boolean matchesCurrentMouse() {
        if (!this.isUnknown() && this.getType() == class04648.field_1672 && this.getModifier().matchesCurrent()) {
            return GLFW.glfwGetMouseButton((long)class06202.Nq().Nt().B(), (int)this.getKeyCode().y()) == 1;
        }
        return false;
    }
}

