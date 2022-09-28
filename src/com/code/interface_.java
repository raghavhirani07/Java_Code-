package com.code;
interface  EventListner{
    void performEvent();
}
interface MouseListner extends EventListner
{
    void MouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListner extends EventListner{
    void keyPressed();
    void keyRelesed();

}
class Wap implements KeyListner,EventListner,MouseListner{

    @Override
    public void MouseClicked() {
        System.out.println ("this is mouse clicker");
    }

    @Override
    public void mousePressed() {
        System.out.println ("this is mousepressed");
    }

    @Override
    public void mouseReleased() {
        System.out.println ("mouse released");
    }

    @Override
    public void mouseMoved() {
        System.out.println ("mousemmoved");
    }

    @Override
    public void mouseDragged() {
        System.out.println ("mouse Dragged");
    }

    @Override
    public void keyPressed() {
        System.out.println ("keypressed");
    }

    @Override
    public void keyRelesed() {
        System.out.println ("key relesed");
    }

    @Override
    public void performEvent() {
        System.out.println ("perforem event");
    }
}
public interface interface_ {
     static void main(String[] args) {
        Wap w=new Wap ();
        w.keyPressed ();
        w.mouseDragged ();
        w.mousePressed ();
        w.performEvent ();
        w.performEvent ();
        w.keyRelesed ();


    }
}
