/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 */
package com.viaversion.viaversion.libs.mcstructs.text.events.hover.impl;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEvent;
import com.viaversion.viaversion.libs.mcstructs.text.events.hover.HoverEventAction;

public class AchievementHoverEvent
extends HoverEvent {
    private String statistic;

    public AchievementHoverEvent(String statistic) {
        super(HoverEventAction.SHOW_ACHIEVEMENT);
        this.statistic = statistic;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AchievementHoverEvent)) {
            return false;
        }
        AchievementHoverEvent other = (AchievementHoverEvent)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$statistic = this.getStatistic();
        String other$statistic = other.getStatistic();
        return !(this$statistic == null ? other$statistic != null : !this$statistic.equals(other$statistic));
    }

    @Override
    public String toString() {
        return ToString.of((Object)this).add("action", (Object)this.action).add("statistic", (Object)this.statistic).toString();
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $statistic = this.getStatistic();
        result = result * 59 + ($statistic == null ? 43 : $statistic.hashCode());
        return result;
    }

    public AchievementHoverEvent setStatistic(String statistic) {
        this.statistic = statistic;
        return this;
    }

    public String getStatistic() {
        return this.statistic;
    }

    protected boolean canEqual(Object other) {
        return other instanceof AchievementHoverEvent;
    }
}

