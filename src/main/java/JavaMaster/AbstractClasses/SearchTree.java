package JavaMaster.AbstractClasses;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            //jei nera jokia root iraso sitas irasas tampa tree rootu
            this.root = item;
            return true;
        }
        //otherwise , start comparing from the head of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int palyginimas = currentItem.compareTo(item);
            if (palyginimas < 0) {
                //newItem is greater than null, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //nera node i desine , tai pridedam siame taske
                    currentItem.setNext(item);
                    return true;
                }
            }else if (palyginimas>0){
            //new ITEM is less neigi dabartinis i palyginima su objektu idetas narys, judam i kaire jei imanoma
                if (currentItem.previous()!=null){
                  currentItem=currentItem.previous();

                }else {
                    //theres nno node to the left , so add at this point
                    currentItem.setPrevious(item);
                    return true;

                }

            }else {
                //equals, tai nepridedame isviso
                System.out.println(item.getValue() +" toks jau egzistuoja");
                return false;
            }
            //cia mes nepasiekiame bet reikia del javos taisykliu
        }return false;
        }

        @Override
        public boolean removeItem (ListItem item){

            if (item != null) {
                System.out.println("Deleting item " + item.getValue());
            }
            ListItem currentItem = this.root;
            ListItem parentItem = currentItem;

            while (currentItem != null) {
                int comparison = (currentItem.compareTo(item));
                if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.next();
                } else if (comparison > 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.previous();
                } else {
                    // equal: we've found the item so remove it
                    performRemoval(currentItem, parentItem);
                    return true;
                }
            }
            return false;
        }
    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPrevious(current.next());
            }
        }
    }
        @Override
        public void traverse (ListItem root){
//recursive methodas
            if (root != null) {
                traverse(root.previous());
                System.out.println(root.getValue());
                traverse(root.next());
            }
        }
    }
