package com.company;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    String time;
    JLabel dayLabel;
    String day;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sat");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss");
        timeLabel = new JLabel();
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setBackground(new Color(0,0,0));
        timeLabel.setForeground(new Color(0,255,0));
        timeLabel.setOpaque(true);

        dayFormat = new SimpleDateFormat("E");
        dayLabel = new JLabel();


        this.add(dayLabel);
        this.add(timeLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {

        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


