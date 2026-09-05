/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.NodeEvent;

public abstract class CollectionStartEvent
extends NodeEvent {
    private final String tag;
    private final boolean implicit;
    private final DumperOptions.FlowStyle flowStyle;

    public CollectionStartEvent(String string, String string2, boolean bl, Mark mark, Mark mark2, DumperOptions.FlowStyle flowStyle) {
        super(string, mark, mark2);
        this.tag = string2;
        this.implicit = bl;
        if (flowStyle == null) {
            throw new NullPointerException("Flow style must be provided.");
        }
        this.flowStyle = flowStyle;
    }

    @Deprecated
    public CollectionStartEvent(String string, String string2, boolean bl, Mark mark, Mark mark2, Boolean bl2) {
        this(string, string2, bl, mark, mark2, DumperOptions.FlowStyle.fromBoolean((Boolean)bl2));
    }

    @Override
    protected String getArguments() {
        return super.getArguments() + ", tag=" + this.tag + ", implicit=" + this.implicit;
    }

    public String getTag() {
        return this.tag;
    }

    public DumperOptions.FlowStyle getFlowStyle() {
        return this.flowStyle;
    }

    public boolean getImplicit() {
        return this.implicit;
    }

    public boolean isFlow() {
        return DumperOptions.FlowStyle.FLOW == this.flowStyle;
    }
}

