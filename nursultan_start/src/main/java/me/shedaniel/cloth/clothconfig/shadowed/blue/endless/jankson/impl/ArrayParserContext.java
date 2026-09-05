/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonArray;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ElementParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;

public class ArrayParserContext
implements ParserContext<JsonArray> {
    private JsonArray result = new JsonArray();
    private boolean foundClosingBrace = false;
    private String comment = null;

    @Override
    public boolean consume(int n, Jankson jankson) throws SyntaxError {
        this.result.setMarshaller(jankson.getMarshaller());
        if (this.foundClosingBrace) {
            return false;
        }
        if (Character.isWhitespace(n) || n == 44) {
            return true;
        }
        if (n == 93) {
            this.foundClosingBrace = true;
            return true;
        }
        jankson.push(new ElementParserContext(), annotatedElement -> {
            if (annotatedElement.getElement() != null) {
                this.result.add(annotatedElement.getElement(), annotatedElement.getComment());
            } else {
                String string = this.result.getComment(this.result.size() - 1);
                if (string == null) {
                    string = "";
                }
                String string2 = string + "\n" + annotatedElement.getComment();
                this.result.setComment(this.result.size() - 1, string2);
            }
        });
        return false;
    }

    @Override
    public JsonArray getResult() throws SyntaxError {
        return this.result;
    }

    @Override
    public boolean isComplete() {
        return this.foundClosingBrace;
    }

    @Override
    public void eof() throws SyntaxError {
        if (this.foundClosingBrace) {
            return;
        }
        throw new SyntaxError("Unexpected end-of-file in the middle of a list! Are you missing a ']'?");
    }
}

