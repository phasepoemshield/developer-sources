/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class06202
 */
package com.terraformersmc.modmenu.util.mod;

import com.terraformersmc.modmenu.gui.ModsScreen;
import com.terraformersmc.modmenu.util.DrawingUtil;
import com.terraformersmc.modmenu.util.mod.Mod;
import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import java.util.Set;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class06202;

public class ModBadgeRenderer {
    protected int startX;
    protected int startY;
    protected int badgeX;
    protected int badgeY;
    protected int badgeMax;
    protected Mod mod;
    protected class06202 client;
    protected final ModsScreen screen;

    public ModBadgeRenderer(int n, int n2, int n3, Mod mod, ModsScreen modsScreen) {
        this.startX = n;
        this.startY = n2;
        this.badgeMax = n3;
        this.mod = mod;
        this.screen = modsScreen;
        this.client = class06202.Nq();
    }

    public void draw(class01054 class010542, int n, int n2) {
        this.badgeX = this.startX;
        this.badgeY = this.startY;
        Set<Mod$Badge> set = this.mod.getBadges();
        set.forEach(mod$Badge -> this.drawBadge(class010542, (Mod$Badge)((Object)mod$Badge), n, n2));
    }

    public void drawBadge(class01054 class010542, class01028 class010282, int n, int n2, int n3, int n4) {
        int n5 = ((class01590)this.client.i_3).N(class010282) + 6;
        if (this.badgeX + n5 < this.badgeMax) {
            DrawingUtil.drawBadge(class010542, this.badgeX, this.badgeY, n5, class010282, n, n2, -3487030);
            this.badgeX += n5 + 3;
        }
    }

    public void drawBadge(class01054 class010542, Mod$Badge mod$Badge, int n, int n2) {
        this.drawBadge(class010542, mod$Badge.getText().method_30937(), mod$Badge.getOutlineColor(), mod$Badge.getFillColor(), n, n2);
    }

    public Mod getMod() {
        return this.mod;
    }
}

