/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  squeek.appleskin.shadowed.blue.endless.jankson.Jankson
 *  squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive
 *  squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError
 */
package squeek.appleskin.shadowed.blue.endless.jankson.impl;

import java.util.Locale;
import squeek.appleskin.shadowed.blue.endless.jankson.Jankson;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonPrimitive;
import squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ParserContext;

public class NumberParserContext
implements ParserContext<JsonPrimitive> {
    private String numberString = "";
    private boolean complete = false;
    private String acceptedChars = "0123456789.+-eExabcdefInityNnABCDF";

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
            return JsonPrimitive.of((Double)Double.POSITIVE_INFINITY);
        }
        if (string.equals("-infinity")) {
            return JsonPrimitive.of((Double)Double.NEGATIVE_INFINITY);
        }
        if (string.equals("nan")) {
            return JsonPrimitive.of((Double)Double.NaN);
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
                return JsonPrimitive.of((Long)l);
            }
            catch (NumberFormatException numberFormatException) {
                throw new SyntaxError("Tried to parse '" + this.numberString + "' as a hexadecimal number, but it appears to be invalid.");
            }
        }
        if (this.numberString.startsWith("-0x")) {
            this.numberString = this.numberString.substring(3);
            try {
                Long l = -Long.parseUnsignedLong(this.numberString, 16);
                return JsonPrimitive.of((Long)l);
            }
            catch (NumberFormatException numberFormatException) {
                throw new SyntaxError("Tried to parse '" + this.numberString + "' as a hexadecimal number, but it appears to be invalid.");
            }
        }
        if (this.numberString.indexOf(46) != -1) {
            try {
                Double d = Double.valueOf(this.numberString);
                return JsonPrimitive.of((Double)d);
            }
            catch (NumberFormatException numberFormatException) {
                throw new SyntaxError("Tried to parse '" + this.numberString + "' as a floating-point number, but it appears to be invalid.");
            }
        }
        try {
            Long l = Long.valueOf(this.numberString);
            return JsonPrimitive.of((Long)l);
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

