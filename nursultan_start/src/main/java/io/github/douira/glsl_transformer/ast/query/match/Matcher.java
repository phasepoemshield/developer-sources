/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher$AnyWildcard
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher$ClassWildcard
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher$ClassedPredicateWildcard
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher$NodeWildcard
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher$PredicateWildcard
 *  io.github.douira.glsl_transformer.ast.traversal.ASTVisitor
 *  io.github.douira.glsl_transformer.parser.ParseShape
 */
package io.github.douira.glsl_transformer.ast.query.match;

import io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode;
import io.github.douira.glsl_transformer.ast.query.match.Matcher;
import io.github.douira.glsl_transformer.ast.traversal.ASTVisitor;
import io.github.douira.glsl_transformer.parser.ParseShape;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Matcher<N extends ASTNode> {
    protected final N pattern;
    protected final String wildcardPrefix;
    private Map<String, Object> dataMatches;
    private Map<String, ASTNode> nodeMatches;
    private Map<ASTNode, NodeWildcard> nodeWildcards;
    private boolean collectMatches = false;
    protected List<Object> patternItems;
    protected int patternItemsSize;
    private int matchIndex;
    private boolean matches;
    private NodeWildcard activeListWildcard;
    private ASTVisitor<?> matchVisitor = new /* Unavailable Anonymous Inner Class!! */;

    public Matcher(String input, ParseShape<?, N> parseShape) {
        this(input, parseShape, null);
    }

    public Matcher(String input, ParseShape<?, N> parseShape, String wildcardPrefix) {
        this(parseShape._parseNodeSeparateInternal(input), wildcardPrefix);
    }

    public Matcher(N pattern) {
        this(pattern, null);
    }

    public Matcher(N pattern, String wildcardPrefix) {
        this.pattern = pattern;
        this.wildcardPrefix = wildcardPrefix;
    }

    public boolean matches(N tree) {
        if (tree == null) {
            return false;
        }
        this.preparePatternItems();
        this.matchIndex = 0;
        this.matches = true;
        this.activeListWildcard = null;
        this.matchVisitor.startVisit(tree);
        return this.matches;
    }

    public <NN extends ASTNode> void markClassedPredicateWildcard(String name, ASTNode patternNode, Class<NN> type, Predicate<NN> predicate) {
        this.markWildcard(patternNode, (NodeWildcard)new ClassedPredicateWildcard(name, type, predicate));
    }

    public Class<? extends N> getPatternClass() {
        return this.pattern.getClass();
    }

    public Map<String, ASTNode> getNodeMatches() {
        return this.nodeMatches;
    }

    public void markClassWildcard(String name, ASTNode patternNode, Class<? extends ASTNode> type) {
        this.markWildcard(patternNode, (NodeWildcard)new ClassWildcard(name, type));
    }

    public void markClassWildcard(String name, ASTNode patternNode) {
        this.ensureWildcardMap();
        this.nodeWildcards.put(patternNode, (NodeWildcard)new ClassWildcard(name, patternNode.getClass()));
    }

    private void ensureMatchMaps() {
        if (this.dataMatches == null) {
            this.dataMatches = new HashMap<String, Object>();
        }
        if (this.nodeMatches == null) {
            this.nodeMatches = new HashMap<String, ASTNode>();
        }
    }

    public boolean matchesExtract(N tree, Map<String, Object> dataMatches, Map<String, ASTNode> nodeMatches) {
        this.dataMatches = dataMatches;
        this.nodeMatches = nodeMatches;
        boolean succeeded = this.matchesExtract(tree);
        this.dataMatches = null;
        this.nodeMatches = null;
        return succeeded;
    }

    public boolean matchesExtract(N tree) {
        this.ensureMatchMaps();
        this.dataMatches.clear();
        this.nodeMatches.clear();
        this.collectMatches = true;
        boolean succeeded = this.matches(tree);
        this.collectMatches = false;
        if (!succeeded) {
            this.dataMatches.clear();
            this.nodeMatches.clear();
        }
        return succeeded;
    }

    private void ensureWildcardMap() {
        if (this.nodeWildcards == null) {
            this.nodeWildcards = new HashMap<ASTNode, NodeWildcard>();
        }
    }

    private void markWildcard(ASTNode node, NodeWildcard wildcard) {
        this.ensureWildcardMap();
        this.nodeWildcards.put(node, wildcard);
    }

    public Object getDataMatch(String name) {
        return this.dataMatches.get(name);
    }

    public Map<String, Object> getDataMatches() {
        return this.dataMatches;
    }

    public String getStringDataMatch(String name) {
        String str;
        Object result = this.dataMatches.get(name);
        return result instanceof String ? (str = (String)result) : null;
    }

    public <NN extends ASTNode> NN getNodeMatch(String name, Class<NN> type) {
        ASTNode result = this.nodeMatches.get(name);
        return (NN)(type.isInstance(result) ? (ASTNode)type.cast(result) : null);
    }

    public ASTNode getNodeMatch(String name) {
        return this.nodeMatches.get(name);
    }

    public void markAnyWildcard(String name, ASTNode patternNode) {
        this.markWildcard(patternNode, (NodeWildcard)new AnyWildcard(name));
    }

    public void preparePatternItems() {
        if (this.patternItems != null) {
            return;
        }
        this.patternItems = new ArrayList<Object>();
        new /* Unavailable Anonymous Inner Class!! */.startVisit(this.pattern);
        this.patternItemsSize = this.patternItems.size();
    }

    public void markPredicatedWildcard(String name, ASTNode patternNode, Predicate<ASTNode> matchPredicate) {
        this.markWildcard(patternNode, (NodeWildcard)new PredicateWildcard(name, matchPredicate));
    }
}

