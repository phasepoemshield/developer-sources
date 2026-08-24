package jnr.posix;

// $VF: Compiled from Group.java
public interface Group {
   String getPassword();

   String[] getMembers();

   long getGID();

   String getName();
}
