package com.example.springboot.test;

public abstract class ShapeDecorator implements  Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape){
        this.decoratedShape = shape;
    }

    public  void draw(){
        decoratedShape.draw();
    }

    public abstract void draw2();
}
