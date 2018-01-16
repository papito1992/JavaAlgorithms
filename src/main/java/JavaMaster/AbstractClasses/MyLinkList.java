package JavaMaster.AbstractClasses;

public class MyLinkList implements NodeList {
    private ListItem root= null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            //the list was empty so this item becomes the head of the list
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                if (currentItem.next()!=null){
                    currentItem = currentItem.next();}
             else {//theres no next so insert that the end of the list is where the current item is
                currentItem.setNext(item);
                item.setPrevious(currentItem);
                return true;
            }}else if(comparison >0) {
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item);
                }else {
                    // the node with a previous is the root
                    item.setNext(this.root);
                    this.root.setPrevious(item);
                    this.root = item;}
                    return true;
            }
          else {
                //equal
                System.out.println(item.getValue() +" dat already be, not gonn do it" );
                return false;
            }

        }

    return false;}

    @Override
    public boolean removeItem(ListItem item) {
        if (item!=null){
            System.out.println(  "Deleting : " +item.getValue()
            );
        }
        ListItem currentItem= this.root;
        while (currentItem!=null){
            //darom priliginima po kurio gausim skaiciu ir pagal ji darysime If statemntus...
            int comparison=currentItem.compareTo(item);
            if (comparison == 0){
                //0 rodo kad rastas sutapimas
                if (currentItem == this.root){
                   this.root= currentItem.next();
                }else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next()!=null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;

            }else if (comparison < 0){
                currentItem=currentItem.next();
            }else {
                //comparison>0
                //item is not on the list since its greater than the one to be deleted, which has to be on it

                return false;
            }
        }
        // we have reached te end of the list, without finding the item to delete

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root==null){
            System.out.println("the list is empty since the root is NUll");
        }else {
            while (root!=null){
                System.out.println(root.getValue());
                //einame per root lista pakeistadime esama root i ateinanti woop WOOPPPPP

            root= root.next();
            }
        }

    }
}
