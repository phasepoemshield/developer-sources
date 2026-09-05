/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Point
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class05936
 *  minecraft.class07018
 */
package me.shedaniel.clothconfig2.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import me.shedaniel.clothconfig2.api.Tooltip;
import me.shedaniel.math.Point;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class05936;
import minecraft.class07018;

public class QueuedTooltip
implements Tooltip {
    private final Point location;
    private final List<class01028> text;

    public static QueuedTooltip create(Point point, class05936 ... class05936Array) {
        return new QueuedTooltip(point, class07018.y().N(Arrays.asList(class05936Array)));
    }

    public static QueuedTooltip create(Point point, class00392 ... class00392Array) {
        return QueuedTooltip.create(point, Arrays.asList(class00392Array));
    }

    public static QueuedTooltip create(Point point, List<class00392> list) {
        return new QueuedTooltip(point, class07018.y().N(list));
    }

    public static QueuedTooltip create(Point point, class01028 ... class01028Array) {
        return new QueuedTooltip(point, Arrays.asList(class01028Array));
    }

    @Override
    public List<class01028> getText() {
        return this.text;
    }

    private QueuedTooltip(Point point, List<class01028> list) {
        this.location = point;
        this.text = Collections.unmodifiableList(list);
    }

    @Override
    public Point getPoint() {
        return this.location;
    }
}

