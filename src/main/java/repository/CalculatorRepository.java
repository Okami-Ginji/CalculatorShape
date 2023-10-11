/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.Circle;
import model.Rectangle;
import model.Triangle;
import dataacess.CalculatorDAO;
/**
 *
 * @author Administrator
 */
public class CalculatorRepository implements ICalculatorRepository{

    @Override
    public void inputandcalculatorShape() {
       CalculatorDAO.Instance().inputandcalculatorShape();
    }

 
}
