/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.victortorres.palcomp3downloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor (Revisão: Luís)
 */

public class Endereco {
    
    URL endereco = null;
    
    public Endereco(String id) throws MalformedURLException {
        endereco = new URL("https://palcomp3.com/"+id+"/musicas.htm");
    }
    public Endereco(String id, boolean x) throws MalformedURLException {
        endereco = new URL(id);
    }
    
    public void setEndereco(String id) throws MalformedURLException {
        endereco = new URL("https://palcomp3.com/"+id+"/musicas.htm");
    }
    public void setEndereco2(String id) {
        try {
            endereco = new URL(id);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Endereco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public URL getEndereco() {
        return endereco;
    } 
}
