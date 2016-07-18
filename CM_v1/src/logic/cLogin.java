/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import business.cUsuario;
import db.db_loginconection;



/**
 *
 * @author Jose
 */
public class cLogin {
  
    public static void lLogin(cUsuario usuario) throws Exception{
        db_loginconection dblc = new db_loginconection();
        dblc.dbAccesoSistema(usuario);
    }
}
