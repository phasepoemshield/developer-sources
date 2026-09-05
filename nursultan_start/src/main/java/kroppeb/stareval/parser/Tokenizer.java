/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 */
package kroppeb.stareval.parser;

import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.exception.ParseException;
import kroppeb.stareval.exception.UnexpectedCharacterException;
import kroppeb.stareval.exception.UnexpectedEndingException;
import kroppeb.stareval.parser.BinaryOp;
import kroppeb.stareval.parser.OpResolver;
import kroppeb.stareval.parser.Parser;
import kroppeb.stareval.parser.ParserOptions;
import kroppeb.stareval.parser.ParserOptions$TokenRules;
import kroppeb.stareval.parser.StringReader;
import kroppeb.stareval.parser.Tokenizer$CharPredicate;

class Tokenizer {
    private Tokenizer() {
    }

    static ExpressionElement parse(String string, ParserOptions parserOptions) throws ParseException {
        return Tokenizer.parseInternal(new StringReader(string), parserOptions);
    }

    private static String readWhile(StringReader stringReader, Tokenizer$CharPredicate tokenizer$CharPredicate) {
        stringReader.mark();
        while (stringReader.canRead() && tokenizer$CharPredicate.test(stringReader.peek())) {
            stringReader.skipOneCharacter();
        }
        return stringReader.substring();
    }

    static ExpressionElement parseInternal(StringReader stringReader, ParserOptions parserOptions) throws ParseException {
        Parser parser = new Parser();
        ParserOptions$TokenRules parserOptions$TokenRules = parserOptions.getTokenRules();
        while (stringReader.canRead()) {
            OpResolver<Record> opResolver;
            stringReader.skipWhitespace();
            if (!stringReader.canRead()) break;
            char c = stringReader.read();
            if (parserOptions$TokenRules.isIdStart(c)) {
                opResolver = Tokenizer.readWhile(stringReader, parserOptions$TokenRules::isIdPart);
                parser.visitId((String)((Object)opResolver));
                continue;
            }
            if (c == '.' && parser.canReadAccess()) {
                stringReader.skipWhitespace();
                if (stringReader.canRead()) {
                    char c2 = stringReader.read();
                    if (!parserOptions$TokenRules.isAccessStart(c2)) {
                        throw new UnexpectedCharacterException("a valid accessor", c2, stringReader.getCurrentIndex());
                    }
                    String string = Tokenizer.readWhile(stringReader, parserOptions$TokenRules::isAccessPart);
                    parser.visitAccess(string);
                    continue;
                }
                throw new UnexpectedEndingException("An expression can't end with '.'");
            }
            if (parserOptions$TokenRules.isNumberStart(c)) {
                opResolver = Tokenizer.readWhile(stringReader, parserOptions$TokenRules::isNumberPart);
                parser.visitNumber((String)((Object)opResolver));
                continue;
            }
            if (c == '(') {
                parser.visitOpeningParenthesis();
                continue;
            }
            if (c == ',') {
                parser.visitComma(stringReader.getCurrentIndex());
                continue;
            }
            if (c == ')') {
                parser.visitClosingParenthesis(stringReader.getCurrentIndex());
                continue;
            }
            if (parser.canReadBinaryOp()) {
                opResolver = parserOptions.getBinaryOpResolver(c);
                if (opResolver != null) {
                    parser.visitBinaryOperator((BinaryOp)((Object)opResolver.resolve(stringReader)));
                    continue;
                }
            } else {
                opResolver = parserOptions.getUnaryOpResolver(c);
                if (opResolver != null) {
                    parser.visitUnaryOperator(opResolver.resolve(stringReader));
                    continue;
                }
            }
            throw new UnexpectedCharacterException(c, stringReader.getCurrentIndex());
        }
        return parser.getFinal(stringReader.getCurrentIndex());
    }
}

