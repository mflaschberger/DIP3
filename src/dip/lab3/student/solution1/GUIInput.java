/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author mflaschberger
 */
public class GUIInput implements Input {

    @Override
    public String getMessage() {
    String input = JOptionPane.showInputDialog(null, "enter message here:");
        return input;  
    }
    
}
