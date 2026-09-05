/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.MarkedYAMLException
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.composer;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.MarkedYAMLException;

public class ComposerException
extends MarkedYAMLException {
    private static final long serialVersionUID = 2146314636913113935L;

    protected ComposerException(String string, Mark mark, String string2, Mark mark2) {
        super(string, mark, string2, mark2);
    }
}

