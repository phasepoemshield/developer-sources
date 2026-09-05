/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.TagTuple;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID;

public final class TagToken
extends Token {
    private final TagTuple value;

    public TagToken(TagTuple tagTuple, Mark mark, Mark mark2) {
        super(mark, mark2);
        this.value = tagTuple;
    }

    public TagTuple getValue() {
        return this.value;
    }

    @Override
    public Token$ID getTokenId() {
        return Token$ID.Tag;
    }
}

