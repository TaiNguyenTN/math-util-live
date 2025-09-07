/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Lenovo
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Expected: 5! = 120, Actual: " + MathUtil.GetFactorial(5));
        
        System.out.println("expected: 6! = 720; actual: " + MathUtil.GetFactorial(6));
        System.out.println("Expected: 0! = 1; actual: " + MathUtil.GetFactorial(0));
        
        //MathUtil.GetFactorial(-5); ném ngoại lệ thật rồi, ai biểu đưa cà chớn
        
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SERVER 7:29PM 7/9/2025
        System.out.println("Expected: 1! = 1; actual: " + MathUtil.GetFactorial(1));
        System.out.println("Expected: 3! = 6; actual: " + MathUtil.GetFactorial(3));
    }
    
}
