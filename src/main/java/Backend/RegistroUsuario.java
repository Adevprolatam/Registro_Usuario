/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;
import java.util.ArrayList;

/**
 *
 * @author dell
 */

public class RegistroUsuario {
    private ArrayList<Usuario> usuarios;
    
    // CONSTRUCTOR 
    public RegistroUsuario() {
        this.usuarios = new ArrayList<>();
    }
  
    public void registrarUsuario(Usuario usuario) {
        usuario.setPassword(Auth.encriptarPassword(usuario.getPassword()));
        usuarios.add(usuario);
        System.out.println("Usuario registrado : " + usuario.getNombre());
    }

    // LISTA DE USUARIOS
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

}

