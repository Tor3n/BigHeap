package DinamicProg;

import miniProjects.AbstractDrawingCanva;
import miniProjects.AbstractInfoPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

class Ipanel extends AbstractInfoPanel {


    public void text(String text) {
            coordinateLabel.setText(text);
    }
}

class DrawingCanva2 extends AbstractDrawingCanva {

    private int columns;
    private int rows;
    int thikness;
    int[][] array;

    public DrawingCanva2(AbstractInfoPanel infopanel, int ll, int adq, int[][] array) {
        super(infopanel);
        this.columns = ll;
        this.rows = adq;
        this.array = array;
    }

    @Override
    protected void paintComponent(Graphics g) {

        //setSize(600,400);
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        //g2d.setColor(Color.BLUE);

        Dimension d = getSize();
        int realH = d.height;
        int realW = d.width;
        System.out.println("realH: "+realH+", "+"realW: "+realW);

        g.fillRect(0, 0, realW, thikness);
        g.fillRect(0,0, thikness, realH);


        for (int i = 0; i < columns; i++) {
            g.fillRect(0, realH-thikness-i*(realH/rows+1), realW, thikness);
        }

        for (int i = 0; i < rows+1; i++) {
            g.fillRect(realW-thikness-i*(realW/columns+1), 0, thikness, realH);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int x = (((i)*(realW/columns+1))+(i+1)*(realW/columns+1))/2;
                int y = (+j*(realH/rows+1)+(j+1)*(realH/rows+1))/2;
                g2d.drawString(String.valueOf(array[j][i]),x,y);
            }
        }


    }

}

public class MaxCommonSeq  {


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            //String hWord = "FAKUY";
            //String wWord = "AMKUY";

            String hWord = "FAAFFSA";
            String wWord = "AMSFFAW";

            @Override
            public void run() {
                int hNumber=hWord.length();
                int wNumber=wWord.length();


                Ipanel ip = new Ipanel();
                DrawingCanva2 dc2 = new DrawingCanva2(ip, hNumber, wNumber, getArrayFilled(hWord, wWord));
                //JFrame
                dc2.thikness=3;

                ArrayList<AbstractInfoPanel> hpanels = new ArrayList<>(hWord.length());
                ArrayList<AbstractInfoPanel> wpanels = new ArrayList<>(wWord.length());

                for (int i = 0; i < hNumber; i++) {
                    Ipanel wordH = new Ipanel();
                    wordH.setSize(40,20);
                    wordH.text(String.valueOf(hWord.charAt(i)));
                    hpanels.add(wordH);
                }

                for (int i = 0; i < wNumber; i++) {
                    Ipanel wordW = new Ipanel();
                    wordW.text(String.valueOf(wWord.charAt(i)));
                    wpanels.add(wordW);
                }

                ip.text(" ");



                DrawingFrameMCS p = new DrawingFrameMCS(ip, dc2, hpanels, wpanels) {

                    @Override
                    public void pointsSetter() {

                    }
                };

            }

            public int[][] getArrayFilled(String hWord, String wWord){

                int[][] array = new int[hWord.length()][wWord.length()];

                for (int i = 0; i < wWord.length(); i++) {
                    for (int j = 0; j < hWord.length(); j++) {
                        char chari = wWord.charAt(i);
                        char charj = hWord.charAt(j);
                        if(wWord.charAt(i)==hWord.charAt(j)){
                            if((i-1)<0 || (j-1)<0){
                                //if close to the border
                                array[i][j]=1;
                            } else {
                                array[i][j] = array[(i-1)][(j-1)]+1;
                            }

                        }else{
                            int up=0;
                            int left=0;
                            int lUp=0;
                            if((i-1)<0&&(j-1)<0){
                                array[i][j]=0;
                            }else if((i-1)<0){
                                left = array[i][j-1];
                                array[i][j]=left;
                            } else if((j-1)<0){
                                up = array[i-1][j];
                                array[i][j]=up;
                            } else {
                                left = array[i][j-1];
                                up = array[i-1][j];
                                lUp = array[i-1][j-1];
                                array[i][j] = Math.max(Math.max(up,left), lUp);
                            }


                        }
                    }

                }

                for (int i = 0; i < wWord.length(); i++) {
                    for (int j = 0; j < hWord.length(); j++) {
                        System.out.print(array[i][j]+" ");
                    }
                    System.out.println();
                }

                return array;
            }


        });

    }



}
