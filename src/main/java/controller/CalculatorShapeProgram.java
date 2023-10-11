/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import repository.CalculatorRepository;

/**
 *
 * @author Administrator
 */
public class CalculatorShapeProgram {
    
    CalculatorRepository program;
    
    public CalculatorShapeProgram() {
        program = new CalculatorRepository();
    }
    
    public void run() {
        System.out.println("=====Calculator Shape Program=====");
        program.inputandcalculatorShape();
    }
    
}
