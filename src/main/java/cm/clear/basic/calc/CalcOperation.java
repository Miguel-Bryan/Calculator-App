/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cm.clear.basic.calc;

import java.util.Arrays;

/**
 *
 * @author bryan
 */
class CalcOperation {
    
    private String operator;
    private String [] values;
    
    
    
    public CalcOperation(String operator, String[] values){
        this.operator = operator;
        this.values = values;
    }
    
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
    
    public String toString(){
        return operator + " with ["+values+"]";
    }
    
    
}
