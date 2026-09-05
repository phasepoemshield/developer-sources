/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.Jankson
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonObject
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl;

import squeek.appleskin.shadowed.blue.endless.jankson.Jankson;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonObject;
import squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.CommentParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ElementParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.StringParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.TokenParserContext;

public class ObjectParserContext
implements ParserContext<JsonObject> {
    private JsonObject result = new JsonObject();
    private final boolean assumeOpen;
    private String comment;
    private boolean openBraceFound = false;
    private boolean noOpenBrace = false;
    private String key;
    private boolean colonFound = false;
    private boolean closeBraceFound = false;
    private boolean eof = false;

    @Override
    public boolean consume(int n, Jankson jankson) throws SyntaxError {
        this.result.setMarshaller(jankson.getMarshaller());
        if (!this.openBraceFound) {
            if (Character.isWhitespace(n)) {
                return true;
            }
            if (n == 47 || n == 35) {
                jankson.push((ParserContext)new CommentParserContext(n), string -> {
                    this.comment = this.comment == null ? string : this.comment + "\n" + string;
                });
                return true;
            }
            if (n == 123) {
                this.openBraceFound = true;
                return true;
            }
            if (this.assumeOpen) {
                this.openBraceFound = true;
                this.noOpenBrace = true;
            } else {
                throw new SyntaxError("Found character '" + (char)n + "' instead of '{' while looking for the start of an object");
            }
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
                    if (this.noOpenBrace) {
                        throw new SyntaxError("Found spurious '}' while parsing an object with no open brace.");
                    }
                    this.closeBraceFound = true;
                    return true;
                }
                case 44: {
                    return true;
                }
                case 34: 
                case 39: {
                    jankson.push((ParserContext)new StringParserContext(n), jsonPrimitive -> {
                        this.key = jsonPrimitive.asString();
                    });
                    return true;
                }
                case 35: 
                case 47: {
                    jankson.push((ParserContext)new CommentParserContext(n), string -> {
                        this.comment = this.comment == null ? string : this.comment + "\n" + string;
                    });
                    return true;
                }
                case 123: {
                    jankson.throwDelayed(new SyntaxError("Found spurious '{' while parsing an object."));
                    return true;
                }
            }
            jankson.push((ParserContext)new TokenParserContext(n), jsonPrimitive -> {
                this.key = jsonPrimitive.asString();
            });
            return true;
        }
        if (this.colonFound) {
            String string2 = this.key;
            jankson.push((ParserContext)new ElementParserContext(), annotatedElement -> {
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
        return this.closeBraceFound || this.assumeOpen && this.noOpenBrace && this.eof;
    }

    public ObjectParserContext(boolean bl) {
        this.assumeOpen = bl;
    }

    @Override
    public void eof() throws SyntaxError {
        this.eof = true;
        if (this.assumeOpen && this.noOpenBrace) {
            return;
        }
        if (this.closeBraceFound) {
            return;
        }
        throw new SyntaxError("Expected to find '}' to end an object, found EOF instead.");
    }
}

