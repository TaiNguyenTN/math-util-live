/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Lenovo
 */
//TA VIẾT CLASS ĐỂ CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI
//KHI TA CUNG CẤP TIỆN ÍCH CHO NƠI KHÁC XÀI, ĐÓ LÀ LÚC TA KHÔNG CẦN NHỚ CÁI GÌ CHO RIÊNG TA
//HÀM STATIC GIÚP LÀM ĐIỀU NÀY
public class MathUtil {
    //Factorial: giai thừa
    //nếu đưa vào âm, 21 giai thừa, ta éo tính, ta đập vào mặt ai xài hàm
    //một cái ngoại lệ, chửi éo tính được
    public static long GetFactorial(int n){
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
            //hàm dừng liền éo cần return
        }
        //xuống đây là n = 0...20 rồi
        if(n == 0 || n == 1)
            return 1; //dừng ngay khi n đặc biệt
        
        //xuống đến đây, n = 2...20 rồi
        //chơi for hoặc đệ quy - recursion
        long product = 1;
        for (int i = 2; i <= n ; i++) {
            product *= i;
        }
        
        return product;
    }
}
