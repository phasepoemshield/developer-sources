/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class SafeRepresenter$RepresentBoolean
implements Represent {
    final /* synthetic */ SafeRepresenter this$0;

    protected SafeRepresenter$RepresentBoolean(SafeRepresenter safeRepresenter) {
        this.this$0 = safeRepresenter;
    }

    @Override
    public Node representData(Object object) {
        String string = Boolean.TRUE.equals(object) ? "true" : "false";
        return this.this$0.representScalar(Tag.BOOL, string);
    }
}

