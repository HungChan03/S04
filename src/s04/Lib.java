/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lib {

    /**
     *
     * @param msg
     * @param errMsg
     * @return
     */
    public static int GetPositiveInteger(String msg, String errMsg) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    throw new Exception(errMsg);

                }
                return n;

            } catch (Exception e) {
                System.out.println(errMsg);
            }

        } while (true);
    }
}
