package com.example.springboot.test;

public class RedShapeDecorator extends ShapeDecorator {//装饰模式
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    @Override
    public void draw2() {

    }

    private void setRedBorder() {
        System.out.println("Border Color Red");
    }
}
