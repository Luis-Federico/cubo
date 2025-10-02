import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
//import java.awt.*;
//import java.awt.Graphics2D;
//import java.awt.RenderingHints;
import java.awt.Polygon;
//import javax.swing.*;
import javax.swing.event.*;
//import java.awt.*;
import java.awt.event.*;
//import java.util.Scanner;
/*
public class PoligonoEjemplo3 extends JPanel {
      boolean dyed =true;  
 static int nPoints = 8;
        static int [] pointx = new int [nPoints];
        static int [] pointy = new int [nPoints];
   int [] oldpointx = new int [nPoints];
       int [] oldpointy = new int [nPoints];
    protected void paintComponent( Graphics g ){ 
    super.paintComponent( g ); 
*/

//@Override
class Console {
   public static String titulo( Object o) {
   String t = o.getClass().toString();
   if(t.indexOf("class") != -1)
     t = t.substring(6);
   return t;
   }
public static void setupClosing(JFrame frame) {
  frame.addWindowListener(new WindowAdapter() {
  public void windowClosing(WindowEvent e) {
    System.exit(0);
   }
});
}
public static void
run(JFrame frame, int width, int heigth) {
   setupClosing(frame);
   frame.setSize(width, heigth);
   frame.setVisible(true);
}

public static void
run(JApplet applet, int width, int heigth) {
   JFrame frame = new JFrame(titulo(applet));
   setupClosing(frame);
   frame.getContentPane().add(applet);
   frame.setSize(width, heigth);
   applet.init();
   applet.start();
   frame.setVisible(true);
}

public static void
run(JPanel panel, int width, int heigth) {
   JFrame frame = new JFrame(titulo(panel));
   setupClosing(frame);
   frame.getContentPane().add(panel);
   frame.setSize(width, heigth);
   frame.setVisible(true);
   }
}
class PoligonoEjemplo6 extends JPanel {
    static final int FACTORESCALADO = 200;
 private boolean dyed =true;  
 private int ofra=0;
 private int[] gg =new int [6];
 private int nPoints = 8;
       private int [][] pointx = new int [6][nPoints];
        private int [][] pointy = new int [6][nPoints];
        private int [] pontx = new int [nPoints];
        private int [] ponty = new int [nPoints];
        private double[][] angle = new double [8][3];
        private double [][] medio = new double[6][3];
private int[][] vertice0x1=new int[2][4];
private int[][] vertice1x1=new int[2][4];
private int[][] vertice2x1=new int[2][4];
private int[][] vertice3x1=new int[2][4];
private int[][] vertice4x1=new int[2][4];
private int[][] vertice5x1=new int[2][4];
private int[][] vertice6x1=new int[2][4];
/*
private int[] vertice0x2=new int[4];
private int[] vertice1x2=new int[4];
private int[] vertice2x2=new int[4];
private int[] vertice3x2=new int[4];
private int[] vertice4x2=new int[4];
private int[] vertice5x2=new int[4];
private int[] vertice6x2=new int[4];
*/
private int[][] vertice0y1=new int[2][4];
private int[][] vertice1y1=new int[2][4];
private int[][] vertice2y1=new int[2][4];
private int[][] vertice3y1=new int[2][4];
private int[][] vertice4y1=new int[2][4];
private int[][] vertice5y1=new int[2][4];
private int[][] vertice6y1=new int[2][4];
/*
private int[] vertice0y2=new int[4];
private int[] vertice1y2=new int[4];
private int[] vertice2y2=new int[4];
private int[] vertice3y2=new int[4];
private int[] vertice4y2=new int[4];
private int[] vertice5y2=new int[4];
private int[] vertice6y2=new int[4];
*/
private int[][] vertice0z1=new int[2][4];
private int[][] vertice1z1=new int[2][4];
private int[][] vertice2z1=new int[2][4];
private int[][] vertice3z1=new int[2][4];
private int[][] vertice4z1=new int[2][4];
private int[][] vertice5z1=new int[2][4];
private int[][] vertice6z1=new int[2][4];
/*
private int[] vertice0z2=new int[4];
private int[] vertice1z2=new int[4];
private int[] vertice2z2=new int[4];
private int[] vertice3z2=new int[4];
private int[] vertice4z2=new int[4];
private int[] vertice5z2=new int[4];
private int[] vertice6z2=new int[4];
*/
  // private int [] oldpointx = new int [nPoints];
    //   private int [] oldpointy = new int [nPoints];

    private double teta1=0;
   private double teta2=0;
   private double teta3=0;
  
   double angulosx;
   double angulosy;
   double angulosz;
//private boolean mov=true;
//private Thread hilo;
   
 //int y;

    
        //PoligonoEjemplo6 panel = new PoligonoEjemplo6();
    /*
        JFrame panel =new JFrame();
       //add(panel);
        setSize(600, 600);
        setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      */
     // y=ye;
   PoligonoEjemplo6() { 

    establecerAngulosX(0); 
    establecerAngulosY(0);
    establecerAngulosZ(0);

    angle[5][0]=-.5f;
    angle[5][1]=-.5f;
    angle[5][2]=-.5f;
    angle[1][0]=-.5f;
    angle[1][1]=.5f;
    angle[1][2]=-.5f;
    angle[2][0]=.5f;
    angle[2][1]=.5f;
    angle[2][2]=-.5f;
    angle[6][0]=.5f;
    angle[6][1]=-.5f;
    angle[6][2]=-.5f;
    angle[4][0]=-.5f;
    angle[4][1]=-.5f;
    angle[4][2]=.5f;
    angle[0][0]=-.5f;
    angle[0][1]=.5f;
    angle[0][2]=.5f;
    angle[3][0]=.5f;
    angle[3][1]=.5f;
    angle[3][2]=.5f;
    angle[7][0]=.5f;
    angle[7][1]=-.5f;
    angle[7][2]=.5f;

    medio[0][0]=0;
    medio[0][1]=0.5;
    medio[0][2]=0;

    medio[1][0]=0;
    medio[1][1]=-0.5;
    medio[1][2]=0;

    medio[2][0]=0.5;
    medio[2][1]=0;
    medio[2][2]=0;
    
    medio[3][0]=-0.5;
    medio[3][1]=0;
    medio[3][2]=0;
    
    medio[4][0]=0;
    medio[4][1]=0;
    medio[4][2]=-0.5;
    
    medio[5][0]=0;
    medio[5][1]=0;
    medio[5][2]=0.5;
    

}
 
               
 

//System.out.println("Nuevos angular");
   // if (teta<Math.PI){teta+=5*s;}else{teta=0;}
               // ESTO ERA LO QUE HABIA:
           //teta1+= 0.5;  
           
          // o=(int)(teta)%20;
          // if (teta>35){o=1;}

                // ESTO ERA LO QUE HABIA:
          //if(teta1==5){o=(int)((o%3));o++;teta1=0;}   
          
          //for(o=1;o<4;o++){
         // System.out.print("caso : "+o+"    y    , teta :"+teta1+"      ");
     public void establecerAngulosX(int numAngulosX) {
  angulosx = numAngulosX;
   
       // hilo =new Thread(this);
      // hilo.start();

//boolean [] g = new boolean [8];

    double nuevo1x,nuevo1y,nuevo1z;

    double nuevox,nuevoy,nuevoz;
               // ESTO ES LO NUEVO:
               teta1=angulosx/10;
        //rotation x
           

        
            for (int i=0; i<6 ; i++)
            {
                nuevo1x=medio[i][0]*Math.cos(teta1)+medio[i][1]*Math.sin(teta1);
                nuevo1y=-medio[i][0]*Math.sin(teta1)+medio[i][1]*Math.cos(teta1);
                nuevo1z=medio[i][2];

                medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;

                      
}
           


            
        for (int i=0; i<8 ; i++)
        {

            nuevox=angle[i][0]*Math.cos(teta1)+angle[i][1]*Math.sin(teta1);
            nuevoy=-angle[i][0]*Math.sin(teta1)+angle[i][1]*Math.cos(teta1);
            nuevoz=angle[i][2];




            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }
        repaint();
        }

         public void establecerAngulosY(int numAngulosY) {
  angulosy = numAngulosY;
   
       // hilo =new Thread(this);
      // hilo.start();

//boolean [] g = new boolean [8];

    double nuevo1x,nuevo1y,nuevo1z;

    double nuevox,nuevoy,nuevoz;
               // ESTO ES LO NUEVO:
               teta2=angulosy/10;

            for (int i=0; i<6 ; i++)
            {
                nuevo1x=medio[i][0]*Math.cos(teta2)+medio[i][2]*Math.sin(teta2);
                nuevo1y=medio[i][1];
                nuevo1z=-medio[i][0]*Math.sin(teta2)+medio[i][2]*Math.cos(teta2);


               medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;

            
}
        for (int i=0; i<8 ; i++)
        {

            //rotation y
            nuevox=angle[i][0]*Math.cos(teta2)+angle[i][2]*Math.sin(teta2);
            nuevoy=angle[i][1];
            nuevoz=-angle[i][0]*Math.sin(teta2)+angle[i][2]*Math.cos(teta2);



            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }
        repaint();
        }

 public void establecerAngulosZ(int numAngulosZ) {
  angulosz = numAngulosZ;
   
       // hilo =new Thread(this);
      // hilo.start();

//boolean [] g = new boolean [8];

    double nuevo1x,nuevo1y,nuevo1z;

    double nuevox,nuevoy,nuevoz;
               // ESTO ES LO NUEVO:
               teta3=angulosz/10;
            for (int i=0; i<6 ; i++)
            {

                nuevo1x=medio[i][0];
                nuevo1y=medio[i][1]*Math.cos(teta3)-medio[i][2]*Math.sin(teta3);
                nuevo1z=medio[i][1]*Math.sin(teta3)+medio[i][2]*Math.cos(teta3);

               medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;

            
            }

        for (int i=0; i<8 ; i++)
        {
            //rotation z

            nuevox=angle[i][0];
            nuevoy=angle[i][1]*Math.cos(teta3)-angle[i][2]*Math.sin(teta3);
            nuevoz=angle[i][1]*Math.sin(teta3)+angle[i][2]*Math.cos(teta3);




            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }
        


   
repaint();

}

    public void paintComponent(Graphics g ) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int t=200;
        int q=200;
        
// 6*4=24

// 8*3=24

// 3*24=72
int [][] verticex1=new int [6][4];
int [][] verticey1=new int [6][4];
int [][] verticez1=new int [6][4];

for (int i=0;i<4;i++){
      for (int j=0;j<6;j++){  
      verticex1[j][i]=(int)(angle[constructor.vortex(constructor.plano(j,i),0)][0]*t+q);
      //vertice0x2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][0]*t+q);
      verticey1[j][i]=(int)(angle[constructor.vortex(constructor.plano(j,i),0)][1]*t+q);
      //vertice0y2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][1]*t+q);
      verticez1[j][i]=(int)(angle[constructor.vortex(constructor.plano(j,i),0)][2]*t+q);
      //vertice0z2[i]=(int)(angle[constructor1.vortex(constructor1.plano(0,i),1)][2]*t+q);
      }
  }
     
//EL PRINCIPIO DE LINEA ES VERTICE0X1 Y EL FINAL DE LINEA ES VERTICE0X2

Polygon []poligono = new Polygon[6];
//for(int y=0;y<2;y++){
for (int j=0;j<6;j++){
poligono[j]=new Polygon(verticex1[j],verticey1[j], 4);
}

       
      for (int itv=0; itv <6; itv++) {
        
            if (medio[itv][2]>0){

              
                    switch(itv){
         case 0:
                     g2d.setColor(Color.BLUE);
                         g2d.fillPolygon(poligono[0]);
                       // Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                         //g2d.fillPolygon(poligono[iw]);
                   break;
        case 1:

                        g2d.setColor(Color.GREEN);
                         g2d.fillPolygon(poligono[1]);
                         //Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                        //g2d.fillPolygon(poligono[iw]);
                    break;
         case 2:

                        g2d.setColor(Color.ORANGE);
                        g2d.fillPolygon(poligono[2]);
                       // Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                        //g2d.fillPolygon(poligono[iw]);
                    break;
         case 3:

                        g2d.setColor(Color.YELLOW);
                         g2d.fillPolygon(poligono[3]);
                        //Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                         //g2d.fillPolygon(poligono[iw]);
                    break;
                       

    case 4:

                        g2d.setColor(Color.RED);
                        g2d.fillPolygon(poligono[4]);
                         //Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                         //g2d.fillPolygon(poligono[iw]);
                    break;

    case 5:

                        g2d.setColor(Color.BLACK);
                        g2d.fillPolygon(poligono[5]);
                         //Polygon poligono[h] = new Polygon( pointx[iw], pointy[iw], 4 );
                         //g2d.fillPolygon(poligono[iw]);
                    break;
                   
                   

            }
            }
        
                    
    }

    }

}

/*
@Override
public void run(){
    
   while(mov){

    movecubo();
           // Polygon poligono2 = new Polygon( pointx, pointy, 8 );

 
            try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
throw new RuntimeException(e);
        }
        repaint();
    }
   }


}
*/
public class Mfederico1 extends JApplet {
  PoligonoEjemplo6 hola = new PoligonoEjemplo6();
  JSlider angulosx = new JSlider(1, 60, 1);
  public void init() {
   Container cp = getContentPane();
    cp.add(hola);
    angulosx.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        hola.establecerAngulosX(((JSlider)e.getSource()).getValue());
        }
});
cp.add(BorderLayout.SOUTH, angulosx);
JSlider angulosy = new JSlider(1,60,1);
  //public void init() {
    //Container cp = getContentPane();
    //cp.add(hola);
    angulosy.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        hola.establecerAngulosY(((JSlider)e.getSource()).getValue());
        }
});
cp.add(BorderLayout.WEST, angulosy);
JSlider angulosz = new JSlider(1, 60, 1);
 // public void init() {
    //Container cp = getContentPane();
    //cp.add(hola);
    angulosz.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        hola.establecerAngulosZ(((JSlider)e.getSource()).getValue());
        }
});
cp.add(BorderLayout.EAST, angulosz);
}
public static void main( String[] args) {
   Console.run(new Mfederico1(), 800, 400);
   }

}
/*
public class Mfederico {
     
    public static void main(String[] args)  {
       //setLocationRelativeTo(null);
        /*SwingUtilities.invokelater(new Runnable() {
          @Override
          public void run(){
            new PoligonoEjemplo6();
          }
      });
      
     // Scanner sc=new Scanner(System.in);
     // System.out.println ("introduzca la permutacion");
     // int number=sc.nextInt();
        PoligonoEjemplo6 poligonoejemplo6 =new PoligonoEjemplo6();


    }




        JFrame frame = new JFrame("Dibujo de Polígono");
        PoligonoEjemplo6 poligonoejemplo6 = new PoligonoEjemplo6();
        frame.add(poligonoejemplo6);
        frame.setSize(600, 600);
        frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       hilo =new Thread(this);
       hilo.start();
       /*
        while (true) {
            poligonoejemplo6.movecubo();
            poligonoejemplo6.repaint();
            Thread.sleep(10);
        }
        */
            //movimiento.mover(true,teta, 1,o);

        //PoligonoEjemplo6 panel = new PoligonoEjemplo6();

        
    
    
