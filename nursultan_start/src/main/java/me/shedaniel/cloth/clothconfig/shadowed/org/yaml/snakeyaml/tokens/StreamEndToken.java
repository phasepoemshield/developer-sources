/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID;

public final class StreamEndToken
extends Token {
    public StreamEndToken(Mark mark, Mark mark2) {
        super(mark, mark2);
    }

    @Override
    public Token$ID getTokenId() {
        return Token$ID.StreamEnd;
    }
}

