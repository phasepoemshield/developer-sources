/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Point
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class05936
 */
package me.shedaniel.clothconfig2.api;

import java.util.List;
import me.shedaniel.clothconfig2.api.QueuedTooltip;
import me.shedaniel.math.Point;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class05936;

public interface Tooltip {
    public List<class01028> getText();

    public static Tooltip of(Point point, class00392 ... class00392Array) {
        return QueuedTooltip.create(point, class00392Array);
    }

    public static Tooltip of(Point point, class01028 ... class01028Array) {
        return QueuedTooltip.create(point, class01028Array);
    }

    public static Tooltip of(Point point, class05936 ... class05936Array) {
        return QueuedTooltip.create(point, class05936Array);
    }

    public Point getPoint();

    default public int getY() {
        return this.getPoint().getY();
    }

    default public int getX() {
        return this.getPoint().getX();
    }
}

