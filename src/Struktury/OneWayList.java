package Struktury;


public class OneWayList {

    OneWayListElement _head;
    int counter;

    public void goForward(OneWayList list) {
        OneWayListElement p = list._head;
        while(p.next != null){
            p = p.next;
        }
    }

    public OneWayListElement getElementForward(int data) {
        OneWayListElement p = _head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public void addElementAtBegin(int newElement){
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        p.next = _head;
        _head = p;
        counter++;
    }

    public OneWayListElement getLastElement() {
        OneWayListElement iterator;
        iterator = _head;
        while(iterator.next != null) {
            iterator = iterator.next;
        }
        return iterator;
    }

    public void addElementAtEnd(int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        OneWayListElement lastOne = getLastElement();
        lastOne.next = p;
    }


    public void printOneWayList() {
        OneWayListElement p = _head;
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
    public void addElementAfterElement(int elementToAdd, int elementAfter){
        OneWayListElement after = getElementForward(elementAfter);

            OneWayListElement p = new OneWayListElement();
            p.data = elementToAdd;
            p.next = after.next;
            after.next = p;
            counter++;

    }

}
