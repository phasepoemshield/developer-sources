/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Representer;

public class Representer$RepresentJavaBean
implements Represent {
    final /* synthetic */ Representer this$0;

    protected Representer$RepresentJavaBean(Representer representer) {
        this.this$0 = representer;
    }

    @Override
    public Node representData(Object object) {
        return this.this$0.representJavaBean(this.this$0.getProperties(object.getClass()), object);
    }
}

