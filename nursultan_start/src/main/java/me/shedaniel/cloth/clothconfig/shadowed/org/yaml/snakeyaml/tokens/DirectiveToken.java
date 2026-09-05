/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens;

import java.util.List;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID;

public final class DirectiveToken<T>
extends Token {
    private final String name;
    private final List<T> value;

    public DirectiveToken(String string, List<T> list, Mark mark, Mark mark2) {
        super(mark, mark2);
        this.name = string;
        if (list != null && list.size() != 2) {
            throw new YAMLException("Two strings must be provided instead of " + String.valueOf(list.size()));
        }
        this.value = list;
    }

    public String getName() {
        return this.name;
    }

    public List<T> getValue() {
        return this.value;
    }

    @Override
    public Token$ID getTokenId() {
        return Token$ID.Directive;
    }
}

