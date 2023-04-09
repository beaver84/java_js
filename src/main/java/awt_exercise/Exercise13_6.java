package awt_exercise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class Exercise13_6 extends Frame {
    Panel pDate = new Panel();
    Panel pUp = new Panel();
    Button btnPrevMon = new Button("◀");
    Button btnNextMon = new Button("▶");
    Label lblYearMon = new Label();
    Button[] btnArr = new Button[210];
    Calendar curMon = Calendar.getInstance();

    Exercise13_6(String title) {
        super(title);
        pUp.setBackground(Color.yellow);
        pUp.setLayout(new FlowLayout(FlowLayout.CENTER));
        pUp.add(btnPrevMon);
        pUp.add(lblYearMon);
        pUp.add(btnNextMon);
        pDate.setLayout(new GridLayout(30,35));
        for(int i=0; i < btnArr.length;i++) {
            btnArr[i] = new Button("");
            pDate.add(btnArr[i]);
        }
        btnPrevMon.addActionListener(new BtnEventHandler());
        btnNextMon.addActionListener(new BtnEventHandler());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                we.getWindow().setVisible(false);
                we.getWindow().dispose();
                System.exit(0);
            }
        });
        add(pUp,"North");
        add(pDate,"Center");
        setBounds(1000,1000,2500,1500);
        setDays(curMon);
        setVisible(true);
    } // MyScheduler
    void setDays(Calendar date) {
        int year = date.get(Calendar.YEAR);
        int month = date.get(Calendar.MONTH);
        lblYearMon.setText(year+"년 "+(month+1)+"월");
        Calendar sDay = Calendar.getInstance(); // 시작일

// 1. 시작일(sDay)을 해당 월의 1일이 포함된 일요일로 설정한다.
        sDay.set(year, month, 1); // 입력월의 1일로 설정한다.
        sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);

// 2. 반복문을 사용해서 sDay의 값을 1씩 증가시키면서 버튼에 날짜를 넣는다.
        for(int i=0; i < btnArr.length; i++, sDay.add(Calendar.DATE, 1)) {
            int day = sDay.get(Calendar.DATE); // sDay에서 날자를 뽑아서 day에 저장
            btnArr[i].setLabel(day+"");

// 3. 만일 날짜가 해당 월에 속하면 버튼의 배경색을 흰색(Color.white)으로 하고
//            그렇지 않으면 밝은 회색(Color.lightGray)으로 설정한다.
            if(sDay.get(Calendar.MONTH)!=month) {
                btnArr[i].setBackground(Color.lightGray);
            } else {
                btnArr[i].setBackground(Color.white);
            }
        }
    } // setDays(Calendar date)

    class BtnEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            Button src = (Button)ae.getSource();
            if(src==btnPrevMon) {
                curMon.add(Calendar.MONTH, -1);
            } else if(src==btnNextMon) {
                curMon.add(Calendar.MONTH, 1);
            }
            setDays(curMon);
            repaint();
        }
    }

    public static void main(String[] args) {
        Exercise13_6 mainWin = new Exercise13_6("Scheduler");
    } // main
}