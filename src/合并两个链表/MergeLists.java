package 合并两个链表;

import java.util.Scanner;

public class MergeLists {
    static ListNode l1 = null;
    static ListNode l2 = null;
    static ListNode l3 = null;
    static ListNode temp = null;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入第一个链表的结点个数：");
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            int data = in.nextInt();
            addNode(data,l1);
        }
        System.out.println("请输入第二个链表的结点个数：");
        int m = in.nextInt();
        for(int i = 0;i<m;i++){
            int data = in.nextInt();
            addNode(data,l2);
        }

        l3 = mergeTwoLists(l1,l2);
        ListNode tp = null;
        tp = l3.next;
        while(tp!=null){
            if(tp.next == null)
                System.out.println(tp.data);
            System.out.println(tp.data+"->");
        }
    }

    public static void addNode(int data, ListNode head){
        ListNode node  = new ListNode(data);
        if(head == null){
            head = node;
            return;
        }
        temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public  static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode temp = new ListNode(0);
        l3 = temp;
        ListNode temp_1 = null;
        ListNode temp_2 = null;
        temp_1 = l1;
        temp_2 = l2;
        while(temp_1!=null || temp_2!=null){
            if(temp_1.data > temp_2.data){
                ListNode node = new ListNode(temp_2.data);
                temp.next = node;
                node = temp;
                temp_2 = temp_2.next;
            }
            if(temp_1.data < temp_2.data){
                ListNode node = new ListNode(temp_1.data);
                temp.next = node;
                node = temp;
                temp_1 = temp_1.next;
            }
            if(temp_1.data == temp_2.data){
                ListNode node_1 = new ListNode(temp_1.data);
                temp.next = node_1;
                node_1 = temp;
                temp_1 = temp_1.next;

                ListNode node_2 = new ListNode(temp_2.data);
                temp.next = node_2;
                node_2 = temp;
                temp_2 = temp_2.next;
            }
        }
        return l3;
    }
}

class ListNode{
    int data;
    ListNode next = null;
    ListNode(int data) {
        this.data = data;
    }
}


