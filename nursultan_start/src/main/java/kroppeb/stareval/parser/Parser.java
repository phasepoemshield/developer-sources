/*
 * Decompiled with CFR 0.152.
 */
package kroppeb.stareval.parser;

import java.util.ArrayList;
import java.util.List;
import kroppeb.stareval.element.AccessibleExpressionElement;
import kroppeb.stareval.element.Element;
import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.element.PriorityOperatorElement;
import kroppeb.stareval.element.token.IdToken;
import kroppeb.stareval.element.token.NumberToken;
import kroppeb.stareval.element.token.UnaryOperatorToken;
import kroppeb.stareval.element.tree.AccessExpressionElement;
import kroppeb.stareval.element.tree.FunctionCall;
import kroppeb.stareval.element.tree.partial.PartialBinaryExpression;
import kroppeb.stareval.element.tree.partial.UnfinishedArgsExpression;
import kroppeb.stareval.exception.MissingTokenException;
import kroppeb.stareval.exception.ParseException;
import kroppeb.stareval.exception.UnexpectedTokenException;
import kroppeb.stareval.parser.BinaryOp;
import kroppeb.stareval.parser.ParserOptions;
import kroppeb.stareval.parser.Tokenizer;
import kroppeb.stareval.parser.UnaryOp;

public class Parser {
    private final List<Element> stack = new ArrayList<Element>();

    Parser() {
    }

    public static ExpressionElement parse(String string, ParserOptions parserOptions) throws ParseException {
        return Tokenizer.parse(string, parserOptions);
    }

    private Element peek() {
        if (!this.stack.isEmpty()) {
            return (Element)this.stack.getLast();
        }
        return null;
    }

    private void push(Element element) {
        this.stack.add(element);
    }

    private Element pop() {
        if (this.stack.isEmpty()) {
            throw new IllegalStateException("Internal token stack is empty");
        }
        return (Element)this.stack.removeLast();
    }

    void visitClosingParenthesis(int n) throws ParseException {
        boolean bl = this.peek() instanceof ExpressionElement;
        if (bl) {
            this.commaReduce(n);
        }
        if (this.stack.isEmpty()) {
            throw new MissingTokenException("A closing bracket ')' can't be the first character of an expression", n);
        }
        Element element = this.pop();
        if (!(element instanceof UnfinishedArgsExpression)) {
            throw new UnexpectedTokenException("Expected to see an opening bracket '(' or a comma ',' right before an expression followed by a closing bracket ')' or a comma ','", n);
        }
        UnfinishedArgsExpression unfinishedArgsExpression = (UnfinishedArgsExpression)element;
        element = this.peek();
        if (element instanceof IdToken) {
            this.pop();
            this.push(new FunctionCall(((IdToken)element).getId(), unfinishedArgsExpression.tokens));
        } else {
            if (unfinishedArgsExpression.tokens.isEmpty()) {
                throw new MissingTokenException("Encountered empty brackets that aren't a call", n);
            }
            if (unfinishedArgsExpression.tokens.size() > 1) {
                throw new UnexpectedTokenException("Encountered too many expressions in brackets that aren't a call", n);
            }
            if (!bl) {
                throw new UnexpectedTokenException("Encountered a trailing comma in brackets that aren't a call", n);
            }
            this.push((Element)unfinishedArgsExpression.tokens.getFirst());
        }
    }

    void visitBinaryOperator(BinaryOp binaryOp) {
        ExpressionElement expressionElement = this.expressionReducePop(binaryOp.priority());
        this.stack.add(new PartialBinaryExpression(expressionElement, binaryOp));
    }

    private ExpressionElement expressionReducePop() {
        return this.expressionReducePop(Integer.MAX_VALUE);
    }

    private ExpressionElement expressionReducePop(int n) {
        Element element;
        ExpressionElement expressionElement = (ExpressionElement)this.pop();
        while (!this.stack.isEmpty() && (element = this.peek()) instanceof PriorityOperatorElement && ((PriorityOperatorElement)element).getPriority() <= n) {
            this.pop();
            expressionElement = ((PriorityOperatorElement)element).resolveWith(expressionElement);
        }
        return expressionElement;
    }

    void visitOpeningParenthesis() {
        this.push(new UnfinishedArgsExpression());
    }

    void visitId(String string) {
        this.push(new IdToken(string));
    }

    ExpressionElement getFinal(int n) throws ParseException {
        if (!this.stack.isEmpty()) {
            if (this.peek() instanceof ExpressionElement) {
                ExpressionElement expressionElement = this.expressionReducePop();
                if (this.stack.isEmpty()) {
                    return expressionElement;
                }
                if (this.peek() instanceof UnfinishedArgsExpression) {
                    throw new MissingTokenException("Expected a closing bracket", n);
                }
                throw new UnexpectedTokenException("The stack of tokens isn't empty at the end of the expression: " + String.valueOf(this.stack) + " top: " + String.valueOf(expressionElement), n);
            }
            Element element = this.peek();
            if (element instanceof UnfinishedArgsExpression) {
                throw new MissingTokenException("Expected a closing bracket", n);
            }
            if (element instanceof PriorityOperatorElement) {
                throw new MissingTokenException("Expected a identifier, constant or subexpression on the right side of the operator", n);
            }
            throw new UnexpectedTokenException("The stack of tokens contains an unexpected token at the top: " + String.valueOf(this.stack), n);
        }
        throw new MissingTokenException("The input seems to be empty", n);
    }

    void visitComma(int n) throws ParseException {
        if (!(this.peek() instanceof ExpressionElement)) {
            throw new UnexpectedTokenException("Expected an expression before a comma ','", n);
        }
        this.commaReduce(n);
    }

    boolean canReadBinaryOp() {
        return this.peek() instanceof ExpressionElement;
    }

    void visitAccess(String string) {
        AccessibleExpressionElement accessibleExpressionElement = (AccessibleExpressionElement)this.pop();
        this.push(new AccessExpressionElement(accessibleExpressionElement, string));
    }

    boolean canReadAccess() {
        return this.peek() instanceof AccessibleExpressionElement;
    }

    void visitNumber(String string) {
        this.push(new NumberToken(string));
    }

    private void commaReduce(int n) throws ParseException {
        ExpressionElement expressionElement = this.expressionReducePop();
        Element element = this.peek();
        if (element == null) {
            throw new MissingTokenException("Expected an opening bracket '(' before seeing a comma ',' or closing bracket ')'", n);
        }
        if (!(element instanceof UnfinishedArgsExpression)) {
            throw new UnexpectedTokenException("Expected to see an opening bracket '(' or a comma ',' right before an expression followed by a closing bracket ')' or a comma ','", n);
        }
        ((UnfinishedArgsExpression)element).tokens.add(expressionElement);
    }

    void visitUnaryOperator(UnaryOp unaryOp) {
        this.push(new UnaryOperatorToken(unaryOp));
    }
}

