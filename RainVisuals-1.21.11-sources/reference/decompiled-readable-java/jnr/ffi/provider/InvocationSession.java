/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider;

import java.util.ArrayList;

public class InvocationSession {
    private ArrayList<Object> liveObjects;
    private ArrayList<PostInvoke> list;

    public void keepAlive(Object obj) {
        if (this.liveObjects == null) {
            this.liveObjects = new ArrayList();
        }
        this.liveObjects.add(obj);
    }

    public void finish() {
        if (this.list != null) {
            for (PostInvoke p : this.list) {
                try {
                    p.postInvoke();
                }
                catch (Throwable throwable) {}
            }
        }
    }

    public void addPostInvoke(PostInvoke postInvoke) {
        if (this.list == null) {
            this.list = new ArrayList();
        }
        this.list.add(postInvoke);
    }

    public static interface PostInvoke {
        public void postInvoke();
    }
}

