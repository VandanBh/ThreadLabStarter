package edu.up.cs301threadslab;

public class AnimationThread extends Thread {
    AnimationView av;
    public AnimationThread(AnimationView v){
        av = v;
    }
    @Override
    public void run(){
        while(true){
            av.postInvalidate();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
