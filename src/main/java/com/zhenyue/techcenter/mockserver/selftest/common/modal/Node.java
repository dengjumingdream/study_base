package com.zhenyue.techcenter.mockserver.selftest.common.modal;

public class Node {

    // 左子树
    Node leftNode;

    // 右子树
    Node rightNode;

    // 当前结点信息
    String data;

    public Node(String data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
