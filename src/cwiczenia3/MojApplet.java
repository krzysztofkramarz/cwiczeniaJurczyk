package cwiczenia3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MojApplet extends Applet implements Runnable {
    private String message = " ";
    private KeyEvent keyEvent;
    Dimension dimension;
    Color color;
    Graphics graphics;
    ArrayList<Kulka> kulkaArrayList = new ArrayList<>();

    public void init() {
        MalyBudowniczy malyBudowniczy = new MalyBudowniczy();

        System.out.println("init");
        dimension = getSize();

        for (int i = 0; i < 10; i++) {
            kulkaArrayList.add(new Kulka(dimension));
        }
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getButton() == MouseEvent.BUTTON1) {
//                    for (Kulka kulka : kulkaArrayList) {
//                        if (kulka.isContaining(e.getX(), e.getY())) {
//                            kulka.zmienKolor();
//                            repaint();
//                        }
//                    }
//                }
//                if (e.getButton() == MouseEvent.BUTTON3) {
//                    for (Kulka kulka : kulkaArrayList) {
//
//                    }
//                    kulkaArrayList.add(new Kulka(dimension, e.getX(), e.getY()));
//                    repaint();
//                }
//            }
//
//
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                message = "mouseEntered";
//                repaint();
//
//
//            }
//
//            @Override
//            public void mouseExited(MouseEvent e) {
//                message = "mouseExited";
//                repaint();
//
//
//            }
//
//
//        });
      //  addKeyListener(this);
        Thread t1 = new Thread(this, "MOJ WATEK");
        t1.start();



    }

    @Override
    public void paint(Graphics graphics) {
        System.out.println("drukuje z wątku " + Thread.currentThread().getName());
        showStatus(message);
        // setBackground(Color.GREEN);
        for (Kulka kulka : kulkaArrayList) {
            kulka.rysuj(graphics);

        }
    }

    @Override
    public void update(Graphics g) {
        System.out.println("UPDATE");
    }

    @Override
    public void run() {
        System.out.println("run z wątku  " + Thread.currentThread().getName());
       // while (true) {
            try {
                Thread.sleep(200);
                System.out.println("PRZESUWAM!");
                for (Kulka kulka : kulkaArrayList) {
                    kulka.przesun();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }

   // }


//    @Override
//    public void keyTyped(KeyEvent e) {
//        if (e.getKeyChar() == 'c')
//            message = e.toString();
//        repaint();
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
}

