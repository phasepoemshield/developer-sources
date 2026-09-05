/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.interval_tree;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval;
import net.caffeinemc.mods.sodium.client.util.interval_tree.TreeNode;

class TreeNode$TreeNodeIterator
implements Iterator<Interval<T>> {
    Stack<TreeNode<T>> stack = new Stack();
    TreeNode<T> subtreeRoot = this.this$0;
    TreeNode<T> currentNode;
    Interval<T> currentInterval;
    Iterator<Interval<T>> iterator = Collections.emptyIterator();
    final /* synthetic */ TreeNode this$0;

    TreeNode$TreeNodeIterator(TreeNode treeNode) {
        this.this$0 = treeNode;
    }

    @Override
    public void remove() {
        this.iterator.remove();
    }

    @Override
    public boolean hasNext() {
        return this.subtreeRoot != null || !this.stack.isEmpty() || this.iterator.hasNext();
    }

    @Override
    public Interval<T> next() {
        if (!this.iterator.hasNext()) {
            while (this.subtreeRoot != null) {
                this.stack.push(this.subtreeRoot);
                this.subtreeRoot = this.subtreeRoot.left;
            }
            if (this.stack.isEmpty()) {
                throw new NoSuchElementException();
            }
            this.currentNode = this.stack.pop();
            this.iterator = this.currentNode.increasing.iterator();
            this.subtreeRoot = this.currentNode.right;
        }
        this.currentInterval = this.iterator.next();
        return this.currentInterval;
    }
}

