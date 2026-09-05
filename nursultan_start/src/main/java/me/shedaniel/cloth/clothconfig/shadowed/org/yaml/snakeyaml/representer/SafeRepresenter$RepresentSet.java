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

import java.util.LinkedHashMap;
import java.util.Set;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class SafeRepresenter$RepresentSet
implements Represent {
    final /* synthetic */ SafeRepresenter this$0;

    protected SafeRepresenter$RepresentSet(SafeRepresenter safeRepresenter) {
        this.this$0 = safeRepresenter;
    }

    public Node representData(Object object) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set set = (Set)object;
        for (Object e : set) {
            linkedHashMap.put(e, null);
        }
        return this.this$0.representMapping(this.this$0.getTag(object.getClass(), Tag.SET), linkedHashMap, DumperOptions.FlowStyle.AUTO);
    }
}

