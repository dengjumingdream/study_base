package com.zhenyue.techcenter.mockserver.selftest.common;

import com.zhenyue.techcenter.mockserver.selftest.common.modal.Node;

import java.util.LinkedList;
import java.util.Stack;

public class BTreeTest {

    private static String[] bTree = {"a", "b", "c", "d", "e", "f", "g", "h"};

    public static void main(String[] args) {

        // 建立二叉树
        Node bTree = createBinTree();

        // 二叉树前序遍历（非递归）
        iterativePreOder(bTree);

    }

    //TODO 树写错了
    public static Node createBinTree() {

        // 1.进行结点创建
        LinkedList<Node> nodeList = new LinkedList<>();
        for(int i = 0, len = bTree.length; i < len; i++) {
            String _data = bTree[i];
            Node _node = new Node(_data);
            nodeList.add(_node);
        }

        // 2.将结点搭建为二叉树
        for(int parentIndex = 0, len = nodeList.size() / 2 - 1; parentIndex < len; parentIndex++) {
            Node _node = nodeList.get(parentIndex);
            Node _leftNode = nodeList.get(parentIndex * 2 + 1);
            Node _rightNode = nodeList.get(parentIndex * 2 + 2);
            _node.setLeftNode(_leftNode);
            _node.setRightNode(_rightNode);
        }

        // 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理
        int lastParentIndex = bTree.length / 2 - 1;

        // 左孩子
        nodeList.get(lastParentIndex).setLeftNode(nodeList.get(lastParentIndex * 2 + 1));

        // 右孩子,如果数组的长度为奇数才建立右孩子
        if (bTree.length % 2 == 1) {
            nodeList.get(lastParentIndex).setRightNode(nodeList.get(lastParentIndex * 2 + 2));
        }

        return nodeList.get(0);
    }

    /**
     * @desc 前序遍历
     */
    private static void iterativePreOder(Node bTree) {
        Stack<Node> stack = new Stack<Node>();
        if(bTree != null) {
            stack.push(bTree);
            while (!stack.empty()) {
                bTree = stack.pop();
                visite(bTree);
                if(bTree.getRightNode() != null) {
                    stack.push(bTree.getRightNode());
                }
                if(bTree.getLeftNode() != null) {
                    stack.push(bTree.getLeftNode());
                }
            }
        }
    }

    private static void visite(Node bTree) {
        System.out.print(bTree.getData());
    }
}
