package awt_exercise;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exercise13_1 extends Frame {
    final int SIZE = 5; //빙고판의 크기
    Button[] btnArr = null;

    String[] birds = { //버튼에 넣을 문자열들
            "참새", "두루미", "황새", "비둘기", "까오기",
            "오리", "타조", "부엉이", "올빼미", "뱁새",
            "꿩", "닭", "구관조", "잉꼬", "매",
            "거위", "독수리", "콘돌", "봉황", "공작",
            "까치", "까마귀", "앵무새", "꾀꼬리", "고니"
    };

    Exercise13_1() {
        this("Bingo Game");
    }
    Exercise13_1(String title) {
        super(title);
        setLayout(new GridLayout(SIZE, SIZE)); // Frame의 layout을 GridLayout으로
        MyEventHandler handler = new MyEventHandler();
        addWindowListener(handler);
        btnArr = new Button[SIZE*SIZE]; // 5*5=25개의 버튼을 담을 객체배열을 만든다.
// Frame에 버튼을 추가한다.
        for(int i=0; i < SIZE*SIZE;i++) {
            btnArr[i] = new Button(birds[i]);//배열 birds의 값을 버튼의 Label로 한다.
            btnArr[i].addActionListener(handler); // 버튼에 이벤트리스너를 추가
            add(btnArr[i]); // 버튼을 Frame에 추가한다.
        }
        setBounds(500, 200, 300, 300);
        setVisible(true);
    }
    public static void main(String args[]) {
        Exercise13_1 win = new Exercise13_1("Bingo Game");
        win.show();
    }
    class MyEventHandler extends WindowAdapter implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            Button btn = (Button)ae.getSource();
            System.out.println(btn.getLabel()); // 눌러진 버튼의 Label을 콘솔에 출력
            btn.setBackground(Color.LIGHT_GRAY); // 백그라운드를 밝은 회색으로 변경
        }
        // Frame의 우측 상단의 x버튼(닫기버튼)을 누르면 프로그램을 종료한다.
        public void windowClosing(WindowEvent e) {
            e.getWindow().setVisible(false);
            e.getWindow().dispose();
            System.exit(0);
        }
    } // MyEventHandler
}