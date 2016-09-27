/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author mflaschberger
 */
public class MessageService {

    private Input input;
    private Output output;
    private String message;
    
    public MessageService(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    public void getInput() {
        message= input.getMessage();
    }

    public void setOutput() {
        output.produceOutput();
    }
}
