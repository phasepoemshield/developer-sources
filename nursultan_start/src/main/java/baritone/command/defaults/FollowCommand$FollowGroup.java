/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08036
 */
package baritone.command.defaults;

import java.util.function.Predicate;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08036;

enum FollowCommand$FollowGroup {
    ENTITIES(class07438.class::isInstance),
    PLAYERS(class08036.class::isInstance);

    final Predicate<class07049> filter;

    private FollowCommand$FollowGroup(Predicate<class07049> predicate) {
        this.filter = predicate;
    }
}

