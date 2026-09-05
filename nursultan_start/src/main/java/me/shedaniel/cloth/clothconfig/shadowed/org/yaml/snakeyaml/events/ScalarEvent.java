/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.ImplicitTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.NodeEvent;

public final class ScalarEvent
extends NodeEvent {
    private final String tag;
    private final DumperOptions.ScalarStyle style;
    private final String value;
    private final ImplicitTuple implicit;

    public ScalarEvent(String string, String string2, ImplicitTuple implicitTuple, String string3, Mark mark, Mark mark2, DumperOptions.ScalarStyle scalarStyle) {
        super(string, mark, mark2);
        this.tag = string2;
        this.implicit = implicitTuple;
        if (string3 == null) {
            throw new NullPointerException("Value must be provided.");
        }
        this.value = string3;
        if (scalarStyle == null) {
            throw new NullPointerException("Style must be provided.");
        }
        this.style = scalarStyle;
    }

    @Deprecated
    public ScalarEvent(String string, String string2, ImplicitTuple implicitTuple, String string3, Mark mark, Mark mark2, Character c) {
        this(string, string2, implicitTuple, string3, mark, mark2, DumperOptions.ScalarStyle.createStyle((Character)c));
    }

    public String getValue() {
        return this.value;
    }

    @Override
    protected String getArguments() {
        return super.getArguments() + ", tag=" + this.tag + ", " + this.implicit + ", value=" + this.value;
    }

    public String getTag() {
        return this.tag;
    }

    public ImplicitTuple getImplicit() {
        return this.implicit;
    }

    public DumperOptions.ScalarStyle getScalarStyle() {
        return this.style;
    }

    @Override
    public Event$ID getEventId() {
        return Event$ID.Scalar;
    }

    public boolean isPlain() {
        return this.style == DumperOptions.ScalarStyle.PLAIN;
    }

    @Deprecated
    public Character getStyle() {
        return this.style.getChar();
    }
}

