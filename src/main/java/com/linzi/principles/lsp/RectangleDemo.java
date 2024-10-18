package com.linzi.principles.lsp;

public class RectangleDemo {
    public static void main(String[] args) {

    }

    // 扩宽方法
    public static void resize(Rectangle rectangle) {
        while (rectangle.getHeight() < rectangle.getWidth()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            printLengthAndWidth(rectangle);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println("=========");
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println();
    }
}
