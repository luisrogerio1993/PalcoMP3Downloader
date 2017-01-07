/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.victortorres.palcomp3downloader;

/**
 *
 * @author Victor (Revisão: Luís)
 */

public class Musica {
    
    public String nome;
    public String url;
    
    @Override
    public String toString() {
        return nome;
    }
    
    public String getURL() {
        return url;
    }
}
