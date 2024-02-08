/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
//IMPORTS
import org.apache.commons.codec.digest.DigestUtils;
/**
 *
 * @author dell
 */
public class Auth {
     public static String encriptarPassword(String password) {
        return DigestUtils.sha256Hex(password);
    }
}
