/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management;

/**
 *
 * @author Minh Thinh
 */
public class Main {

    public static void main(String[] args) {
        StudentHandler handler = new StudentHandler();
        handler.add(new Student("ITITIU15014", "Huynh Le Minh Thinh", "Nha Trang", 21, (float) 75.5));
        handler.add(new Student("ITITIU15050", "Nguyen Pham Xuan Thang", "Nha Trang", 21, (float) 78.5));
        handler.add(new Student("ITITIU15061", "Nguyen Trung Hieu", "Nha Trang", 22, (float) 76.5));
        handler.add(new Student("ITITIU15086", "Truong Hoang Nhat", "Nha Trang", 21, (float) 77.5));
        
        //handler.sort_by_gpa();
        handler.show();
        handler.delete("ITITIU15061");
        //handler.sort_by_gpa();
        handler.show();
        
    }
}
