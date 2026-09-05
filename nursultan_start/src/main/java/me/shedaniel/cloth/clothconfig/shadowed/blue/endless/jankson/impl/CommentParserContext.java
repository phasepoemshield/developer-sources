/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;

public class CommentParserContext
implements ParserContext<String> {
    int firstChar = -1;
    int secondChar = -1;
    StringBuilder result = new StringBuilder();
    int prevChar = -1;
    boolean multiLine = false;
    boolean done = false;

    @Override
    public boolean consume(int n, Jankson jankson) throws SyntaxError {
        if (this.done) {
            return false;
        }
        if (this.firstChar == -1) {
            if (n != 47 && n != 35) {
                throw new SyntaxError("Was expecting the start of a comment, but found '" + (char)n + "' instead.");
            }
            this.firstChar = n;
            if (this.firstChar == 35) {
                this.multiLine = false;
            }
            return true;
        }
        if (this.secondChar == -1 && this.firstChar != 35) {
            this.secondChar = n;
            if (n == 42) {
                this.multiLine = true;
                return true;
            }
            if (n == 47) {
                this.multiLine = false;
                return true;
            }
            if (Character.isWhitespace(n)) {
                throw new SyntaxError("Was expecting the start of a comment, but found whitespace instead.");
            }
            throw new SyntaxError("Was expecting the start of a comment, but found '" + (char)n + "' instead.");
        }
        if (this.multiLine) {
            if (n == 47 && this.prevChar == 42) {
                this.result.deleteCharAt(this.result.length() - 1);
                this.done = true;
                return true;
            }
            this.prevChar = n;
            this.result.append((char)n);
            return true;
        }
        if (n == 10) {
            this.done = true;
            return true;
        }
        this.prevChar = n;
        this.result.append((char)n);
        return true;
    }

    @Override
    public String getResult() throws SyntaxError {
        return this.result.toString().trim();
    }

    @Override
    public boolean isComplete() {
        return this.done;
    }

    public CommentParserContext(int n) {
        this.firstChar = n;
    }

    @Override
    public void eof() throws SyntaxError {
        if (this.multiLine) {
            throw new SyntaxError("Unexpected end-of-file while reading a multiline comment.");
        }
    }
}

