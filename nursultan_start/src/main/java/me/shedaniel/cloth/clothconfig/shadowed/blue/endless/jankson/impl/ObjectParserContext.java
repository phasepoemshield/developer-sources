/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonObject;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.CommentParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ElementParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.StringParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.TokenParserContext;

public class ObjectParserContext
implements ParserContext<JsonObject> {
    private JsonObject result = new JsonObject();
    private String comment;
    private boolean openBraceFound = false;
    private String key;
    private boolean colonFound = false;
    private boolean closeBraceFound = false;

    @Override
    public boolean consume(int n, Jankson jankson) throws SyntaxError {
        this.result.setMarshaller(jankson.getMarshaller());
        if (!this.openBraceFound) {
            if (Character.isWhitespace(n)) {
                return true;
            }
            if (n == 47 || n == 35) {
                jankson.push(new CommentParserContext(n), string -> {
                    this.comment = string;
                });
                return true;
            }
            if (n == 123) {
                this.openBraceFound = true;
                return true;
            }
            throw new SyntaxError("Found character '" + (char)n + "' instead of '{' while looking for the start of an object");
        }
        if (this.closeBraceFound) {
            return false;
        }
        if (this.key == null) {
            if (Character.isWhitespace(n) || n == 44) {
                return true;
            }
            switch (n) {
                case 125: {
                    this.closeBraceFound = true;
                    return true;
                }
                case 44: {
                    return true;
                }
                case 34: 
                case 39: {
                    jankson.push(new StringParserContext(n), jsonPrimitive -> {
                        this.key = jsonPrimitive.asString();
                    });
                    return true;
                }
                case 35: 
                case 47: {
                    jankson.push(new CommentParserContext(n), string -> {
                        this.comment = string;
                    });
                    return true;
                }
                case 123: {
                    jankson.throwDelayed(new SyntaxError("Found spurious '{' while parsing an object."));
                    return true;
                }
            }
            jankson.push(new TokenParserContext(n), jsonPrimitive -> {
                this.key = jsonPrimitive.asString();
            });
            return true;
        }
        if (this.colonFound) {
            String string2 = this.key;
            jankson.push(new ElementParserContext(), annotatedElement -> {
                String string2 = "";
                if (this.comment != null) {
                    string2 = string2 + this.comment;
                }
                if (this.comment != null && annotatedElement.getComment() != null) {
                    string2 = string2 + '\n';
                }
                if (annotatedElement.getComment() != null) {
                    string2 = string2 + annotatedElement.getComment();
                }
                this.result.put(string2, annotatedElement.getElement(), string2);
                this.key = null;
                this.colonFound = false;
                this.comment = null;
            });
            return false;
        }
        if (Character.isWhitespace(n)) {
            return true;
        }
        if (n == 58) {
            this.colonFound = true;
            return true;
        }
        throw new SyntaxError("Found unexpected character '" + (char)n + "' while looking for the colon (':') between a key and a value in an object");
    }

    @Override
    public JsonObject getResult() {
        return this.result;
    }

    @Override
    public boolean isComplete() {
        return this.closeBraceFound;
    }

    @Override
    public void eof() throws SyntaxError {
        if (this.closeBraceFound) {
            return;
        }
        throw new SyntaxError("Expected to find '}' to end an object, found EOF instead.");
    }
}

