package Struktury;


public class MList {
    Element _head;
    Element _tail;
    int counter;

    public void getThroughListForward(MList list){
        Element p = list._head;
        while(p.next != null){
            // wykonujemy jakąś logike
            p = p.next;
        }
    }

    public void getThroughListBack(MList list){
        Element p = list._tail;
        while(p.prev != null){
            // wykonujemy jakąś logike
            p = p.prev;
        }
    }

    public void addElementAtBeginning(int newElement, MList list){
        Element p = new Element();
        p.data = newElement;
        p.prev = null;
        p.next = list._head;
        list._head = p;
        list.counter++;

        if (p.next != null){
            Element nextEl = p.next;
            nextEl.prev = p;
        } else {
            list._tail = p;
        }
    }

    public void addElementAtEnd(int newElement, MList list){
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = list._tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null){
            Element nextEl = p.prev;
            nextEl.next = p;
        } else {
            list._head = p;
        }
    }
    public Element getElementForward(int data, MList list){
        Element p = list._head;
        while(p.next != null){
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public Element getElementBack(int data, MList list){
        Element p = list._tail;
        while(p.prev != null){
            if (p.data == data) {
                break;
            }
            p = p.prev;
        }
        return p;
    }

    public void printAllElements(MList list){
        Element p = list._head;
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }

    public void addElementBeforeElement(int elementToAdd, int elementBefore, MList list){
        Element before = list.getElementForward(elementBefore, list);

        if (before == list._head){
            list.addElementAtBeginning(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev;
            p.next = before;
            Element prevBefore = before.prev;
            prevBefore.next = p;

            before.prev = p;
            list.counter++;
        }
    }

    public void addElementAfterElement(int elementToAdd, int elementAfter, MList list){
        Element after = list.getElementBack(elementAfter, list);

        if (after == list._tail){
            list.addElementAtEnd(elementToAdd, list);
        } else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = after;
            p.next = after.next;
            Element nextAfter = after.next;
            nextAfter.prev = p;

            after.next = p;
            list.counter++;
        }
    }

    public void removeElement(int elementToRemove, MList list) {
        Element p = getElementBack(elementToRemove, list);
        counter--;
        if(p.prev == null){
            _head = p.next;
        } else {
            Element prevToDel = new Element();
            prevToDel = p.prev;
            prevToDel.next = p.next;
        }
        if(p.next == null) {
            _tail = p.prev;
        } else {
            Element nextToDel = new Element();
            nextToDel = p.next;
            nextToDel.prev = p.prev;
        }
        p = null;
    }
}
