package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This program displays a business card
 * into a panel using drawString and drawRect.</p>
 *
 * @author Emilio Wu    
 * @version 1.0
 */
public class BusinessCard extends JFrame {
   
    /**
     * <p>Serial Version ID for constant.</p>
     */
    private static final long serialVersionUID = 7062469334560391173L;

    /**
     * <p>The x position of the text.</p>
     */
    private static final int X_POSITION = 20;

    /**
     * <p>The y position of the text.</p>
     */
    private static final int Y_POSITION = 20;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public BusinessCard() {
        super("Emilio Wu Business Card");
        
        // Panel size
        final int widthPanel = 
                500;
        final int heightPanel = 250;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(widthPanel, heightPanel);
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class BusinessCardPanel extends JPanel {

        /**
         * <p>Serial Version ID for constant.</p>
         */
        private static final long serialVersionUID = 7707485562200870103L;
        
        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        private Image img;

        /**
         * <p>The default constructor that retrieves an image to draw.</p>
         */
        public BusinessCardPanel() {
            
            // GIF for the business card
            img = new ImageIcon(BusinessCardPanel.class.getResource(
                "/q5/running-robot.gif")).getImage();
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // Declaring variables and constants
            final int codeRed = 60;
            final int codeBlue = 255;
            final int codeGreen = 126;
            final int codeRed1 = 140;
            final int codeBlue1 = 75;
            final int codeGreen1 = 200;
            final int xBox = 50;
            final int yBox = 50;
            final int widthBox = 250;
            final int heightBox = 125;
            final int xImg = 350;
            final int yImg = 0;
            final int xName = 100;
            final int yName = 75;
            final int xCompany = 100;
            final int yCompany = 90;
            final int xAddress = 100;
            final int yAddress = 103;
            final int xAddress1 = 100;
            final int yAddress1 = 116;
            final int xPhone = 100;
            final int yPhone = 129;
            final int xFax = 100;
            final int yFax = 142;
            final int xEmail = 100;
            final int yEmail = 155;
            final int xWeb = 100;
            final int yWeb = 168;
            
            // Prints the text
            setBackground(new Color(codeRed, codeBlue, codeGreen));
            g.setColor(new Color(codeRed1, codeBlue1, codeGreen1));
            g.drawString("Something interesting ...", X_POSITION, Y_POSITION);
            g.drawRect(xBox, yBox, widthBox, heightBox);
            g.drawImage(img, xImg, yImg, this);
            g.drawString("Emilio Wu", xName, yName);
            g.drawString("ABC Inc.", xCompany, yCompany);
            g.drawString("24 Lakers Street, Los Angeles", xAddress, yAddress);
            g.drawString("90210, California", xAddress1, yAddress1);
            g.drawString("(323) 374-7811", xPhone, yPhone);
            g.drawString("(323) 374-7822", xFax, yFax);
            g.drawString("emilio.wu@abc.com", xEmail, yEmail);
            g.drawString("www.abc.com", xWeb, yWeb);
        }
    }

    /**
     * <p>The main method.</p>
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        new BusinessCard();
    }

};
