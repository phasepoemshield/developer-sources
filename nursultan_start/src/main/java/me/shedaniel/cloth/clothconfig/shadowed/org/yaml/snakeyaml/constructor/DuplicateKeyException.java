/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.ConstructorException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;

public class DuplicateKeyException
extends ConstructorException {
    protected DuplicateKeyException(Mark mark, Object object, Mark mark2) {
        super("while constructing a mapping", mark, "found duplicate key " + String.valueOf(object), mark2);
    }
}

