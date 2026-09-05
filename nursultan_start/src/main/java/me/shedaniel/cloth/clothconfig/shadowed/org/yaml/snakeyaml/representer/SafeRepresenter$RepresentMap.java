/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.util.Map;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class SafeRepresenter$RepresentMap
implements Represent {
    final /* synthetic */ SafeRepresenter this$0;

    protected SafeRepresenter$RepresentMap(SafeRepresenter safeRepresenter) {
        this.this$0 = safeRepresenter;
    }

    public Node representData(Object object) {
        return this.this$0.representMapping(this.this$0.getTag(object.getClass(), Tag.MAP), (Map)object, DumperOptions.FlowStyle.AUTO);
    }
}

