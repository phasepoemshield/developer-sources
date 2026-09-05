/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.env;

import java.util.regex.Matcher;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.AbstractConstruct;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.env.EnvScalarConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.env.EnvScalarConstructor$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.ScalarNode;

class EnvScalarConstructor$ConstructEnv
extends AbstractConstruct {
    final /* synthetic */ EnvScalarConstructor this$0;

    private EnvScalarConstructor$ConstructEnv(EnvScalarConstructor envScalarConstructor) {
        this.this$0 = envScalarConstructor;
    }

    /* synthetic */ EnvScalarConstructor$ConstructEnv(EnvScalarConstructor envScalarConstructor, EnvScalarConstructor$1 envScalarConstructor$1) {
        this(envScalarConstructor);
    }

    public Object construct(Node node) {
        String string = EnvScalarConstructor.access$100(this.this$0, (ScalarNode)node);
        Matcher matcher = EnvScalarConstructor.ENV_FORMAT.matcher(string);
        matcher.matches();
        String string2 = matcher.group("name");
        String string3 = matcher.group("value");
        String string4 = matcher.group("separator");
        return this.this$0.apply(string2, string4, string3 != null ? string3 : "", this.this$0.getEnv(string2));
    }
}

