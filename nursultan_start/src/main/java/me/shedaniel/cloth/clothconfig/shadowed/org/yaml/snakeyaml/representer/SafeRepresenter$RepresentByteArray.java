/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$ScalarStyle
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Represent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.SafeRepresenter;

public class SafeRepresenter$RepresentByteArray
implements Represent {
    final /* synthetic */ SafeRepresenter this$0;

    protected SafeRepresenter$RepresentByteArray(SafeRepresenter safeRepresenter) {
        this.this$0 = safeRepresenter;
    }

    @Override
    public Node representData(Object object) {
        char[] cArray = Base64Coder.encode((byte[])object);
        return this.this$0.representScalar(Tag.BINARY, String.valueOf(cArray), DumperOptions.ScalarStyle.LITERAL);
    }
}

