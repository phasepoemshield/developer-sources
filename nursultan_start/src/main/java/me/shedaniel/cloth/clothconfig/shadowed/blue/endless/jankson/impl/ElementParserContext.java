/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import java.util.Locale;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonNull;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonPrimitive;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.AnnotatedElement;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ArrayParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.CommentParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.NumberParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ObjectParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.StringParserContext;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.TokenParserContext;

public class ElementParserContext
implements ParserContext<AnnotatedElement> {
    String comment = null;
    AnnotatedElement result = null;
    boolean childActive = false;

    @Override
    public boolean consume(int n, Jankson jankson) throws SyntaxError {
        if (Character.isWhitespace(n)) {
            return true;
        }
        switch (n) {
            case 35: 
            case 47: {
                jankson.push(new CommentParserContext(n), string -> {
                    this.comment = string;
                });
                return true;
            }
            case 34: 
            case 39: {
                jankson.push(new StringParserContext(n), this::setResult);
                this.childActive = true;
                return true;
            }
            case 123: {
                jankson.push(new ObjectParserContext(), this::setResult);
                this.childActive = true;
                return false;
            }
            case 91: {
                jankson.push(new ArrayParserContext(), this::setResult);
                this.childActive = true;
                return true;
            }
            case 125: {
                jankson.throwDelayed(new SyntaxError("Found '" + (char)n + "' while parsing an element - this shouldn't happen!"));
                return false;
            }
            case 93: {
                this.result = new AnnotatedElement(null, this.comment);
                return false;
            }
        }
        if (Character.isDigit(n) || n == 45 || n == 43 || n == 46) {
            jankson.push(new NumberParserContext(n), this::setResult);
            this.childActive = true;
            return true;
        }
        jankson.push(new TokenParserContext(n), jsonPrimitive -> {
            String string;
            switch (string = jsonPrimitive.asString().toLowerCase(Locale.ROOT)) {
                case "null": {
                    this.setResult(JsonNull.INSTANCE);
                    break;
                }
                case "true": {
                    this.setResult(JsonPrimitive.TRUE);
                    break;
                }
                case "false": {
                    this.setResult(JsonPrimitive.FALSE);
                    break;
                }
                case "infinity": 
                case "+infinity": {
                    this.setResult(new JsonPrimitive(Double.POSITIVE_INFINITY));
                    break;
                }
                case "-infinity": {
                    this.setResult(new JsonPrimitive(Double.NEGATIVE_INFINITY));
                    break;
                }
                case "nan": {
                    this.setResult(new JsonPrimitive(Double.NaN));
                    break;
                }
                default: {
                    this.setResult((JsonElement)jsonPrimitive);
                }
            }
        });
        this.childActive = true;
        return true;
    }

    @Override
    public AnnotatedElement getResult() throws SyntaxError {
        return this.result;
    }

    @Override
    public boolean isComplete() {
        return this.result != null;
    }

    @Override
    public void eof() throws SyntaxError {
        if (!this.childActive) {
            throw new SyntaxError("Unexpected end-of-file while looking for a json element!");
        }
    }

    public void setResult(JsonElement jsonElement) {
        this.result = new AnnotatedElement(jsonElement, this.comment);
    }
}

