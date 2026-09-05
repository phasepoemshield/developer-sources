/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.api;

import me.shedaniel.clothconfig2.api.Requirement;

public interface HideableWidget {
    public boolean isDisplayed();

    public void setDisplayRequirement(Requirement var1);

    public Requirement getDisplayRequirement();
}

