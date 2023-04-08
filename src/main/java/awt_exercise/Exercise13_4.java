package awt_exercise;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

class Exercise13_4 extends Frame {
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
    public static void main(String args[]) {
        Exercise13_4 win = new Exercise13_4();
        win.start();
    }
    Exercise13_4() {
        super("");
        MyEventHandler handler = new MyEventHandler();
        addWindowListener(handler);
        setBounds(500, 200, 200, 0);
        updateClock();
        setResizable(false);
        setVisible(true);
    }
    void updateClock() { // Frame의 title에 현재시간을 표시한다.
        Date currentTime = new Date(System.currentTimeMillis());
        setTitle(sdf.format(currentTime));
    }
    void start() {
        Thread t = new Thread(new Runnable(){
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(1000); // 1초 쉰다.
                    } catch(Exception e) {}
                    updateClock();
                }
            } // run()
        });
        t.start();
    }
    class MyEventHandler extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            e.getWindow().dispose();
            System.exit(0);
        }
    } // MyEventHandler
}