/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.interval_tree;

import java.util.Iterator;
import java.util.Stack;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval;
import net.caffeinemc.mods.sodium.client.util.interval_tree.IntervalTree;
import net.caffeinemc.mods.sodium.client.util.interval_tree.TreeNode;
import net.caffeinemc.mods.sodium.client.util.interval_tree.TreeNode$TreeNodeIterator;

class IntervalTree$1
implements Iterator<Interval<T>> {
    final /* synthetic */ TreeNode$TreeNodeIterator val$it;
    final /* synthetic */ IntervalTree this$0;

    IntervalTree$1(IntervalTree intervalTree, TreeNode$TreeNodeIterator treeNodeIterator) {
        this.this$0 = intervalTree;
        this.val$it = treeNodeIterator;
    }

    @Override
    public void remove() {
        if (this.val$it.currentNode.increasing.size() == 1) {
            TreeNode treeNode = this.this$0.root = TreeNode.removeInterval(this.this$0, this.this$0.root, this.val$it.currentInterval);
            this.val$it.stack = new Stack();
            while (treeNode != this.val$it.subtreeRoot) {
                if (this.val$it.currentNode.midpoint.compareTo(treeNode.midpoint) < 0) {
                    this.val$it.stack.push(treeNode);
                    treeNode = treeNode.left;
                    continue;
                }
                treeNode = treeNode.right;
            }
        } else {
            this.val$it.remove();
        }
    }

    @Override
    public boolean hasNext() {
        return this.val$it.hasNext();
    }

    @Override
    public Interval<T> next() {
        return this.val$it.next();
    }
}

