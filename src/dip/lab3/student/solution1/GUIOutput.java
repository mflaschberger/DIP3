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
public class GUIOutput implements Output {
    private String message;
    
    public GUIOutput(String data){
        this.message = data;
    }
    
    @Override
    public void produceOutput(){
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String getData() {
        return message;
    }

    @Override
    public void setData(String data) {
        this.message = data;
    }
    
    
}