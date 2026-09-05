/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.util.IdentityHashMap;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.AnchorNode;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.BaseRepresenter;

class BaseRepresenter$1
extends IdentityHashMap<Object, Node> {
    private static final long serialVersionUID = -5576159264232131854L;
    final /* synthetic */ BaseRepresenter this$0;

    BaseRepresenter$1(BaseRepresenter baseRepresenter) {
        this.this$0 = baseRepresenter;
    }

    @Override
    public Node put(Object object, Node node) {
        return super.put(object, new AnchorNode(node));
    }
}

