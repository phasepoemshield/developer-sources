/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.api;

import me.shedaniel.clothconfig2.api.Requirement;

public interface DisableableWidget {
    public boolean isEnabled();

    public Requirement getRequirement();

    public void setRequirement(Requirement var1);
}

