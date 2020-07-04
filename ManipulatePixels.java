/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulatepixels;

import java.awt.Color;

/**
 *
 * @author leandroestevez
 */
public class ManipulatePixels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Picture pic = new Picture();
        
        pic.load("queen-mary.png");
        
        for(int row = 0; row < pic.getHeight(); row++) {
            
            for(int col = 0; col < pic.getWidth(); col++) {
                
                Color originalColor = pic.getColorAt(col, row);
                
                Color newColor = new Color(255 - originalColor.getRed(), 
                        255 - originalColor.getGreen(), 
                        255 - originalColor.getBlue());
                
                pic.setColorAt(col, row, newColor);
                
            }
            
        }
        
    }
    
}
