package models;

import javax.servlet.annotation.WebServlet;


public class MayTinh {
    public static double maytinh(double firstOperand , double secondOperand, char Tinh) {
        switch (Tinh) {
            case '+' :
                return firstOperand + secondOperand;
            case '-' :
                return firstOperand - secondOperand;
            case '/' :
                if (secondOperand != 0) {
                    return firstOperand / secondOperand;
                }else {
                    throw new RuntimeException("Không thể chia cho không");
                }
            case '*' :
                return firstOperand * secondOperand;
            default:
                throw new RuntimeException("Vui lòng nhập đúng");

        }
    }
}
