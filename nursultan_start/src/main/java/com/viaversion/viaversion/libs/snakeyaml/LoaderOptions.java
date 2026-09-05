/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.libs.snakeyaml;

import com.viaversion.viaversion.libs.snakeyaml.inspector.TagInspector;
import com.viaversion.viaversion.libs.snakeyaml.inspector.UnTrustedTagInspector;

public class LoaderOptions {
    private boolean allowDuplicateKeys = true;
    private boolean warnOnDuplicateKeys = true;
    private boolean wrappedToRootException = false;
    private int maxAliasesForCollections = 50;
    private boolean allowRecursiveKeys = false;
    private boolean processComments = false;
    private boolean enumCaseSensitive = true;
    private int nestingDepthLimit = 50;
    private int codePointLimit = 0x300000;
    private boolean mergeOnCompose = false;
    private TagInspector tagInspector = new UnTrustedTagInspector();

    public final boolean getAllowRecursiveKeys() {
        return this.allowRecursiveKeys;
    }

    public final int getNestingDepthLimit() {
        return this.nestingDepthLimit;
    }

    public final boolean isEnumCaseSensitive() {
        return this.enumCaseSensitive;
    }

    public void setEnumCaseSensitive(boolean enumCaseSensitive) {
        this.enumCaseSensitive = enumCaseSensitive;
    }

    public void setAllowRecursiveKeys(boolean allowRecursiveKeys) {
        this.allowRecursiveKeys = allowRecursiveKeys;
    }

    public void setNestingDepthLimit(int nestingDepthLimit) {
        this.nestingDepthLimit = nestingDepthLimit;
    }

    public final int getMaxAliasesForCollections() {
        return this.maxAliasesForCollections;
    }

    public void setMaxAliasesForCollections(int maxAliasesForCollections) {
        this.maxAliasesForCollections = maxAliasesForCollections;
    }

    public LoaderOptions setProcessComments(boolean processComments) {
        this.processComments = processComments;
        return this;
    }

    public final boolean isProcessComments() {
        return this.processComments;
    }

    public void setTagInspector(TagInspector tagInspector) {
        this.tagInspector = tagInspector;
    }

    public void setCodePointLimit(int codePointLimit) {
        this.codePointLimit = codePointLimit;
    }

    public TagInspector getTagInspector() {
        return this.tagInspector;
    }

    public final int getCodePointLimit() {
        return this.codePointLimit;
    }

    public void setMergeOnCompose(boolean mergeOnCompose) {
        this.mergeOnCompose = mergeOnCompose;
    }

    public boolean isMergeOnCompose() {
        return this.mergeOnCompose;
    }

    public void setAllowDuplicateKeys(boolean allowDuplicateKeys) {
        this.allowDuplicateKeys = allowDuplicateKeys;
    }

    public final boolean isAllowDuplicateKeys() {
        return this.allowDuplicateKeys;
    }

    public void setWarnOnDuplicateKeys(boolean warnOnDuplicateKeys) {
        this.warnOnDuplicateKeys = warnOnDuplicateKeys;
    }

    public final boolean isWrappedToRootException() {
        return this.wrappedToRootException;
    }

    public final boolean isWarnOnDuplicateKeys() {
        return this.warnOnDuplicateKeys;
    }

    public void setWrappedToRootException(boolean wrappedToRootException) {
        this.wrappedToRootException = wrappedToRootException;
    }
}

