/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID;

public interface Parser {
    public Event getEvent();

    public boolean checkEvent(Event$ID var1);

    public Event peekEvent();
}

