package jnr.ffi.provider;

import java.util.ArrayList;

// $VF: Compiled from InvocationSession.java
public class InvocationSession {
   private ArrayList<Object> liveObjects;
   private ArrayList<InvocationSession.PostInvoke> list;

   public void keepAlive(Object obj) {
      if (this.liveObjects == null) {
         this.liveObjects = new ArrayList<>();
      }

      this.liveObjects.add(obj);
   }

   public void finish() {
      if (this.list != null) {
         for (InvocationSession.PostInvoke p : this.list) {
            try {
               p.postInvoke();
            } catch (Throwable var4) {
            }
         }
      }
   }

   public void addPostInvoke(InvocationSession.PostInvoke postInvoke) {
      if (this.list == null) {
         this.list = new ArrayList<>();
      }

      this.list.add(postInvoke);
   }

   // $VF: Compiled from InvocationSession.java
   public interface PostInvoke {
      void postInvoke();
   }
}
