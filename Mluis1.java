import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.*;
 import java.awt.geom.*;

//import java.awt.image.BufferedImage;






//@Override



public class Mluis1 {
   static Canvas myCanvas;
    //myCanvas.setVisible(true);
   static int aqui=1;
   
   static double [][]angle=new double[8][3];
   static double medio[][] =new double [6][3];
    public static void main(String[] args)  {

         myCanvas = new Canvas("CUBO",600,600);
        myCanvas.setVisible(true);
        dibujo();
        int result = JOptionPane.NO_OPTION;
        do{
        result=JOptionPane.showConfirmDialog(null,"Another ? (yes--> for another)", "Rotations",JOptionPane.YES_NO_OPTION);
        if (result==JOptionPane.YES_OPTION){JOptionPane.showMessageDialog(null,"Go !");dibujo();}else if(result==JOptionPane.NO_OPTION){JOptionPane.showMessageDialog(null,"Bye !");}
        }while(result==JOptionPane.YES_OPTION);
        System.exit(0);
    }

static double teta;
 static int nPoints = 8;
        static int [][] pointx = new int [nPoints][8];
        static int [][] pointy = new int [nPoints][8];
   int [] oldpointx = new int [nPoints];
       int [] oldpointy = new int [nPoints];

   static boolean dyed=true;
     static void dibujo(){

 //public PoligonoEjemplo6(int aqui){

   // super("Dibujo de Polígono");
        //PoligonoEjemplo6 panel = new PoligonoEjemplo6();

    angle[0][0]=-.5f;
    angle[0][1]=-.5f;
    angle[0][2]=-.5f;
    angle[1][0]=-.5f;
    angle[1][1]=.5f;
    angle[1][2]=-.5f;
    angle[2][0]=.5f;
    angle[2][1]=.5f;
    angle[2][2]=-.5f;
    angle[3][0]=.5f;
    angle[3][1]=-.5f;
    angle[3][2]=-.5f;
    angle[4][0]=-.5f;
    angle[4][1]=-.5f;
    angle[4][2]=.5f;
    angle[5][0]=-.5f;
    angle[5][1]=.5f;
    angle[5][1]=.5f;
    angle[5][1]=.5f;
    angle[5][2]=.5f;
    angle[6][0]=.5f;
    angle[6][1]=.5f;
    angle[6][2]=.5f;
    angle[7][0]=.5f;
    angle[7][1]=-.5f;
    angle[7][2]=.5f;

    medio[0][0]=0;
    medio[0][1]=0;
    medio[0][2]=-.5f;

    medio[1][0]=0;
    medio[1][1]=0;
    medio[1][2]=.5f;

    medio[2][0]=.5f;
    medio[2][1]=0;
    medio[2][2]=0;

    medio[3][0]=-.5f;
    medio[3][1]=0;
    medio[3][2]=0;

    medio[4][0]=0;
    medio[4][1]=.5f;
    medio[4][2]=0;

    medio[5][0]=0;
    medio[5][1]=-.5f;
    medio[5][2]=0;

       // hilo =new Thread(this);
      // hilo.start();
    double degrees;
String A1=JOptionPane.showInputDialog(null,"Enter the angle x?  (degrees, number between 0 and 360)", "Funciones trigonométricas",JOptionPane.QUESTION_MESSAGE);
        degrees = Double.parseDouble(A1);
        
        double aquix=grados.convertir(degrees);
   String A2=JOptionPane.showInputDialog(null,"Enter the angle y?  (degrees, number between 0 and 360)", "Funciones trigonométricas",JOptionPane.QUESTION_MESSAGE);
         degrees = Double.parseDouble(A2);
         
         double aquiy=grados.convertir(degrees);
           String A3=JOptionPane.showInputDialog(null,"Enter the angle z?  (degrees, number between 0 and 360)", "Funciones trigonométricas",JOptionPane.QUESTION_MESSAGE);
           degrees = Double.parseDouble(A3);
           
           double aquiz=grados.convertir(degrees);




    double nuevo1x,nuevo1y,nuevo1z;

    double nuevox,nuevoy,nuevoz;




// s++;
System.out.println("Nuevos angular");
   // if (teta<Math.PI){teta+=5*s;}else{teta=0;}

         for (int o=1;o<4;o++){



    switch(o)
    {
        //rotation x


        case 1:
      for (double teta=0;teta<=aquix;teta=teta+0.1)
      {
            for (int i=0; i<6 ; i++)
            {
                nuevo1x=medio[i][0]*Math.cos(teta)+medio[i][1]*Math.sin(teta);
                nuevo1y=-medio[i][0]*Math.sin(teta)+medio[i][1]*Math.cos(teta);
                nuevo1z=medio[i][2];

                medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;


}




        for (int i=0; i<8 ; i++)
        {

            nuevox=angle[i][0]*Math.cos(teta)+angle[i][1]*Math.sin(teta);
            nuevoy=-angle[i][0]*Math.sin(teta)+angle[i][1]*Math.cos(teta);
            nuevoz=angle[i][2];




            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }

      pintar(angle, medio);
    }
        break;


        case 2:
        for (double teta=0;teta<=aquiy;teta=teta+0.1)
        {
            for (int i=0; i<6 ; i++)
            {
                nuevo1x=medio[i][0]*Math.cos(teta)+medio[i][2]*Math.sin(teta);
                nuevo1y=medio[i][1];
                nuevo1z=-medio[i][0]*Math.sin(teta)+medio[i][2]*Math.cos(teta);


               medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;


}
        for (int i=0; i<8 ; i++)
        {

            //rotation y
            nuevox=angle[i][0]*Math.cos(teta)+angle[i][2]*Math.sin(teta);
            nuevoy=angle[i][1];
            nuevoz=-angle[i][0]*Math.sin(teta)+angle[i][2]*Math.cos(teta);



            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }
        pintar(angle, medio);
      }
        break;
        case 3:
        for (double teta=0;teta<=aquiz;teta=teta+0.1)
        {
            for (int i=0; i<6 ; i++)
            {

                nuevo1x=medio[i][0];
                nuevo1y=medio[i][1]*Math.cos(teta)-medio[i][2]*Math.sin(teta);
                nuevo1z=medio[i][1]*Math.sin(teta)+medio[i][2]*Math.cos(teta);

               medio[i][0]=nuevo1x;
                medio[i][1]=nuevo1y;
                medio[i][2]=nuevo1z;


            }

        for (int i=0; i<8 ; i++)
        {
            //rotation z

            nuevox=angle[i][0];
            nuevoy=angle[i][1]*Math.cos(teta)-angle[i][2]*Math.sin(teta);
            nuevoz=angle[i][1]*Math.sin(teta)+angle[i][2]*Math.cos(teta);




            angle[i][0]=nuevox;
            angle[i][1]=nuevoy;
            angle[i][2]=nuevoz;



        }
        pintar(angle, medio);
      }
        break;
        default:
            break;
 }
 }
}
 static void pintar(double [][] angle, double [][] medio){
    int t = 200,q=200;
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            System.out.println(angle[i][j]);
        System.out.println(angle[i][j]*200+200);
    }
    }
 //g2d.translate(200.200);
   //     g2d.rotate(Math.Radians(6));
   for (int iq=0; iq < 6; iq++) {
       for (int ie=0; ie < 8; ie++) {
            pointx[iq][ie]=0;
            pointx[iq][ie]=0;
        }
    }
        for (int iw=0; iw < 6; iw++) {
    if(medio[iw][2]>0) {
                 pointx[iw][0]=(int) (angle[constructor1.vortex(constructor1.plano(iw,0),0)][0]*t+q);
                 pointy[iw][0]=(int) (angle[constructor1.vortex(constructor1.plano(iw,0),0)][1]*t+q);

//g.drawLine(pointx[0],pointy[0],pointx[1],pointy[1]);
                 pointx[iw][1]=(int) (angle[constructor1.vortex(constructor1.plano(iw,0),1)][0]*t+q);
                 pointy[iw][1]=(int) (angle[constructor1.vortex(constructor1.plano(iw,0),1)][1]*t+q);

//g.drawLine(pointx[0],pointy[0],pointx[1],pointy[1]);

                 pointx[iw][2]=(int) (angle[constructor1.vortex(constructor1.plano(iw,1),0)][0]*t+q);
                 pointy[iw][2]=(int) (angle[constructor1.vortex(constructor1.plano(iw,1),0)][1]*t+q);

//g.drawLine(pointx[1],pointy[1],pointx[2],pointy[2]);

                 pointx[iw][3]=(int) (angle[constructor1.vortex(constructor1.plano(iw,1),1)][0]*t+q);
                 pointy[iw][3]=(int) (angle[constructor1.vortex(constructor1.plano(iw,1),1)][1]*t+q);

//g.drawLine(pointx[2],pointy[2],pointx[3],pointy[3]);

                 pointx[iw][4]=(int) (angle[constructor1.vortex(constructor1.plano(iw,2),0)][0]*t+q);
                 pointy[iw][4]=(int) (angle[constructor1.vortex(constructor1.plano(iw,2),0)][1]*t+q);

//g.drawLine(pointx[3],pointy[3],pointx[4],pointy[4]);


                 pointx[iw][5]=(int) (angle[constructor1.vortex(constructor1.plano(iw,2),1)][0]*t+q);
                 pointy[iw][5]=(int) (angle[constructor1.vortex(constructor1.plano(iw,2),1)][1]*t+q);

//g.drawLine(pointx[4],pointy[4],pointx[5],pointy[5]);

                 pointx[iw][6]=(int) (angle[constructor1.vortex(constructor1.plano(iw,3),0)][0]*t+q);
                 pointy[iw][6]=(int) (angle[constructor1.vortex(constructor1.plano(iw,3),0)][1]*t+q);

//g.drawLine(pointx[5],pointy[5],pointx[6],pointy[6]);

                 pointx[iw][7]=(int) (angle[constructor1.vortex(constructor1.plano(iw,3),1)][0]*t+q);
                 pointy[iw][7]=(int) (angle[constructor1.vortex(constructor1.plano(iw,3),1)][1]*t+q);

//g.drawLine(pointx[6],pointy[6],pointx[7],pointy[7]);
//g.drawLine(pointx[7],pointy[7],pointx[1],pointy[1]);

               }
               }

/*
       Polygon poligono1 = new Polygon( oldpointx, oldpointy, 8 );
                 g2d.setColor(Color.WHITE);
    g2d.drawPolygon(poligono1);
       g2d.fillPolygon(poligono1);
//g.repaint();
*/


              myCanvas.setBackgroundColor(Color.WHITE);
              myCanvas.eraseRectangle( 0,  0,  600,  600);

      for (int iw=0; iw < 6; iw++) {

            if (dyed) {




        switch (iw)
                {

                    case 0:

                        myCanvas.setForegroundColor(Color.BLUE);
                        //g2d.translate(pointx[iw][0],pointy[iw][1]);
                       myCanvas.drawLine(pointx[iw][0],pointy[iw][0],pointx[iw][1],pointy[iw][1]);
                       myCanvas.drawLine(pointx[iw][2],pointy[iw][2],pointx[iw][3],pointy[iw][3]);


                       myCanvas.drawLine(pointx[iw][4],pointy[iw][4],pointx[iw][5],pointy[iw][5]);
                       myCanvas.drawLine(pointx[iw][6],pointy[iw][6],pointx[iw][7],pointy[iw][7]);

                    break;

                    case 1:

                        myCanvas.setForegroundColor(Color.RED);
                          myCanvas.drawLine(pointx[iw][0],pointy[iw][0],pointx[iw][1],pointy[iw][1]);
                          myCanvas.drawLine(pointx[iw][2],pointy[iw][2],pointx[iw][3],pointy[iw][3]);

                        myCanvas.drawLine(pointx[iw][4],pointy[iw][4],pointx[iw][5],pointy[iw][5]);
                        myCanvas.drawLine(pointx[iw][6],pointy[iw][6],pointx[iw][7],pointy[iw][7]);

                    break;

                    case 2:
                         myCanvas.setForegroundColor(Color.YELLOW);
                         myCanvas.drawLine(pointx[iw][0],pointy[iw][0],pointx[iw][1],pointy[iw][1]);
                         myCanvas.drawLine(pointx[iw][2],pointy[iw][2],pointx[iw][3],pointy[iw][3]);

                        myCanvas.drawLine(pointx[iw][4],pointy[iw][4],pointx[iw][5],pointy[iw][5]);
                        myCanvas.drawLine(pointx[iw][6],pointy[iw][6],pointx[iw][7],pointy[iw][7]);


                    case 3:

                       myCanvas.setForegroundColor(Color.ORANGE);
                      myCanvas.drawLine(pointx[iw][0],pointy[iw][0],pointx[iw][1],pointy[iw][1]);
                      myCanvas.drawLine(pointx[iw][2],pointy[iw][2],pointx[iw][3],pointy[iw][3]);

                        myCanvas.drawLine(pointx[iw][4],pointy[iw][4],pointx[iw][5],pointy[iw][5]);
                        myCanvas.drawLine(pointx[iw][6],pointy[iw][6],pointx[iw][7],pointy[iw][7]);

                    break;

                    case 4:

                      myCanvas.setForegroundColor(Color.GREEN);
                        myCanvas.drawLine(pointx[iw][0],pointy[iw][0],pointx[iw][1],pointy[iw][1]);
                        myCanvas.drawLine(pointx[iw][2],pointy[iw][2],pointx[iw][3],pointy[iw][3]);

                        myCanvas.drawLine(pointx[iw][4],pointy[iw][4],pointx[iw][5],pointy[iw][5]);
                        myCanvas.drawLine(pointx[iw][6],pointy[iw][6],pointx[iw][7],pointy[iw][7]);
                    break;


                    case 5:

                        myCanvas.setForegroundColor(Color.BLACK);
                      myCanvas.drawLine(pointx[iw][0],pointy[iw][0],pointx[iw][1],pointy[iw][1]);
                      myCanvas.drawLine(pointx[iw][2],pointy[iw][2],pointx[iw][3],pointy[iw][3]);

                        myCanvas.drawLine(pointx[iw][4],pointy[iw][4],pointx[iw][5],pointy[iw][5]);
                        myCanvas.drawLine(pointx[iw][6],pointy[iw][6],pointx[iw][7],pointy[iw][7]);

                    break;
                    default:
                    break;
                }


      }
    }
    //int dormir = (aquix+aquiy+aquiz)*12;
    try{
      Thread.sleep(44);
    }
        catch (InterruptedException e){
          Thread.currentThread().interrupt();
        }


      //myCanvas.repaint();
  }

}






    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
  /*  public static void
    {
        myCanvas = new Canvas("MATRICES", 600, 500);
        myCanvas.setVisible(true);
        drawDemo();
    }*/

class Canvas
{
    private JFrame frame;
    private CanvasPane canvas;
    private Graphics2D graphic;
    private Color backgroundColor;
    private Image canvasImage;

    /**
     * Create a Canvas with default height, width and background color
     * (300, 300, white).
     * @param title  title to appear in Canvas Frame
     */
    public Canvas(String title)
    {
        this(title, 300, 300, Color.white);
    }int mat5[][]=new int [11][11];

    /**
     * Create a Canvas with default background color (white).
     * @param title  title to appear in Canvas Frame
     * @param width  the desired width for the canvas
     * @param height  the desired height for the canvas
     */
    public Canvas(String title, int width, int height)
    {
        this(title, width, height, Color.white);
    }

    /**
     * Create a Canvas.
* @param title  title to appear in Canvas Frame
     * @param width  the desired width for the canvas
     * @param height  the desired height for the canvas
     * @param bgClour  the desired background color of the canvas
     */
    public Canvas(String title, int width, int height, Color bgColor)
    {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        canvas.setPreferredSize(new Dimension(width, height));
        backgroundColor = bgColor;
        frame.pack();
    }

    /**
     * Set the canvas visibility and brings canvas to the front of screen
     * when made visible. This method can also be used to bring an already
     * visible canvas to the front of other windows.
     * @param visible  boolean value representing the desired visibility of
     * the canvas (true or false)
     */
    public void setVisible(boolean visible)
    {
        if(graphic == null) {
            // first time: instantiate the offscreen image and fill it with
            // the background color
            Dimension size = canvas.getSize();
            canvasImage = canvas.createImage(size.width, size.height);
 graphic = (Graphics2D)canvasImage.getGraphics();
            graphic.setColor(backgroundColor);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(Color.black);
        }
        frame.setVisible(true);
    }

    /**
     * Provide information on visibility of the Canvas.
     * @return  true if canvas is visible, false otherwise
     */
    public boolean isVisible()
    {
        return frame.isVisible();
    }

    /**
     * Draw the outline of a given shape onto the canvas.
     * @param  shape  the shape object to be drawn on the canvas
     */
    public void draw(Shape shape)
    {
        graphic.draw(shape);
        canvas.repaint();
    }

    /**
     * Fill the internal dimensions of a given shape with the current
     * foreground color of the canvas.
     * @param  shape  the shape object to be filled
 */
    public void fill(Shape shape)
    {
        graphic.fill(shape);
        canvas.repaint();
    }

    /**
     * Fill the internal dimensions of the given circle with the current
     * foreground color of the canvas.
     */
    public void fillCircle(int xPos, int yPos, int diameter)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(xPos, yPos, diameter, diameter);
        fill(circle);
    }

    /**
     * Fill the internal dimensions of the given rectangle with the current
     * foreground color of the canvas. This is a convenience method. A similar
     * effect can be achieved with the "fill" method.
     */
    public void fillRectangle(int xPos, int yPos, int width, int height)
    {
        fill(new Rectangle(xPos, yPos, width, height));
    }

    /**
     * Erase the whole canvas.
     */
    public void erase()
    {
 Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Erase the internal dimensions of the given circle. This is a
     * convenience method. A similar effect can be achieved with
     * the "erase" method.
     */
    public void eraseCircle(int xPos, int yPos, int diameter)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(xPos, yPos, diameter, diameter);
        erase(circle);
    }

    /**
     * Erase the internal dimensions of the given rectangle. This is a
     * convenience method. A similar effect can be achieved with
     * the "erase" method.
     */
    public void eraseRectangle(int xPos, int yPos, int width, int height)
    {
        erase(new Rectangle(xPos, yPos, width, height));
    }

    /**
     * Erase a given shape's interior on the screen.
     * @param  shape  the shape object to be erased
*/
    public void erase(Shape shape)
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.fill(shape);              // erase by filling background color
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Erases a given shape's outline on the screen.
     * @param  shape  the shape object to be erased
     */
    public void eraseOutline(Shape shape)
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.draw(shape);  // erase by drawing background color
        graphic.setColor(original);
        canvas.repaint();
    }

    /**
     * Draws an image onto the canvas.
     * @param  image   the Image object to be displayed
     * @param  x       x co-ordinate for Image placement
     * @param  y       y co-ordinate for Image placement
     * @return  returns boolean value representing whether the image was
     *          completely loaded
     */
public boolean drawImage(Image image, int x, int y)
    {
        boolean result = graphic.drawImage(image, x, y, null);
        canvas.repaint();
        return result;
    }

    /**
     * Draws a String on the Canvas.
     * @param  text   the String to be displayed
     * @param  x      x co-ordinate for text placement
     * @param  y      y co-ordinate for text placement
     */
    public void drawString(String text, int x, int y)
    {
        graphic.drawString(text, x, y);
        canvas.repaint();
    }

    /**
     * Erases a String on the Canvas.
     * @param  text     the String to be displayed
     * @param  x        x co-ordinate for text placement
     * @param  y        y co-ordinate for text placement
     */
    public void eraseString(String text, int x, int y)
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColor);
        graphic.drawString(text, x, y);
        graphic.setColor(original);
  canvas.repaint();
    }

    /**
     * Draws a line on the Canvas.
     * @param  x1   x co-ordinate of start of line
     * @param  y1   y co-ordinate of start of line
     * @param  x2   x co-ordinate of end of line
     * @param  y2   y co-ordinate of end of line
     */
    public void drawLine(int x1, int y1, int x2, int y2)
    {
        graphic.drawLine(x1, y1, x2, y2);
        canvas.repaint();
    }

    /**
     * Sets the foreground color of the Canvas.
     * @param  newColor   the new color for the foreground of the Canvas
     */
    public void setForegroundColor(Color newColor)
    {
        graphic.setColor(newColor);
    }

    /**
     * Returns the current color of the foreground.
     * @return   the color of the foreground of the Canvas
     */
    public Color getForegroundColor()
    {
  return graphic.getColor();
    }

    /**
     * Sets the background color of the Canvas.
     * @param  newColor   the new color for the background of the Canvas
     */
    public void setBackgroundColor(Color newColor)
    {
        backgroundColor = newColor;
        graphic.setBackground(newColor);
    }

    /**
     * Returns the current color of the background
     * @return   the color of the background of the Canvas
     */
    public Color getBackgroundColor()
    {
        return backgroundColor;
    }

    /**
     * changes the current Font used on the Canvas
     * @param  newFont   new font to be used for String output
     */
    public void setFont(Font newFont)
    {
        graphic.setFont(newFont);
    }

    /**
     * Returns the current font of the canvas.
 * @return     the font currently in use
     **/
    public Font getFont()
    {
        return graphic.getFont();
    }

    /**
     * Sets the size of the canvas.
     * @param  width    new width
     * @param  height   new height
     */
    public void setSize(int width, int height)
    {
        canvas.setPreferredSize(new Dimension(width, height));
        Image oldImage = canvasImage;
        canvasImage = canvas.createImage(width, height);
        graphic = (Graphics2D)canvasImage.getGraphics();
        graphic.drawImage(oldImage, 0, 0, null);
        frame.pack();
    }

    /**
     * Returns the size of the canvas.
     * @return     The current dimension of the canvas
     */
    public Dimension getSize()
    {
        return canvas.getSize();
    }
/**
     * Waits for a specified number of milliseconds before finishing.
     * This provides an easy way to specify a small delay which can be
     * used when producing animations.
     * @param  milliseconds  the number
     */
    public void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException e)
        {
            // ignoring exception at the moment
        }
    }

    /************************************************************************
     * Inner class CanvasPane - the actual canvas component contained in the
     * Canvas frame. This is essentially a JPanel with added capability to
     * refresh the image drawn on it.
     */
    private class CanvasPane extends JPanel
    {
        public void paint(Graphics g)
        {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }
}
