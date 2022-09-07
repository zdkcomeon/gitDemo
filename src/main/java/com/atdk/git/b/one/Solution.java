package com.atdk.git.b.one;

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode mergeNode(ListNode head) {
        // write code here
        if (head == null) return null;
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode curNode = head;
        while (curNode != null) {
            curNode.val = curNode.val * curNode.next.val;
            curNode.next = curNode.next.next;
            curNode = curNode.next;
        }
        return preHead.next;
    }
}