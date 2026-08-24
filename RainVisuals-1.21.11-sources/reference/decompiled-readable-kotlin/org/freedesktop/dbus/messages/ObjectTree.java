package org.freedesktop.dbus.messages;

import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from ObjectTree.java
public class ObjectTree {
   public static final Pattern SLASH_PATTERN = Pattern.compile("/");
   private ObjectTree.TreeNode root;
   private final Logger logger = LoggerFactory.getLogger(this.getClass());

   public String Introspect(String _path) {
      ObjectTree.TreeNode t = this.recursiveFind(this.root, _path);
      if (null == t) {
         return null;
      }

      StringBuilder sb = new StringBuilder();
      sb.append("<node name=\"");
      sb.append(_path);
      sb.append("\">\n");
      if (null != t.data) {
         sb.append(t.data);
      }

      for (ObjectTree.TreeNode var4 = t.down; null != var4; var4 = var4.right) {
         sb.append("<node name=\"");
         sb.append(var4.name);
         sb.append("\"/>\n");
      }

      sb.append("</node>");
      return sb.toString();
   }

   @Override
   public String toString() {
      return this.recursivePrint(this.root);
   }

   private String recursivePrint(ObjectTree.TreeNode _current) {
      String s = "";
      if (null != _current) {
         s = s + _current.name;
         if (null != _current.object) {
            s = s + "*";
         }

         if (null != _current.down) {
            s = s + "/{" + this.recursivePrint(_current.down) + "}";
         }

         if (null != _current.right) {
            s = s + ", " + this.recursivePrint(_current.right);
         }
      }

      return s;
   }

   private ObjectTree.TreeNode recursiveFind(ObjectTree.TreeNode _path, String _current) {
      if ("/".equals(_path)) {
         return _current;
      }

      String[] elements = _path.split("/", 2);
      if (_path.startsWith(_current.name)) {
         if (_path.equals(_current.name)) {
            return _current;
         } else {
            return _current.down == null ? null : this.recursiveFind(_current.down, elements[1]);
         }
      } else if (_current.right == null) {
         return null;
      } else {
         return 0 > _current.right.name.compareTo(elements[0]) ? null : this.recursiveFind(_current.right, _path);
      }
   }

   private ObjectTree.TreeNode recursiveRemove(ObjectTree.TreeNode _path, String _current) {
      String[] elements = _path.split("/", 2);
      if (elements[0].equals(_current.name)) {
         if (1 != elements.length && !"".equals(elements[1])) {
            if (_current.down != null) {
               _current.down = this.recursiveRemove(_current.down, elements[1]);
               if (_current.down == null && _current.data == null) {
                  return _current.right;
               }
            }

            return _current;
         } else {
            _current.object = null;
            _current.data = null;
            return _current.down != null ? _current : _current.right;
         }
      } else {
         if (_current.right == null) {
            return _current;
         }

         if (0 > _current.right.name.compareTo(elements[0])) {
            return _current;
         }

         _current.right = this.recursiveRemove(_current.right, _path);
         return _current;
      }
   }

   public synchronized void add(String _path, ExportedObject _data, String _object) {
      this.logger.debug("Adding {} to object tree", _path);
      this.root = this.recursiveAdd(this.root, _path, _object, _data);
   }

   public synchronized void remove(String _path) {
      this.logger.debug("Removing {} from object tree", _path);
      this.recursiveRemove(this.root, _path);
   }

   public ObjectTree() {
      this.root = new ObjectTree.TreeNode("");
   }

   private ObjectTree.TreeNode recursiveAdd(ObjectTree.TreeNode _path, String _current, ExportedObject _object, String _data) {
      String[] elements = SLASH_PATTERN.split(_path, 2);
      if (_path.startsWith(_current.name)) {
         if (1 != elements.length && !"".equals(elements[1])) {
            if (_current.down == null) {
               String[] t = elements[1].split("/", 2);
               _current.down = new ObjectTree.TreeNode(t[0]);
            }

            _current.down = this.recursiveAdd(_current.down, elements[1], _object, _data);
         } else {
            _current.object = _object;
            _current.data = _data;
         }
      } else if (_current.right == null) {
         _current.right = new ObjectTree.TreeNode(elements[0]);
         _current.right = this.recursiveAdd(_current.right, _path, _object, _data);
      } else if (0 > _current.right.name.compareTo(elements[0])) {
         ObjectTree.TreeNode var7 = new ObjectTree.TreeNode(elements[0]);
         var7.right = _current.right;
         _current.right = var7;
         _current.right = this.recursiveAdd(_current.right, _path, _object, _data);
      } else {
         _current.right = this.recursiveAdd(_current.right, _path, _object, _data);
      }

      return _current;
   }

   // $VF: Compiled from ObjectTree.java
   static class TreeNode {
      ObjectTree.TreeNode right;
      String name;
      String data;
      ObjectTree.TreeNode down;
      ExportedObject object;

      TreeNode(String _name) {
         this.name = _name;
      }

      TreeNode(String _data, ExportedObject _name, String _object) {
         this.name = _name;
         this.object = _object;
         this.data = _data;
      }
   }
}
