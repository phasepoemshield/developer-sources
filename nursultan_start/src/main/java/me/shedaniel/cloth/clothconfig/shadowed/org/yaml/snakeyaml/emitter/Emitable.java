/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter;

import java.io.IOException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;

public interface Emitable {
    public void emit(Event var1) throws IOException;
}

