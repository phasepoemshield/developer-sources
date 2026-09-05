/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.interval_tree;

import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval;
import net.caffeinemc.mods.sodium.client.util.interval_tree.IntervalTree;
import net.caffeinemc.mods.sodium.client.util.interval_tree.TreeNode$TreeNodeIterator;

public class TreeNode<T extends Comparable<? super T>>
implements Iterable<Interval<T>> {
    protected final NavigableSet<Interval<T>> increasing;
    protected final NavigableSet<Interval<T>> decreasing = new TreeSet<Interval>(Interval.sweepRightToLeft);
    protected TreeNode<T> left;
    protected TreeNode<T> right;
    protected final T midpoint;
    protected int height;

    public TreeNode(Interval<T> interval) {
        this.increasing = new TreeSet<Interval>(Interval.sweepLeftToRight);
        this.decreasing.add(interval);
        this.increasing.add(interval);
        this.midpoint = interval.getMidpoint();
        this.height = 1;
    }

    public TreeNode$TreeNodeIterator iterator() {
        return new TreeNode$TreeNodeIterator(this);
    }

    private static int height(TreeNode treeNode) {
        return treeNode == null ? 0 : treeNode.height();
    }

    public int height() {
        return this.height;
    }

    private TreeNode<T> assimilateOverlappingIntervals(TreeNode<T> treeNode) {
        ArrayList<Interval> arrayList = new ArrayList<Interval>();
        if (this.midpoint.compareTo(treeNode.midpoint) < 0) {
            for (Interval<T> interval : treeNode.increasing) {
                if (interval.isRightOf(this.midpoint)) break;
                arrayList.add(interval);
            }
        } else {
            for (Interval<T> interval : treeNode.decreasing) {
                if (interval.isLeftOf(this.midpoint)) break;
                arrayList.add(interval);
            }
        }
        arrayList.forEach(treeNode.increasing::remove);
        arrayList.forEach(treeNode.decreasing::remove);
        this.increasing.addAll(arrayList);
        this.decreasing.addAll(arrayList);
        if (treeNode.increasing.isEmpty()) {
            return TreeNode.deleteNode(treeNode);
        }
        return treeNode;
    }

    public static <T extends Comparable<? super T>> TreeNode<T> removeInterval(IntervalTree<T> intervalTree, TreeNode<T> treeNode, Interval<T> interval) {
        if (treeNode == null) {
            return null;
        }
        if (interval.contains(treeNode.midpoint)) {
            if (treeNode.decreasing.remove(interval)) {
                --intervalTree.size;
            }
            treeNode.increasing.remove(interval);
            if (treeNode.increasing.isEmpty()) {
                return TreeNode.deleteNode(treeNode);
            }
        } else if (interval.isLeftOf(treeNode.midpoint)) {
            treeNode.left = TreeNode.removeInterval(intervalTree, treeNode.left, interval);
        } else {
            treeNode.right = TreeNode.removeInterval(intervalTree, treeNode.right, interval);
        }
        return treeNode.balanceOut();
    }

    public static <T extends Comparable<? super T>> TreeNode<T> addInterval(IntervalTree<T> intervalTree, TreeNode<T> treeNode, Interval<T> interval) {
        if (treeNode == null) {
            ++intervalTree.size;
            return new TreeNode<T>(interval);
        }
        if (interval.contains(treeNode.midpoint)) {
            if (treeNode.decreasing.add(interval)) {
                ++intervalTree.size;
            }
            treeNode.increasing.add(interval);
            return treeNode;
        }
        if (interval.isLeftOf(treeNode.midpoint)) {
            treeNode.left = TreeNode.addInterval(intervalTree, treeNode.left, interval);
            treeNode.height = Math.max(TreeNode.height(treeNode.left), TreeNode.height(treeNode.right)) + 1;
        } else {
            treeNode.right = TreeNode.addInterval(intervalTree, treeNode.right, interval);
            treeNode.height = Math.max(TreeNode.height(treeNode.left), TreeNode.height(treeNode.right)) + 1;
        }
        return treeNode.balanceOut();
    }

    static <T extends Comparable<? super T>> void rangeQueryRight(TreeNode<T> treeNode, Interval<T> interval, Set<Interval<T>> set) {
        while (treeNode != null) {
            if (interval.contains(treeNode.midpoint)) {
                set.addAll(treeNode.increasing);
                if (treeNode.left != null) {
                    for (Interval interval2 : treeNode.left) {
                        set.add(interval2);
                    }
                }
                treeNode = treeNode.right;
                continue;
            }
            for (Interval<T> interval3 : treeNode.increasing) {
                if (interval3.isRightOf(interval)) break;
                set.add(interval3);
            }
            treeNode = treeNode.left;
        }
    }

    static <T extends Comparable<? super T>> void rangeQueryLeft(TreeNode<T> treeNode, Interval<T> interval, Set<Interval<T>> set) {
        while (treeNode != null) {
            if (interval.contains(treeNode.midpoint)) {
                set.addAll(treeNode.increasing);
                if (treeNode.right != null) {
                    for (Interval interval2 : treeNode.right) {
                        set.add(interval2);
                    }
                }
                treeNode = treeNode.left;
                continue;
            }
            for (Interval<T> interval3 : treeNode.decreasing) {
                if (interval3.isLeftOf(interval)) break;
                set.add(interval3);
            }
            treeNode = treeNode.right;
        }
    }

    private TreeNode<T> rightRotate() {
        TreeNode<T> treeNode = this.left;
        this.left = treeNode.right;
        treeNode.right = this;
        this.height = Math.max(TreeNode.height(this.right), TreeNode.height(this.left)) + 1;
        treeNode.right = treeNode.assimilateOverlappingIntervals(this);
        return treeNode;
    }

    private TreeNode<T> leftRotate() {
        TreeNode<T> treeNode = this.right;
        this.right = treeNode.left;
        treeNode.left = this;
        this.height = Math.max(TreeNode.height(this.right), TreeNode.height(this.left)) + 1;
        treeNode.left = treeNode.assimilateOverlappingIntervals(this);
        return treeNode;
    }

    private TreeNode<T> balanceOut() {
        int n = TreeNode.height(this.left) - TreeNode.height(this.right);
        if (n < -1) {
            if (TreeNode.height(this.right.left) > TreeNode.height(this.right.right)) {
                this.right = this.right.rightRotate();
                return this.leftRotate();
            }
            return this.leftRotate();
        }
        if (n > 1) {
            if (TreeNode.height(this.left.right) > TreeNode.height(this.left.left)) {
                this.left = this.left.leftRotate();
                return this.rightRotate();
            }
            return this.rightRotate();
        }
        return this;
    }

    private static <T extends Comparable<? super T>> TreeNode<T> deleteNode(TreeNode<T> treeNode) {
        if (treeNode.left == null && treeNode.right == null) {
            return null;
        }
        if (treeNode.left == null) {
            return treeNode.right;
        }
        TreeNode treeNode2 = treeNode.left;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (treeNode2.right != null) {
            stack.push(treeNode2);
            treeNode2 = treeNode2.right;
        }
        if (!stack.isEmpty()) {
            ((TreeNode)stack.peek()).right = treeNode2.left;
            treeNode2.left = treeNode.left;
        }
        treeNode2.right = treeNode.right;
        TreeNode treeNode3 = treeNode2;
        while (!stack.isEmpty()) {
            treeNode2 = (TreeNode)stack.pop();
            if (!stack.isEmpty()) {
                ((TreeNode)stack.peek()).right = treeNode3.assimilateOverlappingIntervals(treeNode2);
                continue;
            }
            treeNode3.left = treeNode3.assimilateOverlappingIntervals(treeNode2);
        }
        return treeNode3.balanceOut();
    }
}

