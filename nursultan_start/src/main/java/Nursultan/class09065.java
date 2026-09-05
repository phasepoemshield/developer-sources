/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class08066
 *  minecraft.class08879
 *  minecraft.class08893
 *  org.lwjgl.opengl.GL11
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class09076;
import Nursultan.class09083;
import Nursultan.class09086;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import minecraft.class08066;
import minecraft.class08879;
import minecraft.class08893;
import org.lwjgl.opengl.GL11;

public class class09065 {
    public Object N_0;
    public static Object y_0;
    public static Object y_1;

    public class09086 L(class09064 class090642) {
        this.N(class090642);
        return class090642.z();
    }

    public class09065() {
        this.R();
        this.N_0 = new ObjectOpenHashSet();
    }

    static {
        class09065.Z();
        y_0 = new class09065();
    }

    private static void Z() {
        y_0 = null;
        y_1 = 10000L;
    }

    public void i(class09064 class090642) {
        class090642.w();
        ((ObjectOpenHashSet)this.N_0).remove((Object)class090642);
    }

    public void u(class09064 class090642) {
        this.N(class090642);
        class090642.z().N(true, class090642.v());
    }

    private void y(long l) {
        ObjectIterator objectIterator = ((ObjectOpenHashSet)this.N_0).iterator();
        while (objectIterator.hasNext()) {
            class09064 class090642 = (class09064)objectIterator.next();
            class090642.N(l, 10000L);
            if (class090642.L()) continue;
            objectIterator.remove();
        }
    }

    public void y() {
        this.N(System.currentTimeMillis());
    }

    public class09083 y(class09064 class090642) {
        this.R(class090642);
        class09083 class090832 = class090642.j();
        ((ObjectOpenHashSet)this.N_0).add((Object)class090642);
        return class090832;
    }

    public void N(class09064 class090642, boolean bl) {
        this.N(class090642);
        class090642.z().N(bl);
    }

    public void N(class08066 class080662) {
        this.N(class080662, true);
        GL11.glClear((int)16640);
    }

    public void N(class08066 class080662, boolean bl) {
        class09065.N(((class08893)class080662.L()).N(((class08879)RenderSystem.getDevice()).y(), class080662.i()), class080662.N, class080662.y, bl);
    }

    public class09064 N(class09064 class090642) {
        this.R(class090642);
        class090642.T();
        class090642.N();
        ((ObjectOpenHashSet)this.N_0).add((Object)class090642);
        return class090642;
    }

    public void N(long l) {
        this.y(l);
    }

    public static void N(int n, int n2, int n3, boolean bl) {
        GlStateManager._glBindFramebuffer((int)36160, (int)n);
        if (bl) {
            GL11.glViewport((int)0, (int)0, (int)n2, (int)n3);
        }
    }

    public class09076 N() {
        return new class09076(this);
    }

    void R(class09064 class090642) {
        if (!class090642.y()) {
            return;
        }
        class090642.M();
    }

    private void R() {
    }
}

