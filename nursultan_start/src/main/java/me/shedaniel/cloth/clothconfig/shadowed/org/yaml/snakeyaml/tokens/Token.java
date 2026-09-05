/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.tokens.Token$ID;

public abstract class Token {
    private final Mark startMark;
    private final Mark endMark;

    public Token(Mark mark, Mark mark2) {
        if (mark == null || mark2 == null) {
            throw new YAMLException("Token requires marks.");
        }
        this.startMark = mark;
        this.endMark = mark2;
    }

    public Mark getStartMark() {
        return this.startMark;
    }

    public Mark getEndMark() {
        return this.endMark;
    }

    public abstract Token$ID getTokenId();
}

