/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.interval_tree;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.caffeinemc.mods.sodium.client.util.interval_tree.Interval;
import net.caffeinemc.mods.sodium.client.util.interval_tree.IntervalTree$1;
import net.caffeinemc.mods.sodium.client.util.interval_tree.TreeNode;
import net.caffeinemc.mods.sodium.client.util.interval_tree.TreeNode$TreeNodeIterator;

public class IntervalTree<T extends Comparable<? super T>>
extends AbstractSet<Interval<T>> {
    TreeNode<T> root;
    int size;

    public boolean remove(Interval<T> interval) {
        if (interval.isEmpty() || this.root == null) {
            return false;
        }
        int n = this.size;
        this.root = TreeNode.removeInterval(this, this.root, interval);
        return this.size == n;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.root = null;
    }

    @Override
    public boolean add(Interval<T> interval) {
        if (interval.isEmpty()) {
            return false;
        }
        int n = this.size;
        this.root = TreeNode.addInterval(this, this.root, interval);
        return this.size == n;
    }

    @Override
    public Iterator<Interval<T>> iterator() {
        if (this.root == null) {
            return Collections.emptyIterator();
        }
        TreeNode$TreeNodeIterator treeNode$TreeNodeIterator = this.root.iterator();
        return new IntervalTree$1(this, treeNode$TreeNodeIterator);
    }

    @Override
    public boolean contains(Object object) {
        if (this.root == null || object == null) {
            return false;
        }
        if (!(object instanceof Interval)) {
            return false;
        }
        Interval interval = (Interval)object;
        TreeNode<T> treeNode = this.root;
        while (treeNode != null) {
            if (interval.contains(treeNode.midpoint)) {
                return treeNode.increasing.contains(interval);
            }
            if (interval.isLeftOf(treeNode.midpoint)) {
                treeNode = treeNode.left;
                continue;
            }
            treeNode = treeNode.right;
        }
        return false;
    }

    public Set<Interval<T>> query(Interval<T> interval) {
        HashSet<Interval<T>> hashSet = new HashSet<Interval<T>>();
        if (this.root == null || interval.isEmpty()) {
            return hashSet;
        }
        TreeNode<T> treeNode = this.root;
        while (treeNode != null) {
            if (interval.contains(treeNode.midpoint)) {
                hashSet.addAll(treeNode.increasing);
                TreeNode.rangeQueryLeft(treeNode.left, interval, hashSet);
                TreeNode.rangeQueryRight(treeNode.right, interval, hashSet);
                break;
            }
            if (interval.isLeftOf(treeNode.midpoint)) {
                for (Interval interval2 : treeNode.increasing) {
                    if (!interval.intersects(interval2)) break;
                    hashSet.add(interval2);
                }
                treeNode = treeNode.left;
                continue;
            }
            for (Interval interval2 : treeNode.decreasing) {
                if (!interval.intersects(interval2)) break;
                hashSet.add(interval2);
            }
            treeNode = treeNode.right;
        }
        return hashSet;
    }
}

