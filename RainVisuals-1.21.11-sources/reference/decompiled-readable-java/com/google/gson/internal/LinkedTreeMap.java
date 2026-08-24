/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class LinkedTreeMap<K, V>
extends AbstractMap<K, V>
implements Serializable {
    private final Comparator<? super K> comparator;
    private final boolean allowNullValues;
    int size = 0;
    int modCount = 0;
    final Node<K, V> header;
    private EntrySet entrySet;
    private KeySet keySet;
    private static final Comparator<Comparable> NATURAL_ORDER = new Comparator<Comparable>(){

        @Override
        public int compare(Comparable a2, Comparable b2) {
            return a2.compareTo(b2);
        }
    };
    Node<K, V> root;

    /*
     * WARNING - void declaration
     */
    Node<K, V> find(K key, boolean create) {
        void var7_7;
        Node<K, V> created;
        Comparator<K> comparator = this.comparator;
        Node<K, V> nearest = this.root;
        int comparison = 0;
        if (nearest != null) {
            Comparable comparableKey = comparator == NATURAL_ORDER ? (Comparable)key : null;
            while (true) {
                Node child;
                int n = comparison = comparableKey != null ? comparableKey.compareTo(nearest.key) : comparator.compare(key, nearest.key);
                if (comparison == 0) {
                    return nearest;
                }
                Node node = child = comparison < 0 ? nearest.left : nearest.right;
                if (child == null) break;
                nearest = child;
            }
        }
        if (!create) {
            return null;
        }
        Node<K, V> header = this.header;
        if (nearest == null) {
            if (comparator == NATURAL_ORDER && !(key instanceof Comparable)) {
                throw new ClassCastException(key.getClass().getName() + " is not Comparable");
            }
            created = new Node<K, V>(this.allowNullValues, nearest, key, header, header.prev);
            this.root = created;
        } else {
            created = new Node<K, V>(this.allowNullValues, nearest, key, header, header.prev);
            if (comparison < 0) {
                nearest.left = created;
            } else {
                nearest.right = created;
            }
            this.rebalance(nearest, true);
        }
        ++this.size;
        ++this.modCount;
        return var7_7;
    }

    /*
     * WARNING - void declaration
     */
    void removeInternal(Node<K, V> node, boolean unlink) {
        if (unlink) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        Node left = node.left;
        Node right = node.right;
        Node originalParent = node.parent;
        if (left != null && right != null) {
            void var6_6;
            Node adjacent = left.height > right.height ? left.last() : right.first();
            this.removeInternal(adjacent, false);
            int leftHeight = 0;
            left = node.left;
            if (left != null) {
                leftHeight = left.height;
                adjacent.left = left;
                left.parent = adjacent;
                node.left = null;
            }
            int rightHeight = 0;
            right = node.right;
            if (right != null) {
                rightHeight = right.height;
                adjacent.right = right;
                right.parent = adjacent;
                node.right = null;
            }
            adjacent.height = Math.max(leftHeight, rightHeight) + 1;
            this.replaceInParent(node, (Node<K, V>)var6_6);
            return;
        }
        if (left != null) {
            this.replaceInParent(node, left);
            node.left = null;
        } else if (right != null) {
            this.replaceInParent(node, right);
            node.right = null;
        } else {
            this.replaceInParent(node, null);
        }
        this.rebalance(originalParent, false);
        --this.size;
        ++this.modCount;
    }

    private void rotateLeft(Node<K, V> root) {
        Node left = root.left;
        Node pivot = root.right;
        Node pivotLeft = pivot.left;
        Node pivotRight = pivot.right;
        root.right = pivotLeft;
        if (pivotLeft != null) {
            pivotLeft.parent = root;
        }
        this.replaceInParent(root, pivot);
        pivot.left = root;
        root.parent = pivot;
        root.height = Math.max(left != null ? left.height : 0, pivotLeft != null ? pivotLeft.height : 0) + 1;
        pivot.height = Math.max(root.height, pivotRight != null ? pivotRight.height : 0) + 1;
    }

    /*
     * WARNING - void declaration
     */
    Node<K, V> removeInternalByKey(Object key) {
        void var2_2;
        Node<K, V> node = this.findByObject(key);
        if (node != null) {
            this.removeInternal(node, true);
        }
        return var2_2;
    }

    @Override
    public boolean containsKey(Object key) {
        return this.findByObject(key) != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public V put(K key, V value) {
        void var4_4;
        if (key == null) {
            throw new NullPointerException("key == null");
        }
        if (value == null && !this.allowNullValues) {
            throw new NullPointerException("value == null");
        }
        Node<K, V> created = this.find(key, true);
        Object result = created.value;
        created.value = value;
        return var4_4;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override
    public V get(Object key) {
        Node<K, V> node = this.findByObject(key);
        return node != null ? (V)node.value : null;
    }

    @Override
    public V remove(Object key) {
        Node<K, V> node = this.removeInternalByKey(key);
        return node != null ? (V)node.value : null;
    }

    /*
     * WARNING - void declaration
     */
    private void replaceInParent(Node<K, V> node, Node<K, V> replacement) {
        Node parent = node.parent;
        node.parent = null;
        if (replacement != null) {
            replacement.parent = parent;
        }
        if (parent != null) {
            if (parent.left == node) {
                parent.left = replacement;
            } else {
                assert (parent.right == node);
                parent.right = replacement;
            }
        } else {
            void var2_2;
            this.root = var2_2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    Node<K, V> findByEntry(Map.Entry<?, ?> entry) {
        void var2_2;
        Node<K, V> mine = this.findByObject(entry.getKey());
        if (mine == null) return null;
        if (!this.equal(mine.value, entry.getValue())) return null;
        boolean bl = true;
        boolean valuesEqual = bl;
        if (!valuesEqual) return null;
        Node<K, V> node = var2_2;
        return node;
    }

    @Override
    public int size() {
        return this.size;
    }

    public LinkedTreeMap(boolean allowNullValues) {
        this(NATURAL_ORDER, allowNullValues);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    /*
     * Unable to fully structure code
     */
    private void rebalance(Node<K, V> unbalanced, boolean insert) {
        node = unbalanced;
        while (node != null) {
            block18: {
                block19: {
                    block17: {
                        left = node.left;
                        right = node.right;
                        leftHeight = left != null ? left.height : 0;
                        rightHeight = right != null ? right.height : 0;
                        delta = leftHeight - rightHeight;
                        if (delta != -2) break block17;
                        rightLeft = right.left;
                        rightRight = right.right;
                        rightRightHeight = rightRight != null ? rightRight.height : 0;
                        rightLeftHeight = rightLeft != null ? rightLeft.height : 0;
                        rightDelta = rightLeftHeight - rightRightHeight;
                        if (rightDelta == -1) ** GOTO lbl23
                        if (rightDelta != 0) ** GOTO lbl-1000
                        if (!insert) {
lbl23:
                            // 2 sources

                            this.rotateLeft(node);
                        } else lbl-1000:
                        // 2 sources

                        {
                            if (!LinkedTreeMap.$assertionsDisabled) {
                                if (rightDelta != 1) {
                                    throw new AssertionError();
                                }
                            }
                            this.rotateRight(right);
                            this.rotateLeft(node);
                        }
                        if (insert) {
                            break;
                        }
                        break block18;
                    }
                    if (delta != 2) break block19;
                    leftLeft = left.left;
                    leftRight = left.right;
                    leftRightHeight = leftRight != null ? leftRight.height : 0;
                    leftLeftHeight = leftLeft != null ? leftLeft.height : 0;
                    leftDelta = leftLeftHeight - leftRightHeight;
                    if (leftDelta == 1) ** GOTO lbl49
                    if (leftDelta != 0) ** GOTO lbl-1000
                    if (!insert) {
lbl49:
                        // 2 sources

                        this.rotateRight(node);
                    } else lbl-1000:
                    // 2 sources

                    {
                        if (!LinkedTreeMap.$assertionsDisabled) {
                            if (leftDelta != -1) {
                                throw new AssertionError();
                            }
                        }
                        this.rotateLeft(left);
                        this.rotateRight(node);
                    }
                    if (insert) {
                        break;
                    }
                    break block18;
                }
                if (delta == 0) {
                    node.height = leftHeight + 1;
                    if (insert) {
                        break;
                    }
                } else {
                    if (!LinkedTreeMap.$assertionsDisabled) {
                        if (delta != -1) {
                            if (delta != 1) {
                                throw new AssertionError();
                            }
                        }
                    }
                    var3_3.height = Math.max((int)var6_6, (int)var7_7) + 1;
                    if (var2_2 == false) break;
                }
            }
            var3_3 = var3_3.parent;
        }
    }

    public LinkedTreeMap() {
        this(NATURAL_ORDER, true);
    }

    @Override
    public void clear() {
        this.root = null;
        this.size = 0;
        ++this.modCount;
        Node<K, V> header = this.header;
        header.prev = header;
        header.next = header.prev;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        EntrySet result = this.entrySet;
        return result != null ? result : (this.entrySet = new EntrySet());
    }

    public LinkedTreeMap(Comparator<? super K> comparator, boolean allowNullValues) {
        this.comparator = comparator != null ? comparator : NATURAL_ORDER;
        this.allowNullValues = allowNullValues;
        this.header = new Node(allowNullValues);
    }

    private void rotateRight(Node<K, V> root) {
        Node pivot = root.left;
        Node right = root.right;
        Node pivotLeft = pivot.left;
        Node pivotRight = pivot.right;
        root.left = pivotRight;
        if (pivotRight != null) {
            pivotRight.parent = root;
        }
        this.replaceInParent(root, pivot);
        pivot.right = root;
        root.parent = pivot;
        root.height = Math.max(right != null ? right.height : 0, pivotRight != null ? pivotRight.height : 0) + 1;
        pivot.height = Math.max(root.height, pivotLeft != null ? pivotLeft.height : 0) + 1;
    }

    Node<K, V> findByObject(Object key) {
        try {
            return key != null ? this.find(key, false) : null;
        }
        catch (ClassCastException classCastException) {
            return null;
        }
    }

    private boolean equal(Object a2, Object b2) {
        return Objects.equals(a2, b2);
    }

    @Override
    public Set<K> keySet() {
        KeySet result = this.keySet;
        return result != null ? result : (this.keySet = new KeySet());
    }

    private abstract class LinkedTreeMapIterator<T>
    implements Iterator<T> {
        Node<K, V> next;
        int expectedModCount;
        Node<K, V> lastReturned;

        @Override
        public final void remove() {
            if (this.lastReturned == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.removeInternal(this.lastReturned, true);
            this.lastReturned = null;
            this.expectedModCount = LinkedTreeMap.this.modCount;
        }

        final Node<K, V> nextNode() {
            Node e = this.next;
            if (e == LinkedTreeMap.this.header) {
                throw new NoSuchElementException();
            }
            if (LinkedTreeMap.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
            this.next = e.next;
            this.lastReturned = e;
            return this.lastReturned;
        }

        LinkedTreeMapIterator() {
            this.next = LinkedTreeMap.this.header.next;
            this.lastReturned = null;
            this.expectedModCount = LinkedTreeMap.this.modCount;
        }

        @Override
        public final boolean hasNext() {
            return this.next != LinkedTreeMap.this.header;
        }
    }

    final class KeySet
    extends AbstractSet<K> {
        @Override
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        KeySet() {
        }

        @Override
        public boolean contains(Object o) {
            return LinkedTreeMap.this.containsKey(o);
        }

        @Override
        public int size() {
            return LinkedTreeMap.this.size;
        }

        @Override
        public Iterator<K> iterator() {
            return new LinkedTreeMapIterator<K>(){

                @Override
                public K next() {
                    return this.nextNode().key;
                }
            };
        }

        @Override
        public boolean remove(Object key) {
            return LinkedTreeMap.this.removeInternalByKey(key) != null;
        }
    }

    static final class Node<K, V>
    implements Map.Entry<K, V> {
        Node<K, V> parent;
        Node<K, V> next;
        final K key;
        Node<K, V> left;
        int height;
        final boolean allowNullValue;
        Node<K, V> right;
        V value;
        Node<K, V> prev;

        @Override
        public K getKey() {
            return this.key;
        }

        Node(boolean allowNullValue) {
            this.key = null;
            this.allowNullValue = allowNullValue;
            this.next = this.prev = this;
        }

        /*
         * WARNING - void declaration
         */
        public Node<K, V> first() {
            void var1_1;
            Node<K, V> node = this;
            Node<K, V> child = node.left;
            while (child != null) {
                node = child;
                child = node.left;
            }
            return var1_1;
        }

        /*
         * WARNING - void declaration
         */
        public Node<K, V> last() {
            void var1_1;
            Node<K, V> node = this;
            Node<K, V> child = node.right;
            while (child != null) {
                node = child;
                child = node.right;
            }
            return var1_1;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Map.Entry)) return false;
            Map.Entry other = (Map.Entry)o;
            if (this.key == null) {
                if (other.getKey() != null) return false;
            } else if (!this.key.equals(other.getKey())) return false;
            if (this.value == null) {
                if (other.getValue() != null) return false;
                return true;
            } else if (!this.value.equals(other.getValue())) return false;
            return true;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return (this.key == null ? 0 : this.key.hashCode()) ^ (this.value == null ? 0 : this.value.hashCode());
        }

        Node(boolean allowNullValue, Node<K, V> parent, K key, Node<K, V> next, Node<K, V> prev) {
            this.parent = parent;
            this.key = key;
            this.allowNullValue = allowNullValue;
            this.height = 1;
            this.next = next;
            this.prev = prev;
            prev.next = this;
            next.prev = this;
        }

        public String toString() {
            return this.key + "=" + this.value;
        }

        @Override
        public V setValue(V value) {
            if (value == null && !this.allowNullValue) {
                throw new NullPointerException("value == null");
            }
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }

    class EntrySet
    extends AbstractSet<Map.Entry<K, V>> {
        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new LinkedTreeMapIterator<Map.Entry<K, V>>(){

                @Override
                public Map.Entry<K, V> next() {
                    return this.nextNode();
                }
            };
        }

        EntrySet() {
        }

        @Override
        public boolean remove(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Node node = LinkedTreeMap.this.findByEntry((Map.Entry)o);
            if (node == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(node, true);
            return true;
        }

        @Override
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override
        public int size() {
            return LinkedTreeMap.this.size;
        }

        @Override
        public boolean contains(Object o) {
            return o instanceof Map.Entry && LinkedTreeMap.this.findByEntry((Map.Entry)o) != null;
        }
    }
}

