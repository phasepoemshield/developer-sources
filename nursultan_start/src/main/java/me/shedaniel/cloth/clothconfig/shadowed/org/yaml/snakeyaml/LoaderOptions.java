/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

public class LoaderOptions {
    private boolean allowDuplicateKeys = true;
    private boolean wrappedToRootException = false;
    private int maxAliasesForCollections = 50;
    private boolean allowRecursiveKeys = false;

    public boolean getAllowRecursiveKeys() {
        return this.allowRecursiveKeys;
    }

    public void setAllowRecursiveKeys(boolean bl) {
        this.allowRecursiveKeys = bl;
    }

    public int getMaxAliasesForCollections() {
        return this.maxAliasesForCollections;
    }

    public void setMaxAliasesForCollections(int n) {
        this.maxAliasesForCollections = n;
    }

    public void setAllowDuplicateKeys(boolean bl) {
        this.allowDuplicateKeys = bl;
    }

    public boolean isAllowDuplicateKeys() {
        return this.allowDuplicateKeys;
    }

    public boolean isWrappedToRootException() {
        return this.wrappedToRootException;
    }

    public void setWrappedToRootException(boolean bl) {
        this.wrappedToRootException = bl;
    }
}

