/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import java.util.Locale;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Jankson;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonPrimitive;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.SyntaxError;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl.ParserContext;

public class NumberParserContext
implements ParserContext<JsonPrimitive> {
    private String numberString = "";
    private boolean complete = false;
    private String acceptedChars = "0123456789.+-eExabcdefInityNn";

    @Override
    public boolean consume(int n, Jankson jankson) throws SyntaxError {
        if (this.complete) {
            return false;
        }
        if (this.acceptedChars.indexOf(n) != -1) {
            this.numberString = this.numberString + (char)n;
            return true;
        }
        this.complete = true;
        return false;
    }

    @Override
    public JsonPrimitive getResult() throws SyntaxError {
        String string = this.numberString.toLowerCase(Locale.ROOT);
        if (string.equals("infinity") || string.equals("+infinity")) {
            return new JsonPrimitive(Double.POSITIVE_INFINITY);
        }
        if (string.equals("-infinity")) {
            return new JsonPrimitive(Double.NEGATIVE_INFINITY);
        }
        if (string.equals("nan")) {
            return new JsonPrimitive(Double.NaN);
        }
        if (this.numberString.startsWith(".")) {
            this.numberString = '0' + this.numberString;
        }
        if (this.numberString.endsWith(".")) {
            this.numberString = this.numberString + '0';
        }
        if (this.numberString.startsWith("0x")) {
            this.numberString = this.numberString.substring(2);
            try {
                Long l = Long.parseUnsignedLong(this.numberString, 16);
                return new JsonPrimitive(l);
            }
            catch (NumberFormatException numberFormatException) {
                throw new SyntaxError("Tried to parse '" + this.numberString + "' as a hexadecimal number, but it appears to be invalid.");
            }
        }
        if (this.numberString.startsWith("-0x")) {
            this.numberString = this.numberString.substring(3);
            try {
                Long l = -Long.parseUnsignedLong(this.numberString, 16);
                return new JsonPrimitive(l);
            }
            catch (NumberFormatException numberFormatException) {
                throw new SyntaxError("Tried to parse '" + this.numberString + "' as a hexadecimal number, but it appears to be invalid.");
            }
        }
        if (this.numberString.indexOf(46) != -1) {
            try {
                Double d = Double.valueOf(this.numberString);
                return new JsonPrimitive(d);
            }
            catch (NumberFormatException numberFormatException) {
                throw new SyntaxError("Tried to parse '" + this.numberString + "' as a floating-point number, but it appears to be invalid.");
            }
        }
        try {
            Long l = Long.valueOf(this.numberString);
            return new JsonPrimitive(l);
        }
        catch (NumberFormatException numberFormatException) {
            throw new SyntaxError("Tried to parse '" + this.numberString + "' as an integer, but it appears to be invalid.");
        }
    }

    @Override
    public boolean isComplete() {
        return this.complete;
    }

    public NumberParserContext(int n) {
        this.numberString = this.numberString + (char)n;
    }

    @Override
    public void eof() throws SyntaxError {
        this.complete = true;
    }
}

