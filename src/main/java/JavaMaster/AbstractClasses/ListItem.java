package JavaMaster.AbstractClasses;

public abstract class ListItem {
    //list item for the right link(next)
    // we are creaiong instances of A class within this Class, references to ourself
    // these variables hold references to objects of type listItem
    protected ListItem rightlink=null;
    protected ListItem leftlink= null;

protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);

    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
