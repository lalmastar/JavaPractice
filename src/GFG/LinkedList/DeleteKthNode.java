package GFG.LinkedList;

class DeleteKthNode
{
    static class Node
    {
        int data;
        Node next;
    }
    static Node freeList(Node node)
    {
        while (node != null)
        {
            Node next = node.next;
            node = next;
        }
        return node;
    }
    static Node deleteKthNode(Node head, int k)
    {
        if (head == null)
            return null;

        if (k == 1)
        {
            head = freeList(head);
            return null;
        }

        Node ptr = head, prev = null;

        int count = 0;
        while (ptr != null)
        {
            count++;
            if (k == count)
            {
                prev.next = ptr.next;
                count = 0;
            }

            // update prev if count is not 0
            if (count != 0)
                prev = ptr;

            ptr = prev.next;
        }
        return head;
    }
    static void displayList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static Node newNode(int x)
    {
        Node temp = new Node();
        temp.data = x;
        temp.next = null;
        return temp;
    }

    public static void main(String args[])
    {
        Node head = newNode(10);
        head.next = newNode(20);
        head.next.next = newNode(30);
        head.next.next.next = newNode(40);
        head.next.next.next.next = newNode(50);
        head.next.next.next.next.next = newNode(60);
        head.next.next.next.next.next.next = newNode(70);
        head.next.next.next.next.next.next.next = newNode(80);

        int k = 3;
        head = deleteKthNode(head, k);
        displayList(head);
    }
}
