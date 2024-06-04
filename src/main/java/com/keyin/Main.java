package com.keyin;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 1);
        singleLinkedList.traverseLinkedList();
        singleLinkedList.searchNode(4);
        singleLinkedList.deleteNode(3);
        singleLinkedList.traverseLinkedList();
    }
}


//Assignment question number
//1. Uncomment line 10 "singleLinkedList.insertInLinkedList(5, 1)" and Investigate and fix
// why when inserting a value at a position that is already occupied, it throws a null pointer exception.

//**** Here is a snippet of the code from SingleLinkedList.insertInLinkedList() **** //
//-----------------------------------------------------------------------------------//

//  public void insertInLinkedList(int nodeValue, int location){
//        Node node = new Node();
//        node.value = nodeValue;
//        if(head == null) {
//            createLinkedList(nodeValue);
//            return;
//        } else if (location == 0) {
//            node.next = head;
//            head = node;
//        } else if (location >= size) {
//            tail.next = node;
//            node.next = null;
//            tail = node;
//        } else {
//            Node tempNode = head;
//            int index = 0;
//            while (index < location - 1) {
//                tempNode = tempNode.next;
//                index++;
//            }
//            // Node nextNode = node;
//            // node.next = nextNode;
//            node.next = tempNode.next;
//            tempNode.next = node;
//        }
//        size++;
//    }

//--------------------------------------------------------------------------------------------------------------------//
// The solution lies on lines 46-47 just below the commented-out old code. The old code creates a new instance of Node
// called nextNode and assigns the value of node to it. It then assigns the value of nextNode to node.next. The solution
// is not to create another temporary Node object (nextNode) and instead to keep working with the tempNode that's already
// been created. After tempNode has finished looping through the linked list and has reached the value of location, its
// next node, tempNode.next, will be assigned to the originally created node as its next node (node.next). To complete
// the solution, tempNode.next takes the value of node.
