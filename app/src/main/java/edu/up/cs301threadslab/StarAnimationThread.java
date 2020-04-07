package edu.up.cs301threadslab;

public class StarAnimationThread extends Thread {
    StarAnimation sa;
    public StarAnimationThread(StarAnimation s){
        sa = s;
    }
    @Override
    public void run(){
        while(true){
            if(Math.random() >= 0.5){
                sa.addStar();
            } else {
                sa.removeStar();
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
