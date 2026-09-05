/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.Jankson
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonElement
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonNull
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.AnnotatedElement
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl;

import java.util.Locale;
import squeek.appleskin.shadowed.blue.endless.jankson.Jankson;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonNull;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive;
import squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.AnnotatedElement;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ArrayParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.CommentParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.NumberParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ObjectParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.StringParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.TokenParserContext;

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
                jankson.push((ParserContext)new CommentParserContext(n), string -> {
                    this.comment = string;
                });
                return true;
            }
            case 34: 
            case 39: {
                jankson.push((ParserContext)new StringParserContext(n), this::setResult);
                this.childActive = true;
                return true;
            }
            case 123: {
                jankson.push((ParserContext)new ObjectParserContext(false), this::setResult);
                this.childActive = true;
                return false;
            }
            case 91: {
                jankson.push((ParserContext)new ArrayParserContext(), this::setResult);
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
            jankson.push((ParserContext)new NumberParserContext(n), this::setResult);
            this.childActive = true;
            return true;
        }
        jankson.push((ParserContext)new TokenParserContext(n), jsonPrimitive -> {
            String string;
            switch (string = jsonPrimitive.asString().toLowerCase(Locale.ROOT)) {
                case "null": {
                    this.setResult((JsonElement)JsonNull.INSTANCE);
                    break;
                }
                case "true": {
                    this.setResult((JsonElement)JsonPrimitive.TRUE);
                    break;
                }
                case "false": {
                    this.setResult((JsonElement)JsonPrimitive.FALSE);
                    break;
                }
                case "infinity": 
                case "+infinity": {
                    this.setResult((JsonElement)new JsonPrimitive((Object)Double.POSITIVE_INFINITY));
                    break;
                }
                case "-infinity": {
                    this.setResult((JsonElement)new JsonPrimitive((Object)Double.NEGATIVE_INFINITY));
                    break;
                }
                case "nan": {
                    this.setResult((JsonElement)new JsonPrimitive((Object)Double.NaN));
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

